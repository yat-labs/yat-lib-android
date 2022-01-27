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
 * @param description 
 * @param finishDate 
 * @param key Counter object
 * @param metric Counter type
 * @param startDate 
 * @param value Counter value
 */

data class EmojiStatsResponseMetrics (
    @field:Json(name = "description")
    val description: kotlin.String,
    @field:Json(name = "finish_date")
    val finishDate: java.time.OffsetDateTime,
    /* Counter object */
    @field:Json(name = "key")
    val key: kotlin.String,
    /* Counter type */
    @field:Json(name = "metric")
    val metric: kotlin.String,
    @field:Json(name = "start_date")
    val startDate: java.time.OffsetDateTime,
    /* Counter value */
    @field:Json(name = "value")
    val value: kotlin.Long
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

