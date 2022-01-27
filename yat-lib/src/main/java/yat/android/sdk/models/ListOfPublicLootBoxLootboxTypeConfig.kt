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
 * The loot box type's configuration parameters
 * @param guarantees A set of guaranteed drops in this loot box type
 * @param maxBaseScore The upper bound (inclusive) rhythm score for standard yats in the loot box
 * @param maxLength Maximum yat length
 * @param minBaseScore The lower bound (inclusive) rhythm score for standard yats in the loot box
 * @param minLength Minimum yat length
 * @param size The number of yats in the loot box
 * @param weights A set of probability weightings for chance-based drops
 */

data class ListOfPublicLootBoxLootboxTypeConfig (
    /* A set of guaranteed drops in this loot box type */
    @field:Json(name = "guarantees")
    val guarantees: kotlin.collections.List<AdminNewLootBoxTypeConfigGuarantees>,
    /* The upper bound (inclusive) rhythm score for standard yats in the loot box */
    @field:Json(name = "max_base_score")
    val maxBaseScore: kotlin.Long,
    /* Maximum yat length */
    @field:Json(name = "max_length")
    val maxLength: kotlin.Long,
    /* The lower bound (inclusive) rhythm score for standard yats in the loot box */
    @field:Json(name = "min_base_score")
    val minBaseScore: kotlin.Long,
    /* Minimum yat length */
    @field:Json(name = "min_length")
    val minLength: kotlin.Long,
    /* The number of yats in the loot box */
    @field:Json(name = "size")
    val size: kotlin.Long,
    /* A set of probability weightings for chance-based drops */
    @field:Json(name = "weights")
    val weights: kotlin.collections.List<AdminNewLootBoxTypeConfigWeights>
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

