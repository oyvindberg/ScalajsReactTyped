package typingsJapgolly.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInvitationsRequest extends StObject {
  
  /**
    * The maximum number of items to return in the response. 
    */
  var MaxResults: js.UndefOr[CrossAccountMaxResults] = js.undefined
  
  /**
    * The token that is required for pagination. On your first call to the ListInvitations operation, set the value of this parameter to NULL. For subsequent calls to the operation, to continue listing data, set the value of this parameter to the value returned from the previous response.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsSecurityhubMod.NextToken] = js.undefined
}
object ListInvitationsRequest {
  
  inline def apply(): ListInvitationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInvitationsRequest]
  }
  
  extension [Self <: ListInvitationsRequest](x: Self) {
    
    inline def setMaxResults(value: CrossAccountMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
