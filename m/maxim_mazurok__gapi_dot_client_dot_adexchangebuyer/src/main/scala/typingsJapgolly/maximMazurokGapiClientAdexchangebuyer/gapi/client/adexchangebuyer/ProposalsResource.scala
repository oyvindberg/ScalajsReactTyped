package typingsJapgolly.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAdexchangebuyer.anon.Fields
import typingsJapgolly.maximMazurokGapiClientAdexchangebuyer.anon.OauthtokenPqlQuery
import typingsJapgolly.maximMazurokGapiClientAdexchangebuyer.anon.OauthtokenPrettyPrint
import typingsJapgolly.maximMazurokGapiClientAdexchangebuyer.anon.QuotaUser
import typingsJapgolly.maximMazurokGapiClientAdexchangebuyer.anon.RevisionNumber
import typingsJapgolly.maximMazurokGapiClientAdexchangebuyer.anon.UpdateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProposalsResource extends StObject {
  
  /** Get a proposal given its id */
  def get(): Request[Proposal] = js.native
  def get(request: QuotaUser): Request[Proposal] = js.native
  
  def insert(request: Fields, body: CreateOrdersRequest): Request[CreateOrdersResponse] = js.native
  /** Create the given list of proposals */
  def insert(request: OauthtokenPrettyPrint): Request[CreateOrdersResponse] = js.native
  
  /** Update the given proposal. This method supports patch semantics. */
  def patch(request: RevisionNumber): Request[Proposal] = js.native
  def patch(request: UpdateAction, body: Proposal): Request[Proposal] = js.native
  
  /** Search for proposals using pql query */
  def search(): Request[GetOrdersResponse] = js.native
  def search(request: OauthtokenPqlQuery): Request[GetOrdersResponse] = js.native
  
  /** Update the given proposal to indicate that setup has been completed. */
  def setupcomplete(): Request[Unit] = js.native
  def setupcomplete(request: QuotaUser): Request[Unit] = js.native
  
  /** Update the given proposal */
  def update(request: RevisionNumber): Request[Proposal] = js.native
  def update(request: UpdateAction, body: Proposal): Request[Proposal] = js.native
}
