package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsOauthMod.OAuthCredentialParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeSrcCoreCredentialsMod {
  
  @JSImport("@firebase/auth/dist/node/src/core/credentials", "AuthCredential")
  @js.native
  open class AuthCredential protected ()
    extends typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsAuthCredentialMod.AuthCredential {
    /** @internal */
    /* protected */ def this(
      /**
      * The authentication provider ID for the credential.
      *
      * @remarks
      * For example, 'facebook.com', or 'google.com'.
      */
    providerId: String,
      /**
      * The authentication sign in method for the credential.
      *
      * @remarks
      * For example, {@link SignInMethod}.EMAIL_PASSWORD, or
      * {@link SignInMethod}.EMAIL_LINK. This corresponds to the sign-in method
      * identifier as returned in {@link fetchSignInMethodsForEmail}.
      */
    signInMethod: String
    ) = this()
  }
  
  @JSImport("@firebase/auth/dist/node/src/core/credentials", "EmailAuthCredential")
  @js.native
  /** @internal */
  /* private */ open class EmailAuthCredential ()
    extends typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsEmailMod.EmailAuthCredential
  /* static members */
  object EmailAuthCredential {
    
    @JSImport("@firebase/auth/dist/node/src/core/credentials", "EmailAuthCredential")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def _fromEmailAndCode(email: String, oobCode: String): typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsEmailMod.EmailAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromEmailAndCode")(email.asInstanceOf[js.Any], oobCode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsEmailMod.EmailAuthCredential]
    inline def _fromEmailAndCode(email: String, oobCode: String, tenantId: String): typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsEmailMod.EmailAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromEmailAndCode")(email.asInstanceOf[js.Any], oobCode.asInstanceOf[js.Any], tenantId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsEmailMod.EmailAuthCredential]
    
    /** @internal */
    inline def _fromEmailAndPassword(email: String, password: String): typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsEmailMod.EmailAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromEmailAndPassword")(email.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsEmailMod.EmailAuthCredential]
    
    inline def fromJSON(json: String): typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsEmailMod.EmailAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsEmailMod.EmailAuthCredential | Null]
    /**
      * Static method to deserialize a JSON representation of an object into an {@link  AuthCredential}.
      *
      * @param json - Either `object` or the stringified representation of the object. When string is
      * provided, `JSON.parse` would be called first.
      *
      * @returns If the JSON input does not represent an {@link AuthCredential}, null is returned.
      */
    inline def fromJSON(json: js.Object): typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsEmailMod.EmailAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsEmailMod.EmailAuthCredential | Null]
  }
  
  @JSImport("@firebase/auth/dist/node/src/core/credentials", "OAuthCredential")
  @js.native
  open class OAuthCredential protected ()
    extends typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsOauthMod.OAuthCredential {
    /** @internal */
    /* protected */ def this(
      /**
      * The authentication provider ID for the credential.
      *
      * @remarks
      * For example, 'facebook.com', or 'google.com'.
      */
    providerId: String,
      /**
      * The authentication sign in method for the credential.
      *
      * @remarks
      * For example, {@link SignInMethod}.EMAIL_PASSWORD, or
      * {@link SignInMethod}.EMAIL_LINK. This corresponds to the sign-in method
      * identifier as returned in {@link fetchSignInMethodsForEmail}.
      */
    signInMethod: String
    ) = this()
  }
  /* static members */
  object OAuthCredential {
    
    @JSImport("@firebase/auth/dist/node/src/core/credentials", "OAuthCredential")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def _fromParams(params: OAuthCredentialParams): typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsOauthMod.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("_fromParams")(params.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsOauthMod.OAuthCredential]
    
    /**
      * Static method to deserialize a JSON representation of an object into an
      * {@link  AuthCredential}.
      *
      * @param json - Input can be either Object or the stringified representation of the object.
      * When string is provided, JSON.parse would be called first.
      *
      * @returns If the JSON input does not represent an {@link  AuthCredential}, null is returned.
      */
    inline def fromJSON(json: String): typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsOauthMod.OAuthCredential | Null]
    inline def fromJSON(json: js.Object): typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsOauthMod.OAuthCredential | Null]
  }
  
  @JSImport("@firebase/auth/dist/node/src/core/credentials", "PhoneAuthCredential")
  @js.native
  /* private */ open class PhoneAuthCredential ()
    extends typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsPhoneMod.PhoneAuthCredential
  /* static members */
  object PhoneAuthCredential {
    
    @JSImport("@firebase/auth/dist/node/src/core/credentials", "PhoneAuthCredential")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def _fromTokenResponse(phoneNumber: String, temporaryProof: String): typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsPhoneMod.PhoneAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromTokenResponse")(phoneNumber.asInstanceOf[js.Any], temporaryProof.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsPhoneMod.PhoneAuthCredential]
    
    /** @internal */
    inline def _fromVerification(verificationId: String, verificationCode: String): typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsPhoneMod.PhoneAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromVerification")(verificationId.asInstanceOf[js.Any], verificationCode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsPhoneMod.PhoneAuthCredential]
    
    inline def fromJSON(json: String): typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsPhoneMod.PhoneAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsPhoneMod.PhoneAuthCredential | Null]
    /** Generates a phone credential based on a plain object or a JSON string. */
    inline def fromJSON(json: js.Object): typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsPhoneMod.PhoneAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsPhoneMod.PhoneAuthCredential | Null]
  }
}
