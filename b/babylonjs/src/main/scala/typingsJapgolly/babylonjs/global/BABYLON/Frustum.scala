package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.DeepImmutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Frustum")
@js.native
open class Frustum ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.Frustum
/* static members */
object Frustum {
  
  @JSGlobal("BABYLON.Frustum")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets the bottom frustum plane transformed by the transform matrix
    * @param transform transformation matrix to be applied to the resulting frustum plane
    * @param frustumPlane the resulting frustum plane
    */
  inline def GetBottomPlaneToRef(
    transform: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    frustumPlane: typingsJapgolly.babylonjs.BABYLON.Plane
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("GetBottomPlaneToRef")(transform.asInstanceOf[js.Any], frustumPlane.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Gets the far frustum plane transformed by the transform matrix
    * @param transform transformation matrix to be applied to the resulting frustum plane
    * @param frustumPlane the resulting frustum plane
    */
  inline def GetFarPlaneToRef(
    transform: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    frustumPlane: typingsJapgolly.babylonjs.BABYLON.Plane
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("GetFarPlaneToRef")(transform.asInstanceOf[js.Any], frustumPlane.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Gets the left frustum plane transformed by the transform matrix
    * @param transform transformation matrix to be applied to the resulting frustum plane
    * @param frustumPlane the resulting frustum plane
    */
  inline def GetLeftPlaneToRef(
    transform: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    frustumPlane: typingsJapgolly.babylonjs.BABYLON.Plane
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("GetLeftPlaneToRef")(transform.asInstanceOf[js.Any], frustumPlane.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Gets the near frustum plane transformed by the transform matrix
    * @param transform transformation matrix to be applied to the resulting frustum plane
    * @param frustumPlane the resulting frustum plane
    */
  inline def GetNearPlaneToRef(
    transform: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    frustumPlane: typingsJapgolly.babylonjs.BABYLON.Plane
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("GetNearPlaneToRef")(transform.asInstanceOf[js.Any], frustumPlane.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Gets the planes representing the frustum
    * @param transform matrix to be applied to the returned planes
    * @returns a new array of 6 Frustum planes computed by the given transformation matrix.
    */
  inline def GetPlanes(transform: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Matrix]): js.Array[typingsJapgolly.babylonjs.BABYLON.Plane] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetPlanes")(transform.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.babylonjs.BABYLON.Plane]]
  
  /**
    * Sets the given array "frustumPlanes" with the 6 Frustum planes computed by the given transformation matrix.
    * @param transform transformation matrix to be applied to the resulting frustum planes
    * @param frustumPlanes the resulting frustum planes
    */
  inline def GetPlanesToRef(
    transform: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    frustumPlanes: js.Array[typingsJapgolly.babylonjs.BABYLON.Plane]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("GetPlanesToRef")(transform.asInstanceOf[js.Any], frustumPlanes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Gets the right frustum plane transformed by the transform matrix
    * @param transform transformation matrix to be applied to the resulting frustum plane
    * @param frustumPlane the resulting frustum plane
    */
  inline def GetRightPlaneToRef(
    transform: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    frustumPlane: typingsJapgolly.babylonjs.BABYLON.Plane
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("GetRightPlaneToRef")(transform.asInstanceOf[js.Any], frustumPlane.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Gets the top frustum plane transformed by the transform matrix
    * @param transform transformation matrix to be applied to the resulting frustum plane
    * @param frustumPlane the resulting frustum plane
    */
  inline def GetTopPlaneToRef(
    transform: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    frustumPlane: typingsJapgolly.babylonjs.BABYLON.Plane
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("GetTopPlaneToRef")(transform.asInstanceOf[js.Any], frustumPlane.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
