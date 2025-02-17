package typingsJapgolly.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceAccount extends StObject {
  
  /** Optional. A user-specified, human-readable description of the service account. The maximum length is 256 UTF-8 bytes. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Output only. Whether the service account is disabled. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /** Optional. A user-specified, human-readable name for the service account. The maximum length is 100 UTF-8 bytes. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. The email address of the service account. */
  var email: js.UndefOr[String] = js.undefined
  
  /** Deprecated. Do not use. */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The resource name of the service account. Use one of the following formats: * `projects/{PROJECT_ID}/serviceAccounts/{EMAIL_ADDRESS}` *
    * `projects/{PROJECT_ID}/serviceAccounts/{UNIQUE_ID}` As an alternative, you can use the `-` wildcard character instead of the project ID: *
    * `projects/-/serviceAccounts/{EMAIL_ADDRESS}` * `projects/-/serviceAccounts/{UNIQUE_ID}` When possible, avoid using the `-` wildcard character, because it can cause response messages
    * to contain misleading error codes. For example, if you try to get the service account `projects/-/serviceAccounts/fake@example.com`, which does not exist, the response contains an
    * HTTP `403 Forbidden` error instead of a `404 Not Found` error.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The OAuth 2.0 client ID for the service account. */
  var oauth2ClientId: js.UndefOr[String] = js.undefined
  
  /** Output only. The ID of the project that owns the service account. */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The unique, stable numeric ID for the service account. Each service account retains its unique ID even if you delete the service account. For example, if you delete a
    * service account, then create a new service account with the same name, the new service account has a different unique ID than the deleted service account.
    */
  var uniqueId: js.UndefOr[String] = js.undefined
}
object ServiceAccount {
  
  inline def apply(): ServiceAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceAccount]
  }
  
  extension [Self <: ServiceAccount](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOauth2ClientId(value: String): Self = StObject.set(x, "oauth2ClientId", value.asInstanceOf[js.Any])
    
    inline def setOauth2ClientIdUndefined: Self = StObject.set(x, "oauth2ClientId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setUniqueId(value: String): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
    
    inline def setUniqueIdUndefined: Self = StObject.set(x, "uniqueId", js.undefined)
  }
}
