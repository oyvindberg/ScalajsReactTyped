package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.Excel.Interfaces.TextFrameData
import typingsJapgolly.officeJs.Excel.Interfaces.TextFrameLoadOptions
import typingsJapgolly.officeJs.Excel.Interfaces.TextFrameUpdateData
import typingsJapgolly.officeJs.OfficeExtension.ClientObject
import typingsJapgolly.officeJs.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJs.anon.Expand
import typingsJapgolly.officeJs.officeJsStrings.AutoSizeMixed
import typingsJapgolly.officeJs.officeJsStrings.AutoSizeNone
import typingsJapgolly.officeJs.officeJsStrings.AutoSizeShapeToFitText
import typingsJapgolly.officeJs.officeJsStrings.AutoSizeTextToFitShape
import typingsJapgolly.officeJs.officeJsStrings.Bottom
import typingsJapgolly.officeJs.officeJsStrings.Center
import typingsJapgolly.officeJs.officeJsStrings.Clip
import typingsJapgolly.officeJs.officeJsStrings.Distributed
import typingsJapgolly.officeJs.officeJsStrings.EastAsianVertical
import typingsJapgolly.officeJs.officeJsStrings.Ellipsis
import typingsJapgolly.officeJs.officeJsStrings.Horizontal
import typingsJapgolly.officeJs.officeJsStrings.Justified
import typingsJapgolly.officeJs.officeJsStrings.Justify
import typingsJapgolly.officeJs.officeJsStrings.JustifyLow
import typingsJapgolly.officeJs.officeJsStrings.Left
import typingsJapgolly.officeJs.officeJsStrings.LeftToRight
import typingsJapgolly.officeJs.officeJsStrings.Middle
import typingsJapgolly.officeJs.officeJsStrings.MongolianVertical
import typingsJapgolly.officeJs.officeJsStrings.Overflow
import typingsJapgolly.officeJs.officeJsStrings.Right
import typingsJapgolly.officeJs.officeJsStrings.RightToLeft
import typingsJapgolly.officeJs.officeJsStrings.ThaiDistributed
import typingsJapgolly.officeJs.officeJsStrings.Top
import typingsJapgolly.officeJs.officeJsStrings.Vertical
import typingsJapgolly.officeJs.officeJsStrings.Vertical270
import typingsJapgolly.officeJs.officeJsStrings.WordArtVertical
import typingsJapgolly.officeJs.officeJsStrings.WordArtVerticalRTL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the text frame of a shape object.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait TextFrame
  extends StObject
     with ClientObject {
  
  /**
    * The automatic sizing settings for the text frame. A text frame can be set to automatically fit the text to the text frame, to automatically fit the text frame to the text, or not perform any automatic sizing.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var autoSizeSetting: ShapeAutoSize | AutoSizeNone | AutoSizeTextToFitShape | AutoSizeShapeToFitText | AutoSizeMixed = js.native
  
  /**
    * Represents the bottom margin, in points, of the text frame.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var bottomMargin: Double = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TextFrame: RequestContext = js.native
  
  /**
    * Deletes all the text in the text frame.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  def deleteText(): Unit = js.native
  
  /**
    * Specifies if the text frame contains text.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val hasText: Boolean = js.native
  
  /**
    * Represents the horizontal alignment of the text frame. See `Excel.ShapeTextHorizontalAlignment` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var horizontalAlignment: ShapeTextHorizontalAlignment | Left | Center | Right | Justify | JustifyLow | Distributed | ThaiDistributed = js.native
  
  /**
    * Represents the horizontal overflow behavior of the text frame. See `Excel.ShapeTextHorizontalOverflow` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var horizontalOverflow: ShapeTextHorizontalOverflow | Overflow | Clip = js.native
  
  /**
    * Represents the left margin, in points, of the text frame.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var leftMargin: Double = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TextFrame = js.native
  def load(options: TextFrameLoadOptions): TextFrame = js.native
  def load(propertyNamesAndPaths: Expand): TextFrame = js.native
  def load(propertyNames: String): TextFrame = js.native
  def load(propertyNames: js.Array[String]): TextFrame = js.native
  
  /**
    * Represents the angle to which the text is oriented for the text frame. See `Excel.ShapeTextOrientation` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var orientation: ShapeTextOrientation | Horizontal | Vertical | Vertical270 | WordArtVertical | EastAsianVertical | MongolianVertical | WordArtVerticalRTL = js.native
  
  /**
    * Represents the reading order of the text frame, either left-to-right or right-to-left. See `Excel.ShapeTextReadingOrder` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var readingOrder: ShapeTextReadingOrder | LeftToRight | RightToLeft = js.native
  
  /**
    * Represents the right margin, in points, of the text frame.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var rightMargin: Double = js.native
  
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: TextFrameUpdateData): Unit = js.native
  def set(properties: TextFrameUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: TextFrame): Unit = js.native
  
  /**
    * Represents the text that is attached to a shape in the text frame, and properties and methods for manipulating the text. See `Excel.TextRange` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val textRange: TextRange = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.TextFrame object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TextFrameData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): TextFrameData = js.native
  
  /**
    * Represents the top margin, in points, of the text frame.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var topMargin: Double = js.native
  
  /**
    * Represents the vertical alignment of the text frame. See `Excel.ShapeTextVerticalAlignment` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var verticalAlignment: ShapeTextVerticalAlignment | Top | Middle | Bottom | Justified | Distributed = js.native
  
  /**
    * Represents the vertical overflow behavior of the text frame. See `Excel.ShapeTextVerticalOverflow` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var verticalOverflow: ShapeTextVerticalOverflow | Overflow | Ellipsis | Clip = js.native
}
