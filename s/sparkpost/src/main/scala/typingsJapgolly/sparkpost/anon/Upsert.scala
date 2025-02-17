package typingsJapgolly.sparkpost.anon

import typingsJapgolly.sparkpost.mod.Callback
import typingsJapgolly.sparkpost.mod.CreateSupressionListEntry
import typingsJapgolly.sparkpost.mod.ResultsCallback
import typingsJapgolly.sparkpost.mod.SupressionListEntry
import typingsJapgolly.sparkpost.mod.SupressionSearchParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Upsert extends StObject {
  
  /**
    * Delete a recipient from the list by specifying the recipient’s email address in the URI path.
    *
    * @param email Recipient email address
    * @returns void
    */
  def delete(email: String): js.Promise[Unit] = js.native
  /**
    * Delete a recipient from the list by specifying the recipient’s email address in the URI path.
    *
    * @param email Recipient email address
    */
  def delete(email: String, callback: Callback[Unit]): Unit = js.native
  
  /**
    * Retrieve an entry by recipient email.
    *
    * @param email address to check
    * @returns void
    */
  def get(email: String): js.Promise[Results[js.Array[SupressionListEntry]]] = js.native
  /**
    * Retrieve an entry by recipient email.
    *
    * @param email address to check
    * @returns void
    */
  def get(email: String, callback: ResultsCallback[js.Array[SupressionListEntry]]): Unit = js.native
  
  /**
    * List all entries in your suppression list, filtered by an optional set of search parameters.
    *
    * @param [parameters] an object of [search parameters]{@link https://developers.sparkpost.com/api/suppression-list#suppression-list-search-get}
    * @returns Promise The supression lists
    */
  def list(): js.Promise[Results[js.Array[SupressionListEntry]]] = js.native
  /**
    * List all entries in your suppression list, filtered by an optional set of search parameters.
    *
    * @param callback The request callback with supression lists.
    */
  def list(callback: ResultsCallback[js.Array[SupressionListEntry]]): Unit = js.native
  def list(parameters: SupressionSearchParameters): js.Promise[Results[js.Array[SupressionListEntry]]] = js.native
  /**
    * List all entries in your suppression list, filtered by an optional set of search parameters.
    *
    * @param parameters an object of [search parameters]{@link https://developers.sparkpost.com/api/suppression-list#suppression-list-search-get}
    * @param callback The request callback with supression lists.
    */
  def list(parameters: SupressionSearchParameters, callback: ResultsCallback[js.Array[SupressionListEntry]]): Unit = js.native
  
  def upsert(listEntries: js.Array[CreateSupressionListEntry]): js.Promise[Results[Message]] = js.native
  def upsert(listEntries: js.Array[CreateSupressionListEntry], callback: ResultsCallback[Message]): Unit = js.native
  /**
    * Insert or update one or many entries.
    *
    * @param listEntries The suppression entry list
    */
  def upsert(listEntries: CreateSupressionListEntry): js.Promise[Results[Message]] = js.native
  /**
    * Insert or update one or many entries.
    *
    * @param listEntries The suppression entry list
    * @param callback The request callback
    */
  def upsert(listEntries: CreateSupressionListEntry, callback: ResultsCallback[Message]): Unit = js.native
}
