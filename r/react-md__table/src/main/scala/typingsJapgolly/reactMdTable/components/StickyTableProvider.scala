package typingsJapgolly.reactMdTable.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StickyTableProvider {
  
  inline def apply(value: Boolean): Default[js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[Boolean]]))
  }
  
  @JSImport("@react-md/table/types/sticky", "StickyTableProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ProviderProps[Boolean]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
