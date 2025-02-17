package typingsJapgolly.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangePasswordRequest extends StObject {
  
  /**
    * The new password. The new password must conform to the Amazon Web Services account's password policy, if one exists. The regex pattern that is used to validate this parameter is a string of characters. That string can include almost any printable ASCII character from the space (\\u0020) through the end of the ASCII character range (\\u00FF). You can also include the tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D) characters. Any of these characters are valid in a password. However, many tools, such as the Amazon Web Services Management Console, might restrict the ability to type certain characters because they have special meaning within that tool.
    */
  var NewPassword: passwordType
  
  /**
    * The IAM user's current password.
    */
  var OldPassword: passwordType
}
object ChangePasswordRequest {
  
  inline def apply(NewPassword: passwordType, OldPassword: passwordType): ChangePasswordRequest = {
    val __obj = js.Dynamic.literal(NewPassword = NewPassword.asInstanceOf[js.Any], OldPassword = OldPassword.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangePasswordRequest]
  }
  
  extension [Self <: ChangePasswordRequest](x: Self) {
    
    inline def setNewPassword(value: passwordType): Self = StObject.set(x, "NewPassword", value.asInstanceOf[js.Any])
    
    inline def setOldPassword(value: passwordType): Self = StObject.set(x, "OldPassword", value.asInstanceOf[js.Any])
  }
}
