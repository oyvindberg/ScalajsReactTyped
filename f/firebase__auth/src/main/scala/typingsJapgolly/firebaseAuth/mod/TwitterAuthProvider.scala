package typingsJapgolly.firebaseAuth.mod

import typingsJapgolly.firebaseAuth.firebaseAuthStrings.twitterDotcom
import typingsJapgolly.firebaseUtil.mod.FirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth", "TwitterAuthProvider")
@js.native
open class TwitterAuthProvider ()
  extends StObject
     with BaseOAuthProvider {
  
  /**
    * Provider for which credentials can be constructed.
    */
  /* CompleteClass */
  override val providerId: String = js.native
}
/* static members */
object TwitterAuthProvider {
  
  @JSImport("@firebase/auth", "TwitterAuthProvider")
  @js.native
  val ^ : js.Any = js.native
  
  /** Always set to {@link ProviderId}.TWITTER. */
  @JSImport("@firebase/auth", "TwitterAuthProvider.PROVIDER_ID")
  @js.native
  val PROVIDER_ID: twitterDotcom = js.native
  
  /** Always set to {@link SignInMethod}.TWITTER. */
  @JSImport("@firebase/auth", "TwitterAuthProvider.TWITTER_SIGN_IN_METHOD")
  @js.native
  val TWITTER_SIGN_IN_METHOD: twitterDotcom = js.native
  
  /**
    * Creates a credential for Twitter.
    *
    * @param token - Twitter access token.
    * @param secret - Twitter secret.
    */
  inline def credential(token: String, secret: String): OAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(token.asInstanceOf[js.Any], secret.asInstanceOf[js.Any])).asInstanceOf[OAuthCredential]
  
  /**
    * Used to extract the underlying {@link OAuthCredential} from a {@link AuthError} which was
    * thrown during a sign-in, link, or reauthenticate operation.
    *
    * @param userCredential - The user credential.
    */
  inline def credentialFromError(error: FirebaseError): OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromError")(error.asInstanceOf[js.Any]).asInstanceOf[OAuthCredential | Null]
  
  /**
    * Used to extract the underlying {@link OAuthCredential} from a {@link UserCredential}.
    *
    * @param userCredential - The user credential.
    */
  inline def credentialFromResult(userCredential: UserCredential): OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromResult")(userCredential.asInstanceOf[js.Any]).asInstanceOf[OAuthCredential | Null]
  
  @JSImport("@firebase/auth", "TwitterAuthProvider.credentialFromTaggedObject")
  @js.native
  def credentialFromTaggedObject: Any = js.native
  inline def credentialFromTaggedObject_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("credentialFromTaggedObject")(x.asInstanceOf[js.Any])
}
