package typingsJapgolly.tensorflowTfjsBackendCpu.anon

import typingsJapgolly.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.ImagInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsImagInputs extends StObject {
  
  var backend: MathBackendCPU
  
  var inputs: ImagInputs
}
object InputsImagInputs {
  
  inline def apply(backend: MathBackendCPU, inputs: ImagInputs): InputsImagInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsImagInputs]
  }
  
  extension [Self <: InputsImagInputs](x: Self) {
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: ImagInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
