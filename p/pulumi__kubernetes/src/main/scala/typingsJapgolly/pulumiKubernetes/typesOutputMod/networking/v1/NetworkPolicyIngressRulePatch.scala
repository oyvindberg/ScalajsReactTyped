package typingsJapgolly.pulumiKubernetes.typesOutputMod.networking.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NetworkPolicyIngressRule describes a particular set of traffic that is allowed to the pods matched by a NetworkPolicySpec's podSelector. The traffic must match both ports and from.
  */
trait NetworkPolicyIngressRulePatch extends StObject {
  
  /**
    * List of sources which should be able to access the pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by source). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the from list.
    */
  var from: js.Array[NetworkPolicyPeerPatch]
  
  /**
    * List of ports which should be made accessible on the pods selected for this rule. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
    */
  var ports: js.Array[NetworkPolicyPortPatch]
}
object NetworkPolicyIngressRulePatch {
  
  inline def apply(from: js.Array[NetworkPolicyPeerPatch], ports: js.Array[NetworkPolicyPortPatch]): NetworkPolicyIngressRulePatch = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkPolicyIngressRulePatch]
  }
  
  extension [Self <: NetworkPolicyIngressRulePatch](x: Self) {
    
    inline def setFrom(value: js.Array[NetworkPolicyPeerPatch]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromVarargs(value: NetworkPolicyPeerPatch*): Self = StObject.set(x, "from", js.Array(value*))
    
    inline def setPorts(value: js.Array[NetworkPolicyPortPatch]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsVarargs(value: NetworkPolicyPortPatch*): Self = StObject.set(x, "ports", js.Array(value*))
  }
}
