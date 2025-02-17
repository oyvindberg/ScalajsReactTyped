package typingsJapgolly.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The component for a menu item. `<li>`
  */
@js.native
trait MenuItem
  extends StObject
     with ClickableComponent {
  
  @JSName("options_")
  var options__MenuItem: MenuItemOptions = js.native
  
  /**
    * Set the state for this menu item as selected or not.
    *
    * @param selected
    *        if the menu item is selected or not
    */
  def selected(selected: Boolean): Unit = js.native
}
