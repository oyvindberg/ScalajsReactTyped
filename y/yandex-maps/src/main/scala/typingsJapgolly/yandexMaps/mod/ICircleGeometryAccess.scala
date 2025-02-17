package typingsJapgolly.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICircleGeometryAccess
  extends StObject
     with IFreezable {
  
  def contains(position: js.Array[Double]): Boolean = js.native
  
  def getClosest(anchorPosition: js.Array[Double]): js.Object = js.native
  
  def getCoordinates(): js.Array[Double] | Null = js.native
  
  def getRadius(): Double = js.native
  
  def setCoordinates(): this.type = js.native
  def setCoordinates(coordinates: js.Array[Double]): this.type = js.native
  
  def setRadius(radius: Double): this.type = js.native
}
