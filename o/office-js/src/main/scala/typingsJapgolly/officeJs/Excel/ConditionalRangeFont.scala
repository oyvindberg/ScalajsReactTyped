package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.Excel.Interfaces.ConditionalRangeFontData
import typingsJapgolly.officeJs.Excel.Interfaces.ConditionalRangeFontLoadOptions
import typingsJapgolly.officeJs.Excel.Interfaces.ConditionalRangeFontUpdateData
import typingsJapgolly.officeJs.OfficeExtension.ClientObject
import typingsJapgolly.officeJs.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJs.anon.Expand
import typingsJapgolly.officeJs.officeJsStrings.Double
import typingsJapgolly.officeJs.officeJsStrings.None
import typingsJapgolly.officeJs.officeJsStrings.Single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object represents the font attributes (font style, color, etc.) for an object.
  *
  * @remarks
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait ConditionalRangeFont
  extends StObject
     with ClientObject {
  
  /**
    * Specifies if the font is bold.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var bold: Boolean = js.native
  
  /**
    * Resets the font formats.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  def clear(): Unit = js.native
  
  /**
    * HTML color code representation of the text color (e.g., #FF0000 represents Red).
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var color: String = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ConditionalRangeFont: RequestContext = js.native
  
  /**
    * Specifies if the font is italic.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var italic: Boolean = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ConditionalRangeFont = js.native
  def load(options: ConditionalRangeFontLoadOptions): ConditionalRangeFont = js.native
  def load(propertyNamesAndPaths: Expand): ConditionalRangeFont = js.native
  def load(propertyNames: String): ConditionalRangeFont = js.native
  def load(propertyNames: js.Array[String]): ConditionalRangeFont = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ConditionalRangeFont): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ConditionalRangeFontUpdateData): Unit = js.native
  def set(properties: ConditionalRangeFontUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Specifies the strikethrough status of the font.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var strikethrough: Boolean = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ConditionalRangeFont object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ConditionalRangeFontData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ConditionalRangeFontData = js.native
  
  /**
    * The type of underline applied to the font. See `Excel.ConditionalRangeFontUnderlineStyle` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var underline: ConditionalRangeFontUnderlineStyle | None | Single | Double = js.native
}
