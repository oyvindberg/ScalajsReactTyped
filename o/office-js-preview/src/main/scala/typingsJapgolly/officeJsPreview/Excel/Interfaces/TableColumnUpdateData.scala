package typingsJapgolly.officeJsPreview.Excel.Interfaces

import typingsJapgolly.officeJsPreview.Excel.CellValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TableColumn object, for use in `tableColumn.set({ ... })`. */
trait TableColumnUpdateData extends StObject {
  
  /**
    * Specifies the name of the table column.
    *
    * @remarks
    * [Api set: ExcelApi 1.1 for getting the name; 1.4 for setting it.]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the raw values of the specified range. The data returned could be a string, number, or boolean. Cells that contain an error will return the error string.
    If the returned value starts with a plus ("+"), minus ("-"), or equal sign ("="), Excel interprets this value as a formula.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var values: js.UndefOr[js.Array[js.Array[Any]]] = js.undefined
  
  /**
    * A JSON representation of the values in the cells in this table column.
    Unlike `TableColumn.values`, `TableColumn.valuesAsJson` supports all data types which can be in a cell. Examples include formatted number values and web images, in addition to the standard boolean, number, and string values.
    Data returned from this API always aligns with the en-US locale.  To retrieve data in the user's display locale, use `TableColumn.valuesAsJsonLocal`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var valuesAsJson: js.UndefOr[js.Array[js.Array[CellValue]]] = js.undefined
  
  /**
    * A JSON representation of the values in the cells in this table column.
    Unlike `TableColumn.values`, `TableColumn.valuesAsJsonLocal` supports all data types which can be in a cell. Examples include formatted number values and web images, in addition to the standard boolean, number, and string values.
    Data returned from this API always aligns with the user's display locale.  To retrieve data independent of locale, use `TableColumn.valuesAsJson`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var valuesAsJsonLocal: js.UndefOr[js.Array[js.Array[CellValue]]] = js.undefined
}
object TableColumnUpdateData {
  
  inline def apply(): TableColumnUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableColumnUpdateData]
  }
  
  extension [Self <: TableColumnUpdateData](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValues(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesAsJson(value: js.Array[js.Array[CellValue]]): Self = StObject.set(x, "valuesAsJson", value.asInstanceOf[js.Any])
    
    inline def setValuesAsJsonLocal(value: js.Array[js.Array[CellValue]]): Self = StObject.set(x, "valuesAsJsonLocal", value.asInstanceOf[js.Any])
    
    inline def setValuesAsJsonLocalUndefined: Self = StObject.set(x, "valuesAsJsonLocal", js.undefined)
    
    inline def setValuesAsJsonLocalVarargs(value: js.Array[CellValue]*): Self = StObject.set(x, "valuesAsJsonLocal", js.Array(value*))
    
    inline def setValuesAsJsonUndefined: Self = StObject.set(x, "valuesAsJson", js.undefined)
    
    inline def setValuesAsJsonVarargs(value: js.Array[CellValue]*): Self = StObject.set(x, "valuesAsJson", js.Array(value*))
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: js.Array[Any]*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
