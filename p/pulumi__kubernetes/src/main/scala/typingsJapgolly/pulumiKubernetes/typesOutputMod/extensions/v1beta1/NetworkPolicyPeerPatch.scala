package typingsJapgolly.pulumiKubernetes.typesOutputMod.extensions.v1beta1

import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.LabelSelectorPatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DEPRECATED 1.9 - This group version of NetworkPolicyPeer is deprecated by networking/v1/NetworkPolicyPeer.
  */
trait NetworkPolicyPeerPatch extends StObject {
  
  /**
    * IPBlock defines policy on a particular IPBlock. If this field is set then neither of the other fields can be.
    */
  var ipBlock: IPBlockPatch
  
  /**
    * Selects Namespaces using cluster-scoped labels. This field follows standard label selector semantics; if present but empty, it selects all namespaces.
    *
    * If PodSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector.
    */
  var namespaceSelector: LabelSelectorPatch
  
  /**
    * This is a label selector which selects Pods. This field follows standard label selector semantics; if present but empty, it selects all pods.
    *
    * If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects the Pods matching PodSelector in the policy's own Namespace.
    */
  var podSelector: LabelSelectorPatch
}
object NetworkPolicyPeerPatch {
  
  inline def apply(ipBlock: IPBlockPatch, namespaceSelector: LabelSelectorPatch, podSelector: LabelSelectorPatch): NetworkPolicyPeerPatch = {
    val __obj = js.Dynamic.literal(ipBlock = ipBlock.asInstanceOf[js.Any], namespaceSelector = namespaceSelector.asInstanceOf[js.Any], podSelector = podSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkPolicyPeerPatch]
  }
  
  extension [Self <: NetworkPolicyPeerPatch](x: Self) {
    
    inline def setIpBlock(value: IPBlockPatch): Self = StObject.set(x, "ipBlock", value.asInstanceOf[js.Any])
    
    inline def setNamespaceSelector(value: LabelSelectorPatch): Self = StObject.set(x, "namespaceSelector", value.asInstanceOf[js.Any])
    
    inline def setPodSelector(value: LabelSelectorPatch): Self = StObject.set(x, "podSelector", value.asInstanceOf[js.Any])
  }
}
