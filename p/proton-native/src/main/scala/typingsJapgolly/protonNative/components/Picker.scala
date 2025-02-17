package typingsJapgolly.protonNative.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.protonNative.anon.H
import typingsJapgolly.protonNative.anon.X
import typingsJapgolly.protonNative.mod.PickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Picker {
  
  @JSImport("proton-native", "Picker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.protonNative.mod.Picker] {
    
    inline def align(value: H): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def column(value: Double): this.type = set("column", value.asInstanceOf[js.Any])
    
    inline def editable(value: Boolean): this.type = set("editable", value.asInstanceOf[js.Any])
    
    inline def enabled(value: Boolean): this.type = set("enabled", value.asInstanceOf[js.Any])
    
    inline def expand(value: H): this.type = set("expand", value.asInstanceOf[js.Any])
    
    inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* text */ String => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* text */ String) => value(t0).runNow()))
    
    inline def onSelect(value: /* selection */ Double => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: /* selection */ Double) => value(t0).runNow()))
    
    inline def row(value: Double): this.type = set("row", value.asInstanceOf[js.Any])
    
    inline def selected(value: Double): this.type = set("selected", value.asInstanceOf[js.Any])
    
    inline def span(value: X): this.type = set("span", value.asInstanceOf[js.Any])
    
    inline def stretchy(value: Boolean): this.type = set("stretchy", value.asInstanceOf[js.Any])
    
    inline def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Picker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
