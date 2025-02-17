package typingsJapgolly.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartAxes object, for use in `chartAxes.set({ ... })`. */
trait ChartAxesUpdateData extends StObject {
  
  /**
    * Represents the category axis in a chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var categoryAxis: js.UndefOr[ChartAxisUpdateData] = js.undefined
  
  /**
    * Represents the series axis of a 3-D chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var seriesAxis: js.UndefOr[ChartAxisUpdateData] = js.undefined
  
  /**
    * Represents the value axis in an axis.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var valueAxis: js.UndefOr[ChartAxisUpdateData] = js.undefined
}
object ChartAxesUpdateData {
  
  inline def apply(): ChartAxesUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxesUpdateData]
  }
  
  extension [Self <: ChartAxesUpdateData](x: Self) {
    
    inline def setCategoryAxis(value: ChartAxisUpdateData): Self = StObject.set(x, "categoryAxis", value.asInstanceOf[js.Any])
    
    inline def setCategoryAxisUndefined: Self = StObject.set(x, "categoryAxis", js.undefined)
    
    inline def setSeriesAxis(value: ChartAxisUpdateData): Self = StObject.set(x, "seriesAxis", value.asInstanceOf[js.Any])
    
    inline def setSeriesAxisUndefined: Self = StObject.set(x, "seriesAxis", js.undefined)
    
    inline def setValueAxis(value: ChartAxisUpdateData): Self = StObject.set(x, "valueAxis", value.asInstanceOf[js.Any])
    
    inline def setValueAxisUndefined: Self = StObject.set(x, "valueAxis", js.undefined)
  }
}
