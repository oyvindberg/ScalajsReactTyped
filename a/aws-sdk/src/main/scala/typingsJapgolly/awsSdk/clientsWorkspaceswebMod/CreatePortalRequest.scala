package typingsJapgolly.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePortalRequest extends StObject {
  
  /**
    * The additional encryption context of the portal.
    */
  var additionalEncryptionContext: js.UndefOr[EncryptionContextMap] = js.undefined
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Idempotency ensures that an API request completes only once. With an idempotent request, if the original request completes successfully, subsequent retries with the same client token returns the result from the original successful request.  If you do not specify a client token, one is automatically generated by the AWS SDK.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The customer managed key of the web portal.
    */
  var customerManagedKey: js.UndefOr[keyArn] = js.undefined
  
  /**
    * The name of the web portal. This is not visible to users who log into the web portal.
    */
  var displayName: js.UndefOr[DisplayName] = js.undefined
  
  /**
    * The tags to add to the web portal. A tag is a key-value pair.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreatePortalRequest {
  
  inline def apply(): CreatePortalRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePortalRequest]
  }
  
  extension [Self <: CreatePortalRequest](x: Self) {
    
    inline def setAdditionalEncryptionContext(value: EncryptionContextMap): Self = StObject.set(x, "additionalEncryptionContext", value.asInstanceOf[js.Any])
    
    inline def setAdditionalEncryptionContextUndefined: Self = StObject.set(x, "additionalEncryptionContext", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setCustomerManagedKey(value: keyArn): Self = StObject.set(x, "customerManagedKey", value.asInstanceOf[js.Any])
    
    inline def setCustomerManagedKeyUndefined: Self = StObject.set(x, "customerManagedKey", js.undefined)
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
