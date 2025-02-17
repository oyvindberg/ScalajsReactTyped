package typingsJapgolly.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndOfSegmentLocation extends StObject {
  
  /** The ID of the header, footer or footnote the location is in. An empty segment ID signifies the document's body. */
  var segmentId: js.UndefOr[String] = js.undefined
}
object EndOfSegmentLocation {
  
  inline def apply(): EndOfSegmentLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndOfSegmentLocation]
  }
  
  extension [Self <: EndOfSegmentLocation](x: Self) {
    
    inline def setSegmentId(value: String): Self = StObject.set(x, "segmentId", value.asInstanceOf[js.Any])
    
    inline def setSegmentIdUndefined: Self = StObject.set(x, "segmentId", js.undefined)
  }
}
