package typingsJapgolly.earcut

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.earcut.anon.Dimensions
import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("earcut", JSImport.Namespace)
  @js.native
  val ^ : EarcutStatic = js.native
  
  @js.native
  trait EarcutStatic extends StObject {
    
    /**
      * Triangulate an outline.
      *
      * @param vertices A flat array of vertice coordinates like [x0,y0, x1,y1, x2,y2, ...].
      * @param holes An array of hole indices if any (e.g. [5, 8] for a 12-vertice input would mean one hole with vertices 5–7 and another with 8–11).
      * @param dimensions The number of coordinates per vertice in the input array (2 by default).
      * @return A flat array with each group of three numbers indexing a triangle in the `vertices` array.
      * @example earcut([10,0, 0,50, 60,60, 70,10]); // returns [1,0,3, 3,2,1]
      * @example with a hole: earcut([0,0, 100,0, 100,100, 0,100,  20,20, 80,20, 80,80, 20,80], [4]); // [3,0,4, 5,4,0, 3,4,7, 5,0,1, 2,3,7, 6,5,1, 2,7,6, 6,1,2]
      * @example with 3d coords: earcut([10,0,1, 0,50,2, 60,60,3, 70,10,4], null, 3); // [1,0,3, 3,2,1]
      */
    def apply(vertices: ArrayLike[Double]): js.Array[Double] = js.native
    def apply(vertices: ArrayLike[Double], holes: Unit, dimensions: Double): js.Array[Double] = js.native
    def apply(vertices: ArrayLike[Double], holes: ArrayLike[Double]): js.Array[Double] = js.native
    def apply(vertices: ArrayLike[Double], holes: ArrayLike[Double], dimensions: Double): js.Array[Double] = js.native
    
    /**
      * Triangulate an outline.
      *
      * @param vertices A flat array of vertice coordinates like [x0,y0, x1,y1, x2,y2, ...].
      * @param holes An array of hole indices if any (e.g. [5, 8] for a 12-vertice input would mean one hole with vertices 5–7 and another with 8–11).
      * @param dimensions The number of coordinates per vertice in the input array (2 by default).
      * @return A flat array with each group of three numbers indexing a triangle in the `vertices` array.
      * @example earcut([10,0, 0,50, 60,60, 70,10]); // returns [1,0,3, 3,2,1]
      * @example with a hole: earcut([0,0, 100,0, 100,100, 0,100,  20,20, 80,20, 80,80, 20,80], [4]); // [3,0,4, 5,4,0, 3,4,7, 5,0,1, 2,3,7, 6,5,1, 2,7,6, 6,1,2]
      * @example with 3d coords: earcut([10,0,1, 0,50,2, 60,60,3, 70,10,4], null, 3); // [1,0,3, 3,2,1]
      */
    def default(vertices: ArrayLike[Double]): js.Array[Double] = js.native
    def default(vertices: ArrayLike[Double], holes: Unit, dimensions: Double): js.Array[Double] = js.native
    def default(vertices: ArrayLike[Double], holes: ArrayLike[Double]): js.Array[Double] = js.native
    def default(vertices: ArrayLike[Double], holes: ArrayLike[Double], dimensions: Double): js.Array[Double] = js.native
    @JSName("default")
    var default_Original: EarcutStatic = js.native
    
    def deviation(vertices: ArrayLike[Double], holes: Unit, dimensions: Double, triangles: ArrayLike[Double]): Double = js.native
    /**
      * Returns the relative difference between the total area of triangles and the area of the input polygon. 0 means the triangulation is fully correct.
      * @param vertices same as earcut
      * @param holes same as earcut
      * @param dimensions same as earcut
      * @param triangles see return value of earcut
      * @example
      *     const triangles = earcut(vertices, holes, dimensions);
      *  const deviation = earcut.deviation(vertices, holes, dimensions, triangles);
      */
    def deviation(
      vertices: ArrayLike[Double],
      holes: ArrayLike[Double],
      dimensions: Double,
      triangles: ArrayLike[Double]
    ): Double = js.native
    
    /**
      * Transforms multi-dimensional array (e.g. GeoJSON Polygon) into the format expected by earcut.
      * @example Transforming GeoJSON data.
      *     const data = earcut.flatten(geojson.geometry.coordinates);
      *     const triangles = earcut(data.vertices, data.holes, data.dimensions);
      * @example Transforming simple triangle with hole:
      *     const data = earcut.flatten([[[0, 0], [100, 0], [0, 100]], [[10, 10], [0, 10], [10, 0]]]);
      *     const triangles = earcut(data.vertices, data.holes, data.dimensions);
      * @param data Arrays of rings, with the first being the outline and the rest holes. A ring is an array points, each point being an array of numbers.
      */
    def flatten(data: ArrayLike[ArrayLike[ArrayLike[Double]]]): Dimensions = js.native
  }
  
  type _To = EarcutStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: EarcutStatic = ^
}
