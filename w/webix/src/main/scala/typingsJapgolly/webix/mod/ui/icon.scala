package typingsJapgolly.webix.mod.ui

import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import typingsJapgolly.webix.mod.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.icon")
@js.native
open class icon ()
  extends StObject
     with typingsJapgolly.webix.webix.ui.baseview {
  
  @JSName("$compareValue")
  def $compareValue(args: Any*): Any = js.native
  @JSName("$compareValue")
  var $compareValue_Original: WebixCallback = js.native
  
  @JSName("$getValue")
  def $getValue(): String = js.native
  
  @JSName("$prepareValue")
  def $prepareValue(args: Any*): Any = js.native
  @JSName("$prepareValue")
  var $prepareValue_Original: WebixCallback = js.native
  
  @JSName("$renderInput")
  def $renderInput(config: Any): HTMLElement = js.native
  
  @JSName("$scope")
  var $scope: Any = js.native
  
  @JSName("$setValue")
  def $setValue(value: String): Unit = js.native
  
  @JSName("$skin")
  var $skin_Original_icon: WebixCallback = js.native
  
  @JSName("$tooltipIn")
  def $tooltipIn(node: HTMLElement): HTMLElement = js.native
  
  @JSName("$tooltipMove")
  def $tooltipMove(t: HTMLElement, e: Event, text: String): Unit = js.native
  
  @JSName("$tooltipOut")
  def $tooltipOut(): Unit = js.native
  
  def attachEvent(`type`: iconEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: iconEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def bind(target: Any, rule: WebixCallback): Unit = js.native
  def bind(target: Any, rule: WebixCallback, format: String): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def blur(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_icon: iconConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def focus(): Unit = js.native
  
  def getInputNode(): HTMLElement = js.native
  
  def getValue(): String = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: Any): Unit = js.native
  
  def on_click(args: Any*): Any = js.native
  @JSName("on_click")
  var on_click_Original: WebixCallback = js.native
  
  def refresh(): Unit = js.native
  
  def render(id: String, data: Any, `type`: String): Unit = js.native
  def render(id: Double, data: Any, `type`: String): Unit = js.native
  
  def setValue(value: String): Unit = js.native
  
  def sync(source: Any, filter: WebixCallback, silent: Boolean): Unit = js.native
  
  var touchable: Boolean = js.native
  
  def unblockEvent(): Unit = js.native
}
