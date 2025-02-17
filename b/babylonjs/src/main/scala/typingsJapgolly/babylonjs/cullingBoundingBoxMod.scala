package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.cullingBoundingInfoMod.ICullable
import typingsJapgolly.babylonjs.cullingBoundingSphereMod.BoundingSphere
import typingsJapgolly.babylonjs.materialsDrawWrapperMod.DrawWrapper
import typingsJapgolly.babylonjs.mathsMathDotplaneMod.Plane
import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix
import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
import typingsJapgolly.babylonjs.typesMod.DeepImmutable
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cullingBoundingBoxMod {
  
  @JSImport("babylonjs/Culling/boundingBox", "BoundingBox")
  @js.native
  open class BoundingBox protected ()
    extends StObject
       with ICullable {
    /**
      * Creates a new bounding box
      * @param min defines the minimum vector (in local space)
      * @param max defines the maximum vector (in local space)
      * @param worldMatrix defines the new world matrix
      */
    def this(min: DeepImmutable[Vector3], max: DeepImmutable[Vector3]) = this()
    def this(min: DeepImmutable[Vector3], max: DeepImmutable[Vector3], worldMatrix: DeepImmutable[Matrix]) = this()
    
    /** @internal */
    var _drawWrapperBack: Nullable[DrawWrapper] = js.native
    
    /** @internal */
    var _drawWrapperFront: Nullable[DrawWrapper] = js.native
    
    /**
      * @internal
      */
    var _tag: Double = js.native
    
    /**
      * @internal
      */
    def _update(world: DeepImmutable[Matrix]): Unit = js.native
    
    /* private */ var _worldMatrix: Any = js.native
    
    /**
      * Gets the center of the bounding box in local space
      */
    val center: Vector3 = js.native
    
    /**
      * Gets the center of the bounding box in world space
      */
    val centerWorld: Vector3 = js.native
    
    /**
      * Gets the OBB (object bounding box) directions
      */
    val directions: js.Array[Vector3] = js.native
    
    /**
      * Disposes the resources of the class
      */
    def dispose(): Unit = js.native
    
    /**
      * Gets the extend size in local space
      */
    val extendSize: Vector3 = js.native
    
    /**
      * Gets the extend size in world space
      */
    val extendSizeWorld: Vector3 = js.native
    
    /**
      * Gets the world matrix of the bounding box
      * @returns a matrix
      */
    def getWorldMatrix(): DeepImmutable[Matrix] = js.native
    
    /**
      * Tests if the bounding box intersects with a box defined by a min and max vectors
      * @param min defines the min vector to use
      * @param max defines the max vector to use
      * @returns true if there is an intersection
      */
    def intersectsMinMax(min: DeepImmutable[Vector3], max: DeepImmutable[Vector3]): Boolean = js.native
    
    /**
      * Tests if a point is inside the bounding box
      * @param point defines the point to test
      * @returns true if the point is inside the bounding box
      */
    def intersectsPoint(point: DeepImmutable[Vector3]): Boolean = js.native
    
    /**
      * Tests if the bounding box intersects with a bounding sphere
      * @param sphere defines the sphere to test
      * @returns true if there is an intersection
      */
    def intersectsSphere(sphere: DeepImmutable[BoundingSphere]): Boolean = js.native
    
    /**
      * Checks if a cullable object (mesh...) is in the camera frustum
      * Unlike isInFrustum this checks the full bounding box
      * @param frustumPlanes Camera near/planes
      * @returns true if the object is in frustum otherwise false
      */
    /* CompleteClass */
    override def isCompletelyInFrustum(frustumPlanes: js.Array[Plane]): Boolean = js.native
    
    /**
      * Checks if the object or part of the object is in the frustum
      * @param frustumPlanes Camera near/planes
      * @returns true if the object is in frustum otherwise false
      */
    /* CompleteClass */
    override def isInFrustum(frustumPlanes: js.Array[Plane]): Boolean = js.native
    
    /**
      * Gets the maximum vector in local space
      */
    val maximum: Vector3 = js.native
    
    /**
      * Gets the maximum vector in world space
      */
    val maximumWorld: Vector3 = js.native
    
    /**
      * Gets the minimum vector in local space
      */
    val minimum: Vector3 = js.native
    
    /**
      * Gets the minimum vector in world space
      */
    val minimumWorld: Vector3 = js.native
    
    /**
      * Recreates the entire bounding box from scratch as if we call the constructor in place
      * @param min defines the new minimum vector (in local space)
      * @param max defines the new maximum vector (in local space)
      * @param worldMatrix defines the new world matrix
      */
    def reConstruct(min: DeepImmutable[Vector3], max: DeepImmutable[Vector3]): Unit = js.native
    def reConstruct(min: DeepImmutable[Vector3], max: DeepImmutable[Vector3], worldMatrix: DeepImmutable[Matrix]): Unit = js.native
    
    /**
      * Scale the current bounding box by applying a scale factor
      * @param factor defines the scale factor to apply
      * @returns the current bounding box
      */
    def scale(factor: Double): BoundingBox = js.native
    
    /**
      * Gets the 8 vectors representing the bounding box in local space
      */
    val vectors: js.Array[Vector3] = js.native
    
    /**
      * Gets the 8 vectors representing the bounding box in world space
      */
    val vectorsWorld: js.Array[Vector3] = js.native
  }
  /* static members */
  object BoundingBox {
    
    @JSImport("babylonjs/Culling/boundingBox", "BoundingBox")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Tests if two bounding boxes are intersections
      * @param box0 defines the first box to test
      * @param box1 defines the second box to test
      * @returns true if there is an intersection
      */
    inline def Intersects(box0: DeepImmutable[BoundingBox], box1: DeepImmutable[BoundingBox]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Intersects")(box0.asInstanceOf[js.Any], box1.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Tests if a bounding box defines by a min/max vectors intersects a sphere
      * @param minPoint defines the minimum vector of the bounding box
      * @param maxPoint defines the maximum vector of the bounding box
      * @param sphereCenter defines the sphere center
      * @param sphereRadius defines the sphere radius
      * @returns true if there is an intersection
      */
    inline def IntersectsSphere(
      minPoint: DeepImmutable[Vector3],
      maxPoint: DeepImmutable[Vector3],
      sphereCenter: DeepImmutable[Vector3],
      sphereRadius: Double
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("IntersectsSphere")(minPoint.asInstanceOf[js.Any], maxPoint.asInstanceOf[js.Any], sphereCenter.asInstanceOf[js.Any], sphereRadius.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Tests if a bounding box defined with 8 vectors is entirely inside frustum planes
      * @param boundingVectors defines an array of 8 vectors representing a bounding box
      * @param frustumPlanes defines the frustum planes to test
      * @returns true if there is an inclusion
      */
    inline def IsCompletelyInFrustum(boundingVectors: js.Array[DeepImmutable[Vector3]], frustumPlanes: js.Array[DeepImmutable[Plane]]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("IsCompletelyInFrustum")(boundingVectors.asInstanceOf[js.Any], frustumPlanes.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Tests if a bounding box defined with 8 vectors intersects frustum planes
      * @param boundingVectors defines an array of 8 vectors representing a bounding box
      * @param frustumPlanes defines the frustum planes to test
      * @returns true if there is an intersection
      */
    inline def IsInFrustum(boundingVectors: js.Array[DeepImmutable[Vector3]], frustumPlanes: js.Array[DeepImmutable[Plane]]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("IsInFrustum")(boundingVectors.asInstanceOf[js.Any], frustumPlanes.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("babylonjs/Culling/boundingBox", "BoundingBox._TmpVector3")
    @js.native
    val _TmpVector3: Any = js.native
  }
}
