package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPopulationRule extends StObject {
  
  /** Floodlight activity ID associated with this rule. This field can be left blank. */
  var floodlightActivityId: js.UndefOr[String] = js.undefined
  
  /** Name of floodlight activity associated with this rule. This is a read-only, auto-generated field. */
  var floodlightActivityName: js.UndefOr[String] = js.undefined
  
  /** Clauses that make up this list population rule. Clauses are joined by ANDs, and the clauses themselves are made up of list population terms which are joined by ORs. */
  var listPopulationClauses: js.UndefOr[js.Array[ListPopulationClause]] = js.undefined
}
object ListPopulationRule {
  
  inline def apply(): ListPopulationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPopulationRule]
  }
  
  extension [Self <: ListPopulationRule](x: Self) {
    
    inline def setFloodlightActivityId(value: String): Self = StObject.set(x, "floodlightActivityId", value.asInstanceOf[js.Any])
    
    inline def setFloodlightActivityIdUndefined: Self = StObject.set(x, "floodlightActivityId", js.undefined)
    
    inline def setFloodlightActivityName(value: String): Self = StObject.set(x, "floodlightActivityName", value.asInstanceOf[js.Any])
    
    inline def setFloodlightActivityNameUndefined: Self = StObject.set(x, "floodlightActivityName", js.undefined)
    
    inline def setListPopulationClauses(value: js.Array[ListPopulationClause]): Self = StObject.set(x, "listPopulationClauses", value.asInstanceOf[js.Any])
    
    inline def setListPopulationClausesUndefined: Self = StObject.set(x, "listPopulationClauses", js.undefined)
    
    inline def setListPopulationClausesVarargs(value: ListPopulationClause*): Self = StObject.set(x, "listPopulationClauses", js.Array(value*))
  }
}
