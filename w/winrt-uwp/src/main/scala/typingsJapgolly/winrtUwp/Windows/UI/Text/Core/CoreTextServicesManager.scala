package typingsJapgolly.winrtUwp.Windows.UI.Text.Core

import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.Globalization.Language
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.inputlanguagechanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The entry point to all services provided by the Windows core text APIs and the text input server. This object is associated with an application's UI thread (the thread that CoreWindow runs on). */
@js.native
trait CoreTextServicesManager extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_inputlanguagechanged(`type`: inputlanguagechanged, listener: TypedEventHandler[CoreTextServicesManager, Any]): Unit = js.native
  
  /**
    * Creates a context object used by a text input control to communicate with the text input server. Each text input control must create its own context object.
    * @return A CoreTextEditContext instance, which is the primary object used for communicating with the text input server.
    */
  def createEditContext(): CoreTextEditContext = js.native
  
  /** Gets a Language object representing the current input language. */
  var inputLanguage: Language = js.native
  
  /** Occurs when the current input language has changed. */
  def oninputlanguagechanged(ev: Any & WinRTEvent[CoreTextServicesManager]): Unit = js.native
  /** Occurs when the current input language has changed. */
  @JSName("oninputlanguagechanged")
  var oninputlanguagechanged_Original: TypedEventHandler[CoreTextServicesManager, Any] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_inputlanguagechanged(`type`: inputlanguagechanged, listener: TypedEventHandler[CoreTextServicesManager, Any]): Unit = js.native
}
