package typingsJapgolly.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1beta2TimestampedObject extends StObject {
  
  /** Optional. The attributes of the object in the bounding box. */
  var attributes: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2DetectedAttribute]] = js.undefined
  
  /** Optional. The detected landmarks. */
  var landmarks: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2DetectedLandmark]] = js.undefined
  
  /** Normalized Bounding box in a frame, where the object is located. */
  var normalizedBoundingBox: js.UndefOr[GoogleCloudVideointelligenceV1beta2NormalizedBoundingBox] = js.undefined
  
  /** Time-offset, relative to the beginning of the video, corresponding to the video frame for this object. */
  var timeOffset: js.UndefOr[String] = js.undefined
}
object GoogleCloudVideointelligenceV1beta2TimestampedObject {
  
  inline def apply(): GoogleCloudVideointelligenceV1beta2TimestampedObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2TimestampedObject]
  }
  
  extension [Self <: GoogleCloudVideointelligenceV1beta2TimestampedObject](x: Self) {
    
    inline def setAttributes(value: js.Array[GoogleCloudVideointelligenceV1beta2DetectedAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: GoogleCloudVideointelligenceV1beta2DetectedAttribute*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setLandmarks(value: js.Array[GoogleCloudVideointelligenceV1beta2DetectedLandmark]): Self = StObject.set(x, "landmarks", value.asInstanceOf[js.Any])
    
    inline def setLandmarksUndefined: Self = StObject.set(x, "landmarks", js.undefined)
    
    inline def setLandmarksVarargs(value: GoogleCloudVideointelligenceV1beta2DetectedLandmark*): Self = StObject.set(x, "landmarks", js.Array(value*))
    
    inline def setNormalizedBoundingBox(value: GoogleCloudVideointelligenceV1beta2NormalizedBoundingBox): Self = StObject.set(x, "normalizedBoundingBox", value.asInstanceOf[js.Any])
    
    inline def setNormalizedBoundingBoxUndefined: Self = StObject.set(x, "normalizedBoundingBox", js.undefined)
    
    inline def setTimeOffset(value: String): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    inline def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
  }
}
