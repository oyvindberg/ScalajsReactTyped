package typingsJapgolly.webix.mod.ui

import typingsJapgolly.webix.mod.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.gridlayout")
@js.native
open class gridlayout ()
  extends StObject
     with typingsJapgolly.webix.webix.ui.baseview {
  
  @JSName("$skin")
  var $skin_Original_gridlayout: WebixCallback = js.native
  
  def addView(view: Any): String | Double = js.native
  def addView(view: Any, index: Double): String | Double = js.native
  
  def attachEvent(`type`: gridlayoutEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: gridlayoutEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def bind(target: Any, rule: WebixCallback): Unit = js.native
  def bind(target: Any, rule: WebixCallback, format: String): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  def clearAll(): Unit = js.native
  
  @JSName("config")
  var config_gridlayout: gridlayoutConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def index(obj: Any): Double = js.native
  
  def mapEvent(map: Any): Unit = js.native
  
  def moveView(id: String, view: Any): Unit = js.native
  def moveView(id: Double, view: Any): Unit = js.native
  
  def reconstruct(): Unit = js.native
  
  def removeView(id: Any): Unit = js.native
  
  def resizeChildren(): Unit = js.native
  
  def restore(state: Any): Unit = js.native
  def restore(state: Any, factory: WebixCallback): Unit = js.native
  
  def serialize(): js.Array[Any] = js.native
  def serialize(serializer: WebixCallback): js.Array[Any] = js.native
  
  def showBatch(name: String): Unit = js.native
  def showBatch(name: String, mode: Boolean): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
