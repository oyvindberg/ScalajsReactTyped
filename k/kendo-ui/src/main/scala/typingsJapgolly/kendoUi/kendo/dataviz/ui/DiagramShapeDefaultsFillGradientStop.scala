package typingsJapgolly.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramShapeDefaultsFillGradientStop extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
}
object DiagramShapeDefaultsFillGradientStop {
  
  inline def apply(): DiagramShapeDefaultsFillGradientStop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShapeDefaultsFillGradientStop]
  }
  
  extension [Self <: DiagramShapeDefaultsFillGradientStop](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
