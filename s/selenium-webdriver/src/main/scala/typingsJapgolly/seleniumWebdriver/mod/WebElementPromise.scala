package typingsJapgolly.seleniumWebdriver.mod

import typingsJapgolly.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("selenium-webdriver", "WebElementPromise")
@js.native
open class WebElementPromise protected ()
  extends WebElement
     with Promise[WebElement] {
  /**
    * @param {!WebDriver} driver The parent WebDriver instance for this
    *     element.
    * @param {!Promise<!WebElement>} el A promise
    *     that will resolve to the promised element.
    */
  def this(driver: WebDriver, el: js.Promise[WebElement]) = this()
}
