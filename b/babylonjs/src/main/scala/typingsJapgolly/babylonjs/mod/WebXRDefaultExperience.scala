package typingsJapgolly.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "WebXRDefaultExperience")
@js.native
/* private */ open class WebXRDefaultExperience ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.WebXRDefaultExperience
/* static members */
object WebXRDefaultExperience {
  
  @JSImport("babylonjs", "WebXRDefaultExperience")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates the default xr experience
    * @param scene scene
    * @param options options for basic configuration
    * @returns resulting WebXRDefaultExperience
    */
  inline def CreateAsync(scene: typingsJapgolly.babylonjs.sceneMod.Scene): js.Promise[typingsJapgolly.babylonjs.xRWebXRDefaultExperienceMod.WebXRDefaultExperience] = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateAsync")(scene.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.xRWebXRDefaultExperienceMod.WebXRDefaultExperience]]
  inline def CreateAsync(
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    options: typingsJapgolly.babylonjs.xRWebXRDefaultExperienceMod.WebXRDefaultExperienceOptions
  ): js.Promise[typingsJapgolly.babylonjs.xRWebXRDefaultExperienceMod.WebXRDefaultExperience] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAsync")(scene.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.xRWebXRDefaultExperienceMod.WebXRDefaultExperience]]
}
