package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distEsm2017SrcModelPublicTypesMod.MultiFactorUser
import typingsJapgolly.firebaseAuth.distEsm2017SrcModelPublicTypesMod.User
import typingsJapgolly.firebaseAuth.distEsm2017SrcModelUserMod.UserInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm2017SrcMfaMfaUserMod {
  
  @JSImport("@firebase/auth/dist/esm2017/src/mfa/mfa_user", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/auth/dist/esm2017/src/mfa/mfa_user", "MultiFactorUserImpl")
  @js.native
  /* private */ open class MultiFactorUserImpl ()
    extends StObject
       with MultiFactorUser {
    
    val user: UserInternal = js.native
  }
  /* static members */
  object MultiFactorUserImpl {
    
    @JSImport("@firebase/auth/dist/esm2017/src/mfa/mfa_user", "MultiFactorUserImpl")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _fromUser(user: UserInternal): MultiFactorUserImpl = ^.asInstanceOf[js.Dynamic].applyDynamic("_fromUser")(user.asInstanceOf[js.Any]).asInstanceOf[MultiFactorUserImpl]
  }
  
  inline def multiFactor(user: User): MultiFactorUser = ^.asInstanceOf[js.Dynamic].applyDynamic("multiFactor")(user.asInstanceOf[js.Any]).asInstanceOf[MultiFactorUser]
}
