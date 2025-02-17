package typingsJapgolly.smartFoxServer.SFS2X

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICONNECTION extends StObject {
  
  var success: Boolean
}
object ICONNECTION {
  
  inline def apply(success: Boolean): ICONNECTION = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICONNECTION]
  }
  
  extension [Self <: ICONNECTION](x: Self) {
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
