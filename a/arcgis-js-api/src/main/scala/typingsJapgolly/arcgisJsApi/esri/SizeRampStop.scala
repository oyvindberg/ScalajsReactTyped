package typingsJapgolly.arcgisJsApi.esri

import org.scalajs.dom.HTMLElement
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeRampStop
  extends StObject
     with Object {
  
  /**
    * The label in the legend describing features with the given `symbol` and `value`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SizeRampStop)
    */
  var label: String
  
  /**
    * The width of the outline in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SizeRampStop)
    */
  var outlineSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The HTML element rendered in the legend representing features with the given value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SizeRampStop)
    */
  var preview: js.UndefOr[HTMLElement] = js.undefined
  
  /**
    * The size of the visual variable [stop](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html#stops) in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SizeRampStop)
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * The symbol corresponding to the value of the stop in the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SizeRampStop)
    */
  var symbol: Symbol
  
  /**
    * The value of the size visual variable [stop](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#stops).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SizeRampStop)
    */
  var value: js.UndefOr[Any] = js.undefined
}
object SizeRampStop {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    label: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    symbol: Symbol
  ): SizeRampStop = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), label = label.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeRampStop]
  }
  
  extension [Self <: SizeRampStop](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOutlineSize(value: Double): Self = StObject.set(x, "outlineSize", value.asInstanceOf[js.Any])
    
    inline def setOutlineSizeUndefined: Self = StObject.set(x, "outlineSize", js.undefined)
    
    inline def setPreview(value: HTMLElement): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSymbol(value: Symbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
