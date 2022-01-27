/**
* Emoji ID API server
* Emoji ID is a directory service that associates almost any type of structured data with a short, memorable identifier the emoji id.
*
* The version of the OpenAPI document: 0.2.262
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package yat.android.sdk.models


import com.squareup.moshi.Json
import java.io.Serializable

/**
 * 
 * @param count The number of guaranteed drops of this type in the loot box
 * @param maxScore The highest (inclusive) rhythm score range for guaranteed drop
 * @param minScore The lowest (inclusive) rhythm score range for guaranteed drop
 */

data class AdminNewLootBoxTypeConfigGuarantees (
    /* The number of guaranteed drops of this type in the loot box */
    @Json(name = "count")
    val count: kotlin.Long,
    /* The highest (inclusive) rhythm score range for guaranteed drop */
    @Json(name = "max_score")
    val maxScore: kotlin.Long,
    /* The lowest (inclusive) rhythm score range for guaranteed drop */
    @Json(name = "min_score")
    val minScore: kotlin.Long
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

