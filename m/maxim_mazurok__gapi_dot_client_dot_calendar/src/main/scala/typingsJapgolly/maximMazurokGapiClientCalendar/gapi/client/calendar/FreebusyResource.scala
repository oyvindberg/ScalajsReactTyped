package typingsJapgolly.maximMazurokGapiClientCalendar.gapi.client.calendar

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCalendar.anon.FieldsKey
import typingsJapgolly.maximMazurokGapiClientCalendar.anon.OauthtokenPrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreebusyResource extends StObject {
  
  def query(request: FieldsKey, body: FreeBusyRequest): Request[FreeBusyResponse] = js.native
  /** Returns free/busy information for a set of calendars. */
  def query(request: OauthtokenPrettyPrint): Request[FreeBusyResponse] = js.native
}
