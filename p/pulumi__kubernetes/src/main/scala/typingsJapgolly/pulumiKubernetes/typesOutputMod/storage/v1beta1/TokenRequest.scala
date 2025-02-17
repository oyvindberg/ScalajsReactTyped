package typingsJapgolly.pulumiKubernetes.typesOutputMod.storage.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TokenRequest contains parameters of a service account token.
  */
trait TokenRequest extends StObject {
  
  /**
    * Audience is the intended audience of the token in "TokenRequestSpec". It will default to the audiences of kube apiserver.
    */
  var audience: String
  
  /**
    * ExpirationSeconds is the duration of validity of the token in "TokenRequestSpec". It has the same default value of "ExpirationSeconds" in "TokenRequestSpec"
    */
  var expirationSeconds: Double
}
object TokenRequest {
  
  inline def apply(audience: String, expirationSeconds: Double): TokenRequest = {
    val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], expirationSeconds = expirationSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenRequest]
  }
  
  extension [Self <: TokenRequest](x: Self) {
    
    inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    inline def setExpirationSeconds(value: Double): Self = StObject.set(x, "expirationSeconds", value.asInstanceOf[js.Any])
  }
}
