package typingsJapgolly.babylonjs.xRIndexMod

import typingsJapgolly.babylonjs.enginesThinEngineMod.ThinEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/index", "WebXRManagedOutputCanvasOptions")
@js.native
open class WebXRManagedOutputCanvasOptions ()
  extends typingsJapgolly.babylonjs.xRWebXRManagedOutputCanvasMod.WebXRManagedOutputCanvasOptions
/* static members */
object WebXRManagedOutputCanvasOptions {
  
  @JSImport("babylonjs/XR/index", "WebXRManagedOutputCanvasOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get the default values of the configuration object
    * @param engine defines the engine to use (can be null)
    * @returns default values of this configuration object
    */
  inline def GetDefaults(): typingsJapgolly.babylonjs.xRWebXRManagedOutputCanvasMod.WebXRManagedOutputCanvasOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("GetDefaults")().asInstanceOf[typingsJapgolly.babylonjs.xRWebXRManagedOutputCanvasMod.WebXRManagedOutputCanvasOptions]
  inline def GetDefaults(engine: ThinEngine): typingsJapgolly.babylonjs.xRWebXRManagedOutputCanvasMod.WebXRManagedOutputCanvasOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("GetDefaults")(engine.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.xRWebXRManagedOutputCanvasMod.WebXRManagedOutputCanvasOptions]
}
