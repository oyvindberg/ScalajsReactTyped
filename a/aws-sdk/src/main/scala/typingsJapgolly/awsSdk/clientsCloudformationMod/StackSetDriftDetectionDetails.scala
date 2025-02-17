package typingsJapgolly.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackSetDriftDetectionDetails extends StObject {
  
  /**
    * The status of the stack set drift detection operation.    COMPLETED: The drift detection operation completed without failing on any stack instances.    FAILED: The drift detection operation exceeded the specified failure tolerance.    PARTIAL_SUCCESS: The drift detection operation completed without exceeding the failure tolerance for the operation.    IN_PROGRESS: The drift detection operation is currently being performed.    STOPPED: The user has canceled the drift detection operation.  
    */
  var DriftDetectionStatus: js.UndefOr[StackSetDriftDetectionStatus] = js.undefined
  
  /**
    * Status of the stack set's actual configuration compared to its expected template and parameter configuration. A stack set is considered to have drifted if one or more of its stack instances have drifted from their expected template and parameter configuration.    DRIFTED: One or more of the stack instances belonging to the stack set stack differs from the expected template and parameter configuration. A stack instance is considered to have drifted if one or more of the resources in the associated stack have drifted.    NOT_CHECKED: CloudFormation hasn't checked the stack set for drift.    IN_SYNC: All of the stack instances belonging to the stack set stack match from the expected template and parameter configuration.  
    */
  var DriftStatus: js.UndefOr[StackSetDriftStatus] = js.undefined
  
  /**
    * The number of stack instances that have drifted from the expected template and parameter configuration of the stack set. A stack instance is considered to have drifted if one or more of the resources in the associated stack don't match their expected configuration.
    */
  var DriftedStackInstancesCount: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.DriftedStackInstancesCount] = js.undefined
  
  /**
    * The number of stack instances for which the drift detection operation failed.
    */
  var FailedStackInstancesCount: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.FailedStackInstancesCount] = js.undefined
  
  /**
    * The number of stack instances that are currently being checked for drift.
    */
  var InProgressStackInstancesCount: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.InProgressStackInstancesCount] = js.undefined
  
  /**
    * The number of stack instances which match the expected template and parameter configuration of the stack set.
    */
  var InSyncStackInstancesCount: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.InSyncStackInstancesCount] = js.undefined
  
  /**
    * Most recent time when CloudFormation performed a drift detection operation on the stack set. This value will be NULL for any stack set on which drift detection hasn't yet been performed.
    */
  var LastDriftCheckTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The total number of stack instances belonging to this stack set. The total number of stack instances is equal to the total of:   Stack instances that match the stack set configuration.   Stack instances that have drifted from the stack set configuration.   Stack instances where the drift detection operation has failed.   Stack instances currently being checked for drift.  
    */
  var TotalStackInstancesCount: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.TotalStackInstancesCount] = js.undefined
}
object StackSetDriftDetectionDetails {
  
  inline def apply(): StackSetDriftDetectionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackSetDriftDetectionDetails]
  }
  
  extension [Self <: StackSetDriftDetectionDetails](x: Self) {
    
    inline def setDriftDetectionStatus(value: StackSetDriftDetectionStatus): Self = StObject.set(x, "DriftDetectionStatus", value.asInstanceOf[js.Any])
    
    inline def setDriftDetectionStatusUndefined: Self = StObject.set(x, "DriftDetectionStatus", js.undefined)
    
    inline def setDriftStatus(value: StackSetDriftStatus): Self = StObject.set(x, "DriftStatus", value.asInstanceOf[js.Any])
    
    inline def setDriftStatusUndefined: Self = StObject.set(x, "DriftStatus", js.undefined)
    
    inline def setDriftedStackInstancesCount(value: DriftedStackInstancesCount): Self = StObject.set(x, "DriftedStackInstancesCount", value.asInstanceOf[js.Any])
    
    inline def setDriftedStackInstancesCountUndefined: Self = StObject.set(x, "DriftedStackInstancesCount", js.undefined)
    
    inline def setFailedStackInstancesCount(value: FailedStackInstancesCount): Self = StObject.set(x, "FailedStackInstancesCount", value.asInstanceOf[js.Any])
    
    inline def setFailedStackInstancesCountUndefined: Self = StObject.set(x, "FailedStackInstancesCount", js.undefined)
    
    inline def setInProgressStackInstancesCount(value: InProgressStackInstancesCount): Self = StObject.set(x, "InProgressStackInstancesCount", value.asInstanceOf[js.Any])
    
    inline def setInProgressStackInstancesCountUndefined: Self = StObject.set(x, "InProgressStackInstancesCount", js.undefined)
    
    inline def setInSyncStackInstancesCount(value: InSyncStackInstancesCount): Self = StObject.set(x, "InSyncStackInstancesCount", value.asInstanceOf[js.Any])
    
    inline def setInSyncStackInstancesCountUndefined: Self = StObject.set(x, "InSyncStackInstancesCount", js.undefined)
    
    inline def setLastDriftCheckTimestamp(value: js.Date): Self = StObject.set(x, "LastDriftCheckTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastDriftCheckTimestampUndefined: Self = StObject.set(x, "LastDriftCheckTimestamp", js.undefined)
    
    inline def setTotalStackInstancesCount(value: TotalStackInstancesCount): Self = StObject.set(x, "TotalStackInstancesCount", value.asInstanceOf[js.Any])
    
    inline def setTotalStackInstancesCountUndefined: Self = StObject.set(x, "TotalStackInstancesCount", js.undefined)
  }
}
