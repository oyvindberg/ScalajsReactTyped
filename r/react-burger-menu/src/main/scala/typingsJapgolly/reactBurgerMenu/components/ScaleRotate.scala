package typingsJapgolly.reactBurgerMenu.components

import typingsJapgolly.reactBurgerMenu.mod.Props
import typingsJapgolly.reactBurgerMenu.mod.scaleRotate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScaleRotate {
  
  @JSImport("react-burger-menu", "scaleRotate")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ScaleRotate.type): SharedBuilder_Props_1809302565[scaleRotate] = new SharedBuilder_Props_1809302565[scaleRotate](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): SharedBuilder_Props_1809302565[scaleRotate] = new SharedBuilder_Props_1809302565[scaleRotate](js.Array(this.component, p.asInstanceOf[js.Any]))
}
