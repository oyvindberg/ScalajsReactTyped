package typingsJapgolly.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1beta2LabelAnnotation extends StObject {
  
  /**
    * Common categories for the detected entity. For example, when the label is `Terrier`, the category is likely `dog`. And in some cases there might be more than one categories e.g.,
    * `Terrier` could also be a `pet`.
    */
  var categoryEntities: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2Entity]] = js.undefined
  
  /** Detected entity. */
  var entity: js.UndefOr[GoogleCloudVideointelligenceV1beta2Entity] = js.undefined
  
  /** All video frames where a label was detected. */
  var frames: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2LabelFrame]] = js.undefined
  
  /** All video segments where a label was detected. */
  var segments: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2LabelSegment]] = js.undefined
  
  /** Feature version. */
  var version: js.UndefOr[String] = js.undefined
}
object GoogleCloudVideointelligenceV1beta2LabelAnnotation {
  
  inline def apply(): GoogleCloudVideointelligenceV1beta2LabelAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2LabelAnnotation]
  }
  
  extension [Self <: GoogleCloudVideointelligenceV1beta2LabelAnnotation](x: Self) {
    
    inline def setCategoryEntities(value: js.Array[GoogleCloudVideointelligenceV1beta2Entity]): Self = StObject.set(x, "categoryEntities", value.asInstanceOf[js.Any])
    
    inline def setCategoryEntitiesUndefined: Self = StObject.set(x, "categoryEntities", js.undefined)
    
    inline def setCategoryEntitiesVarargs(value: GoogleCloudVideointelligenceV1beta2Entity*): Self = StObject.set(x, "categoryEntities", js.Array(value*))
    
    inline def setEntity(value: GoogleCloudVideointelligenceV1beta2Entity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    inline def setFrames(value: js.Array[GoogleCloudVideointelligenceV1beta2LabelFrame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
    
    inline def setFramesVarargs(value: GoogleCloudVideointelligenceV1beta2LabelFrame*): Self = StObject.set(x, "frames", js.Array(value*))
    
    inline def setSegments(value: js.Array[GoogleCloudVideointelligenceV1beta2LabelSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    inline def setSegmentsVarargs(value: GoogleCloudVideointelligenceV1beta2LabelSegment*): Self = StObject.set(x, "segments", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
