package typingsJapgolly.maximMazurokGapiClientCalendar.gapi.client.calendar

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCalendar.anon.KeyMaxResults
import typingsJapgolly.maximMazurokGapiClientCalendar.anon.SyncToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettingsResource extends StObject {
  
  /** Returns a single user setting. */
  def get(): Request[Setting] = js.native
  def get(request: typingsJapgolly.maximMazurokGapiClientCalendar.anon.Setting): Request[Setting] = js.native
  
  /** Returns all user settings for the authenticated user. */
  def list(): Request[Settings] = js.native
  def list(request: SyncToken): Request[Settings] = js.native
  
  /** Watch for changes to Settings resources. */
  def watch(request: KeyMaxResults): Request[Channel] = js.native
  def watch(request: SyncToken, body: Channel): Request[Channel] = js.native
}
