package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesLineDataDataLabelsAnimationOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Gantt) The animation delay time in milliseconds.
    * Set to `0` renders dataLabel immediately. As `undefined` inherits defer
    * time from the series.animation.defer.
    */
  var defer: js.UndefOr[Double] = js.undefined
}
object SeriesLineDataDataLabelsAnimationOptions {
  
  inline def apply(): SeriesLineDataDataLabelsAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesLineDataDataLabelsAnimationOptions]
  }
  
  extension [Self <: SeriesLineDataDataLabelsAnimationOptions](x: Self) {
    
    inline def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
