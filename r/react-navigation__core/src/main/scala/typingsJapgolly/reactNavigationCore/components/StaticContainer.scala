package typingsJapgolly.reactNavigationCore.components

import typingsJapgolly.StBuildingComponent.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from / * props * / scala.Any because couldn't resolve ClassTree. */
object StaticContainer {
  
  def apply(p: /* props */ Any): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@react-navigation/core/lib/typescript/src/StaticContainer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: StaticContainer.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
}
