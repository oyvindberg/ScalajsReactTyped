package typingsJapgolly.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapbox-gl", "LngLat")
@js.native
open class LngLat protected ()
  extends StObject
     with _LngLatLike {
  def this(lng: Double, lat: Double) = this()
  
  /** Returns the approximate distance between a pair of coordinates in meters
    * Uses the Haversine Formula (from R.W. Sinnott, "Virtues of the Haversine", Sky and Telescope, vol. 68, no. 2, 1984, p. 159) */
  def distanceTo(lngLat: LngLat): Double = js.native
  
  var lat: Double = js.native
  
  var lng: Double = js.native
  
  /** Return a LngLat as an array */
  def toArray(): js.Array[Double] = js.native
  
  def toBounds(radius: Double): LngLatBounds = js.native
  
  /** Return a new LngLat object whose longitude is wrapped to the range (-180, 180). */
  def wrap(): LngLat = js.native
}
/* static members */
object LngLat {
  
  @JSImport("mapbox-gl", "LngLat")
  @js.native
  val ^ : js.Any = js.native
  
  inline def convert(input: LngLatLike): LngLat = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(input.asInstanceOf[js.Any]).asInstanceOf[LngLat]
}
