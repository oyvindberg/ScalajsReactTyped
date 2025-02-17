package typingsJapgolly.reactEasyChart.components

import org.scalajs.dom.MouseEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactEasyChart.anon.Key
import typingsJapgolly.reactEasyChart.mod.PieChartProps
import typingsJapgolly.reactEasyChart.mod.PieData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PieChart {
  
  inline def apply(data: js.Array[Key]): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PieChartProps]))
  }
  
  @JSImport("react-easy-chart", "PieChart")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactEasyChart.mod.PieChart] {
    
    inline def clickHandler(value: (/* data */ PieData, /* mouseEvent */ MouseEvent) => Any): this.type = set("clickHandler", js.Any.fromFunction2(value))
    
    inline def innerHoleSize(value: Double): this.type = set("innerHoleSize", value.asInstanceOf[js.Any])
    
    inline def labels(value: Boolean): this.type = set("labels", value.asInstanceOf[js.Any])
    
    inline def mouseMoveHandler(value: (/* data */ PieData, /* mouseEvent */ MouseEvent) => Any): this.type = set("mouseMoveHandler", js.Any.fromFunction2(value))
    
    inline def mouseOutHandler(value: (/* data */ PieData, /* mouseEvent */ MouseEvent) => Any): this.type = set("mouseOutHandler", js.Any.fromFunction2(value))
    
    inline def mouseOverHandler(value: (/* data */ PieData, /* mouseEvent */ MouseEvent) => Any): this.type = set("mouseOverHandler", js.Any.fromFunction2(value))
    
    inline def padding(value: Double): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PieChartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
