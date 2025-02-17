package typingsJapgolly.orbitUiReactComponents.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.ElementType
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.orbitUiReactComponents.distTileSrcTileGroupMod.InnerTileGroupProps
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.horizontal
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.multiple
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.none
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.single
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.vertical
import typingsJapgolly.react.mod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InnerTileGroup {
  
  @JSImport("@orbit-ui/react-components", "InnerTileGroup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def as(value: ElementType): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean | Double): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value*))
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def forwardedRef(value: ForwardedRef[Any]): this.type = set("forwardedRef", value.asInstanceOf[js.Any])
    
    inline def forwardedRefFunction1(value: /* instance */ Any | Null => Callback): this.type = set("forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
    
    inline def forwardedRefNull: this.type = set("forwardedRef", null)
    
    inline def onChange(value: (/* event */ ReactEventFrom[Element], /* value */ js.Array[String]) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[Element], t1: /* value */ js.Array[String]) => (value(t0, t1)).runNow()))
    
    inline def orientation(value: horizontal | vertical): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    inline def rowSize(value: Double): this.type = set("rowSize", value.asInstanceOf[js.Any])
    
    inline def selectionMode(value: none | single | multiple): this.type = set("selectionMode", value.asInstanceOf[js.Any])
    
    inline def value(value: js.Array[String]): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueNull: this.type = set("value", null)
    
    inline def valueVarargs(value: String*): this.type = set("value", js.Array(value*))
  }
  
  implicit def make(companion: InnerTileGroup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: InnerTileGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
