package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.Excel.Interfaces.CollectionLoadOptions
import typingsJapgolly.officeJs.Excel.Interfaces.SlicerItemCollectionData
import typingsJapgolly.officeJs.Excel.Interfaces.SlicerItemCollectionLoadOptions
import typingsJapgolly.officeJs.OfficeExtension.ClientObject
import typingsJapgolly.officeJs.OfficeExtension.ClientResult
import typingsJapgolly.officeJs.OfficeExtension.LoadOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of all the slicer item objects in the slicer.
  *
  * @remarks
  * [Api set: ExcelApi 1.10]
  */
@js.native
trait SlicerItemCollection
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_SlicerItemCollection: RequestContext = js.native
  
  /**
    * Returns the number of slicer items in the slicer.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a slicer item object using its key or name.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    *
    * @param key The key or name of the slicer item.
    */
  def getItem(key: String): SlicerItem = js.native
  
  /**
    * Gets a slicer item based on its position in the collection.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    *
    * @param index Index value of the object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: Double): SlicerItem = js.native
  
  /**
    * Gets a slicer item using its key or name. If the slicer item doesn't exist, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    *
    * @param key Key or name of the slicer to be retrieved.
    */
  def getItemOrNullObject(key: String): SlicerItem = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[SlicerItem] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): SlicerItemCollection = js.native
  def load(options: SlicerItemCollectionLoadOptions & CollectionLoadOptions): SlicerItemCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): SlicerItemCollection = js.native
  def load(propertyNames: String): SlicerItemCollection = js.native
  def load(propertyNames: js.Array[String]): SlicerItemCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.SlicerItemCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.SlicerItemCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): SlicerItemCollectionData = js.native
}
