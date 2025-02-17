package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.Excel.Interfaces.SlicerStyleData
import typingsJapgolly.officeJs.Excel.Interfaces.SlicerStyleLoadOptions
import typingsJapgolly.officeJs.Excel.Interfaces.SlicerStyleUpdateData
import typingsJapgolly.officeJs.OfficeExtension.ClientObject
import typingsJapgolly.officeJs.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a slicer style, which defines style elements by region of the slicer.
  *
  * @remarks
  * [Api set: ExcelApi 1.10]
  */
@js.native
trait SlicerStyle
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_SlicerStyle: RequestContext = js.native
  
  /**
    * Deletes the slicer style.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  def delete(): Unit = js.native
  
  /**
    * Creates a duplicate of this slicer style with copies of all the style elements.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    * @returns The new `SlicerStyle` object that has been duplicated from this slicer style.
    */
  def duplicate(): SlicerStyle = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): SlicerStyle = js.native
  def load(options: SlicerStyleLoadOptions): SlicerStyle = js.native
  def load(propertyNamesAndPaths: Expand): SlicerStyle = js.native
  def load(propertyNames: String): SlicerStyle = js.native
  def load(propertyNames: js.Array[String]): SlicerStyle = js.native
  
  /**
    * Specifies the name of the slicer style.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var name: String = js.native
  
  /**
    * Specifies if this `SlicerStyle` object is read-only.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  val readOnly: Boolean = js.native
  
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: SlicerStyleUpdateData): Unit = js.native
  def set(properties: SlicerStyleUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: SlicerStyle): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.SlicerStyle object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.SlicerStyleData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): SlicerStyleData = js.native
}
