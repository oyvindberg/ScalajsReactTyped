package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotColumnpyramidOnPointConnectorOptions extends StObject {
  
  /**
    * (Highcharts, Highstock) A name for the dash style to use for the
    * connector.
    */
  var dashstyle: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock) Color of the connector line. By default it's the
    * series' color.
    */
  var stroke: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock) Pixel width of the connector line.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object PlotColumnpyramidOnPointConnectorOptions {
  
  inline def apply(): PlotColumnpyramidOnPointConnectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotColumnpyramidOnPointConnectorOptions]
  }
  
  extension [Self <: PlotColumnpyramidOnPointConnectorOptions](x: Self) {
    
    inline def setDashstyle(value: String): Self = StObject.set(x, "dashstyle", value.asInstanceOf[js.Any])
    
    inline def setDashstyleUndefined: Self = StObject.set(x, "dashstyle", js.undefined)
    
    inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
