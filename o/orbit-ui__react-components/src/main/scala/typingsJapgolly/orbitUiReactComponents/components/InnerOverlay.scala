package typingsJapgolly.orbitUiReactComponents.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ElementType
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.orbitUiReactComponents.distOverlaySrcOverlayMod.InnerOverlayProps
import typingsJapgolly.react.mod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InnerOverlay {
  
  inline def apply(show: Boolean): Builder = {
    val __props = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[InnerOverlayProps]))
  }
  
  @JSImport("@orbit-ui/react-components", "InnerOverlay")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def as(value: ElementType): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def borderOffset(value: String | Double): this.type = set("borderOffset", value.asInstanceOf[js.Any])
    
    inline def containerElement(value: HTMLElement): this.type = set("containerElement", value.asInstanceOf[js.Any])
    
    inline def forwardedRef(value: ForwardedRef[Any]): this.type = set("forwardedRef", value.asInstanceOf[js.Any])
    
    inline def forwardedRefFunction1(value: /* instance */ Any | Null => Callback): this.type = set("forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
    
    inline def forwardedRefNull: this.type = set("forwardedRef", null)
    
    inline def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: InnerOverlayProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
