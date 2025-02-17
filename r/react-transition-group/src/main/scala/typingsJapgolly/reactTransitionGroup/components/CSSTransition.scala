package typingsJapgolly.reactTransitionGroup.components

import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactTransitionGroup.csstransitionMod.CSSTransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object CSSTransition {
  
  def apply[Ref /* <: js.UndefOr[HTMLElement] */](p: CSSTransitionProps[Ref]): Builder[Ref] = new Builder[Ref](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-transition-group", "CSSTransition")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Ref /* <: js.UndefOr[HTMLElement] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactTransitionGroup.mod.CSSTransition[Ref]]
  
  implicit def make[Ref /* <: js.UndefOr[HTMLElement] */](companion: CSSTransition.type): Builder[Ref] = new Builder[Ref](js.Array(this.component, js.Dictionary.empty))()
}
