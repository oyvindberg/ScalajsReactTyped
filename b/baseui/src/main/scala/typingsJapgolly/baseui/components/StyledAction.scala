package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.tagTypesMod.SharedPropsArg
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledAction {
  
  inline def apply[C /* <: ElementType */](): SharedBuilder_AsOverrideProps2050516390[C] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_AsOverrideProps2050516390[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, SharedPropsArg])]))
  }
  
  @JSImport("baseui/tag", "StyledAction")
  @js.native
  val component: js.Object = js.native
  
  implicit def make[C /* <: ElementType */](companion: StyledAction.type): SharedBuilder_AsOverrideProps2050516390[C] = new SharedBuilder_AsOverrideProps2050516390[C](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, SharedPropsArg])): SharedBuilder_AsOverrideProps2050516390[C] = new SharedBuilder_AsOverrideProps2050516390[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
