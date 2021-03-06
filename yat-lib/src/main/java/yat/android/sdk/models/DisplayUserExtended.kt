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
 * @param emojiIds 
 * @param alternateId 
 * @param createdAt 
 * @param deactivatedAt 
 * @param email 
 * @param emailVerifiedAt 
 * @param firstName 
 * @param freeLimit 
 * @param id 
 * @param lastName 
 * @param pubkeys 
 * @param remainingFreeEmoji 
 * @param role 
 * @param source 
 * @param twoFactorAuth 
 * @param twoFactorLastPromptedAt 
 * @param twoFactorShouldPrompt 
 * @param updatedAt 
 */

data class DisplayUserExtended (
    @Json(name = "emoji_ids")
    val emojiIds: kotlin.collections.List<kotlin.String>,
    @Json(name = "alternate_id")
    val alternateId: kotlin.String? = null,
    @Json(name = "created_at")
    val createdAt: java.time.OffsetDateTime? = null,
    @Json(name = "deactivated_at")
    val deactivatedAt: java.time.OffsetDateTime? = null,
    @Json(name = "email")
    val email: kotlin.String? = null,
    @Json(name = "email_verified_at")
    val emailVerifiedAt: java.time.OffsetDateTime? = null,
    @Json(name = "first_name")
    val firstName: kotlin.String? = null,
    @Json(name = "free_limit")
    val freeLimit: kotlin.Int? = null,
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "last_name")
    val lastName: kotlin.String? = null,
    @Json(name = "pubkeys")
    val pubkeys: kotlin.collections.List<kotlin.String>? = null,
    @Json(name = "remaining_free_emoji")
    val remainingFreeEmoji: kotlin.Int? = null,
    @Json(name = "role")
    val role: DisplayUserExtended.Role? = null,
    @Json(name = "source")
    val source: kotlin.String? = null,
    @Json(name = "two_factor_auth")
    val twoFactorAuth: List<DisplayUserExtended.TwoFactorAuth>? = null,
    @Json(name = "two_factor_last_prompted_at")
    val twoFactorLastPromptedAt: java.time.OffsetDateTime? = null,
    @Json(name = "two_factor_should_prompt")
    val twoFactorShouldPrompt: kotlin.Boolean? = null,
    @Json(name = "updated_at")
    val updatedAt: java.time.OffsetDateTime? = null
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

    /**
    * 
    * Values: admin,orgController,orgMember,orgOwner,bot,`super`,user
    */
    
    enum class Role(val value: kotlin.String){
        @Json(name = "Admin") admin("Admin"),
        @Json(name = "OrgController") orgController("OrgController"),
        @Json(name = "OrgMember") orgMember("OrgMember"),
        @Json(name = "OrgOwner") orgOwner("OrgOwner"),
        @Json(name = "Bot") bot("Bot"),
        @Json(name = "Super") `super`("Super"),
        @Json(name = "User") user("User");
    }
    /**
    * 
    * Values: googleAuthenticator,sMS
    */
    
    enum class TwoFactorAuth(val value: String){
        @Json(name = "GoogleAuthenticator") googleAuthenticator("GoogleAuthenticator"),
        @Json(name = "SMS") sMS("SMS");
    }
}

