package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PersistentVolumeClaimTemplate is used to produce PersistentVolumeClaim objects as part of an EphemeralVolumeSource.
  */
trait PersistentVolumeClaimTemplate extends StObject {
  
  /**
    * May contain labels and annotations that will be copied into the PVC when creating it. No other fields are allowed and will be rejected during validation.
    */
  var metadata: ObjectMeta
  
  /**
    * The specification for the PersistentVolumeClaim. The entire content is copied unchanged into the PVC that gets created from this template. The same fields as in a PersistentVolumeClaim are also valid here.
    */
  var spec: PersistentVolumeClaimSpec
}
object PersistentVolumeClaimTemplate {
  
  inline def apply(metadata: ObjectMeta, spec: PersistentVolumeClaimSpec): PersistentVolumeClaimTemplate = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistentVolumeClaimTemplate]
  }
  
  extension [Self <: PersistentVolumeClaimTemplate](x: Self) {
    
    inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setSpec(value: PersistentVolumeClaimSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
  }
}
