package typingsJapgolly.pulumiPulumi.mod

import typingsJapgolly.pulumiPulumi.outputMod.Inputs
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@pulumi/pulumi", "CustomResource")
@js.native
open class CustomResource protected ()
  extends typingsJapgolly.pulumiPulumi.resourceMod.CustomResource {
  /**
    * Creates and registers a new managed resource.  t is the fully qualified type token and name
    * is the "name" part to use in creating a stable and globally unique URN for the object.
    * dependsOn is an optional list of other resources that this resource depends on, controlling
    * the order in which we perform resource operations. Creating an instance does not necessarily
    * perform a create on the physical entity which it represents, and instead, this is dependent
    * upon the diffing of the new goal state compared to the current known resource state.
    *
    * @param t The type of the resource.
    * @param name The _unique_ name of the resource.
    * @param props The arguments to use to populate the new resource.
    * @param opts A bag of options that control this resource's behavior.
    * @param dependency True if this is a synthetic resource used internally for dependency tracking.
    */
  def this(t: String, name: String) = this()
  def this(t: String, name: String, props: Inputs) = this()
  def this(t: String, name: String, props: Unit, opts: CustomResourceOptions) = this()
  def this(t: String, name: String, props: Inputs, opts: CustomResourceOptions) = this()
  def this(t: String, name: String, props: Unit, opts: Unit, dependency: Boolean) = this()
  def this(t: String, name: String, props: Unit, opts: CustomResourceOptions, dependency: Boolean) = this()
  def this(t: String, name: String, props: Inputs, opts: Unit, dependency: Boolean) = this()
  def this(t: String, name: String, props: Inputs, opts: CustomResourceOptions, dependency: Boolean) = this()
}
/* static members */
object CustomResource {
  
  @JSImport("@pulumi/pulumi", "CustomResource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns true if the given object is an instance of CustomResource.  This is designed to work even when
    * multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  inline def isInstance(obj: Any): /* is @pulumi/pulumi.@pulumi/pulumi/resource.CustomResource */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/pulumi.@pulumi/pulumi/resource.CustomResource */ Boolean]
}
