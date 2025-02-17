package typingsJapgolly.pulumiKubernetes

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiextensionsCustomResourceMod {
  
  @JSImport("@pulumi/kubernetes/apiextensions/customResource", "CustomResource")
  @js.native
  open class CustomResource protected ()
    extends typingsJapgolly.pulumiPulumi.mod.CustomResource {
    /**
      * Create a CustomResource resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CustomResourceArgs) = this()
    def this(name: String, args: CustomResourceArgs, opts: CustomResourceOptions) = this()
    
    /* private */ val __inputs: Any = js.native
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should
      * convert recognized schemas to the latest internal value, and may reject unrecognized
      * values. More info:
      * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
      */
    val apiVersion: Output_[String] = js.native
    
    def getInputs(): CustomResourceArgs = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may
      * infer this from the endpoint the client submits requests to. Cannot be updated. In
      * CamelCase. More info:
      * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
      */
    val kind: Output_[String] = js.native
    
    /**
      * Standard object metadata; More info:
      * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
      */
    val metadata: Output_[ObjectMeta] = js.native
  }
  /* static members */
  object CustomResource {
    
    @JSImport("@pulumi/kubernetes/apiextensions/customResource", "CustomResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing CustomResource resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    inline def get(name: String, opts: CustomResourceGetOptions): CustomResource = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[CustomResource]
  }
  
  trait CustomResourceArgs
    extends StObject
       with /* othersFields */ StringDictionary[Input[Any]] {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should
      * convert recognized schemas to the latest internal value, and may reject unrecognized
      * values. More info:
      * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
      */
    var apiVersion: Input[String]
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may
      * infer this from the endpoint the client submits requests to. Cannot be updated. In
      * CamelCase. More info:
      * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
      */
    var kind: Input[String]
    
    /**
      * Standard object metadata; More info:
      * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
      */
    var metadata: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMeta]] = js.undefined
  }
  object CustomResourceArgs {
    
    inline def apply(apiVersion: Input[String], kind: Input[String]): CustomResourceArgs = {
      val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomResourceArgs]
    }
    
    extension [Self <: CustomResourceArgs](x: Self) {
      
      inline def setApiVersion(value: Input[String]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setKind(value: Input[String]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
  
  trait CustomResourceGetOptions
    extends StObject
       with CustomResourceOptions {
    
    /**
      * apiVersion is the API version of the apiExtensions.CustomResource we wish to select,
      * as specified by the CustomResourceDefinition that defines it on the API server.
      */
    var apiVersion: Input[String]
    
    /**
      * An ID for the Kubernetes resource to retrieve. Takes the form [namespace]/[name] or
      * [name].
      */
    @JSName("id")
    var id_CustomResourceGetOptions: Input[ID]
    
    /**
      * kind is the kind of the apiextensions.CustomResource we wish to select, as specified by
      * the CustomResourceDefinition that defines it on the API server.
      */
    var kind: Input[String]
  }
  object CustomResourceGetOptions {
    
    inline def apply(apiVersion: Input[String], id: Input[ID], kind: Input[String]): CustomResourceGetOptions = {
      val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomResourceGetOptions]
    }
    
    extension [Self <: CustomResourceGetOptions](x: Self) {
      
      inline def setApiVersion(value: Input[String]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setId(value: Input[ID]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKind(value: Input[String]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
}
