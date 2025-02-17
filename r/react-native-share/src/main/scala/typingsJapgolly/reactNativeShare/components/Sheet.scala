package typingsJapgolly.reactNativeShare.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactNativeShare.sheetMod.SheetProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sheet {
  
  inline def apply(visible: Boolean): Default[typingsJapgolly.reactNativeShare.mod.Sheet] = {
    val __props = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    new Default[typingsJapgolly.reactNativeShare.mod.Sheet](js.Array(this.component, __props.asInstanceOf[SheetProps]))
  }
  
  @JSImport("react-native-share", "Sheet")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: SheetProps): Default[typingsJapgolly.reactNativeShare.mod.Sheet] = new Default[typingsJapgolly.reactNativeShare.mod.Sheet](js.Array(this.component, p.asInstanceOf[js.Any]))
}
