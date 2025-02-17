package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactNative.libActionSheetAndroidContainerMod.ActionSheetNativeProps
import typingsJapgolly.antDesignReactNative.libActionSheetAndroidContainerMod.default
import typingsJapgolly.antDesignReactNative.libActionSheetStyleMod.ActionSheetStyle
import typingsJapgolly.reactNative.mod.ActionSheetIOSOptions
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AndroidContainer {
  
  inline def apply(config: ActionSheetIOSOptions): Builder = {
    val __props = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ActionSheetNativeProps]))
  }
  
  @JSImport("@ant-design/react-native/lib/action-sheet/AndroidContainer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def callback(value: /* index */ Double => Callback): this.type = set("callback", js.Any.fromFunction1((t0: /* index */ Double) => value(t0).runNow()))
    
    inline def onAnimationEnd(value: /* visible */ Boolean => Callback): this.type = set("onAnimationEnd", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
    
    inline def styles(value: Partial[ActionSheetStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ActionSheetNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
