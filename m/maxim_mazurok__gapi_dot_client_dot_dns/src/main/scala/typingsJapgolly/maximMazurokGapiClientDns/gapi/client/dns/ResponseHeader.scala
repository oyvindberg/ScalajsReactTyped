package typingsJapgolly.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseHeader extends StObject {
  
  /** For mutating operation requests that completed successfully. This is the client_operation_id if the client specified it, otherwise it is generated by the server (output only). */
  var operationId: js.UndefOr[String] = js.undefined
}
object ResponseHeader {
  
  inline def apply(): ResponseHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseHeader]
  }
  
  extension [Self <: ResponseHeader](x: Self) {
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
  }
}
