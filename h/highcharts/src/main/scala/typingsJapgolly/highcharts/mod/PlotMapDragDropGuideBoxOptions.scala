package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotMapDragDropGuideBoxOptions extends StObject {
  
  /**
    * (Highmaps) Style options for the guide box default state.
    */
  var default: js.UndefOr[DragDropGuideBoxOptionsObject] = js.undefined
}
object PlotMapDragDropGuideBoxOptions {
  
  inline def apply(): PlotMapDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotMapDragDropGuideBoxOptions]
  }
  
  extension [Self <: PlotMapDragDropGuideBoxOptions](x: Self) {
    
    inline def setDefault(value: DragDropGuideBoxOptionsObject): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
