package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distNodeSrcModelAuthMod.AuthInternal
import typingsJapgolly.firebaseAuth.gapi.iframes.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeSrcPlatformBrowserIframeGapiMod {
  
  @JSImport("@firebase/auth/dist/node/src/platform_browser/iframe/gapi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadGapi(auth: AuthInternal): js.Promise[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("_loadGapi")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Context]]
  
  inline def resetLoader(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_resetLoader")().asInstanceOf[Unit]
}
