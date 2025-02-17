package typingsJapgolly.heremaps.H.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Polygon with a rectangular shape.
  */
@js.native
trait Rect
  extends StObject
     with Polygon {
  
  /**
    * To set the bounds of this rectangle.
    * @param bounds {H.geo.Rect}
    */
  def setBoundingBox(bounds: typingsJapgolly.heremaps.H.geo.Rect): Unit = js.native
}
