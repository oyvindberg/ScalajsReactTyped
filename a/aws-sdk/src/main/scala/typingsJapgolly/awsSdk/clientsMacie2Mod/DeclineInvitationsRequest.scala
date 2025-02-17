package typingsJapgolly.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclineInvitationsRequest extends StObject {
  
  /**
    * An array that lists Amazon Web Services account IDs, one for each account that sent an invitation to decline.
    */
  var accountIds: listOfString
}
object DeclineInvitationsRequest {
  
  inline def apply(accountIds: listOfString): DeclineInvitationsRequest = {
    val __obj = js.Dynamic.literal(accountIds = accountIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclineInvitationsRequest]
  }
  
  extension [Self <: DeclineInvitationsRequest](x: Self) {
    
    inline def setAccountIds(value: listOfString): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsVarargs(value: string*): Self = StObject.set(x, "accountIds", js.Array(value*))
  }
}
