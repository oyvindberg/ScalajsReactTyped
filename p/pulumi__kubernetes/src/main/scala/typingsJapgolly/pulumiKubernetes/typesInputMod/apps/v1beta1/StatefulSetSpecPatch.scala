package typingsJapgolly.pulumiKubernetes.typesInputMod.apps.v1beta1

import typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1.PersistentVolumeClaimPatch
import typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1.PodTemplateSpecPatch
import typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.LabelSelectorPatch
import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A StatefulSetSpec is the specification of a StatefulSet.
  */
trait StatefulSetSpecPatch extends StObject {
  
  /**
    * podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down. The default policy is `OrderedReady`, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is `Parallel` which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once.
    */
  var podManagementPolicy: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.
    */
  var replicas: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet's revision history. The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The default value is 10.
    */
  var revisionHistoryLimit: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * selector is a label query over pods that should match the replica count. If empty, defaulted to labels on the pod template. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
    */
  var selector: js.UndefOr[Input[LabelSelectorPatch]] = js.undefined
  
  /**
    * serviceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where "pod-specific-string" is managed by the StatefulSet controller.
    */
  var serviceName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * template is the object that describes the pod that will be created if insufficient replicas are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have a unique identity from the rest of the StatefulSet.
    */
  var template: js.UndefOr[Input[PodTemplateSpecPatch]] = js.undefined
  
  /**
    * updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a revision is made to Template.
    */
  var updateStrategy: js.UndefOr[Input[StatefulSetUpdateStrategyPatch]] = js.undefined
  
  /**
    * volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.
    */
  var volumeClaimTemplates: js.UndefOr[Input[js.Array[Input[PersistentVolumeClaimPatch]]]] = js.undefined
}
object StatefulSetSpecPatch {
  
  inline def apply(): StatefulSetSpecPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulSetSpecPatch]
  }
  
  extension [Self <: StatefulSetSpecPatch](x: Self) {
    
    inline def setPodManagementPolicy(value: Input[String]): Self = StObject.set(x, "podManagementPolicy", value.asInstanceOf[js.Any])
    
    inline def setPodManagementPolicyUndefined: Self = StObject.set(x, "podManagementPolicy", js.undefined)
    
    inline def setReplicas(value: Input[Double]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    inline def setReplicasUndefined: Self = StObject.set(x, "replicas", js.undefined)
    
    inline def setRevisionHistoryLimit(value: Input[Double]): Self = StObject.set(x, "revisionHistoryLimit", value.asInstanceOf[js.Any])
    
    inline def setRevisionHistoryLimitUndefined: Self = StObject.set(x, "revisionHistoryLimit", js.undefined)
    
    inline def setSelector(value: Input[LabelSelectorPatch]): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setServiceName(value: Input[String]): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    inline def setTemplate(value: Input[PodTemplateSpecPatch]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setUpdateStrategy(value: Input[StatefulSetUpdateStrategyPatch]): Self = StObject.set(x, "updateStrategy", value.asInstanceOf[js.Any])
    
    inline def setUpdateStrategyUndefined: Self = StObject.set(x, "updateStrategy", js.undefined)
    
    inline def setVolumeClaimTemplates(value: Input[js.Array[Input[PersistentVolumeClaimPatch]]]): Self = StObject.set(x, "volumeClaimTemplates", value.asInstanceOf[js.Any])
    
    inline def setVolumeClaimTemplatesUndefined: Self = StObject.set(x, "volumeClaimTemplates", js.undefined)
    
    inline def setVolumeClaimTemplatesVarargs(value: Input[PersistentVolumeClaimPatch]*): Self = StObject.set(x, "volumeClaimTemplates", js.Array(value*))
  }
}
