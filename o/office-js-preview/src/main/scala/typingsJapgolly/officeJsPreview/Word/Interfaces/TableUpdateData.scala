package typingsJapgolly.officeJsPreview.Word.Interfaces

import typingsJapgolly.officeJsPreview.Word.Alignment
import typingsJapgolly.officeJsPreview.Word.VerticalAlignment
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Bottom
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Center
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Centered
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Justified
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Left
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Mixed
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Right
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Top
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Table object, for use in `table.set({ ... })`. */
trait TableUpdateData extends StObject {
  
  /**
    * Gets or sets the alignment of the table against the page column. The value can be 'Left', 'Centered', or 'Right'.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var alignment: js.UndefOr[Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified] = js.undefined
  
  /**
    * Gets the font. Use this to get and set font name, size, color, and other properties.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var font: js.UndefOr[FontUpdateData] = js.undefined
  
  /**
    * Gets and sets the number of header rows.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var headerRowCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets and sets the horizontal alignment of every cell in the table. The value can be 'Left', 'Centered', 'Right', or 'Justified'.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var horizontalAlignment: js.UndefOr[Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified] = js.undefined
  
  /**
    * Gets and sets the shading color. Color is specified in "#RRGGBB" format or by using the color name.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var shadingColor: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the style name for the table. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var style: js.UndefOr[String] = js.undefined
  
  /**
    * Gets and sets whether the table has banded columns.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var styleBandedColumns: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets and sets whether the table has banded rows.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var styleBandedRows: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets the built-in style name for the table. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150, starting with typingsJapgolly.officeJsPreview.Word.Style, typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Other, typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Normal */ Any
  ] = js.undefined
  
  /**
    * Gets and sets whether the table has a first column with a special style.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var styleFirstColumn: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets and sets whether the table has a last column with a special style.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var styleLastColumn: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets and sets whether the table has a total (last) row with a special style.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var styleTotalRow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets and sets the text values in the table, as a 2D Javascript array.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var values: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  
  /**
    * Gets and sets the vertical alignment of every cell in the table. The value can be 'Top', 'Center', or 'Bottom'.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var verticalAlignment: js.UndefOr[VerticalAlignment | Mixed | Top | Center | Bottom] = js.undefined
  
  /**
    * Gets and sets the width of the table in points.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var width: js.UndefOr[Double] = js.undefined
}
object TableUpdateData {
  
  inline def apply(): TableUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableUpdateData]
  }
  
  extension [Self <: TableUpdateData](x: Self) {
    
    inline def setAlignment(value: Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setFont(value: FontUpdateData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setHeaderRowCount(value: Double): Self = StObject.set(x, "headerRowCount", value.asInstanceOf[js.Any])
    
    inline def setHeaderRowCountUndefined: Self = StObject.set(x, "headerRowCount", js.undefined)
    
    inline def setHorizontalAlignment(value: Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setShadingColor(value: String): Self = StObject.set(x, "shadingColor", value.asInstanceOf[js.Any])
    
    inline def setShadingColorUndefined: Self = StObject.set(x, "shadingColor", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleBandedColumns(value: Boolean): Self = StObject.set(x, "styleBandedColumns", value.asInstanceOf[js.Any])
    
    inline def setStyleBandedColumnsUndefined: Self = StObject.set(x, "styleBandedColumns", js.undefined)
    
    inline def setStyleBandedRows(value: Boolean): Self = StObject.set(x, "styleBandedRows", value.asInstanceOf[js.Any])
    
    inline def setStyleBandedRowsUndefined: Self = StObject.set(x, "styleBandedRows", js.undefined)
    
    inline def setStyleBuiltIn(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150, starting with typingsJapgolly.officeJsPreview.Word.Style, typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Other, typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Normal */ Any
    ): Self = StObject.set(x, "styleBuiltIn", value.asInstanceOf[js.Any])
    
    inline def setStyleBuiltInUndefined: Self = StObject.set(x, "styleBuiltIn", js.undefined)
    
    inline def setStyleFirstColumn(value: Boolean): Self = StObject.set(x, "styleFirstColumn", value.asInstanceOf[js.Any])
    
    inline def setStyleFirstColumnUndefined: Self = StObject.set(x, "styleFirstColumn", js.undefined)
    
    inline def setStyleLastColumn(value: Boolean): Self = StObject.set(x, "styleLastColumn", value.asInstanceOf[js.Any])
    
    inline def setStyleLastColumnUndefined: Self = StObject.set(x, "styleLastColumn", js.undefined)
    
    inline def setStyleTotalRow(value: Boolean): Self = StObject.set(x, "styleTotalRow", value.asInstanceOf[js.Any])
    
    inline def setStyleTotalRowUndefined: Self = StObject.set(x, "styleTotalRow", js.undefined)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setValues(value: js.Array[js.Array[String]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: js.Array[String]*): Self = StObject.set(x, "values", js.Array(value*))
    
    inline def setVerticalAlignment(value: VerticalAlignment | Mixed | Top | Center | Bottom): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
