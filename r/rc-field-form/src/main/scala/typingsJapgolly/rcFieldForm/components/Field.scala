package typingsJapgolly.rcFieldForm.components

import typingsJapgolly.rcFieldForm.esFieldMod.FieldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Field {
  
  inline def apply[Values](): SharedBuilder_FieldProps1604101356[Values] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_FieldProps1604101356[Values](js.Array(this.component, __props.asInstanceOf[FieldProps[Values]]))
  }
  
  @JSImport("rc-field-form", "Field")
  @js.native
  val component: js.Object = js.native
  
  implicit def make[Values](companion: Field.type): SharedBuilder_FieldProps1604101356[Values] = new SharedBuilder_FieldProps1604101356[Values](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[Values](p: FieldProps[Values]): SharedBuilder_FieldProps1604101356[Values] = new SharedBuilder_FieldProps1604101356[Values](js.Array(this.component, p.asInstanceOf[js.Any]))
}
