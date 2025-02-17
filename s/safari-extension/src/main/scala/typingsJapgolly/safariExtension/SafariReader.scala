package typingsJapgolly.safariExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafariReader
  extends StObject
     with SafariEventTarget {
  
  var available: Boolean = js.native
  
  def dispatchMessage(name: String): Unit = js.native
  def dispatchMessage(name: String, message: Any): Unit = js.native
  
  def enter(): Unit = js.native
  
  def exit(): Unit = js.native
  
  var tab: SafariBrowserTab = js.native
  
  var visible: Boolean = js.native
}
