package typingsJapgolly.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait V1RemoveVisibilityLabelsResponse extends StObject {
  
  /** The updated set of visibility labels for this consumer on this service. */
  var labels: js.UndefOr[js.Array[String]] = js.undefined
}
object V1RemoveVisibilityLabelsResponse {
  
  inline def apply(): V1RemoveVisibilityLabelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[V1RemoveVisibilityLabelsResponse]
  }
  
  extension [Self <: V1RemoveVisibilityLabelsResponse](x: Self) {
    
    inline def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value*))
  }
}
