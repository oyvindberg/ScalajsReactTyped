package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsMod.AuthCredential
import typingsJapgolly.firebaseAuth.distEsm5SrcModelAuthMod.AuthInternal
import typingsJapgolly.firebaseAuth.distEsm5SrcModelPublicTypesMod.Auth
import typingsJapgolly.firebaseAuth.distEsm5SrcModelPublicTypesMod.User
import typingsJapgolly.firebaseAuth.distEsm5SrcModelPublicTypesMod.UserCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm5SrcCoreStrategiesCredentialMod {
  
  @JSImport("@firebase/auth/dist/esm5/src/core/strategies/credential", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def _signInWithCredential(auth: AuthInternal, credential: AuthCredential): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("_signInWithCredential")(auth.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  inline def _signInWithCredential(auth: AuthInternal, credential: AuthCredential, bypassAuthState: Boolean): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("_signInWithCredential")(auth.asInstanceOf[js.Any], credential.asInstanceOf[js.Any], bypassAuthState.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def linkWithCredential(user: User, credential: AuthCredential): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkWithCredential")(user.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def reauthenticateWithCredential(user: User, credential: AuthCredential): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthenticateWithCredential")(user.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def signInWithCredential(auth: Auth, credential: AuthCredential): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithCredential")(auth.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
}
