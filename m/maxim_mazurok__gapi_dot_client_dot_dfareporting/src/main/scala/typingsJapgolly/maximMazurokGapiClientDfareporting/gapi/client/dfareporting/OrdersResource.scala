package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.ProjectId
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.SiteId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrdersResource extends StObject {
  
  /** Gets one order by ID. */
  def get(): Request[Order] = js.native
  def get(request: ProjectId): Request[Order] = js.native
  
  /** Retrieves a list of orders, possibly filtered. This method supports paging. */
  def list(): Request[OrdersListResponse] = js.native
  def list(request: SiteId): Request[OrdersListResponse] = js.native
}
