package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotScatterClusterEventsOptions extends StObject {
  
  /**
    * (Highcharts, Highmaps) Fires when the cluster point is clicked and
    * `drillToCluster` is enabled. One parameter, `event`, is passed to the
    * function. The default action is to zoom to the cluster points range. This
    * can be prevented by calling `event.preventDefault()`.
    */
  var drillToCluster: js.UndefOr[MarkerClusterDrillCallbackFunction] = js.undefined
}
object PlotScatterClusterEventsOptions {
  
  inline def apply(): PlotScatterClusterEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotScatterClusterEventsOptions]
  }
  
  extension [Self <: PlotScatterClusterEventsOptions](x: Self) {
    
    inline def setDrillToCluster(value: MarkerClusterDrillCallbackFunction): Self = StObject.set(x, "drillToCluster", value.asInstanceOf[js.Any])
    
    inline def setDrillToClusterUndefined: Self = StObject.set(x, "drillToCluster", js.undefined)
  }
}
