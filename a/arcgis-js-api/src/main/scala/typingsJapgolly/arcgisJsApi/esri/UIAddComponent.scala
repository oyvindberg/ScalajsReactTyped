package typingsJapgolly.arcgisJsApi.esri

import org.scalajs.dom.HTMLElement
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`bottom-leading`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`bottom-left`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`bottom-right`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`bottom-trailing`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`top-leading`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`top-left`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`top-right`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`top-trailing`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.manual
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIAddComponent
  extends StObject
     with Object {
  
  /**
    * The component to add to the UI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#add)
    */
  var component: Widget_ | HTMLElement | String
  
  /**
    * The placement index of the component.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#add)
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * The position in the view at which to add the component.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#add)
    */
  var position: js.UndefOr[
    `bottom-leading` | `bottom-left` | `bottom-right` | `bottom-trailing` | `top-leading` | `top-left` | `top-right` | `top-trailing` | manual
  ] = js.undefined
}
object UIAddComponent {
  
  inline def apply(
    component: Widget_ | HTMLElement | String,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): UIAddComponent = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[UIAddComponent]
  }
  
  extension [Self <: UIAddComponent](x: Self) {
    
    inline def setComponent(value: Widget_ | HTMLElement | String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setPosition(
      value: `bottom-leading` | `bottom-left` | `bottom-right` | `bottom-trailing` | `top-leading` | `top-left` | `top-right` | `top-trailing` | manual
    ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
