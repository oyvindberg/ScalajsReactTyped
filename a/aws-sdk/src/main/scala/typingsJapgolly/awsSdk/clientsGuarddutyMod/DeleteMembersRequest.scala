package typingsJapgolly.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMembersRequest extends StObject {
  
  /**
    * A list of account IDs of the GuardDuty member accounts that you want to delete.
    */
  var AccountIds: typingsJapgolly.awsSdk.clientsGuarddutyMod.AccountIds
  
  /**
    * The unique ID of the detector of the GuardDuty account whose members you want to delete.
    */
  var DetectorId: typingsJapgolly.awsSdk.clientsGuarddutyMod.DetectorId
}
object DeleteMembersRequest {
  
  inline def apply(AccountIds: AccountIds, DetectorId: DetectorId): DeleteMembersRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMembersRequest]
  }
  
  extension [Self <: DeleteMembersRequest](x: Self) {
    
    inline def setAccountIds(value: AccountIds): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "AccountIds", js.Array(value*))
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
  }
}
