package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonRole404Content6 extends StObject {
  
  var parameters: PathTeamidUsername
  
  var responses: `200ContentApplicationjsonRole404Content6`
}
object Responses200ContentApplicationjsonRole404Content6 {
  
  inline def apply(parameters: PathTeamidUsername, responses: `200ContentApplicationjsonRole404Content6`): Responses200ContentApplicationjsonRole404Content6 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonRole404Content6]
  }
  
  extension [Self <: Responses200ContentApplicationjsonRole404Content6](x: Self) {
    
    inline def setParameters(value: PathTeamidUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRole404Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
