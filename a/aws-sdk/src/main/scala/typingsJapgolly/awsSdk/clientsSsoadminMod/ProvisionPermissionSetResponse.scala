package typingsJapgolly.awsSdk.clientsSsoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionPermissionSetResponse extends StObject {
  
  /**
    * The status object for the permission set provisioning operation.
    */
  var PermissionSetProvisioningStatus: js.UndefOr[typingsJapgolly.awsSdk.clientsSsoadminMod.PermissionSetProvisioningStatus] = js.undefined
}
object ProvisionPermissionSetResponse {
  
  inline def apply(): ProvisionPermissionSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionPermissionSetResponse]
  }
  
  extension [Self <: ProvisionPermissionSetResponse](x: Self) {
    
    inline def setPermissionSetProvisioningStatus(value: PermissionSetProvisioningStatus): Self = StObject.set(x, "PermissionSetProvisioningStatus", value.asInstanceOf[js.Any])
    
    inline def setPermissionSetProvisioningStatusUndefined: Self = StObject.set(x, "PermissionSetProvisioningStatus", js.undefined)
  }
}
