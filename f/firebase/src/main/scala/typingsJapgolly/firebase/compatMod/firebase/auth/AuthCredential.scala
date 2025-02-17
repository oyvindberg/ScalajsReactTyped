package typingsJapgolly.firebase.compatMod.firebase.auth

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface that represents the credentials returned by an auth provider.
  * Implementations specify the details about each auth provider's credential
  * requirements.
  *
  */
trait AuthCredential extends StObject {
  
  /**
    * The authentication provider ID for the credential.
    * For example, 'facebook.com', or 'google.com'.
    */
  var providerId: String
  
  /**
    * The authentication sign in method for the credential.
    * For example, 'password', or 'emailLink. This corresponds to the sign-in
    * method identifier as returned in
    * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
    */
  var signInMethod: String
  
  /**
    * Returns a JSON-serializable representation of this object.
    */
  def toJSON(): js.Object
}
object AuthCredential {
  
  inline def apply(providerId: String, signInMethod: String, toJSON: CallbackTo[js.Object]): AuthCredential = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any], signInMethod = signInMethod.asInstanceOf[js.Any], toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[AuthCredential]
  }
  
  extension [Self <: AuthCredential](x: Self) {
    
    inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
    
    inline def setSignInMethod(value: String): Self = StObject.set(x, "signInMethod", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: CallbackTo[js.Object]): Self = StObject.set(x, "toJSON", value.toJsFn)
  }
}
