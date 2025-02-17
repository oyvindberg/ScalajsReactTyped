package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostParametersPathOrgPackagenamePackagetypeResponses354 extends StObject {
  
  /**
    * Restores a specific package version in an organization.
    *
    * You can restore a deleted package under the following conditions:
    *   - The package was deleted within the last 30 days.
    *   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package's namespace first.
    *
    * To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the `packages:read` and `packages:write` scopes. In addition:
    * - If `package_type` is not `container`, your token must also include the `repo` scope.
    * - If `package_type` is `container`, you must also have admin permissions to the container that you want to restore.
    */
  var post: ParametersPathOrgPackagenamePackagetypeResponses354
}
object PostParametersPathOrgPackagenamePackagetypeResponses354 {
  
  inline def apply(post: ParametersPathOrgPackagenamePackagetypeResponses354): PostParametersPathOrgPackagenamePackagetypeResponses354 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostParametersPathOrgPackagenamePackagetypeResponses354]
  }
  
  extension [Self <: PostParametersPathOrgPackagenamePackagetypeResponses354](x: Self) {
    
    inline def setPost(value: ParametersPathOrgPackagenamePackagetypeResponses354): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
