package typingsJapgolly.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAggregateComplianceByConfigRulesResponse extends StObject {
  
  /**
    * Returns a list of AggregateComplianceByConfigRule object.
    */
  var AggregateComplianceByConfigRules: js.UndefOr[AggregateComplianceByConfigRuleList] = js.undefined
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsConfigserviceMod.NextToken] = js.undefined
}
object DescribeAggregateComplianceByConfigRulesResponse {
  
  inline def apply(): DescribeAggregateComplianceByConfigRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAggregateComplianceByConfigRulesResponse]
  }
  
  extension [Self <: DescribeAggregateComplianceByConfigRulesResponse](x: Self) {
    
    inline def setAggregateComplianceByConfigRules(value: AggregateComplianceByConfigRuleList): Self = StObject.set(x, "AggregateComplianceByConfigRules", value.asInstanceOf[js.Any])
    
    inline def setAggregateComplianceByConfigRulesUndefined: Self = StObject.set(x, "AggregateComplianceByConfigRules", js.undefined)
    
    inline def setAggregateComplianceByConfigRulesVarargs(value: AggregateComplianceByConfigRule*): Self = StObject.set(x, "AggregateComplianceByConfigRules", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
