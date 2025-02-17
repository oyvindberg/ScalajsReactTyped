package typingsJapgolly.reactBurgerMenu.components

import typingsJapgolly.reactBurgerMenu.mod.Props
import typingsJapgolly.reactBurgerMenu.mod.pushRotate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PushRotate {
  
  @JSImport("react-burger-menu", "pushRotate")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: PushRotate.type): SharedBuilder_Props_1809302565[pushRotate] = new SharedBuilder_Props_1809302565[pushRotate](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): SharedBuilder_Props_1809302565[pushRotate] = new SharedBuilder_Props_1809302565[pushRotate](js.Array(this.component, p.asInstanceOf[js.Any]))
}
