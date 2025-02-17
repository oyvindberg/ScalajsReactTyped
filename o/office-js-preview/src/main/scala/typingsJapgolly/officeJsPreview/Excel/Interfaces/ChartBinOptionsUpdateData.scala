package typingsJapgolly.officeJsPreview.Excel.Interfaces

import typingsJapgolly.officeJsPreview.Excel.ChartBinType
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Auto
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.BinCount
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.BinWidth
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Category
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartBinOptions object, for use in `chartBinOptions.set({ ... })`. */
trait ChartBinOptionsUpdateData extends StObject {
  
  /**
    * Specifies if bin overflow is enabled in a histogram chart or pareto chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var allowOverflow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if bin underflow is enabled in a histogram chart or pareto chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var allowUnderflow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the bin count of a histogram chart or pareto chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var count: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the bin overflow value of a histogram chart or pareto chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var overflowValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the bin's type for a histogram chart or pareto chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[ChartBinType | Category | Auto | BinWidth | BinCount] = js.undefined
  
  /**
    * Specifies the bin underflow value of a histogram chart or pareto chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var underflowValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the bin width value of a histogram chart or pareto chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ChartBinOptionsUpdateData {
  
  inline def apply(): ChartBinOptionsUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartBinOptionsUpdateData]
  }
  
  extension [Self <: ChartBinOptionsUpdateData](x: Self) {
    
    inline def setAllowOverflow(value: Boolean): Self = StObject.set(x, "allowOverflow", value.asInstanceOf[js.Any])
    
    inline def setAllowOverflowUndefined: Self = StObject.set(x, "allowOverflow", js.undefined)
    
    inline def setAllowUnderflow(value: Boolean): Self = StObject.set(x, "allowUnderflow", value.asInstanceOf[js.Any])
    
    inline def setAllowUnderflowUndefined: Self = StObject.set(x, "allowUnderflow", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setOverflowValue(value: Double): Self = StObject.set(x, "overflowValue", value.asInstanceOf[js.Any])
    
    inline def setOverflowValueUndefined: Self = StObject.set(x, "overflowValue", js.undefined)
    
    inline def setType(value: ChartBinType | Category | Auto | BinWidth | BinCount): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnderflowValue(value: Double): Self = StObject.set(x, "underflowValue", value.asInstanceOf[js.Any])
    
    inline def setUnderflowValueUndefined: Self = StObject.set(x, "underflowValue", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
