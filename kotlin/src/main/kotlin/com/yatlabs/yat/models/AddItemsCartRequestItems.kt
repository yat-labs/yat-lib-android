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
package com.yatlabs.yat.models


import com.squareup.moshi.Json
import java.io.Serializable

/**
 * Buy emoji
 * @param emojiId EmojiID to buy
 */

data class AddItemsCartRequestItems (
    /* EmojiID to buy */
    @Json(name = "emoji_id")
    val emojiId: kotlin.String
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

