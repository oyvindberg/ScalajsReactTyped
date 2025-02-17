package typingsJapgolly.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeHandshakeRequest extends StObject {
  
  /**
    * The unique identifier (ID) of the handshake that you want information about. You can get the ID from the original call to InviteAccountToOrganization, or from a call to ListHandshakesForAccount or ListHandshakesForOrganization. The regex pattern for handshake ID string requires "h-" followed by from 8 to 32 lowercase letters or digits.
    */
  var HandshakeId: typingsJapgolly.awsSdk.clientsOrganizationsMod.HandshakeId
}
object DescribeHandshakeRequest {
  
  inline def apply(HandshakeId: HandshakeId): DescribeHandshakeRequest = {
    val __obj = js.Dynamic.literal(HandshakeId = HandshakeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHandshakeRequest]
  }
  
  extension [Self <: DescribeHandshakeRequest](x: Self) {
    
    inline def setHandshakeId(value: HandshakeId): Self = StObject.set(x, "HandshakeId", value.asInstanceOf[js.Any])
  }
}
