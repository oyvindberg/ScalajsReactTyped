package typingsJapgolly.nightwatch.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nightwatch.anon.Build
import typingsJapgolly.nightwatch.nightwatchStrings.browser
import typingsJapgolly.nightwatch.nightwatchStrings.client
import typingsJapgolly.nightwatch.nightwatchStrings.driver
import typingsJapgolly.nightwatch.nightwatchStrings.server
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebDriverProtocolSessions extends StObject {
  
  /**
    * Get info about, delete or create a new session. Defaults to the current session.
    *
    * @example
    * this.demoTest = function (browser) {
    *    browser.session(function(result) {
    *      console.log(result.value);
    *    });
    *    //
    *    browser.session('delete', function(result) {
    *      console.log(result.value);
    *    });
    *    //
    *    browser.session('delete', '12345-abc', function(result) {
    *      console.log(result.value);
    *    });
    * }
    */
  def session(): this.type = js.native
  def session(action: String): this.type = js.native
  def session(action: String, sessionId: String): this.type = js.native
  def session(
    action: String,
    sessionId: String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[Record[String, Any]], 
      Unit
    ]
  ): this.type = js.native
  def session(
    action: String,
    sessionId: Unit,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[Record[String, Any]], 
      Unit
    ]
  ): this.type = js.native
  def session(action: Unit, sessionId: String): this.type = js.native
  def session(
    action: Unit,
    sessionId: String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[Record[String, Any]], 
      Unit
    ]
  ): this.type = js.native
  def session(
    action: Unit,
    sessionId: Unit,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[Record[String, Any]], 
      Unit
    ]
  ): this.type = js.native
  
  /**
    * Gets the text of the log type specified. To find out the available log types, use `.getLogTypes()`.
    *
    * Returns a [log entry JSON object](https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#log-entry-json-object).
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.sessionLog('client', function(result) {
    *      console.log(result.value);
    *    });
    * }
    */
  def sessionLog(typeString: String): this.type = js.native
  def sessionLog(
    typeString: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* log */ js.Array[NightwatchLogEntry], Unit]
  ): this.type = js.native
  
  /**
    * Gets an array of strings for which log types are available. This methods returns the entire WebDriver response, if you are only interested in the logs array, use `.getLogTypes()` instead.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.sessionLogTypes(function(result) {
    *      console.log(result.value);
    *    });
    * }
    */
  def sessionLogTypes(): this.type = js.native
  def sessionLogTypes(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[client | driver | browser | server]], 
      Unit
    ]
  ): this.type = js.native
  
  /**
    * Returns a list of the currently active sessions.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.sessions(function(result) {
    *      console.log(result.value);
    *    });
    * }
    */
  def sessions(): this.type = js.native
  def sessions(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[Record[String, Any]]], 
      Unit
    ]
  ): this.type = js.native
  
  /**
    * Command to set Chrome network emulation settings.
    *
    * @example
    *  this.demoTest = function() {
    *    browser.setNetworkConditions({
    *      offline: false,
    *      latency: 50000,
    *      download_throughput: 450 * 1024,
    *      upload_throughput: 150 * 1024
    *    });
    *  };
    */
  def setNetworkConditions(spec: StringDictionary[Any]): this.type = js.native
  def setNetworkConditions(
    spec: StringDictionary[Any],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): this.type = js.native
  
  /**
    * Query the server's current status.
    */
  def status(): this.type = js.native
  def status(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Build], Unit]
  ): this.type = js.native
  
  def timeouts(): this.type = js.native
  def timeouts(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  /**
    * Configure the amount of time that a particular type of operation can execute for before they are aborted and a |Timeout| error is returned to the client.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.timeouts('script', 10000, function(result) {
    *      console.log(result);
    *    });
    * }
    */
  def timeouts(typeOfOperation: String, ms: Double): this.type = js.native
  def timeouts(
    typeOfOperation: String,
    ms: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  
  /**
    * Set the amount of time, in milliseconds, that asynchronous scripts executed by `.executeAsync` are permitted to run before they are aborted and a |Timeout| error is returned to the client.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.timeoutsAsyncScript(10000, function(result) {
    *      console.log(result);
    *    });
    * }
    */
  def timeoutsAsyncScript(ms: Double): this.type = js.native
  def timeoutsAsyncScript(
    ms: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  
  /**
    * Set the amount of time the driver should wait when searching for elements. If this command is never sent, the driver will default to an implicit wait of 0ms.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.timeoutsImplicitWait(10000, function(result) {
    *      console.log(result);
    *    });
    * }
    */
  def timeoutsImplicitWait(ms: Double): this.type = js.native
  def timeoutsImplicitWait(
    ms: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
}
