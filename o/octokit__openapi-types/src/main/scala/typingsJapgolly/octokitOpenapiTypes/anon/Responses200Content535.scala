package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content535 extends StObject {
  
  var parameters: PathIssuenumberOwnerRepoQuery250
  
  var responses: `200Content535`
}
object Responses200Content535 {
  
  inline def apply(parameters: PathIssuenumberOwnerRepoQuery250, responses: `200Content535`): Responses200Content535 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content535]
  }
  
  extension [Self <: Responses200Content535](x: Self) {
    
    inline def setParameters(value: PathIssuenumberOwnerRepoQuery250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content535`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
