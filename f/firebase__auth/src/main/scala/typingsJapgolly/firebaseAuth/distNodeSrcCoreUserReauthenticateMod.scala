package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsMod.AuthCredential
import typingsJapgolly.firebaseAuth.distNodeSrcCoreUserUserCredentialImplMod.UserCredentialImpl
import typingsJapgolly.firebaseAuth.distNodeSrcModelUserMod.UserInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeSrcCoreUserReauthenticateMod {
  
  @JSImport("@firebase/auth/dist/node/src/core/user/reauthenticate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reauthenticate(user: UserInternal, credential: AuthCredential): js.Promise[UserCredentialImpl] = (^.asInstanceOf[js.Dynamic].applyDynamic("_reauthenticate")(user.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredentialImpl]]
  inline def reauthenticate(user: UserInternal, credential: AuthCredential, bypassAuthState: Boolean): js.Promise[UserCredentialImpl] = (^.asInstanceOf[js.Dynamic].applyDynamic("_reauthenticate")(user.asInstanceOf[js.Any], credential.asInstanceOf[js.Any], bypassAuthState.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredentialImpl]]
}
