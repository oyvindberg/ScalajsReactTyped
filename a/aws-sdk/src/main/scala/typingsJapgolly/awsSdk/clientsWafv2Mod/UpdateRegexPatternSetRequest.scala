package typingsJapgolly.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRegexPatternSetRequest extends StObject {
  
  /**
    * A description of the set that helps with identification. 
    */
  var Description: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * A unique identifier for the set. This ID is returned in the responses to create and list commands. You provide it to operations like update and delete.
    */
  var Id: EntityId
  
  /**
    * A token used for optimistic locking. WAF returns a token to your get and list requests, to mark the state of the entity at the time of the request. To make changes to the entity associated with the token, you provide the token to operations like update and delete. WAF uses the token to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made, the update fails with a WAFOptimisticLockException. If this happens, perform another get, and use the new token returned by that operation. 
    */
  var LockToken: typingsJapgolly.awsSdk.clientsWafv2Mod.LockToken
  
  /**
    * The name of the set. You cannot change the name after you create the set.
    */
  var Name: EntityName
  
  /**
    * 
    */
  var RegularExpressionList: typingsJapgolly.awsSdk.clientsWafv2Mod.RegularExpressionList
  
  /**
    * Specifies whether this is for an Amazon CloudFront distribution or for a regional application. A regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL API, or an Amazon Cognito user pool.  To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:    CLI - Specify the Region when you use the CloudFront scope: --scope=CLOUDFRONT --region=us-east-1.    API and SDKs - For all calls, use the Region endpoint us-east-1.   
    */
  var Scope: typingsJapgolly.awsSdk.clientsWafv2Mod.Scope
}
object UpdateRegexPatternSetRequest {
  
  inline def apply(
    Id: EntityId,
    LockToken: LockToken,
    Name: EntityName,
    RegularExpressionList: RegularExpressionList,
    Scope: Scope
  ): UpdateRegexPatternSetRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], LockToken = LockToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RegularExpressionList = RegularExpressionList.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRegexPatternSetRequest]
  }
  
  extension [Self <: UpdateRegexPatternSetRequest](x: Self) {
    
    inline def setDescription(value: EntityDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: EntityId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setLockToken(value: LockToken): Self = StObject.set(x, "LockToken", value.asInstanceOf[js.Any])
    
    inline def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRegularExpressionList(value: RegularExpressionList): Self = StObject.set(x, "RegularExpressionList", value.asInstanceOf[js.Any])
    
    inline def setRegularExpressionListVarargs(value: Regex*): Self = StObject.set(x, "RegularExpressionList", js.Array(value*))
    
    inline def setScope(value: Scope): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
  }
}
