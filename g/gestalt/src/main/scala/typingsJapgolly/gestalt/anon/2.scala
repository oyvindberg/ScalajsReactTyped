package typingsJapgolly.gestalt.anon

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var event: ReactEventFrom[HTMLInputElement]
}
object `2` {
  
  inline def apply(event: ReactEventFrom[HTMLInputElement]): `2` = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setEvent(value: ReactEventFrom[HTMLInputElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
