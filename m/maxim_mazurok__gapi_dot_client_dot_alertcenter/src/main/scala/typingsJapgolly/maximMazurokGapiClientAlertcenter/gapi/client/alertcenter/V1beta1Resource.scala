package typingsJapgolly.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAlertcenter.anon.QuotaUser
import typingsJapgolly.maximMazurokGapiClientAlertcenter.anon.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V1beta1Resource extends StObject {
  
  /** Returns customer-level settings. */
  def getSettings(): Request[Settings] = js.native
  def getSettings(request: QuotaUser): Request[Settings] = js.native
  
  def updateSettings(request: QuotaUser, body: Settings): Request[Settings] = js.native
  /** Updates the customer-level settings. */
  def updateSettings(request: Resource): Request[Settings] = js.native
}
