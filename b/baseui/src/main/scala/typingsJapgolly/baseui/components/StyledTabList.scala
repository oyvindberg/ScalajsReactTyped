package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.FillOrientation
import typingsJapgolly.baseui.tabsMotionTypesMod.Fill
import typingsJapgolly.baseui.tabsMotionTypesMod.Orientation
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import typingsJapgolly.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledTabList {
  
  inline def apply[C /* <: ElementType */](): Builder[C] = {
    val __props = js.Dynamic.literal()
    new Builder[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, FillOrientation])]))
  }
  
  @JSImport("baseui/tabs-motion", "StyledTabList")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[C /* <: ElementType */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def $as(value: C): this.type = set("$as", value.asInstanceOf[js.Any])
    
    inline def $fill(value: Fill): this.type = set("$fill", value.asInstanceOf[js.Any])
    
    inline def $orientation(value: Orientation): this.type = set("$orientation", value.asInstanceOf[js.Any])
    
    inline def $style(value: StyleObject | (js.Function1[FillOrientation, StyleObject])): this.type = set("$style", value.asInstanceOf[js.Any])
    
    inline def $styleFunction1(value: FillOrientation => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  implicit def make[C /* <: ElementType */](companion: StyledTabList.type): Builder[C] = new Builder[C](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, FillOrientation])): Builder[C] = new Builder[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
