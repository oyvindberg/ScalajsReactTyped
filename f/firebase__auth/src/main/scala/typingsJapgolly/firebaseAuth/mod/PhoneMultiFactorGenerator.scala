package typingsJapgolly.firebaseAuth.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth", "PhoneMultiFactorGenerator")
@js.native
/* private */ open class PhoneMultiFactorGenerator () extends StObject
/* static members */
object PhoneMultiFactorGenerator {
  
  @JSImport("@firebase/auth", "PhoneMultiFactorGenerator")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The identifier of the phone second factor: `phone`.
    */
  @JSImport("@firebase/auth", "PhoneMultiFactorGenerator.FACTOR_ID")
  @js.native
  def FACTOR_ID: String = js.native
  inline def FACTOR_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACTOR_ID")(x.asInstanceOf[js.Any])
  
  /**
    * Provides a {@link PhoneMultiFactorAssertion} to confirm ownership of the phone second factor.
    *
    * @param phoneAuthCredential - A credential provided by {@link PhoneAuthProvider.credential}.
    * @returns A {@link PhoneMultiFactorAssertion} which can be used with
    * {@link MultiFactorResolver.resolveSignIn}
    */
  inline def assertion(credential: PhoneAuthCredential): PhoneMultiFactorAssertion = ^.asInstanceOf[js.Dynamic].applyDynamic("assertion")(credential.asInstanceOf[js.Any]).asInstanceOf[PhoneMultiFactorAssertion]
}
