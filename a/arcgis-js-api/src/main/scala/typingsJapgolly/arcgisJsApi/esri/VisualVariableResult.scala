package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualVariableResult
  extends StObject
     with Object {
  
  /**
    * Authoring information related to the creation of the visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#VisualVariableResult)
    */
  var authoringInfo: AuthoringInfo
  
  /**
    * The ID of the basemap used to determine the optimal fill color of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#VisualVariableResult)
    */
  var basemapId: String
  
  /**
    * Indicates whether the average color of the input view's basemap is `light` or `dark`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#VisualVariableResult)
    */
  var basemapTheme: String
  
  /**
    * The color scheme used by the visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#VisualVariableResult)
    */
  var colorScheme: ColorScheme
  
  /**
    * Indicates whether default values are used in the absence of sufficient data and/or statistics from the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#VisualVariableResult)
    */
  var defaultValuesUsed: Boolean
  
  /**
    * Basic statistics returned from a query to the service for the given field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#VisualVariableResult)
    */
  var statistics: SummaryStatisticsResult
  
  /**
    * A color visual variable configured based on the statistics of the data and the view's background.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#VisualVariableResult)
    */
  var visualVariable: ColorVariable
}
object VisualVariableResult {
  
  inline def apply(
    authoringInfo: AuthoringInfo,
    basemapId: String,
    basemapTheme: String,
    colorScheme: ColorScheme,
    constructor: js.Function,
    defaultValuesUsed: Boolean,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    statistics: SummaryStatisticsResult,
    visualVariable: ColorVariable
  ): VisualVariableResult = {
    val __obj = js.Dynamic.literal(authoringInfo = authoringInfo.asInstanceOf[js.Any], basemapId = basemapId.asInstanceOf[js.Any], basemapTheme = basemapTheme.asInstanceOf[js.Any], colorScheme = colorScheme.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], defaultValuesUsed = defaultValuesUsed.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), statistics = statistics.asInstanceOf[js.Any], visualVariable = visualVariable.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualVariableResult]
  }
  
  extension [Self <: VisualVariableResult](x: Self) {
    
    inline def setAuthoringInfo(value: AuthoringInfo): Self = StObject.set(x, "authoringInfo", value.asInstanceOf[js.Any])
    
    inline def setBasemapId(value: String): Self = StObject.set(x, "basemapId", value.asInstanceOf[js.Any])
    
    inline def setBasemapTheme(value: String): Self = StObject.set(x, "basemapTheme", value.asInstanceOf[js.Any])
    
    inline def setColorScheme(value: ColorScheme): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
    
    inline def setDefaultValuesUsed(value: Boolean): Self = StObject.set(x, "defaultValuesUsed", value.asInstanceOf[js.Any])
    
    inline def setStatistics(value: SummaryStatisticsResult): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    inline def setVisualVariable(value: ColorVariable): Self = StObject.set(x, "visualVariable", value.asInstanceOf[js.Any])
  }
}
