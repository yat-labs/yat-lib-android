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
 * @param apiKey 
 * @param createdAt 
 * @param name 
 * @param scopes 
 * @param expiresAt 
 */

data class DisplayApiKey (
    @field:Json(name = "api_key")
    val apiKey: kotlin.String,
    @field:Json(name = "created_at")
    val createdAt: java.time.OffsetDateTime,
    @field:Json(name = "name")
    val name: kotlin.String,
    @field:Json(name = "scopes")
    val scopes: List<DisplayApiKey.Scopes>,
    @field:Json(name = "expires_at")
    val expiresAt: java.time.OffsetDateTime? = null
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

    /**
    * 
    * Values: adminCartUpdate,adminEmojiDestroy,adminEmojiLoad,adminEmojiRegister,adminEmojiTransfer,adminEmojiUpdateFeatures,adminEmojiUpdateSecureData,adminEmojiWrite,adminFeatureUserRead,adminInvitesWrite,adminInvitesList,adminLootboxRead,adminLootboxWrite,adminNotificationsWrite,adminUserBypass2fa,adminUserLoad,adminUserLoginAs,adminUserTwoFactorAuthDestroy,adminUserRoleUpdate,cartShow,cartUpdate,codeDelete,codeRead,codeWrite,userCreateApiKey,domainActionRead,domainEventRead,editionDelete,editionRead,editionWrite,emojiGroupsDelete,emojiGroupsRead,emojiGroupsWrite,emojiTransfer,featureDelete,featureRead,featureWrite,lootboxUse,orderPaymentOverride,orderRead,orderReadSelf,orderRefund,orderRefundOverride,orderResendConfirmation,organizationAdmin,organizationCodeAdmin,organizationEmojiList,organizationEmojiWrite,organizationListRead,organizationRead,organizationUserAdmin,organizationUserRead,organizationWrite,nftSignatureWrite,nftTokenDestroy,nftTransferRead,paymentMethodDestroy,paymentMethodRead,paymentMethodSetDefault,adminPriceParametersRead,adminPriceParametersWrite,refundRead,tokenRefresh,authTwoFactor,userActivate,userDataUpdate,userDelete,userDeleteSelf,userEmailVerify,userEmojiList,userInterestDelete,userInterestRead,userInterestWrite,userList,userPubkeysList,userPubkeysWrite,userShow,userWrite,userWriteSelf
    */
    
    enum class Scopes(val value: String){
        @field:Json(name = "adminCart:update") adminCartUpdate("adminCart:update"),
        @field:Json(name = "adminEmoji:destroy") adminEmojiDestroy("adminEmoji:destroy"),
        @field:Json(name = "adminEmoji:load") adminEmojiLoad("adminEmoji:load"),
        @field:Json(name = "adminEmoji:register") adminEmojiRegister("adminEmoji:register"),
        @field:Json(name = "adminEmoji:transfer") adminEmojiTransfer("adminEmoji:transfer"),
        @field:Json(name = "adminEmoji:updateFeatures") adminEmojiUpdateFeatures("adminEmoji:updateFeatures"),
        @field:Json(name = "adminEmoji:updateSecureData") adminEmojiUpdateSecureData("adminEmoji:updateSecureData"),
        @field:Json(name = "adminEmoji:write") adminEmojiWrite("adminEmoji:write"),
        @field:Json(name = "adminFeatureUser:read") adminFeatureUserRead("adminFeatureUser:read"),
        @field:Json(name = "adminInvites:write") adminInvitesWrite("adminInvites:write"),
        @field:Json(name = "adminInvites:list") adminInvitesList("adminInvites:list"),
        @field:Json(name = "adminLootbox:read") adminLootboxRead("adminLootbox:read"),
        @field:Json(name = "adminLootbox:write") adminLootboxWrite("adminLootbox:write"),
        @field:Json(name = "adminNotifications:write") adminNotificationsWrite("adminNotifications:write"),
        @field:Json(name = "adminUser:bypass2fa") adminUserBypass2fa("adminUser:bypass2fa"),
        @field:Json(name = "adminUser:load") adminUserLoad("adminUser:load"),
        @field:Json(name = "adminUser:loginAs") adminUserLoginAs("adminUser:loginAs"),
        @field:Json(name = "adminUser:twoFactorAuthDestroy") adminUserTwoFactorAuthDestroy("adminUser:twoFactorAuthDestroy"),
        @field:Json(name = "adminUser:roleUpdate") adminUserRoleUpdate("adminUser:roleUpdate"),
        @field:Json(name = "cart:show") cartShow("cart:show"),
        @field:Json(name = "cart:update") cartUpdate("cart:update"),
        @field:Json(name = "code:delete") codeDelete("code:delete"),
        @field:Json(name = "code:read") codeRead("code:read"),
        @field:Json(name = "code:write") codeWrite("code:write"),
        @field:Json(name = "user:createApiKey") userCreateApiKey("user:createApiKey"),
        @field:Json(name = "domainAction:read") domainActionRead("domainAction:read"),
        @field:Json(name = "domainEvent:read") domainEventRead("domainEvent:read"),
        @field:Json(name = "edition:delete") editionDelete("edition:delete"),
        @field:Json(name = "edition:read") editionRead("edition:read"),
        @field:Json(name = "edition:write") editionWrite("edition:write"),
        @field:Json(name = "emojiGroups:delete") emojiGroupsDelete("emojiGroups:delete"),
        @field:Json(name = "emojiGroups:read") emojiGroupsRead("emojiGroups:read"),
        @field:Json(name = "emojiGroups:write") emojiGroupsWrite("emojiGroups:write"),
        @field:Json(name = "emoji::transfer") emojiTransfer("emoji::transfer"),
        @field:Json(name = "feature::delete") featureDelete("feature::delete"),
        @field:Json(name = "feature::read") featureRead("feature::read"),
        @field:Json(name = "feature::write") featureWrite("feature::write"),
        @field:Json(name = "lootbox:use") lootboxUse("lootbox:use"),
        @field:Json(name = "order:paymentOverride") orderPaymentOverride("order:paymentOverride"),
        @field:Json(name = "order:read") orderRead("order:read"),
        @field:Json(name = "order:readSelf") orderReadSelf("order:readSelf"),
        @field:Json(name = "order:refund") orderRefund("order:refund"),
        @field:Json(name = "order:refundOverride") orderRefundOverride("order:refundOverride"),
        @field:Json(name = "order:resendConfirmation") orderResendConfirmation("order:resendConfirmation"),
        @field:Json(name = "organization:admin") organizationAdmin("organization:admin"),
        @field:Json(name = "organizationCode:admin") organizationCodeAdmin("organizationCode:admin"),
        @field:Json(name = "organizationEmoji:list") organizationEmojiList("organizationEmoji:list"),
        @field:Json(name = "organizationEmoji:write") organizationEmojiWrite("organizationEmoji:write"),
        @field:Json(name = "organizationList:read") organizationListRead("organizationList:read"),
        @field:Json(name = "organization:read") organizationRead("organization:read"),
        @field:Json(name = "organizationUser:admin") organizationUserAdmin("organizationUser:admin"),
        @field:Json(name = "organizationUser:read") organizationUserRead("organizationUser:read"),
        @field:Json(name = "organization:write") organizationWrite("organization:write"),
        @field:Json(name = "nftSignature:write") nftSignatureWrite("nftSignature:write"),
        @field:Json(name = "nftToken:destroy") nftTokenDestroy("nftToken:destroy"),
        @field:Json(name = "nftTransfer:read") nftTransferRead("nftTransfer:read"),
        @field:Json(name = "paymentMethod:destroy") paymentMethodDestroy("paymentMethod:destroy"),
        @field:Json(name = "paymentMethod:read") paymentMethodRead("paymentMethod:read"),
        @field:Json(name = "paymentMethod:setDefault") paymentMethodSetDefault("paymentMethod:setDefault"),
        @field:Json(name = "adminPriceParameters:read") adminPriceParametersRead("adminPriceParameters:read"),
        @field:Json(name = "adminPriceParameters:write") adminPriceParametersWrite("adminPriceParameters:write"),
        @field:Json(name = "refund:read") refundRead("refund:read"),
        @field:Json(name = "token:refresh") tokenRefresh("token:refresh"),
        @field:Json(name = "auth:twoFactor") authTwoFactor("auth:twoFactor"),
        @field:Json(name = "user:activate") userActivate("user:activate"),
        @field:Json(name = "userData:update") userDataUpdate("userData:update"),
        @field:Json(name = "user:delete") userDelete("user:delete"),
        @field:Json(name = "user:deleteSelf") userDeleteSelf("user:deleteSelf"),
        @field:Json(name = "userEmail:verify") userEmailVerify("userEmail:verify"),
        @field:Json(name = "userEmoji:list") userEmojiList("userEmoji:list"),
        @field:Json(name = "userInterest:delete") userInterestDelete("userInterest:delete"),
        @field:Json(name = "userInterest:read") userInterestRead("userInterest:read"),
        @field:Json(name = "userInterest:write") userInterestWrite("userInterest:write"),
        @field:Json(name = "user:list") userList("user:list"),
        @field:Json(name = "userPubkeys:list") userPubkeysList("userPubkeys:list"),
        @field:Json(name = "userPubkeys:write") userPubkeysWrite("userPubkeys:write"),
        @field:Json(name = "user:show") userShow("user:show"),
        @field:Json(name = "user:write") userWrite("user:write"),
        @field:Json(name = "user:writeSelf") userWriteSelf("user:writeSelf");
    }
}

