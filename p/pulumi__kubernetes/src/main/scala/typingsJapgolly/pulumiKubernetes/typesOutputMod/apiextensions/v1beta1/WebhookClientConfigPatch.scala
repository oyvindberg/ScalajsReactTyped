package typingsJapgolly.pulumiKubernetes.typesOutputMod.apiextensions.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * WebhookClientConfig contains the information to make a TLS connection with the webhook.
  */
trait WebhookClientConfigPatch extends StObject {
  
  /**
    * caBundle is a PEM encoded CA bundle which will be used to validate the webhook's server certificate. If unspecified, system trust roots on the apiserver are used.
    */
  var caBundle: String
  
  /**
    * service is a reference to the service for this webhook. Either service or url must be specified.
    *
    * If the webhook is running within the cluster, then you should use `service`.
    */
  var service: ServiceReferencePatch
  
  /**
    * url gives the location of the webhook, in standard URL form (`scheme://host:port/path`). Exactly one of `url` or `service` must be specified.
    *
    * The `host` should not refer to a service running in the cluster; use the `service` field instead. The host might be resolved via external DNS in some apiservers (e.g., `kube-apiserver` cannot resolve in-cluster DNS as that would be a layering violation). `host` may also be an IP address.
    *
    * Please note that using `localhost` or `127.0.0.1` as a `host` is risky unless you take great care to run this webhook on all hosts which run an apiserver which might need to make calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to turn up in a new cluster.
    *
    * The scheme must be "https"; the URL must begin with "https://".
    *
    * A path is optional, and if present may be any string permissible in a URL. You may use the path to pass an arbitrary string to the webhook, for example, a cluster identifier.
    *
    * Attempting to use a user or basic auth e.g. "user:password@" is not allowed. Fragments ("#...") and query parameters ("?...") are not allowed, either.
    */
  var url: String
}
object WebhookClientConfigPatch {
  
  inline def apply(caBundle: String, service: ServiceReferencePatch, url: String): WebhookClientConfigPatch = {
    val __obj = js.Dynamic.literal(caBundle = caBundle.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookClientConfigPatch]
  }
  
  extension [Self <: WebhookClientConfigPatch](x: Self) {
    
    inline def setCaBundle(value: String): Self = StObject.set(x, "caBundle", value.asInstanceOf[js.Any])
    
    inline def setService(value: ServiceReferencePatch): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
