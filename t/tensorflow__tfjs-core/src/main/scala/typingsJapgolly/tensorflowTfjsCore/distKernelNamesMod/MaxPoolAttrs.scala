package typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod

import typingsJapgolly.tensorflowTfjsCore.distOpsConvUtilMod.ExplicitPadding
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxPoolAttrs extends StObject {
  
  var dimRoundingMode: js.UndefOr[floor | round | ceil] = js.undefined
  
  var filterSize: (js.Tuple2[Double, Double]) | Double
  
  var pad: valid_ | same_ | Double | ExplicitPadding
  
  var strides: (js.Tuple2[Double, Double]) | Double
}
object MaxPoolAttrs {
  
  inline def apply(
    filterSize: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_ | Double | ExplicitPadding,
    strides: (js.Tuple2[Double, Double]) | Double
  ): MaxPoolAttrs = {
    val __obj = js.Dynamic.literal(filterSize = filterSize.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxPoolAttrs]
  }
  
  extension [Self <: MaxPoolAttrs](x: Self) {
    
    inline def setDimRoundingMode(value: floor | round | ceil): Self = StObject.set(x, "dimRoundingMode", value.asInstanceOf[js.Any])
    
    inline def setDimRoundingModeUndefined: Self = StObject.set(x, "dimRoundingMode", js.undefined)
    
    inline def setFilterSize(value: (js.Tuple2[Double, Double]) | Double): Self = StObject.set(x, "filterSize", value.asInstanceOf[js.Any])
    
    inline def setPad(value: valid_ | same_ | Double | ExplicitPadding): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setStrides(value: (js.Tuple2[Double, Double]) | Double): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
  }
}
