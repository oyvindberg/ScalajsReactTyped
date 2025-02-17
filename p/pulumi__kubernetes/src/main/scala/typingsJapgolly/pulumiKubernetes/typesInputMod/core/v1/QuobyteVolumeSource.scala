package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Quobyte mount that lasts the lifetime of a pod. Quobyte volumes do not support ownership management or SELinux relabeling.
  */
trait QuobyteVolumeSource extends StObject {
  
  /**
    * group to map volume access to Default is no group
    */
  var group: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * readOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults to false.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes
    */
  var registry: Input[String]
  
  /**
    * tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte volumes, value is set by the plugin
    */
  var tenant: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * user to map volume access to Defaults to serivceaccount user
    */
  var user: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * volume is a string that references an already created Quobyte volume by name.
    */
  var volume: Input[String]
}
object QuobyteVolumeSource {
  
  inline def apply(registry: Input[String], volume: Input[String]): QuobyteVolumeSource = {
    val __obj = js.Dynamic.literal(registry = registry.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuobyteVolumeSource]
  }
  
  extension [Self <: QuobyteVolumeSource](x: Self) {
    
    inline def setGroup(value: Input[String]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setReadOnly(value: Input[Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setRegistry(value: Input[String]): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setTenant(value: Input[String]): Self = StObject.set(x, "tenant", value.asInstanceOf[js.Any])
    
    inline def setTenantUndefined: Self = StObject.set(x, "tenant", js.undefined)
    
    inline def setUser(value: Input[String]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setVolume(value: Input[String]): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
