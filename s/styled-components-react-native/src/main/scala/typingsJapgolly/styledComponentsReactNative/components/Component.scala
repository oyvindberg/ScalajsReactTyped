package typingsJapgolly.styledComponentsReactNative.components

import typingsJapgolly.StBuildingComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from C because couldn't resolve ClassTree. */
object Component {
  
  def apply[C /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyStyledComponent */ Any */](p: C): Builder[C] = new Builder[C](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("styled-components/native", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[C /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyStyledComponent */ Any */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  implicit def make[C /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyStyledComponent */ Any */](companion: Component.type): Builder[C] = new Builder[C](js.Array(this.component, js.Dictionary.empty))()
}
