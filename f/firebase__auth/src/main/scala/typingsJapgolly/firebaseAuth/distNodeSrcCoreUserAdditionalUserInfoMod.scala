package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distNodeSrcModelIdTokenMod.IdTokenResponse
import typingsJapgolly.firebaseAuth.distNodeSrcModelPublicTypesMod.AdditionalUserInfo
import typingsJapgolly.firebaseAuth.distNodeSrcModelPublicTypesMod.UserCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeSrcCoreUserAdditionalUserInfoMod {
  
  @JSImport("@firebase/auth/dist/node/src/core/user/additional_user_info", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromIdTokenResponse(): AdditionalUserInfo | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("_fromIdTokenResponse")().asInstanceOf[AdditionalUserInfo | Null]
  inline def fromIdTokenResponse(idTokenResponse: IdTokenResponse): AdditionalUserInfo | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("_fromIdTokenResponse")(idTokenResponse.asInstanceOf[js.Any]).asInstanceOf[AdditionalUserInfo | Null]
  
  inline def getAdditionalUserInfo(userCredential: UserCredential): AdditionalUserInfo | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdditionalUserInfo")(userCredential.asInstanceOf[js.Any]).asInstanceOf[AdditionalUserInfo | Null]
}
