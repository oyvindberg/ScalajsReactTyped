package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactClipboardEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.ClipboardEventHandler
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.wixStyleReact.distTypesInputMod.InputSize
import typingsJapgolly.wixStyleReact.distTypesInputMod.InputStatus
import typingsJapgolly.wixStyleReact.distTypesInputMod.InputValue
import typingsJapgolly.wixStyleReact.distTypesInputMod.MaxValue
import typingsJapgolly.wixStyleReact.distTypesInputMod.MinValue
import typingsJapgolly.wixStyleReact.distTypesPopoverPopoverDottypesMod.Placement
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.bottomLine
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.clip
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.ellipsis
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.none_
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.round
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNumberInputNumberInputDottypesMod {
  
  trait NumberInputProps extends StObject {
    
    var ariaControls: js.UndefOr[String] = js.undefined
    
    var ariaDescribedby: js.UndefOr[String] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var autoSelect: js.UndefOr[Boolean] = js.undefined
    
    var autocomplete: js.UndefOr[String] = js.undefined
    
    var border: js.UndefOr[standard | round | bottomLine | none_] = js.undefined
    
    /** Specifies a CSS class name to be appended to the component’s root element */
    var className: js.UndefOr[String] = js.undefined
    
    var clearButton: js.UndefOr[Boolean] = js.undefined
    
    var customInput: js.UndefOr[Node | js.Function] = js.undefined
    
    /** Applies a data-hook HTML attribute that can be used in the tests */
    var dataHook: js.UndefOr[String] = js.undefined
    
    /** Defines the initial value of an input */
    var defaultValue: js.UndefOr[InputValue] = js.undefined
    
    var disableEditing: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether input should be disabled or not */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var focusOnClearClick: js.UndefOr[Boolean] = js.undefined
    
    var forceFocus: js.UndefOr[Boolean] = js.undefined
    
    var forceHover: js.UndefOr[Boolean] = js.undefined
    
    var hideStatusSuffix: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether stepper should be hidden */
    var hideStepper: js.UndefOr[Boolean] = js.undefined
    
    /** Assigns a unique identifier for the root element */
    var id: js.UndefOr[String] = js.undefined
    
    var inputRef: js.UndefOr[js.Function1[/* input */ HTMLInputElement, Unit]] = js.undefined
    
    /** Defines a message to display when user types invalid number value */
    var invalidMessage: js.UndefOr[String] = js.undefined
    
    /** Sets a maximum value of an input. Similar to html5 max attribute. */
    var max: js.UndefOr[MaxValue] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var menuArrow: js.UndefOr[Boolean] = js.undefined
    
    /** Sets a minimum value of an input. Similar to HTML5 min attribute. */
    var min: js.UndefOr[MinValue] = js.undefined
    
    /** Reference element data when a form is submitted */
    var name: js.UndefOr[String] = js.undefined
    
    var noLeftBorderRadius: js.UndefOr[Boolean] = js.undefined
    
    var noRightBorderRadius: js.UndefOr[Boolean] = js.undefined
    
    /** Defines a standard input onBlur callback */
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    /** Defines a standard input onChange callback */
    var onChange: js.UndefOr[js.Function2[/* value */ Double | Null, /* stringValue */ String, Unit]] = js.undefined
    
    var onClear: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onCompositionChange: js.UndefOr[js.Function1[/* isComposing */ Boolean, Unit]] = js.undefined
    
    var onEnterPressed: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onEscapePressed: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    /** Defines a standard input onFocus callback */
    var onFocus: js.UndefOr[js.Function1[/* e */ js.UndefOr[ReactFocusEventFrom[HTMLInputElement]], Unit]] = js.undefined
    
    var onInputClicked: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    /** Defines a callback function which is called on cases when value is not between min and max values */
    var onInvalid: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
    
    /** Sets a placeholder message to display */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /** Pass a component you want to show as the prefix of the input, e.g., text, icon */
    var prefix: js.UndefOr[Node] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    /** Controls the size of the input */
    var size: js.UndefOr[InputSize] = js.undefined
    
    /** Specify the status of a field */
    var status: js.UndefOr[InputStatus] = js.undefined
    
    /** Defines the message to display on status icon hover. If not given or empty there will be no tooltip. */
    var statusMessage: js.UndefOr[Node] = js.undefined
    
    /** Specifies the interval between number values */
    var step: js.UndefOr[Double] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
    
    var suffix: js.UndefOr[Node] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var textOverflow: js.UndefOr[clip | ellipsis] = js.undefined
    
    var tooltipPlacement: js.UndefOr[Placement] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    /** Specifies the current value of the element */
    var value: js.UndefOr[String | Double] = js.undefined
    
    var withSelection: js.UndefOr[Boolean] = js.undefined
  }
  object NumberInputProps {
    
    inline def apply(): NumberInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberInputProps]
    }
    
    extension [Self <: NumberInputProps](x: Self) {
      
      inline def setAriaControls(value: String): Self = StObject.set(x, "ariaControls", value.asInstanceOf[js.Any])
      
      inline def setAriaControlsUndefined: Self = StObject.set(x, "ariaControls", js.undefined)
      
      inline def setAriaDescribedby(value: String): Self = StObject.set(x, "ariaDescribedby", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedbyUndefined: Self = StObject.set(x, "ariaDescribedby", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setAutoSelect(value: Boolean): Self = StObject.set(x, "autoSelect", value.asInstanceOf[js.Any])
      
      inline def setAutoSelectUndefined: Self = StObject.set(x, "autoSelect", js.undefined)
      
      inline def setAutocomplete(value: String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      inline def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
      
      inline def setBorder(value: standard | round | bottomLine | none_): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClearButton(value: Boolean): Self = StObject.set(x, "clearButton", value.asInstanceOf[js.Any])
      
      inline def setClearButtonUndefined: Self = StObject.set(x, "clearButton", js.undefined)
      
      inline def setCustomInput(value: Node | js.Function): Self = StObject.set(x, "customInput", value.asInstanceOf[js.Any])
      
      inline def setCustomInputNull: Self = StObject.set(x, "customInput", null)
      
      inline def setCustomInputUndefined: Self = StObject.set(x, "customInput", js.undefined)
      
      inline def setCustomInputVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "customInput", js.Array(value*))
      
      inline def setCustomInputVdomElement(value: VdomElement): Self = StObject.set(x, "customInput", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDefaultValue(value: InputValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisableEditing(value: Boolean): Self = StObject.set(x, "disableEditing", value.asInstanceOf[js.Any])
      
      inline def setDisableEditingUndefined: Self = StObject.set(x, "disableEditing", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFocusOnClearClick(value: Boolean): Self = StObject.set(x, "focusOnClearClick", value.asInstanceOf[js.Any])
      
      inline def setFocusOnClearClickUndefined: Self = StObject.set(x, "focusOnClearClick", js.undefined)
      
      inline def setForceFocus(value: Boolean): Self = StObject.set(x, "forceFocus", value.asInstanceOf[js.Any])
      
      inline def setForceFocusUndefined: Self = StObject.set(x, "forceFocus", js.undefined)
      
      inline def setForceHover(value: Boolean): Self = StObject.set(x, "forceHover", value.asInstanceOf[js.Any])
      
      inline def setForceHoverUndefined: Self = StObject.set(x, "forceHover", js.undefined)
      
      inline def setHideStatusSuffix(value: Boolean): Self = StObject.set(x, "hideStatusSuffix", value.asInstanceOf[js.Any])
      
      inline def setHideStatusSuffixUndefined: Self = StObject.set(x, "hideStatusSuffix", js.undefined)
      
      inline def setHideStepper(value: Boolean): Self = StObject.set(x, "hideStepper", value.asInstanceOf[js.Any])
      
      inline def setHideStepperUndefined: Self = StObject.set(x, "hideStepper", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInputRef(value: /* input */ HTMLInputElement => Callback): Self = StObject.set(x, "inputRef", js.Any.fromFunction1((t0: /* input */ HTMLInputElement) => value(t0).runNow()))
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setInvalidMessage(value: String): Self = StObject.set(x, "invalidMessage", value.asInstanceOf[js.Any])
      
      inline def setInvalidMessageUndefined: Self = StObject.set(x, "invalidMessage", js.undefined)
      
      inline def setMax(value: MaxValue): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMenuArrow(value: Boolean): Self = StObject.set(x, "menuArrow", value.asInstanceOf[js.Any])
      
      inline def setMenuArrowUndefined: Self = StObject.set(x, "menuArrow", js.undefined)
      
      inline def setMin(value: MinValue): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNoLeftBorderRadius(value: Boolean): Self = StObject.set(x, "noLeftBorderRadius", value.asInstanceOf[js.Any])
      
      inline def setNoLeftBorderRadiusUndefined: Self = StObject.set(x, "noLeftBorderRadius", js.undefined)
      
      inline def setNoRightBorderRadius(value: Boolean): Self = StObject.set(x, "noRightBorderRadius", value.asInstanceOf[js.Any])
      
      inline def setNoRightBorderRadiusUndefined: Self = StObject.set(x, "noRightBorderRadius", js.undefined)
      
      inline def setOnBlur(value: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: (/* value */ Double | Null, /* stringValue */ String) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* value */ Double | Null, t1: /* stringValue */ String) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClear(value: ReactMouseEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClear", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      inline def setOnCompositionChange(value: /* isComposing */ Boolean => Callback): Self = StObject.set(x, "onCompositionChange", js.Any.fromFunction1((t0: /* isComposing */ Boolean) => value(t0).runNow()))
      
      inline def setOnCompositionChangeUndefined: Self = StObject.set(x, "onCompositionChange", js.undefined)
      
      inline def setOnEnterPressed(value: ReactKeyboardEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onEnterPressed", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnEnterPressedUndefined: Self = StObject.set(x, "onEnterPressed", js.undefined)
      
      inline def setOnEscapePressed(value: ReactKeyboardEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onEscapePressed", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnEscapePressedUndefined: Self = StObject.set(x, "onEscapePressed", js.undefined)
      
      inline def setOnFocus(value: /* e */ js.UndefOr[ReactFocusEventFrom[HTMLInputElement]] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: /* e */ js.UndefOr[ReactFocusEventFrom[HTMLInputElement]]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInputClicked(value: ReactMouseEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onInputClicked", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnInputClickedUndefined: Self = StObject.set(x, "onInputClicked", js.undefined)
      
      inline def setOnInvalid(value: /* value */ String => Callback): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setOnKeyDown(value: ReactKeyboardEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyUp(value: ReactKeyboardEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnPaste(value: ReactClipboardEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPrefix(value: VdomNode): Self = StObject.set(x, "prefix", value.rawNode.asInstanceOf[js.Any])
      
      inline def setPrefixNull: Self = StObject.set(x, "prefix", null)
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setPrefixVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "prefix", js.Array(value*))
      
      inline def setPrefixVdomElement(value: VdomElement): Self = StObject.set(x, "prefix", value.rawElement.asInstanceOf[js.Any])
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setSize(value: InputSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStatus(value: InputStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusMessage(value: VdomNode): Self = StObject.set(x, "statusMessage", value.rawNode.asInstanceOf[js.Any])
      
      inline def setStatusMessageNull: Self = StObject.set(x, "statusMessage", null)
      
      inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
      
      inline def setStatusMessageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "statusMessage", js.Array(value*))
      
      inline def setStatusMessageVdomElement(value: VdomElement): Self = StObject.set(x, "statusMessage", value.rawElement.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setSuffix(value: VdomNode): Self = StObject.set(x, "suffix", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSuffixNull: Self = StObject.set(x, "suffix", null)
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setSuffixVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "suffix", js.Array(value*))
      
      inline def setSuffixVdomElement(value: VdomElement): Self = StObject.set(x, "suffix", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTextOverflow(value: clip | ellipsis): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
      
      inline def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
      
      inline def setTooltipPlacement(value: Placement): Self = StObject.set(x, "tooltipPlacement", value.asInstanceOf[js.Any])
      
      inline def setTooltipPlacementUndefined: Self = StObject.set(x, "tooltipPlacement", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWithSelection(value: Boolean): Self = StObject.set(x, "withSelection", value.asInstanceOf[js.Any])
      
      inline def setWithSelectionUndefined: Self = StObject.set(x, "withSelection", js.undefined)
    }
  }
}
