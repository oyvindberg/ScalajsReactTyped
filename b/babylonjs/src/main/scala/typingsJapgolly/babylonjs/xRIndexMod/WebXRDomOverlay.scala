package typingsJapgolly.babylonjs.xRIndexMod

import typingsJapgolly.babylonjs.xRFeaturesWebXRDOMOverlayMod.IWebXRDomOverlayOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/index", "WebXRDomOverlay")
@js.native
open class WebXRDomOverlay protected ()
  extends typingsJapgolly.babylonjs.xRFeaturesIndexMod.WebXRDomOverlay {
  /**
    * Creates a new instance of the dom-overlay feature
    * @param _xrSessionManager an instance of WebXRSessionManager
    * @param options options to use when constructing this feature
    */
  def this(
    _xrSessionManager: typingsJapgolly.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager,
    /**
    * options to use when constructing this feature
    */
  options: IWebXRDomOverlayOptions
  ) = this()
}
/* static members */
object WebXRDomOverlay {
  
  /**
    * The module's name
    */
  @JSImport("babylonjs/XR/index", "WebXRDomOverlay.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSImport("babylonjs/XR/index", "WebXRDomOverlay.Version")
  @js.native
  val Version: Double = js.native
}
