package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.Excel.Interfaces.ChartAxisFormatData
import typingsJapgolly.officeJsPreview.Excel.Interfaces.ChartAxisFormatLoadOptions
import typingsJapgolly.officeJsPreview.Excel.Interfaces.ChartAxisFormatUpdateData
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Encapsulates the format properties for the chart axis.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait ChartAxisFormat
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartAxisFormat: RequestContext = js.native
  
  /**
    * Specifies chart fill formatting.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  val fill: ChartFill = js.native
  
  /**
    * Specifies the font attributes (font name, font size, color, etc.) for a chart axis element.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val font: ChartFont = js.native
  
  /**
    * Specifies chart line formatting.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val line: ChartLineFormat = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartAxisFormat = js.native
  def load(options: ChartAxisFormatLoadOptions): ChartAxisFormat = js.native
  def load(propertyNamesAndPaths: Expand): ChartAxisFormat = js.native
  def load(propertyNames: String): ChartAxisFormat = js.native
  def load(propertyNames: js.Array[String]): ChartAxisFormat = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartAxisFormat): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartAxisFormatUpdateData): Unit = js.native
  def set(properties: ChartAxisFormatUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartAxisFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartAxisFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartAxisFormatData = js.native
}
