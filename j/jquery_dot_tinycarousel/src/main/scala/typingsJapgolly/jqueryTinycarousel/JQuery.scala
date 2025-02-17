package typingsJapgolly.jqueryTinycarousel

import typingsJapgolly.jqueryTinycarousel.JQueryTinyCarousel.JQueryTinyCarouselOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  /**
    * Creates a new tinycarousel with the specified, or default, options.
    *
    * @param options The options
    */
  def tinycarousel(): JQuery = js.native
  def tinycarousel(options: JQueryTinyCarouselOptions): JQuery = js.native
  
  /**
    * Moves the tinycarousel to the specified block.
    *
    * @param index The index of the block to move to
    */
  def tinycarousel_move(index: Double): Unit = js.native
  
  /**
    * Starts the interval.
    */
  def tinycarousel_start(): Unit = js.native
  
  /**
    * Stops the interval.
    */
  def tinycarousel_stop(): Unit = js.native
}
