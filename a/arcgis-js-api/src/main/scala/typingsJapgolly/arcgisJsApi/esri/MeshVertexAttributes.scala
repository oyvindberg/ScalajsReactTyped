package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.HashMap
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshVertexAttributes
  extends StObject
     with AnonymousAccessor {
  
  /**
    * **Since: 4.9**  A flat array of the vertex colors (4 elements per vertex ranging from 0 to 255).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var color: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * A flat array of the vertex normals (3 elements per vertex ranging from -1 to 1).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var normal: js.UndefOr[js.typedarray.Float32Array] = js.undefined
  
  /**
    * A flat array of vertex positions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var position: js.typedarray.Float64Array
  
  /**
    * **Since: 4.11**  A flat array of the vertex tangents (4 elements per vertex ranging from -1 to 1.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var tangent: js.UndefOr[js.typedarray.Float32Array] = js.undefined
  
  /**
    * A flat array of vertex uv coordinates (2 elements per vertex).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var uv: js.UndefOr[js.typedarray.Float32Array] = js.undefined
}
object MeshVertexAttributes {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    position: js.typedarray.Float64Array,
    propertyIsEnumerable: PropertyKey => Boolean,
    set: (js.UndefOr[js.Function2[/* propertyName */ String, /* value */ Any, MeshVertexAttributes]]) & (js.UndefOr[js.Function1[/* props */ HashMap[Any], MeshVertexAttributes]])
  ): MeshVertexAttributes = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), position = position.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshVertexAttributes]
  }
  
  extension [Self <: MeshVertexAttributes](x: Self) {
    
    inline def setColor(value: js.typedarray.Uint8Array): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setNormal(value: js.typedarray.Float32Array): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    inline def setNormalUndefined: Self = StObject.set(x, "normal", js.undefined)
    
    inline def setPosition(value: js.typedarray.Float64Array): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setTangent(value: js.typedarray.Float32Array): Self = StObject.set(x, "tangent", value.asInstanceOf[js.Any])
    
    inline def setTangentUndefined: Self = StObject.set(x, "tangent", js.undefined)
    
    inline def setUv(value: js.typedarray.Float32Array): Self = StObject.set(x, "uv", value.asInstanceOf[js.Any])
    
    inline def setUvUndefined: Self = StObject.set(x, "uv", js.undefined)
  }
}
