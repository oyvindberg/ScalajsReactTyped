package typingsJapgolly.babylonjs.mod

import typingsJapgolly.babylonjs.collisionsCollisionCoordinatorMod.ICollisionCoordinator
import typingsJapgolly.babylonjs.sceneMod.SceneOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "Scene")
@js.native
open class Scene protected ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.Scene {
  /**
    * Creates a new Scene
    * @param engine defines the engine to use to render this scene
    * @param options defines the scene options
    */
  def this(engine: typingsJapgolly.babylonjs.enginesEngineMod.Engine) = this()
  def this(engine: typingsJapgolly.babylonjs.enginesEngineMod.Engine, options: SceneOptions) = this()
}
/* static members */
object Scene {
  
  @JSImport("babylonjs", "Scene")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Factory used to create the a collision coordinator.
    * @returns The collision coordinator
    */
  inline def CollisionCoordinatorFactory(): ICollisionCoordinator = ^.asInstanceOf[js.Dynamic].applyDynamic("CollisionCoordinatorFactory")().asInstanceOf[ICollisionCoordinator]
  
  /**
    * Factory used to create the default material.
    * @param scene The scene to create the material for
    * @returns The default material
    */
  inline def DefaultMaterialFactory(scene: typingsJapgolly.babylonjs.sceneMod.Scene): typingsJapgolly.babylonjs.materialsMaterialMod.Material = ^.asInstanceOf[js.Dynamic].applyDynamic("DefaultMaterialFactory")(scene.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.materialsMaterialMod.Material]
  
  /** The fog density is following an exponential function */
  @JSImport("babylonjs", "Scene.FOGMODE_EXP")
  @js.native
  val FOGMODE_EXP: Double = js.native
  
  /** The fog density is following an exponential function faster than FOGMODE_EXP */
  @JSImport("babylonjs", "Scene.FOGMODE_EXP2")
  @js.native
  val FOGMODE_EXP2: Double = js.native
  
  /** The fog density is following a linear function. */
  @JSImport("babylonjs", "Scene.FOGMODE_LINEAR")
  @js.native
  val FOGMODE_LINEAR: Double = js.native
  
  /** The fog is deactivated */
  @JSImport("babylonjs", "Scene.FOGMODE_NONE")
  @js.native
  val FOGMODE_NONE: Double = js.native
  
  /**
    * Gets or sets the maximum deltatime when deterministic lock step is enabled
    * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    */
  @JSImport("babylonjs", "Scene.MaxDeltaTime")
  @js.native
  def MaxDeltaTime: Double = js.native
  inline def MaxDeltaTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MaxDeltaTime")(x.asInstanceOf[js.Any])
  
  /**
    * Gets or sets the minimum deltatime when deterministic lock step is enabled
    * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    */
  @JSImport("babylonjs", "Scene.MinDeltaTime")
  @js.native
  def MinDeltaTime: Double = js.native
  inline def MinDeltaTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MinDeltaTime")(x.asInstanceOf[js.Any])
}
