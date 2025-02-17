package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgDataChartCrosshairPoint
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * The x coordinate.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * The y coordinate.
    */
  var y: js.UndefOr[Double] = js.undefined
}
object IgDataChartCrosshairPoint {
  
  inline def apply(): IgDataChartCrosshairPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgDataChartCrosshairPoint]
  }
  
  extension [Self <: IgDataChartCrosshairPoint](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
