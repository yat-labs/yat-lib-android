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
 * A data record stored in an emoji record. For ergonomics, the data is represented as a string, irrespective of whether the underlying data is a string or not. Typically, binary data will be encoded as a hexadecimal string, but this is not a guarantee. Refer to the individual record type specifications to determine the form the data will take.
 * @param data Category data in text format
 * @param tag Category ID as a hex number
 */

data class EditRequestInsert (
    /* Category data in text format */
    @field:Json(name = "data")
    val data: kotlin.String,
    /* Category ID as a hex number */
    @field:Json(name = "tag")
    val tag: kotlin.String
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

