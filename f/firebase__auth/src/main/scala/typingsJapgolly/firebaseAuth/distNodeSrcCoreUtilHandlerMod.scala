package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distNodeSrcModelAuthMod.AuthInternal
import typingsJapgolly.firebaseAuth.distNodeSrcModelPopupRedirectMod.AuthEventType
import typingsJapgolly.firebaseAuth.distNodeSrcModelPublicTypesMod.AuthProvider
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeSrcCoreUtilHandlerMod {
  
  @JSImport("@firebase/auth/dist/node/src/core/util/handler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRedirectUrl(auth: AuthInternal, provider: AuthProvider, authType: AuthEventType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_getRedirectUrl")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], authType.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getRedirectUrl(auth: AuthInternal, provider: AuthProvider, authType: AuthEventType, redirectUrl: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_getRedirectUrl")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], authType.asInstanceOf[js.Any], redirectUrl.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getRedirectUrl(
    auth: AuthInternal,
    provider: AuthProvider,
    authType: AuthEventType,
    redirectUrl: String,
    eventId: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_getRedirectUrl")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], authType.asInstanceOf[js.Any], redirectUrl.asInstanceOf[js.Any], eventId.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getRedirectUrl(
    auth: AuthInternal,
    provider: AuthProvider,
    authType: AuthEventType,
    redirectUrl: String,
    eventId: String,
    additionalParams: Record[String, String]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_getRedirectUrl")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], authType.asInstanceOf[js.Any], redirectUrl.asInstanceOf[js.Any], eventId.asInstanceOf[js.Any], additionalParams.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getRedirectUrl(
    auth: AuthInternal,
    provider: AuthProvider,
    authType: AuthEventType,
    redirectUrl: String,
    eventId: Unit,
    additionalParams: Record[String, String]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_getRedirectUrl")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], authType.asInstanceOf[js.Any], redirectUrl.asInstanceOf[js.Any], eventId.asInstanceOf[js.Any], additionalParams.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getRedirectUrl(
    auth: AuthInternal,
    provider: AuthProvider,
    authType: AuthEventType,
    redirectUrl: Unit,
    eventId: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_getRedirectUrl")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], authType.asInstanceOf[js.Any], redirectUrl.asInstanceOf[js.Any], eventId.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getRedirectUrl(
    auth: AuthInternal,
    provider: AuthProvider,
    authType: AuthEventType,
    redirectUrl: Unit,
    eventId: String,
    additionalParams: Record[String, String]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_getRedirectUrl")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], authType.asInstanceOf[js.Any], redirectUrl.asInstanceOf[js.Any], eventId.asInstanceOf[js.Any], additionalParams.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getRedirectUrl(
    auth: AuthInternal,
    provider: AuthProvider,
    authType: AuthEventType,
    redirectUrl: Unit,
    eventId: Unit,
    additionalParams: Record[String, String]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_getRedirectUrl")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], authType.asInstanceOf[js.Any], redirectUrl.asInstanceOf[js.Any], eventId.asInstanceOf[js.Any], additionalParams.asInstanceOf[js.Any])).asInstanceOf[String]
}
