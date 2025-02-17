package typingsJapgolly.reactNativeFirebaseApp.mod

import typingsJapgolly.reactNativeFirebaseApp.mod.Utils_.FilePath
import typingsJapgolly.reactNativeFirebaseApp.mod.Utils_.Module
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @react-native-firebase/app.@react-native-firebase/app.ReactNativeFirebase.FirebaseModuleWithStatics<@react-native-firebase/app.@react-native-firebase/app.Utils.Module, @react-native-firebase/app.@react-native-firebase/app.Utils.Statics> */
object utils {
  
  inline def apply(): Module = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Module]
  
  @JSImport("@react-native-firebase/app", "utils")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-native-firebase/app", "utils.FilePath")
  @js.native
  def FilePath: typingsJapgolly.reactNativeFirebaseApp.mod.Utils_.FilePath = js.native
  inline def FilePath_=(x: FilePath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FilePath")(x.asInstanceOf[js.Any])
  
  /**
    * This React Native Firebase module version.
    */
  @JSImport("@react-native-firebase/app", "utils.SDK_VERSION")
  @js.native
  val SDK_VERSION: String = js.native
}
