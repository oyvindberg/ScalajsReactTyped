package typingsJapgolly.devextreme.mod.DevExpress.viz

import typingsJapgolly.devextreme.devextremeStrings.excludePoints
import typingsJapgolly.devextreme.devextremeStrings.includePoints
import typingsJapgolly.devextreme.devextremeStrings.nearestPoint
import typingsJapgolly.devextreme.devextremeStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartSeriesTypesStepLineSeries
  extends StObject
     with dxChartSeriesTypesCommonSeries {
  
  /**
    * Configures data aggregation for the series.
    */
  @JSName("aggregation")
  var aggregation_dxChartSeriesTypesStepLineSeries: js.UndefOr[dxChartSeriesTypesStepLineSeriesAggregation] = js.undefined
  
  /**
    * Specifies series elements to be highlighted when a user points to a series.
    */
  @JSName("hoverMode")
  var hoverMode_dxChartSeriesTypesStepLineSeries: js.UndefOr[nearestPoint | includePoints | excludePoints | none] = js.undefined
  
  /**
    * Configures point labels.
    */
  @JSName("label")
  var label_dxChartSeriesTypesStepLineSeries: js.UndefOr[dxChartSeriesTypesStepLineSeriesLabel] = js.undefined
  
  /**
    * Specifies series elements to be highlighted when a user selects a series.
    */
  @JSName("selectionMode")
  var selectionMode_dxChartSeriesTypesStepLineSeries: js.UndefOr[includePoints | excludePoints | none] = js.undefined
}
object dxChartSeriesTypesStepLineSeries {
  
  inline def apply(): dxChartSeriesTypesStepLineSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesStepLineSeries]
  }
  
  extension [Self <: dxChartSeriesTypesStepLineSeries](x: Self) {
    
    inline def setAggregation(value: dxChartSeriesTypesStepLineSeriesAggregation): Self = StObject.set(x, "aggregation", value.asInstanceOf[js.Any])
    
    inline def setAggregationUndefined: Self = StObject.set(x, "aggregation", js.undefined)
    
    inline def setHoverMode(value: nearestPoint | includePoints | excludePoints | none): Self = StObject.set(x, "hoverMode", value.asInstanceOf[js.Any])
    
    inline def setHoverModeUndefined: Self = StObject.set(x, "hoverMode", js.undefined)
    
    inline def setLabel(value: dxChartSeriesTypesStepLineSeriesLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSelectionMode(value: includePoints | excludePoints | none): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
  }
}
