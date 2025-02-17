package typingsJapgolly.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientNotebooks.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientNotebooks.anon.Alt
import typingsJapgolly.maximMazurokGapiClientNotebooks.anon.Callback
import typingsJapgolly.maximMazurokGapiClientNotebooks.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentsResource extends StObject {
  
  /** Creates a new Environment. */
  def create(request: Accesstoken): Request[Operation] = js.native
  def create(request: Alt, body: Environment): Request[Operation] = js.native
  
  /** Deletes a single Environment. */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  /** Gets details of a single Environment. */
  def get(): Request[Environment] = js.native
  def get(request: Callback): Request[Environment] = js.native
  
  /** Lists environments in a project. */
  def list(): Request[ListEnvironmentsResponse] = js.native
  def list(request: Fields): Request[ListEnvironmentsResponse] = js.native
}
