package typingsJapgolly.baidumapWebSdk.global.BMap

import typingsJapgolly.baidumapWebSdk.BMap.Copyright
import typingsJapgolly.baidumapWebSdk.BMap.TrafficLayerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMap.TrafficLayer")
@js.native
open class TrafficLayer ()
  extends StObject
     with typingsJapgolly.baidumapWebSdk.BMap.TileLayer {
  def this(opts: TrafficLayerOptions) = this()
  
  /* CompleteClass */
  override def getCopyright(): Copyright = js.native
  
  /* CompleteClass */
  override def getTilesUrl(tileCoord: typingsJapgolly.baidumapWebSdk.BMap.Pixel, zoom: Double): String = js.native
  
  /* CompleteClass */
  override def isTransparentPng(): Boolean = js.native
}
