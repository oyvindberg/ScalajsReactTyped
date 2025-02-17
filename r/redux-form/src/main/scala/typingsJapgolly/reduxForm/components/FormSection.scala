package typingsJapgolly.reduxForm.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reduxForm.libFormSectionMod.FormSectionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsJapgolly.reduxForm.libFormSectionMod.FormSectionProps[P] & P because: IArray(Could't extract props from P because couldn't resolve ClassTree.) */
object FormSection {
  
  def apply[P](p: FormSectionProps[P] & P): Builder[P] = new Builder[P](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("redux-form", "FormSection")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[P] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reduxForm.mod.FormSection[P]]
  
  implicit def make[P](companion: FormSection.type): Builder[P] = new Builder[P](js.Array(this.component, js.Dictionary.empty))()
}
