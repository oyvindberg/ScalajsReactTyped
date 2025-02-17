package typingsJapgolly.tensorflowTfjsBackendWebgl.anon

import typingsJapgolly.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.MaxPoolAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.MaxPoolInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsMaxPoolAttrs extends StObject {
  
  var attrs: MaxPoolAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: MaxPoolInputs
}
object AttrsMaxPoolAttrs {
  
  inline def apply(attrs: MaxPoolAttrs, backend: MathBackendWebGL, inputs: MaxPoolInputs): AttrsMaxPoolAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsMaxPoolAttrs]
  }
  
  extension [Self <: AttrsMaxPoolAttrs](x: Self) {
    
    inline def setAttrs(value: MaxPoolAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: MaxPoolInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
