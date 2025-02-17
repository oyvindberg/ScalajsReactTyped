package typingsJapgolly.wampy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Wampy extends StObject {
  
  def abort(): Wampy = js.native
  
  def call(topicURI: String): Wampy = js.native
  def call(topicURI: String, payload: Unit, callbacks: Unit, advancedOptions: CallAdvancedOptions): Wampy = js.native
  def call(topicURI: String, payload: Unit, callbacks: CallCallbacksHash): Wampy = js.native
  def call(
    topicURI: String,
    payload: Unit,
    callbacks: CallCallbacksHash,
    advancedOptions: CallAdvancedOptions
  ): Wampy = js.native
  def call(topicURI: String, payload: Unit, callbacks: SuccessCallback): Wampy = js.native
  def call(topicURI: String, payload: Unit, callbacks: SuccessCallback, advancedOptions: CallAdvancedOptions): Wampy = js.native
  def call(topicURI: String, payload: Payload): Wampy = js.native
  def call(topicURI: String, payload: Payload, callbacks: Unit, advancedOptions: CallAdvancedOptions): Wampy = js.native
  def call(topicURI: String, payload: Payload, callbacks: CallCallbacksHash): Wampy = js.native
  def call(
    topicURI: String,
    payload: Payload,
    callbacks: CallCallbacksHash,
    advancedOptions: CallAdvancedOptions
  ): Wampy = js.native
  def call(topicURI: String, payload: Payload, callbacks: SuccessCallback): Wampy = js.native
  def call(
    topicURI: String,
    payload: Payload,
    callbacks: SuccessCallback,
    advancedOptions: CallAdvancedOptions
  ): Wampy = js.native
  
  def cancel(reqId: Double): Wampy = js.native
  def cancel(reqId: Double, callbacks: Unit, advancedOptions: CancelAdvancedOptions): Wampy = js.native
  def cancel(reqId: Double, callbacks: Callback): Wampy = js.native
  def cancel(reqId: Double, callbacks: Callback, advancedOptions: CancelAdvancedOptions): Wampy = js.native
  def cancel(reqId: Double, callbacks: CancelCallbacksHash): Wampy = js.native
  def cancel(reqId: Double, callbacks: CancelCallbacksHash, advancedOptions: CancelAdvancedOptions): Wampy = js.native
  
  def connect(): Wampy = js.native
  def connect(url: String): Wampy = js.native
  
  var constructor: WampyStatic = js.native
  
  def disconnect(): Wampy = js.native
  
  def getOpStatus(): WampyOpStatus = js.native
  
  def getSessionId(): Double = js.native
  
  def options(): WampyOptions | Wampy = js.native
  def options(opts: WampyOptions): WampyOptions | Wampy = js.native
  
  def publish(topicURI: String): Wampy = js.native
  def publish(topicURI: String, payload: Unit, callbacks: Unit, advancedOptions: PublishAdvancedOptions): Wampy = js.native
  def publish(topicURI: String, payload: Unit, callbacks: PublishCallbacksHash): Wampy = js.native
  def publish(
    topicURI: String,
    payload: Unit,
    callbacks: PublishCallbacksHash,
    advancedOptions: PublishAdvancedOptions
  ): Wampy = js.native
  def publish(topicURI: String, payload: Payload): Wampy = js.native
  def publish(topicURI: String, payload: Payload, callbacks: Unit, advancedOptions: PublishAdvancedOptions): Wampy = js.native
  def publish(topicURI: String, payload: Payload, callbacks: PublishCallbacksHash): Wampy = js.native
  def publish(
    topicURI: String,
    payload: Payload,
    callbacks: PublishCallbacksHash,
    advancedOptions: PublishAdvancedOptions
  ): Wampy = js.native
  
  def register(topicURI: String, callbacks: RPCCallback): Wampy = js.native
  def register(topicURI: String, callbacks: RPCCallback, avdancedOptions: RegisterAdvancedOptions): Wampy = js.native
  def register(topicURI: String, callbacks: RegisterCallbacksHash): Wampy = js.native
  def register(topicURI: String, callbacks: RegisterCallbacksHash, avdancedOptions: RegisterAdvancedOptions): Wampy = js.native
  
  def subscribe(topicURI: String, callbacks: EventCallback): Wampy = js.native
  def subscribe(topicURI: String, callbacks: EventCallback, advancedOptions: SubscribeAdvancedOptions): Wampy = js.native
  def subscribe(topicURI: String, callbacks: SubscribeCallbacksHash): Wampy = js.native
  def subscribe(topicURI: String, callbacks: SubscribeCallbacksHash, advancedOptions: SubscribeAdvancedOptions): Wampy = js.native
  
  def unregister(topicURI: String): Wampy = js.native
  def unregister(topicURI: String, callbacks: Callback): Wampy = js.native
  def unregister(topicURI: String, callbacks: UnregisterCallbacksHash): Wampy = js.native
  
  def unsubscribe(topicURI: String): Wampy = js.native
  def unsubscribe(topicURI: String, callbacks: EventCallback): Wampy = js.native
  def unsubscribe(topicURI: String, callbacks: UnsubscibeCallbacksHash): Wampy = js.native
}
