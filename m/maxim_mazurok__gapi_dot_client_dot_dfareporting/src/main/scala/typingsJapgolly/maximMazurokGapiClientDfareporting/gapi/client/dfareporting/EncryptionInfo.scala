package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionInfo extends StObject {
  
  /** The encryption entity ID. This should match the encryption configuration for ad serving or Data Transfer. */
  var encryptionEntityId: js.UndefOr[String] = js.undefined
  
  /** The encryption entity type. This should match the encryption configuration for ad serving or Data Transfer. */
  var encryptionEntityType: js.UndefOr[String] = js.undefined
  
  /** Describes whether the encrypted cookie was received from ad serving (the %m macro) or from Data Transfer. */
  var encryptionSource: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#encryptionInfo". */
  var kind: js.UndefOr[String] = js.undefined
}
object EncryptionInfo {
  
  inline def apply(): EncryptionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionInfo]
  }
  
  extension [Self <: EncryptionInfo](x: Self) {
    
    inline def setEncryptionEntityId(value: String): Self = StObject.set(x, "encryptionEntityId", value.asInstanceOf[js.Any])
    
    inline def setEncryptionEntityIdUndefined: Self = StObject.set(x, "encryptionEntityId", js.undefined)
    
    inline def setEncryptionEntityType(value: String): Self = StObject.set(x, "encryptionEntityType", value.asInstanceOf[js.Any])
    
    inline def setEncryptionEntityTypeUndefined: Self = StObject.set(x, "encryptionEntityType", js.undefined)
    
    inline def setEncryptionSource(value: String): Self = StObject.set(x, "encryptionSource", value.asInstanceOf[js.Any])
    
    inline def setEncryptionSourceUndefined: Self = StObject.set(x, "encryptionSource", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
