package typingsJapgolly.maximMazurokGapiClientBlogger.gapi.client.blogger

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientBlogger.anon.IsDraft
import typingsJapgolly.maximMazurokGapiClientBlogger.anon.Key
import typingsJapgolly.maximMazurokGapiClientBlogger.anon.MaxResults
import typingsJapgolly.maximMazurokGapiClientBlogger.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientBlogger.anon.PageId
import typingsJapgolly.maximMazurokGapiClientBlogger.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientBlogger.anon.Publish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PagesResource extends StObject {
  
  /** Deletes a page by blog id and page id. */
  def delete(): Request[Unit] = js.native
  def delete(request: Key): Request[Unit] = js.native
  
  /** Gets a page by blog id and page id. */
  def get(): Request[Page] = js.native
  def get(request: Oauthtoken): Request[Page] = js.native
  
  /** Inserts a page. */
  def insert(request: IsDraft): Request[Page] = js.native
  def insert(request: PrettyPrint, body: Page): Request[Page] = js.native
  
  /** Lists pages. */
  def list(): Request[PageList] = js.native
  def list(request: MaxResults): Request[PageList] = js.native
  
  /** Patches a page. */
  def patch(request: PageId): Request[Page] = js.native
  def patch(request: Publish, body: Page): Request[Page] = js.native
  
  /** Publishes a page. */
  def publish(): Request[Page] = js.native
  def publish(request: Key): Request[Page] = js.native
  
  /** Reverts a published or scheduled page to draft state. */
  def revert(): Request[Page] = js.native
  def revert(request: Key): Request[Page] = js.native
  
  /** Updates a page by blog id and page id. */
  def update(request: PageId): Request[Page] = js.native
  def update(request: Publish, body: Page): Request[Page] = js.native
}
