package typingsJapgolly.maximMazurokGapiClientDomains.gapi.client.domains

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDomains.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientDomains.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends StObject {
  
  /** Gets information about a location. */
  def get(): Request[Location] = js.native
  def get(request: Accesstoken): Request[Location] = js.native
  
  /** Lists information about the supported locations for this service. */
  def list(): Request[ListLocationsResponse] = js.native
  def list(request: Alt): Request[ListLocationsResponse] = js.native
  
  var operations: OperationsResource = js.native
  
  var registrations: RegistrationsResource = js.native
}
