package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesZonesOptionsObject extends StObject {
  
  /**
    * (Highcharts, Highstock) Styled mode only. A custom class name for the
    * zone.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock) Defines the color of the series.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highcharts, Highstock) A name for the dash style to use for the graph.
    */
  var dashStyle: js.UndefOr[DashStyleValue] = js.undefined
  
  /**
    * (Highcharts, Highstock) Defines the fill color for the series (in area
    * type series)
    */
  var fillColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highcharts, Highstock) The value up to where the zone extends, if
    * undefined the zones stretches to the last value in the series.
    */
  var value: js.UndefOr[Double] = js.undefined
}
object SeriesZonesOptionsObject {
  
  inline def apply(): SeriesZonesOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesZonesOptionsObject]
  }
  
  extension [Self <: SeriesZonesOptionsObject](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDashStyle(value: DashStyleValue): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    inline def setFillColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
