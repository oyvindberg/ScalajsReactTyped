package typingsJapgolly.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartInstanceResult extends StObject {
  
  /**
    * An array of objects that describe the result of the action, such as the status of the request, the timestamp of the request, and the resources affected by the request.
    */
  var operations: js.UndefOr[OperationList] = js.undefined
}
object StartInstanceResult {
  
  inline def apply(): StartInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartInstanceResult]
  }
  
  extension [Self <: StartInstanceResult](x: Self) {
    
    inline def setOperations(value: OperationList): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: Operation*): Self = StObject.set(x, "operations", js.Array(value*))
  }
}
