package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.anon.`254`
import typingsJapgolly.baseui.progressBarTypesMod.Size
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledProgressBarRoundedSvg {
  
  inline def apply[C /* <: ElementType */]($size: Size): SharedBuilder_AsOverrideProps_1444424271[C] = {
    val __props = js.Dynamic.literal($size = $size.asInstanceOf[js.Any])
    new SharedBuilder_AsOverrideProps_1444424271[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, `254`])]))
  }
  
  @JSImport("baseui/progress-bar", "StyledProgressBarRoundedSvg")
  @js.native
  val component: js.Object = js.native
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, `254`])): SharedBuilder_AsOverrideProps_1444424271[C] = new SharedBuilder_AsOverrideProps_1444424271[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
