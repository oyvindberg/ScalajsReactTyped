package typingsJapgolly.reactNativeFbsdk.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeFbsdk.mod.ShareButtonProps
import typingsJapgolly.reactNativeFbsdk.mod.ShareContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShareButton {
  
  inline def apply(shareContent: ShareContent): Builder = {
    val __props = js.Dynamic.literal(shareContent = shareContent.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ShareButtonProps]))
  }
  
  @JSImport("react-native-fbsdk", "ShareButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeFbsdk.mod.ShareButton] {
    
    inline def style(value: ViewStyle): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ShareButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
