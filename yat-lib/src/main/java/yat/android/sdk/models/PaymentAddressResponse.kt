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
 * @param status 
 * @param error 
 * @param result 
 */

data class PaymentAddressResponse (
    @Json(name = "status")
    var status: kotlin.Boolean,
    @Json(name = "error")
    var error: EidResponseError? = null,
    @Json(name = "result")
    var result: kotlin.collections.Map<kotlin.String, PaymentAddressResponseResult>? = null
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

