package typingsJapgolly.validator.mod.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsByteLengthOptions extends StObject {
  
  /**
    * @default undefined
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * @default 0
    */
  var min: js.UndefOr[Double] = js.undefined
}
object IsByteLengthOptions {
  
  inline def apply(): IsByteLengthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsByteLengthOptions]
  }
  
  extension [Self <: IsByteLengthOptions](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
