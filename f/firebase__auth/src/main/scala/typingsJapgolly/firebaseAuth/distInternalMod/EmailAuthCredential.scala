package typingsJapgolly.firebaseAuth.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/dist/internal", "EmailAuthCredential")
@js.native
/** @internal */
/* private */ open class EmailAuthCredential ()
  extends typingsJapgolly.firebaseAuth.distMod.EmailAuthCredential
/* static members */
object EmailAuthCredential {
  
  @JSImport("@firebase/auth/dist/internal", "EmailAuthCredential")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def _fromEmailAndCode(email: String, oobCode: String): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsEmailMod.EmailAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromEmailAndCode")(email.asInstanceOf[js.Any], oobCode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsEmailMod.EmailAuthCredential]
  inline def _fromEmailAndCode(email: String, oobCode: String, tenantId: String): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsEmailMod.EmailAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromEmailAndCode")(email.asInstanceOf[js.Any], oobCode.asInstanceOf[js.Any], tenantId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsEmailMod.EmailAuthCredential]
  
  /** @internal */
  inline def _fromEmailAndPassword(email: String, password: String): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsEmailMod.EmailAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromEmailAndPassword")(email.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsEmailMod.EmailAuthCredential]
  
  inline def fromJSON(json: String): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsEmailMod.EmailAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsEmailMod.EmailAuthCredential | Null]
  /**
    * Static method to deserialize a JSON representation of an object into an {@link  AuthCredential}.
    *
    * @param json - Either `object` or the stringified representation of the object. When string is
    * provided, `JSON.parse` would be called first.
    *
    * @returns If the JSON input does not represent an {@link AuthCredential}, null is returned.
    */
  inline def fromJSON(json: js.Object): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsEmailMod.EmailAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsEmailMod.EmailAuthCredential | Null]
}
