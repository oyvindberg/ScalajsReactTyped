package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.EventEvent
import typingsJapgolly.baseui.anon.`6`
import typingsJapgolly.baseui.anon.`7`
import typingsJapgolly.baseui.anon.`8`
import typingsJapgolly.baseui.baseuiStrings.horizontal
import typingsJapgolly.baseui.baseuiStrings.vertical
import typingsJapgolly.baseui.datepickerStatefulDatepickerMod.Props
import typingsJapgolly.baseui.datepickerTypesMod.ContainerState
import typingsJapgolly.baseui.datepickerTypesMod.DatepickerOverrides
import typingsJapgolly.baseui.datepickerTypesMod.Density
import typingsJapgolly.baseui.datepickerTypesMod.InputRole
import typingsJapgolly.baseui.datepickerTypesMod.QuickSelectOption
import typingsJapgolly.baseui.datepickerTypesMod.RangedCalendarBehavior
import typingsJapgolly.baseui.datepickerTypesMod.StateChangeType
import typingsJapgolly.baseui.datepickerUtilsTypesMod.DateIOAdapter
import typingsJapgolly.baseui.inputTypesMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatefulDatepicker {
  
  inline def apply[T](): Builder[T] = {
    val __props = js.Dynamic.literal()
    new Builder[T](js.Array(this.component, __props.asInstanceOf[Props[T]]))
  }
  
  @JSImport("baseui/datepicker", "StatefulDatepicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.baseui.datepickerMod.StatefulDatepicker[T]] {
    
    inline def adapter(value: DateIOAdapter[T]): this.type = set("adapter", value.asInstanceOf[js.Any])
    
    inline def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `aria-describedbyNull`: this.type = set("aria-describedby", null)
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def autoFocusCalendar(value: Boolean): this.type = set("autoFocusCalendar", value.asInstanceOf[js.Any])
    
    inline def clearable(value: Boolean): this.type = set("clearable", value.asInstanceOf[js.Any])
    
    inline def dateLabel(value: T => Node): this.type = set("dateLabel", js.Any.fromFunction1(value))
    
    inline def dateLabelNull: this.type = set("dateLabel", null)
    
    inline def density(value: Density): this.type = set("density", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def displayValueAtRangeIndex(value: Double): this.type = set("displayValueAtRangeIndex", value.asInstanceOf[js.Any])
    
    inline def endDateLabel(value: String): this.type = set("endDateLabel", value.asInstanceOf[js.Any])
    
    inline def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def excludeDates(value: js.Array[T]): this.type = set("excludeDates", value.asInstanceOf[js.Any])
    
    inline def excludeDatesNull: this.type = set("excludeDates", null)
    
    inline def excludeDatesVarargs(value: T*): this.type = set("excludeDates", js.Array(value*))
    
    inline def filterDate(value: T => Boolean): this.type = set("filterDate", js.Any.fromFunction1(value))
    
    inline def filterDateNull: this.type = set("filterDate", null)
    
    inline def fixedHeight(value: Boolean): this.type = set("fixedHeight", value.asInstanceOf[js.Any])
    
    inline def formatDisplayValue(
      value: (/* date */ js.UndefOr[T | Null | (js.Array[js.UndefOr[T | Null]])], /* formatString */ String) => String
    ): this.type = set("formatDisplayValue", js.Any.fromFunction2(value))
    
    inline def formatString(value: String): this.type = set("formatString", value.asInstanceOf[js.Any])
    
    inline def hasLockedBehavior(value: Boolean): this.type = set("hasLockedBehavior", value.asInstanceOf[js.Any])
    
    inline def highlightedDate(value: T): this.type = set("highlightedDate", value.asInstanceOf[js.Any])
    
    inline def highlightedDateNull: this.type = set("highlightedDate", null)
    
    inline def includeDates(value: js.Array[T]): this.type = set("includeDates", value.asInstanceOf[js.Any])
    
    inline def includeDatesNull: this.type = set("includeDates", null)
    
    inline def includeDatesVarargs(value: T*): this.type = set("includeDates", js.Array(value*))
    
    inline def initialState(value: ContainerState[T]): this.type = set("initialState", value.asInstanceOf[js.Any])
    
    inline def locale(value: typingsJapgolly.baseui.datepickerTypesMod.Locale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def localeNull: this.type = set("locale", null)
    
    inline def mask(value: String): this.type = set("mask", value.asInstanceOf[js.Any])
    
    inline def maskNull: this.type = set("mask", null)
    
    inline def maxDate(value: T): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    inline def maxDateNull: this.type = set("maxDate", null)
    
    inline def minDate(value: T): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    inline def minDateNull: this.type = set("minDate", null)
    
    inline def monthsShown(value: Double): this.type = set("monthsShown", value.asInstanceOf[js.Any])
    
    inline def mountNode(value: HTMLElement): this.type = set("mountNode", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* a */ `7`[T] => Any): this.type = set("onChange", js.Any.fromFunction1(value))
    
    inline def onClose(value: CallbackTo[Any]): this.type = set("onClose", value.toJsFn)
    
    inline def onDayClick(value: /* a */ EventEvent[T] => Any): this.type = set("onDayClick", js.Any.fromFunction1(value))
    
    inline def onDayFocus(value: /* a */ EventEvent[T] => Any): this.type = set("onDayFocus", js.Any.fromFunction1(value))
    
    inline def onDayMouseLeave(value: /* a */ EventEvent[T] => Any): this.type = set("onDayMouseLeave", js.Any.fromFunction1(value))
    
    inline def onDayMouseOver(value: /* a */ EventEvent[T] => Any): this.type = set("onDayMouseOver", js.Any.fromFunction1(value))
    
    inline def onMonthChange(value: /* a */ `6`[T] => Any): this.type = set("onMonthChange", js.Any.fromFunction1(value))
    
    inline def onOpen(value: CallbackTo[Any]): this.type = set("onOpen", value.toJsFn)
    
    inline def onQuickSelectChange(value: /* option */ js.UndefOr[QuickSelectOption[T]] => Any): this.type = set("onQuickSelectChange", js.Any.fromFunction1(value))
    
    inline def onRangeChange(value: /* a */ `8`[T] => Any): this.type = set("onRangeChange", js.Any.fromFunction1(value))
    
    inline def onYearChange(value: /* a */ `6`[T] => Any): this.type = set("onYearChange", js.Any.fromFunction1(value))
    
    inline def orientation(value: horizontal | vertical): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    inline def overrides(value: DatepickerOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def peekNextMonth(value: Boolean): this.type = set("peekNextMonth", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def positive(value: Boolean): this.type = set("positive", value.asInstanceOf[js.Any])
    
    inline def quickSelect(value: Boolean): this.type = set("quickSelect", value.asInstanceOf[js.Any])
    
    inline def quickSelectOptions(value: js.Array[QuickSelectOption[T]]): this.type = set("quickSelectOptions", value.asInstanceOf[js.Any])
    
    inline def quickSelectOptionsVarargs(value: QuickSelectOption[T]*): this.type = set("quickSelectOptions", js.Array(value*))
    
    inline def range(value: Boolean): this.type = set("range", value.asInstanceOf[js.Any])
    
    inline def rangedCalendarBehavior(value: RangedCalendarBehavior): this.type = set("rangedCalendarBehavior", value.asInstanceOf[js.Any])
    
    inline def rangedCalendarBehaviorNull: this.type = set("rangedCalendarBehavior", null)
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def selectedInput(value: InputRole): this.type = set("selectedInput", value.asInstanceOf[js.Any])
    
    inline def selectedInputNull: this.type = set("selectedInput", null)
    
    inline def separateRangeInputs(value: Boolean): this.type = set("separateRangeInputs", value.asInstanceOf[js.Any])
    
    inline def size(value: Size): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def startDateLabel(value: String): this.type = set("startDateLabel", value.asInstanceOf[js.Any])
    
    inline def stateReducer(
      value: (/* stateType */ StateChangeType, /* nextState */ ContainerState[T], /* currentState */ ContainerState[T]) => ContainerState[T]
    ): this.type = set("stateReducer", js.Any.fromFunction3(value))
    
    inline def timeSelectEnd(value: Boolean): this.type = set("timeSelectEnd", value.asInstanceOf[js.Any])
    
    inline def timeSelectStart(value: Boolean): this.type = set("timeSelectStart", value.asInstanceOf[js.Any])
    
    inline def trapTabbing(value: Boolean): this.type = set("trapTabbing", value.asInstanceOf[js.Any])
    
    inline def value(value: T | (js.Array[js.UndefOr[T | Null]])): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueNull: this.type = set("value", null)
    
    inline def valueVarargs(value: (js.UndefOr[T | Null])*): this.type = set("value", js.Array(value*))
  }
  
  implicit def make[T](companion: StatefulDatepicker.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[T](p: Props[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
