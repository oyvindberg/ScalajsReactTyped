package typingsJapgolly.maximMazurokGapiClientDrive.gapi.client.drive

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDrive.anon.Alt
import typingsJapgolly.maximMazurokGapiClientDrive.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelsResource extends StObject {
  
  def stop(request: Alt, body: Channel): Request[Unit] = js.native
  /** Stop watching resources through this channel */
  def stop(request: Key): Request[Unit] = js.native
}
