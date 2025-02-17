package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Alt
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Callback
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Ids
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountUserProfilesResource extends StObject {
  
  /** Gets one account user profile by ID. */
  def get(): Request[AccountUserProfile] = js.native
  def get(request: Alt): Request[AccountUserProfile] = js.native
  
  def insert(request: Callback, body: AccountUserProfile): Request[AccountUserProfile] = js.native
  /** Inserts a new account user profile. */
  def insert(request: Oauthtoken): Request[AccountUserProfile] = js.native
  
  /** Retrieves a list of account user profiles, possibly filtered. This method supports paging. */
  def list(): Request[AccountUserProfilesListResponse] = js.native
  def list(request: Ids): Request[AccountUserProfilesListResponse] = js.native
  
  def patch(request: Alt, body: AccountUserProfile): Request[AccountUserProfile] = js.native
  /** Updates an existing account user profile. This method supports patch semantics. */
  def patch(request: PrettyPrint): Request[AccountUserProfile] = js.native
  
  def update(request: Callback, body: AccountUserProfile): Request[AccountUserProfile] = js.native
  /** Updates an existing account user profile. */
  def update(request: Oauthtoken): Request[AccountUserProfile] = js.native
}
