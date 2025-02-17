package typingsJapgolly.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBudgetActionsForAccountResponse extends StObject {
  
  /**
    *  A list of the budget action resources information. 
    */
  var Actions: typingsJapgolly.awsSdk.clientsBudgetsMod.Actions
  
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object DescribeBudgetActionsForAccountResponse {
  
  inline def apply(Actions: Actions): DescribeBudgetActionsForAccountResponse = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBudgetActionsForAccountResponse]
  }
  
  extension [Self <: DescribeBudgetActionsForAccountResponse](x: Self) {
    
    inline def setActions(value: Actions): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: Action*): Self = StObject.set(x, "Actions", js.Array(value*))
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
