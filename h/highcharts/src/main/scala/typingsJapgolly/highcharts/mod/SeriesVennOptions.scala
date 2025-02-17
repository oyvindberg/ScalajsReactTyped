package typingsJapgolly.highcharts.mod

import typingsJapgolly.highcharts.highchartsStrings.venn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.highcharts.mod.SeriesOptions because var conflicts: zIndex. Inlined id, index, legendIndex, mapData, name, stack, `type`, xAxis, yAxis */ trait SeriesVennOptions
  extends StObject
     with PlotVennOptions {
  
  /**
    * (Highcharts) An array of data points for the series. For the `scatter`
    * series type, points can be given in the following ways:
    *
    * 1. An array of numerical values. In this case, the numerical values will
    * be interpreted as `y` options. The `x` values will be automatically
    * calculated, either starting at 0 and incremented by 1, or from
    * `pointStart` and `pointInterval` given in the series options. If the axis
    * has categories, these will be used. Example: (see online documentation
    * for example)
    *
    * 2. An array of arrays with 2 values. In this case, the values correspond
    * to `x,y`. If the first value is a string, it is applied as the name of
    * the point, and the `x` value is inferred. (see online documentation for
    * example)
    *
    * 3. An array of objects with named values. The following snippet shows
    * only a few settings, see the complete options set below. If the total
    * number of data points exceeds the series' turboThreshold, this option is
    * not available. (see online documentation for example)
    */
  var data: js.UndefOr[js.Array[PointOptionsObject]] = js.undefined
  
  /**
    * Not available
    */
  var dataParser: Unit
  
  /**
    * Not available
    */
  var dataURL: Unit
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An id for the series. This can
    * be used after render time to get a pointer to the series object through
    * `chart.get()`.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The index of the series in the
    * chart, affecting the internal index in the `chart.series` array, the
    * visible Z index as well as the order in the legend.
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The sequential index of the
    * series in the legend.
    */
  var legendIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highmaps) An array of objects containing a `geometry` or `path`
    * definition and optionally additional properties to join in the `data` as
    * per the `joinBy` option. GeoJSON and TopoJSON structures can also be
    * passed directly into `mapData`.
    */
  var mapData: js.UndefOr[GeoJSON | TopoJSON | js.Array[SeriesMapDataOptions]] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The name of the series as shown
    * in the legend, tooltip etc.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Not available
    */
  var stack: js.UndefOr[Double | String | Unit]
  
  /**
    * Not available
    */
  var steps: Unit
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) This property is only in
    * TypeScript non-optional and might be `undefined` in series objects from
    * unknown sources.
    */
  var `type`: String | venn
  
  /**
    * Not available
    */
  var xAxis: js.UndefOr[Double | String | Unit]
  
  /**
    * Not available
    */
  var yAxis: js.UndefOr[Double | String | Unit]
}
object SeriesVennOptions {
  
  inline def apply(dataParser: Unit, dataURL: Unit, steps: Unit, `type`: String | venn): SeriesVennOptions = {
    val __obj = js.Dynamic.literal(dataParser = dataParser.asInstanceOf[js.Any], dataURL = dataURL.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesVennOptions]
  }
  
  extension [Self <: SeriesVennOptions](x: Self) {
    
    inline def setData(value: js.Array[PointOptionsObject]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataParser(value: Unit): Self = StObject.set(x, "dataParser", value.asInstanceOf[js.Any])
    
    inline def setDataURL(value: Unit): Self = StObject.set(x, "dataURL", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: PointOptionsObject*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLegendIndex(value: Double): Self = StObject.set(x, "legendIndex", value.asInstanceOf[js.Any])
    
    inline def setLegendIndexUndefined: Self = StObject.set(x, "legendIndex", js.undefined)
    
    inline def setMapData(value: GeoJSON | TopoJSON | js.Array[SeriesMapDataOptions]): Self = StObject.set(x, "mapData", value.asInstanceOf[js.Any])
    
    inline def setMapDataUndefined: Self = StObject.set(x, "mapData", js.undefined)
    
    inline def setMapDataVarargs(value: SeriesMapDataOptions*): Self = StObject.set(x, "mapData", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStack(value: Double | String | Unit): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setSteps(value: Unit): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setType(value: String | venn): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setXAxis(value: Double | String | Unit): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    inline def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
    
    inline def setYAxis(value: Double | String | Unit): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    inline def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
  }
}
