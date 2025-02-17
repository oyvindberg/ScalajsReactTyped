package typingsJapgolly.blueprintjsDatetime.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.libEsmCommonBoundaryMod.Boundary
import typingsJapgolly.blueprintjsDatetime.libEsmCommonDateRangeMod.DateRange
import typingsJapgolly.blueprintjsDatetime.libEsmDatePickerCoreMod.DatePickerModifiers
import typingsJapgolly.blueprintjsDatetime.libEsmDateRangePickerMod.IDateRangePickerProps
import typingsJapgolly.blueprintjsDatetime.libEsmShortcutsMod.DateRangeShortcut
import typingsJapgolly.blueprintjsDatetime.libEsmTimePickerMod.TimePickerProps
import typingsJapgolly.blueprintjsDatetime.libEsmTimePickerMod.TimePrecision
import typingsJapgolly.reactDayPicker.mod.DayPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DateRangePicker {
  
  @JSImport("@blueprintjs/datetime", "DateRangePicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsDatetime.mod.DateRangePicker] {
    
    inline def allowSingleDayRange(value: Boolean): this.type = set("allowSingleDayRange", value.asInstanceOf[js.Any])
    
    inline def boundaryToModify(value: Boundary): this.type = set("boundaryToModify", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def contiguousCalendarMonths(value: Boolean): this.type = set("contiguousCalendarMonths", value.asInstanceOf[js.Any])
    
    inline def dayPickerProps(value: DayPickerProps): this.type = set("dayPickerProps", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: DateRange): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def footerElement(value: VdomElement): this.type = set("footerElement", value.rawElement.asInstanceOf[js.Any])
    
    inline def highlightCurrentDay(value: Boolean): this.type = set("highlightCurrentDay", value.asInstanceOf[js.Any])
    
    inline def initialMonth(value: js.Date): this.type = set("initialMonth", value.asInstanceOf[js.Any])
    
    inline def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def localeUtils(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ Any): this.type = set("localeUtils", value.asInstanceOf[js.Any])
    
    inline def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    inline def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    inline def modifiers(value: DatePickerModifiers): this.type = set("modifiers", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* selectedDates */ DateRange => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* selectedDates */ DateRange) => value(t0).runNow()))
    
    inline def onHoverChange(
      value: (/* hoveredDates */ DateRange, /* hoveredDay */ js.Date, /* hoveredBoundary */ Boundary) => Callback
    ): this.type = set("onHoverChange", js.Any.fromFunction3((t0: /* hoveredDates */ DateRange, t1: /* hoveredDay */ js.Date, t2: /* hoveredBoundary */ Boundary) => (value(t0, t1, t2)).runNow()))
    
    inline def onShortcutChange(value: (/* shortcut */ DateRangeShortcut, /* index */ Double) => Callback): this.type = set("onShortcutChange", js.Any.fromFunction2((t0: /* shortcut */ DateRangeShortcut, t1: /* index */ Double) => (value(t0, t1)).runNow()))
    
    inline def reverseMonthAndYearMenus(value: Boolean): this.type = set("reverseMonthAndYearMenus", value.asInstanceOf[js.Any])
    
    inline def selectedShortcutIndex(value: Double): this.type = set("selectedShortcutIndex", value.asInstanceOf[js.Any])
    
    inline def shortcuts(value: Boolean | js.Array[DateRangeShortcut]): this.type = set("shortcuts", value.asInstanceOf[js.Any])
    
    inline def shortcutsVarargs(value: DateRangeShortcut*): this.type = set("shortcuts", js.Array(value*))
    
    inline def singleMonthOnly(value: Boolean): this.type = set("singleMonthOnly", value.asInstanceOf[js.Any])
    
    inline def timePickerProps(value: TimePickerProps): this.type = set("timePickerProps", value.asInstanceOf[js.Any])
    
    inline def timePrecision(value: TimePrecision): this.type = set("timePrecision", value.asInstanceOf[js.Any])
    
    inline def value(value: DateRange): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DateRangePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IDateRangePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
