package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath615Query250Responses351 extends StObject {
  
  var parameters: Path615Query250
  
  var responses: `351`
}
object ParametersPath615Query250Responses351 {
  
  inline def apply(parameters: Path615Query250, responses: `351`): ParametersPath615Query250Responses351 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath615Query250Responses351]
  }
  
  extension [Self <: ParametersPath615Query250Responses351](x: Self) {
    
    inline def setParameters(value: Path615Query250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `351`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
