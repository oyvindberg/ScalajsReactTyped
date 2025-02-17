package typingsJapgolly.fluentuiUtilities.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiUtilities.libBaseComponentDottypesMod.IBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from TProps because couldn't resolve ClassTree. */
object BaseComponent {
  
  def apply[TProps /* <: IBaseProps[Any] */, TState](p: TProps): Builder[TProps, TState] = new Builder[TProps, TState](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@fluentui/utilities", "BaseComponent")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[TProps /* <: IBaseProps[Any] */, TState] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.fluentuiUtilities.mod.BaseComponent[TProps, TState]]
  
  implicit def make[TProps /* <: IBaseProps[Any] */, TState](companion: BaseComponent.type): Builder[TProps, TState] = new Builder[TProps, TState](js.Array(this.component, js.Dictionary.empty))()
}
