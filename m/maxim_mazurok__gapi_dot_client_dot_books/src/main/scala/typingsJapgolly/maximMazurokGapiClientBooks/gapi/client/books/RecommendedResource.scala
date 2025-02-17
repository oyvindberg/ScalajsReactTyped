package typingsJapgolly.maximMazurokGapiClientBooks.gapi.client.books

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientBooks.anon.MaxAllowedMaturityRating
import typingsJapgolly.maximMazurokGapiClientBooks.anon.Rating
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecommendedResource extends StObject {
  
  /** Return a list of recommended books for the current user. */
  def list(): Request[Volumes] = js.native
  def list(request: MaxAllowedMaturityRating): Request[Volumes] = js.native
  
  /** Rate a recommended book for the current user. */
  def rate(): Request[BooksVolumesRecommendedRateResponse] = js.native
  def rate(request: Rating): Request[BooksVolumesRecommendedRateResponse] = js.native
}
