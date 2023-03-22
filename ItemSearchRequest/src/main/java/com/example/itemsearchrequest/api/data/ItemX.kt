package com.example.itemsearchrequest.api.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** ItemX. */
@Serializable
data class ItemX(
    /** affiliateRate. */
    @SerialName("affiliateRate")
    val affiliateRate: Int,
    /** affiliateUrl. */
    @SerialName("affiliateUrl")
    val affiliateUrl: String,
    /** asurakuArea. */
    @SerialName("asurakuArea")
    val asurakuArea: String,
    /** asurakuClosingTime. */
    @SerialName("asurakuClosingTime")
    val asurakuClosingTime: String,
    /** asurakuFlag. */
    @SerialName("asurakuFlag")
    val asurakuFlag: Int,
    /** availability. */
    @SerialName("availability")
    val availability: Int,
    /** catchcopy. */
    @SerialName("catchcopy")
    val catchcopy: String,
    /** creditCardFlag. */
    @SerialName("creditCardFlag")
    val creditCardFlag: Int,
    /** endTime. */
    @SerialName("endTime")
    val endTime: String,
    /** eventStatus. */
    @SerialName("eventStatus")
    val eventStatus: Int,
    /** fullAffiliateUrl. */
    @SerialName("fullAffiliateUrl")
    val fullAffiliateUrl: String,
    /** genreId. */
    @SerialName("genreId")
    val genreId: String,
    /** giftFlag. */
    @SerialName("giftFlag")
    val giftFlag: Int,
    /** imageFlag. */
    @SerialName("imageFlag")
    val imageFlag: Int,
    /** itemCaption. */
    @SerialName("itemCaption")
    val itemCaption: String,
    /** itemCode. */
    @SerialName("itemCode")
    val itemCode: String,
    /** itemId. */
    @SerialName("itemId")
    val itemId: Int,
    /** itemName. */
    @SerialName("itemName")
    val itemName: String,
    /** itemPrice. */
    @SerialName("itemPrice")
    val itemPrice: Int,
    /** itemStatus. */
    @SerialName("itemStatus")
    val itemStatus: Int,
    /** itemUrl. */
    @SerialName("itemUrl")
    val itemUrl: String,
    /** List of mediumImageUrl. */
    @SerialName("mediumImageUrls")
    val mediumImageUrls: List<MediumImageUrl>,
    /** pointRate. */
    @SerialName("pointRate")
    val pointRate: Int,
    /** pointRateEndTime. */
    @SerialName("pointRateEndTime")
    val pointRateEndTime: String,
    /** pointRateStartTime. */
    @SerialName("pointRateStartTime")
    val pointRateStartTime: String,
    /** postageFlag. */
    @SerialName("postageFlag")
    val postageFlag: Int,
    /** productCode. */
    @SerialName("productCode")
    val productCode: String?,
    /** purchaseType. */
    @SerialName("purchaseType")
    val purchaseType: Int,
    /** releaseDate. */
    @SerialName("releaseDate")
    val releaseDate: String?,
    /** reviewAverage. */
    @SerialName("reviewAverage")
    val reviewAverage: Double,
    /** reviewCount. */
    @SerialName("reviewCount")
    val reviewCount: Int,
    /** shipOverseasArea. */
    @SerialName("shipOverseasArea")
    val shipOverseasArea: String,
    /** shipOverseasFlag. */
    @SerialName("shipOverseasFlag")
    val shipOverseasFlag: Int,
    /** shopAffiliateUrl. */
    @SerialName("shopAffiliateUrl")
    val shopAffiliateUrl: String,
    /** shopCode. */
    @SerialName("shopCode")
    val shopCode: String,
    /** shopId. */
    @SerialName("shopId")
    val shopId: Int,
    /** shopName. */
    @SerialName("shopName")
    val shopName: String,
    /** shopOfTheYearFlag. */
    @SerialName("shopOfTheYearFlag")
    val shopOfTheYearFlag: Int,
    /** shopPointAll. */
    @SerialName("shopPointAll")
    val shopPointAll: Int,
    /** shopPointDiamond. */
    @SerialName("shopPointDiamond")
    val shopPointDiamond: Int,
    /** shopPointEndTime. */
    @SerialName("shopPointEndTime")
    val shopPointEndTime: String?,
    /** shopPointGold. */
    @SerialName("shopPointGold")
    val shopPointGold: Int,
    /** shopPointPlatinum. */
    @SerialName("shopPointPlatinum")
    val shopPointPlatinum: Int,
    /** shopPointReguler. */
    @SerialName("shopPointReguler")
    val shopPointReguler: Int,
    /** shopPointSilver. */
    @SerialName("shopPointSilver")
    val shopPointSilver: Int,
    /** shopPointStartTime. */
    @SerialName("shopPointStartTime")
    val shopPointStartTime: String?,
    /** shopUrl. */
    @SerialName("shopUrl")
    val shopUrl: String,
    /** List of smallImageUrl. */
    @SerialName("smallImageUrls")
    val smallImageUrls: List<SmallImageUrl>,
    /** startTime. */
    @SerialName("startTime")
    val startTime: String,
    /** List of tagId. */
    @SerialName("tagIds")
    val tagIds: List<Int>,
    /** taxFlag. */
    @SerialName("taxFlag")
    val taxFlag: Int
)
