package typingsJapgolly.reduxForm.components

import typingsJapgolly.reduxForm.libFormMod.FormProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GenericForm {
  
  inline def apply[FormData, P, ErrorType](): SharedBuilder_FormProps_557398575[
    typingsJapgolly.reduxForm.mod.GenericForm[FormData, P, ErrorType], 
    FormData, 
    P, 
    ErrorType
  ] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_FormProps_557398575[
    typingsJapgolly.reduxForm.mod.GenericForm[FormData, P, ErrorType], 
    FormData, 
    P, 
    ErrorType
  ](js.Array(this.component, __props.asInstanceOf[FormProps[FormData, P, ErrorType]]))
  }
  
  @JSImport("redux-form", "GenericForm")
  @js.native
  val component: js.Object = js.native
  
  implicit def make[FormData, P, ErrorType](companion: GenericForm.type): SharedBuilder_FormProps_557398575[
    typingsJapgolly.reduxForm.mod.GenericForm[FormData, P, ErrorType], 
    FormData, 
    P, 
    ErrorType
  ] = new SharedBuilder_FormProps_557398575[
    typingsJapgolly.reduxForm.mod.GenericForm[FormData, P, ErrorType], 
    FormData, 
    P, 
    ErrorType
  ](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[FormData, P, ErrorType](p: FormProps[FormData, P, ErrorType]): SharedBuilder_FormProps_557398575[
    typingsJapgolly.reduxForm.mod.GenericForm[FormData, P, ErrorType], 
    FormData, 
    P, 
    ErrorType
  ] = new SharedBuilder_FormProps_557398575[
    typingsJapgolly.reduxForm.mod.GenericForm[FormData, P, ErrorType], 
    FormData, 
    P, 
    ErrorType
  ](js.Array(this.component, p.asInstanceOf[js.Any]))
}
