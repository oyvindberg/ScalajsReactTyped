package typingsJapgolly.reactScrollbar

import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollArea
  extends Component[ScrollAreaProps, js.Object, Any] {
  
  /**
    * Allows manual refreshing of the scrollbar.
    */
  def refresh(): Unit = js.native
  
  /**
    * Allows to scroll to the bottom of ScrollArea component.
    */
  def scrollBottom(): Unit = js.native
  
  /**
    * Allows to scroll to the left of ScrollArea component.
    */
  def scrollLeft(): Unit = js.native
  
  /**
    * Allows to scroll to the right of ScrollArea component.
    */
  def scrollRight(): Unit = js.native
  
  /**
    * Allows to scroll to the top of ScrollArea component.
    */
  def scrollTop(): Unit = js.native
  
  /**
    * Moves horizontal scrollbar.
    * leftPosition is a distance between left edge of scrollArea container and left edge of scrollArea content.
    */
  def scrollXTo(leftPosition: Double): Unit = js.native
  
  /**
    * Moves vertical scrollbar.
    * topPosition is a distance between the top of scrollArea container and the top of scrollArea content.
    */
  def scrollYTo(topPosition: Double): Unit = js.native
}
