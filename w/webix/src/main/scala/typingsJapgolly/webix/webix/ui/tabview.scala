package typingsJapgolly.webix.webix.ui

import typingsJapgolly.webix.webix.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait tabview
  extends StObject
     with baseview {
  
  def addView(obj: Any): Unit = js.native
  
  def attachEvent(`type`: tabviewEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: tabviewEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_tabview: tabviewConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getMultiview(): Any = js.native
  
  def getTabbar(): Any = js.native
  
  def getValue(): String = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: Any): Unit = js.native
  
  def removeView(id: Any): Unit = js.native
  
  def setValue(value: String): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
