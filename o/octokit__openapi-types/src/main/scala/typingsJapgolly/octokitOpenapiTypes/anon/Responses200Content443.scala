package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content443 extends StObject {
  
  var parameters: PathBranchOwnerRepo
  
  var responses: `200Content443`
}
object Responses200Content443 {
  
  inline def apply(parameters: PathBranchOwnerRepo, responses: `200Content443`): Responses200Content443 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content443]
  }
  
  extension [Self <: Responses200Content443](x: Self) {
    
    inline def setParameters(value: PathBranchOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content443`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
