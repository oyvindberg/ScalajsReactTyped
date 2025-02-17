package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XAxisGridOptions extends StObject {
  
  /**
    * (Gantt) Set border color for the label grid lines.
    */
  var borderColor: js.UndefOr[ColorString] = js.undefined
  
  /**
    * (Gantt) Set border width of the label grid lines.
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Gantt) Set cell height for grid axis labels. By default this is
    * calculated from font size. This option only applies to horizontal axes.
    */
  var cellHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * (Gantt) Set specific options for each column (or row for horizontal axes)
    * in the grid. Each extra column/row is its own axis, and the axis options
    * can be set here.
    */
  var columns: js.UndefOr[js.Array[XAxisOptions]] = js.undefined
  
  /**
    * (Gantt) Enable grid on the axis labels. Defaults to true for Gantt
    * charts.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object XAxisGridOptions {
  
  inline def apply(): XAxisGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XAxisGridOptions]
  }
  
  extension [Self <: XAxisGridOptions](x: Self) {
    
    inline def setBorderColor(value: ColorString): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setCellHeight(value: Double): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
    
    inline def setCellHeightUndefined: Self = StObject.set(x, "cellHeight", js.undefined)
    
    inline def setColumns(value: js.Array[XAxisOptions]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: XAxisOptions*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
