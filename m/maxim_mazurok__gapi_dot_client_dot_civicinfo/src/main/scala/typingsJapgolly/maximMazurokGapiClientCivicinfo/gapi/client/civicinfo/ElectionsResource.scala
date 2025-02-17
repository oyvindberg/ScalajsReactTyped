package typingsJapgolly.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCivicinfo.anon.Address
import typingsJapgolly.maximMazurokGapiClientCivicinfo.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElectionsResource extends StObject {
  
  /** List of available elections to query. */
  def electionQuery(): Request[ElectionsQueryResponse] = js.native
  def electionQuery(request: Alt): Request[ElectionsQueryResponse] = js.native
  
  /** Looks up information relevant to a voter based on the voter's registered address. */
  def voterInfoQuery(): Request[VoterInfoResponse] = js.native
  def voterInfoQuery(request: Address): Request[VoterInfoResponse] = js.native
}
