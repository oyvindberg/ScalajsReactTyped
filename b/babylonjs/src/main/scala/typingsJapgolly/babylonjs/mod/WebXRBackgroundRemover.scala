package typingsJapgolly.babylonjs.mod

import typingsJapgolly.babylonjs.xRFeaturesWebXRBackgroundRemoverMod.IWebXRBackgroundRemoverOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "WebXRBackgroundRemover")
@js.native
open class WebXRBackgroundRemover protected ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.WebXRBackgroundRemover {
  /**
    * constructs a new background remover module
    * @param _xrSessionManager the session manager for this module
    * @param options read-only options to be used in this module
    */
  def this(_xrSessionManager: typingsJapgolly.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager) = this()
  def this(
    _xrSessionManager: typingsJapgolly.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager,
    /**
    * read-only options to be used in this module
    */
  options: IWebXRBackgroundRemoverOptions
  ) = this()
}
/* static members */
object WebXRBackgroundRemover {
  
  /**
    * The module's name
    */
  @JSImport("babylonjs", "WebXRBackgroundRemover.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSImport("babylonjs", "WebXRBackgroundRemover.Version")
  @js.native
  val Version: Double = js.native
}
