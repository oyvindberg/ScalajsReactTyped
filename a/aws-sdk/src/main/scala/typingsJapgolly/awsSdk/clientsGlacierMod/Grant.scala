package typingsJapgolly.awsSdk.clientsGlacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Grant extends StObject {
  
  /**
    * The grantee.
    */
  var Grantee: js.UndefOr[typingsJapgolly.awsSdk.clientsGlacierMod.Grantee] = js.undefined
  
  /**
    * Specifies the permission given to the grantee. 
    */
  var Permission: js.UndefOr[typingsJapgolly.awsSdk.clientsGlacierMod.Permission] = js.undefined
}
object Grant {
  
  inline def apply(): Grant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Grant]
  }
  
  extension [Self <: Grant](x: Self) {
    
    inline def setGrantee(value: Grantee): Self = StObject.set(x, "Grantee", value.asInstanceOf[js.Any])
    
    inline def setGranteeUndefined: Self = StObject.set(x, "Grantee", js.undefined)
    
    inline def setPermission(value: Permission): Self = StObject.set(x, "Permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "Permission", js.undefined)
  }
}
