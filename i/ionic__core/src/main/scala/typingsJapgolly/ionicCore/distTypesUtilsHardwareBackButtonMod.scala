package typingsJapgolly.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsHardwareBackButtonMod {
  
  @JSImport("@ionic/core/dist/types/utils/hardware-back-button", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/core/dist/types/utils/hardware-back-button", "MENU_BACK_BUTTON_PRIORITY")
  @js.native
  val MENU_BACK_BUTTON_PRIORITY: /* 99 */ Double = js.native
  
  @JSImport("@ionic/core/dist/types/utils/hardware-back-button", "OVERLAY_BACK_BUTTON_PRIORITY")
  @js.native
  val OVERLAY_BACK_BUTTON_PRIORITY: /* 100 */ Double = js.native
  
  inline def blockHardwareBackButton(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("blockHardwareBackButton")().asInstanceOf[Unit]
  
  inline def startHardwareBackButton(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startHardwareBackButton")().asInstanceOf[Unit]
}
