package typingsJapgolly.reactBurgerMenu.components

import typingsJapgolly.reactBurgerMenu.mod.Props
import typingsJapgolly.reactBurgerMenu.mod.slide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slide {
  
  @JSImport("react-burger-menu", "slide")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Slide.type): SharedBuilder_Props_1809302565[slide] = new SharedBuilder_Props_1809302565[slide](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): SharedBuilder_Props_1809302565[slide] = new SharedBuilder_Props_1809302565[slide](js.Array(this.component, p.asInstanceOf[js.Any]))
}
