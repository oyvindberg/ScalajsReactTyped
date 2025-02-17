package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllocationSpecificSKUAllocationReservedInstanceProperties extends StObject {
  
  /** Specifies accelerator type and count. */
  var guestAccelerators: js.UndefOr[js.Array[AcceleratorConfig]] = js.undefined
  
  /** Specifies amount of local ssd to reserve with each instance. The type of disk is local-ssd. */
  var localSsds: js.UndefOr[js.Array[AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk]] = js.undefined
  
  /** An opaque location hint used to place the allocation close to other resources. This field is for use by internal tools that use the public API. */
  var locationHint: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies type of machine (name only) which has fixed number of vCPUs and fixed amount of memory. This also includes specifying custom machine type following
    * custom-NUMBER_OF_CPUS-AMOUNT_OF_MEMORY pattern.
    */
  var machineType: js.UndefOr[String] = js.undefined
  
  /** Minimum cpu platform the reservation. */
  var minCpuPlatform: js.UndefOr[String] = js.undefined
}
object AllocationSpecificSKUAllocationReservedInstanceProperties {
  
  inline def apply(): AllocationSpecificSKUAllocationReservedInstanceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllocationSpecificSKUAllocationReservedInstanceProperties]
  }
  
  extension [Self <: AllocationSpecificSKUAllocationReservedInstanceProperties](x: Self) {
    
    inline def setGuestAccelerators(value: js.Array[AcceleratorConfig]): Self = StObject.set(x, "guestAccelerators", value.asInstanceOf[js.Any])
    
    inline def setGuestAcceleratorsUndefined: Self = StObject.set(x, "guestAccelerators", js.undefined)
    
    inline def setGuestAcceleratorsVarargs(value: AcceleratorConfig*): Self = StObject.set(x, "guestAccelerators", js.Array(value*))
    
    inline def setLocalSsds(value: js.Array[AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk]): Self = StObject.set(x, "localSsds", value.asInstanceOf[js.Any])
    
    inline def setLocalSsdsUndefined: Self = StObject.set(x, "localSsds", js.undefined)
    
    inline def setLocalSsdsVarargs(value: AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk*): Self = StObject.set(x, "localSsds", js.Array(value*))
    
    inline def setLocationHint(value: String): Self = StObject.set(x, "locationHint", value.asInstanceOf[js.Any])
    
    inline def setLocationHintUndefined: Self = StObject.set(x, "locationHint", js.undefined)
    
    inline def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    inline def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    inline def setMinCpuPlatform(value: String): Self = StObject.set(x, "minCpuPlatform", value.asInstanceOf[js.Any])
    
    inline def setMinCpuPlatformUndefined: Self = StObject.set(x, "minCpuPlatform", js.undefined)
  }
}
