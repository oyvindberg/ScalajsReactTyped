package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerListVisibleElements
  extends StObject
     with Object {
  
  /**
    * Indicates whether the status indicators will be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#VisibleElements)
    */
  var statusIndicators: js.UndefOr[Boolean] = js.undefined
}
object LayerListVisibleElements {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): LayerListVisibleElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[LayerListVisibleElements]
  }
  
  extension [Self <: LayerListVisibleElements](x: Self) {
    
    inline def setStatusIndicators(value: Boolean): Self = StObject.set(x, "statusIndicators", value.asInstanceOf[js.Any])
    
    inline def setStatusIndicatorsUndefined: Self = StObject.set(x, "statusIndicators", js.undefined)
  }
}
