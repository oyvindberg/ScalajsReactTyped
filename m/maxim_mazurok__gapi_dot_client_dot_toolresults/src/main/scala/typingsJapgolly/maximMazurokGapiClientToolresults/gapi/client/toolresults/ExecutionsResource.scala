package typingsJapgolly.maximMazurokGapiClientToolresults.gapi.client.toolresults

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientToolresults.anon.AccesstokenAlt
import typingsJapgolly.maximMazurokGapiClientToolresults.anon.Alt
import typingsJapgolly.maximMazurokGapiClientToolresults.anon.AltCallback
import typingsJapgolly.maximMazurokGapiClientToolresults.anon.RequestId
import typingsJapgolly.maximMazurokGapiClientToolresults.anon.Uploadprotocol
import typingsJapgolly.maximMazurokGapiClientToolresults.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutionsResource extends StObject {
  
  var clusters: ClustersResource = js.native
  
  /**
    * Creates an Execution. The returned Execution will have the id set. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to
    * write to project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the containing History does not exist
    */
  def create(request: Uploadprotocol): Request[Execution] = js.native
  def create(request: Xgafv, body: Execution): Request[Execution] = js.native
  
  var environments: EnvironmentsResource = js.native
  
  /**
    * Gets an Execution. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request
    * is malformed - NOT_FOUND - if the Execution does not exist
    */
  def get(): Request[Execution] = js.native
  def get(request: Alt): Request[Execution] = js.native
  
  /**
    * Lists Executions for a given History. The executions are sorted by creation_time in descending order. The execution_id key will be used to order the executions with the same
    * creation_time. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is
    * malformed - NOT_FOUND - if the containing History does not exist
    */
  def list(): Request[ListExecutionsResponse] = js.native
  def list(request: AccesstokenAlt): Request[ListExecutionsResponse] = js.native
  
  /**
    * Updates an existing Execution with the supplied partial entity. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to write
    * to project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if the requested state transition is illegal - NOT_FOUND - if the containing History does not
    * exist
    */
  def patch(request: AltCallback): Request[Execution] = js.native
  def patch(request: RequestId, body: Execution): Request[Execution] = js.native
  
  var steps: StepsResource = js.native
}
