package typingsJapgolly.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1p2beta1DetectedLandmark extends StObject {
  
  /** The confidence score of the detected landmark. Range [0, 1]. */
  var confidence: js.UndefOr[Double] = js.undefined
  
  /** The name of this landmark, for example, left_hand, right_shoulder. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The 2D point of the detected landmark using the normalized image coordindate system. The normalized coordinates have the range from 0 to 1. */
  var point: js.UndefOr[GoogleCloudVideointelligenceV1p2beta1NormalizedVertex] = js.undefined
}
object GoogleCloudVideointelligenceV1p2beta1DetectedLandmark {
  
  inline def apply(): GoogleCloudVideointelligenceV1p2beta1DetectedLandmark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p2beta1DetectedLandmark]
  }
  
  extension [Self <: GoogleCloudVideointelligenceV1p2beta1DetectedLandmark](x: Self) {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPoint(value: GoogleCloudVideointelligenceV1p2beta1NormalizedVertex): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
  }
}
