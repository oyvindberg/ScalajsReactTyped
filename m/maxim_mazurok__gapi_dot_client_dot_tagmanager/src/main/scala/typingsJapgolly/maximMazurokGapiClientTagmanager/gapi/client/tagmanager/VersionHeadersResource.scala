package typingsJapgolly.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.Alt
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.IncludeDeleted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VersionHeadersResource extends StObject {
  
  /** Gets the latest container version header */
  def latest(): Request[ContainerVersionHeader] = js.native
  def latest(request: Alt): Request[ContainerVersionHeader] = js.native
  
  /** Lists all Container Versions of a GTM Container. */
  def list(): Request[ListContainerVersionsResponse] = js.native
  def list(request: IncludeDeleted): Request[ListContainerVersionsResponse] = js.native
}
