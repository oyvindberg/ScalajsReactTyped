package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotSplineOnPointOptions extends StObject {
  
  /**
    * (Highcharts, Highstock) Options for the connector in the _Series on
    * point_ feature.
    *
    * In styled mode, the connector can be styled with the
    * `.highcharts-connector-seriesonpoint` class name.
    */
  var connectorOptions: js.UndefOr[PlotSplineOnPointConnectorOptions | SVGAttributes] = js.undefined
  
  /**
    * (Highcharts, Highstock) The `id` of the point that we connect the series
    * to. Only points with a given `plotX` and `plotY` values and map points
    * are valid.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock) Options allowing to set a position and an offset
    * of the series in the _Series on point_ feature.
    */
  var position: js.UndefOr[js.Object | PlotSplineOnPointPositionOptions] = js.undefined
}
object PlotSplineOnPointOptions {
  
  inline def apply(): PlotSplineOnPointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSplineOnPointOptions]
  }
  
  extension [Self <: PlotSplineOnPointOptions](x: Self) {
    
    inline def setConnectorOptions(value: PlotSplineOnPointConnectorOptions | SVGAttributes): Self = StObject.set(x, "connectorOptions", value.asInstanceOf[js.Any])
    
    inline def setConnectorOptionsUndefined: Self = StObject.set(x, "connectorOptions", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPosition(value: js.Object | PlotSplineOnPointPositionOptions): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
