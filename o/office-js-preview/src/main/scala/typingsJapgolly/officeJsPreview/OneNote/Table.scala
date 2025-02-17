package typingsJapgolly.officeJsPreview.OneNote

import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJsPreview.OneNote.Interfaces.TableData
import typingsJapgolly.officeJsPreview.OneNote.Interfaces.TableLoadOptions
import typingsJapgolly.officeJsPreview.OneNote.Interfaces.TableUpdateData
import typingsJapgolly.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a table in a OneNote page.
  *
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait Table
  extends StObject
     with ClientObject {
  
  /**
    * Adds a column to the end of the table. Values, if specified, are set in the new column. Otherwise the column is empty.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param values Optional. Strings to insert in the new column, specified as an array. Must not have more values than rows in the table.
    */
  def appendColumn(): Unit = js.native
  def appendColumn(values: js.Array[String]): Unit = js.native
  
  /**
    * Adds a row to the end of the table. Values, if specified, are set in the new row. Otherwise the row is empty.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param values Optional. Strings to insert in the new row, specified as an array. Must not have more values than columns in the table.
    */
  def appendRow(): TableRow = js.native
  def appendRow(values: js.Array[String]): TableRow = js.native
  
  /**
    * Gets or sets whether the borders are visible or not. True if they are visible, false if they are hidden.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var borderVisible: Boolean = js.native
  
  /**
    * Clears the contents of the table.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  def clear(): Unit = js.native
  
  /**
    * Gets the number of columns in the table.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val columnCount: Double = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Table: RequestContext = js.native
  
  /**
    * Gets the table cell at a specified row and column.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param rowIndex The index of the row.
    * @param cellIndex The index of the cell in the row.
    */
  def getCell(rowIndex: Double, cellIndex: Double): TableCell = js.native
  
  /**
    * Gets the ID of the table. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val id: String = js.native
  
  /**
    * Inserts a column at the given index in the table. Values, if specified, are set in the new column. Otherwise the column is empty.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param index Index where the column will be inserted in the table.
    * @param values Optional. Strings to insert in the new column, specified as an array. Must not have more values than rows in the table.
    */
  def insertColumn(index: Double): Unit = js.native
  def insertColumn(index: Double, values: js.Array[String]): Unit = js.native
  
  /**
    * Inserts a row at the given index in the table. Values, if specified, are set in the new row. Otherwise the row is empty.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param index Index where the row will be inserted in the table.
    * @param values Optional. Strings to insert in the new row, specified as an array. Must not have more values than columns in the table.
    */
  def insertRow(index: Double): TableRow = js.native
  def insertRow(index: Double, values: js.Array[String]): TableRow = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Table = js.native
  def load(options: TableLoadOptions): Table = js.native
  def load(propertyNamesAndPaths: Expand): Table = js.native
  def load(propertyNames: String): Table = js.native
  def load(propertyNames: js.Array[String]): Table = js.native
  
  /**
    * Gets the Paragraph object that contains the Table object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val paragraph: Paragraph = js.native
  
  /**
    * Gets the number of rows in the table.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val rowCount: Double = js.native
  
  /**
    * Gets all of the table rows. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val rows: TableRowCollection = js.native
  
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: TableUpdateData): Unit = js.native
  def set(properties: TableUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Table): Unit = js.native
  
  /**
    * Sets the shading color of all cells in the table.
    The color code to set the cells to.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  def setShadingColor(colorCode: String): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original OneNote.Table object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `OneNote.Interfaces.TableData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): TableData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for `context.trackedObjects.add(thisObject)`. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): Table = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for `context.trackedObjects.remove(thisObject)`. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): Table = js.native
}
