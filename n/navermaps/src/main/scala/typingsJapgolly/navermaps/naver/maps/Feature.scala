package typingsJapgolly.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Feature
  extends StObject
     with KVO {
  
  def forEachOverlay(callback: forEachOverlayCallback): Unit = js.native
  
  def getBounds(): Bounds = js.native
  
  def getGeometries(): js.Array[Geometry] = js.native
  
  def getId(): String = js.native
  
  def getOverlays(): js.Array[Marker | Polygon | Polyline] = js.native
  
  def getProperty(name: String): Any = js.native
  
  def getRaw(): GeoJSON = js.native
  
  def setProperty(name: String, value: Any): Unit = js.native
  
  def setStyle(styleOptions: StyleOptions): Unit = js.native
}
