package typingsJapgolly.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGitHubEnterpriseConfigOperationMetadata extends StObject {
  
  /** Time the operation was completed. */
  var completeTime: js.UndefOr[String] = js.undefined
  
  /** Time the operation was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** The resource name of the GitHubEnterprise to be deleted. Format: `projects/{project}/locations/{location}/githubEnterpriseConfigs/{id}`. */
  var githubEnterpriseConfig: js.UndefOr[String] = js.undefined
}
object DeleteGitHubEnterpriseConfigOperationMetadata {
  
  inline def apply(): DeleteGitHubEnterpriseConfigOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteGitHubEnterpriseConfigOperationMetadata]
  }
  
  extension [Self <: DeleteGitHubEnterpriseConfigOperationMetadata](x: Self) {
    
    inline def setCompleteTime(value: String): Self = StObject.set(x, "completeTime", value.asInstanceOf[js.Any])
    
    inline def setCompleteTimeUndefined: Self = StObject.set(x, "completeTime", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setGithubEnterpriseConfig(value: String): Self = StObject.set(x, "githubEnterpriseConfig", value.asInstanceOf[js.Any])
    
    inline def setGithubEnterpriseConfigUndefined: Self = StObject.set(x, "githubEnterpriseConfig", js.undefined)
  }
}
