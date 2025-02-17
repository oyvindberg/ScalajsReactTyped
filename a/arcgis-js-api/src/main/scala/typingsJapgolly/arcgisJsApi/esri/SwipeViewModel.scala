package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.disabled
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.horizontal
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.ready
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwipeViewModel
  extends StObject
     with Accessor {
  
  /**
    * The direction the Swipe widget moves across the view.
    *
    * @default "horizontal"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html#direction)
    */
  var direction: horizontal | vertical = js.native
  
  /**
    * A collection of [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html)s that will show on the left or top side of Swipe widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html#leadingLayers)
    */
  var leadingLayers: Collection[Layer] = js.native
  
  /**
    * The position of the Swipe widget.
    *
    * @default 25
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html#position)
    */
  var position: Double = js.native
  
  /**
    * The current state of the widget.
    *
    * @default disabled
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html#state)
    */
  val state: disabled | ready = js.native
  
  /**
    * A collection of [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html)s that will show on the right or bottom side of Swipe widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html#trailingLayers)
    */
  var trailingLayers: Collection[Layer] = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html#view)
    */
  var view: MapView = js.native
}
