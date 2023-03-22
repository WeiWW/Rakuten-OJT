package com.example.itemsearchrequest.api.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** ItemResponse. */
@Serializable
data class ItemResponse(
    /** carrier. */
    @SerialName("carrier")
    val carrier: Int,
    /** count. */
    @SerialName("count")
    val count: Int,
    /** first. */
    @SerialName("first")
    val first: Int,
    /** List of GenreInformation. */
    @SerialName("GenreInformation")
    val genreInformation: List<GenreInformation>,
    /** hits. */
    @SerialName("hits")
    val hits: Int,
    /** hybrid. */
    @SerialName("hybrid")
    val hybrid: Int,
    /** List of Item.*/
    @SerialName("Items")
    val items: List<Item>,
    /** last. */
    @SerialName("last")
    val last: Int,
    /** page. */
    @SerialName("page")
    val page: Int,
    /** pageCount. */
    @SerialName("pageCount")
    val pageCount: Int,
    /** TagInformation. */
    @SerialName("TagInformation")
    val tagInformation: List<TagInformation>
)
