package typingsJapgolly.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.anon.EndTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoidedpurchasesResource extends StObject {
  
  /** Lists the purchases that were canceled, refunded or charged-back. */
  def list(): Request[VoidedPurchasesListResponse] = js.native
  def list(request: EndTime): Request[VoidedPurchasesListResponse] = js.native
}
