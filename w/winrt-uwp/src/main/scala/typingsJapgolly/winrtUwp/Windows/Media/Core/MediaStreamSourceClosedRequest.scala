package typingsJapgolly.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an object to be used by the MediaStreamSource.closed event to provide information to the application. */
trait MediaStreamSourceClosedRequest extends StObject {
  
  /** Gets the reason why the media stream source was closed. */
  var reason: MediaStreamSourceClosedReason
}
object MediaStreamSourceClosedRequest {
  
  inline def apply(reason: MediaStreamSourceClosedReason): MediaStreamSourceClosedRequest = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamSourceClosedRequest]
  }
  
  extension [Self <: MediaStreamSourceClosedRequest](x: Self) {
    
    inline def setReason(value: MediaStreamSourceClosedReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
