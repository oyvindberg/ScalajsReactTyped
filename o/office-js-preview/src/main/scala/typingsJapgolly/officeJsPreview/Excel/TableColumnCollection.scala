package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.Excel.Interfaces.CollectionLoadOptions
import typingsJapgolly.officeJsPreview.Excel.Interfaces.TableColumnCollectionData
import typingsJapgolly.officeJsPreview.Excel.Interfaces.TableColumnCollectionLoadOptions
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientResult
import typingsJapgolly.officeJsPreview.OfficeExtension.LoadOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of all the columns that are part of the table.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait TableColumnCollection
  extends StObject
     with ClientObject {
  
  /**
    * Adds a new column to the table.
    *
    * @remarks
    * [Api set: ExcelApi 1.1 requires an index smaller than the total column count; 1.4 allows index to be optional (null or -1) and will append a column at the end; 1.4 allows name parameter at creation time.]
    *
    * @param index Optional. Specifies the relative position of the new column. If null or -1, the addition happens at the end. Columns with a higher index will be shifted to the side. Zero-indexed.
    * @param values Optional. A 2D array of unformatted values of the table column.
    * @param name Optional. Specifies the name of the new column. If `null`, the default name will be used.
    */
  def add(): TableColumn = js.native
  def add(index: Double): TableColumn = js.native
  def add(index: Double, values: String): TableColumn = js.native
  def add(index: Double, values: String, name: String): TableColumn = js.native
  def add(index: Double, values: js.Array[js.Array[Boolean | String | Double]]): TableColumn = js.native
  def add(index: Double, values: js.Array[js.Array[Boolean | String | Double]], name: String): TableColumn = js.native
  def add(index: Double, values: Boolean): TableColumn = js.native
  def add(index: Double, values: Boolean, name: String): TableColumn = js.native
  def add(index: Double, values: Double): TableColumn = js.native
  def add(index: Double, values: Double, name: String): TableColumn = js.native
  def add(index: Double, values: Unit, name: String): TableColumn = js.native
  def add(index: Unit, values: String): TableColumn = js.native
  def add(index: Unit, values: String, name: String): TableColumn = js.native
  def add(index: Unit, values: js.Array[js.Array[Boolean | String | Double]]): TableColumn = js.native
  def add(index: Unit, values: js.Array[js.Array[Boolean | String | Double]], name: String): TableColumn = js.native
  def add(index: Unit, values: Boolean): TableColumn = js.native
  def add(index: Unit, values: Boolean, name: String): TableColumn = js.native
  def add(index: Unit, values: Double): TableColumn = js.native
  def add(index: Unit, values: Double, name: String): TableColumn = js.native
  def add(index: Unit, values: Unit, name: String): TableColumn = js.native
  
  /**
    * Adds a new column to the table.
    Unlike `add()`, `addAsJson()` takes any type of cell value, such as image or entity data types.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    *
    * @param index Optional. Specifies the relative position of the new column. If null or -1, the addition happens at the end. Columns with a higher index will be shifted to the side. Zero-indexed.
    * @param values Optional. A 2D array of cell values of the table column.
    * @param name Optional. Specifies the name of the new column. If `null`, the default name will be used.
    */
  def addAsJson(): TableColumn = js.native
  def addAsJson(index: Double): TableColumn = js.native
  def addAsJson(index: Double, values: js.Array[js.Array[CellValue]]): TableColumn = js.native
  def addAsJson(index: Double, values: js.Array[js.Array[CellValue]], name: String): TableColumn = js.native
  def addAsJson(index: Double, values: Unit, name: String): TableColumn = js.native
  def addAsJson(index: Unit, values: js.Array[js.Array[CellValue]]): TableColumn = js.native
  def addAsJson(index: Unit, values: js.Array[js.Array[CellValue]], name: String): TableColumn = js.native
  def addAsJson(index: Unit, values: Unit, name: String): TableColumn = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TableColumnCollection: RequestContext = js.native
  
  /**
    * Returns the number of columns in the table.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val count: Double = js.native
  
  /**
    * Gets the number of columns in the table.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    */
  def getCount(): ClientResult[Double] = js.native
  
  def getItem(key: String): TableColumn = js.native
  /**
    * Gets a column object by name or ID.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    *
    * @param key Column name or ID.
    */
  def getItem(key: Double): TableColumn = js.native
  
  /**
    * Gets a column based on its position in the collection.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    *
    * @param index Index value of the object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: Double): TableColumn = js.native
  
  def getItemOrNullObject(key: String): TableColumn = js.native
  /**
    * Gets a column object by name or ID. If the column doesn't exist, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    *
    * @param key Column name or ID.
    */
  def getItemOrNullObject(key: Double): TableColumn = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[TableColumn] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TableColumnCollection = js.native
  def load(options: TableColumnCollectionLoadOptions & CollectionLoadOptions): TableColumnCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): TableColumnCollection = js.native
  def load(propertyNames: String): TableColumnCollection = js.native
  def load(propertyNames: js.Array[String]): TableColumnCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.TableColumnCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TableColumnCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): TableColumnCollectionData = js.native
}
