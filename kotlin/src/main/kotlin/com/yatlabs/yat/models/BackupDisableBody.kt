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
 * @param backupCode Backup code
 * @param alternateId Alternate identifier
 * @param disableAll Make this method default
 * @param email Email
 * @param provider Two factor authentication backend
 */

data class BackupDisableBody (
    /* Backup code */
    @Json(name = "backup_code")
    val backupCode: kotlin.String,
    /* Alternate identifier */
    @Json(name = "alternate_id")
    val alternateId: kotlin.String? = null,
    /* Make this method default */
    @Json(name = "disable_all")
    val disableAll: kotlin.Boolean? = null,
    /* Email */
    @Json(name = "email")
    val email: kotlin.String? = null,
    /* Two factor authentication backend */
    @Json(name = "provider")
    val provider: BackupDisableBody.Provider? = null
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

    /**
    * Two factor authentication backend
    * Values: googleAuthenticator,sMS
    */
    
    enum class Provider(val value: kotlin.String){
        @Json(name = "GoogleAuthenticator") googleAuthenticator("GoogleAuthenticator"),
        @Json(name = "SMS") sMS("SMS");
    }
}

