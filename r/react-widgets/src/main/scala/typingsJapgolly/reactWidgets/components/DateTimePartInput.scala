package typingsJapgolly.reactWidgets.components

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
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.anon.Html
import typingsJapgolly.react.mod.AriaRole
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactWidgets.anon.PickPropsariaactivedescen
import typingsJapgolly.reactWidgets.reactWidgetsStrings.`additions removals`
import typingsJapgolly.reactWidgets.reactWidgetsStrings.`additions text`
import typingsJapgolly.reactWidgets.reactWidgetsStrings.`inline`
import typingsJapgolly.reactWidgets.reactWidgetsStrings.`removals additions`
import typingsJapgolly.reactWidgets.reactWidgetsStrings.`removals text`
import typingsJapgolly.reactWidgets.reactWidgetsStrings.`text additions`
import typingsJapgolly.reactWidgets.reactWidgetsStrings.`text removals`
import typingsJapgolly.reactWidgets.reactWidgetsStrings.additions
import typingsJapgolly.reactWidgets.reactWidgetsStrings.all
import typingsJapgolly.reactWidgets.reactWidgetsStrings.ascending
import typingsJapgolly.reactWidgets.reactWidgetsStrings.assertive
import typingsJapgolly.reactWidgets.reactWidgetsStrings.both
import typingsJapgolly.reactWidgets.reactWidgetsStrings.copy
import typingsJapgolly.reactWidgets.reactWidgetsStrings.date
import typingsJapgolly.reactWidgets.reactWidgetsStrings.decimal
import typingsJapgolly.reactWidgets.reactWidgetsStrings.descending
import typingsJapgolly.reactWidgets.reactWidgetsStrings.dialog
import typingsJapgolly.reactWidgets.reactWidgetsStrings.email
import typingsJapgolly.reactWidgets.reactWidgetsStrings.environment
import typingsJapgolly.reactWidgets.reactWidgetsStrings.execute
import typingsJapgolly.reactWidgets.reactWidgetsStrings.grammar
import typingsJapgolly.reactWidgets.reactWidgetsStrings.grid
import typingsJapgolly.reactWidgets.reactWidgetsStrings.horizontal
import typingsJapgolly.reactWidgets.reactWidgetsStrings.inherit
import typingsJapgolly.reactWidgets.reactWidgetsStrings.link
import typingsJapgolly.reactWidgets.reactWidgetsStrings.list
import typingsJapgolly.reactWidgets.reactWidgetsStrings.listbox
import typingsJapgolly.reactWidgets.reactWidgetsStrings.location
import typingsJapgolly.reactWidgets.reactWidgetsStrings.menu
import typingsJapgolly.reactWidgets.reactWidgetsStrings.mixed
import typingsJapgolly.reactWidgets.reactWidgetsStrings.move
import typingsJapgolly.reactWidgets.reactWidgetsStrings.no
import typingsJapgolly.reactWidgets.reactWidgetsStrings.none
import typingsJapgolly.reactWidgets.reactWidgetsStrings.numeric
import typingsJapgolly.reactWidgets.reactWidgetsStrings.off
import typingsJapgolly.reactWidgets.reactWidgetsStrings.on
import typingsJapgolly.reactWidgets.reactWidgetsStrings.other
import typingsJapgolly.reactWidgets.reactWidgetsStrings.page
import typingsJapgolly.reactWidgets.reactWidgetsStrings.polite
import typingsJapgolly.reactWidgets.reactWidgetsStrings.popup
import typingsJapgolly.reactWidgets.reactWidgetsStrings.removals
import typingsJapgolly.reactWidgets.reactWidgetsStrings.search
import typingsJapgolly.reactWidgets.reactWidgetsStrings.spelling
import typingsJapgolly.reactWidgets.reactWidgetsStrings.step
import typingsJapgolly.reactWidgets.reactWidgetsStrings.tel
import typingsJapgolly.reactWidgets.reactWidgetsStrings.text
import typingsJapgolly.reactWidgets.reactWidgetsStrings.time
import typingsJapgolly.reactWidgets.reactWidgetsStrings.tree
import typingsJapgolly.reactWidgets.reactWidgetsStrings.url
import typingsJapgolly.reactWidgets.reactWidgetsStrings.user
import typingsJapgolly.reactWidgets.reactWidgetsStrings.vertical
import typingsJapgolly.reactWidgets.reactWidgetsStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DateTimePartInput {
  
  inline def apply(max: Double, min: Double, onChange: ReactEventFrom[HTMLInputElement & Element] => Callback): Builder = {
    val __props = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => onChange(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[PickPropsariaactivedescen]))
  }
  
  @JSImport("react-widgets/esm/DateTimePartInput", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HTMLInputElement] {
    
    inline def default(value: Boolean): this.type = set("default", value.asInstanceOf[js.Any])
    
    inline def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
    
    inline def accept(value: String): this.type = set("accept", value.asInstanceOf[js.Any])
    
    inline def acceptCharset(value: String): this.type = set("acceptCharset", value.asInstanceOf[js.Any])
    
    inline def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
    
    inline def action(value: String): this.type = set("action", value.asInstanceOf[js.Any])
    
    inline def allowFullScreen(value: Boolean): this.type = set("allowFullScreen", value.asInstanceOf[js.Any])
    
    inline def allowTransparency(value: Boolean): this.type = set("allowTransparency", value.asInstanceOf[js.Any])
    
    inline def alt(value: String): this.type = set("alt", value.asInstanceOf[js.Any])
    
    inline def `aria-activedescendant`(value: String): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
    
    inline def `aria-atomic`(value: Booleanish): this.type = set("aria-atomic", value.asInstanceOf[js.Any])
    
    inline def `aria-autocomplete`(value: none | `inline` | list | both): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
    
    inline def `aria-busy`(value: Booleanish): this.type = set("aria-busy", value.asInstanceOf[js.Any])
    
    inline def `aria-checked`(value: Boolean | mixed): this.type = set("aria-checked", value.asInstanceOf[js.Any])
    
    inline def `aria-colcount`(value: Double): this.type = set("aria-colcount", value.asInstanceOf[js.Any])
    
    inline def `aria-colindex`(value: Double): this.type = set("aria-colindex", value.asInstanceOf[js.Any])
    
    inline def `aria-colspan`(value: Double): this.type = set("aria-colspan", value.asInstanceOf[js.Any])
    
    inline def `aria-controls`(value: String): this.type = set("aria-controls", value.asInstanceOf[js.Any])
    
    inline def `aria-current`(value: Boolean | page | step | location | date | time): this.type = set("aria-current", value.asInstanceOf[js.Any])
    
    inline def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
    
    inline def `aria-disabled`(value: Booleanish): this.type = set("aria-disabled", value.asInstanceOf[js.Any])
    
    inline def `aria-dropeffect`(value: none | copy | execute | link | move | popup): this.type = set("aria-dropeffect", value.asInstanceOf[js.Any])
    
    inline def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
    
    inline def `aria-expanded`(value: Booleanish): this.type = set("aria-expanded", value.asInstanceOf[js.Any])
    
    inline def `aria-flowto`(value: String): this.type = set("aria-flowto", value.asInstanceOf[js.Any])
    
    inline def `aria-grabbed`(value: Booleanish): this.type = set("aria-grabbed", value.asInstanceOf[js.Any])
    
    inline def `aria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): this.type = set("aria-haspopup", value.asInstanceOf[js.Any])
    
    inline def `aria-hidden`(value: Booleanish): this.type = set("aria-hidden", value.asInstanceOf[js.Any])
    
    inline def `aria-invalid`(value: Boolean | grammar | spelling): this.type = set("aria-invalid", value.asInstanceOf[js.Any])
    
    inline def `aria-keyshortcuts`(value: String): this.type = set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `aria-level`(value: Double): this.type = set("aria-level", value.asInstanceOf[js.Any])
    
    inline def `aria-live`(value: off | assertive | polite): this.type = set("aria-live", value.asInstanceOf[js.Any])
    
    inline def `aria-modal`(value: Booleanish): this.type = set("aria-modal", value.asInstanceOf[js.Any])
    
    inline def `aria-multiline`(value: Booleanish): this.type = set("aria-multiline", value.asInstanceOf[js.Any])
    
    inline def `aria-multiselectable`(value: Booleanish): this.type = set("aria-multiselectable", value.asInstanceOf[js.Any])
    
    inline def `aria-orientation`(value: horizontal | vertical): this.type = set("aria-orientation", value.asInstanceOf[js.Any])
    
    inline def `aria-owns`(value: String): this.type = set("aria-owns", value.asInstanceOf[js.Any])
    
    inline def `aria-placeholder`(value: String): this.type = set("aria-placeholder", value.asInstanceOf[js.Any])
    
    inline def `aria-posinset`(value: Double): this.type = set("aria-posinset", value.asInstanceOf[js.Any])
    
    inline def `aria-pressed`(value: Boolean | mixed): this.type = set("aria-pressed", value.asInstanceOf[js.Any])
    
    inline def `aria-readonly`(value: Booleanish): this.type = set("aria-readonly", value.asInstanceOf[js.Any])
    
    inline def `aria-relevant`(
      value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
    ): this.type = set("aria-relevant", value.asInstanceOf[js.Any])
    
    inline def `aria-required`(value: Booleanish): this.type = set("aria-required", value.asInstanceOf[js.Any])
    
    inline def `aria-roledescription`(value: String): this.type = set("aria-roledescription", value.asInstanceOf[js.Any])
    
    inline def `aria-rowcount`(value: Double): this.type = set("aria-rowcount", value.asInstanceOf[js.Any])
    
    inline def `aria-rowindex`(value: Double): this.type = set("aria-rowindex", value.asInstanceOf[js.Any])
    
    inline def `aria-rowspan`(value: Double): this.type = set("aria-rowspan", value.asInstanceOf[js.Any])
    
    inline def `aria-selected`(value: Booleanish): this.type = set("aria-selected", value.asInstanceOf[js.Any])
    
    inline def `aria-setsize`(value: Double): this.type = set("aria-setsize", value.asInstanceOf[js.Any])
    
    inline def `aria-sort`(value: none | ascending | descending | other): this.type = set("aria-sort", value.asInstanceOf[js.Any])
    
    inline def `aria-valuemax`(value: Double): this.type = set("aria-valuemax", value.asInstanceOf[js.Any])
    
    inline def `aria-valuemin`(value: Double): this.type = set("aria-valuemin", value.asInstanceOf[js.Any])
    
    inline def `aria-valuenow`(value: Double): this.type = set("aria-valuenow", value.asInstanceOf[js.Any])
    
    inline def `aria-valuetext`(value: String): this.type = set("aria-valuetext", value.asInstanceOf[js.Any])
    
    inline def as(value: String): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def async(value: Boolean): this.type = set("async", value.asInstanceOf[js.Any])
    
    inline def autoCapitalize(value: String): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
    
    inline def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
    
    inline def autoCorrect(value: String): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def autoPlay(value: Boolean): this.type = set("autoPlay", value.asInstanceOf[js.Any])
    
    inline def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
    
    inline def capture(value: Boolean | user | environment): this.type = set("capture", value.asInstanceOf[js.Any])
    
    inline def cellPadding(value: Double | String): this.type = set("cellPadding", value.asInstanceOf[js.Any])
    
    inline def cellSpacing(value: Double | String): this.type = set("cellSpacing", value.asInstanceOf[js.Any])
    
    inline def challenge(value: String): this.type = set("challenge", value.asInstanceOf[js.Any])
    
    inline def charSet(value: String): this.type = set("charSet", value.asInstanceOf[js.Any])
    
    inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    inline def cite(value: String): this.type = set("cite", value.asInstanceOf[js.Any])
    
    inline def classID(value: String): this.type = set("classID", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def colSpan(value: Double): this.type = set("colSpan", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def cols(value: Double): this.type = set("cols", value.asInstanceOf[js.Any])
    
    inline def content(value: String): this.type = set("content", value.asInstanceOf[js.Any])
    
    inline def contentEditable(value: Booleanish | inherit): this.type = set("contentEditable", value.asInstanceOf[js.Any])
    
    inline def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
    
    inline def controls(value: Boolean): this.type = set("controls", value.asInstanceOf[js.Any])
    
    inline def coords(value: String): this.type = set("coords", value.asInstanceOf[js.Any])
    
    inline def crossOrigin(value: String): this.type = set("crossOrigin", value.asInstanceOf[js.Any])
    
    inline def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    inline def data(value: String): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
    
    inline def dateTime(value: String): this.type = set("dateTime", value.asInstanceOf[js.Any])
    
    inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value*))
    
    inline def defer(value: Boolean): this.type = set("defer", value.asInstanceOf[js.Any])
    
    inline def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def download(value: Any): this.type = set("download", value.asInstanceOf[js.Any])
    
    inline def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    inline def emptyChar(value: String): this.type = set("emptyChar", value.asInstanceOf[js.Any])
    
    inline def encType(value: String): this.type = set("encType", value.asInstanceOf[js.Any])
    
    inline def form(value: String): this.type = set("form", value.asInstanceOf[js.Any])
    
    inline def formAction(value: String): this.type = set("formAction", value.asInstanceOf[js.Any])
    
    inline def formEncType(value: String): this.type = set("formEncType", value.asInstanceOf[js.Any])
    
    inline def formMethod(value: String): this.type = set("formMethod", value.asInstanceOf[js.Any])
    
    inline def formNoValidate(value: Boolean): this.type = set("formNoValidate", value.asInstanceOf[js.Any])
    
    inline def formTarget(value: String): this.type = set("formTarget", value.asInstanceOf[js.Any])
    
    inline def frameBorder(value: Double | String): this.type = set("frameBorder", value.asInstanceOf[js.Any])
    
    inline def headers(value: String): this.type = set("headers", value.asInstanceOf[js.Any])
    
    inline def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def high(value: Double): this.type = set("high", value.asInstanceOf[js.Any])
    
    inline def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
    
    inline def hrefLang(value: String): this.type = set("hrefLang", value.asInstanceOf[js.Any])
    
    inline def htmlFor(value: String): this.type = set("htmlFor", value.asInstanceOf[js.Any])
    
    inline def httpEquiv(value: String): this.type = set("httpEquiv", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def inlist(value: Any): this.type = set("inlist", value.asInstanceOf[js.Any])
    
    inline def inputMode(value: none | text | tel | url | email | numeric | decimal | search): this.type = set("inputMode", value.asInstanceOf[js.Any])
    
    inline def integrity(value: String): this.type = set("integrity", value.asInstanceOf[js.Any])
    
    inline def is(value: String): this.type = set("is", value.asInstanceOf[js.Any])
    
    inline def itemID(value: String): this.type = set("itemID", value.asInstanceOf[js.Any])
    
    inline def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
    
    inline def itemRef(value: String): this.type = set("itemRef", value.asInstanceOf[js.Any])
    
    inline def itemScope(value: Boolean): this.type = set("itemScope", value.asInstanceOf[js.Any])
    
    inline def itemType(value: String): this.type = set("itemType", value.asInstanceOf[js.Any])
    
    inline def keyParams(value: String): this.type = set("keyParams", value.asInstanceOf[js.Any])
    
    inline def keyType(value: String): this.type = set("keyType", value.asInstanceOf[js.Any])
    
    inline def kind(value: String): this.type = set("kind", value.asInstanceOf[js.Any])
    
    inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
    
    inline def list(value: String): this.type = set("list", value.asInstanceOf[js.Any])
    
    inline def loop(value: Boolean): this.type = set("loop", value.asInstanceOf[js.Any])
    
    inline def low(value: Double): this.type = set("low", value.asInstanceOf[js.Any])
    
    inline def manifest(value: String): this.type = set("manifest", value.asInstanceOf[js.Any])
    
    inline def marginHeight(value: Double): this.type = set("marginHeight", value.asInstanceOf[js.Any])
    
    inline def marginWidth(value: Double): this.type = set("marginWidth", value.asInstanceOf[js.Any])
    
    inline def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    inline def media(value: String): this.type = set("media", value.asInstanceOf[js.Any])
    
    inline def mediaGroup(value: String): this.type = set("mediaGroup", value.asInstanceOf[js.Any])
    
    inline def method(value: String): this.type = set("method", value.asInstanceOf[js.Any])
    
    inline def minLength(value: Double): this.type = set("minLength", value.asInstanceOf[js.Any])
    
    inline def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    inline def muted(value: Boolean): this.type = set("muted", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def noValidate(value: Boolean): this.type = set("noValidate", value.asInstanceOf[js.Any])
    
    inline def nonce(value: String): this.type = set("nonce", value.asInstanceOf[js.Any])
    
    inline def onAbort(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onAbort", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onAbortCapture(value: Any): this.type = set("onAbortCapture", value.asInstanceOf[js.Any])
    
    inline def onAnimationEnd(value: ReactAnimationEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onAnimationEndCapture(value: Any): this.type = set("onAnimationEndCapture", value.asInstanceOf[js.Any])
    
    inline def onAnimationIteration(value: ReactAnimationEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onAnimationIterationCapture(value: Any): this.type = set("onAnimationIterationCapture", value.asInstanceOf[js.Any])
    
    inline def onAnimationStart(value: ReactAnimationEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onAnimationStartCapture(value: Any): this.type = set("onAnimationStartCapture", value.asInstanceOf[js.Any])
    
    inline def onAuxClick(value: ReactMouseEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onAuxClickCapture(value: Any): this.type = set("onAuxClickCapture", value.asInstanceOf[js.Any])
    
    inline def onBeforeInput(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onBeforeInputCapture(value: Any): this.type = set("onBeforeInputCapture", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: ReactFocusEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onBlurCapture(value: Any): this.type = set("onBlurCapture", value.asInstanceOf[js.Any])
    
    inline def onCanPlay(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onCanPlayCapture(value: Any): this.type = set("onCanPlayCapture", value.asInstanceOf[js.Any])
    
    inline def onCanPlayThrough(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onCanPlayThroughCapture(value: Any): this.type = set("onCanPlayThroughCapture", value.asInstanceOf[js.Any])
    
    inline def onChangeCapture(value: Any): this.type = set("onChangeCapture", value.asInstanceOf[js.Any])
    
    inline def onClick(value: ReactMouseEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onClickCapture(value: Any): this.type = set("onClickCapture", value.asInstanceOf[js.Any])
    
    inline def onCompositionEnd(value: ReactCompositionEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onCompositionEndCapture(value: Any): this.type = set("onCompositionEndCapture", value.asInstanceOf[js.Any])
    
    inline def onCompositionStart(value: ReactCompositionEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onCompositionStartCapture(value: Any): this.type = set("onCompositionStartCapture", value.asInstanceOf[js.Any])
    
    inline def onCompositionUpdate(value: ReactCompositionEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onCompositionUpdateCapture(value: Any): this.type = set("onCompositionUpdateCapture", value.asInstanceOf[js.Any])
    
    inline def onContextMenu(value: ReactMouseEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onContextMenuCapture(value: Any): this.type = set("onContextMenuCapture", value.asInstanceOf[js.Any])
    
    inline def onCopy(value: ReactClipboardEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onCopyCapture(value: Any): this.type = set("onCopyCapture", value.asInstanceOf[js.Any])
    
    inline def onCut(value: ReactClipboardEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onCutCapture(value: Any): this.type = set("onCutCapture", value.asInstanceOf[js.Any])
    
    inline def onDoubleClick(value: ReactMouseEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onDoubleClickCapture(value: Any): this.type = set("onDoubleClickCapture", value.asInstanceOf[js.Any])
    
    inline def onDrag(value: ReactDragEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onDragCapture(value: Any): this.type = set("onDragCapture", value.asInstanceOf[js.Any])
    
    inline def onDragEnd(value: ReactDragEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onDragEndCapture(value: Any): this.type = set("onDragEndCapture", value.asInstanceOf[js.Any])
    
    inline def onDragEnter(value: ReactDragEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onDragEnterCapture(value: Any): this.type = set("onDragEnterCapture", value.asInstanceOf[js.Any])
    
    inline def onDragExit(value: ReactDragEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onDragExitCapture(value: Any): this.type = set("onDragExitCapture", value.asInstanceOf[js.Any])
    
    inline def onDragLeave(value: ReactDragEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onDragLeaveCapture(value: Any): this.type = set("onDragLeaveCapture", value.asInstanceOf[js.Any])
    
    inline def onDragOver(value: ReactDragEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onDragOverCapture(value: Any): this.type = set("onDragOverCapture", value.asInstanceOf[js.Any])
    
    inline def onDragStart(value: ReactDragEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onDragStartCapture(value: Any): this.type = set("onDragStartCapture", value.asInstanceOf[js.Any])
    
    inline def onDrop(value: ReactDragEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onDropCapture(value: Any): this.type = set("onDropCapture", value.asInstanceOf[js.Any])
    
    inline def onDurationChange(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onDurationChangeCapture(value: Any): this.type = set("onDurationChangeCapture", value.asInstanceOf[js.Any])
    
    inline def onEmptied(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onEmptiedCapture(value: Any): this.type = set("onEmptiedCapture", value.asInstanceOf[js.Any])
    
    inline def onEncrypted(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onEncryptedCapture(value: Any): this.type = set("onEncryptedCapture", value.asInstanceOf[js.Any])
    
    inline def onEnded(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onEnded", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onEndedCapture(value: Any): this.type = set("onEndedCapture", value.asInstanceOf[js.Any])
    
    inline def onError(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onErrorCapture(value: Any): this.type = set("onErrorCapture", value.asInstanceOf[js.Any])
    
    inline def onFocus(value: ReactFocusEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onFocusCapture(value: Any): this.type = set("onFocusCapture", value.asInstanceOf[js.Any])
    
    inline def onGotPointerCapture(value: Any): this.type = set("onGotPointerCapture", value.asInstanceOf[js.Any])
    
    inline def onGotPointerCaptureCapture(value: Any): this.type = set("onGotPointerCaptureCapture", value.asInstanceOf[js.Any])
    
    inline def onInput(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onInputCapture(value: Any): this.type = set("onInputCapture", value.asInstanceOf[js.Any])
    
    inline def onInvalid(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onInvalidCapture(value: Any): this.type = set("onInvalidCapture", value.asInstanceOf[js.Any])
    
    inline def onKeyDown(value: ReactKeyboardEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onKeyDownCapture(value: Any): this.type = set("onKeyDownCapture", value.asInstanceOf[js.Any])
    
    inline def onKeyPress(value: ReactKeyboardEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onKeyPressCapture(value: Any): this.type = set("onKeyPressCapture", value.asInstanceOf[js.Any])
    
    inline def onKeyUp(value: ReactKeyboardEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onKeyUpCapture(value: Any): this.type = set("onKeyUpCapture", value.asInstanceOf[js.Any])
    
    inline def onLoad(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onLoadCapture(value: Any): this.type = set("onLoadCapture", value.asInstanceOf[js.Any])
    
    inline def onLoadStart(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onLoadStartCapture(value: Any): this.type = set("onLoadStartCapture", value.asInstanceOf[js.Any])
    
    inline def onLoadedData(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onLoadedDataCapture(value: Any): this.type = set("onLoadedDataCapture", value.asInstanceOf[js.Any])
    
    inline def onLoadedMetadata(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onLoadedMetadataCapture(value: Any): this.type = set("onLoadedMetadataCapture", value.asInstanceOf[js.Any])
    
    inline def onLostPointerCapture(value: Any): this.type = set("onLostPointerCapture", value.asInstanceOf[js.Any])
    
    inline def onLostPointerCaptureCapture(value: Any): this.type = set("onLostPointerCaptureCapture", value.asInstanceOf[js.Any])
    
    inline def onMouseDown(value: ReactMouseEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onMouseDownCapture(value: Any): this.type = set("onMouseDownCapture", value.asInstanceOf[js.Any])
    
    inline def onMouseEnter(value: ReactMouseEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onMouseLeave(value: ReactMouseEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onMouseMove(value: ReactMouseEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onMouseMoveCapture(value: Any): this.type = set("onMouseMoveCapture", value.asInstanceOf[js.Any])
    
    inline def onMouseOut(value: ReactMouseEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onMouseOutCapture(value: Any): this.type = set("onMouseOutCapture", value.asInstanceOf[js.Any])
    
    inline def onMouseOver(value: ReactMouseEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onMouseOverCapture(value: Any): this.type = set("onMouseOverCapture", value.asInstanceOf[js.Any])
    
    inline def onMouseUp(value: ReactMouseEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onMouseUpCapture(value: Any): this.type = set("onMouseUpCapture", value.asInstanceOf[js.Any])
    
    inline def onPaste(value: ReactClipboardEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onPasteCapture(value: Any): this.type = set("onPasteCapture", value.asInstanceOf[js.Any])
    
    inline def onPause(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onPause", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onPauseCapture(value: Any): this.type = set("onPauseCapture", value.asInstanceOf[js.Any])
    
    inline def onPlay(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onPlayCapture(value: Any): this.type = set("onPlayCapture", value.asInstanceOf[js.Any])
    
    inline def onPlaying(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onPlayingCapture(value: Any): this.type = set("onPlayingCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerCancel(value: ReactPointerEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onPointerCancelCapture(value: Any): this.type = set("onPointerCancelCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerDown(value: ReactPointerEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onPointerDownCapture(value: Any): this.type = set("onPointerDownCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerEnter(value: ReactPointerEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onPointerEnterCapture(value: Any): this.type = set("onPointerEnterCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerLeave(value: ReactPointerEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onPointerLeaveCapture(value: Any): this.type = set("onPointerLeaveCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerMove(value: ReactPointerEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onPointerMoveCapture(value: Any): this.type = set("onPointerMoveCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerOut(value: ReactPointerEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onPointerOutCapture(value: Any): this.type = set("onPointerOutCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerOver(value: ReactPointerEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onPointerOverCapture(value: Any): this.type = set("onPointerOverCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerUp(value: ReactPointerEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onPointerUpCapture(value: Any): this.type = set("onPointerUpCapture", value.asInstanceOf[js.Any])
    
    inline def onProgress(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onProgress", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onProgressCapture(value: Any): this.type = set("onProgressCapture", value.asInstanceOf[js.Any])
    
    inline def onRateChange(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onRateChangeCapture(value: Any): this.type = set("onRateChangeCapture", value.asInstanceOf[js.Any])
    
    inline def onReset(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onReset", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onResetCapture(value: Any): this.type = set("onResetCapture", value.asInstanceOf[js.Any])
    
    inline def onScroll(value: ReactUIEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onScrollCapture(value: Any): this.type = set("onScrollCapture", value.asInstanceOf[js.Any])
    
    inline def onSeeked(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onSeekedCapture(value: Any): this.type = set("onSeekedCapture", value.asInstanceOf[js.Any])
    
    inline def onSeeking(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onSeekingCapture(value: Any): this.type = set("onSeekingCapture", value.asInstanceOf[js.Any])
    
    inline def onSelect(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onSelectCapture(value: Any): this.type = set("onSelectCapture", value.asInstanceOf[js.Any])
    
    inline def onStalled(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onStalled", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onStalledCapture(value: Any): this.type = set("onStalledCapture", value.asInstanceOf[js.Any])
    
    inline def onSubmit(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onSubmitCapture(value: Any): this.type = set("onSubmitCapture", value.asInstanceOf[js.Any])
    
    inline def onSuspend(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onSuspendCapture(value: Any): this.type = set("onSuspendCapture", value.asInstanceOf[js.Any])
    
    inline def onTimeUpdate(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onTimeUpdateCapture(value: Any): this.type = set("onTimeUpdateCapture", value.asInstanceOf[js.Any])
    
    inline def onTouchCancel(value: ReactTouchEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onTouchCancelCapture(value: Any): this.type = set("onTouchCancelCapture", value.asInstanceOf[js.Any])
    
    inline def onTouchEnd(value: ReactTouchEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onTouchEndCapture(value: Any): this.type = set("onTouchEndCapture", value.asInstanceOf[js.Any])
    
    inline def onTouchMove(value: ReactTouchEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onTouchMoveCapture(value: Any): this.type = set("onTouchMoveCapture", value.asInstanceOf[js.Any])
    
    inline def onTouchStart(value: ReactTouchEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onTouchStartCapture(value: Any): this.type = set("onTouchStartCapture", value.asInstanceOf[js.Any])
    
    inline def onTransitionEnd(value: ReactTransitionEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onTransitionEndCapture(value: Any): this.type = set("onTransitionEndCapture", value.asInstanceOf[js.Any])
    
    inline def onVolumeChange(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onVolumeChangeCapture(value: Any): this.type = set("onVolumeChangeCapture", value.asInstanceOf[js.Any])
    
    inline def onWaiting(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onWaitingCapture(value: Any): this.type = set("onWaitingCapture", value.asInstanceOf[js.Any])
    
    inline def onWheel(value: ReactWheelEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onWheelCapture(value: Any): this.type = set("onWheelCapture", value.asInstanceOf[js.Any])
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def optimum(value: Double): this.type = set("optimum", value.asInstanceOf[js.Any])
    
    inline def pad(value: Double): this.type = set("pad", value.asInstanceOf[js.Any])
    
    inline def pattern(value: String): this.type = set("pattern", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def playsInline(value: Boolean): this.type = set("playsInline", value.asInstanceOf[js.Any])
    
    inline def poster(value: String): this.type = set("poster", value.asInstanceOf[js.Any])
    
    inline def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
    
    inline def preload(value: String): this.type = set("preload", value.asInstanceOf[js.Any])
    
    inline def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
    
    inline def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def rel(value: String): this.type = set("rel", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
    
    inline def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
    
    inline def reversed(value: Boolean): this.type = set("reversed", value.asInstanceOf[js.Any])
    
    inline def role(value: AriaRole): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def rowSpan(value: Double): this.type = set("rowSpan", value.asInstanceOf[js.Any])
    
    inline def rows(value: Double): this.type = set("rows", value.asInstanceOf[js.Any])
    
    inline def sandbox(value: String): this.type = set("sandbox", value.asInstanceOf[js.Any])
    
    inline def scope(value: String): this.type = set("scope", value.asInstanceOf[js.Any])
    
    inline def scoped(value: Boolean): this.type = set("scoped", value.asInstanceOf[js.Any])
    
    inline def scrolling(value: String): this.type = set("scrolling", value.asInstanceOf[js.Any])
    
    inline def seamless(value: Boolean): this.type = set("seamless", value.asInstanceOf[js.Any])
    
    inline def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
    
    inline def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
    
    inline def shape(value: String): this.type = set("shape", value.asInstanceOf[js.Any])
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def sizes(value: String): this.type = set("sizes", value.asInstanceOf[js.Any])
    
    inline def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
    
    inline def span(value: Double): this.type = set("span", value.asInstanceOf[js.Any])
    
    inline def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
    
    inline def src(value: String): this.type = set("src", value.asInstanceOf[js.Any])
    
    inline def srcDoc(value: String): this.type = set("srcDoc", value.asInstanceOf[js.Any])
    
    inline def srcLang(value: String): this.type = set("srcLang", value.asInstanceOf[js.Any])
    
    inline def srcSet(value: String): this.type = set("srcSet", value.asInstanceOf[js.Any])
    
    inline def start(value: Double): this.type = set("start", value.asInstanceOf[js.Any])
    
    inline def step(value: Double | String): this.type = set("step", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def summary(value: String): this.type = set("summary", value.asInstanceOf[js.Any])
    
    inline def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    inline def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def target(value: String): this.type = set("target", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
    
    inline def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
    
    inline def useMap(value: String): this.type = set("useMap", value.asInstanceOf[js.Any])
    
    inline def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueNull: this.type = set("value", null)
    
    inline def valueText(value: String): this.type = set("valueText", value.asInstanceOf[js.Any])
    
    inline def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
    
    inline def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def wmode(value: String): this.type = set("wmode", value.asInstanceOf[js.Any])
    
    inline def wrap(value: String): this.type = set("wrap", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PickPropsariaactivedescen): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
