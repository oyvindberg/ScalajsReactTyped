package typingsJapgolly.awsSdk.clientsCognitoidentityMod

import typingsJapgolly.awsSdk.libCredentialsCognitoIdentityCredentialsMod.CognitoIdentityCredentials.CognitoIdentityCredentialsInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCredentialsForIdentityInput
  extends StObject
     with CognitoIdentityCredentialsInputs {
  
  /**
    * The Amazon Resource Name (ARN) of the role to be assumed when multiple roles were received in the token from the identity provider. For example, a SAML-based identity provider. This parameter is optional for identity providers that do not support role customization.
    */
  var CustomRoleArn: js.UndefOr[ARNString] = js.undefined
  
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: typingsJapgolly.awsSdk.clientsCognitoidentityMod.IdentityId
  
  /**
    * A set of optional name-value pairs that map provider names to provider tokens. The name-value pair will follow the syntax "provider_name": "provider_user_identifier". Logins should not be specified when trying to get credentials for an unauthenticated identity. The Logins parameter is required when using identities associated with external identity providers such as Facebook. For examples of Logins maps, see the code examples in the External Identity Providers section of the Amazon Cognito Developer Guide.
    */
  var Logins: js.UndefOr[LoginsMap] = js.undefined
}
object GetCredentialsForIdentityInput {
  
  inline def apply(IdentityId: IdentityId): GetCredentialsForIdentityInput = {
    val __obj = js.Dynamic.literal(IdentityId = IdentityId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCredentialsForIdentityInput]
  }
  
  extension [Self <: GetCredentialsForIdentityInput](x: Self) {
    
    inline def setCustomRoleArn(value: ARNString): Self = StObject.set(x, "CustomRoleArn", value.asInstanceOf[js.Any])
    
    inline def setCustomRoleArnUndefined: Self = StObject.set(x, "CustomRoleArn", js.undefined)
    
    inline def setIdentityId(value: IdentityId): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    inline def setLogins(value: LoginsMap): Self = StObject.set(x, "Logins", value.asInstanceOf[js.Any])
    
    inline def setLoginsUndefined: Self = StObject.set(x, "Logins", js.undefined)
  }
}
