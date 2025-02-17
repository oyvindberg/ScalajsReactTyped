package typingsJapgolly.reactHighlight.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactHighlight.mod.HighlightProps
import typingsJapgolly.reactHighlight.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactHighlight {
  
  @JSImport("react-highlight", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def innerHTML(value: Boolean): this.type = set("innerHTML", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactHighlight.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HighlightProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
