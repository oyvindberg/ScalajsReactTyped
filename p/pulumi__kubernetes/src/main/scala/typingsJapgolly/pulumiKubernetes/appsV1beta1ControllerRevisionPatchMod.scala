package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.ControllerRevision
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.appsSlashv1beta1
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMetaPatch
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appsV1beta1ControllerRevisionPatchMod {
  
  @JSImport("@pulumi/kubernetes/apps/v1beta1/controllerRevisionPatch", "ControllerRevisionPatch")
  @js.native
  open class ControllerRevisionPatch protected () extends CustomResource {
    /**
      * Create a ControllerRevisionPatch resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated apps/v1beta1/ControllerRevision is deprecated by apps/v1/ControllerRevision and not supported by Kubernetes v1.16+ clusters. */
    def this(name: String) = this()
    def this(name: String, args: ControllerRevisionPatchArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ControllerRevisionPatchArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[appsSlashv1beta1] = js.native
    
    /**
      * Data is the serialized representation of the state.
      */
    val data: Output_[Any] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[ControllerRevision] = js.native
    
    /**
      * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: Output_[ObjectMetaPatch] = js.native
    
    /**
      * Revision indicates the revision of the state represented by Data.
      */
    val revision: Output_[Double] = js.native
  }
  /* static members */
  object ControllerRevisionPatch {
    
    @JSImport("@pulumi/kubernetes/apps/v1beta1/controllerRevisionPatch", "ControllerRevisionPatch")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ControllerRevisionPatch resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): ControllerRevisionPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ControllerRevisionPatch]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): ControllerRevisionPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ControllerRevisionPatch]
    
    /**
      * Returns true if the given object is an instance of ControllerRevisionPatch.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/controllerRevisionPatch.ControllerRevisionPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/controllerRevisionPatch.ControllerRevisionPatch */ Boolean]
  }
  
  trait ControllerRevisionPatchArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: js.UndefOr[Input[appsSlashv1beta1]] = js.undefined
    
    /**
      * Data is the serialized representation of the state.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: js.UndefOr[Input[ControllerRevision]] = js.undefined
    
    /**
      * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    var metadata: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMetaPatch]] = js.undefined
    
    /**
      * Revision indicates the revision of the state represented by Data.
      */
    var revision: js.UndefOr[Input[Double]] = js.undefined
  }
  object ControllerRevisionPatchArgs {
    
    inline def apply(): ControllerRevisionPatchArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ControllerRevisionPatchArgs]
    }
    
    extension [Self <: ControllerRevisionPatchArgs](x: Self) {
      
      inline def setApiVersion(value: Input[appsSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setKind(value: Input[ControllerRevision]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMetaPatch]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setRevision(value: Input[Double]): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
    }
  }
}
