package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.Excel.Interfaces.ConditionalRangeFormatData
import typingsJapgolly.officeJsPreview.Excel.Interfaces.ConditionalRangeFormatLoadOptions
import typingsJapgolly.officeJsPreview.Excel.Interfaces.ConditionalRangeFormatUpdateData
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A format object encapsulating the conditional formats range's font, fill, borders, and other properties.
  *
  * @remarks
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait ConditionalRangeFormat
  extends StObject
     with ClientObject {
  
  /**
    * Collection of border objects that apply to the overall conditional format range.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  val borders: ConditionalRangeBorderCollection = js.native
  
  /**
    * Remove the format properties from a conditional format rule. This creates a rule with no format settings.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def clearFormat(): Unit = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ConditionalRangeFormat: RequestContext = js.native
  
  /**
    * Returns the fill object defined on the overall conditional format range.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  val fill: ConditionalRangeFill = js.native
  
  /**
    * Returns the font object defined on the overall conditional format range.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  val font: ConditionalRangeFont = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ConditionalRangeFormat = js.native
  def load(options: ConditionalRangeFormatLoadOptions): ConditionalRangeFormat = js.native
  def load(propertyNamesAndPaths: Expand): ConditionalRangeFormat = js.native
  def load(propertyNames: String): ConditionalRangeFormat = js.native
  def load(propertyNames: js.Array[String]): ConditionalRangeFormat = js.native
  
  /**
    * Represents Excel's number format code for the given range. For more information about Excel number formatting, see {@link https://support.microsoft.com/office/number-format-codes-5026bbd6-04bc-48cd-bf33-80f18b4eae68 | Number format codes}.
    Cleared if `null` is passed in.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var numberFormat: Any = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ConditionalRangeFormat): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ConditionalRangeFormatUpdateData): Unit = js.native
  def set(properties: ConditionalRangeFormatUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ConditionalRangeFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ConditionalRangeFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ConditionalRangeFormatData = js.native
}
