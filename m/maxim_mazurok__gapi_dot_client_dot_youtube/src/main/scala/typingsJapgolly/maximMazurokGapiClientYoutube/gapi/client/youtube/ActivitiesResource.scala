package typingsJapgolly.maximMazurokGapiClientYoutube.gapi.client.youtube

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivitiesResource extends StObject {
  
  /** Retrieves a list of resources, possibly filtered. */
  def list(): Request[ActivityListResponse] = js.native
  def list(request: Callback): Request[ActivityListResponse] = js.native
}
