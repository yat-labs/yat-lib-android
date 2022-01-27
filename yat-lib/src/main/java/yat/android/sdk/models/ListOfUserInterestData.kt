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
 * User interest
 * @param createdAt 
 * @param emojiId 
 * @param id 
 * @param updatedAt 
 * @param userId 
 */

data class ListOfUserInterestData (
    @Json(name = "created_at")
    val createdAt: java.time.OffsetDateTime,
    @Json(name = "emoji_id")
    val emojiId: kotlin.String,
    @Json(name = "id")
    val id: java.util.UUID,
    @Json(name = "updated_at")
    val updatedAt: java.time.OffsetDateTime,
    @Json(name = "user_id")
    val userId: java.util.UUID
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

