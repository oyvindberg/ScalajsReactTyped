package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.Excel.Interfaces.CollectionLoadOptions
import typingsJapgolly.officeJs.Excel.Interfaces.PivotTableScopedCollectionData
import typingsJapgolly.officeJs.Excel.Interfaces.PivotTableScopedCollectionLoadOptions
import typingsJapgolly.officeJs.OfficeExtension.ClientObject
import typingsJapgolly.officeJs.OfficeExtension.ClientResult
import typingsJapgolly.officeJs.OfficeExtension.LoadOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a scoped collection of PivotTables. The PivotTables are sorted based on the location of the PivotTable's top-left corner. They are ordered top-to-bottom and then left-to-right.
  *
  * @remarks
  * [Api set: ExcelApi 1.12]
  */
@js.native
trait PivotTableScopedCollection
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_PivotTableScopedCollection: RequestContext = js.native
  
  /**
    * Gets the number of PivotTables in the collection.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets the first PivotTable in the collection. The PivotTables in the collection are sorted top-to-bottom and left-to-right, such that top-left table is the first PivotTable in the collection.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  def getFirst(): PivotTable = js.native
  
  /**
    * Gets the first PivotTable in the collection. The PivotTables in the collection are sorted top-to-bottom and left-to-right, such that the top-left table is the first PivotTable in the collection.
    If the collection is empty, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi 1.15]
    */
  def getFirstOrNullObject(): PivotTable = js.native
  
  /**
    * Gets a PivotTable by name.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    *
    * @param key Name of the PivotTable to be retrieved.
    */
  def getItem(key: String): PivotTable = js.native
  
  /**
    * Gets a PivotTable by name. If the PivotTable does not exist, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    *
    * @param name Name of the PivotTable to be retrieved.
    */
  def getItemOrNullObject(name: String): PivotTable = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[PivotTable] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): PivotTableScopedCollection = js.native
  def load(options: PivotTableScopedCollectionLoadOptions & CollectionLoadOptions): PivotTableScopedCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): PivotTableScopedCollection = js.native
  def load(propertyNames: String): PivotTableScopedCollection = js.native
  def load(propertyNames: js.Array[String]): PivotTableScopedCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.PivotTableScopedCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.PivotTableScopedCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): PivotTableScopedCollectionData = js.native
}
