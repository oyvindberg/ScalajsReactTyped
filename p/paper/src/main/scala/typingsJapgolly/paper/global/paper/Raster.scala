package typingsJapgolly.paper.global.paper

import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * The Raster item represents an image in a Paper.js project.
  */
@JSGlobal("paper.Raster")
@js.native
/** 
  * Creates a new raster item from the passed argument, and places it in the
  * active layer. `source` can either be a DOM Image, a Canvas, or a string
  * describing the URL to load the image from, or the ID of a DOM element to
  * get the image from (either a DOM Image or a Canvas).
  * 
  * @param source - the source of
  *     the raster
  * @param position - the center position at which the raster item is
  *     placed
  */
open class Raster ()
  extends StObject
     with typingsJapgolly.paper.paper.Raster {
  /** 
    * Creates a new raster from an object description, and places it in the
    * active layer.
    * 
    * @param object - an object containing properties to be set on the
    *     raster
    */
  def this(`object`: js.Object) = this()
  /** 
    * Creates a new empty raster of the given size, and places it in the
    * active layer.
    * 
    * @param size - the size of the raster
    * @param position - the center position at which the raster item is
    *     placed
    */
  def this(size: typingsJapgolly.paper.paper.Size) = this()
  def this(source: String) = this()
  def this(source: HTMLCanvasElement) = this()
  def this(source: HTMLImageElement) = this()
  def this(size: typingsJapgolly.paper.paper.Size, position: typingsJapgolly.paper.paper.Point) = this()
  def this(source: String, position: typingsJapgolly.paper.paper.Point) = this()
  def this(source: HTMLCanvasElement, position: typingsJapgolly.paper.paper.Point) = this()
  def this(source: HTMLImageElement, position: typingsJapgolly.paper.paper.Point) = this()
  def this(source: Unit, position: typingsJapgolly.paper.paper.Point) = this()
}
