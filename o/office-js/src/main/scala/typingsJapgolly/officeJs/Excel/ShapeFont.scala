package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.Excel.Interfaces.ShapeFontData
import typingsJapgolly.officeJs.Excel.Interfaces.ShapeFontLoadOptions
import typingsJapgolly.officeJs.Excel.Interfaces.ShapeFontUpdateData
import typingsJapgolly.officeJs.OfficeExtension.ClientObject
import typingsJapgolly.officeJs.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJs.anon.Expand
import typingsJapgolly.officeJs.officeJsStrings.Dash
import typingsJapgolly.officeJs.officeJsStrings.DashHeavy
import typingsJapgolly.officeJs.officeJsStrings.DashLong
import typingsJapgolly.officeJs.officeJsStrings.DashLongHeavy
import typingsJapgolly.officeJs.officeJsStrings.DotDash
import typingsJapgolly.officeJs.officeJsStrings.DotDashHeavy
import typingsJapgolly.officeJs.officeJsStrings.DotDotDash
import typingsJapgolly.officeJs.officeJsStrings.DotDotDashHeavy
import typingsJapgolly.officeJs.officeJsStrings.Dotted
import typingsJapgolly.officeJs.officeJsStrings.DottedHeavy
import typingsJapgolly.officeJs.officeJsStrings.Heavy
import typingsJapgolly.officeJs.officeJsStrings.None
import typingsJapgolly.officeJs.officeJsStrings.Single
import typingsJapgolly.officeJs.officeJsStrings.Wavy
import typingsJapgolly.officeJs.officeJsStrings.WavyDouble
import typingsJapgolly.officeJs.officeJsStrings.WavyHeavy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the font attributes, such as font name, font size, and color, for a shape's `TextRange` object.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait ShapeFont
  extends StObject
     with ClientObject {
  
  /**
    * Represents the bold status of font. Returns `null` if the `TextRange` includes both bold and non-bold text fragments.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var bold: Boolean = js.native
  
  /**
    * HTML color code representation of the text color (e.g., "#FF0000" represents red). Returns `null` if the `TextRange` includes text fragments with different colors.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var color: String = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ShapeFont: RequestContext = js.native
  
  /**
    * Represents the italic status of font. Returns `null` if the `TextRange` includes both italic and non-italic text fragments.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var italic: Boolean = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ShapeFont = js.native
  def load(options: ShapeFontLoadOptions): ShapeFont = js.native
  def load(propertyNamesAndPaths: Expand): ShapeFont = js.native
  def load(propertyNames: String): ShapeFont = js.native
  def load(propertyNames: js.Array[String]): ShapeFont = js.native
  
  /**
    * Represents font name (e.g., "Calibri"). If the text is a Complex Script or East Asian language, this is the corresponding font name; otherwise it is the Latin font name.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var name: String = js.native
  
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ShapeFontUpdateData): Unit = js.native
  def set(properties: ShapeFontUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ShapeFont): Unit = js.native
  
  /**
    * Represents font size in points (e.g., 11). Returns `null` if the `TextRange` includes text fragments with different font sizes.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var size: Double = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ShapeFont object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ShapeFontData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ShapeFontData = js.native
  
  /**
    * Type of underline applied to the font. Returns `null` if the `TextRange` includes text fragments with different underline styles. See `Excel.ShapeFontUnderlineStyle` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var underline: ShapeFontUnderlineStyle | None | Single | typingsJapgolly.officeJs.officeJsStrings.Double | Heavy | Dotted | DottedHeavy | Dash | DashHeavy | DashLong | DashLongHeavy | DotDash | DotDashHeavy | DotDotDash | DotDotDashHeavy | Wavy | WavyHeavy | WavyDouble = js.native
}
