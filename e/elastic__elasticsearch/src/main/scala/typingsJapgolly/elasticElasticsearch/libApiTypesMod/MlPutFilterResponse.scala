package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPutFilterResponse extends StObject {
  
  var description: String
  
  var filter_id: Id
  
  var items: js.Array[String]
}
object MlPutFilterResponse {
  
  inline def apply(description: String, filter_id: Id, items: js.Array[String]): MlPutFilterResponse = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], filter_id = filter_id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPutFilterResponse]
  }
  
  extension [Self <: MlPutFilterResponse](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFilter_id(value: Id): Self = StObject.set(x, "filter_id", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: String*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
