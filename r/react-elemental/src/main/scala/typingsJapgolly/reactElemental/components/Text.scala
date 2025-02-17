package typingsJapgolly.reactElemental.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactElemental.mod.TextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Text {
  
  @JSImport("react-elemental", "Text")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactElemental.mod.Text] {
    
    inline def bold(value: Boolean): this.type = set("bold", value.asInstanceOf[js.Any])
    
    inline def center(value: Boolean): this.type = set("center", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    
    inline def right(value: Boolean): this.type = set("right", value.asInstanceOf[js.Any])
    
    inline def secondary(value: Boolean): this.type = set("secondary", value.asInstanceOf[js.Any])
    
    inline def size(value: String): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def uppercase(value: Boolean): this.type = set("uppercase", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Text.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TextProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
