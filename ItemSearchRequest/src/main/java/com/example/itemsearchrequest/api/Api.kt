package com.example.itemsearchrequest.api

import com.example.itemsearchrequest.api.data.ErrorResponse
import com.example.itemsearchrequest.api.data.ItemResponse
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.http.POST
import retrofit2.http.Query

private const val DOMAIN = "https://24x7.app.rakuten.co.jp"
private val contentType = MediaType.parse("application/json")

/** Interface for all API. */
interface ApiEndPoints {
    /**
     * @param applicationId RAE Client ID.
     * @param keyword what you want to search.
     * */
    @POST("/engine/api/IchibaItem/Search/20170821")
    fun itemRequest(
        @Query("applicationId") applicationId: String,
        @Query("keyword") keyword: String
    ): Call<ItemResponse>
}

/** Retrofit. */
private class RetrofitClient constructor(val baseUrl: String) {
    /** Retrofit. */

    @OptIn(ExperimentalSerializationApi::class)
    val retrofit: Retrofit by lazy {
        Retrofit.Builder().baseUrl(baseUrl)
            .addConverterFactory(
                Json.asConverterFactory(
                    contentType ?: throw IllegalStateException(
                        "Media type cannot be null"
                    )
                )
            )
            .build()
    }
}

/**
 * Generates an implementation of the ApiEndPoints interface.
 * Each Call from the created ApiEndPoints can make a synchronous or asynchronous HTTP request to the remote webserver.
 */
class ApiService constructor(private val baseUrl: String) : ApiEndPoints {

    /** EndPoints. */
    private val endPoints by lazy { RetrofitClient(baseUrl).retrofit.create(ApiEndPoints::class.java) }

    /** Request item. */
    override fun itemRequest(applicationId: String, keyword: String): Call<ItemResponse> =
        endPoints.itemRequest(applicationId, keyword)
}

/** Converter ErrorResponse. */
class ErrorConverter : Converter<ResponseBody, ErrorResponse> {
    /**
     * Convert ErrorBody to ErrorResponse.
     * @param value ErrorBody.
     * */
    override fun convert(value: ResponseBody): ErrorResponse {
        val json = value.string()
        return Json.decodeFromString(json)
    }
}
