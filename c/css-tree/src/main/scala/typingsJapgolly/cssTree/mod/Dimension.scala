package typingsJapgolly.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dimension
  extends StObject
     with CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  @JSName("type")
  var type_Dimension: typingsJapgolly.cssTree.cssTreeStrings.Dimension
  
  var unit: String
  
  var value: String
}
object Dimension {
  
  inline def apply(unit: String, value: String): Dimension = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Dimension")
    __obj.asInstanceOf[Dimension]
  }
  
  extension [Self <: Dimension](x: Self) {
    
    inline def setType(value: typingsJapgolly.cssTree.cssTreeStrings.Dimension): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
