package typingsJapgolly.activexMsforms.MSForms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLHidden extends StObject {
  
  var HTMLName: String
  
  var HTMLType: String
  
  /* private */ @JSName("MSForms.HTMLHidden_typekey")
  var MSFormsDotHTMLHidden_typekey: HTMLHidden
  
  var Value: String
}
object HTMLHidden {
  
  inline def apply(HTMLName: String, HTMLType: String, MSFormsDotHTMLHidden_typekey: HTMLHidden, Value: String): HTMLHidden = {
    val __obj = js.Dynamic.literal(HTMLName = HTMLName.asInstanceOf[js.Any], HTMLType = HTMLType.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLHidden_typekey")(MSFormsDotHTMLHidden_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLHidden]
  }
  
  extension [Self <: HTMLHidden](x: Self) {
    
    inline def setHTMLName(value: String): Self = StObject.set(x, "HTMLName", value.asInstanceOf[js.Any])
    
    inline def setHTMLType(value: String): Self = StObject.set(x, "HTMLType", value.asInstanceOf[js.Any])
    
    inline def setMSFormsDotHTMLHidden_typekey(value: HTMLHidden): Self = StObject.set(x, "MSForms.HTMLHidden_typekey", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
