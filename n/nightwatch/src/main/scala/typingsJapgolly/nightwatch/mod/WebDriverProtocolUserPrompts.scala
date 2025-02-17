package typingsJapgolly.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebDriverProtocolUserPrompts extends StObject {
  
  /**
    * Accepts the currently displayed alert dialog. Usually, this is equivalent to clicking on the 'OK' button in the dialog.
    *
    * @example
    * browser.acceptAlert()
    */
  def acceptAlert(): this.type = js.native
  def acceptAlert(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  
  /**
    * Dismisses the currently displayed alert dialog. For confirm() and prompt() dialogs, this is equivalent to clicking the 'Cancel' button.
    *
    * For alert() dialogs, this is equivalent to clicking the 'OK' button.
    *
    * @example
    * browser.dismissAlert();
    */
  def dismissAlert(): this.type = js.native
  def dismissAlert(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  
  /**
    * Gets the text of the currently displayed JavaScript alert(), confirm(), or prompt() dialog.
    *
    * @example
    * browser.getAlertText();
    */
  def getAlertText(): this.type = js.native
  def getAlertText(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): this.type = js.native
  
  /**
    * Automate the input of basic auth credentials whenever they arise.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser
    *      .registerBasicAuth('test-username', 'test-password')
    *      .navigateTo('http://browserspy.dk/password-ok.php');
    *  };
    *
    */
  def registerBasicAuth(username: String, password: String): this.type = js.native
  def registerBasicAuth(
    username: String,
    password: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): this.type = js.native
  
  /**
    * Sends keystrokes to a JavaScript prompt() dialog.
    *
    * @example
    * browser.setAlertText('randomalert');
    */
  def setAlertText(value: String): this.type = js.native
  def setAlertText(
    value: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
}
