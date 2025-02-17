package typingsJapgolly.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.navermaps.naver.maps.Bounds because Already inherited */ @js.native
trait LatLngBounds
  extends StObject
     with PointBounds {
  
  def east(): Double = js.native
  
  def getNE(): LatLng = js.native
  
  def getSW(): LatLng = js.native
  
  def hasLatLng(latlng: Coord): Boolean = js.native
  def hasLatLng(latlng: LatLngLiteral): Boolean = js.native
  
  def north(): Double = js.native
  
  def south(): Double = js.native
  
  def toPointBounds(): PointBounds = js.native
  
  def west(): Double = js.native
}
