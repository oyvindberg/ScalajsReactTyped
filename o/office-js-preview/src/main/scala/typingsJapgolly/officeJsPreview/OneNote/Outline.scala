package typingsJapgolly.officeJsPreview.OneNote

import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientResult
import typingsJapgolly.officeJsPreview.OneNote.Interfaces.OutlineData
import typingsJapgolly.officeJsPreview.OneNote.Interfaces.OutlineLoadOptions
import typingsJapgolly.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a container for Paragraph objects.
  *
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait Outline
  extends StObject
     with ClientObject {
  
  /**
    * Adds the specified HTML to the bottom of the Outline.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param html The HTML string to append. See {@link https://docs.microsoft.com/office/dev/add-ins/onenote/onenote-add-ins-page-content#supported-html | Supported HTML} for the OneNote add-ins JavaScript API.
    */
  def appendHtml(html: String): Unit = js.native
  
  /**
    * Adds the specified image to the bottom of the Outline.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param base64EncodedImage HTML string to append.
    * @param width Optional. Width in the unit of Points. The default value is null and image width will be respected.
    * @param height Optional. Height in the unit of Points. The default value is null and image height will be respected.
    */
  def appendImage(base64EncodedImage: String, width: Double, height: Double): Image = js.native
  
  /**
    * Adds the specified text to the bottom of the Outline.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param paragraphText HTML string to append.
    */
  def appendRichText(paragraphText: String): RichText = js.native
  
  /**
    * Adds a table with the specified number of rows and columns to the bottom of the outline.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param rowCount Required. The number of rows in the table.
    * @param columnCount Required. The number of columns in the table.
    * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
    */
  def appendTable(rowCount: Double, columnCount: Double): Table = js.native
  def appendTable(rowCount: Double, columnCount: Double, values: js.Array[js.Array[String]]): Table = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Outline: RequestContext = js.native
  
  /**
    * Gets the ID of the Outline object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val id: String = js.native
  
  /**
    * Check if the outline is title outline.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  def isTitle(): ClientResult[Boolean] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Outline = js.native
  def load(options: OutlineLoadOptions): Outline = js.native
  def load(propertyNamesAndPaths: Expand): Outline = js.native
  def load(propertyNames: String): Outline = js.native
  def load(propertyNames: js.Array[String]): Outline = js.native
  
  /**
    * Gets the PageContent object that contains the Outline. This object defines the position of the Outline on the page. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val pageContent: PageContent = js.native
  
  /**
    * Gets the collection of Paragraph objects in the Outline. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val paragraphs: ParagraphCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original OneNote.Outline object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `OneNote.Interfaces.OutlineData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): OutlineData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for `context.trackedObjects.add(thisObject)`. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): Outline = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for `context.trackedObjects.remove(thisObject)`. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): Outline = js.native
}
