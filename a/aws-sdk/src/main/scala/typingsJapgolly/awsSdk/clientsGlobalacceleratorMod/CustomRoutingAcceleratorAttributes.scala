package typingsJapgolly.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomRoutingAcceleratorAttributes extends StObject {
  
  /**
    * Indicates whether flow logs are enabled. The default value is false. If the value is true, FlowLogsS3Bucket and FlowLogsS3Prefix must be specified. For more information, see Flow logs in the Global Accelerator Developer Guide.
    */
  var FlowLogsEnabled: js.UndefOr[GenericBoolean] = js.undefined
  
  /**
    * The name of the Amazon S3 bucket for the flow logs. Attribute is required if FlowLogsEnabled is true. The bucket must exist and have a bucket policy that grants Global Accelerator permission to write to the bucket.
    */
  var FlowLogsS3Bucket: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The prefix for the location in the Amazon S3 bucket for the flow logs. Attribute is required if FlowLogsEnabled is true. If you don’t specify a prefix, the flow logs are stored in the root of the bucket. If you specify slash (/) for the S3 bucket prefix, the log file bucket folder structure will include a double slash (//), like the following: DOC-EXAMPLE-BUCKET//AWSLogs/aws_account_id
    */
  var FlowLogsS3Prefix: js.UndefOr[GenericString] = js.undefined
}
object CustomRoutingAcceleratorAttributes {
  
  inline def apply(): CustomRoutingAcceleratorAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomRoutingAcceleratorAttributes]
  }
  
  extension [Self <: CustomRoutingAcceleratorAttributes](x: Self) {
    
    inline def setFlowLogsEnabled(value: GenericBoolean): Self = StObject.set(x, "FlowLogsEnabled", value.asInstanceOf[js.Any])
    
    inline def setFlowLogsEnabledUndefined: Self = StObject.set(x, "FlowLogsEnabled", js.undefined)
    
    inline def setFlowLogsS3Bucket(value: GenericString): Self = StObject.set(x, "FlowLogsS3Bucket", value.asInstanceOf[js.Any])
    
    inline def setFlowLogsS3BucketUndefined: Self = StObject.set(x, "FlowLogsS3Bucket", js.undefined)
    
    inline def setFlowLogsS3Prefix(value: GenericString): Self = StObject.set(x, "FlowLogsS3Prefix", value.asInstanceOf[js.Any])
    
    inline def setFlowLogsS3PrefixUndefined: Self = StObject.set(x, "FlowLogsS3Prefix", js.undefined)
  }
}
