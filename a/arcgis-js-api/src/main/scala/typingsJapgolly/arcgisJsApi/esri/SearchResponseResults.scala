package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResponseResults
  extends StObject
     with Object {
  
  /**
    * An array of search results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#SearchResponse)
    */
  var results: js.Array[SearchResult]
  
  /**
    * The [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#sources) of the selected result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#SearchResponse)
    */
  var source: Any
  
  /**
    * The index of the currently selected source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#SearchResponse)
    */
  var sourceIndex: Double
}
object SearchResponseResults {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    results: js.Array[SearchResult],
    source: Any,
    sourceIndex: Double
  ): SearchResponseResults = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), results = results.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResponseResults]
  }
  
  extension [Self <: SearchResponseResults](x: Self) {
    
    inline def setResults(value: js.Array[SearchResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: SearchResult*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceIndex(value: Double): Self = StObject.set(x, "sourceIndex", value.asInstanceOf[js.Any])
  }
}
