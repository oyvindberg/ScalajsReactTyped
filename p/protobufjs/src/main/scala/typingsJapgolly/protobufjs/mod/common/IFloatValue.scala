package typingsJapgolly.protobufjs.mod.common

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a google.protobuf.FloatValue message. */
trait IFloatValue extends StObject {
  
  var value: js.UndefOr[Double] = js.undefined
}
object IFloatValue {
  
  inline def apply(): IFloatValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFloatValue]
  }
  
  extension [Self <: IFloatValue](x: Self) {
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
