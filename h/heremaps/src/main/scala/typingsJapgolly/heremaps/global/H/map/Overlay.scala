package typingsJapgolly.heremaps.global.H.map

import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.heremaps.H.map.Overlay.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents an overlay, which offers a bitmap that covers a geographical reactangular area on the map.
  */
@JSGlobal("H.map.Overlay")
@js.native
open class Overlay protected ()
  extends StObject
     with typingsJapgolly.heremaps.H.map.Overlay {
  /**
    * Constructor
    * @param bounds {H.geo.Rect} - The geographical reactangular area of this overlay
    * @param bitmap {!(string | HTMLImageElement | HTMLCanvasElement)} - Either an image URL, a SVG markup, an image or a canvas.
    * @param opt_options {H.map.Overlay.Options=} - Optional values values to initialize this overlay
    */
  def this(bounds: typingsJapgolly.heremaps.H.geo.Rect, bitmap: String) = this()
  def this(bounds: typingsJapgolly.heremaps.H.geo.Rect, bitmap: HTMLCanvasElement) = this()
  def this(bounds: typingsJapgolly.heremaps.H.geo.Rect, bitmap: HTMLImageElement) = this()
  def this(bounds: typingsJapgolly.heremaps.H.geo.Rect, bitmap: String, opt_options: Options) = this()
  def this(bounds: typingsJapgolly.heremaps.H.geo.Rect, bitmap: HTMLCanvasElement, opt_options: Options) = this()
  def this(bounds: typingsJapgolly.heremaps.H.geo.Rect, bitmap: HTMLImageElement, opt_options: Options) = this()
}
