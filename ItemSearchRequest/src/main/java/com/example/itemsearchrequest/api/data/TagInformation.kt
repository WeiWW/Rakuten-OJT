package com.example.itemsearchrequest.api.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** TagInformation. */
@Serializable
data class TagInformation(
    /** tagGroups. */
    @SerialName("tagGroups")
    val tagGroups: List<TagGroup>
)

/** TagGroup. */
@Serializable
data class TagGroup(
    /** tagGroupName. */
    @SerialName("tagGroupName")
    val tagGroupName: String,
    /** tagGroupId. */
    @SerialName("tagGroupId")
    val tagGroupId: Int,
    /** tags. */
    @SerialName("tags")
    val tags: List<Tag>
)

/** Tag. */
@Serializable
data class Tag(
    /** tagId. */
    @SerialName("tagId")
    val tagId: Int,
    /** tagName. */
    @SerialName("tagName")
    val tagName: String,
    /** parentTagId. */
    @SerialName("parentTagId")
    val parentTagId: Int,
    /** tagType. */
    @SerialName("tagType")
    val tagType: Int,
    /** availableTerm. */
    @SerialName("availableTerm")
    val availableTerm: AvailableTerm
)

/** AvailableTerm. */
@Serializable
data class AvailableTerm(
    /** startDate. */
    @SerialName("startDate")
    val startDate: String,
    /** endDate. */
    @SerialName("endDate")
    val endDate: String
)
