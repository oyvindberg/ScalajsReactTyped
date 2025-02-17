package typingsJapgolly.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1ImagePolylineAnnotation extends StObject {
  
  /** Label of this polyline. */
  var annotationSpec: js.UndefOr[GoogleCloudDatalabelingV1beta1AnnotationSpec] = js.undefined
  
  var normalizedPolyline: js.UndefOr[GoogleCloudDatalabelingV1beta1NormalizedPolyline] = js.undefined
  
  var polyline: js.UndefOr[GoogleCloudDatalabelingV1beta1Polyline] = js.undefined
}
object GoogleCloudDatalabelingV1beta1ImagePolylineAnnotation {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1ImagePolylineAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ImagePolylineAnnotation]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1ImagePolylineAnnotation](x: Self) {
    
    inline def setAnnotationSpec(value: GoogleCloudDatalabelingV1beta1AnnotationSpec): Self = StObject.set(x, "annotationSpec", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSpecUndefined: Self = StObject.set(x, "annotationSpec", js.undefined)
    
    inline def setNormalizedPolyline(value: GoogleCloudDatalabelingV1beta1NormalizedPolyline): Self = StObject.set(x, "normalizedPolyline", value.asInstanceOf[js.Any])
    
    inline def setNormalizedPolylineUndefined: Self = StObject.set(x, "normalizedPolyline", js.undefined)
    
    inline def setPolyline(value: GoogleCloudDatalabelingV1beta1Polyline): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
    
    inline def setPolylineUndefined: Self = StObject.set(x, "polyline", js.undefined)
  }
}
