package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ReplicationControllerStatus represents the current status of a replication controller.
  */
trait ReplicationControllerStatus extends StObject {
  
  /**
    * The number of available replicas (ready for at least minReadySeconds) for this replication controller.
    */
  var availableReplicas: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Represents the latest available observations of a replication controller's current state.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[ReplicationControllerCondition]]]] = js.undefined
  
  /**
    * The number of pods that have labels matching the labels of the pod template of the replication controller.
    */
  var fullyLabeledReplicas: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * ObservedGeneration reflects the generation of the most recently observed replication controller.
    */
  var observedGeneration: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * The number of ready replicas for this replication controller.
    */
  var readyReplicas: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Replicas is the most recently oberved number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller
    */
  var replicas: Input[Double]
}
object ReplicationControllerStatus {
  
  inline def apply(replicas: Input[Double]): ReplicationControllerStatus = {
    val __obj = js.Dynamic.literal(replicas = replicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationControllerStatus]
  }
  
  extension [Self <: ReplicationControllerStatus](x: Self) {
    
    inline def setAvailableReplicas(value: Input[Double]): Self = StObject.set(x, "availableReplicas", value.asInstanceOf[js.Any])
    
    inline def setAvailableReplicasUndefined: Self = StObject.set(x, "availableReplicas", js.undefined)
    
    inline def setConditions(value: Input[js.Array[Input[ReplicationControllerCondition]]]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: Input[ReplicationControllerCondition]*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setFullyLabeledReplicas(value: Input[Double]): Self = StObject.set(x, "fullyLabeledReplicas", value.asInstanceOf[js.Any])
    
    inline def setFullyLabeledReplicasUndefined: Self = StObject.set(x, "fullyLabeledReplicas", js.undefined)
    
    inline def setObservedGeneration(value: Input[Double]): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
    
    inline def setObservedGenerationUndefined: Self = StObject.set(x, "observedGeneration", js.undefined)
    
    inline def setReadyReplicas(value: Input[Double]): Self = StObject.set(x, "readyReplicas", value.asInstanceOf[js.Any])
    
    inline def setReadyReplicasUndefined: Self = StObject.set(x, "readyReplicas", js.undefined)
    
    inline def setReplicas(value: Input[Double]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
  }
}
