package typingsJapgolly.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientSqladmin.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientSqladmin.anon.Alt
import typingsJapgolly.maximMazurokGapiClientSqladmin.anon.Callback
import typingsJapgolly.maximMazurokGapiClientSqladmin.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackupRunsResource extends StObject {
  
  /** Deletes the backup taken by a backup run. */
  def delete(): Request[Operation] = js.native
  def delete(request: Accesstoken): Request[Operation] = js.native
  
  /** Retrieves a resource containing information about a backup run. */
  def get(): Request[BackupRun] = js.native
  def get(request: Accesstoken): Request[BackupRun] = js.native
  
  /** Creates a new backup run on demand. */
  def insert(request: Alt): Request[Operation] = js.native
  def insert(request: Callback, body: BackupRun): Request[Operation] = js.native
  
  /** Lists all backup runs associated with the project or a given instance and configuration in the reverse chronological order of the backup initiation time. */
  def list(): Request[BackupRunsListResponse] = js.native
  def list(request: Fields): Request[BackupRunsListResponse] = js.native
}
