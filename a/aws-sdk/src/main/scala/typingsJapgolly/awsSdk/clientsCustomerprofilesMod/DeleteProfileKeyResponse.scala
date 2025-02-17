package typingsJapgolly.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProfileKeyResponse extends StObject {
  
  /**
    * A message that indicates the delete request is done.
    */
  var Message: js.UndefOr[message] = js.undefined
}
object DeleteProfileKeyResponse {
  
  inline def apply(): DeleteProfileKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteProfileKeyResponse]
  }
  
  extension [Self <: DeleteProfileKeyResponse](x: Self) {
    
    inline def setMessage(value: message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
