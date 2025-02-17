package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.Excel.Interfaces.ChartLegendEntryData
import typingsJapgolly.officeJsPreview.Excel.Interfaces.ChartLegendEntryLoadOptions
import typingsJapgolly.officeJsPreview.Excel.Interfaces.ChartLegendEntryUpdateData
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the legend entry in `legendEntryCollection`.
  *
  * @remarks
  * [Api set: ExcelApi 1.7]
  */
@js.native
trait ChartLegendEntry
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartLegendEntry: RequestContext = js.native
  
  /**
    * Specifies the height of the legend entry on the chart legend.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  val height: Double = js.native
  
  /**
    * Specifies the index of the legend entry in the chart legend.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  val index: Double = js.native
  
  /**
    * Specifies the left value of a chart legend entry.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  val left: Double = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartLegendEntry = js.native
  def load(options: ChartLegendEntryLoadOptions): ChartLegendEntry = js.native
  def load(propertyNamesAndPaths: Expand): ChartLegendEntry = js.native
  def load(propertyNames: String): ChartLegendEntry = js.native
  def load(propertyNames: js.Array[String]): ChartLegendEntry = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartLegendEntry): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartLegendEntryUpdateData): Unit = js.native
  def set(properties: ChartLegendEntryUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartLegendEntry object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartLegendEntryData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartLegendEntryData = js.native
  
  /**
    * Specifies the top of a chart legend entry.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  val top: Double = js.native
  
  /**
    * Represents the visibility of a chart legend entry.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var visible: Boolean = js.native
  
  /**
    * Represents the width of the legend entry on the chart Legend.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  val width: Double = js.native
}
