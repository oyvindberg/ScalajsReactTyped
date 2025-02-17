package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataFile
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The ID of the uploaded file returned as a result of the upload operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DataFile.html#itemId)
    */
  var itemId: String = js.native
  
  /**
    * URL to the location of the data file.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DataFile.html#url)
    */
  var url: String = js.native
}
