package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.ForceCircle
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import typingsJapgolly.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledPinHead {
  
  inline def apply[C /* <: ElementType */](
    $background: String,
    $forceCircle: Boolean,
    $gridTemplateColumns: String,
    $height: Double,
    $type: String
  ): Builder[C] = {
    val __props = js.Dynamic.literal($background = $background.asInstanceOf[js.Any], $forceCircle = $forceCircle.asInstanceOf[js.Any], $gridTemplateColumns = $gridTemplateColumns.asInstanceOf[js.Any], $height = $height.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any])
    new Builder[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, ForceCircle])]))
  }
  
  @JSImport("baseui/map-marker/styled-components", "StyledPinHead")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[C /* <: ElementType */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def $as(value: C): this.type = set("$as", value.asInstanceOf[js.Any])
    
    inline def $style(value: StyleObject | (js.Function1[ForceCircle, StyleObject])): this.type = set("$style", value.asInstanceOf[js.Any])
    
    inline def $styleFunction1(value: ForceCircle => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, ForceCircle])): Builder[C] = new Builder[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
