package typingsJapgolly.reactMdl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RippleComponent extends StObject {
  
  var ripple: js.UndefOr[Boolean] = js.undefined
}
object RippleComponent {
  
  inline def apply(): RippleComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RippleComponent]
  }
  
  extension [Self <: RippleComponent](x: Self) {
    
    inline def setRipple(value: Boolean): Self = StObject.set(x, "ripple", value.asInstanceOf[js.Any])
    
    inline def setRippleUndefined: Self = StObject.set(x, "ripple", js.undefined)
  }
}
