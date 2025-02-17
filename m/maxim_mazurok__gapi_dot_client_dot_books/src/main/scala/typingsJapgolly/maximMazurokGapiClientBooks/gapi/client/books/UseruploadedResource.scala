package typingsJapgolly.maximMazurokGapiClientBooks.gapi.client.books

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientBooks.anon.StartIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseruploadedResource extends StObject {
  
  /** Return a list of books uploaded by the current user. */
  def list(): Request[Volumes] = js.native
  def list(request: StartIndex): Request[Volumes] = js.native
}
