package typingsJapgolly.systeminformation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Errorcountoutdated extends StObject {
  
  var count: Double
  
  var error_count_outdated: Double
  
  var error_count_total: Double
  
  var revision: Double
  
  var table: js.Array[Lifetimehours]
}
object Errorcountoutdated {
  
  inline def apply(
    count: Double,
    error_count_outdated: Double,
    error_count_total: Double,
    revision: Double,
    table: js.Array[Lifetimehours]
  ): Errorcountoutdated = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], error_count_outdated = error_count_outdated.asInstanceOf[js.Any], error_count_total = error_count_total.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errorcountoutdated]
  }
  
  extension [Self <: Errorcountoutdated](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setError_count_outdated(value: Double): Self = StObject.set(x, "error_count_outdated", value.asInstanceOf[js.Any])
    
    inline def setError_count_total(value: Double): Self = StObject.set(x, "error_count_total", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setTable(value: js.Array[Lifetimehours]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableVarargs(value: Lifetimehours*): Self = StObject.set(x, "table", js.Array(value*))
  }
}
