package typingsJapgolly.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdBoolean extends StObject {
  
  var error: CodeMessage
  
  var id: Boolean
  
  var jsonrpc: String
}
object IdBoolean {
  
  inline def apply(error: CodeMessage, id: Boolean, jsonrpc: String): IdBoolean = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdBoolean]
  }
  
  extension [Self <: IdBoolean](x: Self) {
    
    inline def setError(value: CodeMessage): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
  }
}
