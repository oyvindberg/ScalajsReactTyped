package typingsJapgolly.reactMdForm.components

import org.scalajs.dom.HTMLLIElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdForm.typesMenuMenuItemInputToggleMod.StrictMenuItemInputToggleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object MenuItemInputToggle {
  
  def apply(p: StrictMenuItemInputToggleProps & RefAttributes[HTMLLIElement]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@react-md/form", "MenuItemInputToggle")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: MenuItemInputToggle.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
}
