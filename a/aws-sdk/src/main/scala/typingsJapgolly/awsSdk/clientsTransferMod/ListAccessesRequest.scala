package typingsJapgolly.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccessesRequest extends StObject {
  
  /**
    * Specifies the maximum number of access SIDs to return.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsTransferMod.MaxResults] = js.undefined
  
  /**
    * When you can get additional results from the ListAccesses call, a NextToken parameter is returned in the output. You can then pass in a subsequent command to the NextToken parameter to continue listing additional accesses.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsTransferMod.NextToken] = js.undefined
  
  /**
    * A system-assigned unique identifier for a server that has users assigned to it.
    */
  var ServerId: typingsJapgolly.awsSdk.clientsTransferMod.ServerId
}
object ListAccessesRequest {
  
  inline def apply(ServerId: ServerId): ListAccessesRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccessesRequest]
  }
  
  extension [Self <: ListAccessesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
  }
}
