package typingsJapgolly.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionedObjectProperties extends StObject {
  
  /** The embedded object of this positioned object. */
  var embeddedObject: js.UndefOr[EmbeddedObject] = js.undefined
  
  /** The positioning of this positioned object relative to the newline of the Paragraph that references this positioned object. */
  var positioning: js.UndefOr[PositionedObjectPositioning] = js.undefined
}
object PositionedObjectProperties {
  
  inline def apply(): PositionedObjectProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionedObjectProperties]
  }
  
  extension [Self <: PositionedObjectProperties](x: Self) {
    
    inline def setEmbeddedObject(value: EmbeddedObject): Self = StObject.set(x, "embeddedObject", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedObjectUndefined: Self = StObject.set(x, "embeddedObject", js.undefined)
    
    inline def setPositioning(value: PositionedObjectPositioning): Self = StObject.set(x, "positioning", value.asInstanceOf[js.Any])
    
    inline def setPositioningUndefined: Self = StObject.set(x, "positioning", js.undefined)
  }
}
