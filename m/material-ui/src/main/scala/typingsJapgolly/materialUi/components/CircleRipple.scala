package typingsJapgolly.materialUi.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.internalCircleRippleMod.CircleRippleProps
import typingsJapgolly.materialUi.internalCircleRippleMod.default
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CircleRipple {
  
  @JSImport("material-ui/internal/CircleRipple", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def aborted(value: Boolean): this.type = set("aborted", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def opacity(value: Double): this.type = set("opacity", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: CircleRipple.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CircleRippleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
