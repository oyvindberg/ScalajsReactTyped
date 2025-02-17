package typingsJapgolly.naverWhale.whale.webRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebResponseErrorDetails
  extends StObject
     with typingsJapgolly.chrome.chrome.webRequest.WebResponseCacheDetails {
  
  /** The error description. This string is not guaranteed to remain backwards compatible between releases. You must not parse and act based upon its content. */
  var error: String
}
object WebResponseErrorDetails {
  
  inline def apply(
    error: String,
    frameId: Double,
    fromCache: Boolean,
    method: String,
    parentFrameId: Double,
    requestId: String,
    statusCode: Double,
    statusLine: String,
    tabId: Double,
    timeStamp: Double,
    `type`: typingsJapgolly.chrome.chrome.webRequest.ResourceType,
    url: String
  ): WebResponseErrorDetails = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], frameId = frameId.asInstanceOf[js.Any], fromCache = fromCache.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusLine = statusLine.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebResponseErrorDetails]
  }
  
  extension [Self <: WebResponseErrorDetails](x: Self) {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
