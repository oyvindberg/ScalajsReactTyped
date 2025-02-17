package typingsJapgolly.babylonjs.legacyLegacyMod

import org.scalajs.dom.File
import typingsJapgolly.babylonjs.loadingSceneLoaderMod.ISceneLoaderProgressEvent
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "FilesInput")
@js.native
open class FilesInput protected ()
  extends typingsJapgolly.babylonjs.indexMod.FilesInput {
  /**
    * Creates a new FilesInput
    * @param engine defines the rendering engine
    * @param scene defines the hosting scene
    * @param sceneLoadedCallback callback called when scene is loaded
    * @param progressCallback callback called to track progress
    * @param additionalRenderLoopLogicCallback callback called to add user logic to the rendering loop
    * @param textureLoadingCallback callback called when a texture is loading
    * @param startingProcessingFilesCallback callback called when the system is about to process all files
    * @param onReloadCallback callback called when a reload is requested
    * @param errorCallback callback call if an error occurs
    */
  def this(
    engine: typingsJapgolly.babylonjs.enginesEngineMod.Engine,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    sceneLoadedCallback: Nullable[
        js.Function2[/* sceneFile */ File, /* scene */ typingsJapgolly.babylonjs.sceneMod.Scene, Unit]
      ],
    progressCallback: Nullable[js.Function1[/* progress */ ISceneLoaderProgressEvent, Unit]],
    additionalRenderLoopLogicCallback: Nullable[js.Function0[Unit]],
    textureLoadingCallback: Nullable[js.Function1[/* remaining */ Double, Unit]],
    startingProcessingFilesCallback: Nullable[js.Function1[/* files */ js.UndefOr[js.Array[File]], Unit]],
    onReloadCallback: Nullable[js.Function1[/* sceneFile */ File, Unit]],
    errorCallback: Nullable[
        js.Function3[
          /* sceneFile */ File, 
          /* scene */ Nullable[typingsJapgolly.babylonjs.sceneMod.Scene], 
          /* message */ String, 
          Unit
        ]
      ]
  ) = this()
}
