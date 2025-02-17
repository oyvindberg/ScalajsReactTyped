package typingsJapgolly.pulumiKubernetes.typesInputMod.autoscaling.v2beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ResourceMetricSource indicates how to scale on a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  The values will be averaged together before being compared to the target.  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.  Only one "target" type should be set.
  */
trait ResourceMetricSource extends StObject {
  
  /**
    * name is the name of the resource in question.
    */
  var name: Input[String]
  
  /**
    * targetAverageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.
    */
  var targetAverageUtilization: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * targetAverageValue is the target value of the average of the resource metric across all relevant pods, as a raw value (instead of as a percentage of the request), similar to the "pods" metric source type.
    */
  var targetAverageValue: js.UndefOr[Input[String]] = js.undefined
}
object ResourceMetricSource {
  
  inline def apply(name: Input[String]): ResourceMetricSource = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceMetricSource]
  }
  
  extension [Self <: ResourceMetricSource](x: Self) {
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTargetAverageUtilization(value: Input[Double]): Self = StObject.set(x, "targetAverageUtilization", value.asInstanceOf[js.Any])
    
    inline def setTargetAverageUtilizationUndefined: Self = StObject.set(x, "targetAverageUtilization", js.undefined)
    
    inline def setTargetAverageValue(value: Input[String]): Self = StObject.set(x, "targetAverageValue", value.asInstanceOf[js.Any])
    
    inline def setTargetAverageValueUndefined: Self = StObject.set(x, "targetAverageValue", js.undefined)
  }
}
