package typingsJapgolly.reduxForm.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reduxForm.libFormNameMod.FormNameProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormName {
  
  inline def apply(children: typingsJapgolly.reduxForm.anon.Form => Node): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[FormNameProps]))
  }
  
  @JSImport("redux-form", "FormName")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: FormNameProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
