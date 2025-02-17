package typingsJapgolly.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListActionTypesOutput extends StObject {
  
  /**
    * Provides details of the action types.
    */
  var actionTypes: ActionTypeList
  
  /**
    * If the amount of returned information is significantly large, an identifier is also returned. It can be used in a subsequent list action types call to return the next set of action types in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListActionTypesOutput {
  
  inline def apply(actionTypes: ActionTypeList): ListActionTypesOutput = {
    val __obj = js.Dynamic.literal(actionTypes = actionTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListActionTypesOutput]
  }
  
  extension [Self <: ListActionTypesOutput](x: Self) {
    
    inline def setActionTypes(value: ActionTypeList): Self = StObject.set(x, "actionTypes", value.asInstanceOf[js.Any])
    
    inline def setActionTypesVarargs(value: ActionType*): Self = StObject.set(x, "actionTypes", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
