package typingsJapgolly.sparkpost.anon

import typingsJapgolly.sparkpost.mod.CreateTransmission
import typingsJapgolly.sparkpost.mod.ResultsCallback
import typingsJapgolly.sparkpost.mod.Transmission
import typingsJapgolly.sparkpost.mod.TransmissionSummary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Send extends StObject {
  
  /**
    * Retrieve the details about a transmission by its ID
    *
    * @param id The id of the transmission you want to look up
    * @returns The Transmission results
    */
  def get(id: String): js.Promise[Results[Transmission]] = js.native
  /**
    * Retrieve the details about a transmission by its ID
    *
    * @param id The id of the transmission you want to look up
    * @param callback The request callback with Transmission results
    */
  def get(transmissionID: String, callback: ResultsCallback[Transmission]): Unit = js.native
  
  /**
    * List an overview of all transmissions in the account
    *
    * @returns The Transmission results array
    */
  def list(): js.Promise[Results[js.Array[TransmissionSummary]]] = js.native
  /**
    * List an overview of all transmissions in the account
    *
    * @param callback The request callback with Transmission results array
    */
  def list(callback: ResultsCallback[js.Array[TransmissionSummary]]): Unit = js.native
  def list(options: Campaignid): js.Promise[Results[js.Array[TransmissionSummary]]] = js.native
  /**
    * List an overview of all transmissions in the account
    *
    * @param callback The request callback with Transmission results array
    */
  def list(options: Campaignid, callback: ResultsCallback[js.Array[TransmissionSummary]]): Unit = js.native
  
  /**
    * Sends a message by creating a new transmission
    *
    * @param transmission an object of [transmission attributes]{@link https://developers.sparkpost.com/api/transmissions#header-transmission-attributes}
    * @param [options] specify maximum number of recipient errors returned
    * @returns The metadata and id results
    */
  def send(transmission: CreateTransmission): js.Promise[Results[Totalacceptedrecipients]] = js.native
  /**
    *
    *
    * @param transmission an object of [transmission attributes]{@link https://developers.sparkpost.com/api/transmissions#header-transmission-attributes}
    * @param callback The request callback with metadata and id results
    */
  def send(transmission: CreateTransmission, callback: ResultsCallback[Totalacceptedrecipients]): Unit = js.native
  def send(transmission: CreateTransmission, options: Numrcpterrors): js.Promise[Results[Totalacceptedrecipients]] = js.native
  /**
    * Sends a message by creating a new transmission
    *
    * @param transmission an object of [transmission attributes]{@link https://developers.sparkpost.com/api/transmissions#header-transmission-attributes}
    * @param options The create options. Specify maximum number of recipient errors returned
    * @param callback The request callback with metadata and id results
    */
  def send(
    transmission: CreateTransmission,
    options: Numrcpterrors,
    callback: ResultsCallback[Totalacceptedrecipients]
  ): Unit = js.native
}
