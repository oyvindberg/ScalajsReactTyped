package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ForwardedRef
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFieldSrcErrorMessageMod {
  
  @JSImport("@orbit-ui/react-components/dist/field/src/ErrorMessage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/field/src/ErrorMessage", "ErrorMessage")
  @js.native
  val ErrorMessage: OrbitComponent[HTMLElement, InnerErrorMessageProps] = js.native
  
  inline def InnerErrorMessage(props: InnerErrorMessageProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerErrorMessage")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type ErrorMessageProps = ComponentProps[OrbitComponent[HTMLElement, InnerErrorMessageProps]]
  
  trait InnerErrorMessageProps extends StObject {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType] = js.undefined
    
    /**
      * @ignore
      */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
  }
  object InnerErrorMessageProps {
    
    inline def apply(): InnerErrorMessageProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerErrorMessageProps]
    }
    
    extension [Self <: InnerErrorMessageProps](x: Self) {
      
      inline def setAs(value: ElementType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Callback): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
    }
  }
}
