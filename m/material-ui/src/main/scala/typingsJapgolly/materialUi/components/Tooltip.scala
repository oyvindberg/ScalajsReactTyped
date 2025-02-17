package typingsJapgolly.materialUi.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.MaterialUI.propTypes.tooltipHorizontal
import typingsJapgolly.materialUi.MaterialUI.propTypes.vertical
import typingsJapgolly.materialUi.internalTooltipMod.TooltipProps
import typingsJapgolly.materialUi.internalTooltipMod.default
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tooltip {
  
  inline def apply(label: Any): Builder = {
    val __props = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TooltipProps]))
  }
  
  @JSImport("material-ui/internal/Tooltip", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def horizontalPosition(value: tooltipHorizontal): this.type = set("horizontalPosition", value.asInstanceOf[js.Any])
    
    inline def show(value: Boolean): this.type = set("show", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def touch(value: Boolean): this.type = set("touch", value.asInstanceOf[js.Any])
    
    inline def verticalPosition(value: vertical): this.type = set("verticalPosition", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TooltipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
