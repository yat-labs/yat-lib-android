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
 * Emoji transfer request details json payload
 * @param clearOnTransfer 
 * @param createdAt 
 * @param eid 
 * @param email 
 * @param id 
 * @param recipientId 
 * @param acceptedAt 
 * @param deletedAt 
 * @param message 
 * @param senderCodeAcceptedAt 
 */

data class ListOfDisplayTransferRequestData (
    @Json(name = "clear_on_transfer")
    val clearOnTransfer: kotlin.Boolean,
    @Json(name = "created_at")
    val createdAt: java.time.OffsetDateTime,
    @Json(name = "eid")
    val eid: kotlin.String,
    @Json(name = "email")
    val email: kotlin.String,
    @Json(name = "id")
    val id: java.util.UUID,
    @Json(name = "recipient_id")
    val recipientId: java.util.UUID,
    @Json(name = "accepted_at")
    val acceptedAt: java.time.OffsetDateTime? = null,
    @Json(name = "deleted_at")
    val deletedAt: java.time.OffsetDateTime? = null,
    @Json(name = "message")
    val message: kotlin.String? = null,
    @Json(name = "sender_code_accepted_at")
    val senderCodeAcceptedAt: java.time.OffsetDateTime? = null
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

