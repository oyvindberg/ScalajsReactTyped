package typingsJapgolly.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRepositoriesResult extends StObject {
  
  /**
    *  If there are additional results, this is the token for the next set of results. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    *  The returned list of RepositorySummary objects. 
    */
  var repositories: js.UndefOr[RepositorySummaryList] = js.undefined
}
object ListRepositoriesResult {
  
  inline def apply(): ListRepositoriesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRepositoriesResult]
  }
  
  extension [Self <: ListRepositoriesResult](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRepositories(value: RepositorySummaryList): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    inline def setRepositoriesUndefined: Self = StObject.set(x, "repositories", js.undefined)
    
    inline def setRepositoriesVarargs(value: RepositorySummary*): Self = StObject.set(x, "repositories", js.Array(value*))
  }
}
