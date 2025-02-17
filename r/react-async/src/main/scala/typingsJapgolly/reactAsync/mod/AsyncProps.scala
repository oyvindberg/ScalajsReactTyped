package typingsJapgolly.reactAsync.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncProps[T]
  extends StObject
     with AsyncOptions[T] {
  
  var children: js.UndefOr[AsyncChildren[T]] = js.undefined
}
object AsyncProps {
  
  inline def apply[T](): AsyncProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncProps[T]]
  }
  
  extension [Self <: AsyncProps[?], T](x: Self & AsyncProps[T]) {
    
    inline def setChildren(value: AsyncChildren[T]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenFunction1(value: /* state */ AsyncState[T, AbstractState[T]] => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
  }
}
