package typingsJapgolly.agoraRtcSdk.anon

import typingsJapgolly.agoraRtcSdk.agoraRtcSdkStrings.liveTranscodingUpdated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var `type`: liveTranscodingUpdated
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("liveTranscodingUpdated")
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setType(value: liveTranscodingUpdated): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
