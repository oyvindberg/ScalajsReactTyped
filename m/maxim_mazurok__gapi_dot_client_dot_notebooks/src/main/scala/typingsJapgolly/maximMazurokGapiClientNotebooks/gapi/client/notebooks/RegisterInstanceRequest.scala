package typingsJapgolly.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterInstanceRequest extends StObject {
  
  /**
    * Required. User defined unique ID of this instance. The `instance_id` must be 1 to 63 characters long and contain only lowercase letters, numeric characters, and dashes. The first
    * character must be a lowercase letter and the last character cannot be a dash.
    */
  var instanceId: js.UndefOr[String] = js.undefined
}
object RegisterInstanceRequest {
  
  inline def apply(): RegisterInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterInstanceRequest]
  }
  
  extension [Self <: RegisterInstanceRequest](x: Self) {
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
  }
}
