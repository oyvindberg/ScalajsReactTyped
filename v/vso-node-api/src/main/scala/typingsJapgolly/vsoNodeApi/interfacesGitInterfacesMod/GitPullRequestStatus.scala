package typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod

import typingsJapgolly.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitPullRequestStatus
  extends StObject
     with GitStatus {
  
  /**
    * ID of the iteration to associate status with. Minimum value is 1.
    */
  var iterationId: Double
  
  /**
    * Custom properties of the status.
    */
  var properties: Any
}
object GitPullRequestStatus {
  
  inline def apply(
    _links: Any,
    context: GitStatusContext,
    createdBy: IdentityRef,
    creationDate: js.Date,
    description: String,
    id: Double,
    iterationId: Double,
    properties: Any,
    state: GitStatusState,
    targetUrl: String,
    updatedDate: js.Date
  ): GitPullRequestStatus = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], iterationId = iterationId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], targetUrl = targetUrl.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPullRequestStatus]
  }
  
  extension [Self <: GitPullRequestStatus](x: Self) {
    
    inline def setIterationId(value: Double): Self = StObject.set(x, "iterationId", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
