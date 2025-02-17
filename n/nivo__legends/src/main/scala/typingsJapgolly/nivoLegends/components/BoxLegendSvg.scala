package typingsJapgolly.nivoLegends.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.SVGRectElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoLegends.anon.PartialRecordtoprightbott
import typingsJapgolly.nivoLegends.distTypesSvgSymbolsTypesMod.SymbolProps
import typingsJapgolly.nivoLegends.distTypesTypesMod.BoxLegendSvgProps
import typingsJapgolly.nivoLegends.distTypesTypesMod.Datum
import typingsJapgolly.nivoLegends.distTypesTypesMod.EffectProps
import typingsJapgolly.nivoLegends.distTypesTypesMod.LegendAnchor
import typingsJapgolly.nivoLegends.distTypesTypesMod.LegendDirection
import typingsJapgolly.nivoLegends.distTypesTypesMod.LegendItemDirection
import typingsJapgolly.nivoLegends.distTypesTypesMod.SymbolShape
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BoxLegendSvg {
  
  inline def apply(
    anchor: LegendAnchor,
    containerHeight: Double,
    containerWidth: Double,
    data: js.UndefOr[js.Array[Datum]] & js.Array[Datum],
    direction: LegendDirection,
    itemHeight: Double,
    itemWidth: Double
  ): Builder = {
    val __props = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], itemHeight = itemHeight.asInstanceOf[js.Any], itemWidth = itemWidth.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BoxLegendSvgProps]))
  }
  
  @JSImport("@nivo/legends", "BoxLegendSvg")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def effects(value: js.Array[EffectProps]): this.type = set("effects", value.asInstanceOf[js.Any])
    
    inline def effectsVarargs(value: EffectProps*): this.type = set("effects", js.Array(value*))
    
    inline def itemBackground(value: String): this.type = set("itemBackground", value.asInstanceOf[js.Any])
    
    inline def itemDirection(value: LegendItemDirection): this.type = set("itemDirection", value.asInstanceOf[js.Any])
    
    inline def itemOpacity(value: Double): this.type = set("itemOpacity", value.asInstanceOf[js.Any])
    
    inline def itemTextColor(value: String): this.type = set("itemTextColor", value.asInstanceOf[js.Any])
    
    inline def itemsSpacing(value: Double): this.type = set("itemsSpacing", value.asInstanceOf[js.Any])
    
    inline def justify(value: Boolean): this.type = set("justify", value.asInstanceOf[js.Any])
    
    inline def onClick(value: (/* datum */ Datum, /* event */ ReactMouseEventFrom[SVGRectElement]) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: /* datum */ Datum, t1: /* event */ ReactMouseEventFrom[SVGRectElement]) => (value(t0, t1)).runNow()))
    
    inline def onMouseEnter(value: (/* datum */ Datum, /* event */ ReactMouseEventFrom[SVGRectElement]) => Callback): this.type = set("onMouseEnter", js.Any.fromFunction2((t0: /* datum */ Datum, t1: /* event */ ReactMouseEventFrom[SVGRectElement]) => (value(t0, t1)).runNow()))
    
    inline def onMouseLeave(value: (/* datum */ Datum, /* event */ ReactMouseEventFrom[SVGRectElement]) => Callback): this.type = set("onMouseLeave", js.Any.fromFunction2((t0: /* datum */ Datum, t1: /* event */ ReactMouseEventFrom[SVGRectElement]) => (value(t0, t1)).runNow()))
    
    inline def padding(value: Double | PartialRecordtoprightbott): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def symbolBorderColor(value: String): this.type = set("symbolBorderColor", value.asInstanceOf[js.Any])
    
    inline def symbolBorderWidth(value: Double): this.type = set("symbolBorderWidth", value.asInstanceOf[js.Any])
    
    inline def symbolShape(value: SymbolShape | FC[SymbolProps]): this.type = set("symbolShape", value.asInstanceOf[js.Any])
    
    inline def symbolSize(value: Double): this.type = set("symbolSize", value.asInstanceOf[js.Any])
    
    inline def symbolSpacing(value: Double): this.type = set("symbolSpacing", value.asInstanceOf[js.Any])
    
    inline def toggleSerie(value: Boolean | (js.Function1[/* id */ String | Double, Unit])): this.type = set("toggleSerie", value.asInstanceOf[js.Any])
    
    inline def toggleSerieFunction1(value: /* id */ String | Double => Callback): this.type = set("toggleSerie", js.Any.fromFunction1((t0: /* id */ String | Double) => value(t0).runNow()))
    
    inline def translateX(value: Double): this.type = set("translateX", value.asInstanceOf[js.Any])
    
    inline def translateY(value: Double): this.type = set("translateY", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BoxLegendSvgProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
