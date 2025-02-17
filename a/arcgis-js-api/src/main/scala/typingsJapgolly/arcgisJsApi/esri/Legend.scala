package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Legend
  extends StObject
     with Widget_ {
  
  /**
    * Collection of [ActiveLayerInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html) objects used by the legend view to display data in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#activeLayerInfos)
    */
  var activeLayerInfos: Collection[ActiveLayerInfo] = js.native
  
  /**
    * Indicates whether to show the [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html) layers in the Legend.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#basemapLegendVisible)
    */
  var basemapLegendVisible: Boolean = js.native
  
  /**
    * Indicates the heading level to use for the legend title.
    *
    * @default 3
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#headingLevel)
    */
  var headingLevel: Double = js.native
  
  /**
    * When `true`, layers will only be shown in the legend if they are visible in the view's extent.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#hideLayersNotInCurrentView)
    */
  var hideLayersNotInCurrentView: Boolean = js.native
  
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#iconClass)
    */
  var iconClass: String = js.native
  
  /**
    * Specifies a subset of the layers to display in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#layerInfos)
    */
  var layerInfos: js.Array[LegendLayerInfos] = js.native
  
  /**
    * Determines whether to respect the properties of the layers in the map that control the legend's visibility (`minScale`, `maxScale`, `legendEnabled`).
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#respectLayerVisibility)
    */
  var respectLayerVisibility: Boolean = js.native
  
  /**
    * Indicates the style of the legend.
    *
    * @default classic
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#style)
    */
  var style: String | LegendStyle = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#view)
    */
  var view: MapView | SceneView = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#viewModel)
    */
  var viewModel: LegendViewModel = js.native
}
