package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.Excel.Interfaces.ChartLineFormatData
import typingsJapgolly.officeJs.Excel.Interfaces.ChartLineFormatLoadOptions
import typingsJapgolly.officeJs.Excel.Interfaces.ChartLineFormatUpdateData
import typingsJapgolly.officeJs.OfficeExtension.ClientObject
import typingsJapgolly.officeJs.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJs.anon.Expand
import typingsJapgolly.officeJs.officeJsStrings.Automatic
import typingsJapgolly.officeJs.officeJsStrings.Continuous
import typingsJapgolly.officeJs.officeJsStrings.Dash
import typingsJapgolly.officeJs.officeJsStrings.DashDot
import typingsJapgolly.officeJs.officeJsStrings.DashDotDot
import typingsJapgolly.officeJs.officeJsStrings.Dot
import typingsJapgolly.officeJs.officeJsStrings.Grey25
import typingsJapgolly.officeJs.officeJsStrings.Grey50
import typingsJapgolly.officeJs.officeJsStrings.Grey75
import typingsJapgolly.officeJs.officeJsStrings.None
import typingsJapgolly.officeJs.officeJsStrings.RoundDot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Encapsulates the formatting options for line elements.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait ChartLineFormat
  extends StObject
     with ClientObject {
  
  /**
    * Clears the line format of a chart element.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  def clear(): Unit = js.native
  
  /**
    * HTML color code representing the color of lines in the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var color: String = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartLineFormat: RequestContext = js.native
  
  /**
    * Represents the line style. See `Excel.ChartLineStyle` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var lineStyle: ChartLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot | Grey25 | Grey50 | Grey75 | Automatic | RoundDot = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartLineFormat = js.native
  def load(options: ChartLineFormatLoadOptions): ChartLineFormat = js.native
  def load(propertyNamesAndPaths: Expand): ChartLineFormat = js.native
  def load(propertyNames: String): ChartLineFormat = js.native
  def load(propertyNames: js.Array[String]): ChartLineFormat = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartLineFormat): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartLineFormatUpdateData): Unit = js.native
  def set(properties: ChartLineFormatUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartLineFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartLineFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartLineFormatData = js.native
  
  /**
    * Represents weight of the line, in points.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var weight: Double = js.native
}
