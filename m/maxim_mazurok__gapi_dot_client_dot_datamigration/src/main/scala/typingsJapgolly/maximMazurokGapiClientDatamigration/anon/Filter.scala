package typingsJapgolly.maximMazurokGapiClientDatamigration.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.undefined
  
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.undefined
  
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.undefined
  
  /** JSONP */
  var callback: js.UndefOr[String] = js.undefined
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  
  /**
    * A filter expression that filters migration jobs listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for
    * filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <. For example, list migration jobs created this year by
    * specifying **createTime %gt; 2020-01-01T00:00:00.000000000Z.** You can also filter nested fields. For example, you could specify **reverseSshConnectivity.vmIp = "1.2.3.4"** to
    * select all migration jobs connecting through the specific SSH tunnel bastion.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  
  /** Sort the results based on the migration job name. Valid values are: "name", "name asc", and "name desc". */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of migration jobs to return. The service may return fewer than this value. If unspecified, at most 50 migration jobs will be returned. The maximum value is
    * 1000; values above 1000 will be coerced to 1000.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The nextPageToken value received in the previous call to migrationJobs.list, used in the subsequent request to retrieve the next page of results. On first call this should be
    * left blank. When paginating, all other parameters provided to migrationJobs.list must match the call that provided the page token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /** Required. The parent, which owns this collection of migrationJobs. */
  var parent: String
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.undefined
  
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.undefined
}
object Filter {
  
  inline def apply(parent: String): Filter = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  
  extension [Self <: Filter](x: Self) {
    
    inline def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
    
    inline def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
    
    inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    
    inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
    
    inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
    
    inline def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
    
    inline def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
    
    inline def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
    
    inline def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
  }
}
