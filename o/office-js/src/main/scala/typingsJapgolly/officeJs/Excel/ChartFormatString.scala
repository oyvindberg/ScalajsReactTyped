package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.Excel.Interfaces.ChartFormatStringData
import typingsJapgolly.officeJs.Excel.Interfaces.ChartFormatStringLoadOptions
import typingsJapgolly.officeJs.Excel.Interfaces.ChartFormatStringUpdateData
import typingsJapgolly.officeJs.OfficeExtension.ClientObject
import typingsJapgolly.officeJs.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the substring in chart related objects that contain text, like a `ChartTitle` object or `ChartAxisTitle` object.
  *
  * @remarks
  * [Api set: ExcelApi 1.7]
  */
@js.native
trait ChartFormatString
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartFormatString: RequestContext = js.native
  
  /**
    * Represents the font attributes, such as font name, font size, and color of a chart characters object.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  val font: ChartFont = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartFormatString = js.native
  def load(options: ChartFormatStringLoadOptions): ChartFormatString = js.native
  def load(propertyNamesAndPaths: Expand): ChartFormatString = js.native
  def load(propertyNames: String): ChartFormatString = js.native
  def load(propertyNames: js.Array[String]): ChartFormatString = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartFormatString): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartFormatStringUpdateData): Unit = js.native
  def set(properties: ChartFormatStringUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartFormatString object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartFormatStringData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartFormatStringData = js.native
}
