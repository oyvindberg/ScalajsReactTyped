package typingsJapgolly.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitiateLayerUploadRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID associated with the registry to which you intend to upload layers. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The name of the repository to which you intend to upload layers.
    */
  var repositoryName: RepositoryName
}
object InitiateLayerUploadRequest {
  
  inline def apply(repositoryName: RepositoryName): InitiateLayerUploadRequest = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitiateLayerUploadRequest]
  }
  
  extension [Self <: InitiateLayerUploadRequest](x: Self) {
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
