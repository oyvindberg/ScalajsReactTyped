package typingsJapgolly.materializecssMaterialize.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@materializecss/materialize.M.Pushpin, 'destroy'> */
trait PickPushpindestroy extends StObject {
  
  def destroy(): Unit
  @JSName("destroy")
  var destroy_Original: js.Function0[Unit]
}
object PickPushpindestroy {
  
  inline def apply(destroy: Callback): PickPushpindestroy = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn)
    __obj.asInstanceOf[PickPushpindestroy]
  }
  
  extension [Self <: PickPushpindestroy](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
  }
}
