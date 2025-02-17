package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.ElementType
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.orbitUiReactComponents.distSharedSrcTypesMod.AriaLabelingProps
import typingsJapgolly.orbitUiReactComponents.distSharedSrcTypesMod.InteractionStatesProps
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.compact
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.expanded
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.input
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.invalid
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.valid
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ChangeEventHandler
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ForwardedRef
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDateInputSrcDateInputMod {
  
  @JSImport("@orbit-ui/react-components/dist/date-input/src/DateInput", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/date-input/src/DateInput", "DateInput")
  @js.native
  val DateInput: OrbitComponent[input, InnerDateInputProps] = js.native
  
  inline def InnerDateInput(
    hasValuePropDefaultValuePlaceholderOnDateChangePresetsPresetsVariantFluidWrapperPropsDisabledReadOnlyClassNameStyleAsForwardedRefRest: InnerDateInputProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerDateInput")(hasValuePropDefaultValuePlaceholderOnDateChangePresetsPresetsVariantFluidWrapperPropsDisabledReadOnlyClassNameStyleAsForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type BoxProps = typingsJapgolly.orbitUiReactComponents.distBoxSrcBoxMod.BoxProps
  
  type DateInputProps = ComponentProps[OrbitComponent[input, InnerDateInputProps]]
  
  trait DatePreset extends StObject {
    
    var date: js.Date
    
    var text: String
  }
  object DatePreset {
    
    inline def apply(date: js.Date, text: String): DatePreset = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatePreset]
    }
    
    extension [Self <: DatePreset](x: Self) {
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait InnerDateInputProps
    extends StObject
       with InteractionStatesProps
       with AriaLabelingProps {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType] = js.undefined
    
    /**
      * Whether or not the input should autofocus on render.
      */
    var autoFocus: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * @ignore
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * The default value of `value` when uncontrolled.
      */
    var defaultValue: js.UndefOr[js.Date] = js.undefined
    
    /**
      * @ignore
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not the input take up the width of its container.
      */
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * The maximum (inclusive) date.
      */
    var max: js.UndefOr[js.Date] = js.undefined
    
    /**
      * The minimum (inclusive) date.
      */
    var min: js.UndefOr[js.Date] = js.undefined
    
    /**
      * @ignore
      */
    var onChange: js.UndefOr[ChangeEventHandler[org.scalajs.dom.Element]] = js.undefined
    
    /**
      * Called when the date change.
      * @param {ChangeEvent} event - React's original synthetic event.
      * @param {object} date - The new date value.
      * @returns {void}
      */
    var onDateChange: js.UndefOr[
        js.Function2[/* event */ ReactEventFrom[HTMLInputElement], /* date */ js.Date, Unit]
      ] = js.undefined
    
    /**
      * Temporary text that occupies the input when it is empty.
      */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /**
      * Array of pre-determined dates.
      */
    var presets: js.UndefOr[js.Array[DatePreset]] = js.undefined
    
    /**
      * The presets style to use.
      */
    var presetsVariant: js.UndefOr[compact | expanded] = js.undefined
    
    /**
      * Whether or not the input is readonly.
      */
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not a user input is required before form submission.
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Whether or not the input should display as "valid" or "invalid".
      */
    var validationState: js.UndefOr[valid | invalid] = js.undefined
    
    /**
      * A controlled value.
      */
    var value: js.UndefOr[js.Date | Null] = js.undefined
    
    /**
      * Additional props to render on the wrapper element.
      */
    var wrapperProps: js.UndefOr[Partial[BoxProps]] = js.undefined
  }
  object InnerDateInputProps {
    
    inline def apply(): InnerDateInputProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerDateInputProps]
    }
    
    extension [Self <: InnerDateInputProps](x: Self) {
      
      inline def setAs(value: ElementType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAutoFocus(value: Boolean | Double): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultValue(value: js.Date): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Callback): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setMax(value: js.Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: js.Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOnChange(value: ReactEventFrom[org.scalajs.dom.Element & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[org.scalajs.dom.Element & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnDateChange(value: (/* event */ ReactEventFrom[HTMLInputElement], /* date */ js.Date) => Callback): Self = StObject.set(x, "onDateChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[HTMLInputElement], t1: /* date */ js.Date) => (value(t0, t1)).runNow()))
      
      inline def setOnDateChangeUndefined: Self = StObject.set(x, "onDateChange", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPresets(value: js.Array[DatePreset]): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
      
      inline def setPresetsUndefined: Self = StObject.set(x, "presets", js.undefined)
      
      inline def setPresetsVarargs(value: DatePreset*): Self = StObject.set(x, "presets", js.Array(value*))
      
      inline def setPresetsVariant(value: compact | expanded): Self = StObject.set(x, "presetsVariant", value.asInstanceOf[js.Any])
      
      inline def setPresetsVariantUndefined: Self = StObject.set(x, "presetsVariant", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValidationState(value: valid | invalid): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
      
      inline def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
      
      inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWrapperProps(value: Partial[BoxProps]): Self = StObject.set(x, "wrapperProps", value.asInstanceOf[js.Any])
      
      inline def setWrapperPropsUndefined: Self = StObject.set(x, "wrapperProps", js.undefined)
    }
  }
}
