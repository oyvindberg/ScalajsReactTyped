package typingsJapgolly.babylonjs.legacyLegacyMod

import typingsJapgolly.babylonjs.postProcessesPostProcessMod.PostProcessOptions
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "BloomMergePostProcess")
@js.native
open class BloomMergePostProcess protected ()
  extends typingsJapgolly.babylonjs.indexMod.BloomMergePostProcess {
  /**
    * Creates a new instance of @see BloomMergePostProcess
    * @param name The name of the effect.
    * @param originalFromInput Post process which's input will be used for the merge.
    * @param blurred Blurred highlights post process which's output will be used.
    * @param weight Weight of the bloom to be added to the original input.
    * @param options The required width/height ratio to downsize to before computing the render pass.
    * @param camera The camera to apply the render pass to.
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    * @param textureType Type of textures used when performing the post process. (default: 0)
    * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
    */
  def this(
    name: String,
    originalFromInput: typingsJapgolly.babylonjs.postProcessesPostProcessMod.PostProcess,
    blurred: typingsJapgolly.babylonjs.postProcessesPostProcessMod.PostProcess,
    /** Weight of the bloom to be added to the original input. */
  weight: Double,
    options: Double | PostProcessOptions,
    camera: Nullable[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typingsJapgolly.babylonjs.enginesEngineMod.Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double],
    blockCompilation: js.UndefOr[Boolean]
  ) = this()
}
