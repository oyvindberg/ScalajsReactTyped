package typingsJapgolly.awsSdk.clientsSsoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePermissionSetRequest extends StObject {
  
  /**
    * The ARN of the IAM Identity Center instance under which the operation will be executed. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var InstanceArn: typingsJapgolly.awsSdk.clientsSsoadminMod.InstanceArn
  
  /**
    * The ARN of the permission set that should be deleted.
    */
  var PermissionSetArn: typingsJapgolly.awsSdk.clientsSsoadminMod.PermissionSetArn
}
object DeletePermissionSetRequest {
  
  inline def apply(InstanceArn: InstanceArn, PermissionSetArn: PermissionSetArn): DeletePermissionSetRequest = {
    val __obj = js.Dynamic.literal(InstanceArn = InstanceArn.asInstanceOf[js.Any], PermissionSetArn = PermissionSetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePermissionSetRequest]
  }
  
  extension [Self <: DeletePermissionSetRequest](x: Self) {
    
    inline def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "InstanceArn", value.asInstanceOf[js.Any])
    
    inline def setPermissionSetArn(value: PermissionSetArn): Self = StObject.set(x, "PermissionSetArn", value.asInstanceOf[js.Any])
  }
}
