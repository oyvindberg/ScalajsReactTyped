package typingsJapgolly.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceleratorConfig extends StObject {
  
  /** The number of the accelerator cards of this type exposed to this instance. */
  var acceleratorCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Full URL, partial URI, or short name of the accelerator type resource to expose to this instance. See Compute Engine AcceleratorTypes
    * (https://cloud.google.com/compute/docs/reference/beta/acceleratorTypes).Examples:
    * https://www.googleapis.com/compute/beta/projects/[project_id]/zones/us-east1-a/acceleratorTypes/nvidia-tesla-k80
    * projects/[project_id]/zones/us-east1-a/acceleratorTypes/nvidia-tesla-k80 nvidia-tesla-k80Auto Zone Exception: If you are using the Dataproc Auto Zone Placement
    * (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the accelerator type resource, for
    * example, nvidia-tesla-k80.
    */
  var acceleratorTypeUri: js.UndefOr[String] = js.undefined
}
object AcceleratorConfig {
  
  inline def apply(): AcceleratorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceleratorConfig]
  }
  
  extension [Self <: AcceleratorConfig](x: Self) {
    
    inline def setAcceleratorCount(value: Double): Self = StObject.set(x, "acceleratorCount", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorCountUndefined: Self = StObject.set(x, "acceleratorCount", js.undefined)
    
    inline def setAcceleratorTypeUri(value: String): Self = StObject.set(x, "acceleratorTypeUri", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorTypeUriUndefined: Self = StObject.set(x, "acceleratorTypeUri", js.undefined)
  }
}
