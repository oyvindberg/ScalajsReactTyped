package typingsJapgolly.nivoCalendar.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLCanvasElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoCalendar.anon.OmitCalendarCanvasPropswi
import typingsJapgolly.nivoCalendar.anon.OmitDatumdatavalue
import typingsJapgolly.nivoCalendar.distTypesTypesMod.CalendarDatum
import typingsJapgolly.nivoCalendar.distTypesTypesMod.CalendarLegendProps
import typingsJapgolly.nivoCalendar.distTypesTypesMod.CalendarTooltipProps
import typingsJapgolly.nivoCalendar.distTypesTypesMod.ColorScale
import typingsJapgolly.nivoCalendar.distTypesTypesMod.DateOrString
import typingsJapgolly.nivoCalendar.distTypesTypesMod.Datum
import typingsJapgolly.nivoCalendar.nivoCalendarStrings.after
import typingsJapgolly.nivoCalendar.nivoCalendarStrings.auto
import typingsJapgolly.nivoCalendar.nivoCalendarStrings.before
import typingsJapgolly.nivoCalendar.nivoCalendarStrings.horizontal
import typingsJapgolly.nivoCalendar.nivoCalendarStrings.vertical
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.BoxAlign
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.nivoCore.mod.ValueFormat
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ResponsiveCalendarCanvas {
  
  inline def apply(data: js.Array[CalendarDatum], from: DateOrString, to: DateOrString): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[OmitCalendarCanvasPropswi]))
  }
  
  @JSImport("@nivo/calendar", "ResponsiveCalendarCanvas")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def align(value: BoxAlign): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def colorScale(value: ColorScale): this.type = set("colorScale", value.asInstanceOf[js.Any])
    
    inline def colors(value: js.Array[String]): this.type = set("colors", value.asInstanceOf[js.Any])
    
    inline def colorsVarargs(value: String*): this.type = set("colors", js.Array(value*))
    
    inline def dayBorderColor(value: String): this.type = set("dayBorderColor", value.asInstanceOf[js.Any])
    
    inline def dayBorderWidth(value: Double): this.type = set("dayBorderWidth", value.asInstanceOf[js.Any])
    
    inline def daySpacing(value: Double): this.type = set("daySpacing", value.asInstanceOf[js.Any])
    
    inline def direction(value: horizontal | vertical): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def emptyColor(value: String): this.type = set("emptyColor", value.asInstanceOf[js.Any])
    
    inline def isInteractive(value: Boolean): this.type = set("isInteractive", value.asInstanceOf[js.Any])
    
    inline def legendFormat(value: ValueFormat[Double, Unit]): this.type = set("legendFormat", value.asInstanceOf[js.Any])
    
    inline def legends(value: js.Array[CalendarLegendProps]): this.type = set("legends", value.asInstanceOf[js.Any])
    
    inline def legendsVarargs(value: CalendarLegendProps*): this.type = set("legends", js.Array(value*))
    
    inline def margin(value: Box): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def maxValue(value: auto | Double): this.type = set("maxValue", value.asInstanceOf[js.Any])
    
    inline def minValue(value: auto | Double): this.type = set("minValue", value.asInstanceOf[js.Any])
    
    inline def monthBorderColor(value: String): this.type = set("monthBorderColor", value.asInstanceOf[js.Any])
    
    inline def monthBorderWidth(value: Double): this.type = set("monthBorderWidth", value.asInstanceOf[js.Any])
    
    inline def monthLegend(value: (/* year */ Double, /* month */ Double, /* date */ js.Date) => String | Double): this.type = set("monthLegend", js.Any.fromFunction3(value))
    
    inline def monthLegendOffset(value: Double): this.type = set("monthLegendOffset", value.asInstanceOf[js.Any])
    
    inline def monthLegendPosition(value: before | after): this.type = set("monthLegendPosition", value.asInstanceOf[js.Any])
    
    inline def monthSpacing(value: Double): this.type = set("monthSpacing", value.asInstanceOf[js.Any])
    
    inline def onClick(
      value: (/* datum */ OmitDatumdatavalue | Datum, /* event */ ReactMouseEventFrom[HTMLCanvasElement]) => Callback
    ): this.type = set("onClick", js.Any.fromFunction2((t0: /* datum */ OmitDatumdatavalue | Datum, t1: /* event */ ReactMouseEventFrom[HTMLCanvasElement]) => (value(t0, t1)).runNow()))
    
    inline def onMouseEnter(
      value: (/* datum */ OmitDatumdatavalue | Datum, /* event */ ReactMouseEventFrom[HTMLCanvasElement]) => Callback
    ): this.type = set("onMouseEnter", js.Any.fromFunction2((t0: /* datum */ OmitDatumdatavalue | Datum, t1: /* event */ ReactMouseEventFrom[HTMLCanvasElement]) => (value(t0, t1)).runNow()))
    
    inline def onMouseLeave(
      value: (/* datum */ OmitDatumdatavalue | Datum, /* event */ ReactMouseEventFrom[HTMLCanvasElement]) => Callback
    ): this.type = set("onMouseLeave", js.Any.fromFunction2((t0: /* datum */ OmitDatumdatavalue | Datum, t1: /* event */ ReactMouseEventFrom[HTMLCanvasElement]) => (value(t0, t1)).runNow()))
    
    inline def onMouseMove(
      value: (/* datum */ OmitDatumdatavalue | Datum, /* event */ ReactMouseEventFrom[HTMLCanvasElement]) => Callback
    ): this.type = set("onMouseMove", js.Any.fromFunction2((t0: /* datum */ OmitDatumdatavalue | Datum, t1: /* event */ ReactMouseEventFrom[HTMLCanvasElement]) => (value(t0, t1)).runNow()))
    
    inline def pixelRatio(value: Double): this.type = set("pixelRatio", value.asInstanceOf[js.Any])
    
    inline def renderWrapper(value: Boolean): this.type = set("renderWrapper", value.asInstanceOf[js.Any])
    
    inline def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def tooltip(value: FC[CalendarTooltipProps]): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    inline def valueFormat(value: ValueFormat[Double, Unit]): this.type = set("valueFormat", value.asInstanceOf[js.Any])
    
    inline def yearLegend(value: /* year */ Double => String | Double): this.type = set("yearLegend", js.Any.fromFunction1(value))
    
    inline def yearLegendOffset(value: Double): this.type = set("yearLegendOffset", value.asInstanceOf[js.Any])
    
    inline def yearLegendPosition(value: before | after): this.type = set("yearLegendPosition", value.asInstanceOf[js.Any])
    
    inline def yearSpacing(value: Double): this.type = set("yearSpacing", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: OmitCalendarCanvasPropswi): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
