package typingsJapgolly.webrtc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#idl-def-rtcsctptransport
trait RTCSctpTransport extends StObject {
  
  val maxMessageSize: Double
  
  val transport: RTCDtlsTransport
}
object RTCSctpTransport {
  
  inline def apply(maxMessageSize: Double, transport: RTCDtlsTransport): RTCSctpTransport = {
    val __obj = js.Dynamic.literal(maxMessageSize = maxMessageSize.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCSctpTransport]
  }
  
  extension [Self <: RTCSctpTransport](x: Self) {
    
    inline def setMaxMessageSize(value: Double): Self = StObject.set(x, "maxMessageSize", value.asInstanceOf[js.Any])
    
    inline def setTransport(value: RTCDtlsTransport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
  }
}
