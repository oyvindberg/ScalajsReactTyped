package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SeccompProfile defines a pod/container's seccomp profile settings. Only one profile source may be set.
  */
trait SeccompProfilePatch extends StObject {
  
  /**
    * localhostProfile indicates a profile defined in a file on the node should be used. The profile must be preconfigured on the node to work. Must be a descending path, relative to the kubelet's configured seccomp profile location. Must only be set if type is "Localhost".
    */
  var localhostProfile: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * type indicates which kind of seccomp profile will be applied. Valid options are:
    *
    * Localhost - a profile defined in a file on the node should be used. RuntimeDefault - the container runtime default profile should be used. Unconfined - no profile should be applied.
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
}
object SeccompProfilePatch {
  
  inline def apply(): SeccompProfilePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeccompProfilePatch]
  }
  
  extension [Self <: SeccompProfilePatch](x: Self) {
    
    inline def setLocalhostProfile(value: Input[String]): Self = StObject.set(x, "localhostProfile", value.asInstanceOf[js.Any])
    
    inline def setLocalhostProfileUndefined: Self = StObject.set(x, "localhostProfile", js.undefined)
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
