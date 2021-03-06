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
 * @param accessToken Access token
 * @param hasPassword Has a password set
 * @param refreshToken Refresh token,  only required for 2FA (???)
 * @param requires2fa Whether has 2FA enabled or not
 */

data class TokenResponse (
    /* Access token */
    @Json(name = "access_token")
    val accessToken: kotlin.String,
    /* Has a password set */
    @Json(name = "has_password")
    val hasPassword: kotlin.Boolean,
    /* Refresh token,  only required for 2FA (???) */
    @Json(name = "refresh_token")
    val refreshToken: kotlin.String,
    /* Whether has 2FA enabled or not */
    @Json(name = "requires_2fa")
    val requires2fa: TokenResponse.Requires2fa? = null
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

    /**
    * Whether has 2FA enabled or not
    * Values: googleAuthenticator,sMS
    */
    
    enum class Requires2fa(val value: kotlin.String){
        @Json(name = "GoogleAuthenticator") googleAuthenticator("GoogleAuthenticator"),
        @Json(name = "SMS") sMS("SMS");
    }
}

