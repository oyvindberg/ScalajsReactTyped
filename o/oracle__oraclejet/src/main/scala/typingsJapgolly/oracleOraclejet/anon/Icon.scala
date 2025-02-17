package typingsJapgolly.oracleOraclejet.anon

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Icon extends StObject {
  
  var icon: BorderRadius
  
  var labelStyle: js.Object
  
  var showDisclosure: off | on
}
object Icon {
  
  inline def apply(icon: BorderRadius, labelStyle: js.Object, showDisclosure: off | on): Icon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], showDisclosure = showDisclosure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
  
  extension [Self <: Icon](x: Self) {
    
    inline def setIcon(value: BorderRadius): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setLabelStyle(value: js.Object): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    inline def setShowDisclosure(value: off | on): Self = StObject.set(x, "showDisclosure", value.asInstanceOf[js.Any])
  }
}
