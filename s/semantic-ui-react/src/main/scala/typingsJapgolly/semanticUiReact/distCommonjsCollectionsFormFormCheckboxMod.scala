package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactAnimationEventFrom
import japgolly.scalajs.react.ReactClipboardEventFrom
import japgolly.scalajs.react.ReactCompositionEventFrom
import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactPointerEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.ReactTransitionEventFrom
import japgolly.scalajs.react.ReactUIEventFrom
import japgolly.scalajs.react.ReactWheelEventFrom
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.anon.Html
import typingsJapgolly.react.mod.AnimationEventHandler
import typingsJapgolly.react.mod.AriaAttributes
import typingsJapgolly.react.mod.AriaRole
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ChangeEventHandler
import typingsJapgolly.react.mod.ClipboardEventHandler
import typingsJapgolly.react.mod.CompositionEventHandler
import typingsJapgolly.react.mod.DragEventHandler
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.FormEventHandler
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.PointerEventHandler
import typingsJapgolly.react.mod.ReactEventHandler
import typingsJapgolly.react.mod.TouchEventHandler
import typingsJapgolly.react.mod.TransitionEventHandler
import typingsJapgolly.react.mod.UIEventHandler
import typingsJapgolly.react.mod.WheelEventHandler
import typingsJapgolly.react.reactStrings.decimal
import typingsJapgolly.react.reactStrings.done
import typingsJapgolly.react.reactStrings.email
import typingsJapgolly.react.reactStrings.enter
import typingsJapgolly.react.reactStrings.environment
import typingsJapgolly.react.reactStrings.go
import typingsJapgolly.react.reactStrings.inherit
import typingsJapgolly.react.reactStrings.next
import typingsJapgolly.react.reactStrings.no
import typingsJapgolly.react.reactStrings.none
import typingsJapgolly.react.reactStrings.numeric
import typingsJapgolly.react.reactStrings.off
import typingsJapgolly.react.reactStrings.on
import typingsJapgolly.react.reactStrings.previous
import typingsJapgolly.react.reactStrings.search
import typingsJapgolly.react.reactStrings.send
import typingsJapgolly.react.reactStrings.tel
import typingsJapgolly.react.reactStrings.text
import typingsJapgolly.react.reactStrings.url
import typingsJapgolly.react.reactStrings.user
import typingsJapgolly.react.reactStrings.yes
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsFormFormFieldMod.StrictFormFieldProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesCheckboxCheckboxMod.CheckboxProps
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.checkbox
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.radio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsCollectionsFormFormCheckboxMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Form/FormCheckbox", JSImport.Default)
  @js.native
  val default: FC[FormCheckboxProps] = js.native
  
  trait FormCheckboxProps
    extends StObject
       with StrictFormCheckboxProps
       with /* key */ StringDictionary[Any]
  object FormCheckboxProps {
    
    inline def apply(): FormCheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormCheckboxProps]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - typingsJapgolly.react.mod.DOMAttributes because var conflicts: children, onChange, onClick, onMouseDown, onMouseUp. Inlined onKeyDown, onPlaying, onMouseOver, onMouseMove, onPointerCancel, onDragStart, onMouseEnter, onDragEnter, onPointerOver, onDragLeave, onMouseOut, onVolumeChange, onSelect, onAnimationStart, onLoadedData, onTouchStart, onInput, onCompositionStart, onScroll, onDragEnd, onLoadStart, dangerouslySetInnerHTML, onFocus, onContextMenu, onError, onTouchMove, onTouchEnd, onDrag, onEnded, onAnimationIteration, onWaiting, onCompositionEnd, onDoubleClick, onEmptied, onStalled, onKeyPress, onPointerLeave, onAuxClick, onWheel, onPointerUp, onProgress, onBlur, onPointerMove, onPause, onDrop, onReset, onPointerDown, onDragOver, onTimeUpdate, onDurationChange, onSubmit, onSuspend, onTransitionEnd, onCanPlay, onDragExit, onEncrypted, onPlay, onPointerOut, onCopy, onAbort, onInvalid, onCompositionUpdate, onTouchCancel, onCanPlayThrough, onLoad, onLoadedMetadata, onSeeked, onPointerEnter, onBeforeInput, onAnimationEnd, onCut, onSeeking, onPaste, onMouseLeave, onRateChange, onKeyUp
  - js.Any because Inheritance from two classes. Inlined 
  - typingsJapgolly.react.mod.HTMLAttributes because var conflicts: children, className, defaultChecked, id, onChange, onClick, onMouseDown, onMouseUp, tabIndex. Inlined contextMenu, vocab, typeof, inputMode, is, about, accessKey, itemScope, style, security, defaultValue, autoSave, prefix, resource, suppressHydrationWarning, itemType, spellCheck, slot, autoCapitalize, placeholder, radioGroup, lang, color, suppressContentEditableWarning, translate, itemID, dir, draggable, contentEditable, itemRef, hidden, inlist, property, unselectable, role, datatype, itemProp, title, autoCorrect, results
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - typingsJapgolly.react.mod.InputHTMLAttributes because Inheritance from two classes. Inlined formAction, alt, src, max, multiple, height, enterKeyHint, min, capture, size, maxLength, formEncType, pattern, form, accept, step, minLength, formMethod, formTarget, autoFocus, crossOrigin, onChange_InputHTMLAttributes, formNoValidate, list, autoComplete
  - typingsJapgolly.semanticUiReact.distCommonjsModulesCheckboxCheckboxMod.StrictCheckboxProps because Inheritance from two classes. Inlined checked, defaultChecked, defaultIndeterminate, fitted, indeterminate, name, onChange, onClick, onMouseDown, onMouseUp, radio, readOnly, slider, tabIndex, toggle, value */ trait StrictFormCheckboxProps
    extends StObject
       with StrictFormFieldProps
       with AriaAttributes {
    
    // RDFa Attributes
    var about: js.UndefOr[String] = js.undefined
    
    var accept: js.UndefOr[String] = js.undefined
    
    // Standard HTML Attributes
    var accessKey: js.UndefOr[String] = js.undefined
    
    var alt: js.UndefOr[String] = js.undefined
    
    // Non-standard Attributes
    var autoCapitalize: js.UndefOr[String] = js.undefined
    
    var autoComplete: js.UndefOr[String] = js.undefined
    
    var autoCorrect: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var autoSave: js.UndefOr[String] = js.undefined
    
    var capture: js.UndefOr[Boolean | user | environment] = js.undefined
    
    /** Whether or not checkbox is checked. */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
    
    var contextMenu: js.UndefOr[String] = js.undefined
    
    var crossOrigin: js.UndefOr[String] = js.undefined
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
    
    var datatype: js.UndefOr[String] = js.undefined
    
    /** The initial value of checked. */
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    /** Whether or not checkbox is indeterminate. */
    var defaultIndeterminate: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var draggable: js.UndefOr[Booleanish] = js.undefined
    
    var enterKeyHint: js.UndefOr[enter | done | go | next | previous | search | send] = js.undefined
    
    /** Removes padding for a label. Auto applied when there is no label. */
    var fitted: js.UndefOr[Boolean] = js.undefined
    
    var form: js.UndefOr[String] = js.undefined
    
    var formAction: js.UndefOr[String] = js.undefined
    
    var formEncType: js.UndefOr[String] = js.undefined
    
    var formMethod: js.UndefOr[String] = js.undefined
    
    var formNoValidate: js.UndefOr[Boolean] = js.undefined
    
    var formTarget: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[Double | String] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    /** Whether or not checkbox is indeterminate. */
    var indeterminate: js.UndefOr[Boolean] = js.undefined
    
    var inlist: js.UndefOr[Any] = js.undefined
    
    // Living Standard
    /**
      * Hints at the type of data that might be entered by the user while editing the element or its contents
      * @see https://html.spec.whatwg.org/multipage/interaction.html#input-modalities:-the-inputmode-attribute
      */
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
    
    /**
      * Specify that a standard HTML element should behave like a defined custom built-in element
      * @see https://html.spec.whatwg.org/multipage/custom-elements.html#attr-is
      */
    var is: js.UndefOr[String] = js.undefined
    
    var itemID: js.UndefOr[String] = js.undefined
    
    var itemProp: js.UndefOr[String] = js.undefined
    
    var itemRef: js.UndefOr[String] = js.undefined
    
    var itemScope: js.UndefOr[Boolean] = js.undefined
    
    var itemType: js.UndefOr[String] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var list: js.UndefOr[String] = js.undefined
    
    var max: js.UndefOr[Double | String] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double | String] = js.undefined
    
    var minLength: js.UndefOr[Double] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    /** The HTML input name. */
    var name: js.UndefOr[String] = js.undefined
    
    // Media Events
    var onAbort: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.undefined
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.undefined
    
    // Animation Events
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.undefined
    
    // MouseEvents
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    /**
      * Called when the user attempts to change the checked state.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and proposed checked/indeterminate state.
      */
    var onChange: js.UndefOr[
        js.Function2[/* event */ ReactEventFrom[HTMLInputElement], /* data */ CheckboxProps, Unit]
      ] = js.undefined
    @JSName("onChange")
    var onChange_InputHTMLAttributes: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    /**
      * Called when the checkbox or label is clicked.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and current checked/indeterminate state.
      */
    var onClick: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLInputElement], /* data */ CheckboxProps, Unit]
      ] = js.undefined
    
    // Composition Events
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    // Clipboard Events
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onError: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    // Focus Events
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onInput: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    // also a Media Event
    // Keyboard Events
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    /** @deprecated */
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    // Image Events
    var onLoad: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    /**
      * Called when the user presses down on the mouse.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and current checked/indeterminate state.
      */
    var onMouseDown: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLInputElement], /* data */ CheckboxProps, Unit]
      ] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    /**
      * Called when the user releases the mouse.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and current checked/indeterminate state.
      */
    var onMouseUp: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLInputElement], /* data */ CheckboxProps, Unit]
      ] = js.undefined
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    // Pointer Events
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onProgress: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onReset: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    // UI Events
    var onScroll: js.UndefOr[UIEventHandler[HTMLInputElement]] = js.undefined
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    // Selection Events
    var onSelect: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    // Touch Events
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    // Transition Events
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLInputElement]] = js.undefined
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    // Wheel Events
    var onWheel: js.UndefOr[WheelEventHandler[HTMLInputElement]] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    /** Format as a radio element. This means it is an exclusive option. */
    var radio: js.UndefOr[Boolean] = js.undefined
    
    // Unknown
    var radioGroup: js.UndefOr[String] = js.undefined
    
    /** A checkbox can be read-only and unable to change states. */
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var resource: js.UndefOr[String] = js.undefined
    
    var results: js.UndefOr[Double] = js.undefined
    
    // <command>, <menuitem>
    // WAI-ARIA
    var role: js.UndefOr[AriaRole] = js.undefined
    
    var security: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    /** Format to emphasize the current selection state. */
    var slider: js.UndefOr[Boolean] = js.undefined
    
    var slot: js.UndefOr[String] = js.undefined
    
    var spellCheck: js.UndefOr[Booleanish] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
    
    var step: js.UndefOr[Double | String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
    
    /** A checkbox can receive focus. */
    var tabIndex: js.UndefOr[Double | String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    /** Format to show an on or off choice. */
    var toggle: js.UndefOr[Boolean] = js.undefined
    
    var translate: js.UndefOr[yes | no] = js.undefined
    
    /** HTML input type, either checkbox or radio. */
    @JSName("type")
    var type_StrictFormCheckboxProps: js.UndefOr[checkbox | radio] = js.undefined
    
    var typeof: js.UndefOr[String] = js.undefined
    
    var unselectable: js.UndefOr[on | off] = js.undefined
    
    /** The HTML input value. */
    var value: js.UndefOr[Double | String] = js.undefined
    
    var vocab: js.UndefOr[String] = js.undefined
  }
  object StrictFormCheckboxProps {
    
    inline def apply(): StrictFormCheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictFormCheckboxProps]
    }
    
    extension [Self <: StrictFormCheckboxProps](x: Self) {
      
      inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      inline def setCapture(value: Boolean | user | environment): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDefaultIndeterminate(value: Boolean): Self = StObject.set(x, "defaultIndeterminate", value.asInstanceOf[js.Any])
      
      inline def setDefaultIndeterminateUndefined: Self = StObject.set(x, "defaultIndeterminate", js.undefined)
      
      inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setEnterKeyHint(value: enter | done | go | next | previous | search | send): Self = StObject.set(x, "enterKeyHint", value.asInstanceOf[js.Any])
      
      inline def setEnterKeyHintUndefined: Self = StObject.set(x, "enterKeyHint", js.undefined)
      
      inline def setFitted(value: Boolean): Self = StObject.set(x, "fitted", value.asInstanceOf[js.Any])
      
      inline def setFittedUndefined: Self = StObject.set(x, "fitted", js.undefined)
      
      inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
      
      inline def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
      
      inline def setFormEncType(value: String): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
      
      inline def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
      
      inline def setFormMethod(value: String): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
      
      inline def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
      
      inline def setFormNoValidate(value: Boolean): Self = StObject.set(x, "formNoValidate", value.asInstanceOf[js.Any])
      
      inline def setFormNoValidateUndefined: Self = StObject.set(x, "formNoValidate", js.undefined)
      
      inline def setFormTarget(value: String): Self = StObject.set(x, "formTarget", value.asInstanceOf[js.Any])
      
      inline def setFormTargetUndefined: Self = StObject.set(x, "formTarget", js.undefined)
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
      
      inline def setInlist(value: Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      inline def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      inline def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      inline def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      inline def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      inline def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      inline def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      inline def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      inline def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      inline def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnAbort(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onAbort", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnAnimationEnd(value: ReactAnimationEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnAnimationIteration(value: ReactAnimationEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      inline def setOnAnimationStart(value: ReactAnimationEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      inline def setOnAuxClick(value: ReactMouseEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      inline def setOnBeforeInput(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      inline def setOnBlur(value: ReactFocusEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCanPlay(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnCanPlayThrough(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      inline def setOnChange(
        value: ChangeEventHandler[HTMLInputElement] | (js.Function2[/* event */ ReactEventFrom[HTMLInputElement], /* data */ CheckboxProps, Unit])
      ): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnChangeFunction1(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnChangeFunction2(value: (/* event */ ReactEventFrom[HTMLInputElement], /* data */ CheckboxProps) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[HTMLInputElement], t1: /* data */ CheckboxProps) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: (/* event */ ReactMouseEventFrom[HTMLInputElement], /* data */ CheckboxProps) => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLInputElement], t1: /* data */ CheckboxProps) => (value(t0, t1)).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnCompositionEnd(value: ReactCompositionEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      inline def setOnCompositionStart(value: ReactCompositionEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      inline def setOnCompositionUpdate(value: ReactCompositionEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      inline def setOnContextMenu(value: ReactMouseEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnCopy(value: ReactClipboardEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnCut(value: ReactClipboardEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      inline def setOnDoubleClick(value: ReactMouseEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnDrag(value: ReactDragEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnDragEnd(value: ReactDragEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(value: ReactDragEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragExit(value: ReactDragEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      inline def setOnDragLeave(value: ReactDragEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: ReactDragEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: ReactDragEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDrop(value: ReactDragEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnDurationChange(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      inline def setOnEmptied(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      inline def setOnEncrypted(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      inline def setOnEnded(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onEnded", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnError(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFocus(value: ReactFocusEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInput(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnInvalid(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setOnKeyDown(value: ReactKeyboardEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: ReactKeyboardEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: ReactKeyboardEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnLoad(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnLoadStart(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnLoadedData(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      inline def setOnLoadedMetadata(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      inline def setOnMouseDown(value: (/* event */ ReactMouseEventFrom[HTMLInputElement], /* data */ CheckboxProps) => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLInputElement], t1: /* data */ CheckboxProps) => (value(t0, t1)).runNow()))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: ReactMouseEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: ReactMouseEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: ReactMouseEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(value: ReactMouseEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(value: ReactMouseEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnMouseUp(value: (/* event */ ReactMouseEventFrom[HTMLInputElement], /* data */ CheckboxProps) => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLInputElement], t1: /* data */ CheckboxProps) => (value(t0, t1)).runNow()))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnPaste(value: ReactClipboardEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnPause(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onPause", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnPlaying(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      inline def setOnPointerCancel(value: ReactPointerEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: ReactPointerEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: ReactPointerEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: ReactPointerEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: ReactPointerEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerOut(value: ReactPointerEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      inline def setOnPointerOver(value: ReactPointerEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      inline def setOnPointerUp(value: ReactPointerEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnProgress(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onProgress", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnRateChange(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      inline def setOnReset(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onReset", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnScroll(value: ReactUIEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSeeked(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      inline def setOnSeeking(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      inline def setOnSelect(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnStalled(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onStalled", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      inline def setOnSubmit(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnSuspend(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      inline def setOnTimeUpdate(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      inline def setOnTouchCancel(value: ReactTouchEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: ReactTouchEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: ReactTouchEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: ReactTouchEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnTransitionEnd(value: ReactTransitionEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setOnVolumeChange(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      inline def setOnWaiting(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      inline def setOnWheel(value: ReactWheelEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setRadio(value: Boolean): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
      
      inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      inline def setRadioUndefined: Self = StObject.set(x, "radio", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSlider(value: Boolean): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
      
      inline def setSliderUndefined: Self = StObject.set(x, "slider", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setStep(value: Double | String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      inline def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      inline def setTabIndex(value: Double | String): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setToggle(value: Boolean): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setType(value: checkbox | radio): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
    }
  }
  
  type _To = FC[FormCheckboxProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsCollectionsFormFormCheckboxMod.foo` */
  override def _to: FC[FormCheckboxProps] = default
}
