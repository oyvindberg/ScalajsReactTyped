package typingsJapgolly.firebaseInstallations

import typingsJapgolly.firebaseInstallations.distEsmSrcInterfacesInstallationEntryMod.CompletedAuthToken
import typingsJapgolly.firebaseInstallations.distEsmSrcInterfacesInstallationImplMod.FirebaseInstallationsImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcHelpersRefreshAuthTokenMod {
  
  @JSImport("@firebase/installations/dist/esm/src/helpers/refresh-auth-token", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def refreshAuthToken(installations: FirebaseInstallationsImpl): js.Promise[CompletedAuthToken] = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshAuthToken")(installations.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CompletedAuthToken]]
  inline def refreshAuthToken(installations: FirebaseInstallationsImpl, forceRefresh: Boolean): js.Promise[CompletedAuthToken] = (^.asInstanceOf[js.Dynamic].applyDynamic("refreshAuthToken")(installations.asInstanceOf[js.Any], forceRefresh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompletedAuthToken]]
}
