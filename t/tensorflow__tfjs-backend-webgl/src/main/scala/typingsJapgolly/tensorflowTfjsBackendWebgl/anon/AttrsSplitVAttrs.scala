package typingsJapgolly.tensorflowTfjsBackendWebgl.anon

import typingsJapgolly.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.SplitVAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.SplitVInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsSplitVAttrs extends StObject {
  
  var attrs: SplitVAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: SplitVInputs
}
object AttrsSplitVAttrs {
  
  inline def apply(attrs: SplitVAttrs, backend: MathBackendWebGL, inputs: SplitVInputs): AttrsSplitVAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsSplitVAttrs]
  }
  
  extension [Self <: AttrsSplitVAttrs](x: Self) {
    
    inline def setAttrs(value: SplitVAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: SplitVInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
