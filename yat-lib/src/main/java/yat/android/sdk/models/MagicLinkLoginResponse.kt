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
 * @param message Message
 * @param status Status of requested user after completing the login request
 */

data class MagicLinkLoginResponse (
    /* Message */
    @Json(name = "message")
    val message: kotlin.String,
    /* Status of requested user after completing the login request */
    @Json(name = "status")
    val status: MagicLinkLoginResponse.Status
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

    /**
    * Status of requested user after completing the login request
    * Values: active,registeredInactive,registeredActive,inactive
    */
    
    enum class Status(val value: kotlin.String){
        @Json(name = "Active") active("Active"),
        @Json(name = "RegisteredInactive") registeredInactive("RegisteredInactive"),
        @Json(name = "RegisteredActive") registeredActive("RegisteredActive"),
        @Json(name = "Inactive") inactive("Inactive");
    }
}

