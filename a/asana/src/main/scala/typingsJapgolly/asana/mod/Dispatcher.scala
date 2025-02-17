package typingsJapgolly.asana.mod

import typingsJapgolly.asana.mod.^
import typingsJapgolly.asana.mod.auth.Authenticator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dispatcher extends StObject {
  
  /**
    * The base URL for Asana
    * @type {String}
    */
  var asanaBaseUrl: String = js.native
  
  /**
    * Ensure the dispatcher is authorized to make requests. Call this before
    * making any API requests.
    *
    * @returns {Promise} Resolves when the dispatcher is authorized, rejected if
    *     there was a problem authorizing.
    * @return
    */
  def authorize(): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  
  /**
    * Dispatches a DELETE request to the Asana API.
    * @param  {String} path The path of the API
    * @param  {Object}  [dispatchOptions] Options for handling the request and
    *     response. See `dispatch`.
    * @return {Promise}     The response for the request
    * @param path
    * @param dispatchOptions?
    * @return
    */
  def delete(path: String): typingsJapgolly.bluebird.mod.^[Any] = js.native
  def delete(path: String, dispatchOptions: Any): typingsJapgolly.bluebird.mod.^[Any] = js.native
  
  /**
    * Dispatches a request to the Asana API. The request parameters are passed to
    * the request module.
    * @param  {Object}  params The params for request
    * @param  {Object}  [dispatchOptions] Options for handling request/response
    * @return {Promise}        The response for the request
    * @param params
    * @param dispatchOptions?
    * @return
    */
  def dispatch(params: Any): typingsJapgolly.bluebird.mod.^[Any] = js.native
  def dispatch(params: Any, dispatchOptions: Any): typingsJapgolly.bluebird.mod.^[Any] = js.native
  
  /**
    * Dispatches a GET request to the Asana API.
    * @param  {String}  path    The path of the API
    * @param  {Object}  [query] The query params
    * @param  {Object}  [dispatchOptions] Options for handling the request and
    *     response. See `dispatch`.
    * @return {Promise}         The response for the request
    * @param path
    * @param query?
    * @param dispatchOptions?
    * @return
    */
  def get(path: String): typingsJapgolly.bluebird.mod.^[Any] = js.native
  def get(path: String, query: Any): typingsJapgolly.bluebird.mod.^[Any] = js.native
  def get(path: String, query: Any, dispatchOptions: Any): typingsJapgolly.bluebird.mod.^[Any] = js.native
  def get(path: String, query: Unit, dispatchOptions: Any): typingsJapgolly.bluebird.mod.^[Any] = js.native
  
  /**
    * Handler for unauthorized requests which may seek reauthorization.
    * Default behavior is available if configured with an Oauth authenticator
    * that has a refresh token, and will refresh the current access token.
    * @type {Function}
    */
  def handleUnauthorized(): Boolean | typingsJapgolly.bluebird.mod.^[Boolean] = js.native
  
  /**
    * Dispatches a POST request to the Asana API.
    * @param  {String} path The path of the API
    * @param  {Object} data The data to be sent
    * @param  {Object}  [dispatchOptions] Options for handling the request and
    *     response. See `dispatch`.
    * @return {Promise}     The response for the request
    * @param path
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def post(path: String, data: Any): typingsJapgolly.bluebird.mod.^[Any] = js.native
  def post(path: String, data: Any, dispatchOptions: Any): typingsJapgolly.bluebird.mod.^[Any] = js.native
  
  /**
    * Dispatches a PUT request to the Asana API.
    * @param  {String} path The path of the API
    * @param  {Object} data The data to be sent
    * @param  {Object}  [dispatchOptions] Options for handling the request and
    *     response. See `dispatch`.
    * @return {Promise}     The response for the request
    * @param path
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def put(path: String, data: Any): typingsJapgolly.bluebird.mod.^[Any] = js.native
  def put(path: String, data: Any, dispatchOptions: Any): typingsJapgolly.bluebird.mod.^[Any] = js.native
  
  /**
    * The amount of time in milliseconds to wait for a request to finish.
    * @type {Number}
    */
  var requestTimeout: Double = js.native
  
  /**
    * Whether requests should be automatically retried if rate limited.
    * @type {Boolean}
    */
  var retryOnRateLimit: Boolean = js.native
  
  /**
    * Configure the authentication mechanism to use.
    * @returns {Dispatcher} this
    * @param authenticator
    * @return
    */
  def setAuthenticator(authenticator: Authenticator): this.type = js.native
  
  /**
    * Creates an Asana API Url by concatenating the ROOT_URL with path provided.
    * @param  {String} path The path
    * @return {String}      The url
    * @param path
    * @return
    */
  def url(path: String): String = js.native
}
object Dispatcher {
  
  inline def apply: DispatcherStatic = ^.asInstanceOf[js.Dynamic].selectDynamic("Dispatcher").asInstanceOf[DispatcherStatic]
}
