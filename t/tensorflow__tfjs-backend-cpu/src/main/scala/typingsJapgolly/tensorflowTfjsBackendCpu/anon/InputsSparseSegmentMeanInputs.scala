package typingsJapgolly.tensorflowTfjsBackendCpu.anon

import typingsJapgolly.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.SparseSegmentMeanInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsSparseSegmentMeanInputs extends StObject {
  
  var backend: MathBackendCPU
  
  var inputs: SparseSegmentMeanInputs
}
object InputsSparseSegmentMeanInputs {
  
  inline def apply(backend: MathBackendCPU, inputs: SparseSegmentMeanInputs): InputsSparseSegmentMeanInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsSparseSegmentMeanInputs]
  }
  
  extension [Self <: InputsSparseSegmentMeanInputs](x: Self) {
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: SparseSegmentMeanInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
