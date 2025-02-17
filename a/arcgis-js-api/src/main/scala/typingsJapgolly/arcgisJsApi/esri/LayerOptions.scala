package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerOptions
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Applicable to [Imagery Layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html).
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-LayerOptions.html#returnTopmostRaster)
    */
  var returnTopmostRaster: Boolean = js.native
  
  /**
    * Applicable to [Imagery Layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html).
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-LayerOptions.html#showNoDataRecords)
    */
  var showNoDataRecords: Boolean = js.native
}
