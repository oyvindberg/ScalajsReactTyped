package typingsJapgolly.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An overlay made up of one or more points, forming a closed shape.
  */
@js.native
trait PolygonOverlay
  extends StObject
     with Overlay {
  
  /**
    * One or more arrays of coordinates that define the polygon overlay shape.
    */
  var points: js.Array[Coordinate] = js.native
}
