package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.AccesstokenAltCallbackFields
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Alt
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.AltCallbackFieldsId
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Callback
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.CampaignIds
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.PlacementIds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacementsResource extends StObject {
  
  /** Generates tags for a placement. */
  def generatetags(): Request[PlacementsGenerateTagsResponse] = js.native
  def generatetags(request: PlacementIds): Request[PlacementsGenerateTagsResponse] = js.native
  
  /** Gets one placement by ID. */
  def get(): Request[Placement] = js.native
  def get(request: Alt): Request[Placement] = js.native
  
  /** Inserts a new placement. */
  def insert(request: AccesstokenAltCallbackFields): Request[Placement] = js.native
  def insert(request: Callback, body: Placement): Request[Placement] = js.native
  
  /** Retrieves a list of placements, possibly filtered. This method supports paging. */
  def list(): Request[PlacementsListResponse] = js.native
  def list(request: CampaignIds): Request[PlacementsListResponse] = js.native
  
  /** Updates an existing placement. This method supports patch semantics. */
  def patch(request: AltCallbackFieldsId): Request[Placement] = js.native
  def patch(request: Alt, body: Placement): Request[Placement] = js.native
  
  /** Updates an existing placement. */
  def update(request: AccesstokenAltCallbackFields): Request[Placement] = js.native
  def update(request: Callback, body: Placement): Request[Placement] = js.native
}
