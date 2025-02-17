package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeatmapRampStop
  extends StObject
     with Object {
  
  /**
    * The color of the pixel corresponding to the appropriate pixel `ratio`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#HeatmapRampStop)
    */
  var color: Color_
  
  /**
    * The label of the color stop displayed in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#HeatmapRampStop)
    */
  var label: String
  
  /**
    * A number between `0` and `1` describing the position of the label on the ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#HeatmapRampStop)
    */
  var offset: Double
  
  /**
    * The ratio of a pixel's intensity value to the minPixelIntensity of the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#HeatmapRampStop)
    */
  var ratio: Double
}
object HeatmapRampStop {
  
  inline def apply(
    color: Color_,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    label: String,
    offset: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    ratio: Double
  ): HeatmapRampStop = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), label = label.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), ratio = ratio.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapRampStop]
  }
  
  extension [Self <: HeatmapRampStop](x: Self) {
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
  }
}
