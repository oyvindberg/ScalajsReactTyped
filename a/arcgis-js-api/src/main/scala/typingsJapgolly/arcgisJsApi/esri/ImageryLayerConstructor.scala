package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageryLayerConstructor
  extends StObject
     with /**
  * Represents a dynamic [image service resource](https://developers.arcgis.com/rest/services-reference/image-service.htm) as a layer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html)
  */
Instantiable0[ImageryLayer]
     with Instantiable1[/* properties */ ImageryLayerProperties, ImageryLayer] {
  
  def fromJSON(json: Any): ImageryLayer = js.native
}
