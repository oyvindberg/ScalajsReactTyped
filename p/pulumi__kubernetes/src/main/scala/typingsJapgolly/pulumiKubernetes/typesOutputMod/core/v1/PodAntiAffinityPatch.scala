package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Pod anti affinity is a group of inter pod anti affinity scheduling rules.
  */
trait PodAntiAffinityPatch extends StObject {
  
  /**
    * The scheduler will prefer to schedule pods to nodes that satisfy the anti-affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling anti-affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.
    */
  var preferredDuringSchedulingIgnoredDuringExecution: js.Array[WeightedPodAffinityTermPatch]
  
  /**
    * If the anti-affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the anti-affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.
    */
  var requiredDuringSchedulingIgnoredDuringExecution: js.Array[PodAffinityTermPatch]
}
object PodAntiAffinityPatch {
  
  inline def apply(
    preferredDuringSchedulingIgnoredDuringExecution: js.Array[WeightedPodAffinityTermPatch],
    requiredDuringSchedulingIgnoredDuringExecution: js.Array[PodAffinityTermPatch]
  ): PodAntiAffinityPatch = {
    val __obj = js.Dynamic.literal(preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution.asInstanceOf[js.Any], requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodAntiAffinityPatch]
  }
  
  extension [Self <: PodAntiAffinityPatch](x: Self) {
    
    inline def setPreferredDuringSchedulingIgnoredDuringExecution(value: js.Array[WeightedPodAffinityTermPatch]): Self = StObject.set(x, "preferredDuringSchedulingIgnoredDuringExecution", value.asInstanceOf[js.Any])
    
    inline def setPreferredDuringSchedulingIgnoredDuringExecutionVarargs(value: WeightedPodAffinityTermPatch*): Self = StObject.set(x, "preferredDuringSchedulingIgnoredDuringExecution", js.Array(value*))
    
    inline def setRequiredDuringSchedulingIgnoredDuringExecution(value: js.Array[PodAffinityTermPatch]): Self = StObject.set(x, "requiredDuringSchedulingIgnoredDuringExecution", value.asInstanceOf[js.Any])
    
    inline def setRequiredDuringSchedulingIgnoredDuringExecutionVarargs(value: PodAffinityTermPatch*): Self = StObject.set(x, "requiredDuringSchedulingIgnoredDuringExecution", js.Array(value*))
  }
}
