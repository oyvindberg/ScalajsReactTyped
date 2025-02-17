package typingsJapgolly.baseui.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.baseui.baseuiStrings.img
import typingsJapgolly.react.mod.ComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FlagDJImg {
  
  @JSImport("baseui/phone-input/flags", "FlagDJ_img")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: FlagDJImg.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ComponentProps[img]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
