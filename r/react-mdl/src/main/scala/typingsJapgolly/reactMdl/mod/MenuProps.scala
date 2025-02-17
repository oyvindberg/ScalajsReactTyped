package typingsJapgolly.reactMdl.mod

import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuProps
  extends StObject
     with HTMLProps[Any]
     with RippleComponent {
  
  var align: js.UndefOr[String] = js.undefined
  
  @JSName("target")
  var target_MenuProps: String
  
  var valign: js.UndefOr[String] = js.undefined
}
object MenuProps {
  
  inline def apply(target: String): MenuProps = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuProps]
  }
  
  extension [Self <: MenuProps](x: Self) {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setValign(value: String): Self = StObject.set(x, "valign", value.asInstanceOf[js.Any])
    
    inline def setValignUndefined: Self = StObject.set(x, "valign", js.undefined)
  }
}
