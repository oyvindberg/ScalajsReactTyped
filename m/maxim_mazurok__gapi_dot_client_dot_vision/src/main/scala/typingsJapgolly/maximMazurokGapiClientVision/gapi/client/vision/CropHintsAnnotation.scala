package typingsJapgolly.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CropHintsAnnotation extends StObject {
  
  /** Crop hint results. */
  var cropHints: js.UndefOr[js.Array[CropHint]] = js.undefined
}
object CropHintsAnnotation {
  
  inline def apply(): CropHintsAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CropHintsAnnotation]
  }
  
  extension [Self <: CropHintsAnnotation](x: Self) {
    
    inline def setCropHints(value: js.Array[CropHint]): Self = StObject.set(x, "cropHints", value.asInstanceOf[js.Any])
    
    inline def setCropHintsUndefined: Self = StObject.set(x, "cropHints", js.undefined)
    
    inline def setCropHintsVarargs(value: CropHint*): Self = StObject.set(x, "cropHints", js.Array(value*))
  }
}
