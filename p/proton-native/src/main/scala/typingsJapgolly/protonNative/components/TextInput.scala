package typingsJapgolly.protonNative.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.protonNative.anon.H
import typingsJapgolly.protonNative.anon.X
import typingsJapgolly.protonNative.mod.TextInputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextInput {
  
  @JSImport("proton-native", "TextInput")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.protonNative.mod.TextInput] {
    
    inline def align(value: H): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def children(value: String): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def column(value: Double): this.type = set("column", value.asInstanceOf[js.Any])
    
    inline def enabled(value: Boolean): this.type = set("enabled", value.asInstanceOf[js.Any])
    
    inline def expand(value: H): this.type = set("expand", value.asInstanceOf[js.Any])
    
    inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def multiline(value: Boolean): this.type = set("multiline", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* text */ String => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* text */ String) => value(t0).runNow()))
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def row(value: Double): this.type = set("row", value.asInstanceOf[js.Any])
    
    inline def secure(value: Boolean): this.type = set("secure", value.asInstanceOf[js.Any])
    
    inline def span(value: X): this.type = set("span", value.asInstanceOf[js.Any])
    
    inline def stretchy(value: Boolean): this.type = set("stretchy", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TextInput.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TextInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
