package typingsJapgolly.devextreme.mod.DevExpress.viz

import typingsJapgolly.devextreme.mod.DevExpress.viz.dxChart.ChartSingleValueSeriesAggregationMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartSeriesTypesFullStackedSplineSeriesAggregation
  extends StObject
     with dxChartSeriesTypesCommonSeriesAggregation {
  
  /**
    * Specifies how to aggregate series points.
    */
  @JSName("method")
  var method_dxChartSeriesTypesFullStackedSplineSeriesAggregation: js.UndefOr[ChartSingleValueSeriesAggregationMethod] = js.undefined
}
object dxChartSeriesTypesFullStackedSplineSeriesAggregation {
  
  inline def apply(): dxChartSeriesTypesFullStackedSplineSeriesAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesFullStackedSplineSeriesAggregation]
  }
  
  extension [Self <: dxChartSeriesTypesFullStackedSplineSeriesAggregation](x: Self) {
    
    inline def setMethod(value: ChartSingleValueSeriesAggregationMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
  }
}
