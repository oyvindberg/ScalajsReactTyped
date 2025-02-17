package typingsJapgolly.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalGenerateSecretResponse extends StObject {
  
  /** The secret generated by the string and used by ValidateInstaller. */
  var secret: js.UndefOr[String] = js.undefined
}
object SasPortalGenerateSecretResponse {
  
  inline def apply(): SasPortalGenerateSecretResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalGenerateSecretResponse]
  }
  
  extension [Self <: SasPortalGenerateSecretResponse](x: Self) {
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
  }
}
