package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VertexData extends StObject {
  
  /* private */ val _applyTo: Any = js.native
  
  /**
    * @internal
    */
  def _applyToCoroutine(meshOrGeometry: IGetSetVerticesData, updatable: Boolean, isAsync: Boolean): Coroutine[VertexData] = js.native
  def _applyToCoroutine(meshOrGeometry: IGetSetVerticesData, updatable: Unit, isAsync: Boolean): Coroutine[VertexData] = js.native
  
  def _mergeCoroutine(
    transform: Unit,
    vertexDatas: js.Array[js.Tuple2[/* vertexData */ VertexData, /* transform */ js.UndefOr[Matrix]]],
    use32BitsIndices: Boolean,
    isAsync: Boolean,
    forceCloneIndices: Boolean
  ): Coroutine[VertexData] = js.native
  def _mergeCoroutine(
    transform: Unit,
    vertexDatas: js.Array[js.Tuple2[/* vertexData */ VertexData, /* transform */ js.UndefOr[Matrix]]],
    use32BitsIndices: Unit,
    isAsync: Boolean,
    forceCloneIndices: Boolean
  ): Coroutine[VertexData] = js.native
  /**
    * @internal
    */
  def _mergeCoroutine(
    transform: Matrix,
    vertexDatas: js.Array[js.Tuple2[/* vertexData */ VertexData, /* transform */ js.UndefOr[Matrix]]],
    use32BitsIndices: Boolean,
    isAsync: Boolean,
    forceCloneIndices: Boolean
  ): Coroutine[VertexData] = js.native
  def _mergeCoroutine(
    transform: Matrix,
    vertexDatas: js.Array[js.Tuple2[/* vertexData */ VertexData, /* transform */ js.UndefOr[Matrix]]],
    use32BitsIndices: Unit,
    isAsync: Boolean,
    forceCloneIndices: Boolean
  ): Coroutine[VertexData] = js.native
  
  /* private */ var _update: Any = js.native
  
  /* private */ var _validate: Any = js.native
  
  /**
    * Associates the vertexData to the passed Geometry.
    * Sets it as updatable or not (default `false`)
    * @param geometry the geometry the vertexData is applied to
    * @param updatable when used and having the value true allows new data to update the vertexData
    * @returns VertexData
    */
  def applyToGeometry(geometry: Geometry): VertexData = js.native
  def applyToGeometry(geometry: Geometry, updatable: Boolean): VertexData = js.native
  
  /**
    * Associates the vertexData to the passed Mesh.
    * Sets it as updatable or not (default `false`)
    * @param mesh the mesh the vertexData is applied to
    * @param updatable when used and having the value true allows new data to update the vertexData
    * @returns the VertexData
    */
  def applyToMesh(mesh: Mesh): VertexData = js.native
  def applyToMesh(mesh: Mesh, updatable: Boolean): VertexData = js.native
  
  /**
    * An array of the r, g, b, a, color of each vertex  [...., r, g, b, a, .....]
    */
  var colors: Nullable[FloatArray] = js.native
  
  /**
    * An array of i, j, k the three vertex indices required for each triangular facet  [...., i, j, k .....]
    */
  var indices: Nullable[IndicesArray] = js.native
  
  /**
    * An array containing the list of indices to the array of matrices produced by bones, each vertex have up to 4 indices (8 if the matricesIndicesExtra is set).
    */
  var matricesIndices: Nullable[FloatArray] = js.native
  
  /**
    * An array extending the number of possible indices
    */
  var matricesIndicesExtra: Nullable[FloatArray] = js.native
  
  /**
    * An array containing the list of weights defining the weight of each indexed matrix in the final computation
    */
  var matricesWeights: Nullable[FloatArray] = js.native
  
  /**
    * An array extending the number of possible weights when the number of indices is extended
    */
  var matricesWeightsExtra: Nullable[FloatArray] = js.native
  
  def merge(others: js.Array[VertexData]): VertexData = js.native
  def merge(others: js.Array[VertexData], use32BitsIndices: Boolean): VertexData = js.native
  def merge(others: js.Array[VertexData], use32BitsIndices: Boolean, forceCloneIndices: Boolean): VertexData = js.native
  def merge(others: js.Array[VertexData], use32BitsIndices: Unit, forceCloneIndices: Boolean): VertexData = js.native
  /**
    * Merges the passed VertexData into the current one
    * @param others the VertexData to be merged into the current one
    * @param use32BitsIndices defines a boolean indicating if indices must be store in a 32 bits array
    * @param forceCloneIndices defines a boolean indicating if indices are forced to be cloned
    * @returns the modified VertexData
    */
  def merge(others: VertexData): VertexData = js.native
  def merge(others: VertexData, use32BitsIndices: Boolean): VertexData = js.native
  def merge(others: VertexData, use32BitsIndices: Boolean, forceCloneIndices: Boolean): VertexData = js.native
  def merge(others: VertexData, use32BitsIndices: Unit, forceCloneIndices: Boolean): VertexData = js.native
  
  /**
    * An array of the x, y, z normal vector of each vertex  [...., x, y, z, .....]
    */
  var normals: Nullable[FloatArray] = js.native
  
  /**
    * An array of the x, y, z position of each vertex  [...., x, y, z, .....]
    */
  var positions: Nullable[FloatArray] = js.native
  
  /**
    * Serializes the VertexData
    * @returns a serialized object
    */
  def serialize(): Any = js.native
  
  /**
    * Uses the passed data array to set the set the values for the specified kind of data
    * @param data a linear array of floating numbers
    * @param kind the type of data that is being set, eg positions, colors etc
    */
  def set(data: FloatArray, kind: String): Unit = js.native
  
  /**
    * An array of the x, y, z tangent vector of each vertex  [...., x, y, z, .....]
    */
  var tangents: Nullable[FloatArray] = js.native
  
  /**
    * Transforms each position and each normal of the vertexData according to the passed Matrix
    * @param matrix the transforming matrix
    * @returns the VertexData
    */
  def transform(matrix: Matrix): VertexData = js.native
  
  /**
    * Updates the associated geometry
    * @param geometry the geometry to be updated
    * @returns VertexData.
    */
  def updateGeometry(geometry: Geometry): VertexData = js.native
  
  /**
    * Updates the associated mesh
    * @param mesh the mesh to be updated
    * @returns VertexData
    */
  def updateMesh(mesh: Mesh): VertexData = js.native
  
  /**
    * An array of u,v which maps a texture image onto each vertex  [...., u, v, .....]
    */
  var uvs: Nullable[FloatArray] = js.native
  
  /**
    * A second array of u,v which maps a texture image onto each vertex  [...., u, v, .....]
    */
  var uvs2: Nullable[FloatArray] = js.native
  
  /**
    * A third array of u,v which maps a texture image onto each vertex  [...., u, v, .....]
    */
  var uvs3: Nullable[FloatArray] = js.native
  
  /**
    * A fourth array of u,v which maps a texture image onto each vertex  [...., u, v, .....]
    */
  var uvs4: Nullable[FloatArray] = js.native
  
  /**
    * A fifth array of u,v which maps a texture image onto each vertex  [...., u, v, .....]
    */
  var uvs5: Nullable[FloatArray] = js.native
  
  /**
    * A sixth array of u,v which maps a texture image onto each vertex  [...., u, v, .....]
    */
  var uvs6: Nullable[FloatArray] = js.native
}
