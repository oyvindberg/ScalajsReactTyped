package typingsJapgolly.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInputsRequest extends StObject {
  
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.MaxResults] = js.undefined
  
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListInputsRequest {
  
  inline def apply(): ListInputsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInputsRequest]
  }
  
  extension [Self <: ListInputsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
