package typingsJapgolly.materialTextfield.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HELPERTEXTPERSISTENT extends StObject {
  
  var HELPER_TEXT_PERSISTENT: String
  
  var HELPER_TEXT_VALIDATION_MSG: String
  
  var ROOT: String
}
object HELPERTEXTPERSISTENT {
  
  inline def apply(HELPER_TEXT_PERSISTENT: String, HELPER_TEXT_VALIDATION_MSG: String, ROOT: String): HELPERTEXTPERSISTENT = {
    val __obj = js.Dynamic.literal(HELPER_TEXT_PERSISTENT = HELPER_TEXT_PERSISTENT.asInstanceOf[js.Any], HELPER_TEXT_VALIDATION_MSG = HELPER_TEXT_VALIDATION_MSG.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any])
    __obj.asInstanceOf[HELPERTEXTPERSISTENT]
  }
  
  extension [Self <: HELPERTEXTPERSISTENT](x: Self) {
    
    inline def setHELPER_TEXT_PERSISTENT(value: String): Self = StObject.set(x, "HELPER_TEXT_PERSISTENT", value.asInstanceOf[js.Any])
    
    inline def setHELPER_TEXT_VALIDATION_MSG(value: String): Self = StObject.set(x, "HELPER_TEXT_VALIDATION_MSG", value.asInstanceOf[js.Any])
    
    inline def setROOT(value: String): Self = StObject.set(x, "ROOT", value.asInstanceOf[js.Any])
  }
}
