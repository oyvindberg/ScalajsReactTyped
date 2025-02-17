package typingsJapgolly.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Paragraph extends StObject {
  
  /**
    * The bounding box for the paragraph. The vertices are in the order of top-left, top-right, bottom-right, bottom-left. When a rotation of the bounding box is detected the rotation is
    * represented as around the top-left corner as defined when the text is read in the 'natural' orientation. For example: * when the text is horizontal it might look like: 0----1 | |
    * 3----2 * when it's rotated 180 degrees around the top-left corner it becomes: 2----3 | | 1----0 and the vertex order will still be (0, 1, 2, 3).
    */
  var boundingBox: js.UndefOr[BoundingPoly] = js.undefined
  
  /** Confidence of the OCR results for the paragraph. Range [0, 1]. */
  var confidence: js.UndefOr[Double] = js.undefined
  
  /** Additional information detected for the paragraph. */
  var property: js.UndefOr[TextProperty] = js.undefined
  
  /** List of all words in this paragraph. */
  var words: js.UndefOr[js.Array[Word]] = js.undefined
}
object Paragraph {
  
  inline def apply(): Paragraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Paragraph]
  }
  
  extension [Self <: Paragraph](x: Self) {
    
    inline def setBoundingBox(value: BoundingPoly): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
    
    inline def setBoundingBoxUndefined: Self = StObject.set(x, "boundingBox", js.undefined)
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setProperty(value: TextProperty): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setWords(value: js.Array[Word]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    
    inline def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
    
    inline def setWordsVarargs(value: Word*): Self = StObject.set(x, "words", js.Array(value*))
  }
}
