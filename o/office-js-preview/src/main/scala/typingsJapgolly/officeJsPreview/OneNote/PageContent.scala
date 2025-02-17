package typingsJapgolly.officeJsPreview.OneNote

import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJsPreview.OneNote.Interfaces.PageContentData
import typingsJapgolly.officeJsPreview.OneNote.Interfaces.PageContentLoadOptions
import typingsJapgolly.officeJsPreview.OneNote.Interfaces.PageContentUpdateData
import typingsJapgolly.officeJsPreview.anon.Expand
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Ink
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Other
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a region on a page that contains top-level content types such as Outline or Image. A PageContent object can be assigned an XY position.
  *
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait PageContent
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_PageContent: RequestContext = js.native
  
  /**
    * Deletes the PageContent object.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  def delete(): Unit = js.native
  
  /**
    * Gets the ID of the PageContent object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val id: String = js.native
  
  /**
    * Gets the Image in the PageContent object. Throws an exception if PageContentType is not Image.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val image: Image = js.native
  
  /**
    * Gets the ink in the PageContent object. Throws an exception if PageContentType is not Ink.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val ink: FloatingInk = js.native
  
  /**
    * Gets or sets the left (X-axis) position of the PageContent object.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var left: Double = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): PageContent = js.native
  def load(options: PageContentLoadOptions): PageContent = js.native
  def load(propertyNamesAndPaths: Expand): PageContent = js.native
  def load(propertyNames: String): PageContent = js.native
  def load(propertyNames: js.Array[String]): PageContent = js.native
  
  /**
    * Gets the Outline in the PageContent object. Throws an exception if PageContentType is not Outline.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val outline: Outline = js.native
  
  /**
    * Gets the page that contains the PageContent object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val parentPage: Page = js.native
  
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: PageContentUpdateData): Unit = js.native
  def set(properties: PageContentUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: PageContent): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original OneNote.PageContent object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `OneNote.Interfaces.PageContentData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): PageContentData = js.native
  
  /**
    * Gets or sets the top (Y-axis) position of the PageContent object.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var top: Double = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for `context.trackedObjects.add(thisObject)`. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): PageContent = js.native
  
  /**
    * Gets the type of the PageContent object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val `type`: PageContentType | typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Outline | typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Image | Ink | Other = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for `context.trackedObjects.remove(thisObject)`. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): PageContent = js.native
}
