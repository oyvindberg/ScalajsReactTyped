package typingsJapgolly.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A format object encapsulating the range's font, fill, borders, alignment, and other properties.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
trait RangeFormatLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if text is automatically indented when text alignment is set to equal distribution.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var autoIndent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Collection of border objects that apply to the overall range.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var borders: js.UndefOr[RangeBorderCollectionLoadOptions] = js.undefined
  
  /**
    * Specifies the width of all colums within the range. If the column widths are not uniform, `null` will be returned.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var columnWidth: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns the fill object defined on the overall range.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var fill: js.UndefOr[RangeFillLoadOptions] = js.undefined
  
  /**
    * Returns the font object defined on the overall range.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[RangeFontLoadOptions] = js.undefined
  
  /**
    * Represents the horizontal alignment for the specified object. See `Excel.HorizontalAlignment` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var horizontalAlignment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An integer from 0 to 250 that indicates the indent level.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var indentLevel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns the format protection object for a range.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var protection: js.UndefOr[FormatProtectionLoadOptions] = js.undefined
  
  /**
    * The reading order for the range.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var readingOrder: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The height of all rows in the range. If the row heights are not uniform, `null` will be returned.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var rowHeight: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if text automatically shrinks to fit in the available column width.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var shrinkToFit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The text orientation of all the cells within the range.
    The text orientation should be an integer either from -90 to 90, or 180 for vertically-oriented text.
    If the orientation within a range are not uniform, then `null` will be returned.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var textOrientation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines if the row height of the `Range` object equals the standard height of the sheet.
    Returns `true` if the row height of the `Range` object equals the standard height of the sheet.
    Returns `null` if the range contains more than one row and the rows aren't all the same height.
    Returns `false` otherwise.
    Note: This property is only intended to be set to `true`. Setting it to `false` has no effect.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var useStandardHeight: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the column width of the `Range` object equals the standard width of the sheet.
    Returns `true` if the column width of the `Range` object equals the standard width of the sheet.
    Returns `null` if the range contains more than one column and the columns aren't all the same height.
    Returns `false` otherwise.
    Note: This property is only intended to be set to `true`. Setting it to `false` has no effect.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var useStandardWidth: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the vertical alignment for the specified object. See `Excel.VerticalAlignment` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var verticalAlignment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if Excel wraps the text in the object. A `null` value indicates that the entire range doesn't have a uniform wrap setting
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var wrapText: js.UndefOr[Boolean] = js.undefined
}
object RangeFormatLoadOptions {
  
  inline def apply(): RangeFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeFormatLoadOptions]
  }
  
  extension [Self <: RangeFormatLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setAutoIndent(value: Boolean): Self = StObject.set(x, "autoIndent", value.asInstanceOf[js.Any])
    
    inline def setAutoIndentUndefined: Self = StObject.set(x, "autoIndent", js.undefined)
    
    inline def setBorders(value: RangeBorderCollectionLoadOptions): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
    
    inline def setBordersUndefined: Self = StObject.set(x, "borders", js.undefined)
    
    inline def setColumnWidth(value: Boolean): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
    
    inline def setFill(value: RangeFillLoadOptions): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFont(value: RangeFontLoadOptions): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setHorizontalAlignment(value: Boolean): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setIndentLevel(value: Boolean): Self = StObject.set(x, "indentLevel", value.asInstanceOf[js.Any])
    
    inline def setIndentLevelUndefined: Self = StObject.set(x, "indentLevel", js.undefined)
    
    inline def setProtection(value: FormatProtectionLoadOptions): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
    
    inline def setProtectionUndefined: Self = StObject.set(x, "protection", js.undefined)
    
    inline def setReadingOrder(value: Boolean): Self = StObject.set(x, "readingOrder", value.asInstanceOf[js.Any])
    
    inline def setReadingOrderUndefined: Self = StObject.set(x, "readingOrder", js.undefined)
    
    inline def setRowHeight(value: Boolean): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
    
    inline def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
    
    inline def setShrinkToFit(value: Boolean): Self = StObject.set(x, "shrinkToFit", value.asInstanceOf[js.Any])
    
    inline def setShrinkToFitUndefined: Self = StObject.set(x, "shrinkToFit", js.undefined)
    
    inline def setTextOrientation(value: Boolean): Self = StObject.set(x, "textOrientation", value.asInstanceOf[js.Any])
    
    inline def setTextOrientationUndefined: Self = StObject.set(x, "textOrientation", js.undefined)
    
    inline def setUseStandardHeight(value: Boolean): Self = StObject.set(x, "useStandardHeight", value.asInstanceOf[js.Any])
    
    inline def setUseStandardHeightUndefined: Self = StObject.set(x, "useStandardHeight", js.undefined)
    
    inline def setUseStandardWidth(value: Boolean): Self = StObject.set(x, "useStandardWidth", value.asInstanceOf[js.Any])
    
    inline def setUseStandardWidthUndefined: Self = StObject.set(x, "useStandardWidth", js.undefined)
    
    inline def setVerticalAlignment(value: Boolean): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
    
    inline def setWrapText(value: Boolean): Self = StObject.set(x, "wrapText", value.asInstanceOf[js.Any])
    
    inline def setWrapTextUndefined: Self = StObject.set(x, "wrapText", js.undefined)
  }
}
