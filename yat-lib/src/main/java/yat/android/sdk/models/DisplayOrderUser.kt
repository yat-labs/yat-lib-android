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
 * The details of the user placing this order.
 * @param createdAt 
 * @param freeLimit 
 * @param id 
 * @param pubkeys 
 * @param remainingFreeEmoji 
 * @param role 
 * @param twoFactorShouldPrompt 
 * @param updatedAt 
 * @param alternateId 
 * @param deactivatedAt 
 * @param email 
 * @param emailVerifiedAt 
 * @param firstName 
 * @param lastName 
 * @param source 
 * @param twoFactorAuth 
 * @param twoFactorLastPromptedAt 
 */

data class DisplayOrderUser (
    @field:Json(name = "created_at")
    val createdAt: java.time.OffsetDateTime,
    @field:Json(name = "free_limit")
    val freeLimit: kotlin.Int,
    @field:Json(name = "id")
    val id: java.util.UUID,
    @field:Json(name = "pubkeys")
    val pubkeys: kotlin.collections.List<kotlin.String>,
    @field:Json(name = "remaining_free_emoji")
    val remainingFreeEmoji: kotlin.Int,
    @field:Json(name = "role")
    val role: DisplayOrderUser.Role,
    @field:Json(name = "two_factor_should_prompt")
    val twoFactorShouldPrompt: kotlin.Boolean,
    @field:Json(name = "updated_at")
    val updatedAt: java.time.OffsetDateTime,
    @field:Json(name = "alternate_id")
    val alternateId: kotlin.String? = null,
    @field:Json(name = "deactivated_at")
    val deactivatedAt: java.time.OffsetDateTime? = null,
    @field:Json(name = "email")
    val email: kotlin.String? = null,
    @field:Json(name = "email_verified_at")
    val emailVerifiedAt: java.time.OffsetDateTime? = null,
    @field:Json(name = "first_name")
    val firstName: kotlin.String? = null,
    @field:Json(name = "last_name")
    val lastName: kotlin.String? = null,
    @field:Json(name = "source")
    val source: kotlin.String? = null,
    @field:Json(name = "two_factor_auth")
    val twoFactorAuth: List<DisplayOrderUser.TwoFactorAuth>? = null,
    @field:Json(name = "two_factor_last_prompted_at")
    val twoFactorLastPromptedAt: java.time.OffsetDateTime? = null
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

    /**
    * 
    * Values: admin,orgController,orgMember,orgOwner,bot,`super`,user
    */
    
    enum class Role(val value: kotlin.String){
        @field:Json(name = "Admin") admin("Admin"),
        @field:Json(name = "OrgController") orgController("OrgController"),
        @field:Json(name = "OrgMember") orgMember("OrgMember"),
        @field:Json(name = "OrgOwner") orgOwner("OrgOwner"),
        @field:Json(name = "Bot") bot("Bot"),
        @field:Json(name = "Super") `super`("Super"),
        @field:Json(name = "User") user("User");
    }
    /**
    * 
    * Values: googleAuthenticator,sMS
    */
    
    enum class TwoFactorAuth(val value: String){
        @field:Json(name = "GoogleAuthenticator") googleAuthenticator("GoogleAuthenticator"),
        @field:Json(name = "SMS") sMS("SMS");
    }
}

