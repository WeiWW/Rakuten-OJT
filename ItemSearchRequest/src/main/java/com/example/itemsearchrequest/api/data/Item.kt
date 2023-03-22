package com.example.itemsearchrequest.api.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** Item. */
@Serializable
data class Item(
    /** Item. */
    @SerialName("Item")
    val item: ItemX
)
