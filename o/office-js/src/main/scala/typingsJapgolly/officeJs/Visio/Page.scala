package typingsJapgolly.officeJs.Visio

import typingsJapgolly.officeJs.OfficeExtension.ClientObject
import typingsJapgolly.officeJs.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJs.Visio.Interfaces.PageData
import typingsJapgolly.officeJs.Visio.Interfaces.PageLoadOptions
import typingsJapgolly.officeJs.Visio.Interfaces.PageUpdateData
import typingsJapgolly.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the Page class.
  *
  * [Api set:  1.1]
  */
@js.native
trait Page
  extends StObject
     with ClientObject {
  
  /**
    *
    * Set the page as Active Page of the document.
    *
    * [Api set:  1.1]
    */
  def activate(): Unit = js.native
  
  /**
    *
    * All shapes in the Page, including subshapes. Read-only.
    *
    * [Api set:  1.1]
    */
  val allShapes: ShapeCollection = js.native
  
  /**
    *
    * Returns the Comments Collection.  Read-only.
    *
    * [Api set:  1.1]
    */
  val comments: CommentCollection = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Page: RequestContext = js.native
  
  /**
    *
    * Returns the height of the page. Read-only.
    *
    * [Api set:  1.1]
    */
  val height: Double = js.native
  
  /**
    *
    * Index of the Page. Read-only.
    *
    * [Api set:  1.1]
    */
  val index: Double = js.native
  
  /**
    *
    * Whether the page is a background page or not. Read-only.
    *
    * [Api set:  1.1]
    */
  val isBackground: Boolean = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Page = js.native
  def load(options: PageLoadOptions): Page = js.native
  def load(propertyNamesAndPaths: Expand): Page = js.native
  def load(propertyNames: String): Page = js.native
  def load(propertyNames: js.Array[String]): Page = js.native
  
  /**
    *
    * Page name. Read-only.
    *
    * [Api set:  1.1]
    */
  val name: String = js.native
  
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Visio.Page): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: PageUpdateData): Unit = js.native
  def set(properties: PageUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Page): Unit = js.native
  
  /**
    * Set mock data
    */
  def setMockData(data: PageData): Unit = js.native
  
  /**
    *
    * All top-level shapes in the Page.Read-only.
    *
    * [Api set:  1.1]
    */
  val shapes: ShapeCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Visio.Page object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Visio.Interfaces.PageData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): PageData = js.native
  
  /**
    *
    * Returns the view of the page. Read-only.
    *
    * [Api set:  1.1]
    */
  val view: PageView = js.native
  
  /**
    *
    * Returns the width of the page. Read-only.
    *
    * [Api set:  1.1]
    */
  val width: Double = js.native
}
