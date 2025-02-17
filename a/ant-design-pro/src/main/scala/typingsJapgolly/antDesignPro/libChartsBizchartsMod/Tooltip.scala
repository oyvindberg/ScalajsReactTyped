package typingsJapgolly.antDesignPro.libChartsBizchartsMod

import typingsJapgolly.bizcharts.libComponentsTooltipMod.ITooltip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tooltip {
  
  inline def apply(props: ITooltip): typingsJapgolly.react.mod.global.JSX.Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.react.mod.global.JSX.Element]
  
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "Tooltip")
  @js.native
  val ^ : js.Any = js.native
  
  object defaultProps {
    
    @JSImport("ant-design-pro/lib/Charts/bizcharts", "Tooltip.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ant-design-pro/lib/Charts/bizcharts", "Tooltip.defaultProps.showMarkers")
    @js.native
    def showMarkers: Boolean = js.native
    inline def showMarkers_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showMarkers")(x.asInstanceOf[js.Any])
    
    @JSImport("ant-design-pro/lib/Charts/bizcharts", "Tooltip.defaultProps.triggerOn")
    @js.native
    def triggerOn: String = js.native
    inline def triggerOn_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("triggerOn")(x.asInstanceOf[js.Any])
  }
}
