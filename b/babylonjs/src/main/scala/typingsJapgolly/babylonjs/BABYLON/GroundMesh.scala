package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroundMesh
  extends StObject
     with Mesh {
  
  /* private */ var _computeHeightQuads: Any = js.native
  
  /* private */ var _getFacetAt: Any = js.native
  
  /** @internal */
  var _height: Double = js.native
  
  /* private */ var _heightQuads: Any = js.native
  
  /* private */ var _initHeightQuads: Any = js.native
  
  /** @internal */
  var _maxX: Double = js.native
  
  /** @internal */
  var _maxZ: Double = js.native
  
  /** @internal */
  var _minX: Double = js.native
  
  /** @internal */
  var _minZ: Double = js.native
  
  /** @internal */
  var _subdivisionsX: Double = js.native
  
  /** @internal */
  var _subdivisionsY: Double = js.native
  
  /** @internal */
  var _width: Double = js.native
  
  /** If octree should be generated */
  var generateOctree: Boolean = js.native
  
  /**
    * Returns a height (y) value in the World system :
    * the ground altitude at the coordinates (x, z) expressed in the World system.
    * @param x x coordinate
    * @param z z coordinate
    * @returns the ground y position if (x, z) are outside the ground surface.
    */
  def getHeightAtCoordinates(x: Double, z: Double): Double = js.native
  
  /**
    * Returns a normalized vector (Vector3) orthogonal to the ground
    * at the ground coordinates (x, z) expressed in the World system.
    * @param x x coordinate
    * @param z z coordinate
    * @returns Vector3(0.0, 1.0, 0.0) if (x, z) are outside the ground surface.
    */
  def getNormalAtCoordinates(x: Double, z: Double): Vector3 = js.native
  
  /**
    * Updates the Vector3 passed a reference with a normalized vector orthogonal to the ground
    * at the ground coordinates (x, z) expressed in the World system.
    * Doesn't update the reference Vector3 if (x, z) are outside the ground surface.
    * @param x x coordinate
    * @param z z coordinate
    * @param ref vector to store the result
    * @returns the GroundMesh.
    */
  def getNormalAtCoordinatesToRef(x: Double, z: Double, ref: Vector3): GroundMesh = js.native
  
  /**
    * This function will divide the mesh into submeshes and update an octree to help to select the right submeshes
    * for rendering, picking and collision computations. Please note that you must have a decent number of submeshes
    * to get performance improvements when using an octree.
    * @param chunksCount the number of submeshes the mesh will be divided into
    * @param octreeBlocksSize the maximum size of the octree blocks (Default: 32)
    */
  def optimize(chunksCount: Double): Unit = js.native
  def optimize(chunksCount: Double, octreeBlocksSize: Double): Unit = js.native
  
  /**
    * The minimum of x and y subdivisions
    */
  def subdivisions: Double = js.native
  
  /**
    * X subdivisions
    */
  def subdivisionsX: Double = js.native
  
  /**
    * Y subdivisions
    */
  def subdivisionsY: Double = js.native
  
  /**
    * Force the heights to be recomputed for getHeightAtCoordinates() or getNormalAtCoordinates()
    * if the ground has been updated.
    * This can be used in the render loop.
    * @returns the GroundMesh.
    */
  def updateCoordinateHeights(): GroundMesh = js.native
}
