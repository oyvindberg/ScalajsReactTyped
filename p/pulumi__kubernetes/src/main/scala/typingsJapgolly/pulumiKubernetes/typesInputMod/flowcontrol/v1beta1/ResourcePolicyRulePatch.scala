package typingsJapgolly.pulumiKubernetes.typesInputMod.flowcontrol.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ResourcePolicyRule is a predicate that matches some resource requests, testing the request's verb and the target resource. A ResourcePolicyRule matches a resource request if and only if: (a) at least one member of verbs matches the request, (b) at least one member of apiGroups matches the request, (c) at least one member of resources matches the request, and (d) either (d1) the request does not specify a namespace (i.e., `Namespace==""`) and clusterScope is true or (d2) the request specifies a namespace and least one member of namespaces matches the request's namespace.
  */
trait ResourcePolicyRulePatch extends StObject {
  
  /**
    * `apiGroups` is a list of matching API groups and may not be empty. "*" matches all API groups and, if present, must be the only entry. Required.
    */
  var apiGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * `clusterScope` indicates whether to match requests that do not specify a namespace (which happens either because the resource is not namespaced or the request targets all namespaces). If this field is omitted or false then the `namespaces` field must contain a non-empty list.
    */
  var clusterScope: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * `namespaces` is a list of target namespaces that restricts matches.  A request that specifies a target namespace matches only if either (a) this list contains that target namespace or (b) this list contains "*".  Note that "*" matches any specified namespace but does not match a request that _does not specify_ a namespace (see the `clusterScope` field for that). This list may be empty, but only if `clusterScope` is true.
    */
  var namespaces: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * `resources` is a list of matching resources (i.e., lowercase and plural) with, if desired, subresource.  For example, [ "services", "nodes/status" ].  This list may not be empty. "*" matches all resources and, if present, must be the only entry. Required.
    */
  var resources: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * `verbs` is a list of matching verbs and may not be empty. "*" matches all verbs and, if present, must be the only entry. Required.
    */
  var verbs: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}
object ResourcePolicyRulePatch {
  
  inline def apply(): ResourcePolicyRulePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePolicyRulePatch]
  }
  
  extension [Self <: ResourcePolicyRulePatch](x: Self) {
    
    inline def setApiGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "apiGroups", value.asInstanceOf[js.Any])
    
    inline def setApiGroupsUndefined: Self = StObject.set(x, "apiGroups", js.undefined)
    
    inline def setApiGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "apiGroups", js.Array(value*))
    
    inline def setClusterScope(value: Input[Boolean]): Self = StObject.set(x, "clusterScope", value.asInstanceOf[js.Any])
    
    inline def setClusterScopeUndefined: Self = StObject.set(x, "clusterScope", js.undefined)
    
    inline def setNamespaces(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "namespaces", value.asInstanceOf[js.Any])
    
    inline def setNamespacesUndefined: Self = StObject.set(x, "namespaces", js.undefined)
    
    inline def setNamespacesVarargs(value: Input[String]*): Self = StObject.set(x, "namespaces", js.Array(value*))
    
    inline def setResources(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: Input[String]*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setVerbs(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "verbs", value.asInstanceOf[js.Any])
    
    inline def setVerbsUndefined: Self = StObject.set(x, "verbs", js.undefined)
    
    inline def setVerbsVarargs(value: Input[String]*): Self = StObject.set(x, "verbs", js.Array(value*))
  }
}
