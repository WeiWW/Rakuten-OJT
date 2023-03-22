package com.example.itemsearchrequest.api.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** ErrorResponse. */
@Serializable
data class ErrorResponse(
    /** error. */
    @SerialName("error")
    val error: String,
    /** Error description. */
    @SerialName("error_description")
    val errorDescription: String
)
