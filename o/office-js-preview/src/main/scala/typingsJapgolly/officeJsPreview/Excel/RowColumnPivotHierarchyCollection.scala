package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.Excel.Interfaces.CollectionLoadOptions
import typingsJapgolly.officeJsPreview.Excel.Interfaces.RowColumnPivotHierarchyCollectionData
import typingsJapgolly.officeJsPreview.Excel.Interfaces.RowColumnPivotHierarchyCollectionLoadOptions
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientResult
import typingsJapgolly.officeJsPreview.OfficeExtension.LoadOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of RowColumnPivotHierarchy items associated with the PivotTable.
  *
  * @remarks
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait RowColumnPivotHierarchyCollection
  extends StObject
     with ClientObject {
  
  /**
    * Adds the PivotHierarchy to the current axis. If the hierarchy is present elsewhere on the row, column,
    or filter axis, it will be removed from that location.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  def add(pivotHierarchy: PivotHierarchy): RowColumnPivotHierarchy = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_RowColumnPivotHierarchyCollection: RequestContext = js.native
  
  /**
    * Gets the number of pivot hierarchies in the collection.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a RowColumnPivotHierarchy by its name or ID.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    *
    * @param name Name of the RowColumnPivotHierarchy to be retrieved.
    */
  def getItem(name: String): RowColumnPivotHierarchy = js.native
  
  /**
    * Gets a RowColumnPivotHierarchy by name. If the RowColumnPivotHierarchy does not exist, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    *
    * @param name Name of the RowColumnPivotHierarchy to be retrieved.
    */
  def getItemOrNullObject(name: String): RowColumnPivotHierarchy = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[RowColumnPivotHierarchy] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): RowColumnPivotHierarchyCollection = js.native
  def load(options: RowColumnPivotHierarchyCollectionLoadOptions & CollectionLoadOptions): RowColumnPivotHierarchyCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): RowColumnPivotHierarchyCollection = js.native
  def load(propertyNames: String): RowColumnPivotHierarchyCollection = js.native
  def load(propertyNames: js.Array[String]): RowColumnPivotHierarchyCollection = js.native
  
  /**
    * Removes the PivotHierarchy from the current axis.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  def remove(rowColumnPivotHierarchy: RowColumnPivotHierarchy): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.RowColumnPivotHierarchyCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RowColumnPivotHierarchyCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): RowColumnPivotHierarchyCollectionData = js.native
}
