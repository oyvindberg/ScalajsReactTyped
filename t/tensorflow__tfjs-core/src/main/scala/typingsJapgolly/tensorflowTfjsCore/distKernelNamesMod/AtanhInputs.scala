package typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_names.UnaryInputs */
trait AtanhInputs extends StObject {
  
  var x: js.UndefOr[scala.Any] = js.undefined
}
object AtanhInputs {
  
  inline def apply(): AtanhInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AtanhInputs]
  }
  
  extension [Self <: AtanhInputs](x: Self) {
    
    inline def setX(value: scala.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
