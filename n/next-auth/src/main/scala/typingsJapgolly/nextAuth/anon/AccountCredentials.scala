package typingsJapgolly.nextAuth.anon

import typingsJapgolly.nextAuth.adaptersMod.AdapterUser
import typingsJapgolly.nextAuth.providersCredentialsMod.CredentialInput
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountCredentials extends StObject {
  
  var account: typingsJapgolly.nextAuth.coreTypesMod.Account | Null
  
  /** If Credentials provider is used, it contains the user credentials */
  var credentials: js.UndefOr[Record[String, CredentialInput]] = js.undefined
  
  /**
    * If Email provider is used, on the first call, it contains a
    * `verificationRequest: true` property to indicate it is being triggered in the verification request flow.
    * When the callback is invoked after a user has clicked on a sign in link,
    * this property will not be present. You can check for the `verificationRequest` property
    * to avoid sending emails to addresses or domains on a blocklist or to only explicitly generate them
    * for email address in an allow list.
    */
  var email: js.UndefOr[VerificationRequest] = js.undefined
  
  /**
    * If OAuth provider is used, it contains the full
    * OAuth profile returned by your provider.
    */
  var profile: js.UndefOr[typingsJapgolly.nextAuth.coreTypesMod.Profile] = js.undefined
  
  var user: typingsJapgolly.nextAuth.coreTypesMod.User | AdapterUser
}
object AccountCredentials {
  
  inline def apply(user: typingsJapgolly.nextAuth.coreTypesMod.User | AdapterUser): AccountCredentials = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any], account = null)
    __obj.asInstanceOf[AccountCredentials]
  }
  
  extension [Self <: AccountCredentials](x: Self) {
    
    inline def setAccount(value: typingsJapgolly.nextAuth.coreTypesMod.Account): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountNull: Self = StObject.set(x, "account", null)
    
    inline def setCredentials(value: Record[String, CredentialInput]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setEmail(value: VerificationRequest): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setProfile(value: typingsJapgolly.nextAuth.coreTypesMod.Profile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setUser(value: typingsJapgolly.nextAuth.coreTypesMod.User | AdapterUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
