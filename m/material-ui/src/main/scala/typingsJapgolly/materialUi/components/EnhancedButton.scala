package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.internalEnhancedButtonMod.EnhancedButtonProps
import typingsJapgolly.materialUi.internalEnhancedButtonMod.default
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EnhancedButton {
  
  @JSImport("material-ui/internal/EnhancedButton", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def centerRipple(value: Boolean): this.type = set("centerRipple", value.asInstanceOf[js.Any])
    
    inline def containerElement(value: Node | String): this.type = set("containerElement", value.asInstanceOf[js.Any])
    
    inline def containerElementNull: this.type = set("containerElement", null)
    
    inline def containerElementVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("containerElement", js.Array(value*))
    
    inline def containerElementVdomElement(value: VdomElement): this.type = set("containerElement", value.rawElement.asInstanceOf[js.Any])
    
    inline def disableFocusRipple(value: Boolean): this.type = set("disableFocusRipple", value.asInstanceOf[js.Any])
    
    inline def disableKeyboardFocus(value: Boolean): this.type = set("disableKeyboardFocus", value.asInstanceOf[js.Any])
    
    inline def disableTouchRipple(value: Boolean): this.type = set("disableTouchRipple", value.asInstanceOf[js.Any])
    
    inline def focusRippleColor(value: String): this.type = set("focusRippleColor", value.asInstanceOf[js.Any])
    
    inline def focusRippleOpacity(value: Double): this.type = set("focusRippleOpacity", value.asInstanceOf[js.Any])
    
    inline def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
    
    inline def keyboardFocused(value: Boolean): this.type = set("keyboardFocused", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: ReactFocusEventFrom[js.Object & org.scalajs.dom.Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[js.Object & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onClick(value: ReactMouseEventFrom[js.Object & org.scalajs.dom.Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[js.Object & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onFocus(value: ReactFocusEventFrom[js.Object & org.scalajs.dom.Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[js.Object & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onKeyDown(value: ReactKeyboardEventFrom[js.Object & org.scalajs.dom.Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[js.Object & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onKeyUp(value: ReactKeyboardEventFrom[js.Object & org.scalajs.dom.Element] => Callback): this.type = set("onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[js.Object & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onKeyboardFocus(
      value: (/* e */ ReactFocusEventFrom[js.Object & org.scalajs.dom.Element], /* isKeyboardFocused */ Boolean) => Callback
    ): this.type = set("onKeyboardFocus", js.Any.fromFunction2((t0: /* e */ ReactFocusEventFrom[js.Object & org.scalajs.dom.Element], t1: /* isKeyboardFocused */ Boolean) => (value(t0, t1)).runNow()))
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def target(value: String): this.type = set("target", value.asInstanceOf[js.Any])
    
    inline def touchRippleColor(value: String): this.type = set("touchRippleColor", value.asInstanceOf[js.Any])
    
    inline def touchRippleOpacity(value: Double): this.type = set("touchRippleOpacity", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: EnhancedButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: EnhancedButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
