package typingsJapgolly.reactCropper.components

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
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.cropperjs.Cropper.CropEndEvent
import typingsJapgolly.cropperjs.Cropper.CropEvent
import typingsJapgolly.cropperjs.Cropper.CropMoveEvent
import typingsJapgolly.cropperjs.Cropper.CropStartEvent
import typingsJapgolly.cropperjs.Cropper.DragMode
import typingsJapgolly.cropperjs.Cropper.ReadyEvent
import typingsJapgolly.cropperjs.Cropper.SetDataOptions
import typingsJapgolly.cropperjs.Cropper.ViewMode
import typingsJapgolly.cropperjs.Cropper.ZoomEvent
import typingsJapgolly.react.anon.Html
import typingsJapgolly.react.mod.AriaRole
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactCropper.mod.ReactCropperProps
import typingsJapgolly.reactCropper.mod.default
import typingsJapgolly.reactCropper.reactCropperStrings.`additions removals`
import typingsJapgolly.reactCropper.reactCropperStrings.`additions text`
import typingsJapgolly.reactCropper.reactCropperStrings.`inline`
import typingsJapgolly.reactCropper.reactCropperStrings.`removals additions`
import typingsJapgolly.reactCropper.reactCropperStrings.`removals text`
import typingsJapgolly.reactCropper.reactCropperStrings.`text additions`
import typingsJapgolly.reactCropper.reactCropperStrings.`text removals`
import typingsJapgolly.reactCropper.reactCropperStrings.additions
import typingsJapgolly.reactCropper.reactCropperStrings.all
import typingsJapgolly.reactCropper.reactCropperStrings.ascending
import typingsJapgolly.reactCropper.reactCropperStrings.assertive
import typingsJapgolly.reactCropper.reactCropperStrings.both
import typingsJapgolly.reactCropper.reactCropperStrings.copy
import typingsJapgolly.reactCropper.reactCropperStrings.date
import typingsJapgolly.reactCropper.reactCropperStrings.decimal
import typingsJapgolly.reactCropper.reactCropperStrings.descending
import typingsJapgolly.reactCropper.reactCropperStrings.dialog
import typingsJapgolly.reactCropper.reactCropperStrings.email
import typingsJapgolly.reactCropper.reactCropperStrings.environment
import typingsJapgolly.reactCropper.reactCropperStrings.execute
import typingsJapgolly.reactCropper.reactCropperStrings.grammar
import typingsJapgolly.reactCropper.reactCropperStrings.grid
import typingsJapgolly.reactCropper.reactCropperStrings.horizontal
import typingsJapgolly.reactCropper.reactCropperStrings.inherit
import typingsJapgolly.reactCropper.reactCropperStrings.link
import typingsJapgolly.reactCropper.reactCropperStrings.list
import typingsJapgolly.reactCropper.reactCropperStrings.listbox
import typingsJapgolly.reactCropper.reactCropperStrings.location
import typingsJapgolly.reactCropper.reactCropperStrings.menu
import typingsJapgolly.reactCropper.reactCropperStrings.mixed
import typingsJapgolly.reactCropper.reactCropperStrings.move
import typingsJapgolly.reactCropper.reactCropperStrings.no
import typingsJapgolly.reactCropper.reactCropperStrings.none
import typingsJapgolly.reactCropper.reactCropperStrings.numeric
import typingsJapgolly.reactCropper.reactCropperStrings.off
import typingsJapgolly.reactCropper.reactCropperStrings.on
import typingsJapgolly.reactCropper.reactCropperStrings.other
import typingsJapgolly.reactCropper.reactCropperStrings.page
import typingsJapgolly.reactCropper.reactCropperStrings.polite
import typingsJapgolly.reactCropper.reactCropperStrings.popup
import typingsJapgolly.reactCropper.reactCropperStrings.removals
import typingsJapgolly.reactCropper.reactCropperStrings.search
import typingsJapgolly.reactCropper.reactCropperStrings.spelling
import typingsJapgolly.reactCropper.reactCropperStrings.step
import typingsJapgolly.reactCropper.reactCropperStrings.tel
import typingsJapgolly.reactCropper.reactCropperStrings.text
import typingsJapgolly.reactCropper.reactCropperStrings.time
import typingsJapgolly.reactCropper.reactCropperStrings.tree
import typingsJapgolly.reactCropper.reactCropperStrings.url
import typingsJapgolly.reactCropper.reactCropperStrings.user
import typingsJapgolly.reactCropper.reactCropperStrings.vertical
import typingsJapgolly.reactCropper.reactCropperStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactCropper {
  
  @JSImport("react-cropper", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
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
    
    inline def aspectRatio(value: Double): this.type = set("aspectRatio", value.asInstanceOf[js.Any])
    
    inline def async(value: Boolean): this.type = set("async", value.asInstanceOf[js.Any])
    
    inline def autoCapitalize(value: String): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
    
    inline def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
    
    inline def autoCorrect(value: String): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
    
    inline def autoCrop(value: Boolean): this.type = set("autoCrop", value.asInstanceOf[js.Any])
    
    inline def autoCropArea(value: Double): this.type = set("autoCropArea", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def autoPlay(value: Boolean): this.type = set("autoPlay", value.asInstanceOf[js.Any])
    
    inline def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
    
    inline def background(value: Boolean): this.type = set("background", value.asInstanceOf[js.Any])
    
    inline def capture(value: Boolean | user | environment): this.type = set("capture", value.asInstanceOf[js.Any])
    
    inline def cellPadding(value: Double | String): this.type = set("cellPadding", value.asInstanceOf[js.Any])
    
    inline def cellSpacing(value: Double | String): this.type = set("cellSpacing", value.asInstanceOf[js.Any])
    
    inline def center(value: Boolean): this.type = set("center", value.asInstanceOf[js.Any])
    
    inline def challenge(value: String): this.type = set("challenge", value.asInstanceOf[js.Any])
    
    inline def charSet(value: String): this.type = set("charSet", value.asInstanceOf[js.Any])
    
    inline def checkCrossOrigin(value: Boolean): this.type = set("checkCrossOrigin", value.asInstanceOf[js.Any])
    
    inline def checkOrientation(value: Boolean): this.type = set("checkOrientation", value.asInstanceOf[js.Any])
    
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
    
    inline def crop(value: /* event */ CropEvent[EventTarget] => Callback): this.type = set("crop", js.Any.fromFunction1((t0: /* event */ CropEvent[EventTarget]) => value(t0).runNow()))
    
    inline def cropBoxMovable(value: Boolean): this.type = set("cropBoxMovable", value.asInstanceOf[js.Any])
    
    inline def cropBoxResizable(value: Boolean): this.type = set("cropBoxResizable", value.asInstanceOf[js.Any])
    
    inline def cropend(value: /* event */ CropEndEvent[EventTarget] => Callback): this.type = set("cropend", js.Any.fromFunction1((t0: /* event */ CropEndEvent[EventTarget]) => value(t0).runNow()))
    
    inline def cropmove(value: /* event */ CropMoveEvent[EventTarget] => Callback): this.type = set("cropmove", js.Any.fromFunction1((t0: /* event */ CropMoveEvent[EventTarget]) => value(t0).runNow()))
    
    inline def cropstart(value: /* event */ CropStartEvent[EventTarget] => Callback): this.type = set("cropstart", js.Any.fromFunction1((t0: /* event */ CropStartEvent[EventTarget]) => value(t0).runNow()))
    
    inline def crossOrigin(value: String): this.type = set("crossOrigin", value.asInstanceOf[js.Any])
    
    inline def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    inline def data(value: SetDataOptions): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
    
    inline def dateTime(value: String): this.type = set("dateTime", value.asInstanceOf[js.Any])
    
    inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value*))
    
    inline def defer(value: Boolean): this.type = set("defer", value.asInstanceOf[js.Any])
    
    inline def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def download(value: Any): this.type = set("download", value.asInstanceOf[js.Any])
    
    inline def dragMode(value: DragMode): this.type = set("dragMode", value.asInstanceOf[js.Any])
    
    inline def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    inline def encType(value: String): this.type = set("encType", value.asInstanceOf[js.Any])
    
    inline def form(value: String): this.type = set("form", value.asInstanceOf[js.Any])
    
    inline def formAction(value: String): this.type = set("formAction", value.asInstanceOf[js.Any])
    
    inline def formEncType(value: String): this.type = set("formEncType", value.asInstanceOf[js.Any])
    
    inline def formMethod(value: String): this.type = set("formMethod", value.asInstanceOf[js.Any])
    
    inline def formNoValidate(value: Boolean): this.type = set("formNoValidate", value.asInstanceOf[js.Any])
    
    inline def formTarget(value: String): this.type = set("formTarget", value.asInstanceOf[js.Any])
    
    inline def frameBorder(value: Double | String): this.type = set("frameBorder", value.asInstanceOf[js.Any])
    
    inline def guides(value: Boolean): this.type = set("guides", value.asInstanceOf[js.Any])
    
    inline def headers(value: String): this.type = set("headers", value.asInstanceOf[js.Any])
    
    inline def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def high(value: Double): this.type = set("high", value.asInstanceOf[js.Any])
    
    inline def highlight(value: Boolean): this.type = set("highlight", value.asInstanceOf[js.Any])
    
    inline def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
    
    inline def hrefLang(value: String): this.type = set("hrefLang", value.asInstanceOf[js.Any])
    
    inline def htmlFor(value: String): this.type = set("htmlFor", value.asInstanceOf[js.Any])
    
    inline def httpEquiv(value: String): this.type = set("httpEquiv", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def initialAspectRatio(value: Double): this.type = set("initialAspectRatio", value.asInstanceOf[js.Any])
    
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
    
    inline def max(value: Double | String): this.type = set("max", value.asInstanceOf[js.Any])
    
    inline def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    inline def media(value: String): this.type = set("media", value.asInstanceOf[js.Any])
    
    inline def mediaGroup(value: String): this.type = set("mediaGroup", value.asInstanceOf[js.Any])
    
    inline def method(value: String): this.type = set("method", value.asInstanceOf[js.Any])
    
    inline def min(value: Double | String): this.type = set("min", value.asInstanceOf[js.Any])
    
    inline def minCanvasHeight(value: Double): this.type = set("minCanvasHeight", value.asInstanceOf[js.Any])
    
    inline def minCanvasWidth(value: Double): this.type = set("minCanvasWidth", value.asInstanceOf[js.Any])
    
    inline def minContainerHeight(value: Double): this.type = set("minContainerHeight", value.asInstanceOf[js.Any])
    
    inline def minContainerWidth(value: Double): this.type = set("minContainerWidth", value.asInstanceOf[js.Any])
    
    inline def minCropBoxHeight(value: Double): this.type = set("minCropBoxHeight", value.asInstanceOf[js.Any])
    
    inline def minCropBoxWidth(value: Double): this.type = set("minCropBoxWidth", value.asInstanceOf[js.Any])
    
    inline def minLength(value: Double): this.type = set("minLength", value.asInstanceOf[js.Any])
    
    inline def modal(value: Boolean): this.type = set("modal", value.asInstanceOf[js.Any])
    
    inline def movable(value: Boolean): this.type = set("movable", value.asInstanceOf[js.Any])
    
    inline def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    inline def muted(value: Boolean): this.type = set("muted", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def noValidate(value: Boolean): this.type = set("noValidate", value.asInstanceOf[js.Any])
    
    inline def nonce(value: String): this.type = set("nonce", value.asInstanceOf[js.Any])
    
    inline def onAbort(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onAbort", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onAnimationEnd(value: ReactAnimationEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onAnimationIteration(value: ReactAnimationEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onAnimationStart(value: ReactAnimationEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onAuxClick(value: ReactMouseEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onBeforeInput(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onBlur(value: ReactFocusEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onCanPlay(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onCanPlayThrough(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onChange(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onClick(value: ReactMouseEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onCompositionEnd(value: ReactCompositionEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onCompositionStart(value: ReactCompositionEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onCompositionUpdate(value: ReactCompositionEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onContextMenu(value: ReactMouseEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onCopy(value: ReactClipboardEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onCut(value: ReactClipboardEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onDoubleClick(value: ReactMouseEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onDrag(value: ReactDragEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onDragEnd(value: ReactDragEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onDragEnter(value: ReactDragEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onDragExit(value: ReactDragEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onDragLeave(value: ReactDragEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onDragOver(value: ReactDragEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onDragStart(value: ReactDragEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onDrop(value: ReactDragEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onDurationChange(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onEmptied(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onEncrypted(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onEnded(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onEnded", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onError(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onFocus(value: ReactFocusEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onInput(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onInvalid(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onKeyDown(value: ReactKeyboardEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onKeyPress(value: ReactKeyboardEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onKeyUp(value: ReactKeyboardEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onLoad(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onLoadStart(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onLoadedData(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onLoadedMetadata(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onMouseDown(value: ReactMouseEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onMouseEnter(value: ReactMouseEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onMouseLeave(value: ReactMouseEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onMouseMove(value: ReactMouseEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onMouseOut(value: ReactMouseEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onMouseOver(value: ReactMouseEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onMouseUp(value: ReactMouseEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onPaste(value: ReactClipboardEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onPause(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onPause", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onPlay(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onPlaying(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onPointerCancel(value: ReactPointerEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onPointerDown(value: ReactPointerEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onPointerEnter(value: ReactPointerEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onPointerLeave(value: ReactPointerEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onPointerMove(value: ReactPointerEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onPointerOut(value: ReactPointerEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onPointerOver(value: ReactPointerEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onPointerUp(value: ReactPointerEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onProgress(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onProgress", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onRateChange(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onReset(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onReset", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onScroll(value: ReactUIEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onSeeked(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onSeeking(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onSelect(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onStalled(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onStalled", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onSubmit(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onSuspend(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onTimeUpdate(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onTouchCancel(value: ReactTouchEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onTouchEnd(value: ReactTouchEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onTouchMove(value: ReactTouchEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onTouchStart(value: ReactTouchEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onTransitionEnd(value: ReactTransitionEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onVolumeChange(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onWaiting(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onWheel(value: ReactWheelEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def optimum(value: Double): this.type = set("optimum", value.asInstanceOf[js.Any])
    
    inline def pattern(value: String): this.type = set("pattern", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def playsInline(value: Boolean): this.type = set("playsInline", value.asInstanceOf[js.Any])
    
    inline def poster(value: String): this.type = set("poster", value.asInstanceOf[js.Any])
    
    inline def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
    
    inline def preload(value: String): this.type = set("preload", value.asInstanceOf[js.Any])
    
    inline def preview(value: HTMLElement | js.Array[HTMLElement] | (NodeList[HTMLElement & Node]) | String): this.type = set("preview", value.asInstanceOf[js.Any])
    
    inline def previewVarargs(value: HTMLElement*): this.type = set("preview", js.Array(value*))
    
    inline def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
    
    inline def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def ready(value: /* event */ ReadyEvent[EventTarget] => Callback): this.type = set("ready", js.Any.fromFunction1((t0: /* event */ ReadyEvent[EventTarget]) => value(t0).runNow()))
    
    inline def rel(value: String): this.type = set("rel", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
    
    inline def responsive(value: Boolean): this.type = set("responsive", value.asInstanceOf[js.Any])
    
    inline def restore(value: Boolean): this.type = set("restore", value.asInstanceOf[js.Any])
    
    inline def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
    
    inline def reversed(value: Boolean): this.type = set("reversed", value.asInstanceOf[js.Any])
    
    inline def role(value: AriaRole): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def rotatable(value: Boolean): this.type = set("rotatable", value.asInstanceOf[js.Any])
    
    inline def rowSpan(value: Double): this.type = set("rowSpan", value.asInstanceOf[js.Any])
    
    inline def rows(value: Double): this.type = set("rows", value.asInstanceOf[js.Any])
    
    inline def sandbox(value: String): this.type = set("sandbox", value.asInstanceOf[js.Any])
    
    inline def scalable(value: Boolean): this.type = set("scalable", value.asInstanceOf[js.Any])
    
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
    
    inline def toggleDragModeOnDblclick(value: Boolean): this.type = set("toggleDragModeOnDblclick", value.asInstanceOf[js.Any])
    
    inline def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
    
    inline def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
    
    inline def useMap(value: String): this.type = set("useMap", value.asInstanceOf[js.Any])
    
    inline def value(value: String | js.Array[String] | Double): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueVarargs(value: String*): this.type = set("value", js.Array(value*))
    
    inline def viewMode(value: ViewMode): this.type = set("viewMode", value.asInstanceOf[js.Any])
    
    inline def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
    
    inline def wheelZoomRatio(value: Double): this.type = set("wheelZoomRatio", value.asInstanceOf[js.Any])
    
    inline def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def wmode(value: String): this.type = set("wmode", value.asInstanceOf[js.Any])
    
    inline def wrap(value: String): this.type = set("wrap", value.asInstanceOf[js.Any])
    
    inline def zoom(value: /* event */ ZoomEvent[EventTarget] => Callback): this.type = set("zoom", js.Any.fromFunction1((t0: /* event */ ZoomEvent[EventTarget]) => value(t0).runNow()))
    
    inline def zoomOnTouch(value: Boolean): this.type = set("zoomOnTouch", value.asInstanceOf[js.Any])
    
    inline def zoomOnWheel(value: Boolean): this.type = set("zoomOnWheel", value.asInstanceOf[js.Any])
    
    inline def zoomable(value: Boolean): this.type = set("zoomable", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactCropper.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ReactCropperProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
