package typingsJapgolly.awsSdk.clientsApplicationautoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepScalingPolicyConfiguration extends StObject {
  
  /**
    * Specifies how the ScalingAdjustment value in a StepAdjustment is interpreted (for example, an absolute number or a percentage). The valid values are ChangeInCapacity, ExactCapacity, and PercentChangeInCapacity.   AdjustmentType is required if you are adding a new step scaling policy configuration.
    */
  var AdjustmentType: js.UndefOr[typingsJapgolly.awsSdk.clientsApplicationautoscalingMod.AdjustmentType] = js.undefined
  
  /**
    * The amount of time, in seconds, to wait for a previous scaling activity to take effect.  With scale-out policies, the intention is to continuously (but not excessively) scale out. After Application Auto Scaling successfully scales out using a step scaling policy, it starts to calculate the cooldown time. The scaling policy won't increase the desired capacity again unless either a larger scale out is triggered or the cooldown period ends. While the cooldown period is in effect, capacity added by the initiating scale-out activity is calculated as part of the desired capacity for the next scale-out activity. For example, when an alarm triggers a step scaling policy to increase the capacity by 2, the scaling activity completes successfully, and a cooldown period starts. If the alarm triggers again during the cooldown period but at a more aggressive step adjustment of 3, the previous increase of 2 is considered part of the current capacity. Therefore, only 1 is added to the capacity. With scale-in policies, the intention is to scale in conservatively to protect your application’s availability, so scale-in activities are blocked until the cooldown period has expired. However, if another alarm triggers a scale-out activity during the cooldown period after a scale-in activity, Application Auto Scaling scales out the target immediately. In this case, the cooldown period for the scale-in activity stops and doesn't complete. Application Auto Scaling provides a default value of 600 for Amazon ElastiCache replication groups and a default value of 300 for the following scalable targets:   AppStream 2.0 fleets   Aurora DB clusters   ECS services   EMR clusters    Neptune clusters   SageMaker endpoint variants   Spot Fleets   Custom resources   For all other scalable targets, the default value is 0:   Amazon Comprehend document classification and entity recognizer endpoints   DynamoDB tables and global secondary indexes   Amazon Keyspaces tables   Lambda provisioned concurrency   Amazon MSK broker storage  
    */
  var Cooldown: js.UndefOr[typingsJapgolly.awsSdk.clientsApplicationautoscalingMod.Cooldown] = js.undefined
  
  /**
    * The aggregation type for the CloudWatch metrics. Valid values are Minimum, Maximum, and Average. If the aggregation type is null, the value is treated as Average.
    */
  var MetricAggregationType: js.UndefOr[typingsJapgolly.awsSdk.clientsApplicationautoscalingMod.MetricAggregationType] = js.undefined
  
  /**
    * The minimum value to scale by when the adjustment type is PercentChangeInCapacity. For example, suppose that you create a step scaling policy to scale out an Amazon ECS service by 25 percent and you specify a MinAdjustmentMagnitude of 2. If the service has 4 tasks and the scaling policy is performed, 25 percent of 4 is 1. However, because you specified a MinAdjustmentMagnitude of 2, Application Auto Scaling scales out the service by 2 tasks.
    */
  var MinAdjustmentMagnitude: js.UndefOr[typingsJapgolly.awsSdk.clientsApplicationautoscalingMod.MinAdjustmentMagnitude] = js.undefined
  
  /**
    * A set of adjustments that enable you to scale based on the size of the alarm breach. At least one step adjustment is required if you are adding a new step scaling policy configuration.
    */
  var StepAdjustments: js.UndefOr[typingsJapgolly.awsSdk.clientsApplicationautoscalingMod.StepAdjustments] = js.undefined
}
object StepScalingPolicyConfiguration {
  
  inline def apply(): StepScalingPolicyConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepScalingPolicyConfiguration]
  }
  
  extension [Self <: StepScalingPolicyConfiguration](x: Self) {
    
    inline def setAdjustmentType(value: AdjustmentType): Self = StObject.set(x, "AdjustmentType", value.asInstanceOf[js.Any])
    
    inline def setAdjustmentTypeUndefined: Self = StObject.set(x, "AdjustmentType", js.undefined)
    
    inline def setCooldown(value: Cooldown): Self = StObject.set(x, "Cooldown", value.asInstanceOf[js.Any])
    
    inline def setCooldownUndefined: Self = StObject.set(x, "Cooldown", js.undefined)
    
    inline def setMetricAggregationType(value: MetricAggregationType): Self = StObject.set(x, "MetricAggregationType", value.asInstanceOf[js.Any])
    
    inline def setMetricAggregationTypeUndefined: Self = StObject.set(x, "MetricAggregationType", js.undefined)
    
    inline def setMinAdjustmentMagnitude(value: MinAdjustmentMagnitude): Self = StObject.set(x, "MinAdjustmentMagnitude", value.asInstanceOf[js.Any])
    
    inline def setMinAdjustmentMagnitudeUndefined: Self = StObject.set(x, "MinAdjustmentMagnitude", js.undefined)
    
    inline def setStepAdjustments(value: StepAdjustments): Self = StObject.set(x, "StepAdjustments", value.asInstanceOf[js.Any])
    
    inline def setStepAdjustmentsUndefined: Self = StObject.set(x, "StepAdjustments", js.undefined)
    
    inline def setStepAdjustmentsVarargs(value: StepAdjustment*): Self = StObject.set(x, "StepAdjustments", js.Array(value*))
  }
}
