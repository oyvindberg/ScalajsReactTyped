package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.Excel.ErrorCellValueType.spill
import typingsJapgolly.officeJsPreview.Excel.RangeValueType.error
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Collision
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Error
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.IndeterminateSize
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.MergedCell
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.NumbersignSPILLExclamationmark
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.OutOfMemoryWhileCalc
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Spill
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Unknown_
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.WorksheetEdge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the value of a cell containing a #SPILL! error.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait SpillErrorCellValue
  extends StObject
     with ErrorCellValue {
  
  /**
    * Represents the value that would be returned by `Range.valueTypes` for a cell with this value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var basicType: js.UndefOr[error | Error] = js.undefined
  
  /**
    * Represents the value that would be returned by `Range.values` for a cell with this value.
    * When accessed through a `valuesAsJson` property, this string value aligns with the en-US locale.
    * When accessed through a `valuesAsJsonLocal` property, this string value aligns with the user's display locale.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var basicValue: js.UndefOr[NumbersignSPILLExclamationmark | String] = js.undefined
  
  /**
    * Represents the number of columns that would spill if there were no #SPILL! error.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var columnCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the type of `SpillErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var errorSubType: js.UndefOr[
    SpillErrorCellValueSubType | Unknown_ | Collision | IndeterminateSize | WorksheetEdge | OutOfMemoryWhileCalc | typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Table | MergedCell
  ] = js.undefined
  
  /**
    * Represents the type of `ErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var errorType: js.UndefOr[spill | Spill] = js.undefined
  
  /**
    * Represents the number of rows that would spill if there were no #SPILL! error.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var rowCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the type of this cell value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var `type`: typingsJapgolly.officeJsPreview.Excel.CellValueType.error | Error
}
object SpillErrorCellValue {
  
  inline def apply(`type`: typingsJapgolly.officeJsPreview.Excel.CellValueType.error | Error): SpillErrorCellValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpillErrorCellValue]
  }
  
  extension [Self <: SpillErrorCellValue](x: Self) {
    
    inline def setBasicType(value: error | Error): Self = StObject.set(x, "basicType", value.asInstanceOf[js.Any])
    
    inline def setBasicTypeUndefined: Self = StObject.set(x, "basicType", js.undefined)
    
    inline def setBasicValue(value: NumbersignSPILLExclamationmark | String): Self = StObject.set(x, "basicValue", value.asInstanceOf[js.Any])
    
    inline def setBasicValueUndefined: Self = StObject.set(x, "basicValue", js.undefined)
    
    inline def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
    
    inline def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
    
    inline def setErrorSubType(
      value: SpillErrorCellValueSubType | Unknown_ | Collision | IndeterminateSize | WorksheetEdge | OutOfMemoryWhileCalc | typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Table | MergedCell
    ): Self = StObject.set(x, "errorSubType", value.asInstanceOf[js.Any])
    
    inline def setErrorSubTypeUndefined: Self = StObject.set(x, "errorSubType", js.undefined)
    
    inline def setErrorType(value: spill | Spill): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    inline def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
    
    inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
    
    inline def setType(value: typingsJapgolly.officeJsPreview.Excel.CellValueType.error | Error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
