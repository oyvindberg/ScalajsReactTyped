package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotLinearregressionslopeParamsOptions extends StObject {
  
  /**
    * (Highstock) The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be calculated
    * using Low values.
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The base period for indicator calculations. This is the
    * number of data points which are taken into account for the indicator
    * calculations.
    */
  var period: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) Unit (in milliseconds) for the x axis distances used to
    * compute the regression line paramters (slope & intercept) for every
    * range. In Highcharts Stock the x axis values are always represented in
    * milliseconds which may cause that distances between points are "big"
    * integer numbers.
    *
    * Highcharts Stock's linear regression algorithm (least squares method)
    * will utilize these "big" integers for finding the slope and the intercept
    * of the regression line for each period. In consequence, this value may be
    * a very "small" decimal number that's hard to interpret by a human.
    *
    * For instance: `xAxisUnit` equealed to `86400000` ms (1 day) forces the
    * algorithm to treat `86400000` as `1` while computing the slope and the
    * intercept. This may enchance the legiblitity of the indicator's values.
    *
    * Default value is the closest distance between two data points.
    *
    * In `v9.0.2`, the default value has been changed from `undefined` to
    * `null`.
    */
  var xAxisUnit: js.UndefOr[Double | Null] = js.undefined
}
object PlotLinearregressionslopeParamsOptions {
  
  inline def apply(): PlotLinearregressionslopeParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotLinearregressionslopeParamsOptions]
  }
  
  extension [Self <: PlotLinearregressionslopeParamsOptions](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setXAxisUnit(value: Double): Self = StObject.set(x, "xAxisUnit", value.asInstanceOf[js.Any])
    
    inline def setXAxisUnitNull: Self = StObject.set(x, "xAxisUnit", null)
    
    inline def setXAxisUnitUndefined: Self = StObject.set(x, "xAxisUnit", js.undefined)
  }
}
