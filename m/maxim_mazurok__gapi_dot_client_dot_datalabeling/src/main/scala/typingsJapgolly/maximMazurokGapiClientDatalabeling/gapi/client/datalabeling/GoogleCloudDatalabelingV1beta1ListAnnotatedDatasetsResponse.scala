package typingsJapgolly.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1ListAnnotatedDatasetsResponse extends StObject {
  
  /** The list of annotated datasets to return. */
  var annotatedDatasets: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1AnnotatedDataset]] = js.undefined
  
  /** A token to retrieve next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1beta1ListAnnotatedDatasetsResponse {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1ListAnnotatedDatasetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ListAnnotatedDatasetsResponse]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1ListAnnotatedDatasetsResponse](x: Self) {
    
    inline def setAnnotatedDatasets(value: js.Array[GoogleCloudDatalabelingV1beta1AnnotatedDataset]): Self = StObject.set(x, "annotatedDatasets", value.asInstanceOf[js.Any])
    
    inline def setAnnotatedDatasetsUndefined: Self = StObject.set(x, "annotatedDatasets", js.undefined)
    
    inline def setAnnotatedDatasetsVarargs(value: GoogleCloudDatalabelingV1beta1AnnotatedDataset*): Self = StObject.set(x, "annotatedDatasets", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
