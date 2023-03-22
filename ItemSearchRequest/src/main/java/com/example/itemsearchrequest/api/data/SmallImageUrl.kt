package com.example.itemsearchrequest.api.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** SmallImageUrl. */
@Serializable
data class SmallImageUrl(
    /** imageUrl. */
    @SerialName("imageUrl")
    val imageUrl: String
)
