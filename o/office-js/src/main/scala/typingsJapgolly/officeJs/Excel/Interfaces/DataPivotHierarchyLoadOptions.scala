package typingsJapgolly.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the Excel DataPivotHierarchy.
  *
  * @remarks
  * [Api set: ExcelApi 1.8]
  */
trait DataPivotHierarchyLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns the PivotFields associated with the DataPivotHierarchy.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var field: js.UndefOr[PivotFieldLoadOptions] = js.undefined
  
  /**
    * ID of the DataPivotHierarchy.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Name of the DataPivotHierarchy.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Number format of the DataPivotHierarchy.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Position of the DataPivotHierarchy.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the data should be shown as a specific summary calculation.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var showAs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if all items of the DataPivotHierarchy are shown.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var summarizeBy: js.UndefOr[Boolean] = js.undefined
}
object DataPivotHierarchyLoadOptions {
  
  inline def apply(): DataPivotHierarchyLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataPivotHierarchyLoadOptions]
  }
  
  extension [Self <: DataPivotHierarchyLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setField(value: PivotFieldLoadOptions): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumberFormat(value: Boolean): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    inline def setPosition(value: Boolean): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShowAs(value: Boolean): Self = StObject.set(x, "showAs", value.asInstanceOf[js.Any])
    
    inline def setShowAsUndefined: Self = StObject.set(x, "showAs", js.undefined)
    
    inline def setSummarizeBy(value: Boolean): Self = StObject.set(x, "summarizeBy", value.asInstanceOf[js.Any])
    
    inline def setSummarizeByUndefined: Self = StObject.set(x, "summarizeBy", js.undefined)
  }
}
