package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignedUrlKey extends StObject {
  
  /**
    * Name of the key. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression
    * `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last
    * character, which cannot be a dash.
    */
  var keyName: js.UndefOr[String] = js.undefined
  
  /** 128-bit key value used for signing the URL. The key value must be a valid RFC 4648 Section 5 base64url encoded string. */
  var keyValue: js.UndefOr[String] = js.undefined
}
object SignedUrlKey {
  
  inline def apply(): SignedUrlKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignedUrlKey]
  }
  
  extension [Self <: SignedUrlKey](x: Self) {
    
    inline def setKeyName(value: String): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
    
    inline def setKeyNameUndefined: Self = StObject.set(x, "keyName", js.undefined)
    
    inline def setKeyValue(value: String): Self = StObject.set(x, "keyValue", value.asInstanceOf[js.Any])
    
    inline def setKeyValueUndefined: Self = StObject.set(x, "keyValue", js.undefined)
  }
}
