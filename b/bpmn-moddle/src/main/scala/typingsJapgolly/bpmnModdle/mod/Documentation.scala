package typingsJapgolly.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Documentation
  extends StObject
     with BaseElement {
  
  var text: String
  
  /**
    * @default "text/plain"
    */
  var textFormat: String
}
object Documentation {
  
  inline def apply($parent: TypeDerived, $type: ElementType, id: String, text: String, textFormat: String): Documentation = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textFormat = textFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Documentation]
  }
  
  extension [Self <: Documentation](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextFormat(value: String): Self = StObject.set(x, "textFormat", value.asInstanceOf[js.Any])
  }
}
