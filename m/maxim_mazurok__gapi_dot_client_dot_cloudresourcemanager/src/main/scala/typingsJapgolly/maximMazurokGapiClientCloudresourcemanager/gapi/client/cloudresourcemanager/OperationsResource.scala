package typingsJapgolly.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCloudresourcemanager.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationsResource extends StObject {
  
  /** Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service. */
  def get(): Request[Operation] = js.native
  def get(request: Fields): Request[Operation] = js.native
}
