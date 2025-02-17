package typingsJapgolly.notifyjsBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStaticNotify extends StObject {
  
  /**
    * notify user
    * @param element a jquery element
    * @param notificationdata global notification data
    * @param options notification options
    */
  def apply(): JQueryStatic = js.native
  def apply(element: Any): JQueryStatic = js.native
  def apply(element: Any, notificationdata: Any): JQueryStatic = js.native
  def apply(element: Any, notificationdata: Any, options: NotificationOptions): JQueryStatic = js.native
  def apply(element: Any, notificationdata: Unit, options: NotificationOptions): JQueryStatic = js.native
  def apply(element: Unit, notificationdata: Any): JQueryStatic = js.native
  def apply(element: Unit, notificationdata: Any, options: NotificationOptions): JQueryStatic = js.native
  def apply(element: Unit, notificationdata: Unit, options: NotificationOptions): JQueryStatic = js.native
  
  /**
    * Add style
    * @param styleName style name
    * @param styleDefinition style definition object
    */
  def addStyle(styleName: String, styleDefinition: Any): Any = js.native
  
  /**
    * Set defaults for notifications
    * @param options notification iptions
    */
  def defaults(options: NotificationOptions): Any = js.native
  
  /**
    * Get style
    * @param styleName style name
    */
  def getStyle(styleName: String): Any = js.native
  
  /**
    * Insert css
    * @param cssText css text to insert
    */
  def insertCSS(cssText: String): Any = js.native
  
  /**
    * Remove style
    * @param styleName style name
    */
  def removeStyle(styleName: String): Any = js.native
}
