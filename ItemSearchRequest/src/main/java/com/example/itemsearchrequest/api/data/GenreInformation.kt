package com.example.itemsearchrequest.api.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** GenreInformation. */
@Serializable
data class GenreInformation(
    /** Children. */
    @SerialName("children")
    val children: List<Children>,
    /** Children. */
    @SerialName("current")
    val current: List<Current>,
    /** Parent. */
    @SerialName("parent")
    val parent: List<Parent>
)

/** Current. */
@Serializable
data class Current(
    /** genreId. */
    @SerialName("genreId")
    val genreId: String,
    /** genreLevel. */
    @SerialName("genreLevel")
    val genreLevel: String,
    /** genreName. */
    @SerialName("genreName")
    val genreName: String,
    /** hybrid. */
    @SerialName("hybrid")
    val hybrid: Int,
    /** itemCount. */
    @SerialName("itemCount")
    val itemCount: String,
    /** lowestFlg. */
    @SerialName("lowestFlg")
    val lowestFlg: Int
)

/** Children. */
@Serializable
data class Children(
    /** genreId. */
    @SerialName("genreId")
    val genreId: String,
    /** genreLevel. */
    @SerialName("genreLevel")
    val genreLevel: String,
    /** genreName. */
    @SerialName("genreName")
    val genreName: String,
    /** hybrid. */
    @SerialName("hybrid")
    val hybrid: Int,
    /** itemCount. */
    @SerialName("itemCount")
    val itemCount: String,
    /** lowestFlg. */
    @SerialName("lowestFlg")
    val lowestFlg: Int
)

/** Parent. */
@Serializable
data class Parent(
    /** genreId. */
    @SerialName("genreId")
    val genreId: String,
    /** genreLevel. */
    @SerialName("genreLevel")
    val genreLevel: String,
    /** genreName. */
    @SerialName("genreName")
    val genreName: String,
    /** hybrid. */
    @SerialName("hybrid")
    val hybrid: Int
)
