package typingsJapgolly.maximMazurokGapiClientAnalytics.anon

import typingsJapgolly.maximMazurokGapiClientAnalytics.gapi.client.analytics.EntityUserLink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceUserIp extends StObject {
  
  /** Account ID to update the user link for. */
  var accountId: String
  
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  
  /** Link ID to update the user link for. */
  var linkId: String
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  
  /** View (Profile ID) to update the user link for. */
  var profileId: String
  
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  
  /** Request body */
  var resource: EntityUserLink
  
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.undefined
  
  /** Web Property ID to update the user link for. */
  var webPropertyId: String
}
object ResourceUserIp {
  
  inline def apply(
    accountId: String,
    linkId: String,
    profileId: String,
    resource: EntityUserLink,
    webPropertyId: String
  ): ResourceUserIp = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], linkId = linkId.asInstanceOf[js.Any], profileId = profileId.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], webPropertyId = webPropertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceUserIp]
  }
  
  extension [Self <: ResourceUserIp](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLinkId(value: String): Self = StObject.set(x, "linkId", value.asInstanceOf[js.Any])
    
    inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
    
    inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
    
    inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
    
    inline def setResource(value: EntityUserLink): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
    
    inline def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
  }
}
