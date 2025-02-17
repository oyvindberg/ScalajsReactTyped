package typingsJapgolly.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAdexchangebuyer.anon.OauthtokenPqlQuery
import typingsJapgolly.maximMazurokGapiClientAdexchangebuyer.anon.ProductId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductsResource extends StObject {
  
  /** Gets the requested product by id. */
  def get(): Request[Product] = js.native
  def get(request: ProductId): Request[Product] = js.native
  
  /** Gets the requested product. */
  def search(): Request[GetOffersResponse] = js.native
  def search(request: OauthtokenPqlQuery): Request[GetOffersResponse] = js.native
}
