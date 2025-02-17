package typingsJapgolly.reactNativeMaterialMenu.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeMaterialMenu.mod.MenuDividerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MenuDivider {
  
  @JSImport("react-native-material-menu", "MenuDivider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeMaterialMenu.mod.MenuDivider] {
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MenuDivider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MenuDividerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
