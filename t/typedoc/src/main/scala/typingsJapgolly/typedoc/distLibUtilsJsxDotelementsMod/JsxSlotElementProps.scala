package typingsJapgolly.typedoc.distLibUtilsJsxDotelementsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxSlotElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var name: js.UndefOr[String] = js.undefined
}
object JsxSlotElementProps {
  
  inline def apply(): JsxSlotElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxSlotElementProps]
  }
  
  extension [Self <: JsxSlotElementProps](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
