package typingsJapgolly.rcPicker

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.rcPicker.esGenerateMod.GenerateConfig
import typingsJapgolly.rcPicker.esInterfaceMod.Components
import typingsJapgolly.rcPicker.esInterfaceMod.CustomFormat
import typingsJapgolly.rcPicker.esInterfaceMod.DisabledTimes
import typingsJapgolly.rcPicker.esInterfaceMod.EventValue
import typingsJapgolly.rcPicker.esInterfaceMod.Locale
import typingsJapgolly.rcPicker.esInterfaceMod.PanelMode
import typingsJapgolly.rcPicker.esInterfaceMod.PickerMode
import typingsJapgolly.rcPicker.esInterfaceMod.RangeValue
import typingsJapgolly.rcPicker.esPanelsMonthPanelMonthBodyMod.MonthCellRender
import typingsJapgolly.rcPicker.esPickerMod.PickerRefConfig
import typingsJapgolly.rcPicker.rcPickerInts.`0`
import typingsJapgolly.rcPicker.rcPickerInts.`1`
import typingsJapgolly.rcPicker.rcPickerStrings.`additions removals`
import typingsJapgolly.rcPicker.rcPickerStrings.`additions text`
import typingsJapgolly.rcPicker.rcPickerStrings.`inline`
import typingsJapgolly.rcPicker.rcPickerStrings.`removals additions`
import typingsJapgolly.rcPicker.rcPickerStrings.`removals text`
import typingsJapgolly.rcPicker.rcPickerStrings.`text additions`
import typingsJapgolly.rcPicker.rcPickerStrings.`text removals`
import typingsJapgolly.rcPicker.rcPickerStrings.additions
import typingsJapgolly.rcPicker.rcPickerStrings.all
import typingsJapgolly.rcPicker.rcPickerStrings.ascending
import typingsJapgolly.rcPicker.rcPickerStrings.assertive
import typingsJapgolly.rcPicker.rcPickerStrings.both
import typingsJapgolly.rcPicker.rcPickerStrings.copy
import typingsJapgolly.rcPicker.rcPickerStrings.date
import typingsJapgolly.rcPicker.rcPickerStrings.dateRender
import typingsJapgolly.rcPicker.rcPickerStrings.defaultPickerValue
import typingsJapgolly.rcPicker.rcPickerStrings.defaultValue
import typingsJapgolly.rcPicker.rcPickerStrings.descending
import typingsJapgolly.rcPicker.rcPickerStrings.dialog
import typingsJapgolly.rcPicker.rcPickerStrings.disabled
import typingsJapgolly.rcPicker.rcPickerStrings.disabledTime
import typingsJapgolly.rcPicker.rcPickerStrings.execute
import typingsJapgolly.rcPicker.rcPickerStrings.grammar
import typingsJapgolly.rcPicker.rcPickerStrings.grid
import typingsJapgolly.rcPicker.rcPickerStrings.horizontal
import typingsJapgolly.rcPicker.rcPickerStrings.link
import typingsJapgolly.rcPicker.rcPickerStrings.list
import typingsJapgolly.rcPicker.rcPickerStrings.listbox
import typingsJapgolly.rcPicker.rcPickerStrings.location
import typingsJapgolly.rcPicker.rcPickerStrings.ltr
import typingsJapgolly.rcPicker.rcPickerStrings.menu
import typingsJapgolly.rcPicker.rcPickerStrings.mixed
import typingsJapgolly.rcPicker.rcPickerStrings.mode
import typingsJapgolly.rcPicker.rcPickerStrings.move
import typingsJapgolly.rcPicker.rcPickerStrings.none
import typingsJapgolly.rcPicker.rcPickerStrings.off
import typingsJapgolly.rcPicker.rcPickerStrings.onChange
import typingsJapgolly.rcPicker.rcPickerStrings.onOk
import typingsJapgolly.rcPicker.rcPickerStrings.onPanelChange
import typingsJapgolly.rcPicker.rcPickerStrings.onPickerValueChange
import typingsJapgolly.rcPicker.rcPickerStrings.onSelect
import typingsJapgolly.rcPicker.rcPickerStrings.other
import typingsJapgolly.rcPicker.rcPickerStrings.page
import typingsJapgolly.rcPicker.rcPickerStrings.pickerValue
import typingsJapgolly.rcPicker.rcPickerStrings.placeholder
import typingsJapgolly.rcPicker.rcPickerStrings.polite
import typingsJapgolly.rcPicker.rcPickerStrings.popup
import typingsJapgolly.rcPicker.rcPickerStrings.removals
import typingsJapgolly.rcPicker.rcPickerStrings.rtl
import typingsJapgolly.rcPicker.rcPickerStrings.showTime
import typingsJapgolly.rcPicker.rcPickerStrings.showToday
import typingsJapgolly.rcPicker.rcPickerStrings.spelling
import typingsJapgolly.rcPicker.rcPickerStrings.step
import typingsJapgolly.rcPicker.rcPickerStrings.text
import typingsJapgolly.rcPicker.rcPickerStrings.time
import typingsJapgolly.rcPicker.rcPickerStrings.tree
import typingsJapgolly.rcPicker.rcPickerStrings.value
import typingsJapgolly.rcPicker.rcPickerStrings.vertical
import typingsJapgolly.rcTrigger.esInterfaceMod.AlignType
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.InputHTMLAttributes
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esRangePickerMod {
  
  @JSImport("rc-picker/es/RangePicker", JSImport.Default)
  @js.native
  open class default[DateType] () extends RangePicker[DateType]
  
  type OmitPickerProps[Props] = Omit[
    Props, 
    value | defaultValue | defaultPickerValue | placeholder | disabled | disabledTime | showToday | showTime | mode | onChange | onSelect | onPanelChange | pickerValue | onPickerValueChange | onOk | dateRender
  ]
  
  type RangeDateRender[DateType] = js.Function3[/* currentDate */ DateType, /* today */ DateType, /* info */ RangeInfo, Node]
  
  trait RangeInfo extends StObject {
    
    var range: RangeType
  }
  object RangeInfo {
    
    inline def apply(range: RangeType): RangeInfo = {
      val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangeInfo]
    }
    
    extension [Self <: RangeInfo](x: Self) {
      
      inline def setRange(value: RangeType): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RangePicker[DateType]
    extends Component[RangePickerProps[DateType], js.Object, Any] {
    
    def blur(): Unit = js.native
    
    def focus(): Unit = js.native
    
    var pickerRef: RefHandle[PickerRefConfig] = js.native
  }
  
  /* Inlined {} & rc-picker.rc-picker/es/RangePicker.RangePickerSharedProps<DateType> & rc-picker.rc-picker/es/RangePicker.OmitPickerProps<rc-picker.rc-picker/es/Picker.PickerBaseProps<DateType>> */
  trait RangePickerBaseProps[DateType]
    extends StObject
       with RangePickerProps[DateType] {
    
    /** @private Internal control of active picker. Do not use since it's private usage */
    var activePickerIndex: js.UndefOr[`0` | `1`] = js.undefined
    
    var allowClear: js.UndefOr[Boolean] = js.undefined
    
    var allowEmpty: js.UndefOr[js.Tuple2[Boolean, Boolean]] = js.undefined
    
    var `aria-activedescendant`: js.UndefOr[String] = js.undefined
    
    var `aria-atomic`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
    
    var `aria-busy`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
    
    var `aria-colcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-colindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-colspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-controls`: js.UndefOr[String] = js.undefined
    
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `aria-details`: js.UndefOr[String] = js.undefined
    
    var `aria-disabled`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
    
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    var `aria-expanded`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-flowto`: js.UndefOr[String] = js.undefined
    
    var `aria-grabbed`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
    
    var `aria-hidden`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    var `aria-level`: js.UndefOr[Double] = js.undefined
    
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
    
    var `aria-modal`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-multiline`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-multiselectable`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
    
    var `aria-owns`: js.UndefOr[String] = js.undefined
    
    var `aria-placeholder`: js.UndefOr[String] = js.undefined
    
    var `aria-posinset`: js.UndefOr[Double] = js.undefined
    
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
    
    var `aria-readonly`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.undefined
    
    var `aria-required`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-roledescription`: js.UndefOr[String] = js.undefined
    
    var `aria-rowcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-selected`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-setsize`: js.UndefOr[Double] = js.undefined
    
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
    
    var `aria-valuemax`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuemin`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuenow`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuetext`: js.UndefOr[String] = js.undefined
    
    var autoComplete: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var clearIcon: js.UndefOr[Node] = js.undefined
    
    var components: js.UndefOr[Components] = js.undefined
    
    var dateRender: js.UndefOr[RangeDateRender[DateType]] = js.undefined
    
    var defaultOpen: js.UndefOr[Boolean] = js.undefined
    
    var defaultPickerValue: js.UndefOr[js.Tuple2[DateType, DateType]] = js.undefined
    
    var defaultValue: js.UndefOr[RangeValue[DateType]] = js.undefined
    
    var direction: js.UndefOr[ltr | rtl] = js.undefined
    
    var disabled: js.UndefOr[Boolean | (js.Tuple2[Boolean, Boolean])] = js.undefined
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.undefined
    
    var disabledTime: js.UndefOr[
        js.Function2[/* date */ EventValue[DateType], /* type */ RangeType, DisabledTimes]
      ] = js.undefined
    
    var dropdownAlign: js.UndefOr[AlignType] = js.undefined
    
    var dropdownClassName: js.UndefOr[String] = js.undefined
    
    var format: js.UndefOr[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])] = js.undefined
    
    var generateConfig: GenerateConfig[DateType]
    
    var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inputReadOnly: js.UndefOr[Boolean] = js.undefined
    
    var inputRender: js.UndefOr[js.Function1[/* props */ InputHTMLAttributes[HTMLInputElement], Node]] = js.undefined
    
    var locale: Locale
    
    var mode: js.UndefOr[js.Tuple2[PanelMode, PanelMode]] = js.undefined
    
    var monthCellRender: js.UndefOr[MonthCellRender[DateType]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var nextIcon: js.UndefOr[Node] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onCalendarChange: js.UndefOr[
        js.Function3[
          /* values */ RangeValue[DateType], 
          /* formatString */ js.Tuple2[String, String], 
          /* info */ RangeInfo, 
          Unit
        ]
      ] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function2[
          /* values */ RangeValue[DateType], 
          /* formatString */ js.Tuple2[String, String], 
          Unit
        ]
      ] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[
        js.Function2[
          /* event */ ReactKeyboardEventFrom[HTMLInputElement], 
          /* preventDefault */ js.Function0[Unit], 
          Unit
        ]
      ] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onOk: js.UndefOr[js.Function1[/* dates */ RangeValue[DateType], Unit]] = js.undefined
    
    var onOpenChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.undefined
    
    var onPanelChange: js.UndefOr[
        js.Function2[/* values */ RangeValue[DateType], /* modes */ js.Tuple2[PanelMode, PanelMode], Unit]
      ] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var panelRender: js.UndefOr[js.Function1[/* originPanel */ Node, Node]] = js.undefined
    
    var picker: Exclude[PickerMode, date | time]
    
    var pickerRef: js.UndefOr[MutableRefObject[PickerRefConfig]] = js.undefined
    
    var placeholder: js.UndefOr[js.Tuple2[String, String]] = js.undefined
    
    var popupStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var prevIcon: js.UndefOr[Node] = js.undefined
    
    var ranges: js.UndefOr[
        Record[
          String, 
          (Exclude[RangeValue[DateType], Null]) | (js.Function0[Exclude[RangeValue[DateType], Null]])
        ]
      ] = js.undefined
    
    var renderExtraFooter: js.UndefOr[js.Function1[/* mode */ PanelMode, Node]] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var separator: js.UndefOr[Node] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var suffixIcon: js.UndefOr[Node] = js.undefined
    
    var superNextIcon: js.UndefOr[Node] = js.undefined
    
    var superPrevIcon: js.UndefOr[Node] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var transitionName: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[RangeValue[DateType]] = js.undefined
  }
  object RangePickerBaseProps {
    
    inline def apply[DateType](generateConfig: GenerateConfig[DateType], locale: Locale, picker: Exclude[PickerMode, date | time]): RangePickerBaseProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangePickerBaseProps[DateType]]
    }
    
    extension [Self <: RangePickerBaseProps[?], DateType](x: Self & RangePickerBaseProps[DateType]) {
      
      inline def setActivePickerIndex(value: `0` | `1`): Self = StObject.set(x, "activePickerIndex", value.asInstanceOf[js.Any])
      
      inline def setActivePickerIndexUndefined: Self = StObject.set(x, "activePickerIndex", js.undefined)
      
      inline def setAllowClear(value: Boolean): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
      
      inline def setAllowClearUndefined: Self = StObject.set(x, "allowClear", js.undefined)
      
      inline def setAllowEmpty(value: js.Tuple2[Boolean, Boolean]): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-atomic`(value: Booleanish): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      inline def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-busy`(value: Booleanish): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      inline def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      inline def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      inline def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      inline def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      inline def `setAria-disabled`(value: Booleanish): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      inline def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-expanded`(value: Booleanish): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      inline def `setAria-grabbed`(value: Booleanish): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      inline def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-hidden`(value: Booleanish): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      inline def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      inline def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      inline def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      inline def `setAria-modal`(value: Booleanish): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      inline def `setAria-multiline`(value: Booleanish): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      inline def `setAria-multiselectable`(value: Booleanish): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      inline def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      inline def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      inline def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      inline def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      inline def `setAria-readonly`(value: Booleanish): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      inline def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      inline def `setAria-required`(value: Booleanish): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      inline def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      inline def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      inline def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      inline def `setAria-selected`(value: Booleanish): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      inline def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      inline def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      inline def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      inline def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      inline def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClearIcon(value: VdomNode): Self = StObject.set(x, "clearIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setClearIconNull: Self = StObject.set(x, "clearIcon", null)
      
      inline def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
      
      inline def setClearIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "clearIcon", js.Array(value*))
      
      inline def setClearIconVdomElement(value: VdomElement): Self = StObject.set(x, "clearIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setComponents(value: Components): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setDateRender(value: (DateType, DateType, /* info */ RangeInfo) => Node): Self = StObject.set(x, "dateRender", js.Any.fromFunction3(value))
      
      inline def setDateRenderUndefined: Self = StObject.set(x, "dateRender", js.undefined)
      
      inline def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      inline def setDefaultPickerValue(value: js.Tuple2[DateType, DateType]): Self = StObject.set(x, "defaultPickerValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultPickerValueUndefined: Self = StObject.set(x, "defaultPickerValue", js.undefined)
      
      inline def setDefaultValue(value: RangeValue[DateType]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabled(value: Boolean | (js.Tuple2[Boolean, Boolean])): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledDate(value: /* date */ DateType => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      inline def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      inline def setDisabledTime(value: (/* date */ EventValue[DateType], /* type */ RangeType) => DisabledTimes): Self = StObject.set(x, "disabledTime", js.Any.fromFunction2(value))
      
      inline def setDisabledTimeUndefined: Self = StObject.set(x, "disabledTime", js.undefined)
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDropdownAlign(value: AlignType): Self = StObject.set(x, "dropdownAlign", value.asInstanceOf[js.Any])
      
      inline def setDropdownAlignUndefined: Self = StObject.set(x, "dropdownAlign", js.undefined)
      
      inline def setDropdownClassName(value: String): Self = StObject.set(x, "dropdownClassName", value.asInstanceOf[js.Any])
      
      inline def setDropdownClassNameUndefined: Self = StObject.set(x, "dropdownClassName", js.undefined)
      
      inline def setFormat(value: String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatFunction1(value: DateType => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setFormatVarargs(value: (String | CustomFormat[DateType])*): Self = StObject.set(x, "format", js.Array(value*))
      
      inline def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      inline def setGetPopupContainer(value: /* node */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      inline def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInputReadOnly(value: Boolean): Self = StObject.set(x, "inputReadOnly", value.asInstanceOf[js.Any])
      
      inline def setInputReadOnlyUndefined: Self = StObject.set(x, "inputReadOnly", js.undefined)
      
      inline def setInputRender(value: /* props */ InputHTMLAttributes[HTMLInputElement] => Node): Self = StObject.set(x, "inputRender", js.Any.fromFunction1(value))
      
      inline def setInputRenderUndefined: Self = StObject.set(x, "inputRender", js.undefined)
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setMode(value: js.Tuple2[PanelMode, PanelMode]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMonthCellRender(value: (DateType, /* locale */ Locale) => Node): Self = StObject.set(x, "monthCellRender", js.Any.fromFunction2(value))
      
      inline def setMonthCellRenderUndefined: Self = StObject.set(x, "monthCellRender", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNextIcon(value: VdomNode): Self = StObject.set(x, "nextIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setNextIconNull: Self = StObject.set(x, "nextIcon", null)
      
      inline def setNextIconUndefined: Self = StObject.set(x, "nextIcon", js.undefined)
      
      inline def setNextIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "nextIcon", js.Array(value*))
      
      inline def setNextIconVdomElement(value: VdomElement): Self = StObject.set(x, "nextIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCalendarChange(
        value: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String], /* info */ RangeInfo) => Callback
      ): Self = StObject.set(x, "onCalendarChange", js.Any.fromFunction3((t0: /* values */ RangeValue[DateType], t1: /* formatString */ js.Tuple2[String, String], t2: /* info */ RangeInfo) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnCalendarChangeUndefined: Self = StObject.set(x, "onCalendarChange", js.undefined)
      
      inline def setOnChange(
        value: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String]) => Callback
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* values */ RangeValue[DateType], t1: /* formatString */ js.Tuple2[String, String]) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnContextMenu(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnFocus(value: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(
        value: (/* event */ ReactKeyboardEventFrom[HTMLInputElement], /* preventDefault */ js.Function0[Unit]) => Callback
      ): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction2((t0: /* event */ ReactKeyboardEventFrom[HTMLInputElement], t1: /* preventDefault */ js.Function0[Unit]) => (value(t0, t1)).runNow()))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnMouseDown(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseUp(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnOk(value: /* dates */ RangeValue[DateType] => Callback): Self = StObject.set(x, "onOk", js.Any.fromFunction1((t0: /* dates */ RangeValue[DateType]) => value(t0).runNow()))
      
      inline def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      inline def setOnOpenChange(value: /* open */ Boolean => Callback): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction1((t0: /* open */ Boolean) => value(t0).runNow()))
      
      inline def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      inline def setOnPanelChange(
        value: (/* values */ RangeValue[DateType], /* modes */ js.Tuple2[PanelMode, PanelMode]) => Callback
      ): Self = StObject.set(x, "onPanelChange", js.Any.fromFunction2((t0: /* values */ RangeValue[DateType], t1: /* modes */ js.Tuple2[PanelMode, PanelMode]) => (value(t0, t1)).runNow()))
      
      inline def setOnPanelChangeUndefined: Self = StObject.set(x, "onPanelChange", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPanelRender(value: /* originPanel */ Node => Node): Self = StObject.set(x, "panelRender", js.Any.fromFunction1(value))
      
      inline def setPanelRenderUndefined: Self = StObject.set(x, "panelRender", js.undefined)
      
      inline def setPicker(value: Exclude[PickerMode, date | time]): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      inline def setPickerRef(value: MutableRefObject[PickerRefConfig]): Self = StObject.set(x, "pickerRef", value.asInstanceOf[js.Any])
      
      inline def setPickerRefUndefined: Self = StObject.set(x, "pickerRef", js.undefined)
      
      inline def setPlaceholder(value: js.Tuple2[String, String]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPopupStyle(value: CSSProperties): Self = StObject.set(x, "popupStyle", value.asInstanceOf[js.Any])
      
      inline def setPopupStyleUndefined: Self = StObject.set(x, "popupStyle", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setPrevIcon(value: VdomNode): Self = StObject.set(x, "prevIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setPrevIconNull: Self = StObject.set(x, "prevIcon", null)
      
      inline def setPrevIconUndefined: Self = StObject.set(x, "prevIcon", js.undefined)
      
      inline def setPrevIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "prevIcon", js.Array(value*))
      
      inline def setPrevIconVdomElement(value: VdomElement): Self = StObject.set(x, "prevIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRanges(
        value: Record[
              String, 
              (Exclude[RangeValue[DateType], Null]) | (js.Function0[Exclude[RangeValue[DateType], Null]])
            ]
      ): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      inline def setRenderExtraFooter(value: /* mode */ PanelMode => Node): Self = StObject.set(x, "renderExtraFooter", js.Any.fromFunction1(value))
      
      inline def setRenderExtraFooterUndefined: Self = StObject.set(x, "renderExtraFooter", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSeparator(value: VdomNode): Self = StObject.set(x, "separator", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSeparatorNull: Self = StObject.set(x, "separator", null)
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setSeparatorVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "separator", js.Array(value*))
      
      inline def setSeparatorVdomElement(value: VdomElement): Self = StObject.set(x, "separator", value.rawElement.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuffixIcon(value: VdomNode): Self = StObject.set(x, "suffixIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSuffixIconNull: Self = StObject.set(x, "suffixIcon", null)
      
      inline def setSuffixIconUndefined: Self = StObject.set(x, "suffixIcon", js.undefined)
      
      inline def setSuffixIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "suffixIcon", js.Array(value*))
      
      inline def setSuffixIconVdomElement(value: VdomElement): Self = StObject.set(x, "suffixIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSuperNextIcon(value: VdomNode): Self = StObject.set(x, "superNextIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSuperNextIconNull: Self = StObject.set(x, "superNextIcon", null)
      
      inline def setSuperNextIconUndefined: Self = StObject.set(x, "superNextIcon", js.undefined)
      
      inline def setSuperNextIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "superNextIcon", js.Array(value*))
      
      inline def setSuperNextIconVdomElement(value: VdomElement): Self = StObject.set(x, "superNextIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSuperPrevIcon(value: VdomNode): Self = StObject.set(x, "superPrevIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSuperPrevIconNull: Self = StObject.set(x, "superPrevIcon", null)
      
      inline def setSuperPrevIconUndefined: Self = StObject.set(x, "superPrevIcon", js.undefined)
      
      inline def setSuperPrevIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "superPrevIcon", js.Array(value*))
      
      inline def setSuperPrevIconVdomElement(value: VdomElement): Self = StObject.set(x, "superPrevIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      inline def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      inline def setValue(value: RangeValue[DateType]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined {  showTime :boolean | rc-picker.rc-picker/es/RangePicker.RangeShowTimeObject<DateType> | undefined} & rc-picker.rc-picker/es/RangePicker.RangePickerSharedProps<DateType> & rc-picker.rc-picker/es/RangePicker.OmitPickerProps<rc-picker.rc-picker/es/Picker.PickerDateProps<DateType>> */
  trait RangePickerDateProps[DateType]
    extends StObject
       with RangePickerProps[DateType] {
    
    /** @private Internal control of active picker. Do not use since it's private usage */
    var activePickerIndex: js.UndefOr[`0` | `1`] = js.undefined
    
    var allowClear: js.UndefOr[Boolean] = js.undefined
    
    var allowEmpty: js.UndefOr[js.Tuple2[Boolean, Boolean]] = js.undefined
    
    var `aria-activedescendant`: js.UndefOr[String] = js.undefined
    
    var `aria-atomic`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
    
    var `aria-busy`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
    
    var `aria-colcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-colindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-colspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-controls`: js.UndefOr[String] = js.undefined
    
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `aria-details`: js.UndefOr[String] = js.undefined
    
    var `aria-disabled`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
    
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    var `aria-expanded`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-flowto`: js.UndefOr[String] = js.undefined
    
    var `aria-grabbed`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
    
    var `aria-hidden`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    var `aria-level`: js.UndefOr[Double] = js.undefined
    
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
    
    var `aria-modal`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-multiline`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-multiselectable`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
    
    var `aria-owns`: js.UndefOr[String] = js.undefined
    
    var `aria-placeholder`: js.UndefOr[String] = js.undefined
    
    var `aria-posinset`: js.UndefOr[Double] = js.undefined
    
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
    
    var `aria-readonly`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.undefined
    
    var `aria-required`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-roledescription`: js.UndefOr[String] = js.undefined
    
    var `aria-rowcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-selected`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-setsize`: js.UndefOr[Double] = js.undefined
    
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
    
    var `aria-valuemax`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuemin`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuenow`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuetext`: js.UndefOr[String] = js.undefined
    
    var autoComplete: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var clearIcon: js.UndefOr[Node] = js.undefined
    
    var components: js.UndefOr[Components] = js.undefined
    
    var dateRender: js.UndefOr[RangeDateRender[DateType]] = js.undefined
    
    var defaultOpen: js.UndefOr[Boolean] = js.undefined
    
    var defaultPickerValue: js.UndefOr[js.Tuple2[DateType, DateType]] = js.undefined
    
    var defaultValue: js.UndefOr[RangeValue[DateType]] = js.undefined
    
    var direction: js.UndefOr[ltr | rtl] = js.undefined
    
    var disabled: js.UndefOr[Boolean | (js.Tuple2[Boolean, Boolean])] = js.undefined
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.undefined
    
    var disabledTime: js.UndefOr[
        js.Function2[/* date */ EventValue[DateType], /* type */ RangeType, DisabledTimes]
      ] = js.undefined
    
    var dropdownAlign: js.UndefOr[AlignType] = js.undefined
    
    var dropdownClassName: js.UndefOr[String] = js.undefined
    
    var format: js.UndefOr[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])] = js.undefined
    
    var generateConfig: GenerateConfig[DateType]
    
    var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inputReadOnly: js.UndefOr[Boolean] = js.undefined
    
    var inputRender: js.UndefOr[js.Function1[/* props */ InputHTMLAttributes[HTMLInputElement], Node]] = js.undefined
    
    var locale: Locale
    
    var mode: js.UndefOr[js.Tuple2[PanelMode, PanelMode]] = js.undefined
    
    var monthCellRender: js.UndefOr[MonthCellRender[DateType]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var nextIcon: js.UndefOr[Node] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onCalendarChange: js.UndefOr[
        js.Function3[
          /* values */ RangeValue[DateType], 
          /* formatString */ js.Tuple2[String, String], 
          /* info */ RangeInfo, 
          Unit
        ]
      ] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function2[
          /* values */ RangeValue[DateType], 
          /* formatString */ js.Tuple2[String, String], 
          Unit
        ]
      ] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[
        js.Function2[
          /* event */ ReactKeyboardEventFrom[HTMLInputElement], 
          /* preventDefault */ js.Function0[Unit], 
          Unit
        ]
      ] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onOk: js.UndefOr[js.Function1[/* dates */ RangeValue[DateType], Unit]] = js.undefined
    
    var onOpenChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.undefined
    
    var onPanelChange: js.UndefOr[
        js.Function2[/* values */ RangeValue[DateType], /* modes */ js.Tuple2[PanelMode, PanelMode], Unit]
      ] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var panelRender: js.UndefOr[js.Function1[/* originPanel */ Node, Node]] = js.undefined
    
    var picker: js.UndefOr[date] = js.undefined
    
    var pickerRef: js.UndefOr[MutableRefObject[PickerRefConfig]] = js.undefined
    
    var placeholder: js.UndefOr[js.Tuple2[String, String]] = js.undefined
    
    var popupStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var prevIcon: js.UndefOr[Node] = js.undefined
    
    var ranges: js.UndefOr[
        Record[
          String, 
          (Exclude[RangeValue[DateType], Null]) | (js.Function0[Exclude[RangeValue[DateType], Null]])
        ]
      ] = js.undefined
    
    var renderExtraFooter: js.UndefOr[js.Function1[/* mode */ PanelMode, Node]] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var separator: js.UndefOr[Node] = js.undefined
    
    var showNow: js.UndefOr[Boolean] = js.undefined
    
    var showTime: js.UndefOr[Boolean | RangeShowTimeObject[DateType]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var suffixIcon: js.UndefOr[Node] = js.undefined
    
    var superNextIcon: js.UndefOr[Node] = js.undefined
    
    var superPrevIcon: js.UndefOr[Node] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var transitionName: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[RangeValue[DateType]] = js.undefined
  }
  object RangePickerDateProps {
    
    inline def apply[DateType](generateConfig: GenerateConfig[DateType], locale: Locale): RangePickerDateProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangePickerDateProps[DateType]]
    }
    
    extension [Self <: RangePickerDateProps[?], DateType](x: Self & RangePickerDateProps[DateType]) {
      
      inline def setActivePickerIndex(value: `0` | `1`): Self = StObject.set(x, "activePickerIndex", value.asInstanceOf[js.Any])
      
      inline def setActivePickerIndexUndefined: Self = StObject.set(x, "activePickerIndex", js.undefined)
      
      inline def setAllowClear(value: Boolean): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
      
      inline def setAllowClearUndefined: Self = StObject.set(x, "allowClear", js.undefined)
      
      inline def setAllowEmpty(value: js.Tuple2[Boolean, Boolean]): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-atomic`(value: Booleanish): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      inline def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-busy`(value: Booleanish): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      inline def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      inline def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      inline def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      inline def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      inline def `setAria-disabled`(value: Booleanish): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      inline def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-expanded`(value: Booleanish): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      inline def `setAria-grabbed`(value: Booleanish): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      inline def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-hidden`(value: Booleanish): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      inline def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      inline def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      inline def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      inline def `setAria-modal`(value: Booleanish): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      inline def `setAria-multiline`(value: Booleanish): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      inline def `setAria-multiselectable`(value: Booleanish): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      inline def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      inline def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      inline def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      inline def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      inline def `setAria-readonly`(value: Booleanish): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      inline def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      inline def `setAria-required`(value: Booleanish): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      inline def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      inline def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      inline def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      inline def `setAria-selected`(value: Booleanish): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      inline def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      inline def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      inline def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      inline def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      inline def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClearIcon(value: VdomNode): Self = StObject.set(x, "clearIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setClearIconNull: Self = StObject.set(x, "clearIcon", null)
      
      inline def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
      
      inline def setClearIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "clearIcon", js.Array(value*))
      
      inline def setClearIconVdomElement(value: VdomElement): Self = StObject.set(x, "clearIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setComponents(value: Components): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setDateRender(value: (DateType, DateType, /* info */ RangeInfo) => Node): Self = StObject.set(x, "dateRender", js.Any.fromFunction3(value))
      
      inline def setDateRenderUndefined: Self = StObject.set(x, "dateRender", js.undefined)
      
      inline def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      inline def setDefaultPickerValue(value: js.Tuple2[DateType, DateType]): Self = StObject.set(x, "defaultPickerValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultPickerValueUndefined: Self = StObject.set(x, "defaultPickerValue", js.undefined)
      
      inline def setDefaultValue(value: RangeValue[DateType]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabled(value: Boolean | (js.Tuple2[Boolean, Boolean])): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledDate(value: /* date */ DateType => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      inline def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      inline def setDisabledTime(value: (/* date */ EventValue[DateType], /* type */ RangeType) => DisabledTimes): Self = StObject.set(x, "disabledTime", js.Any.fromFunction2(value))
      
      inline def setDisabledTimeUndefined: Self = StObject.set(x, "disabledTime", js.undefined)
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDropdownAlign(value: AlignType): Self = StObject.set(x, "dropdownAlign", value.asInstanceOf[js.Any])
      
      inline def setDropdownAlignUndefined: Self = StObject.set(x, "dropdownAlign", js.undefined)
      
      inline def setDropdownClassName(value: String): Self = StObject.set(x, "dropdownClassName", value.asInstanceOf[js.Any])
      
      inline def setDropdownClassNameUndefined: Self = StObject.set(x, "dropdownClassName", js.undefined)
      
      inline def setFormat(value: String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatFunction1(value: DateType => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setFormatVarargs(value: (String | CustomFormat[DateType])*): Self = StObject.set(x, "format", js.Array(value*))
      
      inline def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      inline def setGetPopupContainer(value: /* node */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      inline def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInputReadOnly(value: Boolean): Self = StObject.set(x, "inputReadOnly", value.asInstanceOf[js.Any])
      
      inline def setInputReadOnlyUndefined: Self = StObject.set(x, "inputReadOnly", js.undefined)
      
      inline def setInputRender(value: /* props */ InputHTMLAttributes[HTMLInputElement] => Node): Self = StObject.set(x, "inputRender", js.Any.fromFunction1(value))
      
      inline def setInputRenderUndefined: Self = StObject.set(x, "inputRender", js.undefined)
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setMode(value: js.Tuple2[PanelMode, PanelMode]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMonthCellRender(value: (DateType, /* locale */ Locale) => Node): Self = StObject.set(x, "monthCellRender", js.Any.fromFunction2(value))
      
      inline def setMonthCellRenderUndefined: Self = StObject.set(x, "monthCellRender", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNextIcon(value: VdomNode): Self = StObject.set(x, "nextIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setNextIconNull: Self = StObject.set(x, "nextIcon", null)
      
      inline def setNextIconUndefined: Self = StObject.set(x, "nextIcon", js.undefined)
      
      inline def setNextIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "nextIcon", js.Array(value*))
      
      inline def setNextIconVdomElement(value: VdomElement): Self = StObject.set(x, "nextIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCalendarChange(
        value: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String], /* info */ RangeInfo) => Callback
      ): Self = StObject.set(x, "onCalendarChange", js.Any.fromFunction3((t0: /* values */ RangeValue[DateType], t1: /* formatString */ js.Tuple2[String, String], t2: /* info */ RangeInfo) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnCalendarChangeUndefined: Self = StObject.set(x, "onCalendarChange", js.undefined)
      
      inline def setOnChange(
        value: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String]) => Callback
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* values */ RangeValue[DateType], t1: /* formatString */ js.Tuple2[String, String]) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnContextMenu(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnFocus(value: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(
        value: (/* event */ ReactKeyboardEventFrom[HTMLInputElement], /* preventDefault */ js.Function0[Unit]) => Callback
      ): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction2((t0: /* event */ ReactKeyboardEventFrom[HTMLInputElement], t1: /* preventDefault */ js.Function0[Unit]) => (value(t0, t1)).runNow()))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnMouseDown(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseUp(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnOk(value: /* dates */ RangeValue[DateType] => Callback): Self = StObject.set(x, "onOk", js.Any.fromFunction1((t0: /* dates */ RangeValue[DateType]) => value(t0).runNow()))
      
      inline def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      inline def setOnOpenChange(value: /* open */ Boolean => Callback): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction1((t0: /* open */ Boolean) => value(t0).runNow()))
      
      inline def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      inline def setOnPanelChange(
        value: (/* values */ RangeValue[DateType], /* modes */ js.Tuple2[PanelMode, PanelMode]) => Callback
      ): Self = StObject.set(x, "onPanelChange", js.Any.fromFunction2((t0: /* values */ RangeValue[DateType], t1: /* modes */ js.Tuple2[PanelMode, PanelMode]) => (value(t0, t1)).runNow()))
      
      inline def setOnPanelChangeUndefined: Self = StObject.set(x, "onPanelChange", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPanelRender(value: /* originPanel */ Node => Node): Self = StObject.set(x, "panelRender", js.Any.fromFunction1(value))
      
      inline def setPanelRenderUndefined: Self = StObject.set(x, "panelRender", js.undefined)
      
      inline def setPicker(value: date): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      inline def setPickerRef(value: MutableRefObject[PickerRefConfig]): Self = StObject.set(x, "pickerRef", value.asInstanceOf[js.Any])
      
      inline def setPickerRefUndefined: Self = StObject.set(x, "pickerRef", js.undefined)
      
      inline def setPickerUndefined: Self = StObject.set(x, "picker", js.undefined)
      
      inline def setPlaceholder(value: js.Tuple2[String, String]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPopupStyle(value: CSSProperties): Self = StObject.set(x, "popupStyle", value.asInstanceOf[js.Any])
      
      inline def setPopupStyleUndefined: Self = StObject.set(x, "popupStyle", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setPrevIcon(value: VdomNode): Self = StObject.set(x, "prevIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setPrevIconNull: Self = StObject.set(x, "prevIcon", null)
      
      inline def setPrevIconUndefined: Self = StObject.set(x, "prevIcon", js.undefined)
      
      inline def setPrevIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "prevIcon", js.Array(value*))
      
      inline def setPrevIconVdomElement(value: VdomElement): Self = StObject.set(x, "prevIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRanges(
        value: Record[
              String, 
              (Exclude[RangeValue[DateType], Null]) | (js.Function0[Exclude[RangeValue[DateType], Null]])
            ]
      ): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      inline def setRenderExtraFooter(value: /* mode */ PanelMode => Node): Self = StObject.set(x, "renderExtraFooter", js.Any.fromFunction1(value))
      
      inline def setRenderExtraFooterUndefined: Self = StObject.set(x, "renderExtraFooter", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSeparator(value: VdomNode): Self = StObject.set(x, "separator", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSeparatorNull: Self = StObject.set(x, "separator", null)
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setSeparatorVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "separator", js.Array(value*))
      
      inline def setSeparatorVdomElement(value: VdomElement): Self = StObject.set(x, "separator", value.rawElement.asInstanceOf[js.Any])
      
      inline def setShowNow(value: Boolean): Self = StObject.set(x, "showNow", value.asInstanceOf[js.Any])
      
      inline def setShowNowUndefined: Self = StObject.set(x, "showNow", js.undefined)
      
      inline def setShowTime(value: Boolean | RangeShowTimeObject[DateType]): Self = StObject.set(x, "showTime", value.asInstanceOf[js.Any])
      
      inline def setShowTimeUndefined: Self = StObject.set(x, "showTime", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuffixIcon(value: VdomNode): Self = StObject.set(x, "suffixIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSuffixIconNull: Self = StObject.set(x, "suffixIcon", null)
      
      inline def setSuffixIconUndefined: Self = StObject.set(x, "suffixIcon", js.undefined)
      
      inline def setSuffixIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "suffixIcon", js.Array(value*))
      
      inline def setSuffixIconVdomElement(value: VdomElement): Self = StObject.set(x, "suffixIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSuperNextIcon(value: VdomNode): Self = StObject.set(x, "superNextIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSuperNextIconNull: Self = StObject.set(x, "superNextIcon", null)
      
      inline def setSuperNextIconUndefined: Self = StObject.set(x, "superNextIcon", js.undefined)
      
      inline def setSuperNextIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "superNextIcon", js.Array(value*))
      
      inline def setSuperNextIconVdomElement(value: VdomElement): Self = StObject.set(x, "superNextIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSuperPrevIcon(value: VdomNode): Self = StObject.set(x, "superPrevIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSuperPrevIconNull: Self = StObject.set(x, "superPrevIcon", null)
      
      inline def setSuperPrevIconUndefined: Self = StObject.set(x, "superPrevIcon", js.undefined)
      
      inline def setSuperPrevIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "superPrevIcon", js.Array(value*))
      
      inline def setSuperPrevIconVdomElement(value: VdomElement): Self = StObject.set(x, "superPrevIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      inline def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      inline def setValue(value: RangeValue[DateType]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rcPicker.esRangePickerMod.RangePickerBaseProps[DateType]
    - typingsJapgolly.rcPicker.esRangePickerMod.RangePickerDateProps[DateType]
    - typingsJapgolly.rcPicker.esRangePickerMod.RangePickerTimeProps[DateType]
  */
  trait RangePickerProps[DateType] extends StObject
  object RangePickerProps {
    
    inline def RangePickerBaseProps[DateType](generateConfig: GenerateConfig[DateType], locale: Locale, picker: Exclude[PickerMode, date | time]): typingsJapgolly.rcPicker.esRangePickerMod.RangePickerBaseProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.rcPicker.esRangePickerMod.RangePickerBaseProps[DateType]]
    }
    
    inline def RangePickerDateProps[DateType](generateConfig: GenerateConfig[DateType], locale: Locale): typingsJapgolly.rcPicker.esRangePickerMod.RangePickerDateProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.rcPicker.esRangePickerMod.RangePickerDateProps[DateType]]
    }
    
    inline def RangePickerTimeProps[DateType](generateConfig: GenerateConfig[DateType], locale: Locale): typingsJapgolly.rcPicker.esRangePickerMod.RangePickerTimeProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = "time")
      __obj.asInstanceOf[typingsJapgolly.rcPicker.esRangePickerMod.RangePickerTimeProps[DateType]]
    }
  }
  
  trait RangePickerSharedProps[DateType] extends StObject {
    
    /** @private Internal control of active picker. Do not use since it's private usage */
    var activePickerIndex: js.UndefOr[`0` | `1`] = js.undefined
    
    var allowEmpty: js.UndefOr[js.Tuple2[Boolean, Boolean]] = js.undefined
    
    var autoComplete: js.UndefOr[String] = js.undefined
    
    var dateRender: js.UndefOr[RangeDateRender[DateType]] = js.undefined
    
    var defaultPickerValue: js.UndefOr[js.Tuple2[DateType, DateType]] = js.undefined
    
    var defaultValue: js.UndefOr[RangeValue[DateType]] = js.undefined
    
    var direction: js.UndefOr[ltr | rtl] = js.undefined
    
    var disabled: js.UndefOr[Boolean | (js.Tuple2[Boolean, Boolean])] = js.undefined
    
    var disabledTime: js.UndefOr[
        js.Function2[/* date */ EventValue[DateType], /* type */ RangeType, DisabledTimes]
      ] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[js.Tuple2[PanelMode, PanelMode]] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onCalendarChange: js.UndefOr[
        js.Function3[
          /* values */ RangeValue[DateType], 
          /* formatString */ js.Tuple2[String, String], 
          /* info */ RangeInfo, 
          Unit
        ]
      ] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function2[
          /* values */ RangeValue[DateType], 
          /* formatString */ js.Tuple2[String, String], 
          Unit
        ]
      ] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onOk: js.UndefOr[js.Function1[/* dates */ RangeValue[DateType], Unit]] = js.undefined
    
    var onPanelChange: js.UndefOr[
        js.Function2[/* values */ RangeValue[DateType], /* modes */ js.Tuple2[PanelMode, PanelMode], Unit]
      ] = js.undefined
    
    var panelRender: js.UndefOr[js.Function1[/* originPanel */ Node, Node]] = js.undefined
    
    var placeholder: js.UndefOr[js.Tuple2[String, String]] = js.undefined
    
    var ranges: js.UndefOr[
        Record[
          String, 
          (Exclude[RangeValue[DateType], Null]) | (js.Function0[Exclude[RangeValue[DateType], Null]])
        ]
      ] = js.undefined
    
    var separator: js.UndefOr[Node] = js.undefined
    
    var value: js.UndefOr[RangeValue[DateType]] = js.undefined
  }
  object RangePickerSharedProps {
    
    inline def apply[DateType](): RangePickerSharedProps[DateType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangePickerSharedProps[DateType]]
    }
    
    extension [Self <: RangePickerSharedProps[?], DateType](x: Self & RangePickerSharedProps[DateType]) {
      
      inline def setActivePickerIndex(value: `0` | `1`): Self = StObject.set(x, "activePickerIndex", value.asInstanceOf[js.Any])
      
      inline def setActivePickerIndexUndefined: Self = StObject.set(x, "activePickerIndex", js.undefined)
      
      inline def setAllowEmpty(value: js.Tuple2[Boolean, Boolean]): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setDateRender(value: (DateType, DateType, /* info */ RangeInfo) => Node): Self = StObject.set(x, "dateRender", js.Any.fromFunction3(value))
      
      inline def setDateRenderUndefined: Self = StObject.set(x, "dateRender", js.undefined)
      
      inline def setDefaultPickerValue(value: js.Tuple2[DateType, DateType]): Self = StObject.set(x, "defaultPickerValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultPickerValueUndefined: Self = StObject.set(x, "defaultPickerValue", js.undefined)
      
      inline def setDefaultValue(value: RangeValue[DateType]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabled(value: Boolean | (js.Tuple2[Boolean, Boolean])): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledTime(value: (/* date */ EventValue[DateType], /* type */ RangeType) => DisabledTimes): Self = StObject.set(x, "disabledTime", js.Any.fromFunction2(value))
      
      inline def setDisabledTimeUndefined: Self = StObject.set(x, "disabledTime", js.undefined)
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMode(value: js.Tuple2[PanelMode, PanelMode]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnBlur(value: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCalendarChange(
        value: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String], /* info */ RangeInfo) => Callback
      ): Self = StObject.set(x, "onCalendarChange", js.Any.fromFunction3((t0: /* values */ RangeValue[DateType], t1: /* formatString */ js.Tuple2[String, String], t2: /* info */ RangeInfo) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnCalendarChangeUndefined: Self = StObject.set(x, "onCalendarChange", js.undefined)
      
      inline def setOnChange(
        value: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String]) => Callback
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* values */ RangeValue[DateType], t1: /* formatString */ js.Tuple2[String, String]) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnFocus(value: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnMouseDown(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseUp(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnOk(value: /* dates */ RangeValue[DateType] => Callback): Self = StObject.set(x, "onOk", js.Any.fromFunction1((t0: /* dates */ RangeValue[DateType]) => value(t0).runNow()))
      
      inline def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      inline def setOnPanelChange(
        value: (/* values */ RangeValue[DateType], /* modes */ js.Tuple2[PanelMode, PanelMode]) => Callback
      ): Self = StObject.set(x, "onPanelChange", js.Any.fromFunction2((t0: /* values */ RangeValue[DateType], t1: /* modes */ js.Tuple2[PanelMode, PanelMode]) => (value(t0, t1)).runNow()))
      
      inline def setOnPanelChangeUndefined: Self = StObject.set(x, "onPanelChange", js.undefined)
      
      inline def setPanelRender(value: /* originPanel */ Node => Node): Self = StObject.set(x, "panelRender", js.Any.fromFunction1(value))
      
      inline def setPanelRenderUndefined: Self = StObject.set(x, "panelRender", js.undefined)
      
      inline def setPlaceholder(value: js.Tuple2[String, String]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setRanges(
        value: Record[
              String, 
              (Exclude[RangeValue[DateType], Null]) | (js.Function0[Exclude[RangeValue[DateType], Null]])
            ]
      ): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      inline def setSeparator(value: VdomNode): Self = StObject.set(x, "separator", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSeparatorNull: Self = StObject.set(x, "separator", null)
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setSeparatorVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "separator", js.Array(value*))
      
      inline def setSeparatorVdomElement(value: VdomElement): Self = StObject.set(x, "separator", value.rawElement.asInstanceOf[js.Any])
      
      inline def setValue(value: RangeValue[DateType]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined {  order :boolean | undefined} & rc-picker.rc-picker/es/RangePicker.RangePickerSharedProps<DateType> & rc-picker.rc-picker/es/RangePicker.OmitPickerProps<rc-picker.rc-picker/es/Picker.PickerTimeProps<DateType>> */
  trait RangePickerTimeProps[DateType]
    extends StObject
       with RangePickerProps[DateType] {
    
    /** @private Internal control of active picker. Do not use since it's private usage */
    var activePickerIndex: js.UndefOr[`0` | `1`] = js.undefined
    
    var allowClear: js.UndefOr[Boolean] = js.undefined
    
    var allowEmpty: js.UndefOr[js.Tuple2[Boolean, Boolean]] = js.undefined
    
    var `aria-activedescendant`: js.UndefOr[String] = js.undefined
    
    var `aria-atomic`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
    
    var `aria-busy`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
    
    var `aria-colcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-colindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-colspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-controls`: js.UndefOr[String] = js.undefined
    
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `aria-details`: js.UndefOr[String] = js.undefined
    
    var `aria-disabled`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
    
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    var `aria-expanded`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-flowto`: js.UndefOr[String] = js.undefined
    
    var `aria-grabbed`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
    
    var `aria-hidden`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    var `aria-level`: js.UndefOr[Double] = js.undefined
    
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
    
    var `aria-modal`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-multiline`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-multiselectable`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
    
    var `aria-owns`: js.UndefOr[String] = js.undefined
    
    var `aria-placeholder`: js.UndefOr[String] = js.undefined
    
    var `aria-posinset`: js.UndefOr[Double] = js.undefined
    
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
    
    var `aria-readonly`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.undefined
    
    var `aria-required`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-roledescription`: js.UndefOr[String] = js.undefined
    
    var `aria-rowcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-selected`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-setsize`: js.UndefOr[Double] = js.undefined
    
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
    
    var `aria-valuemax`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuemin`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuenow`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuetext`: js.UndefOr[String] = js.undefined
    
    var autoComplete: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var clearIcon: js.UndefOr[Node] = js.undefined
    
    var components: js.UndefOr[Components] = js.undefined
    
    var dateRender: js.UndefOr[RangeDateRender[DateType]] = js.undefined
    
    var defaultOpen: js.UndefOr[Boolean] = js.undefined
    
    var defaultOpenValue: js.UndefOr[DateType] = js.undefined
    
    var defaultPickerValue: js.UndefOr[js.Tuple2[DateType, DateType]] = js.undefined
    
    var defaultValue: js.UndefOr[RangeValue[DateType]] = js.undefined
    
    var direction: js.UndefOr[ltr | rtl] = js.undefined
    
    var disabled: js.UndefOr[Boolean | (js.Tuple2[Boolean, Boolean])] = js.undefined
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.undefined
    
    var disabledHours: js.UndefOr[js.Function0[js.Array[Double]]] = js.undefined
    
    var disabledMinutes: js.UndefOr[js.Function1[/* hour */ Double, js.Array[Double]]] = js.undefined
    
    var disabledSeconds: js.UndefOr[js.Function2[/* hour */ Double, /* minute */ Double, js.Array[Double]]] = js.undefined
    
    var disabledTime: js.UndefOr[
        js.Function2[/* date */ EventValue[DateType], /* type */ RangeType, DisabledTimes]
      ] = js.undefined
    
    var dropdownAlign: js.UndefOr[AlignType] = js.undefined
    
    var dropdownClassName: js.UndefOr[String] = js.undefined
    
    var format: js.UndefOr[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])] = js.undefined
    
    var generateConfig: GenerateConfig[DateType]
    
    var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.undefined
    
    var hideDisabledOptions: js.UndefOr[Boolean] = js.undefined
    
    var hourStep: js.UndefOr[Double] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inputReadOnly: js.UndefOr[Boolean] = js.undefined
    
    var inputRender: js.UndefOr[js.Function1[/* props */ InputHTMLAttributes[HTMLInputElement], Node]] = js.undefined
    
    var locale: Locale
    
    var minuteStep: js.UndefOr[Double] = js.undefined
    
    var mode: js.UndefOr[js.Tuple2[PanelMode, PanelMode]] = js.undefined
    
    var monthCellRender: js.UndefOr[MonthCellRender[DateType]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var nextIcon: js.UndefOr[Node] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onCalendarChange: js.UndefOr[
        js.Function3[
          /* values */ RangeValue[DateType], 
          /* formatString */ js.Tuple2[String, String], 
          /* info */ RangeInfo, 
          Unit
        ]
      ] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function2[
          /* values */ RangeValue[DateType], 
          /* formatString */ js.Tuple2[String, String], 
          Unit
        ]
      ] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[
        js.Function2[
          /* event */ ReactKeyboardEventFrom[HTMLInputElement], 
          /* preventDefault */ js.Function0[Unit], 
          Unit
        ]
      ] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onOk: js.UndefOr[js.Function1[/* dates */ RangeValue[DateType], Unit]] = js.undefined
    
    var onOpenChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.undefined
    
    var onPanelChange: js.UndefOr[
        js.Function2[/* values */ RangeValue[DateType], /* modes */ js.Tuple2[PanelMode, PanelMode], Unit]
      ] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var order: js.UndefOr[Boolean] = js.undefined
    
    var panelRender: js.UndefOr[js.Function1[/* originPanel */ Node, Node]] = js.undefined
    
    var picker: time
    
    var pickerRef: js.UndefOr[MutableRefObject[PickerRefConfig]] = js.undefined
    
    var placeholder: js.UndefOr[js.Tuple2[String, String]] = js.undefined
    
    var popupStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var prevIcon: js.UndefOr[Node] = js.undefined
    
    var ranges: js.UndefOr[
        Record[
          String, 
          (Exclude[RangeValue[DateType], Null]) | (js.Function0[Exclude[RangeValue[DateType], Null]])
        ]
      ] = js.undefined
    
    var renderExtraFooter: js.UndefOr[js.Function1[/* mode */ PanelMode, Node]] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var secondStep: js.UndefOr[Double] = js.undefined
    
    var separator: js.UndefOr[Node] = js.undefined
    
    var showHour: js.UndefOr[Boolean] = js.undefined
    
    var showMinute: js.UndefOr[Boolean] = js.undefined
    
    var showNow: js.UndefOr[Boolean] = js.undefined
    
    var showSecond: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var suffixIcon: js.UndefOr[Node] = js.undefined
    
    var superNextIcon: js.UndefOr[Node] = js.undefined
    
    var superPrevIcon: js.UndefOr[Node] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var transitionName: js.UndefOr[String] = js.undefined
    
    var use12Hours: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[RangeValue[DateType]] = js.undefined
  }
  object RangePickerTimeProps {
    
    inline def apply[DateType](generateConfig: GenerateConfig[DateType], locale: Locale): RangePickerTimeProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = "time")
      __obj.asInstanceOf[RangePickerTimeProps[DateType]]
    }
    
    extension [Self <: RangePickerTimeProps[?], DateType](x: Self & RangePickerTimeProps[DateType]) {
      
      inline def setActivePickerIndex(value: `0` | `1`): Self = StObject.set(x, "activePickerIndex", value.asInstanceOf[js.Any])
      
      inline def setActivePickerIndexUndefined: Self = StObject.set(x, "activePickerIndex", js.undefined)
      
      inline def setAllowClear(value: Boolean): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
      
      inline def setAllowClearUndefined: Self = StObject.set(x, "allowClear", js.undefined)
      
      inline def setAllowEmpty(value: js.Tuple2[Boolean, Boolean]): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-atomic`(value: Booleanish): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      inline def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-busy`(value: Booleanish): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      inline def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      inline def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      inline def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      inline def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      inline def `setAria-disabled`(value: Booleanish): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      inline def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-expanded`(value: Booleanish): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      inline def `setAria-grabbed`(value: Booleanish): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      inline def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-hidden`(value: Booleanish): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      inline def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      inline def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      inline def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      inline def `setAria-modal`(value: Booleanish): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      inline def `setAria-multiline`(value: Booleanish): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      inline def `setAria-multiselectable`(value: Booleanish): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      inline def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      inline def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      inline def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      inline def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      inline def `setAria-readonly`(value: Booleanish): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      inline def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      inline def `setAria-required`(value: Booleanish): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      inline def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      inline def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      inline def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      inline def `setAria-selected`(value: Booleanish): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      inline def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      inline def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      inline def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      inline def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      inline def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClearIcon(value: VdomNode): Self = StObject.set(x, "clearIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setClearIconNull: Self = StObject.set(x, "clearIcon", null)
      
      inline def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
      
      inline def setClearIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "clearIcon", js.Array(value*))
      
      inline def setClearIconVdomElement(value: VdomElement): Self = StObject.set(x, "clearIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setComponents(value: Components): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setDateRender(value: (DateType, DateType, /* info */ RangeInfo) => Node): Self = StObject.set(x, "dateRender", js.Any.fromFunction3(value))
      
      inline def setDateRenderUndefined: Self = StObject.set(x, "dateRender", js.undefined)
      
      inline def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      inline def setDefaultOpenValue(value: DateType): Self = StObject.set(x, "defaultOpenValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultOpenValueUndefined: Self = StObject.set(x, "defaultOpenValue", js.undefined)
      
      inline def setDefaultPickerValue(value: js.Tuple2[DateType, DateType]): Self = StObject.set(x, "defaultPickerValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultPickerValueUndefined: Self = StObject.set(x, "defaultPickerValue", js.undefined)
      
      inline def setDefaultValue(value: RangeValue[DateType]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabled(value: Boolean | (js.Tuple2[Boolean, Boolean])): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledDate(value: /* date */ DateType => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      inline def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      inline def setDisabledHours(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "disabledHours", value.toJsFn)
      
      inline def setDisabledHoursUndefined: Self = StObject.set(x, "disabledHours", js.undefined)
      
      inline def setDisabledMinutes(value: /* hour */ Double => js.Array[Double]): Self = StObject.set(x, "disabledMinutes", js.Any.fromFunction1(value))
      
      inline def setDisabledMinutesUndefined: Self = StObject.set(x, "disabledMinutes", js.undefined)
      
      inline def setDisabledSeconds(value: (/* hour */ Double, /* minute */ Double) => js.Array[Double]): Self = StObject.set(x, "disabledSeconds", js.Any.fromFunction2(value))
      
      inline def setDisabledSecondsUndefined: Self = StObject.set(x, "disabledSeconds", js.undefined)
      
      inline def setDisabledTime(value: (/* date */ EventValue[DateType], /* type */ RangeType) => DisabledTimes): Self = StObject.set(x, "disabledTime", js.Any.fromFunction2(value))
      
      inline def setDisabledTimeUndefined: Self = StObject.set(x, "disabledTime", js.undefined)
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDropdownAlign(value: AlignType): Self = StObject.set(x, "dropdownAlign", value.asInstanceOf[js.Any])
      
      inline def setDropdownAlignUndefined: Self = StObject.set(x, "dropdownAlign", js.undefined)
      
      inline def setDropdownClassName(value: String): Self = StObject.set(x, "dropdownClassName", value.asInstanceOf[js.Any])
      
      inline def setDropdownClassNameUndefined: Self = StObject.set(x, "dropdownClassName", js.undefined)
      
      inline def setFormat(value: String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatFunction1(value: DateType => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setFormatVarargs(value: (String | CustomFormat[DateType])*): Self = StObject.set(x, "format", js.Array(value*))
      
      inline def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      inline def setGetPopupContainer(value: /* node */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      inline def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      inline def setHideDisabledOptions(value: Boolean): Self = StObject.set(x, "hideDisabledOptions", value.asInstanceOf[js.Any])
      
      inline def setHideDisabledOptionsUndefined: Self = StObject.set(x, "hideDisabledOptions", js.undefined)
      
      inline def setHourStep(value: Double): Self = StObject.set(x, "hourStep", value.asInstanceOf[js.Any])
      
      inline def setHourStepUndefined: Self = StObject.set(x, "hourStep", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInputReadOnly(value: Boolean): Self = StObject.set(x, "inputReadOnly", value.asInstanceOf[js.Any])
      
      inline def setInputReadOnlyUndefined: Self = StObject.set(x, "inputReadOnly", js.undefined)
      
      inline def setInputRender(value: /* props */ InputHTMLAttributes[HTMLInputElement] => Node): Self = StObject.set(x, "inputRender", js.Any.fromFunction1(value))
      
      inline def setInputRenderUndefined: Self = StObject.set(x, "inputRender", js.undefined)
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setMinuteStep(value: Double): Self = StObject.set(x, "minuteStep", value.asInstanceOf[js.Any])
      
      inline def setMinuteStepUndefined: Self = StObject.set(x, "minuteStep", js.undefined)
      
      inline def setMode(value: js.Tuple2[PanelMode, PanelMode]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMonthCellRender(value: (DateType, /* locale */ Locale) => Node): Self = StObject.set(x, "monthCellRender", js.Any.fromFunction2(value))
      
      inline def setMonthCellRenderUndefined: Self = StObject.set(x, "monthCellRender", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNextIcon(value: VdomNode): Self = StObject.set(x, "nextIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setNextIconNull: Self = StObject.set(x, "nextIcon", null)
      
      inline def setNextIconUndefined: Self = StObject.set(x, "nextIcon", js.undefined)
      
      inline def setNextIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "nextIcon", js.Array(value*))
      
      inline def setNextIconVdomElement(value: VdomElement): Self = StObject.set(x, "nextIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCalendarChange(
        value: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String], /* info */ RangeInfo) => Callback
      ): Self = StObject.set(x, "onCalendarChange", js.Any.fromFunction3((t0: /* values */ RangeValue[DateType], t1: /* formatString */ js.Tuple2[String, String], t2: /* info */ RangeInfo) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnCalendarChangeUndefined: Self = StObject.set(x, "onCalendarChange", js.undefined)
      
      inline def setOnChange(
        value: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String]) => Callback
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* values */ RangeValue[DateType], t1: /* formatString */ js.Tuple2[String, String]) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnContextMenu(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnFocus(value: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(
        value: (/* event */ ReactKeyboardEventFrom[HTMLInputElement], /* preventDefault */ js.Function0[Unit]) => Callback
      ): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction2((t0: /* event */ ReactKeyboardEventFrom[HTMLInputElement], t1: /* preventDefault */ js.Function0[Unit]) => (value(t0, t1)).runNow()))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnMouseDown(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseUp(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnOk(value: /* dates */ RangeValue[DateType] => Callback): Self = StObject.set(x, "onOk", js.Any.fromFunction1((t0: /* dates */ RangeValue[DateType]) => value(t0).runNow()))
      
      inline def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      inline def setOnOpenChange(value: /* open */ Boolean => Callback): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction1((t0: /* open */ Boolean) => value(t0).runNow()))
      
      inline def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      inline def setOnPanelChange(
        value: (/* values */ RangeValue[DateType], /* modes */ js.Tuple2[PanelMode, PanelMode]) => Callback
      ): Self = StObject.set(x, "onPanelChange", js.Any.fromFunction2((t0: /* values */ RangeValue[DateType], t1: /* modes */ js.Tuple2[PanelMode, PanelMode]) => (value(t0, t1)).runNow()))
      
      inline def setOnPanelChangeUndefined: Self = StObject.set(x, "onPanelChange", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setOrder(value: Boolean): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setPanelRender(value: /* originPanel */ Node => Node): Self = StObject.set(x, "panelRender", js.Any.fromFunction1(value))
      
      inline def setPanelRenderUndefined: Self = StObject.set(x, "panelRender", js.undefined)
      
      inline def setPicker(value: time): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      inline def setPickerRef(value: MutableRefObject[PickerRefConfig]): Self = StObject.set(x, "pickerRef", value.asInstanceOf[js.Any])
      
      inline def setPickerRefUndefined: Self = StObject.set(x, "pickerRef", js.undefined)
      
      inline def setPlaceholder(value: js.Tuple2[String, String]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPopupStyle(value: CSSProperties): Self = StObject.set(x, "popupStyle", value.asInstanceOf[js.Any])
      
      inline def setPopupStyleUndefined: Self = StObject.set(x, "popupStyle", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setPrevIcon(value: VdomNode): Self = StObject.set(x, "prevIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setPrevIconNull: Self = StObject.set(x, "prevIcon", null)
      
      inline def setPrevIconUndefined: Self = StObject.set(x, "prevIcon", js.undefined)
      
      inline def setPrevIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "prevIcon", js.Array(value*))
      
      inline def setPrevIconVdomElement(value: VdomElement): Self = StObject.set(x, "prevIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRanges(
        value: Record[
              String, 
              (Exclude[RangeValue[DateType], Null]) | (js.Function0[Exclude[RangeValue[DateType], Null]])
            ]
      ): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      inline def setRenderExtraFooter(value: /* mode */ PanelMode => Node): Self = StObject.set(x, "renderExtraFooter", js.Any.fromFunction1(value))
      
      inline def setRenderExtraFooterUndefined: Self = StObject.set(x, "renderExtraFooter", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSecondStep(value: Double): Self = StObject.set(x, "secondStep", value.asInstanceOf[js.Any])
      
      inline def setSecondStepUndefined: Self = StObject.set(x, "secondStep", js.undefined)
      
      inline def setSeparator(value: VdomNode): Self = StObject.set(x, "separator", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSeparatorNull: Self = StObject.set(x, "separator", null)
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setSeparatorVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "separator", js.Array(value*))
      
      inline def setSeparatorVdomElement(value: VdomElement): Self = StObject.set(x, "separator", value.rawElement.asInstanceOf[js.Any])
      
      inline def setShowHour(value: Boolean): Self = StObject.set(x, "showHour", value.asInstanceOf[js.Any])
      
      inline def setShowHourUndefined: Self = StObject.set(x, "showHour", js.undefined)
      
      inline def setShowMinute(value: Boolean): Self = StObject.set(x, "showMinute", value.asInstanceOf[js.Any])
      
      inline def setShowMinuteUndefined: Self = StObject.set(x, "showMinute", js.undefined)
      
      inline def setShowNow(value: Boolean): Self = StObject.set(x, "showNow", value.asInstanceOf[js.Any])
      
      inline def setShowNowUndefined: Self = StObject.set(x, "showNow", js.undefined)
      
      inline def setShowSecond(value: Boolean): Self = StObject.set(x, "showSecond", value.asInstanceOf[js.Any])
      
      inline def setShowSecondUndefined: Self = StObject.set(x, "showSecond", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuffixIcon(value: VdomNode): Self = StObject.set(x, "suffixIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSuffixIconNull: Self = StObject.set(x, "suffixIcon", null)
      
      inline def setSuffixIconUndefined: Self = StObject.set(x, "suffixIcon", js.undefined)
      
      inline def setSuffixIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "suffixIcon", js.Array(value*))
      
      inline def setSuffixIconVdomElement(value: VdomElement): Self = StObject.set(x, "suffixIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSuperNextIcon(value: VdomNode): Self = StObject.set(x, "superNextIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSuperNextIconNull: Self = StObject.set(x, "superNextIcon", null)
      
      inline def setSuperNextIconUndefined: Self = StObject.set(x, "superNextIcon", js.undefined)
      
      inline def setSuperNextIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "superNextIcon", js.Array(value*))
      
      inline def setSuperNextIconVdomElement(value: VdomElement): Self = StObject.set(x, "superNextIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSuperPrevIcon(value: VdomNode): Self = StObject.set(x, "superPrevIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSuperPrevIconNull: Self = StObject.set(x, "superPrevIcon", null)
      
      inline def setSuperPrevIconUndefined: Self = StObject.set(x, "superPrevIcon", js.undefined)
      
      inline def setSuperPrevIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "superPrevIcon", js.Array(value*))
      
      inline def setSuperPrevIconVdomElement(value: VdomElement): Self = StObject.set(x, "superPrevIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      inline def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      inline def setUse12Hours(value: Boolean): Self = StObject.set(x, "use12Hours", value.asInstanceOf[js.Any])
      
      inline def setUse12HoursUndefined: Self = StObject.set(x, "use12Hours", js.undefined)
      
      inline def setValue(value: RangeValue[DateType]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined std.Omit<rc-picker.rc-picker/es/panels/TimePanel.SharedTimeProps<DateType>, 'defaultValue'> & {  defaultValue :std.Array<DateType> | undefined} */
  trait RangeShowTimeObject[DateType] extends StObject {
    
    var defaultValue: js.UndefOr[js.Array[DateType]] = js.undefined
    
    var disabledHours: js.UndefOr[js.Function0[js.Array[Double]]] = js.undefined
    
    var disabledMinutes: js.UndefOr[js.Function1[/* hour */ Double, js.Array[Double]]] = js.undefined
    
    var disabledSeconds: js.UndefOr[js.Function2[/* hour */ Double, /* minute */ Double, js.Array[Double]]] = js.undefined
    
    var disabledTime: js.UndefOr[js.Function1[/* date */ DateType, DisabledTimes]] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var hideDisabledOptions: js.UndefOr[Boolean] = js.undefined
    
    var hourStep: js.UndefOr[Double] = js.undefined
    
    var minuteStep: js.UndefOr[Double] = js.undefined
    
    var secondStep: js.UndefOr[Double] = js.undefined
    
    var showHour: js.UndefOr[Boolean] = js.undefined
    
    var showMinute: js.UndefOr[Boolean] = js.undefined
    
    var showNow: js.UndefOr[Boolean] = js.undefined
    
    var showSecond: js.UndefOr[Boolean] = js.undefined
    
    var use12Hours: js.UndefOr[Boolean] = js.undefined
  }
  object RangeShowTimeObject {
    
    inline def apply[DateType](): RangeShowTimeObject[DateType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeShowTimeObject[DateType]]
    }
    
    extension [Self <: RangeShowTimeObject[?], DateType](x: Self & RangeShowTimeObject[DateType]) {
      
      inline def setDefaultValue(value: js.Array[DateType]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: DateType*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setDisabledHours(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "disabledHours", value.toJsFn)
      
      inline def setDisabledHoursUndefined: Self = StObject.set(x, "disabledHours", js.undefined)
      
      inline def setDisabledMinutes(value: /* hour */ Double => js.Array[Double]): Self = StObject.set(x, "disabledMinutes", js.Any.fromFunction1(value))
      
      inline def setDisabledMinutesUndefined: Self = StObject.set(x, "disabledMinutes", js.undefined)
      
      inline def setDisabledSeconds(value: (/* hour */ Double, /* minute */ Double) => js.Array[Double]): Self = StObject.set(x, "disabledSeconds", js.Any.fromFunction2(value))
      
      inline def setDisabledSecondsUndefined: Self = StObject.set(x, "disabledSeconds", js.undefined)
      
      inline def setDisabledTime(value: /* date */ DateType => DisabledTimes): Self = StObject.set(x, "disabledTime", js.Any.fromFunction1(value))
      
      inline def setDisabledTimeUndefined: Self = StObject.set(x, "disabledTime", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHideDisabledOptions(value: Boolean): Self = StObject.set(x, "hideDisabledOptions", value.asInstanceOf[js.Any])
      
      inline def setHideDisabledOptionsUndefined: Self = StObject.set(x, "hideDisabledOptions", js.undefined)
      
      inline def setHourStep(value: Double): Self = StObject.set(x, "hourStep", value.asInstanceOf[js.Any])
      
      inline def setHourStepUndefined: Self = StObject.set(x, "hourStep", js.undefined)
      
      inline def setMinuteStep(value: Double): Self = StObject.set(x, "minuteStep", value.asInstanceOf[js.Any])
      
      inline def setMinuteStepUndefined: Self = StObject.set(x, "minuteStep", js.undefined)
      
      inline def setSecondStep(value: Double): Self = StObject.set(x, "secondStep", value.asInstanceOf[js.Any])
      
      inline def setSecondStepUndefined: Self = StObject.set(x, "secondStep", js.undefined)
      
      inline def setShowHour(value: Boolean): Self = StObject.set(x, "showHour", value.asInstanceOf[js.Any])
      
      inline def setShowHourUndefined: Self = StObject.set(x, "showHour", js.undefined)
      
      inline def setShowMinute(value: Boolean): Self = StObject.set(x, "showMinute", value.asInstanceOf[js.Any])
      
      inline def setShowMinuteUndefined: Self = StObject.set(x, "showMinute", js.undefined)
      
      inline def setShowNow(value: Boolean): Self = StObject.set(x, "showNow", value.asInstanceOf[js.Any])
      
      inline def setShowNowUndefined: Self = StObject.set(x, "showNow", js.undefined)
      
      inline def setShowSecond(value: Boolean): Self = StObject.set(x, "showSecond", value.asInstanceOf[js.Any])
      
      inline def setShowSecondUndefined: Self = StObject.set(x, "showSecond", js.undefined)
      
      inline def setUse12Hours(value: Boolean): Self = StObject.set(x, "use12Hours", value.asInstanceOf[js.Any])
      
      inline def setUse12HoursUndefined: Self = StObject.set(x, "use12Hours", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rcPicker.rcPickerStrings.start
    - typingsJapgolly.rcPicker.rcPickerStrings.end
  */
  trait RangeType extends StObject
  object RangeType {
    
    inline def end: typingsJapgolly.rcPicker.rcPickerStrings.end = "end".asInstanceOf[typingsJapgolly.rcPicker.rcPickerStrings.end]
    
    inline def start: typingsJapgolly.rcPicker.rcPickerStrings.start = "start".asInstanceOf[typingsJapgolly.rcPicker.rcPickerStrings.start]
  }
}
