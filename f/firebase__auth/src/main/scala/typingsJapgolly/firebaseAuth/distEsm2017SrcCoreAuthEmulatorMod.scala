package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.anon.DisableWarnings
import typingsJapgolly.firebaseAuth.distEsm2017SrcModelPublicTypesMod.Auth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm2017SrcCoreAuthEmulatorMod {
  
  @JSImport("@firebase/auth/dist/esm2017/src/core/auth/emulator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connectAuthEmulator(auth: Auth, url: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectAuthEmulator")(auth.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectAuthEmulator(auth: Auth, url: String, options: DisableWarnings): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectAuthEmulator")(auth.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
