package typingsJapgolly.fmWebsync.fm.websync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait baseRequestConfig extends StObject {
  
  /**
    * Extra meta data to associate with the request/response.
    */
  var meta: js.UndefOr[Any] = js.undefined
  
  /**
    * The URL of the proxy to use for this request.
    */
  var requestUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to ignore errors when parsing the server response. If true, any errors thrown while parsing the JSON response received from the server will be ignored.
    * Defaults to false.
    */
  var suppressErrors: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the request should be executed asynchronously. If true, the request will be executed synchronously if supported by the browser; otherwise,
    * it will be executed asynchronously. All browsers support synchronous requests if the request URL is the same domain as the page. Synchronous requests
    * are not supported in IE6 and IE7 for cross-domain environments. Defaults to false.
    */
  var sync: js.UndefOr[Boolean] = js.undefined
}
object baseRequestConfig {
  
  inline def apply(): baseRequestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[baseRequestConfig]
  }
  
  extension [Self <: baseRequestConfig](x: Self) {
    
    inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setRequestUrl(value: String): Self = StObject.set(x, "requestUrl", value.asInstanceOf[js.Any])
    
    inline def setRequestUrlUndefined: Self = StObject.set(x, "requestUrl", js.undefined)
    
    inline def setSuppressErrors(value: Boolean): Self = StObject.set(x, "suppressErrors", value.asInstanceOf[js.Any])
    
    inline def setSuppressErrorsUndefined: Self = StObject.set(x, "suppressErrors", js.undefined)
    
    inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    
    inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
  }
}
