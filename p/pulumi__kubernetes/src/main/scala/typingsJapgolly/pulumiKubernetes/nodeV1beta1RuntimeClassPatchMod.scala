package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.RuntimeClass
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.nodeDotk8sDotioSlashv1beta1
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMetaPatch
import typingsJapgolly.pulumiKubernetes.typesOutputMod.node.v1beta1.OverheadPatch
import typingsJapgolly.pulumiKubernetes.typesOutputMod.node.v1beta1.SchedulingPatch
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeV1beta1RuntimeClassPatchMod {
  
  @JSImport("@pulumi/kubernetes/node/v1beta1/runtimeClassPatch", "RuntimeClassPatch")
  @js.native
  open class RuntimeClassPatch protected () extends CustomResource {
    /**
      * Create a RuntimeClassPatch resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RuntimeClassPatchArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: RuntimeClassPatchArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[nodeDotk8sDotioSlashv1beta1] = js.native
    
    /**
      * Handler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node & CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The Handler must conform to the DNS Label (RFC 1123) requirements, and is immutable.
      */
    val handler: Output_[String] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[RuntimeClass] = js.native
    
    /**
      * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: Output_[ObjectMetaPatch] = js.native
    
    /**
      * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is alpha-level as of Kubernetes v1.15, and is only honored by servers that enable the PodOverhead feature.
      */
    val overhead: Output_[OverheadPatch] = js.native
    
    /**
      * Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
      */
    val scheduling: Output_[SchedulingPatch] = js.native
  }
  /* static members */
  object RuntimeClassPatch {
    
    @JSImport("@pulumi/kubernetes/node/v1beta1/runtimeClassPatch", "RuntimeClassPatch")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RuntimeClassPatch resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): RuntimeClassPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[RuntimeClassPatch]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): RuntimeClassPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RuntimeClassPatch]
    
    /**
      * Returns true if the given object is an instance of RuntimeClassPatch.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/node/v1beta1/runtimeClassPatch.RuntimeClassPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/node/v1beta1/runtimeClassPatch.RuntimeClassPatch */ Boolean]
  }
  
  trait RuntimeClassPatchArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: js.UndefOr[Input[nodeDotk8sDotioSlashv1beta1]] = js.undefined
    
    /**
      * Handler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node & CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The Handler must conform to the DNS Label (RFC 1123) requirements, and is immutable.
      */
    var handler: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: js.UndefOr[Input[RuntimeClass]] = js.undefined
    
    /**
      * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    var metadata: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMetaPatch]] = js.undefined
    
    /**
      * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is alpha-level as of Kubernetes v1.15, and is only honored by servers that enable the PodOverhead feature.
      */
    var overhead: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.typesInputMod.node.v1beta1.OverheadPatch]] = js.undefined
    
    /**
      * Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
      */
    var scheduling: js.UndefOr[
        Input[typingsJapgolly.pulumiKubernetes.typesInputMod.node.v1beta1.SchedulingPatch]
      ] = js.undefined
  }
  object RuntimeClassPatchArgs {
    
    inline def apply(): RuntimeClassPatchArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RuntimeClassPatchArgs]
    }
    
    extension [Self <: RuntimeClassPatchArgs](x: Self) {
      
      inline def setApiVersion(value: Input[nodeDotk8sDotioSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setHandler(value: Input[String]): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      inline def setKind(value: Input[RuntimeClass]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMetaPatch]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setOverhead(value: Input[typingsJapgolly.pulumiKubernetes.typesInputMod.node.v1beta1.OverheadPatch]): Self = StObject.set(x, "overhead", value.asInstanceOf[js.Any])
      
      inline def setOverheadUndefined: Self = StObject.set(x, "overhead", js.undefined)
      
      inline def setScheduling(value: Input[typingsJapgolly.pulumiKubernetes.typesInputMod.node.v1beta1.SchedulingPatch]): Self = StObject.set(x, "scheduling", value.asInstanceOf[js.Any])
      
      inline def setSchedulingUndefined: Self = StObject.set(x, "scheduling", js.undefined)
    }
  }
}
