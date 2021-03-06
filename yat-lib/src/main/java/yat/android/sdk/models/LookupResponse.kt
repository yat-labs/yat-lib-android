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
 * @param stats Number of times emoji viewed during past month
 * @param error 
 * @param result Records associated with EmojiID
 * @param status Response status.  If true, the requested data will be in the result field, null otherwise
 */

data class LookupResponse (
    /* Number of times emoji viewed during past month */
    @Json(name = "stats")
    val stats: kotlin.collections.List<EmojiStatsResponseMetrics>,
    @Json(name = "error")
    val error: EidResponseError? = null,
    /* Records associated with EmojiID */
    @Json(name = "result")
    val result: kotlin.collections.List<EidResponseResult>? = null,
    /* Response status.  If true, the requested data will be in the result field, null otherwise */
    @Json(name = "status")
    val status: kotlin.Boolean? = null
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

