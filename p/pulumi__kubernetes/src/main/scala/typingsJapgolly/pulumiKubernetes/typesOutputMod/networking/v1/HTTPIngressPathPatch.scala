package typingsJapgolly.pulumiKubernetes.typesOutputMod.networking.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HTTPIngressPath associates a path with a backend. Incoming urls matching the path are forwarded to the backend.
  */
trait HTTPIngressPathPatch extends StObject {
  
  /**
    * Backend defines the referenced service endpoint to which the traffic will be forwarded to.
    */
  var backend: IngressBackendPatch
  
  /**
    * Path is matched against the path of an incoming request. Currently it can contain characters disallowed from the conventional "path" part of a URL as defined by RFC 3986. Paths must begin with a '/' and must be present when using PathType with value "Exact" or "Prefix".
    */
  var path: String
  
  /**
    * PathType determines the interpretation of the Path matching. PathType can be one of the following values: * Exact: Matches the URL path exactly. * Prefix: Matches based on a URL path prefix split by '/'. Matching is
    *   done on a path element by element basis. A path element refers is the
    *   list of labels in the path split by the '/' separator. A request is a
    *   match for path p if every p is an element-wise prefix of p of the
    *   request path. Note that if the last element of the path is a substring
    *   of the last element in request path, it is not a match (e.g. /foo/bar
    *   matches /foo/bar/baz, but does not match /foo/barbaz).
    * * ImplementationSpecific: Interpretation of the Path matching is up to
    *   the IngressClass. Implementations can treat this as a separate PathType
    *   or treat it identically to Prefix or Exact path types.
    * Implementations are required to support all path types.
    */
  var pathType: String
}
object HTTPIngressPathPatch {
  
  inline def apply(backend: IngressBackendPatch, path: String, pathType: String): HTTPIngressPathPatch = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathType = pathType.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTTPIngressPathPatch]
  }
  
  extension [Self <: HTTPIngressPathPatch](x: Self) {
    
    inline def setBackend(value: IngressBackendPatch): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathType(value: String): Self = StObject.set(x, "pathType", value.asInstanceOf[js.Any])
  }
}
