package typingsJapgolly.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 'Properties' object passed into the WL.init method.
  */
trait IInitProperties extends StObject {
  
  /**
    * Web apps: Required.
    * Specifies your app's OAuth client ID for web apps.
    *
    * Windows Store apps using JavaScript: not needed.
    */
  var client_id: js.UndefOr[String] = js.undefined
  
  /**
    * If set to "true", the library logs error info to the web browser
    * console and notifies your app by means of the wl.log event.
    * @default true
    */
  var logging: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Contains the default redirect URI to be used for OAuth
    * authentication. For web apps, the OAuth server redirects to this URI
    * during the OAuth flow.
    *
    * For Windows Store apps using JavaScript, specifying this value will
    * enable the library to return the authentication token.
    */
  var redirect_uri: js.UndefOr[String] = js.undefined
  
  /**
    * Web apps: optional.
    * Windows Store apps using JavaScript: not applicable.
    * Specifies the OAuth response type value. If set to "token", the
    * client receives the access token directly. If set to "code", the
    * client receives an authorization code, and the app server that serves
    * the redirect_uri page should retrieve the access_token from the OAuth
    * server by using the authorization code and client secret.
    *
    * You can only set response_type to "code" for web apps.
    * @default "token"
    */
  var response_type: js.UndefOr[String] = js.undefined
  
  /**
    * The scope values used to determine which portions of user data the
    * app has access to, if the user consents.
    *
    * For a single scope, use this format: scope: "wl.signin". For multiple
    * scopes, use this format: scope: ["wl.signin", "wl.basic"].
    */
  var scope: js.UndefOr[Any] = js.undefined
  
  /**
    * Web apps: optional.
    * Windows Store apps using JavaScript: not applicable.
    * If set to "true", the library specifies a secure attribute when
    * writing a cookie on an HTTPS page.
    * @default "false"
    */
  var secure_cookie: js.UndefOr[String] = js.undefined
  
  /**
    * Web apps: optional.
    * Windows Store apps using JavaScript: not applicable.
    * If set to "true", the library attempts to retrieve the user's sign-in
    * status from Live Connect.
    * @default true
    */
  var status: js.UndefOr[Boolean] = js.undefined
}
object IInitProperties {
  
  inline def apply(): IInitProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInitProperties]
  }
  
  extension [Self <: IInitProperties](x: Self) {
    
    inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    inline def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
    
    inline def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    inline def setRedirect_uri(value: String): Self = StObject.set(x, "redirect_uri", value.asInstanceOf[js.Any])
    
    inline def setRedirect_uriUndefined: Self = StObject.set(x, "redirect_uri", js.undefined)
    
    inline def setResponse_type(value: String): Self = StObject.set(x, "response_type", value.asInstanceOf[js.Any])
    
    inline def setResponse_typeUndefined: Self = StObject.set(x, "response_type", js.undefined)
    
    inline def setScope(value: Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSecure_cookie(value: String): Self = StObject.set(x, "secure_cookie", value.asInstanceOf[js.Any])
    
    inline def setSecure_cookieUndefined: Self = StObject.set(x, "secure_cookie", js.undefined)
    
    inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
