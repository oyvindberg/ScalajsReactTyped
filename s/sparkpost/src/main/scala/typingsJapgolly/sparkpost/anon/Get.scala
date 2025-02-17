package typingsJapgolly.sparkpost.anon

import typingsJapgolly.sparkpost.mod.Callback
import typingsJapgolly.sparkpost.mod.RelayWebhook
import typingsJapgolly.sparkpost.mod.ResultsCallback
import typingsJapgolly.sparkpost.mod.UpdateRelayWebhook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Get extends StObject {
  
  /**
    * Create a relay webhook by providing a relay webhooks object as the POST request body.
    * @param options The create options
    * @returns Promise The webhook id results
    */
  def create(options: RelayWebhook): js.Promise[Results[Id]] = js.native
  /**
    * Create a relay webhook by providing a relay webhooks object as the POST request body.
    * @param options The create options
    * @param callback The request callback with webhook id results
    */
  def create(options: RelayWebhook, callback: ResultsCallback[Id]): Unit = js.native
  
  /**
    * Delete a relay webhook by specifying the webhook ID in the URI path.
    * @param relayWebhookId The webhook id
    * @returns Promise void
    */
  def delete(relayWebhookId: String): js.Promise[Unit] = js.native
  /**
    * Delete a relay webhook by specifying the webhook ID in the URI path.
    * @param relayWebhookId The webhook id
    * @param callback The request callback
    */
  def delete(relayWebhookId: String, callback: Callback[Unit]): Unit = js.native
  
  /**
    * Delete a relay webhook by specifying the webhook ID in the URI path.
    * @param relayWebhookId The webhook id
    * @returns Promise The RelayWebhook results
    */
  def get(relayWebhookId: String): js.Promise[Results[RelayWebhook]] = js.native
  /**
    * Delete a relay webhook by specifying the webhook ID in the URI path.
    * @param relayWebhookId The webhook id
    * @param callback The request callback with RelayWebhook results
    */
  def get(relayWebhookId: String, callback: ResultsCallback[RelayWebhook]): Unit = js.native
  
  /**
    * List all your relay webhooks.
    * @returns Promise The RelayWebhook results array
    */
  def list(): js.Promise[Results[js.Array[RelayWebhook]]] = js.native
  /**
    * List all your relay webhooks.
    * @param callback The request callback with RelayWebhook results array
    */
  def list(callback: ResultsCallback[js.Array[RelayWebhook]]): Unit = js.native
  
  /**
    * Update a relay webhook by specifying the webhook ID in the URI path.
    * @param options The update options
    * @returns Promise The webhook id results
    */
  def update(id: String, options: UpdateRelayWebhook): js.Promise[Results[Id]] = js.native
  /**
    * Update a relay webhook by specifying the webhook ID in the URI path.
    * @param options The update options
    * @param callback The request callback with webhook id results
    */
  def update(id: String, options: UpdateRelayWebhook, callback: ResultsCallback[Id]): Unit = js.native
}
