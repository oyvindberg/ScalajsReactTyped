package typingsJapgolly.wordpressComponents.components

import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.wordpressComponents.navigableContainerMenuMod.NavigableMenu.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Menu {
  
  @JSImport("@wordpress/components/navigable-container/menu", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Menu.type): SharedBuilder_Props_1612777071[HTMLDivElement] = new SharedBuilder_Props_1612777071[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): SharedBuilder_Props_1612777071[HTMLDivElement] = new SharedBuilder_Props_1612777071[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
