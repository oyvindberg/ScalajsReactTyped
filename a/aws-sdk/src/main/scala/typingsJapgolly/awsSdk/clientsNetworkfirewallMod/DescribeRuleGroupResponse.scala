package typingsJapgolly.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRuleGroupResponse extends StObject {
  
  /**
    * The object that defines the rules in a rule group. This, along with RuleGroupResponse, define the rule group. You can retrieve all objects for a rule group by calling DescribeRuleGroup.  Network Firewall uses a rule group to inspect and control network traffic. You define stateless rule groups to inspect individual packets and you define stateful rule groups to inspect packets in the context of their traffic flow.  To use a rule group, you include it by reference in an Network Firewall firewall policy, then you use the policy in a firewall. You can reference a rule group from more than one firewall policy, and you can use a firewall policy in more than one firewall. 
    */
  var RuleGroup: js.UndefOr[typingsJapgolly.awsSdk.clientsNetworkfirewallMod.RuleGroup] = js.undefined
  
  /**
    * The high-level properties of a rule group. This, along with the RuleGroup, define the rule group. You can retrieve all objects for a rule group by calling DescribeRuleGroup. 
    */
  var RuleGroupResponse: typingsJapgolly.awsSdk.clientsNetworkfirewallMod.RuleGroupResponse
  
  /**
    * A token used for optimistic locking. Network Firewall returns a token to your requests that access the rule group. The token marks the state of the rule group resource at the time of the request.  To make changes to the rule group, you provide the token in your request. Network Firewall uses the token to ensure that the rule group hasn't changed since you last retrieved it. If it has changed, the operation fails with an InvalidTokenException. If this happens, retrieve the rule group again to get a current copy of it with a current token. Reapply your changes as needed, then try the operation again using the new token. 
    */
  var UpdateToken: typingsJapgolly.awsSdk.clientsNetworkfirewallMod.UpdateToken
}
object DescribeRuleGroupResponse {
  
  inline def apply(RuleGroupResponse: RuleGroupResponse, UpdateToken: UpdateToken): DescribeRuleGroupResponse = {
    val __obj = js.Dynamic.literal(RuleGroupResponse = RuleGroupResponse.asInstanceOf[js.Any], UpdateToken = UpdateToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRuleGroupResponse]
  }
  
  extension [Self <: DescribeRuleGroupResponse](x: Self) {
    
    inline def setRuleGroup(value: RuleGroup): Self = StObject.set(x, "RuleGroup", value.asInstanceOf[js.Any])
    
    inline def setRuleGroupResponse(value: RuleGroupResponse): Self = StObject.set(x, "RuleGroupResponse", value.asInstanceOf[js.Any])
    
    inline def setRuleGroupUndefined: Self = StObject.set(x, "RuleGroup", js.undefined)
    
    inline def setUpdateToken(value: UpdateToken): Self = StObject.set(x, "UpdateToken", value.asInstanceOf[js.Any])
  }
}
