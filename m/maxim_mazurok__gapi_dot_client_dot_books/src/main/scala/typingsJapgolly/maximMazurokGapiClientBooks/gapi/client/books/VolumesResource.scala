package typingsJapgolly.maximMazurokGapiClientBooks.gapi.client.books

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientBooks.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientBooks.anon.Alt
import typingsJapgolly.maximMazurokGapiClientBooks.anon.Callback
import typingsJapgolly.maximMazurokGapiClientBooks.anon.Download
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VolumesResource extends StObject {
  
  var associated: AssociatedResource = js.native
  
  /** Gets volume information for a single volume. */
  def get(): Request[Volume] = js.native
  def get(request: Callback): Request[Volume] = js.native
  
  /** Retrieves volumes in a specific bookshelf for the specified user. */
  def list(): Request[Volumes] = js.native
  def list(request: Accesstoken): Request[Volumes] = js.native
  def list(request: Alt): Request[Volumes] = js.native
  def list(request: Download): Request[Volumes] = js.native
  
  var mybooks: MybooksResource = js.native
  
  var recommended: RecommendedResource = js.native
  
  var useruploaded: UseruploadedResource = js.native
}
