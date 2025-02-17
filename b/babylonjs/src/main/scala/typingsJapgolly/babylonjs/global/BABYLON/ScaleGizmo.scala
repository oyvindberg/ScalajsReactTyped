package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ScaleGizmo")
@js.native
/**
  * Creates a ScaleGizmo
  * @param gizmoLayer The utility layer the gizmo will be added to
  * @param thickness display gizmo axis thickness
  * @param gizmoManager
  */
open class ScaleGizmo ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.ScaleGizmo {
  def this(gizmoLayer: typingsJapgolly.babylonjs.BABYLON.UtilityLayerRenderer) = this()
  def this(gizmoLayer: Unit, thickness: Double) = this()
  def this(gizmoLayer: typingsJapgolly.babylonjs.BABYLON.UtilityLayerRenderer, thickness: Double) = this()
  def this(gizmoLayer: Unit, thickness: Double, gizmoManager: typingsJapgolly.babylonjs.BABYLON.GizmoManager) = this()
  def this(gizmoLayer: Unit, thickness: Unit, gizmoManager: typingsJapgolly.babylonjs.BABYLON.GizmoManager) = this()
  def this(
    gizmoLayer: typingsJapgolly.babylonjs.BABYLON.UtilityLayerRenderer,
    thickness: Double,
    gizmoManager: typingsJapgolly.babylonjs.BABYLON.GizmoManager
  ) = this()
  def this(
    gizmoLayer: typingsJapgolly.babylonjs.BABYLON.UtilityLayerRenderer,
    thickness: Unit,
    gizmoManager: typingsJapgolly.babylonjs.BABYLON.GizmoManager
  ) = this()
  
  /** The root mesh of the gizmo */
  /* CompleteClass */
  var _rootMesh: typingsJapgolly.babylonjs.BABYLON.Mesh = js.native
  
  /**
    * Mesh that the gizmo will be attached to. (eg. on a drag gizmo the mesh that will be dragged)
    * * When set, interactions will be enabled
    */
  /* CompleteClass */
  var attachedMesh: Nullable[typingsJapgolly.babylonjs.BABYLON.AbstractMesh] = js.native
  
  /**
    * Node that the gizmo will be attached to. (eg. on a drag gizmo the mesh, bone or NodeTransform that will be dragged)
    * * When set, interactions will be enabled
    */
  /* CompleteClass */
  var attachedNode: Nullable[typingsJapgolly.babylonjs.BABYLON.Node] = js.native
  
  /**
    * posture that the gizmo will be display
    * When set null, default value will be used (Quaternion(0, 0, 0, 1))
    */
  /* CompleteClass */
  var customRotationQuaternion: Nullable[typingsJapgolly.babylonjs.BABYLON.Quaternion] = js.native
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /** The utility layer the gizmo will be added to */
  /* CompleteClass */
  var gizmoLayer: typingsJapgolly.babylonjs.BABYLON.UtilityLayerRenderer = js.native
  
  /** True when the mouse pointer is hovered a gizmo mesh */
  /* CompleteClass */
  override val isHovered: Boolean = js.native
  
  /** Ratio for the scale of the gizmo */
  /* CompleteClass */
  var scaleRatio: Double = js.native
  
  /** Disposes and replaces the current meshes in the gizmo with the specified mesh */
  /* CompleteClass */
  override def setCustomMesh(mesh: typingsJapgolly.babylonjs.BABYLON.Mesh): Unit = js.native
  
  /**
    * If set the gizmo's position will be updated to match the attached mesh each frame (Default: true)
    */
  /* CompleteClass */
  var updateGizmoPositionToMatchAttachedMesh: Boolean = js.native
  
  /**
    * If set the gizmo's rotation will be updated to match the attached mesh each frame (Default: true)
    */
  /* CompleteClass */
  var updateGizmoRotationToMatchAttachedMesh: Boolean = js.native
  
  /**
    * When set, the gizmo will always appear the same size no matter where the camera is (default: true)
    */
  /* CompleteClass */
  var updateScale: Boolean = js.native
}
