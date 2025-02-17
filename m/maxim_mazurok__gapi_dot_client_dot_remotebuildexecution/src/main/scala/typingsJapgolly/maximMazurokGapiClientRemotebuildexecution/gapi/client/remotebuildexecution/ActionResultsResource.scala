package typingsJapgolly.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientRemotebuildexecution.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientRemotebuildexecution.anon.Alt
import typingsJapgolly.maximMazurokGapiClientRemotebuildexecution.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionResultsResource extends StObject {
  
  /**
    * Retrieve a cached execution result. Implementations SHOULD ensure that any blobs referenced from the ContentAddressableStorage are available at the time of returning the
    * ActionResult and will be for some period of time afterwards. The lifetimes of the referenced blobs SHOULD be increased if necessary and applicable. Errors: * `NOT_FOUND`: The
    * requested `ActionResult` is not in the cache.
    */
  def get(): Request[BuildBazelRemoteExecutionV2ActionResult] = js.native
  def get(request: Accesstoken): Request[BuildBazelRemoteExecutionV2ActionResult] = js.native
  
  /**
    * Upload a new execution result. In order to allow the server to perform access control based on the type of action, and to assist with client debugging, the client MUST first upload
    * the Action that produced the result, along with its Command, into the `ContentAddressableStorage`. Server implementations MAY modify the `UpdateActionResultRequest.action_result`
    * and return an equivalent value. Errors: * `INVALID_ARGUMENT`: One or more arguments are invalid. * `FAILED_PRECONDITION`: One or more errors occurred in updating the action result,
    * such as a missing command or action. * `RESOURCE_EXHAUSTED`: There is insufficient storage space to add the entry to the cache.
    */
  def update(request: Alt): Request[BuildBazelRemoteExecutionV2ActionResult] = js.native
  def update(request: Callback, body: BuildBazelRemoteExecutionV2ActionResult): Request[BuildBazelRemoteExecutionV2ActionResult] = js.native
}
