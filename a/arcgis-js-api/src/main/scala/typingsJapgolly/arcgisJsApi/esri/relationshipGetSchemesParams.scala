package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.dark
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.default_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.light
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.mesh
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.multipatch
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.multipoint
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.point
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.polygon
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.polyline
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait relationshipGetSchemesParams
  extends StObject
     with Object {
  
  /**
    * The Esri basemap to pair with the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#getSchemes)
    */
  var basemap: js.UndefOr[String | Basemap] = js.undefined
  
  /**
    * If you have a non-Esri basemap (e.g.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#getSchemes)
    */
  var basemapTheme: js.UndefOr[light | dark] = js.undefined
  
  /**
    * The geometry type of the features to visualize.
    *
    * [Read more...](global.html#geometryType)
    */
  var geometryType: point | multipoint | polyline | polygon | mesh | multipatch
  
  /**
    * Determines which set of primary and secondary color schemes to return.
    *
    * @default default
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#getSchemes)
    */
  var theme: js.UndefOr[default_] = js.undefined
  
  /**
    * The SceneView instance in which the scheme will be used.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[SceneView] = js.undefined
  
  /**
    * Indicates if the size units of the scheme will be in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#getSchemes)
    */
  var worldScale: js.UndefOr[Boolean] = js.undefined
}
object relationshipGetSchemesParams {
  
  inline def apply(
    constructor: js.Function,
    geometryType: point | multipoint | polyline | polygon | mesh | multipatch,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): relationshipGetSchemesParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], geometryType = geometryType.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[relationshipGetSchemesParams]
  }
  
  extension [Self <: relationshipGetSchemesParams](x: Self) {
    
    inline def setBasemap(value: String | Basemap): Self = StObject.set(x, "basemap", value.asInstanceOf[js.Any])
    
    inline def setBasemapTheme(value: light | dark): Self = StObject.set(x, "basemapTheme", value.asInstanceOf[js.Any])
    
    inline def setBasemapThemeUndefined: Self = StObject.set(x, "basemapTheme", js.undefined)
    
    inline def setBasemapUndefined: Self = StObject.set(x, "basemap", js.undefined)
    
    inline def setGeometryType(value: point | multipoint | polyline | polygon | mesh | multipatch): Self = StObject.set(x, "geometryType", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: default_): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setView(value: SceneView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setWorldScale(value: Boolean): Self = StObject.set(x, "worldScale", value.asInstanceOf[js.Any])
    
    inline def setWorldScaleUndefined: Self = StObject.set(x, "worldScale", js.undefined)
  }
}
