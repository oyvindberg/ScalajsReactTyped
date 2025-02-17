package typingsJapgolly.mobxReactDevtools.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.mobxReactDevtools.anon.HighlightTimeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UpdatesControl {
  
  @JSImport("mobx-react-devtools", "UpdatesControl")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.mobxReactDevtools.mod.UpdatesControl] {
    
    inline def highlightTimeout(value: Double): this.type = set("highlightTimeout", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: UpdatesControl.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HighlightTimeout): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
