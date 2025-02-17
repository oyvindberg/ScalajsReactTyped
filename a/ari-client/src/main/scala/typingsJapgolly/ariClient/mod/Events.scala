package typingsJapgolly.ariClient.mod

import typingsJapgolly.ariClient.anon.SubscribeAll
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Events extends StObject {
  
  /**
    * WebSocket connection for events.
    *
    * @param params.app - Applications to subscribe to.
    * @param [params.subscribeAll] - Subscribe to all Asterisk events. If provided, the applications listed will be subscribed to all events, effectively disabling the application specific
    * subscriptions. Default is false.
    */
  def eventWebsocket(params: SubscribeAll): js.Promise[Message] = js.native
  /**
    * WebSocket connection for events.
    *
    * @param params.app - Applications to subscribe to.
    * @param [params.subscribeAll] - Subscribe to all Asterisk events. If provided, the applications listed will be subscribed to all events, effectively disabling the application specific
    * subscriptions. Default is false.
    */
  def eventWebsocket(params: SubscribeAll, callback: js.Function2[/* err */ js.Error, /* message */ Message, Unit]): Unit = js.native
  
  /**
    * Generate a user event.
    *
    * @param params.eventName - Event name.
    * @param params.application - The name of the application that will receive this event.
    * @param [params.source] - URI for event source (channel:{channelId}, bridge:{bridgeId}, endpoint:{tech}/{resource}, deviceState:{deviceName}.
    * @param [params.variables] - The "variables" key in the body object holds custom key/value pairs to add to the user event. Ex. { "variables": { "key": "value" } }.
    */
  def userEvent(params: typingsJapgolly.ariClient.anon.Application): js.Promise[Unit] = js.native
  /**
    * Generate a user event.
    *
    * @param params.eventName - Event name.
    * @param params.application - The name of the application that will receive this event.
    * @param [params.source] - URI for event source (channel:{channelId}, bridge:{bridgeId}, endpoint:{tech}/{resource}, deviceState:{deviceName}.
    * @param [params.variables] - The "variables" key in the body object holds custom key/value pairs to add to the user event. Ex. { "variables": { "key": "value" } }.
    */
  def userEvent(
    params: typingsJapgolly.ariClient.anon.Application,
    callback: js.Function1[/* err */ js.Error, Unit]
  ): Unit = js.native
}
