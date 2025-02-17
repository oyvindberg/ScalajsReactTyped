package typingsJapgolly.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockChartPdfMargin extends StObject {
  
  var bottom: js.UndefOr[Double | String] = js.undefined
  
  var left: js.UndefOr[Double | String] = js.undefined
  
  var right: js.UndefOr[Double | String] = js.undefined
  
  var top: js.UndefOr[Double | String] = js.undefined
}
object StockChartPdfMargin {
  
  inline def apply(): StockChartPdfMargin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartPdfMargin]
  }
  
  extension [Self <: StockChartPdfMargin](x: Self) {
    
    inline def setBottom(value: Double | String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setLeft(value: Double | String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRight(value: Double | String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setTop(value: Double | String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
