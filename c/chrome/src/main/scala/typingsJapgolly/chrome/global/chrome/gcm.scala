package typingsJapgolly.chrome.global.chrome

import typingsJapgolly.chrome.chrome.gcm.GcmErrorEvent
import typingsJapgolly.chrome.chrome.gcm.MessageDeletionEvent
import typingsJapgolly.chrome.chrome.gcm.MessageReceptionEvent
import typingsJapgolly.chrome.chrome.gcm.OutgoingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Google Cloud Messaging
////////////////////
/**
  * Use chrome.gcm to enable apps and extensions to send and receive messages through the Google Cloud Messaging Service.
  * Availability: Since Chrome 35.
  * Permissions:  "gcm"
  */
object gcm {
  
  @JSGlobal("chrome.gcm")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.gcm.MAX_MESSAGE_SIZE")
  @js.native
  def MAX_MESSAGE_SIZE: Double = js.native
  inline def MAX_MESSAGE_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_MESSAGE_SIZE")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.gcm.onMessage")
  @js.native
  def onMessage: MessageReceptionEvent = js.native
  inline def onMessage_=(x: MessageReceptionEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMessage")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.gcm.onMessagesDeleted")
  @js.native
  def onMessagesDeleted: MessageDeletionEvent = js.native
  inline def onMessagesDeleted_=(x: MessageDeletionEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMessagesDeleted")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.gcm.onSendError")
  @js.native
  def onSendError: GcmErrorEvent = js.native
  inline def onSendError_=(x: GcmErrorEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSendError")(x.asInstanceOf[js.Any])
  
  inline def register(senderIds: js.Array[String], callback: js.Function1[/* registrationId */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(senderIds.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def send(message: OutgoingMessage, callback: js.Function1[/* messageId */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unregister(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
