package typingsJapgolly.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableDomainTransferLockResponse extends StObject {
  
  /**
    * Identifier for tracking the progress of the request. To query the operation status, use GetOperationDetail.
    */
  var OperationId: typingsJapgolly.awsSdk.clientsRoute53domainsMod.OperationId
}
object DisableDomainTransferLockResponse {
  
  inline def apply(OperationId: OperationId): DisableDomainTransferLockResponse = {
    val __obj = js.Dynamic.literal(OperationId = OperationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableDomainTransferLockResponse]
  }
  
  extension [Self <: DisableDomainTransferLockResponse](x: Self) {
    
    inline def setOperationId(value: OperationId): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
  }
}
