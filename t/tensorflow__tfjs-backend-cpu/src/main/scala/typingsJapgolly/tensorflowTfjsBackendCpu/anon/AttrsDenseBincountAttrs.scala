package typingsJapgolly.tensorflowTfjsBackendCpu.anon

import typingsJapgolly.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.DenseBincountAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.DenseBincountInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsDenseBincountAttrs extends StObject {
  
  var attrs: DenseBincountAttrs
  
  var backend: MathBackendCPU
  
  var inputs: DenseBincountInputs
}
object AttrsDenseBincountAttrs {
  
  inline def apply(attrs: DenseBincountAttrs, backend: MathBackendCPU, inputs: DenseBincountInputs): AttrsDenseBincountAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsDenseBincountAttrs]
  }
  
  extension [Self <: AttrsDenseBincountAttrs](x: Self) {
    
    inline def setAttrs(value: DenseBincountAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: DenseBincountInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
