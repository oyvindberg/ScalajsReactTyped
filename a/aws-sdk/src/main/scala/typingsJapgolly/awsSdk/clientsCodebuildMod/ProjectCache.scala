package typingsJapgolly.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectCache extends StObject {
  
  /**
    * Information about the cache location:     NO_CACHE or LOCAL: This value is ignored.    S3: This is the S3 bucket name/prefix.  
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * An array of strings that specify the local cache modes. You can use one or more local cache modes at the same time. This is only used for LOCAL cache types. Possible values are:  LOCAL_SOURCE_CACHE  Caches Git metadata for primary and secondary sources. After the cache is created, subsequent builds pull only the change between commits. This mode is a good choice for projects with a clean working directory and a source that is a large Git repository. If you choose this option and your project does not use a Git repository (GitHub, GitHub Enterprise, or Bitbucket), the option is ignored.   LOCAL_DOCKER_LAYER_CACHE  Caches existing Docker layers. This mode is a good choice for projects that build or pull large Docker images. It can prevent the performance issues caused by pulling large Docker images down from the network.     You can use a Docker layer cache in the Linux environment only.    The privileged flag must be set so that your project has the required Docker permissions.    You should consider the security implications before you use a Docker layer cache.      LOCAL_CUSTOM_CACHE  Caches directories you specify in the buildspec file. This mode is a good choice if your build scenario is not suited to one of the other three local cache modes. If you use a custom cache:    Only directories can be specified for caching. You cannot specify individual files.    Symlinks are used to reference cached directories.    Cached directories are linked to your build before it downloads its project sources. Cached items are overridden if a source item has the same name. Directories are specified using cache paths in the buildspec file.     
    */
  var modes: js.UndefOr[ProjectCacheModes] = js.undefined
  
  /**
    * The type of cache used by the build project. Valid values include:    NO_CACHE: The build project does not use any cache.    S3: The build project reads and writes from and to S3.    LOCAL: The build project stores a cache locally on a build host that is only available to that build host.  
    */
  var `type`: CacheType
}
object ProjectCache {
  
  inline def apply(`type`: CacheType): ProjectCache = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectCache]
  }
  
  extension [Self <: ProjectCache](x: Self) {
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setModes(value: ProjectCacheModes): Self = StObject.set(x, "modes", value.asInstanceOf[js.Any])
    
    inline def setModesUndefined: Self = StObject.set(x, "modes", js.undefined)
    
    inline def setModesVarargs(value: CacheMode*): Self = StObject.set(x, "modes", js.Array(value*))
    
    inline def setType(value: CacheType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
