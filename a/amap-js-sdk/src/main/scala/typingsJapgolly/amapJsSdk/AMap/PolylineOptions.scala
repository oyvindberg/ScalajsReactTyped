package typingsJapgolly.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolylineOptions extends StObject {
  
  var extData: js.UndefOr[Any] = js.undefined
  
  var geodesic: js.UndefOr[Boolean] = js.undefined
  
  var isOutline: js.UndefOr[Boolean] = js.undefined
  
  var map: js.UndefOr[Map] = js.undefined
  
  var outlineColor: js.UndefOr[String] = js.undefined
  
  var path: js.UndefOr[js.Array[LngLat]] = js.undefined
  
  var strokeColor: js.UndefOr[String] = js.undefined
  
  var strokeDasharray: js.UndefOr[js.Array[Double]] = js.undefined
  
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  
  var strokeStyle: js.UndefOr[String] = js.undefined
  
  var strokeWeight: js.UndefOr[Double] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object PolylineOptions {
  
  inline def apply(): PolylineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolylineOptions]
  }
  
  extension [Self <: PolylineOptions](x: Self) {
    
    inline def setExtData(value: Any): Self = StObject.set(x, "extData", value.asInstanceOf[js.Any])
    
    inline def setExtDataUndefined: Self = StObject.set(x, "extData", js.undefined)
    
    inline def setGeodesic(value: Boolean): Self = StObject.set(x, "geodesic", value.asInstanceOf[js.Any])
    
    inline def setGeodesicUndefined: Self = StObject.set(x, "geodesic", js.undefined)
    
    inline def setIsOutline(value: Boolean): Self = StObject.set(x, "isOutline", value.asInstanceOf[js.Any])
    
    inline def setIsOutlineUndefined: Self = StObject.set(x, "isOutline", js.undefined)
    
    inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setOutlineColor(value: String): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
    
    inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
    
    inline def setPath(value: js.Array[LngLat]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPathVarargs(value: LngLat*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    inline def setStrokeDasharray(value: js.Array[Double]): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
    
    inline def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
    
    inline def setStrokeDasharrayVarargs(value: Double*): Self = StObject.set(x, "strokeDasharray", js.Array(value*))
    
    inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    inline def setStrokeStyle(value: String): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
    
    inline def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
    
    inline def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
    
    inline def setStrokeWeightUndefined: Self = StObject.set(x, "strokeWeight", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
