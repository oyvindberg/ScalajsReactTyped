package typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitCherryPick
  extends StObject
     with GitAsyncRefOperation {
  
  var cherryPickId: Double
}
object GitCherryPick {
  
  inline def apply(
    _links: Any,
    cherryPickId: Double,
    detailedStatus: GitAsyncRefOperationDetail,
    parameters: GitAsyncRefOperationParameters,
    status: GitAsyncOperationStatus,
    url: String
  ): GitCherryPick = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], cherryPickId = cherryPickId.asInstanceOf[js.Any], detailedStatus = detailedStatus.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCherryPick]
  }
  
  extension [Self <: GitCherryPick](x: Self) {
    
    inline def setCherryPickId(value: Double): Self = StObject.set(x, "cherryPickId", value.asInstanceOf[js.Any])
  }
}
