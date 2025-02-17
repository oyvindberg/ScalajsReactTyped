package typingsJapgolly.babylonjs.xRFeaturesIndexMod

import typingsJapgolly.babylonjs.xRFeaturesWebXRControllerTeleportationMod.IWebXRTeleportationOptions
import typingsJapgolly.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/features/index", "WebXRMotionControllerTeleportation")
@js.native
open class WebXRMotionControllerTeleportation protected ()
  extends typingsJapgolly.babylonjs.xRFeaturesWebXRControllerTeleportationMod.WebXRMotionControllerTeleportation {
  /**
    * constructs a new teleportation system
    * @param _xrSessionManager an instance of WebXRSessionManager
    * @param _options configuration object for this feature
    */
  def this(_xrSessionManager: WebXRSessionManager, _options: IWebXRTeleportationOptions) = this()
}
/* static members */
object WebXRMotionControllerTeleportation {
  
  /**
    * The module's name
    */
  @JSImport("babylonjs/XR/features/index", "WebXRMotionControllerTeleportation.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the webxr specs version
    */
  @JSImport("babylonjs/XR/features/index", "WebXRMotionControllerTeleportation.Version")
  @js.native
  val Version: Double = js.native
}
