package typingsJapgolly.firebaseAuth

import org.scalajs.dom.HTMLElement
import typingsJapgolly.firebaseApp.mod.FirebaseApp
import typingsJapgolly.firebaseAuth.anon.DisableWarnings
import typingsJapgolly.firebaseAuth.anon.DisplayName
import typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredentialParams
import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.ActionCodeInfo
import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.ActionCodeSettings
import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.AdditionalUserInfo
import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.ApplicationVerifier
import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.Auth
import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.AuthErrorMap
import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.AuthProvider
import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.ConfirmationResult
import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.Dependencies
import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.IdTokenResult
import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.MultiFactorError
import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.MultiFactorResolver
import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.MultiFactorUser
import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.NextOrObserver
import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.Persistence
import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.PhoneMultiFactorAssertion
import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.PopupRedirectResolver
import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.RecaptchaParameters
import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.User
import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.UserCredential
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashaccount-exists-with-different-credential`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashadmin-restricted-operation`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashalready-initialized`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashapp-deleted`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashapp-not-authorized`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashapp-not-installed`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashargument-error`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashauth-domain-config-required`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashcancelled-popup-request`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashcaptcha-check-failed`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashcode-expired`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashcordova-not-ready`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashcors-unsupported`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashcredential-already-in-use`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashcustom-token-mismatch`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashdependent-sdk-initialized-before-auth`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashdynamic-link-not-activated`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashemail-already-in-use`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashemail-change-needs-verification`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashemulator-config-failed`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashexpired-action-code`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinternal-error`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-action-code`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-api-key`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-app-credential`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-app-id`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-auth-event`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-cert-hash`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-continue-uri`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-cordova-configuration`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-credential`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-custom-token`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-dynamic-link-domain`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-email`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-emulator-scheme`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-message-payload`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-multi-factor-session`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-oauth-client-id`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-oauth-provider`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-persistence-type`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-phone-number`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-provider-id`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-recipient-email`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-sender`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-tenant-id`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-user-token`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-verification-code`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-verification-id`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashmaximum-second-factor-count-exceeded`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashmissing-android-pkg-name`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashmissing-app-credential`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashmissing-continue-uri`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashmissing-iframe-start`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashmissing-ios-bundle-id`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashmissing-multi-factor-info`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashmissing-multi-factor-session`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashmissing-or-invalid-nonce`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashmissing-phone-number`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashmissing-verification-code`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashmissing-verification-id`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashmulti-factor-auth-required`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashmulti-factor-info-not-found`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashnetwork-request-failed`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashno-auth-event`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashno-such-provider`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashnull-user`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashoperation-not-allowed`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashoperation-not-supported-in-this-environment`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashpopup-blocked`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashpopup-closed-by-user`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashprovider-already-linked`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashquota-exceeded`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashredirect-cancelled-by-user`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashredirect-operation-pending`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashrejected-credential`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashrequires-recent-login`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashsecond-factor-already-in-use`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashtenant-id-mismatch`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashtoo-many-requests`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashunauthorized-continue-uri`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashunauthorized-domain`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashunsupported-first-factor`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashunsupported-persistence-type`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashunsupported-tenant-operation`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashunverified-email`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashuser-cancelled`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashuser-disabled`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashuser-mismatch`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashuser-not-found`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashuser-signed-out`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashuser-token-expired`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashweak-password`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashweb-storage-unsupported`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashwrong-password`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.authSlashtimeout
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.emailLink
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.facebookDotcom
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.githubDotcom
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.googleDotcom
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.link
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.password
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.phone
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.reauthenticate
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.signIn
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.twitterDotcom
import typingsJapgolly.firebaseUtil.mod.CompleteFn
import typingsJapgolly.firebaseUtil.mod.ErrorFn
import typingsJapgolly.firebaseUtil.mod.FirebaseError
import typingsJapgolly.firebaseUtil.mod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("@firebase/auth/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object ActionCodeOperation {
    
    /** The email link sign-in action. */
    @JSImport("@firebase/auth/dist", "ActionCodeOperation.EMAIL_SIGNIN")
    @js.native
    val EMAIL_SIGNIN: typingsJapgolly.firebaseAuth.firebaseAuthStrings.EMAIL_SIGNIN = js.native
    
    /** The password reset action. */
    @JSImport("@firebase/auth/dist", "ActionCodeOperation.PASSWORD_RESET")
    @js.native
    val PASSWORD_RESET: typingsJapgolly.firebaseAuth.firebaseAuthStrings.PASSWORD_RESET = js.native
    
    /** The email revocation action. */
    @JSImport("@firebase/auth/dist", "ActionCodeOperation.RECOVER_EMAIL")
    @js.native
    val RECOVER_EMAIL: typingsJapgolly.firebaseAuth.firebaseAuthStrings.RECOVER_EMAIL = js.native
    
    /** The revert second factor addition email action. */
    @JSImport("@firebase/auth/dist", "ActionCodeOperation.REVERT_SECOND_FACTOR_ADDITION")
    @js.native
    val REVERT_SECOND_FACTOR_ADDITION: typingsJapgolly.firebaseAuth.firebaseAuthStrings.REVERT_SECOND_FACTOR_ADDITION = js.native
    
    /** The revert second factor addition email action. */
    @JSImport("@firebase/auth/dist", "ActionCodeOperation.VERIFY_AND_CHANGE_EMAIL")
    @js.native
    val VERIFY_AND_CHANGE_EMAIL: typingsJapgolly.firebaseAuth.firebaseAuthStrings.VERIFY_AND_CHANGE_EMAIL = js.native
    
    /** The email verification action. */
    @JSImport("@firebase/auth/dist", "ActionCodeOperation.VERIFY_EMAIL")
    @js.native
    val VERIFY_EMAIL: typingsJapgolly.firebaseAuth.firebaseAuthStrings.VERIFY_EMAIL = js.native
  }
  
  @JSImport("@firebase/auth/dist", "ActionCodeURL")
  @js.native
  open class ActionCodeURL protected ()
    extends typingsJapgolly.firebaseAuth.distSrcMod.ActionCodeURL {
    /**
      * @param actionLink - The link from which to extract the URL.
      * @returns The {@link ActionCodeURL} object, or null if the link is invalid.
      *
      * @internal
      */
    def this(actionLink: String) = this()
  }
  /* static members */
  object ActionCodeURL {
    
    @JSImport("@firebase/auth/dist", "ActionCodeURL")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parses the email action link string and returns an {@link ActionCodeURL} if the link is valid,
      * otherwise returns null.
      *
      * @param link  - The email action link string.
      * @returns The {@link ActionCodeURL} object, or null if the link is invalid.
      *
      * @public
      */
    inline def parseLink(link: String): typingsJapgolly.firebaseAuth.distSrcCoreActionCodeUrlMod.ActionCodeURL | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLink")(link.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreActionCodeUrlMod.ActionCodeURL | Null]
  }
  
  @JSImport("@firebase/auth/dist", "AuthCredential")
  @js.native
  open class AuthCredential protected ()
    extends typingsJapgolly.firebaseAuth.distSrcMod.AuthCredential {
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
  
  object AuthErrorCodes {
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.ADMIN_ONLY_OPERATION")
    @js.native
    val ADMIN_ONLY_OPERATION: `authSlashadmin-restricted-operation` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.ALREADY_INITIALIZED")
    @js.native
    val ALREADY_INITIALIZED: `authSlashalready-initialized` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.APP_NOT_AUTHORIZED")
    @js.native
    val APP_NOT_AUTHORIZED: `authSlashapp-not-authorized` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.APP_NOT_INSTALLED")
    @js.native
    val APP_NOT_INSTALLED: `authSlashapp-not-installed` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.ARGUMENT_ERROR")
    @js.native
    val ARGUMENT_ERROR: `authSlashargument-error` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.CAPTCHA_CHECK_FAILED")
    @js.native
    val CAPTCHA_CHECK_FAILED: `authSlashcaptcha-check-failed` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.CODE_EXPIRED")
    @js.native
    val CODE_EXPIRED: `authSlashcode-expired` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.CORDOVA_NOT_READY")
    @js.native
    val CORDOVA_NOT_READY: `authSlashcordova-not-ready` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.CORS_UNSUPPORTED")
    @js.native
    val CORS_UNSUPPORTED: `authSlashcors-unsupported` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.CREDENTIAL_ALREADY_IN_USE")
    @js.native
    val CREDENTIAL_ALREADY_IN_USE: `authSlashcredential-already-in-use` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.CREDENTIAL_MISMATCH")
    @js.native
    val CREDENTIAL_MISMATCH: `authSlashcustom-token-mismatch` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.CREDENTIAL_TOO_OLD_LOGIN_AGAIN")
    @js.native
    val CREDENTIAL_TOO_OLD_LOGIN_AGAIN: `authSlashrequires-recent-login` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.DEPENDENT_SDK_INIT_BEFORE_AUTH")
    @js.native
    val DEPENDENT_SDK_INIT_BEFORE_AUTH: `authSlashdependent-sdk-initialized-before-auth` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.DYNAMIC_LINK_NOT_ACTIVATED")
    @js.native
    val DYNAMIC_LINK_NOT_ACTIVATED: `authSlashdynamic-link-not-activated` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.EMAIL_CHANGE_NEEDS_VERIFICATION")
    @js.native
    val EMAIL_CHANGE_NEEDS_VERIFICATION: `authSlashemail-change-needs-verification` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.EMAIL_EXISTS")
    @js.native
    val EMAIL_EXISTS: `authSlashemail-already-in-use` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.EMULATOR_CONFIG_FAILED")
    @js.native
    val EMULATOR_CONFIG_FAILED: `authSlashemulator-config-failed` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.EXPIRED_OOB_CODE")
    @js.native
    val EXPIRED_OOB_CODE: `authSlashexpired-action-code` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.EXPIRED_POPUP_REQUEST")
    @js.native
    val EXPIRED_POPUP_REQUEST: `authSlashcancelled-popup-request` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.INTERNAL_ERROR")
    @js.native
    val INTERNAL_ERROR: `authSlashinternal-error` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.INVALID_API_KEY")
    @js.native
    val INVALID_API_KEY: `authSlashinvalid-api-key` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.INVALID_APP_CREDENTIAL")
    @js.native
    val INVALID_APP_CREDENTIAL: `authSlashinvalid-app-credential` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.INVALID_APP_ID")
    @js.native
    val INVALID_APP_ID: `authSlashinvalid-app-id` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.INVALID_AUTH")
    @js.native
    val INVALID_AUTH: `authSlashinvalid-user-token` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.INVALID_AUTH_EVENT")
    @js.native
    val INVALID_AUTH_EVENT: `authSlashinvalid-auth-event` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.INVALID_CERT_HASH")
    @js.native
    val INVALID_CERT_HASH: `authSlashinvalid-cert-hash` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.INVALID_CODE")
    @js.native
    val INVALID_CODE: `authSlashinvalid-verification-code` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.INVALID_CONTINUE_URI")
    @js.native
    val INVALID_CONTINUE_URI: `authSlashinvalid-continue-uri` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.INVALID_CORDOVA_CONFIGURATION")
    @js.native
    val INVALID_CORDOVA_CONFIGURATION: `authSlashinvalid-cordova-configuration` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.INVALID_CUSTOM_TOKEN")
    @js.native
    val INVALID_CUSTOM_TOKEN: `authSlashinvalid-custom-token` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.INVALID_DYNAMIC_LINK_DOMAIN")
    @js.native
    val INVALID_DYNAMIC_LINK_DOMAIN: `authSlashinvalid-dynamic-link-domain` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.INVALID_EMAIL")
    @js.native
    val INVALID_EMAIL: `authSlashinvalid-email` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.INVALID_EMULATOR_SCHEME")
    @js.native
    val INVALID_EMULATOR_SCHEME: `authSlashinvalid-emulator-scheme` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.INVALID_IDP_RESPONSE")
    @js.native
    val INVALID_IDP_RESPONSE: `authSlashinvalid-credential` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.INVALID_MESSAGE_PAYLOAD")
    @js.native
    val INVALID_MESSAGE_PAYLOAD: `authSlashinvalid-message-payload` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.INVALID_MFA_SESSION")
    @js.native
    val INVALID_MFA_SESSION: `authSlashinvalid-multi-factor-session` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.INVALID_OAUTH_CLIENT_ID")
    @js.native
    val INVALID_OAUTH_CLIENT_ID: `authSlashinvalid-oauth-client-id` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.INVALID_OAUTH_PROVIDER")
    @js.native
    val INVALID_OAUTH_PROVIDER: `authSlashinvalid-oauth-provider` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.INVALID_OOB_CODE")
    @js.native
    val INVALID_OOB_CODE: `authSlashinvalid-action-code` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.INVALID_ORIGIN")
    @js.native
    val INVALID_ORIGIN: `authSlashunauthorized-domain` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.INVALID_PASSWORD")
    @js.native
    val INVALID_PASSWORD: `authSlashwrong-password` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.INVALID_PERSISTENCE")
    @js.native
    val INVALID_PERSISTENCE: `authSlashinvalid-persistence-type` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.INVALID_PHONE_NUMBER")
    @js.native
    val INVALID_PHONE_NUMBER: `authSlashinvalid-phone-number` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.INVALID_PROVIDER_ID")
    @js.native
    val INVALID_PROVIDER_ID: `authSlashinvalid-provider-id` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.INVALID_RECIPIENT_EMAIL")
    @js.native
    val INVALID_RECIPIENT_EMAIL: `authSlashinvalid-recipient-email` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.INVALID_SENDER")
    @js.native
    val INVALID_SENDER: `authSlashinvalid-sender` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.INVALID_SESSION_INFO")
    @js.native
    val INVALID_SESSION_INFO: `authSlashinvalid-verification-id` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.INVALID_TENANT_ID")
    @js.native
    val INVALID_TENANT_ID: `authSlashinvalid-tenant-id` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.MFA_INFO_NOT_FOUND")
    @js.native
    val MFA_INFO_NOT_FOUND: `authSlashmulti-factor-info-not-found` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.MFA_REQUIRED")
    @js.native
    val MFA_REQUIRED: `authSlashmulti-factor-auth-required` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.MISSING_ANDROID_PACKAGE_NAME")
    @js.native
    val MISSING_ANDROID_PACKAGE_NAME: `authSlashmissing-android-pkg-name` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.MISSING_APP_CREDENTIAL")
    @js.native
    val MISSING_APP_CREDENTIAL: `authSlashmissing-app-credential` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.MISSING_AUTH_DOMAIN")
    @js.native
    val MISSING_AUTH_DOMAIN: `authSlashauth-domain-config-required` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.MISSING_CODE")
    @js.native
    val MISSING_CODE: `authSlashmissing-verification-code` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.MISSING_CONTINUE_URI")
    @js.native
    val MISSING_CONTINUE_URI: `authSlashmissing-continue-uri` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.MISSING_IFRAME_START")
    @js.native
    val MISSING_IFRAME_START: `authSlashmissing-iframe-start` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.MISSING_IOS_BUNDLE_ID")
    @js.native
    val MISSING_IOS_BUNDLE_ID: `authSlashmissing-ios-bundle-id` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.MISSING_MFA_INFO")
    @js.native
    val MISSING_MFA_INFO: `authSlashmissing-multi-factor-info` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.MISSING_MFA_SESSION")
    @js.native
    val MISSING_MFA_SESSION: `authSlashmissing-multi-factor-session` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.MISSING_OR_INVALID_NONCE")
    @js.native
    val MISSING_OR_INVALID_NONCE: `authSlashmissing-or-invalid-nonce` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.MISSING_PHONE_NUMBER")
    @js.native
    val MISSING_PHONE_NUMBER: `authSlashmissing-phone-number` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.MISSING_SESSION_INFO")
    @js.native
    val MISSING_SESSION_INFO: `authSlashmissing-verification-id` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.MODULE_DESTROYED")
    @js.native
    val MODULE_DESTROYED: `authSlashapp-deleted` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.NEED_CONFIRMATION")
    @js.native
    val NEED_CONFIRMATION: `authSlashaccount-exists-with-different-credential` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.NETWORK_REQUEST_FAILED")
    @js.native
    val NETWORK_REQUEST_FAILED: `authSlashnetwork-request-failed` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.NO_AUTH_EVENT")
    @js.native
    val NO_AUTH_EVENT: `authSlashno-auth-event` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.NO_SUCH_PROVIDER")
    @js.native
    val NO_SUCH_PROVIDER: `authSlashno-such-provider` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.NULL_USER")
    @js.native
    val NULL_USER: `authSlashnull-user` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.OPERATION_NOT_ALLOWED")
    @js.native
    val OPERATION_NOT_ALLOWED: `authSlashoperation-not-allowed` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.OPERATION_NOT_SUPPORTED")
    @js.native
    val OPERATION_NOT_SUPPORTED: `authSlashoperation-not-supported-in-this-environment` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.POPUP_BLOCKED")
    @js.native
    val POPUP_BLOCKED: `authSlashpopup-blocked` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.POPUP_CLOSED_BY_USER")
    @js.native
    val POPUP_CLOSED_BY_USER: `authSlashpopup-closed-by-user` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.PROVIDER_ALREADY_LINKED")
    @js.native
    val PROVIDER_ALREADY_LINKED: `authSlashprovider-already-linked` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.QUOTA_EXCEEDED")
    @js.native
    val QUOTA_EXCEEDED: `authSlashquota-exceeded` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.REDIRECT_CANCELLED_BY_USER")
    @js.native
    val REDIRECT_CANCELLED_BY_USER: `authSlashredirect-cancelled-by-user` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.REDIRECT_OPERATION_PENDING")
    @js.native
    val REDIRECT_OPERATION_PENDING: `authSlashredirect-operation-pending` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.REJECTED_CREDENTIAL")
    @js.native
    val REJECTED_CREDENTIAL: `authSlashrejected-credential` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.SECOND_FACTOR_ALREADY_ENROLLED")
    @js.native
    val SECOND_FACTOR_ALREADY_ENROLLED: `authSlashsecond-factor-already-in-use` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.SECOND_FACTOR_LIMIT_EXCEEDED")
    @js.native
    val SECOND_FACTOR_LIMIT_EXCEEDED: `authSlashmaximum-second-factor-count-exceeded` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.TENANT_ID_MISMATCH")
    @js.native
    val TENANT_ID_MISMATCH: `authSlashtenant-id-mismatch` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.TIMEOUT")
    @js.native
    val TIMEOUT: authSlashtimeout = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.TOKEN_EXPIRED")
    @js.native
    val TOKEN_EXPIRED: `authSlashuser-token-expired` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.TOO_MANY_ATTEMPTS_TRY_LATER")
    @js.native
    val TOO_MANY_ATTEMPTS_TRY_LATER: `authSlashtoo-many-requests` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.UNAUTHORIZED_DOMAIN")
    @js.native
    val UNAUTHORIZED_DOMAIN: `authSlashunauthorized-continue-uri` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.UNSUPPORTED_FIRST_FACTOR")
    @js.native
    val UNSUPPORTED_FIRST_FACTOR: `authSlashunsupported-first-factor` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.UNSUPPORTED_PERSISTENCE")
    @js.native
    val UNSUPPORTED_PERSISTENCE: `authSlashunsupported-persistence-type` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.UNSUPPORTED_TENANT_OPERATION")
    @js.native
    val UNSUPPORTED_TENANT_OPERATION: `authSlashunsupported-tenant-operation` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.UNVERIFIED_EMAIL")
    @js.native
    val UNVERIFIED_EMAIL: `authSlashunverified-email` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.USER_CANCELLED")
    @js.native
    val USER_CANCELLED: `authSlashuser-cancelled` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.USER_DELETED")
    @js.native
    val USER_DELETED: `authSlashuser-not-found` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.USER_DISABLED")
    @js.native
    val USER_DISABLED: `authSlashuser-disabled` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.USER_MISMATCH")
    @js.native
    val USER_MISMATCH: `authSlashuser-mismatch` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.USER_SIGNED_OUT")
    @js.native
    val USER_SIGNED_OUT: `authSlashuser-signed-out` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.WEAK_PASSWORD")
    @js.native
    val WEAK_PASSWORD: `authSlashweak-password` = js.native
    
    @JSImport("@firebase/auth/dist", "AuthErrorCodes.WEB_STORAGE_UNSUPPORTED")
    @js.native
    val WEB_STORAGE_UNSUPPORTED: `authSlashweb-storage-unsupported` = js.native
  }
  
  @JSImport("@firebase/auth/dist", "EmailAuthCredential")
  @js.native
  /** @internal */
  /* private */ open class EmailAuthCredential ()
    extends typingsJapgolly.firebaseAuth.distSrcMod.EmailAuthCredential
  /* static members */
  object EmailAuthCredential {
    
    @JSImport("@firebase/auth/dist", "EmailAuthCredential")
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
  
  @JSImport("@firebase/auth/dist", "EmailAuthProvider")
  @js.native
  open class EmailAuthProvider ()
    extends typingsJapgolly.firebaseAuth.distSrcMod.EmailAuthProvider
  /* static members */
  object EmailAuthProvider {
    
    @JSImport("@firebase/auth/dist", "EmailAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Always set to {@link SignInMethod}.EMAIL_LINK.
      */
    @JSImport("@firebase/auth/dist", "EmailAuthProvider.EMAIL_LINK_SIGN_IN_METHOD")
    @js.native
    val EMAIL_LINK_SIGN_IN_METHOD: emailLink = js.native
    
    /**
      * Always set to {@link SignInMethod}.EMAIL_PASSWORD.
      */
    @JSImport("@firebase/auth/dist", "EmailAuthProvider.EMAIL_PASSWORD_SIGN_IN_METHOD")
    @js.native
    val EMAIL_PASSWORD_SIGN_IN_METHOD: password = js.native
    
    /**
      * Always set to {@link ProviderId}.PASSWORD, even for email link.
      */
    @JSImport("@firebase/auth/dist", "EmailAuthProvider.PROVIDER_ID")
    @js.native
    val PROVIDER_ID: password = js.native
    
    /**
      * Initialize an {@link AuthCredential} using an email and password.
      *
      * @example
      * ```javascript
      * const authCredential = EmailAuthProvider.credential(email, password);
      * const userCredential = await signInWithCredential(auth, authCredential);
      * ```
      *
      * @example
      * ```javascript
      * const userCredential = await signInWithEmailAndPassword(auth, email, password);
      * ```
      *
      * @param email - Email address.
      * @param password - User account password.
      * @returns The auth provider credential.
      */
    inline def credential(email: String, password: String): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsEmailMod.EmailAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(email.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsEmailMod.EmailAuthCredential]
    
    /**
      * Initialize an {@link AuthCredential} using an email and an email link after a sign in with
      * email link operation.
      *
      * @example
      * ```javascript
      * const authCredential = EmailAuthProvider.credentialWithLink(auth, email, emailLink);
      * const userCredential = await signInWithCredential(auth, authCredential);
      * ```
      *
      * @example
      * ```javascript
      * await sendSignInLinkToEmail(auth, email);
      * // Obtain emailLink from user.
      * const userCredential = await signInWithEmailLink(auth, email, emailLink);
      * ```
      *
      * @param auth - The {@link Auth} instance used to verify the link.
      * @param email - Email address.
      * @param emailLink - Sign-in email link.
      * @returns - The auth provider credential.
      */
    inline def credentialWithLink(email: String, emailLink: String): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsEmailMod.EmailAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credentialWithLink")(email.asInstanceOf[js.Any], emailLink.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsEmailMod.EmailAuthCredential]
  }
  
  @JSImport("@firebase/auth/dist", "FacebookAuthProvider")
  @js.native
  open class FacebookAuthProvider ()
    extends typingsJapgolly.firebaseAuth.distSrcMod.FacebookAuthProvider
  /* static members */
  object FacebookAuthProvider {
    
    @JSImport("@firebase/auth/dist", "FacebookAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /** Always set to {@link SignInMethod}.FACEBOOK. */
    @JSImport("@firebase/auth/dist", "FacebookAuthProvider.FACEBOOK_SIGN_IN_METHOD")
    @js.native
    val FACEBOOK_SIGN_IN_METHOD: facebookDotcom = js.native
    
    /** Always set to {@link ProviderId}.FACEBOOK. */
    @JSImport("@firebase/auth/dist", "FacebookAuthProvider.PROVIDER_ID")
    @js.native
    val PROVIDER_ID: facebookDotcom = js.native
    
    /**
      * Creates a credential for Facebook.
      *
      * @example
      * ```javascript
      * // `event` from the Facebook auth.authResponseChange callback.
      * const credential = FacebookAuthProvider.credential(event.authResponse.accessToken);
      * const result = await signInWithCredential(credential);
      * ```
      *
      * @param accessToken - Facebook access token.
      */
    inline def credential(accessToken: String): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credential")(accessToken.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential]
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link AuthError} which was
      * thrown during a sign-in, link, or reauthenticate operation.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromError(error: FirebaseError): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromError")(error.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential | Null]
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link UserCredential}.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromResult(userCredential: UserCredential): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromResult")(userCredential.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential | Null]
    
    @JSImport("@firebase/auth/dist", "FacebookAuthProvider.credentialFromTaggedObject")
    @js.native
    def credentialFromTaggedObject: Any = js.native
    inline def credentialFromTaggedObject_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("credentialFromTaggedObject")(x.asInstanceOf[js.Any])
  }
  
  object FactorId {
    
    /** Phone as second factor */
    @JSImport("@firebase/auth/dist", "FactorId.PHONE")
    @js.native
    val PHONE: phone = js.native
  }
  
  @JSImport("@firebase/auth/dist", "GithubAuthProvider")
  @js.native
  open class GithubAuthProvider ()
    extends typingsJapgolly.firebaseAuth.distSrcMod.GithubAuthProvider
  /* static members */
  object GithubAuthProvider {
    
    @JSImport("@firebase/auth/dist", "GithubAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /** Always set to {@link SignInMethod}.GITHUB. */
    @JSImport("@firebase/auth/dist", "GithubAuthProvider.GITHUB_SIGN_IN_METHOD")
    @js.native
    val GITHUB_SIGN_IN_METHOD: githubDotcom = js.native
    
    /** Always set to {@link ProviderId}.GITHUB. */
    @JSImport("@firebase/auth/dist", "GithubAuthProvider.PROVIDER_ID")
    @js.native
    val PROVIDER_ID: githubDotcom = js.native
    
    /**
      * Creates a credential for Github.
      *
      * @param accessToken - Github access token.
      */
    inline def credential(accessToken: String): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credential")(accessToken.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential]
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link AuthError} which was
      * thrown during a sign-in, link, or reauthenticate operation.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromError(error: FirebaseError): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromError")(error.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential | Null]
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link UserCredential}.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromResult(userCredential: UserCredential): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromResult")(userCredential.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential | Null]
    
    @JSImport("@firebase/auth/dist", "GithubAuthProvider.credentialFromTaggedObject")
    @js.native
    def credentialFromTaggedObject: Any = js.native
    inline def credentialFromTaggedObject_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("credentialFromTaggedObject")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@firebase/auth/dist", "GoogleAuthProvider")
  @js.native
  open class GoogleAuthProvider ()
    extends typingsJapgolly.firebaseAuth.distSrcMod.GoogleAuthProvider
  /* static members */
  object GoogleAuthProvider {
    
    @JSImport("@firebase/auth/dist", "GoogleAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /** Always set to {@link SignInMethod}.GOOGLE. */
    @JSImport("@firebase/auth/dist", "GoogleAuthProvider.GOOGLE_SIGN_IN_METHOD")
    @js.native
    val GOOGLE_SIGN_IN_METHOD: googleDotcom = js.native
    
    /** Always set to {@link ProviderId}.GOOGLE. */
    @JSImport("@firebase/auth/dist", "GoogleAuthProvider.PROVIDER_ID")
    @js.native
    val PROVIDER_ID: googleDotcom = js.native
    
    /**
      * Creates a credential for Google. At least one of ID token and access token is required.
      *
      * @example
      * ```javascript
      * // \`googleUser\` from the onsuccess Google Sign In callback.
      * const credential = GoogleAuthProvider.credential(googleUser.getAuthResponse().id_token);
      * const result = await signInWithCredential(credential);
      * ```
      *
      * @param idToken - Google ID token.
      * @param accessToken - Google access token.
      */
    inline def credential(): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credential")().asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential]
    inline def credential(idToken: String): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credential")(idToken.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential]
    inline def credential(idToken: String, accessToken: String): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(idToken.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential]
    inline def credential(idToken: Null, accessToken: String): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(idToken.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential]
    inline def credential(idToken: Unit, accessToken: String): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(idToken.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential]
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link AuthError} which was
      * thrown during a sign-in, link, or reauthenticate operation.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromError(error: FirebaseError): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromError")(error.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential | Null]
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link UserCredential}.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromResult(userCredential: UserCredential): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromResult")(userCredential.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential | Null]
    
    @JSImport("@firebase/auth/dist", "GoogleAuthProvider.credentialFromTaggedObject")
    @js.native
    def credentialFromTaggedObject: Any = js.native
    inline def credentialFromTaggedObject_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("credentialFromTaggedObject")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@firebase/auth/dist", "OAuthCredential")
  @js.native
  open class OAuthCredential protected ()
    extends typingsJapgolly.firebaseAuth.distSrcMod.OAuthCredential {
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
    
    @JSImport("@firebase/auth/dist", "OAuthCredential")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def _fromParams(params: OAuthCredentialParams): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("_fromParams")(params.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential]
    
    /**
      * Static method to deserialize a JSON representation of an object into an
      * {@link  AuthCredential}.
      *
      * @param json - Input can be either Object or the stringified representation of the object.
      * When string is provided, JSON.parse would be called first.
      *
      * @returns If the JSON input does not represent an {@link  AuthCredential}, null is returned.
      */
    inline def fromJSON(json: String): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential | Null]
    inline def fromJSON(json: js.Object): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential | Null]
  }
  
  @JSImport("@firebase/auth/dist", "OAuthProvider")
  @js.native
  open class OAuthProvider protected ()
    extends typingsJapgolly.firebaseAuth.distSrcMod.OAuthProvider {
    /**
      * Constructor for generic OAuth providers.
      *
      * @param providerId - Provider for which credentials should be generated.
      */
    def this(providerId: String) = this()
  }
  /* static members */
  object OAuthProvider {
    
    @JSImport("@firebase/auth/dist", "OAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link AuthError} which was
      * thrown during a sign-in, link, or reauthenticate operation.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromError(error: FirebaseError): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromError")(error.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential | Null]
    
    inline def credentialFromJSON(json: String): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential]
    /**
      * Creates an {@link OAuthCredential} from a JSON string or a plain object.
      * @param json - A plain object or a JSON string
      */
    inline def credentialFromJSON(json: js.Object): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential]
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link UserCredential}.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromResult(userCredential: UserCredential): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromResult")(userCredential.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential | Null]
    
    @JSImport("@firebase/auth/dist", "OAuthProvider.oauthCredentialFromTaggedObject")
    @js.native
    def oauthCredentialFromTaggedObject: Any = js.native
    inline def oauthCredentialFromTaggedObject_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oauthCredentialFromTaggedObject")(x.asInstanceOf[js.Any])
  }
  
  object OperationType {
    
    /** Operation involving linking an additional provider to an already signed-in user. */
    @JSImport("@firebase/auth/dist", "OperationType.LINK")
    @js.native
    val LINK: link = js.native
    
    /** Operation involving using a provider to reauthenticate an already signed-in user. */
    @JSImport("@firebase/auth/dist", "OperationType.REAUTHENTICATE")
    @js.native
    val REAUTHENTICATE: reauthenticate = js.native
    
    /** Operation involving signing in a user. */
    @JSImport("@firebase/auth/dist", "OperationType.SIGN_IN")
    @js.native
    val SIGN_IN: signIn = js.native
  }
  
  @JSImport("@firebase/auth/dist", "PhoneAuthCredential")
  @js.native
  /* private */ open class PhoneAuthCredential ()
    extends typingsJapgolly.firebaseAuth.distSrcMod.PhoneAuthCredential
  /* static members */
  object PhoneAuthCredential {
    
    @JSImport("@firebase/auth/dist", "PhoneAuthCredential")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def _fromTokenResponse(phoneNumber: String, temporaryProof: String): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsPhoneMod.PhoneAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromTokenResponse")(phoneNumber.asInstanceOf[js.Any], temporaryProof.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsPhoneMod.PhoneAuthCredential]
    
    /** @internal */
    inline def _fromVerification(verificationId: String, verificationCode: String): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsPhoneMod.PhoneAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromVerification")(verificationId.asInstanceOf[js.Any], verificationCode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsPhoneMod.PhoneAuthCredential]
    
    inline def fromJSON(json: String): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsPhoneMod.PhoneAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsPhoneMod.PhoneAuthCredential | Null]
    /** Generates a phone credential based on a plain object or a JSON string. */
    inline def fromJSON(json: js.Object): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsPhoneMod.PhoneAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsPhoneMod.PhoneAuthCredential | Null]
  }
  
  @JSImport("@firebase/auth/dist", "PhoneAuthProvider")
  @js.native
  open class PhoneAuthProvider protected ()
    extends typingsJapgolly.firebaseAuth.distSrcPlatformBrowserProvidersPhoneMod.PhoneAuthProvider {
    /**
      * @param auth - The Firebase {@link Auth} instance in which sign-ins should occur.
      *
      */
    def this(auth: Auth) = this()
  }
  /* static members */
  object PhoneAuthProvider {
    
    @JSImport("@firebase/auth/dist", "PhoneAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /** Always set to {@link SignInMethod}.PHONE. */
    @JSImport("@firebase/auth/dist", "PhoneAuthProvider.PHONE_SIGN_IN_METHOD")
    @js.native
    val PHONE_SIGN_IN_METHOD: phone = js.native
    
    /** Always set to {@link ProviderId}.PHONE. */
    @JSImport("@firebase/auth/dist", "PhoneAuthProvider.PROVIDER_ID")
    @js.native
    val PROVIDER_ID: phone = js.native
    
    /**
      * Creates a phone auth credential, given the verification ID from
      * {@link PhoneAuthProvider.verifyPhoneNumber} and the code that was sent to the user's
      * mobile device.
      *
      * @example
      * ```javascript
      * const provider = new PhoneAuthProvider(auth);
      * const verificationId = provider.verifyPhoneNumber(phoneNumber, applicationVerifier);
      * // Obtain verificationCode from the user.
      * const authCredential = PhoneAuthProvider.credential(verificationId, verificationCode);
      * const userCredential = signInWithCredential(auth, authCredential);
      * ```
      *
      * @example
      * An alternative flow is provided using the `signInWithPhoneNumber` method.
      * ```javascript
      * const confirmationResult = await signInWithPhoneNumber(auth, phoneNumber, applicationVerifier);
      * // Obtain verificationCode from the user.
      * const userCredential = await confirmationResult.confirm(verificationCode);
      * ```
      *
      * @param verificationId - The verification ID returned from {@link PhoneAuthProvider.verifyPhoneNumber}.
      * @param verificationCode - The verification code sent to the user's mobile device.
      *
      * @returns The auth provider credential.
      */
    inline def credential(verificationId: String, verificationCode: String): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsPhoneMod.PhoneAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(verificationId.asInstanceOf[js.Any], verificationCode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsPhoneMod.PhoneAuthCredential]
    
    /**
      * Returns an {@link AuthCredential} when passed an error.
      *
      * @remarks
      *
      * This method works for errors like
      * `auth/account-exists-with-different-credentials`. This is useful for
      * recovering when attempting to set a user's phone number but the number
      * in question is already tied to another account. For example, the following
      * code tries to update the current user's phone number, and if that
      * fails, links the user with the account associated with that number:
      *
      * ```js
      * const provider = new PhoneAuthProvider(auth);
      * const verificationId = await provider.verifyPhoneNumber(number, verifier);
      * try {
      *   const code = ''; // Prompt the user for the verification code
      *   await updatePhoneNumber(
      *       auth.currentUser,
      *       PhoneAuthProvider.credential(verificationId, code));
      * } catch (e) {
      *   if ((e as FirebaseError)?.code === 'auth/account-exists-with-different-credential') {
      *     const cred = PhoneAuthProvider.credentialFromError(e);
      *     await linkWithCredential(auth.currentUser, cred);
      *   }
      * }
      *
      * // At this point, auth.currentUser.phoneNumber === number.
      * ```
      *
      * @param error - The error to generate a credential from.
      */
    inline def credentialFromError(error: FirebaseError): typingsJapgolly.firebaseAuth.distSrcCoreMod.AuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromError")(error.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreMod.AuthCredential | Null]
    
    /**
      * Generates an {@link AuthCredential} from a {@link UserCredential}.
      * @param userCredential - The user credential.
      */
    inline def credentialFromResult(userCredential: UserCredential): typingsJapgolly.firebaseAuth.distSrcCoreMod.AuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromResult")(userCredential.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreMod.AuthCredential | Null]
    
    @JSImport("@firebase/auth/dist", "PhoneAuthProvider.credentialFromTaggedObject")
    @js.native
    def credentialFromTaggedObject: Any = js.native
    inline def credentialFromTaggedObject_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("credentialFromTaggedObject")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@firebase/auth/dist", "PhoneMultiFactorGenerator")
  @js.native
  /* private */ open class PhoneMultiFactorGenerator ()
    extends typingsJapgolly.firebaseAuth.distSrcPlatformBrowserMfaAssertionsPhoneMod.PhoneMultiFactorGenerator
  /* static members */
  object PhoneMultiFactorGenerator {
    
    @JSImport("@firebase/auth/dist", "PhoneMultiFactorGenerator")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The identifier of the phone second factor: `phone`.
      */
    @JSImport("@firebase/auth/dist", "PhoneMultiFactorGenerator.FACTOR_ID")
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
    inline def assertion(credential: typingsJapgolly.firebaseAuth.distSrcCoreCredentialsPhoneMod.PhoneAuthCredential): PhoneMultiFactorAssertion = ^.asInstanceOf[js.Dynamic].applyDynamic("assertion")(credential.asInstanceOf[js.Any]).asInstanceOf[PhoneMultiFactorAssertion]
  }
  
  object ProviderId {
    
    /** Facebook provider ID */
    @JSImport("@firebase/auth/dist", "ProviderId.FACEBOOK")
    @js.native
    val FACEBOOK: facebookDotcom = js.native
    
    /** GitHub provider ID */
    @JSImport("@firebase/auth/dist", "ProviderId.GITHUB")
    @js.native
    val GITHUB: githubDotcom = js.native
    
    /** Google provider ID */
    @JSImport("@firebase/auth/dist", "ProviderId.GOOGLE")
    @js.native
    val GOOGLE: googleDotcom = js.native
    
    /** Password provider */
    @JSImport("@firebase/auth/dist", "ProviderId.PASSWORD")
    @js.native
    val PASSWORD: password = js.native
    
    /** Phone provider */
    @JSImport("@firebase/auth/dist", "ProviderId.PHONE")
    @js.native
    val PHONE: phone = js.native
    
    /** Twitter provider ID */
    @JSImport("@firebase/auth/dist", "ProviderId.TWITTER")
    @js.native
    val TWITTER: twitterDotcom = js.native
  }
  
  @JSImport("@firebase/auth/dist", "RecaptchaVerifier")
  @js.native
  open class RecaptchaVerifier protected ()
    extends typingsJapgolly.firebaseAuth.distSrcPlatformBrowserRecaptchaRecaptchaVerifierMod.RecaptchaVerifier {
    def this(containerOrId: String, parameters: RecaptchaParameters, authExtern: Auth) = this()
    /**
      *
      * @param containerOrId - The reCAPTCHA container parameter.
      *
      * @remarks
      * This has different meaning depending on whether the reCAPTCHA is hidden or visible. For a
      * visible reCAPTCHA the container must be empty. If a string is used, it has to correspond to
      * an element ID. The corresponding element must also must be in the DOM at the time of
      * initialization.
      *
      * @param parameters - The optional reCAPTCHA parameters.
      *
      * @remarks
      * Check the reCAPTCHA docs for a comprehensive list. All parameters are accepted except for
      * the sitekey. Firebase Auth backend provisions a reCAPTCHA for each project and will
      * configure this upon rendering. For an invisible reCAPTCHA, a size key must have the value
      * 'invisible'.
      *
      * @param authExtern - The corresponding Firebase {@link Auth} instance.
      */
    def this(containerOrId: HTMLElement, parameters: RecaptchaParameters, authExtern: Auth) = this()
  }
  
  @JSImport("@firebase/auth/dist", "SAMLAuthProvider")
  @js.native
  open class SAMLAuthProvider protected ()
    extends typingsJapgolly.firebaseAuth.distSrcMod.SAMLAuthProvider {
    /**
      * Constructor. The providerId must start with "saml."
      * @param providerId - SAML provider ID.
      */
    def this(providerId: String) = this()
  }
  /* static members */
  object SAMLAuthProvider {
    
    @JSImport("@firebase/auth/dist", "SAMLAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link AuthError} which was
      * thrown during a sign-in, link, or reauthenticate operation.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromError(error: FirebaseError): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsMod.AuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromError")(error.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsMod.AuthCredential | Null]
    
    /**
      * Creates an {@link AuthCredential} from a JSON string or a plain object.
      * @param json - A plain object or a JSON string
      */
    inline def credentialFromJSON(json: String): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsMod.AuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsMod.AuthCredential]
    inline def credentialFromJSON(json: js.Object): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsMod.AuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsMod.AuthCredential]
    
    /**
      * Generates an {@link AuthCredential} from a {@link UserCredential} after a
      * successful SAML flow completes.
      *
      * @remarks
      *
      * For example, to get an {@link AuthCredential}, you could write the
      * following code:
      *
      * ```js
      * const userCredential = await signInWithPopup(auth, samlProvider);
      * const credential = SAMLAuthProvider.credentialFromResult(userCredential);
      * ```
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromResult(userCredential: UserCredential): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsMod.AuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromResult")(userCredential.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsMod.AuthCredential | Null]
    
    @JSImport("@firebase/auth/dist", "SAMLAuthProvider.samlCredentialFromTaggedObject")
    @js.native
    def samlCredentialFromTaggedObject: Any = js.native
    inline def samlCredentialFromTaggedObject_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("samlCredentialFromTaggedObject")(x.asInstanceOf[js.Any])
  }
  
  object SignInMethod {
    
    /** Email link sign in method */
    @JSImport("@firebase/auth/dist", "SignInMethod.EMAIL_LINK")
    @js.native
    val EMAIL_LINK: emailLink = js.native
    
    /** Email/password sign in method */
    @JSImport("@firebase/auth/dist", "SignInMethod.EMAIL_PASSWORD")
    @js.native
    val EMAIL_PASSWORD: password = js.native
    
    /** Facebook sign in method */
    @JSImport("@firebase/auth/dist", "SignInMethod.FACEBOOK")
    @js.native
    val FACEBOOK: facebookDotcom = js.native
    
    /** GitHub sign in method */
    @JSImport("@firebase/auth/dist", "SignInMethod.GITHUB")
    @js.native
    val GITHUB: githubDotcom = js.native
    
    /** Google sign in method */
    @JSImport("@firebase/auth/dist", "SignInMethod.GOOGLE")
    @js.native
    val GOOGLE: googleDotcom = js.native
    
    /** Phone sign in method */
    @JSImport("@firebase/auth/dist", "SignInMethod.PHONE")
    @js.native
    val PHONE: phone = js.native
    
    /** Twitter sign in method */
    @JSImport("@firebase/auth/dist", "SignInMethod.TWITTER")
    @js.native
    val TWITTER: twitterDotcom = js.native
  }
  
  @JSImport("@firebase/auth/dist", "TwitterAuthProvider")
  @js.native
  open class TwitterAuthProvider ()
    extends typingsJapgolly.firebaseAuth.distSrcMod.TwitterAuthProvider
  /* static members */
  object TwitterAuthProvider {
    
    @JSImport("@firebase/auth/dist", "TwitterAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /** Always set to {@link ProviderId}.TWITTER. */
    @JSImport("@firebase/auth/dist", "TwitterAuthProvider.PROVIDER_ID")
    @js.native
    val PROVIDER_ID: twitterDotcom = js.native
    
    /** Always set to {@link SignInMethod}.TWITTER. */
    @JSImport("@firebase/auth/dist", "TwitterAuthProvider.TWITTER_SIGN_IN_METHOD")
    @js.native
    val TWITTER_SIGN_IN_METHOD: twitterDotcom = js.native
    
    /**
      * Creates a credential for Twitter.
      *
      * @param token - Twitter access token.
      * @param secret - Twitter secret.
      */
    inline def credential(token: String, secret: String): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(token.asInstanceOf[js.Any], secret.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential]
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link AuthError} which was
      * thrown during a sign-in, link, or reauthenticate operation.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromError(error: FirebaseError): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromError")(error.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential | Null]
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link UserCredential}.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromResult(userCredential: UserCredential): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromResult")(userCredential.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential | Null]
    
    @JSImport("@firebase/auth/dist", "TwitterAuthProvider.credentialFromTaggedObject")
    @js.native
    def credentialFromTaggedObject: Any = js.native
    inline def credentialFromTaggedObject_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("credentialFromTaggedObject")(x.asInstanceOf[js.Any])
  }
  
  inline def applyActionCode(auth: Auth, oobCode: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyActionCode")(auth.asInstanceOf[js.Any], oobCode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def beforeAuthStateChanged(auth: Auth, callback: js.Function1[/* user */ User | Null, Unit | js.Promise[Unit]]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeAuthStateChanged")(auth.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def beforeAuthStateChanged(
    auth: Auth,
    callback: js.Function1[/* user */ User | Null, Unit | js.Promise[Unit]],
    onAbort: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeAuthStateChanged")(auth.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], onAbort.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  @JSImport("@firebase/auth/dist", "browserLocalPersistence")
  @js.native
  val browserLocalPersistence: Persistence = js.native
  
  @JSImport("@firebase/auth/dist", "browserPopupRedirectResolver")
  @js.native
  val browserPopupRedirectResolver: PopupRedirectResolver = js.native
  
  @JSImport("@firebase/auth/dist", "browserSessionPersistence")
  @js.native
  val browserSessionPersistence: Persistence = js.native
  
  inline def checkActionCode(auth: Auth, oobCode: String): js.Promise[ActionCodeInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkActionCode")(auth.asInstanceOf[js.Any], oobCode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ActionCodeInfo]]
  
  inline def confirmPasswordReset(auth: Auth, oobCode: String, newPassword: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("confirmPasswordReset")(auth.asInstanceOf[js.Any], oobCode.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def connectAuthEmulator(auth: Auth, url: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectAuthEmulator")(auth.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectAuthEmulator(auth: Auth, url: String, options: DisableWarnings): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectAuthEmulator")(auth.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createUserWithEmailAndPassword(auth: Auth, email: String, password: String): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUserWithEmailAndPassword")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  @JSImport("@firebase/auth/dist", "debugErrorMap")
  @js.native
  val debugErrorMap: AuthErrorMap = js.native
  
  inline def deleteUser(user: User): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteUser")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def fetchSignInMethodsForEmail(auth: Auth, email: String): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchSignInMethodsForEmail")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def getAdditionalUserInfo(userCredential: UserCredential): AdditionalUserInfo | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdditionalUserInfo")(userCredential.asInstanceOf[js.Any]).asInstanceOf[AdditionalUserInfo | Null]
  
  inline def getAuth(): Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuth")().asInstanceOf[Auth]
  inline def getAuth(app: FirebaseApp): Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuth")(app.asInstanceOf[js.Any]).asInstanceOf[Auth]
  
  inline def getIdToken(user: User): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIdToken")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getIdToken(user: User, forceRefresh: Boolean): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIdToken")(user.asInstanceOf[js.Any], forceRefresh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getIdTokenResult(user: User): js.Promise[IdTokenResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIdTokenResult")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IdTokenResult]]
  inline def getIdTokenResult(user: User, forceRefresh: Boolean): js.Promise[IdTokenResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIdTokenResult")(user.asInstanceOf[js.Any], forceRefresh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IdTokenResult]]
  
  inline def getMultiFactorResolver(auth: Auth, error: MultiFactorError): MultiFactorResolver = (^.asInstanceOf[js.Dynamic].applyDynamic("getMultiFactorResolver")(auth.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MultiFactorResolver]
  
  inline def getRedirectResult(auth: Auth): js.Promise[UserCredential | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRedirectResult")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UserCredential | Null]]
  inline def getRedirectResult(auth: Auth, resolver: PopupRedirectResolver): js.Promise[UserCredential | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRedirectResult")(auth.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential | Null]]
  
  @JSImport("@firebase/auth/dist", "inMemoryPersistence")
  @js.native
  val inMemoryPersistence: Persistence = js.native
  
  @JSImport("@firebase/auth/dist", "indexedDBLocalPersistence")
  @js.native
  val indexedDBLocalPersistence: Persistence = js.native
  
  inline def initializeAuth(app: FirebaseApp): Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeAuth")(app.asInstanceOf[js.Any]).asInstanceOf[Auth]
  inline def initializeAuth(app: FirebaseApp, deps: Dependencies): Auth = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeAuth")(app.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Auth]
  
  inline def isSignInWithEmailLink(auth: Auth, emailLink: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSignInWithEmailLink")(auth.asInstanceOf[js.Any], emailLink.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def linkWithCredential(user: User, credential: typingsJapgolly.firebaseAuth.distSrcCoreCredentialsMod.AuthCredential): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkWithCredential")(user.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def linkWithPhoneNumber(user: User, phoneNumber: String, appVerifier: ApplicationVerifier): js.Promise[ConfirmationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkWithPhoneNumber")(user.asInstanceOf[js.Any], phoneNumber.asInstanceOf[js.Any], appVerifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConfirmationResult]]
  
  inline def linkWithPopup(user: User, provider: AuthProvider): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkWithPopup")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  inline def linkWithPopup(user: User, provider: AuthProvider, resolver: PopupRedirectResolver): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkWithPopup")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def linkWithRedirect(user: User, provider: AuthProvider): js.Promise[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkWithRedirect")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Nothing]]
  inline def linkWithRedirect(user: User, provider: AuthProvider, resolver: PopupRedirectResolver): js.Promise[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkWithRedirect")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Nothing]]
  
  inline def multiFactor(user: User): MultiFactorUser = ^.asInstanceOf[js.Dynamic].applyDynamic("multiFactor")(user.asInstanceOf[js.Any]).asInstanceOf[MultiFactorUser]
  
  inline def onAuthStateChanged(auth: Auth, nextOrObserver: NextOrObserver[User]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onAuthStateChanged")(auth.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onAuthStateChanged(auth: Auth, nextOrObserver: NextOrObserver[User], error: Unit, completed: CompleteFn): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onAuthStateChanged")(auth.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any], completed.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onAuthStateChanged(auth: Auth, nextOrObserver: NextOrObserver[User], error: ErrorFn): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onAuthStateChanged")(auth.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onAuthStateChanged(auth: Auth, nextOrObserver: NextOrObserver[User], error: ErrorFn, completed: CompleteFn): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onAuthStateChanged")(auth.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any], completed.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onIdTokenChanged(auth: Auth, nextOrObserver: NextOrObserver[User]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onIdTokenChanged")(auth.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onIdTokenChanged(auth: Auth, nextOrObserver: NextOrObserver[User], error: Unit, completed: CompleteFn): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onIdTokenChanged")(auth.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any], completed.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onIdTokenChanged(auth: Auth, nextOrObserver: NextOrObserver[User], error: ErrorFn): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onIdTokenChanged")(auth.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onIdTokenChanged(auth: Auth, nextOrObserver: NextOrObserver[User], error: ErrorFn, completed: CompleteFn): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onIdTokenChanged")(auth.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any], completed.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def parseActionCodeURL(link: String): typingsJapgolly.firebaseAuth.distSrcCoreActionCodeUrlMod.ActionCodeURL | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseActionCodeURL")(link.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreActionCodeUrlMod.ActionCodeURL | Null]
  
  @JSImport("@firebase/auth/dist", "prodErrorMap")
  @js.native
  val prodErrorMap: AuthErrorMap = js.native
  
  inline def reauthenticateWithCredential(user: User, credential: typingsJapgolly.firebaseAuth.distSrcCoreCredentialsMod.AuthCredential): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthenticateWithCredential")(user.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def reauthenticateWithPhoneNumber(user: User, phoneNumber: String, appVerifier: ApplicationVerifier): js.Promise[ConfirmationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthenticateWithPhoneNumber")(user.asInstanceOf[js.Any], phoneNumber.asInstanceOf[js.Any], appVerifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConfirmationResult]]
  
  inline def reauthenticateWithPopup(user: User, provider: AuthProvider): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthenticateWithPopup")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  inline def reauthenticateWithPopup(user: User, provider: AuthProvider, resolver: PopupRedirectResolver): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthenticateWithPopup")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def reauthenticateWithRedirect(user: User, provider: AuthProvider): js.Promise[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthenticateWithRedirect")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Nothing]]
  inline def reauthenticateWithRedirect(user: User, provider: AuthProvider, resolver: PopupRedirectResolver): js.Promise[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthenticateWithRedirect")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Nothing]]
  
  inline def reload(user: User): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def sendEmailVerification(user: User): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendEmailVerification")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def sendEmailVerification(user: User, actionCodeSettings: ActionCodeSettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendEmailVerification")(user.asInstanceOf[js.Any], actionCodeSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def sendPasswordResetEmail(auth: Auth, email: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendPasswordResetEmail")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def sendPasswordResetEmail(auth: Auth, email: String, actionCodeSettings: ActionCodeSettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendPasswordResetEmail")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any], actionCodeSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def sendSignInLinkToEmail(auth: Auth, email: String, actionCodeSettings: ActionCodeSettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendSignInLinkToEmail")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any], actionCodeSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setPersistence(auth: Auth, persistence: Persistence): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setPersistence")(auth.asInstanceOf[js.Any], persistence.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def signInAnonymously(auth: Auth): js.Promise[UserCredential] = ^.asInstanceOf[js.Dynamic].applyDynamic("signInAnonymously")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UserCredential]]
  
  inline def signInWithCredential(auth: Auth, credential: typingsJapgolly.firebaseAuth.distSrcCoreCredentialsMod.AuthCredential): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithCredential")(auth.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def signInWithCustomToken(auth: Auth, customToken: String): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithCustomToken")(auth.asInstanceOf[js.Any], customToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def signInWithEmailAndPassword(auth: Auth, email: String, password: String): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithEmailAndPassword")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def signInWithEmailLink(auth: Auth, email: String): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithEmailLink")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  inline def signInWithEmailLink(auth: Auth, email: String, emailLink: String): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithEmailLink")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any], emailLink.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def signInWithPhoneNumber(auth: Auth, phoneNumber: String, appVerifier: ApplicationVerifier): js.Promise[ConfirmationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithPhoneNumber")(auth.asInstanceOf[js.Any], phoneNumber.asInstanceOf[js.Any], appVerifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConfirmationResult]]
  
  inline def signInWithPopup(auth: Auth, provider: AuthProvider): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithPopup")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  inline def signInWithPopup(auth: Auth, provider: AuthProvider, resolver: PopupRedirectResolver): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithPopup")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def signInWithRedirect(auth: Auth, provider: AuthProvider): js.Promise[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithRedirect")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Nothing]]
  inline def signInWithRedirect(auth: Auth, provider: AuthProvider, resolver: PopupRedirectResolver): js.Promise[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithRedirect")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Nothing]]
  
  inline def signOut(auth: Auth): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("signOut")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def unlink(user: User, providerId: String): js.Promise[User] = (^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(user.asInstanceOf[js.Any], providerId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[User]]
  
  inline def updateCurrentUser(auth: Auth): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateCurrentUser")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def updateCurrentUser(auth: Auth, user: User): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCurrentUser")(auth.asInstanceOf[js.Any], user.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def updateEmail(user: User, newEmail: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateEmail")(user.asInstanceOf[js.Any], newEmail.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def updatePassword(user: User, newPassword: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updatePassword")(user.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def updatePhoneNumber(
    user: User,
    credential: typingsJapgolly.firebaseAuth.distSrcCoreCredentialsPhoneMod.PhoneAuthCredential
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updatePhoneNumber")(user.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def updateProfile(user: User, hasDisplayNamePhotoUrl: DisplayName): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateProfile")(user.asInstanceOf[js.Any], hasDisplayNamePhotoUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def useDeviceLanguage(auth: Auth): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useDeviceLanguage")(auth.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def verifyBeforeUpdateEmail(user: User, newEmail: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyBeforeUpdateEmail")(user.asInstanceOf[js.Any], newEmail.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def verifyBeforeUpdateEmail(user: User, newEmail: String, actionCodeSettings: ActionCodeSettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyBeforeUpdateEmail")(user.asInstanceOf[js.Any], newEmail.asInstanceOf[js.Any], actionCodeSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def verifyPasswordResetCode(auth: Auth, code: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyPasswordResetCode")(auth.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  /* augmented module */
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      var auth: Auth
    }
    object NameServiceMapping {
      
      inline def apply(auth: Auth): NameServiceMapping = {
        val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      extension [Self <: NameServiceMapping](x: Self) {
        
        inline def setAuth(value: Auth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      }
    }
  }
}
