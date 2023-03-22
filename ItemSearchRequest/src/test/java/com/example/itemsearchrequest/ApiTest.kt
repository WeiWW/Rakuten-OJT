package com.example.itemsearchrequest

import com.example.itemsearchrequest.api.ApiService
import com.example.itemsearchrequest.api.ErrorConverter
import com.example.itemsearchrequest.api.data.ErrorResponse
import com.example.itemsearchrequest.api.data.ItemResponse
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import okio.buffer
import okio.source
import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldBeInstanceOf
import org.junit.After
import org.junit.Before
import org.junit.Test
import retrofit2.Response
import java.nio.charset.StandardCharsets
import kotlin.reflect.KClass

class ApiTest {
    private val server = MockWebServer()
    private lateinit var apiService: ApiService

    @Before
    fun before() {
        server.start()
        apiService = ApiService(server.url("/").toString())
    }

    @After
    fun after() {
        server.shutdown()
    }

    @Test
    fun `Test ItemRequest is success and get ItemResponse`() {
        val expectResponseCode = 200
        val expectResponseInstanceOf = ItemResponse::class
        server.enqueueResponse("ItemRequest-200.json", expectResponseCode)

        val actualResponse = apiService.itemRequest("", "").execute()
        `is match expectation`(expectResponseCode, expectResponseInstanceOf, actualResponse)
    }

    @Test
    fun `Test ItemRequest is failure and get ErrorResponse`() {
        val expectResponseCode = 401
        val expectResponseInstanceOf = ErrorResponse::class
        server.enqueueResponse("error-response.json", expectResponseCode)

        val actualResponse = apiService.itemRequest("", "").execute()
        `is match expectation`(expectResponseCode, expectResponseInstanceOf, actualResponse)
    }

    private fun <T : Any, R : Any> `is match expectation`(
        expectResponseCode: Int,
        expectResponseInstanceOf: KClass<T>,
        actualResponse: Response<R>
    ) {
        actualResponse.code() shouldBeEqualTo expectResponseCode
        if (actualResponse.isSuccessful) {
            actualResponse.body()?.let {
                it shouldBeInstanceOf expectResponseInstanceOf
            }
        } else {
            actualResponse.errorBody()?.let {
                ErrorConverter().convert(it) shouldBeInstanceOf expectResponseInstanceOf
            }
        }
    }
}

internal fun MockWebServer.enqueueResponse(fileName: String, code: Int) {
    val inputStream = javaClass.classLoader?.getResourceAsStream("$fileName")

    val source = inputStream?.let { inputStream.source().buffer() }
    source?.let {
        enqueue(
            MockResponse()
                .setResponseCode(code)
                .setBody(source.readString(StandardCharsets.UTF_8))
        )
    }
}
