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

import com.yatlabs.yat.models.ListOfPublicLootBoxLootboxTypeConfig

import com.squareup.moshi.Json
import java.io.Serializable

/**
 * HTTP schema for an existing LootBoxType record
 * @param config 
 * @param createdAt The timestamp for when this loot box type was created
 * @param description A more detailed description of the loot box type
 * @param id The loot box type id
 * @param name The name of this loot box type
 */

data class PublicLootBoxType (
    @Json(name = "config")
    val config: ListOfPublicLootBoxLootboxTypeConfig,
    /* The timestamp for when this loot box type was created */
    @Json(name = "created_at")
    val createdAt: java.time.OffsetDateTime,
    /* A more detailed description of the loot box type */
    @Json(name = "description")
    val description: kotlin.String,
    /* The loot box type id */
    @Json(name = "id")
    val id: java.util.UUID,
    /* The name of this loot box type */
    @Json(name = "name")
    val name: kotlin.String
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

