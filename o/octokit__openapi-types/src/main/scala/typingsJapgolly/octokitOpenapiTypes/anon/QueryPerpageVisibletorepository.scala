package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPerpageVisibletorepository extends StObject {
  
  var path: `300`
  
  var query: PerpageVisibletorepository
}
object QueryPerpageVisibletorepository {
  
  inline def apply(path: `300`, query: PerpageVisibletorepository): QueryPerpageVisibletorepository = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPerpageVisibletorepository]
  }
  
  extension [Self <: QueryPerpageVisibletorepository](x: Self) {
    
    inline def setPath(value: `300`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PerpageVisibletorepository): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
