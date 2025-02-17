package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintParameters
  extends StObject
     with Accessor {
  
  /**
    * Additional parameters for the print service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintParameters.html#extraParameters)
    */
  var extraParameters: Any = js.native
  
  /**
    * Specify the output spatial reference for the printout.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintParameters.html#outSpatialReference)
    */
  var outSpatialReference: SpatialReference = js.native
  
  /**
    * Defines the layout template used for the printed map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintParameters.html#template)
    */
  var template: PrintTemplate = js.native
  
  /**
    * The view to print.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintParameters.html#view)
    */
  var view: MapView = js.native
}
