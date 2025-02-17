package typingsJapgolly.pulumiKubernetes.typesOutputMod.autoscaling.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HorizontalPodAutoscalerSpec describes the desired functionality of the HorizontalPodAutoscaler.
  */
trait HorizontalPodAutoscalerSpec extends StObject {
  
  /**
    * behavior configures the scaling behavior of the target in both Up and Down directions (scaleUp and scaleDown fields respectively). If not set, the default HPAScalingRules for scale up and scale down are used.
    */
  var behavior: HorizontalPodAutoscalerBehavior
  
  /**
    * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up. It cannot be less that minReplicas.
    */
  var maxReplicas: Double
  
  /**
    * metrics contains the specifications for which to use to calculate the desired replica count (the maximum replica count across all metrics will be used).  The desired replica count is calculated multiplying the ratio between the target value and the current value by the current number of pods.  Ergo, metrics used must decrease as the pod count is increased, and vice-versa.  See the individual metric source types for more information about how each type of metric must respond. If not set, the default metric will be set to 80% average CPU utilization.
    */
  var metrics: js.Array[MetricSpec]
  
  /**
    * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.  It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External metric is configured.  Scaling is active as long as at least one metric value is available.
    */
  var minReplicas: Double
  
  /**
    * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics should be collected, as well as to actually change the replica count.
    */
  var scaleTargetRef: CrossVersionObjectReference
}
object HorizontalPodAutoscalerSpec {
  
  inline def apply(
    behavior: HorizontalPodAutoscalerBehavior,
    maxReplicas: Double,
    metrics: js.Array[MetricSpec],
    minReplicas: Double,
    scaleTargetRef: CrossVersionObjectReference
  ): HorizontalPodAutoscalerSpec = {
    val __obj = js.Dynamic.literal(behavior = behavior.asInstanceOf[js.Any], maxReplicas = maxReplicas.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], minReplicas = minReplicas.asInstanceOf[js.Any], scaleTargetRef = scaleTargetRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalPodAutoscalerSpec]
  }
  
  extension [Self <: HorizontalPodAutoscalerSpec](x: Self) {
    
    inline def setBehavior(value: HorizontalPodAutoscalerBehavior): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    inline def setMaxReplicas(value: Double): Self = StObject.set(x, "maxReplicas", value.asInstanceOf[js.Any])
    
    inline def setMetrics(value: js.Array[MetricSpec]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsVarargs(value: MetricSpec*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setMinReplicas(value: Double): Self = StObject.set(x, "minReplicas", value.asInstanceOf[js.Any])
    
    inline def setScaleTargetRef(value: CrossVersionObjectReference): Self = StObject.set(x, "scaleTargetRef", value.asInstanceOf[js.Any])
  }
}
