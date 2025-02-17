package typingsJapgolly.reactNative.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.ColorValue
import typingsJapgolly.reactNative.mod.StatusBarProps
import typingsJapgolly.reactNative.mod.StatusBarStyle
import typingsJapgolly.reactNative.reactNativeStrings.fade
import typingsJapgolly.reactNative.reactNativeStrings.none
import typingsJapgolly.reactNative.reactNativeStrings.slide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatusBar {
  
  @JSImport("react-native", "StatusBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNative.mod.StatusBar] {
    
    inline def animated(value: Boolean): this.type = set("animated", value.asInstanceOf[js.Any])
    
    inline def backgroundColor(value: ColorValue): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def barStyle(value: StatusBarStyle): this.type = set("barStyle", value.asInstanceOf[js.Any])
    
    inline def barStyleNull: this.type = set("barStyle", null)
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def networkActivityIndicatorVisible(value: Boolean): this.type = set("networkActivityIndicatorVisible", value.asInstanceOf[js.Any])
    
    inline def showHideTransition(value: fade | slide | none): this.type = set("showHideTransition", value.asInstanceOf[js.Any])
    
    inline def showHideTransitionNull: this.type = set("showHideTransition", null)
    
    inline def translucent(value: Boolean): this.type = set("translucent", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: StatusBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StatusBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
