package typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'input'> */
trait ExpandDimsInputs extends StObject {
  
  var input: js.UndefOr[scala.Any] = js.undefined
}
object ExpandDimsInputs {
  
  inline def apply(): ExpandDimsInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpandDimsInputs]
  }
  
  extension [Self <: ExpandDimsInputs](x: Self) {
    
    inline def setInput(value: scala.Any): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
  }
}
