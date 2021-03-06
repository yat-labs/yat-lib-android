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
 * @param availability The availability state of this emoji
 * @param available Whether the Emoji ID is available for purchase
 * @param emojiId Emoji ID in canonical form
 * @param flippableEmoji Which emoji are flippable
 * @param length Canonical EmojiID length in emojis
 * @param minted If this Emoji is minted
 * @param rhythmScore EmojiID rhythm score
 * @param shape 
 * @param shortNames Emoji key words
 * @param stats Total lookups using this API, if someone is viewing this Emoji ID  using their own self hosted node, it will not be counted here
 * @param copy EmojiID copy text
 * @param generation The generation of the Yat, if it has been purchased.
 * @param origin The origin of the Yat if it was from a Prism Case
 * @param price Pricing in US cents, e.g. 1024 is 10.24 USD.  Price is 0 if the emoji is not available
 */

data class RandomResultResult (
    /* The availability state of this emoji */
    @Json(name = "availability")
    val availability: RandomResultResult.Availability,
    /* Whether the Emoji ID is available for purchase */
    @Json(name = "available")
    val available: kotlin.Boolean,
    /* Emoji ID in canonical form */
    @Json(name = "emoji_id")
    val emojiId: kotlin.String,
    /* Which emoji are flippable */
    @Json(name = "flippable_emoji")
    val flippableEmoji: kotlin.collections.List<kotlin.Boolean>,
    /* Canonical EmojiID length in emojis */
    @Json(name = "length")
    val length: kotlin.Long,
    /* If this Emoji is minted */
    @Json(name = "minted")
    val minted: kotlin.Boolean,
    /* EmojiID rhythm score */
    @Json(name = "rhythm_score")
    val rhythmScore: kotlin.Long,
    @Json(name = "shape")
    val shape: EmojiListItemShape,
    /* Emoji key words */
    @Json(name = "short_names")
    val shortNames: kotlin.collections.List<kotlin.String>,
    /* Total lookups using this API, if someone is viewing this Emoji ID  using their own self hosted node, it will not be counted here */
    @Json(name = "stats")
    val stats: kotlin.collections.List<EmojiStatsResponseMetrics>,
    /* EmojiID copy text */
    @Json(name = "copy")
    val copy: kotlin.Any? = null,
    /* The generation of the Yat, if it has been purchased. */
    @Json(name = "generation")
    val generation: kotlin.Int? = null,
    /* The origin of the Yat if it was from a Prism Case */
    @Json(name = "origin")
    val origin: kotlin.String? = null,
    /* Pricing in US cents, e.g. 1024 is 10.24 USD.  Price is 0 if the emoji is not available */
    @Json(name = "price")
    val price: kotlin.Int? = null
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

    /**
    * The availability state of this emoji
    * Values: available,taken,inCart,comingSoon,noPrice
    */
    
    enum class Availability(val value: kotlin.String){
        @Json(name = "Available") available("Available"),
        @Json(name = "Taken") taken("Taken"),
        @Json(name = "InCart") inCart("InCart"),
        @Json(name = "ComingSoon") comingSoon("ComingSoon"),
        @Json(name = "NoPrice") noPrice("NoPrice");
    }
}

