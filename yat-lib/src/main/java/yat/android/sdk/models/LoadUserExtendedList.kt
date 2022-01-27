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
 * EmojiId in canonical and display representations
 * @param canonicalFormat 
 * @param chainFormat 
 * @param displayFormat 
 * @param flippableEmoji 
 * @param generation 
 * @param minted 
 * @param rhythmScore 
 * @param shape 
 * @param shortname 
 * @param blockedUntil 
 * @param tokenId 
 */

data class LoadUserExtendedList (
    @Json(name = "canonical_format")
    val canonicalFormat: kotlin.String,
    @Json(name = "chain_format")
    val chainFormat: kotlin.String,
    @Json(name = "display_format")
    val displayFormat: kotlin.String,
    @Json(name = "flippable_emoji")
    val flippableEmoji: kotlin.collections.List<kotlin.Boolean>,
    @Json(name = "generation")
    val generation: kotlin.Int,
    @Json(name = "minted")
    val minted: kotlin.Boolean,
    @Json(name = "rhythm_score")
    val rhythmScore: kotlin.Int,
    @Json(name = "shape")
    val shape: EmojiListItemShape,
    @Json(name = "shortname")
    val shortname: kotlin.String,
    @Json(name = "blocked_until")
    val blockedUntil: java.time.OffsetDateTime? = null,
    @Json(name = "token_id")
    val tokenId: kotlin.Long? = null
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

