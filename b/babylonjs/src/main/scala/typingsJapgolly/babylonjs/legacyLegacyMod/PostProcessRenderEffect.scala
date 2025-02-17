package typingsJapgolly.babylonjs.legacyLegacyMod

import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "PostProcessRenderEffect")
@js.native
open class PostProcessRenderEffect protected ()
  extends typingsJapgolly.babylonjs.indexMod.PostProcessRenderEffect {
  /**
    * Instantiates a post process render effect.
    * A post process can be used to apply a shader to a texture after it is rendered.
    * @param engine The engine the effect is tied to
    * @param name The name of the effect
    * @param getPostProcesses A function that returns a set of post processes which the effect will run in order to be run.
    * @param singleInstance False if this post process can be run on multiple cameras. (default: true)
    */
  def this(
    engine: typingsJapgolly.babylonjs.enginesEngineMod.Engine,
    name: String,
    getPostProcesses: js.Function0[
        Nullable[
          typingsJapgolly.babylonjs.postProcessesPostProcessMod.PostProcess | js.Array[typingsJapgolly.babylonjs.postProcessesPostProcessMod.PostProcess]
        ]
      ]
  ) = this()
  def this(
    engine: typingsJapgolly.babylonjs.enginesEngineMod.Engine,
    name: String,
    getPostProcesses: js.Function0[
        Nullable[
          typingsJapgolly.babylonjs.postProcessesPostProcessMod.PostProcess | js.Array[typingsJapgolly.babylonjs.postProcessesPostProcessMod.PostProcess]
        ]
      ],
    singleInstance: Boolean
  ) = this()
}
