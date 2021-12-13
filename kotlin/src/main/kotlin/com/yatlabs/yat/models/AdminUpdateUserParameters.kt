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
 * 
 * @param activationSource Optional: Source of activation
 * @param currentPassword Optional: Current password, must be provided if one exists
 * @param email Optional: Email
 * @param firstName Optional: First name
 * @param freeLimit Optional: Free limit for how many yats the user may purchase
 * @param lastName Optional: Last name
 * @param password Optional: User password
 * @param role Optional: Update the user role
 */

data class AdminUpdateUserParameters (
    /* Optional: Source of activation */
    @Json(name = "activation_source")
    val activationSource: kotlin.String? = null,
    /* Optional: Current password, must be provided if one exists */
    @Json(name = "current_password")
    val currentPassword: kotlin.String? = null,
    /* Optional: Email */
    @Json(name = "email")
    val email: kotlin.String? = null,
    /* Optional: First name */
    @Json(name = "first_name")
    val firstName: kotlin.String? = null,
    /* Optional: Free limit for how many yats the user may purchase */
    @Json(name = "free_limit")
    val freeLimit: kotlin.Int? = null,
    /* Optional: Last name */
    @Json(name = "last_name")
    val lastName: kotlin.String? = null,
    /* Optional: User password */
    @Json(name = "password")
    val password: kotlin.String? = null,
    /* Optional: Update the user role */
    @Json(name = "role")
    val role: AdminUpdateUserParameters.Role? = null
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

    /**
    * Optional: Update the user role
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
}

