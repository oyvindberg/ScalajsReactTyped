package typingsJapgolly.stormReactDiagrams.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.stormReactDiagrams.distSrcWidgetsBaseWidgetMod.BaseWidgetProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object BaseWidget {
  
  def apply[P /* <: BaseWidgetProps */, S](p: P): Builder[P, S] = new Builder[P, S](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("storm-react-diagrams", "BaseWidget")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[P /* <: BaseWidgetProps */, S] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.stormReactDiagrams.mod.BaseWidget[P, S]]
  
  implicit def make[P /* <: BaseWidgetProps */, S](companion: BaseWidget.type): Builder[P, S] = new Builder[P, S](js.Array(this.component, js.Dictionary.empty))()
}
