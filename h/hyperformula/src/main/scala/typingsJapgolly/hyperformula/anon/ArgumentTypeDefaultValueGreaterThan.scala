package typingsJapgolly.hyperformula.anon

import typingsJapgolly.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgumentTypeDefaultValueGreaterThan extends StObject {
  
  var argumentType: ArgumentTypes
  
  var defaultValue: Unit
  
  var greaterThan: Double
}
object ArgumentTypeDefaultValueGreaterThan {
  
  inline def apply(argumentType: ArgumentTypes, defaultValue: Unit, greaterThan: Double): ArgumentTypeDefaultValueGreaterThan = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], greaterThan = greaterThan.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentTypeDefaultValueGreaterThan]
  }
  
  extension [Self <: ArgumentTypeDefaultValueGreaterThan](x: Self) {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: Unit): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setGreaterThan(value: Double): Self = StObject.set(x, "greaterThan", value.asInstanceOf[js.Any])
  }
}
