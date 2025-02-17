package typingsJapgolly.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignalResourceInput extends StObject {
  
  /**
    * The logical ID of the resource that you want to signal. The logical ID is the name of the resource that given in the template.
    */
  var LogicalResourceId: typingsJapgolly.awsSdk.clientsCloudformationMod.LogicalResourceId
  
  /**
    * The stack name or unique stack ID that includes the resource that you want to signal.
    */
  var StackName: StackNameOrId
  
  /**
    * The status of the signal, which is either success or failure. A failure signal causes CloudFormation to immediately fail the stack creation or update.
    */
  var Status: ResourceSignalStatus
  
  /**
    * A unique ID of the signal. When you signal Amazon EC2 instances or Auto Scaling groups, specify the instance ID that you are signaling as the unique ID. If you send multiple signals to a single resource (such as signaling a wait condition), each signal requires a different unique ID.
    */
  var UniqueId: ResourceSignalUniqueId
}
object SignalResourceInput {
  
  inline def apply(
    LogicalResourceId: LogicalResourceId,
    StackName: StackNameOrId,
    Status: ResourceSignalStatus,
    UniqueId: ResourceSignalUniqueId
  ): SignalResourceInput = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], UniqueId = UniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalResourceInput]
  }
  
  extension [Self <: SignalResourceInput](x: Self) {
    
    inline def setLogicalResourceId(value: LogicalResourceId): Self = StObject.set(x, "LogicalResourceId", value.asInstanceOf[js.Any])
    
    inline def setStackName(value: StackNameOrId): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ResourceSignalStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setUniqueId(value: ResourceSignalUniqueId): Self = StObject.set(x, "UniqueId", value.asInstanceOf[js.Any])
  }
}
