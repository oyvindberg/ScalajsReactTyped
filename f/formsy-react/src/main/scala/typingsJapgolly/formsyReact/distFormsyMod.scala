package typingsJapgolly.formsyReact

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
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLFormElement
import typingsJapgolly.formsyReact.anon.Children
import typingsJapgolly.formsyReact.anon.Disabled
import typingsJapgolly.formsyReact.anon.IsRequired
import typingsJapgolly.formsyReact.anon.PartialFormsyProps
import typingsJapgolly.formsyReact.distInterfacesMod.FormsyContextInterface
import typingsJapgolly.formsyReact.distInterfacesMod.IModel
import typingsJapgolly.formsyReact.distInterfacesMod.IResetModel
import typingsJapgolly.formsyReact.distInterfacesMod.IUpdateInputsWithError
import typingsJapgolly.formsyReact.distInterfacesMod.IUpdateInputsWithValue
import typingsJapgolly.formsyReact.distInterfacesMod.InputComponent
import typingsJapgolly.formsyReact.distWithFormsyMod.PassDownProps
import typingsJapgolly.formsyReact.formsyReactStrings.`additions removals`
import typingsJapgolly.formsyReact.formsyReactStrings.`additions text`
import typingsJapgolly.formsyReact.formsyReactStrings.`inline`
import typingsJapgolly.formsyReact.formsyReactStrings.`removals additions`
import typingsJapgolly.formsyReact.formsyReactStrings.`removals text`
import typingsJapgolly.formsyReact.formsyReactStrings.`text additions`
import typingsJapgolly.formsyReact.formsyReactStrings.`text removals`
import typingsJapgolly.formsyReact.formsyReactStrings.additions
import typingsJapgolly.formsyReact.formsyReactStrings.all
import typingsJapgolly.formsyReact.formsyReactStrings.ascending
import typingsJapgolly.formsyReact.formsyReactStrings.assertive
import typingsJapgolly.formsyReact.formsyReactStrings.both
import typingsJapgolly.formsyReact.formsyReactStrings.copy
import typingsJapgolly.formsyReact.formsyReactStrings.date
import typingsJapgolly.formsyReact.formsyReactStrings.decimal
import typingsJapgolly.formsyReact.formsyReactStrings.descending
import typingsJapgolly.formsyReact.formsyReactStrings.dialog
import typingsJapgolly.formsyReact.formsyReactStrings.email
import typingsJapgolly.formsyReact.formsyReactStrings.execute
import typingsJapgolly.formsyReact.formsyReactStrings.grammar
import typingsJapgolly.formsyReact.formsyReactStrings.grid
import typingsJapgolly.formsyReact.formsyReactStrings.horizontal
import typingsJapgolly.formsyReact.formsyReactStrings.inherit
import typingsJapgolly.formsyReact.formsyReactStrings.link
import typingsJapgolly.formsyReact.formsyReactStrings.list
import typingsJapgolly.formsyReact.formsyReactStrings.listbox
import typingsJapgolly.formsyReact.formsyReactStrings.location
import typingsJapgolly.formsyReact.formsyReactStrings.menu
import typingsJapgolly.formsyReact.formsyReactStrings.mixed
import typingsJapgolly.formsyReact.formsyReactStrings.move
import typingsJapgolly.formsyReact.formsyReactStrings.no
import typingsJapgolly.formsyReact.formsyReactStrings.none
import typingsJapgolly.formsyReact.formsyReactStrings.numeric
import typingsJapgolly.formsyReact.formsyReactStrings.off
import typingsJapgolly.formsyReact.formsyReactStrings.on
import typingsJapgolly.formsyReact.formsyReactStrings.other
import typingsJapgolly.formsyReact.formsyReactStrings.page
import typingsJapgolly.formsyReact.formsyReactStrings.polite
import typingsJapgolly.formsyReact.formsyReactStrings.popup
import typingsJapgolly.formsyReact.formsyReactStrings.removals
import typingsJapgolly.formsyReact.formsyReactStrings.search
import typingsJapgolly.formsyReact.formsyReactStrings.spelling
import typingsJapgolly.formsyReact.formsyReactStrings.step
import typingsJapgolly.formsyReact.formsyReactStrings.tel
import typingsJapgolly.formsyReact.formsyReactStrings.text
import typingsJapgolly.formsyReact.formsyReactStrings.time
import typingsJapgolly.formsyReact.formsyReactStrings.tree
import typingsJapgolly.formsyReact.formsyReactStrings.url
import typingsJapgolly.formsyReact.formsyReactStrings.vertical
import typingsJapgolly.formsyReact.formsyReactStrings.yes
import typingsJapgolly.react.anon.Html
import typingsJapgolly.react.mod.AnimationEventHandler
import typingsJapgolly.react.mod.AriaRole
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ClipboardEventHandler
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.CompositionEventHandler
import typingsJapgolly.react.mod.DragEventHandler
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.FormEventHandler
import typingsJapgolly.react.mod.FormHTMLAttributes
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.PointerEventHandler
import typingsJapgolly.react.mod.ReactEventHandler
import typingsJapgolly.react.mod.TouchEventHandler
import typingsJapgolly.react.mod.TransitionEventHandler
import typingsJapgolly.react.mod.UIEventHandler
import typingsJapgolly.react.mod.WheelEventHandler
import typingsJapgolly.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFormsyMod {
  
  @JSImport("formsy-react/dist/Formsy", "Formsy")
  @js.native
  open class Formsy protected () extends Component[FormsyProps, FormsyState, Any] {
    def this(props: FormsyProps) = this()
    
    def attachToForm(component: Any): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MFormsy(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MFormsy(prevProps: FormsyProps): Unit = js.native
    
    def detachFromForm[V](component: InputComponent[V]): Unit = js.native
    
    var emptyArray: js.Array[Any] = js.native
    
    def getCurrentValues(): Any = js.native
    
    def getModel(): Any = js.native
    
    def getPristineValues(): Any = js.native
    
    var inputs: js.Array[InstanceType[Any & PassDownProps[Any]]] = js.native
    
    def isChanged(): Boolean = js.native
    
    def isFormDisabled(): Boolean = js.native
    
    def isValidValue(component: Any, value: Any): Boolean = js.native
    
    def mapModel(model: IModel): IModel = js.native
    
    var prevInputNames: js.Array[Any] | Null = js.native
    
    def reset(): Unit = js.native
    def reset(model: IModel): Unit = js.native
    
    /* private */ var resetInternal: Any = js.native
    
    /* private */ var resetModel: Any = js.native
    
    def runValidation[V](component: InputComponent[V]): IsRequired = js.native
    def runValidation[V](component: InputComponent[V], value: V): IsRequired = js.native
    
    def setFormPristine(isPristine: Boolean): Unit = js.native
    
    def setFormValidState(allIsValid: Boolean): Unit = js.native
    
    def setInputValidationErrors(errors: Any): Unit = js.native
    
    def submit(): Unit = js.native
    def submit(event: ReactEventFrom[Element]): Unit = js.native
    
    /* private */ val throttledValidateForm: Any = js.native
    
    var updateInputsWithError: IUpdateInputsWithError = js.native
    
    var updateInputsWithValue: IUpdateInputsWithValue[Any] = js.native
    
    def validate[V](component: InputComponent[V]): Unit = js.native
    
    def validateForm(): Unit = js.native
  }
  /* static members */
  object Formsy {
    
    @JSImport("formsy-react/dist/Formsy", "Formsy")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("formsy-react/dist/Formsy", "Formsy.defaultProps")
    @js.native
    def defaultProps: PartialFormsyProps = js.native
    inline def defaultProps_=(x: PartialFormsyProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("formsy-react/dist/Formsy", "Formsy.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("formsy-react/dist/Formsy", "Formsy.propTypes")
    @js.native
    def propTypes: Disabled = js.native
    inline def propTypes_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  type FormElementType = String | ComponentType[Children]
  
  /* Inlined std.Omit<react.react.FormHTMLAttributes<std.HTMLFormElement>, 'onChange' | 'onSubmit'> */
  trait FormHTMLAttributesCleaned extends StObject {
    
    var about: js.UndefOr[String] = js.undefined
    
    var acceptCharset: js.UndefOr[String] = js.undefined
    
    var accessKey: js.UndefOr[String] = js.undefined
    
    var action: js.UndefOr[String] = js.undefined
    
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
    
    var autoCapitalize: js.UndefOr[String] = js.undefined
    
    var autoComplete: js.UndefOr[String] = js.undefined
    
    var autoCorrect: js.UndefOr[String] = js.undefined
    
    var autoSave: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
    
    var contextMenu: js.UndefOr[String] = js.undefined
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
    
    var datatype: js.UndefOr[String] = js.undefined
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var draggable: js.UndefOr[Booleanish] = js.undefined
    
    var encType: js.UndefOr[String] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inlist: js.UndefOr[Any] = js.undefined
    
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
    
    var is: js.UndefOr[String] = js.undefined
    
    var itemID: js.UndefOr[String] = js.undefined
    
    var itemProp: js.UndefOr[String] = js.undefined
    
    var itemRef: js.UndefOr[String] = js.undefined
    
    var itemScope: js.UndefOr[Boolean] = js.undefined
    
    var itemType: js.UndefOr[String] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var noValidate: js.UndefOr[Boolean] = js.undefined
    
    var onAbort: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.undefined
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLFormElement]] = js.undefined
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLFormElement]] = js.undefined
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLFormElement]] = js.undefined
    
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLFormElement]] = js.undefined
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLFormElement]] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLFormElement]] = js.undefined
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.undefined
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLFormElement]] = js.undefined
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLFormElement]] = js.undefined
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLFormElement]] = js.undefined
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLFormElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLFormElement]] = js.undefined
    
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLFormElement]] = js.undefined
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLFormElement]] = js.undefined
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLFormElement]] = js.undefined
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLFormElement]] = js.undefined
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLFormElement]] = js.undefined
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLFormElement]] = js.undefined
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLFormElement]] = js.undefined
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLFormElement]] = js.undefined
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLFormElement]] = js.undefined
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLFormElement]] = js.undefined
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLFormElement]] = js.undefined
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.undefined
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.undefined
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.undefined
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.undefined
    
    var onError: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLFormElement]] = js.undefined
    
    var onInput: js.UndefOr[FormEventHandler[HTMLFormElement]] = js.undefined
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLFormElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLFormElement]] = js.undefined
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLFormElement]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLFormElement]] = js.undefined
    
    var onLoad: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.undefined
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.undefined
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.undefined
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLFormElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLFormElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLFormElement]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLFormElement]] = js.undefined
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLFormElement]] = js.undefined
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLFormElement]] = js.undefined
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLFormElement]] = js.undefined
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLFormElement]] = js.undefined
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.undefined
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.undefined
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.undefined
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLFormElement]] = js.undefined
    
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLFormElement]] = js.undefined
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLFormElement]] = js.undefined
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLFormElement]] = js.undefined
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLFormElement]] = js.undefined
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLFormElement]] = js.undefined
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLFormElement]] = js.undefined
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLFormElement]] = js.undefined
    
    var onProgress: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.undefined
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.undefined
    
    var onReset: js.UndefOr[FormEventHandler[HTMLFormElement]] = js.undefined
    
    var onScroll: js.UndefOr[UIEventHandler[HTMLFormElement]] = js.undefined
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.undefined
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.undefined
    
    var onSelect: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.undefined
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.undefined
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.undefined
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.undefined
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLFormElement]] = js.undefined
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLFormElement]] = js.undefined
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLFormElement]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLFormElement]] = js.undefined
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLFormElement]] = js.undefined
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.undefined
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.undefined
    
    var onWheel: js.UndefOr[WheelEventHandler[HTMLFormElement]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    var radioGroup: js.UndefOr[String] = js.undefined
    
    var rel: js.UndefOr[String] = js.undefined
    
    var resource: js.UndefOr[String] = js.undefined
    
    var results: js.UndefOr[Double] = js.undefined
    
    var role: js.UndefOr[AriaRole] = js.undefined
    
    var security: js.UndefOr[String] = js.undefined
    
    var slot: js.UndefOr[String] = js.undefined
    
    var spellCheck: js.UndefOr[Booleanish] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var translate: js.UndefOr[yes | no] = js.undefined
    
    var typeof: js.UndefOr[String] = js.undefined
    
    var unselectable: js.UndefOr[on | off] = js.undefined
    
    var vocab: js.UndefOr[String] = js.undefined
  }
  object FormHTMLAttributesCleaned {
    
    inline def apply(): FormHTMLAttributesCleaned = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormHTMLAttributesCleaned]
    }
    
    extension [Self <: FormHTMLAttributesCleaned](x: Self) {
      
      inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      inline def setAcceptCharset(value: String): Self = StObject.set(x, "acceptCharset", value.asInstanceOf[js.Any])
      
      inline def setAcceptCharsetUndefined: Self = StObject.set(x, "acceptCharset", js.undefined)
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
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
      
      inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setEncType(value: String): Self = StObject.set(x, "encType", value.asInstanceOf[js.Any])
      
      inline def setEncTypeUndefined: Self = StObject.set(x, "encType", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
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
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNoValidate(value: Boolean): Self = StObject.set(x, "noValidate", value.asInstanceOf[js.Any])
      
      inline def setNoValidateUndefined: Self = StObject.set(x, "noValidate", js.undefined)
      
      inline def setOnAbort(value: ReactEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onAbort", js.Any.fromFunction1((t0: ReactEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnAnimationEnd(value: ReactAnimationEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnAnimationIteration(value: ReactAnimationEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      inline def setOnAnimationStart(value: ReactAnimationEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      inline def setOnAuxClick(value: ReactMouseEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      inline def setOnBeforeInput(value: ReactEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      inline def setOnBlur(value: ReactFocusEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCanPlay(value: ReactEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnCanPlayThrough(value: ReactEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      inline def setOnClick(value: ReactMouseEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnCompositionEnd(value: ReactCompositionEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      inline def setOnCompositionStart(value: ReactCompositionEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      inline def setOnCompositionUpdate(value: ReactCompositionEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      inline def setOnContextMenu(value: ReactMouseEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnCopy(value: ReactClipboardEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnCut(value: ReactClipboardEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      inline def setOnDoubleClick(value: ReactMouseEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnDrag(value: ReactDragEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnDragEnd(value: ReactDragEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(value: ReactDragEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragExit(value: ReactDragEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      inline def setOnDragLeave(value: ReactDragEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: ReactDragEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: ReactDragEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDrop(value: ReactDragEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnDurationChange(value: ReactEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      inline def setOnEmptied(value: ReactEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      inline def setOnEncrypted(value: ReactEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      inline def setOnEnded(value: ReactEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onEnded", js.Any.fromFunction1((t0: ReactEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnError(value: ReactEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFocus(value: ReactFocusEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInput(value: ReactEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnInvalid(value: ReactEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setOnKeyDown(value: ReactKeyboardEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: ReactKeyboardEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: ReactKeyboardEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnLoad(value: ReactEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnLoadStart(value: ReactEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnLoadedData(value: ReactEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      inline def setOnLoadedMetadata(value: ReactEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      inline def setOnMouseDown(value: ReactMouseEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: ReactMouseEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: ReactMouseEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: ReactMouseEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(value: ReactMouseEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(value: ReactMouseEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnMouseUp(value: ReactMouseEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnPaste(value: ReactClipboardEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnPause(value: ReactEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onPause", js.Any.fromFunction1((t0: ReactEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: ReactEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnPlaying(value: ReactEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      inline def setOnPointerCancel(value: ReactPointerEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: ReactPointerEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: ReactPointerEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: ReactPointerEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: ReactPointerEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerOut(value: ReactPointerEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      inline def setOnPointerOver(value: ReactPointerEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      inline def setOnPointerUp(value: ReactPointerEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnProgress(value: ReactEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onProgress", js.Any.fromFunction1((t0: ReactEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnRateChange(value: ReactEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      inline def setOnReset(value: ReactEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onReset", js.Any.fromFunction1((t0: ReactEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnScroll(value: ReactUIEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSeeked(value: ReactEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      inline def setOnSeeking(value: ReactEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      inline def setOnSelect(value: ReactEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: ReactEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnStalled(value: ReactEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onStalled", js.Any.fromFunction1((t0: ReactEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      inline def setOnSuspend(value: ReactEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      inline def setOnTimeUpdate(value: ReactEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      inline def setOnTouchCancel(value: ReactTouchEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: ReactTouchEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: ReactTouchEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: ReactTouchEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnTransitionEnd(value: ReactTransitionEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setOnVolumeChange(value: ReactEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      inline def setOnWaiting(value: ReactEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      inline def setOnWheel(value: ReactWheelEventFrom[HTMLFormElement & Element] => Callback): Self = StObject.set(x, "onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[HTMLFormElement & Element]) => value(t0).runNow()))
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      inline def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
    }
  }
  
  trait FormsyProps
    extends StObject
       with FormHTMLAttributesCleaned {
    
    var disabled: Boolean
    
    var formElement: js.UndefOr[FormElementType] = js.undefined
    
    var mapping: Null | (js.Function1[/* model */ IModel, IModel])
    
    def onChange(model: IModel, isChanged: Boolean): Unit
    
    var onInvalidSubmit: OnSubmitCallback
    
    @JSName("onInvalid")
    def onInvalid_MFormsyProps(): Unit
    
    @JSName("onReset")
    var onReset_FormsyProps: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSubmit: js.UndefOr[OnSubmitCallback] = js.undefined
    
    def onValid(): Unit
    
    var onValidSubmit: js.UndefOr[OnSubmitCallback] = js.undefined
    
    var preventDefaultSubmit: js.UndefOr[Boolean] = js.undefined
    
    var preventExternalInvalidation: js.UndefOr[Boolean] = js.undefined
    
    var validationErrors: js.UndefOr[Null | js.Object] = js.undefined
  }
  object FormsyProps {
    
    inline def apply(
      disabled: Boolean,
      onChange: (IModel, Boolean) => Callback,
      onInvalid: Callback,
      onInvalidSubmit: (/* model */ IModel, /* resetModel */ IResetModel, /* updateInputsWithError */ IUpdateInputsWithError, /* event */ ReactEventFrom[FormHTMLAttributes[Any] & Element]) => Callback,
      onValid: Callback
    ): FormsyProps = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], onChange = js.Any.fromFunction2((t0: IModel, t1: Boolean) => (onChange(t0, t1)).runNow()), onInvalid = onInvalid.toJsFn, onInvalidSubmit = js.Any.fromFunction4((t0: /* model */ IModel, t1: /* resetModel */ IResetModel, t2: /* updateInputsWithError */ IUpdateInputsWithError, t3: /* event */ ReactEventFrom[FormHTMLAttributes[Any] & Element]) => (onInvalidSubmit(t0, t1, t2, t3)).runNow()), onValid = onValid.toJsFn, mapping = null)
      __obj.asInstanceOf[FormsyProps]
    }
    
    extension [Self <: FormsyProps](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setFormElement(value: FormElementType): Self = StObject.set(x, "formElement", value.asInstanceOf[js.Any])
      
      inline def setFormElementUndefined: Self = StObject.set(x, "formElement", js.undefined)
      
      inline def setMapping(value: /* model */ IModel => IModel): Self = StObject.set(x, "mapping", js.Any.fromFunction1(value))
      
      inline def setMappingNull: Self = StObject.set(x, "mapping", null)
      
      inline def setOnChange(value: (IModel, Boolean) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: IModel, t1: Boolean) => (value(t0, t1)).runNow()))
      
      inline def setOnInvalid(value: Callback): Self = StObject.set(x, "onInvalid", value.toJsFn)
      
      inline def setOnInvalidSubmit(
        value: (/* model */ IModel, /* resetModel */ IResetModel, /* updateInputsWithError */ IUpdateInputsWithError, /* event */ ReactEventFrom[FormHTMLAttributes[Any] & Element]) => Callback
      ): Self = StObject.set(x, "onInvalidSubmit", js.Any.fromFunction4((t0: /* model */ IModel, t1: /* resetModel */ IResetModel, t2: /* updateInputsWithError */ IUpdateInputsWithError, t3: /* event */ ReactEventFrom[FormHTMLAttributes[Any] & Element]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setOnReset(value: Callback): Self = StObject.set(x, "onReset", value.toJsFn)
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnSubmit(
        value: (/* model */ IModel, /* resetModel */ IResetModel, /* updateInputsWithError */ IUpdateInputsWithError, /* event */ ReactEventFrom[FormHTMLAttributes[Any] & Element]) => Callback
      ): Self = StObject.set(x, "onSubmit", js.Any.fromFunction4((t0: /* model */ IModel, t1: /* resetModel */ IResetModel, t2: /* updateInputsWithError */ IUpdateInputsWithError, t3: /* event */ ReactEventFrom[FormHTMLAttributes[Any] & Element]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnValid(value: Callback): Self = StObject.set(x, "onValid", value.toJsFn)
      
      inline def setOnValidSubmit(
        value: (/* model */ IModel, /* resetModel */ IResetModel, /* updateInputsWithError */ IUpdateInputsWithError, /* event */ ReactEventFrom[FormHTMLAttributes[Any] & Element]) => Callback
      ): Self = StObject.set(x, "onValidSubmit", js.Any.fromFunction4((t0: /* model */ IModel, t1: /* resetModel */ IResetModel, t2: /* updateInputsWithError */ IUpdateInputsWithError, t3: /* event */ ReactEventFrom[FormHTMLAttributes[Any] & Element]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setOnValidSubmitUndefined: Self = StObject.set(x, "onValidSubmit", js.undefined)
      
      inline def setPreventDefaultSubmit(value: Boolean): Self = StObject.set(x, "preventDefaultSubmit", value.asInstanceOf[js.Any])
      
      inline def setPreventDefaultSubmitUndefined: Self = StObject.set(x, "preventDefaultSubmit", js.undefined)
      
      inline def setPreventExternalInvalidation(value: Boolean): Self = StObject.set(x, "preventExternalInvalidation", value.asInstanceOf[js.Any])
      
      inline def setPreventExternalInvalidationUndefined: Self = StObject.set(x, "preventExternalInvalidation", js.undefined)
      
      inline def setValidationErrors(value: js.Object): Self = StObject.set(x, "validationErrors", value.asInstanceOf[js.Any])
      
      inline def setValidationErrorsNull: Self = StObject.set(x, "validationErrors", null)
      
      inline def setValidationErrorsUndefined: Self = StObject.set(x, "validationErrors", js.undefined)
    }
  }
  
  trait FormsyState extends StObject {
    
    var canChange: Boolean
    
    var contextValue: FormsyContextInterface
    
    var formSubmitted: js.UndefOr[Boolean] = js.undefined
    
    var isPristine: js.UndefOr[Boolean] = js.undefined
    
    var isSubmitting: Boolean
    
    var isValid: Boolean
  }
  object FormsyState {
    
    inline def apply(canChange: Boolean, contextValue: FormsyContextInterface, isSubmitting: Boolean, isValid: Boolean): FormsyState = {
      val __obj = js.Dynamic.literal(canChange = canChange.asInstanceOf[js.Any], contextValue = contextValue.asInstanceOf[js.Any], isSubmitting = isSubmitting.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormsyState]
    }
    
    extension [Self <: FormsyState](x: Self) {
      
      inline def setCanChange(value: Boolean): Self = StObject.set(x, "canChange", value.asInstanceOf[js.Any])
      
      inline def setContextValue(value: FormsyContextInterface): Self = StObject.set(x, "contextValue", value.asInstanceOf[js.Any])
      
      inline def setFormSubmitted(value: Boolean): Self = StObject.set(x, "formSubmitted", value.asInstanceOf[js.Any])
      
      inline def setFormSubmittedUndefined: Self = StObject.set(x, "formSubmitted", js.undefined)
      
      inline def setIsPristine(value: Boolean): Self = StObject.set(x, "isPristine", value.asInstanceOf[js.Any])
      
      inline def setIsPristineUndefined: Self = StObject.set(x, "isPristine", js.undefined)
      
      inline def setIsSubmitting(value: Boolean): Self = StObject.set(x, "isSubmitting", value.asInstanceOf[js.Any])
      
      inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    }
  }
  
  type OnSubmitCallback = js.Function4[
    /* model */ IModel, 
    /* resetModel */ IResetModel, 
    /* updateInputsWithError */ IUpdateInputsWithError, 
    /* event */ ReactEventFrom[FormHTMLAttributes[Any] & Element], 
    Unit
  ]
}
