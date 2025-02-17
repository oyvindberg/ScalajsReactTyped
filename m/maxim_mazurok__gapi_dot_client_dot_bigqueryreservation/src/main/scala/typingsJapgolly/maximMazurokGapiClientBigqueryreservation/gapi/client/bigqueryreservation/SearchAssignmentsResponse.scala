package typingsJapgolly.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchAssignmentsResponse extends StObject {
  
  /** List of assignments visible to the user. */
  var assignments: js.UndefOr[js.Array[Assignment]] = js.undefined
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SearchAssignmentsResponse {
  
  inline def apply(): SearchAssignmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchAssignmentsResponse]
  }
  
  extension [Self <: SearchAssignmentsResponse](x: Self) {
    
    inline def setAssignments(value: js.Array[Assignment]): Self = StObject.set(x, "assignments", value.asInstanceOf[js.Any])
    
    inline def setAssignmentsUndefined: Self = StObject.set(x, "assignments", js.undefined)
    
    inline def setAssignmentsVarargs(value: Assignment*): Self = StObject.set(x, "assignments", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
