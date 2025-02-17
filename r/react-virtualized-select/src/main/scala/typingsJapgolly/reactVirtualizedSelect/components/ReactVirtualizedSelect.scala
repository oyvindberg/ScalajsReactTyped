package typingsJapgolly.reactVirtualizedSelect.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactVirtualizedSelect.mod.VirtualizedSelectProps
import typingsJapgolly.reactVirtualizedSelect.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for (/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReactCreatableSelectProps<TValue> * / scala.Any) & typingsJapgolly.reactVirtualizedSelect.mod.AdditionalVirtualizedSelectProps[TValue] & typingsJapgolly.reactVirtualizedSelect.anon.Async because: IArray(Could't extract props from / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReactCreatableSelectProps<TValue> * / scala.Any because couldn't resolve ClassTree.), Couldn't find props for (/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReactCreatableSelectProps<TValue> * / scala.Any) & typingsJapgolly.reactVirtualizedSelect.mod.AdditionalVirtualizedSelectProps[TValue] because: IArray(Could't extract props from / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReactCreatableSelectProps<TValue> * / scala.Any because couldn't resolve ClassTree.) */
object ReactVirtualizedSelect {
  
  def apply[TValue](p: VirtualizedSelectProps[TValue]): Builder[TValue] = new Builder[TValue](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-virtualized-select", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[TValue] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default[TValue]]
  
  implicit def make[TValue](companion: ReactVirtualizedSelect.type): Builder[TValue] = new Builder[TValue](js.Array(this.component, js.Dictionary.empty))()
}
