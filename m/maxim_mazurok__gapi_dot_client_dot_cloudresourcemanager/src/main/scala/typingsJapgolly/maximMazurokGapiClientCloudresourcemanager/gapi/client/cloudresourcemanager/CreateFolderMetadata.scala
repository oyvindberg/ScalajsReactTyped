package typingsJapgolly.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFolderMetadata extends StObject {
  
  /** The display name of the folder. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The resource name of the folder or organization we are creating the folder under. */
  var parent: js.UndefOr[String] = js.undefined
}
object CreateFolderMetadata {
  
  inline def apply(): CreateFolderMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFolderMetadata]
  }
  
  extension [Self <: CreateFolderMetadata](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
