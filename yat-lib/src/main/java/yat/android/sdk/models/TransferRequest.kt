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
 * @param clearOnTransfer Clear emoji data when emoji transferred to destination
 * @param eid 
 * @param email Transfer to specified email, would register new user account if not existent
 * @param forceTransfer Admin can force transfer, for regular user it has no effect
 * @param message Message displayed to recipient and included in the invitiation email
 */

data class TransferRequest (
    /* Clear emoji data when emoji transferred to destination */
    @Json(name = "clear_on_transfer")
    val clearOnTransfer: kotlin.Boolean,
    @Json(name = "eid")
    val eid: kotlin.String,
    /* Transfer to specified email, would register new user account if not existent */
    @Json(name = "email")
    val email: kotlin.String,
    /* Admin can force transfer, for regular user it has no effect */
    @Json(name = "force_transfer")
    val forceTransfer: kotlin.Boolean,
    /* Message displayed to recipient and included in the invitiation email */
    @Json(name = "message")
    val message: kotlin.String? = null
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

