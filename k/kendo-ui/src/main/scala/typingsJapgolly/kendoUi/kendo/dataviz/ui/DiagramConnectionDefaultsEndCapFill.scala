package typingsJapgolly.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramConnectionDefaultsEndCapFill extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
}
object DiagramConnectionDefaultsEndCapFill {
  
  inline def apply(): DiagramConnectionDefaultsEndCapFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionDefaultsEndCapFill]
  }
  
  extension [Self <: DiagramConnectionDefaultsEndCapFill](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
