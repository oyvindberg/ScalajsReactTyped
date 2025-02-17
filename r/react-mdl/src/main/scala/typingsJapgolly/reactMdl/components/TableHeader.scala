package typingsJapgolly.reactMdl.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactClipboardEventFrom
import japgolly.scalajs.react.ReactCompositionEventFrom
import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.ReactUIEventFrom
import japgolly.scalajs.react.ReactWheelEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactMdl.anon.Html
import typingsJapgolly.reactMdl.mod.TableHeaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableHeader {
  
  inline def apply(name: String): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TableHeaderProps]))
  }
  
  @JSImport("react-mdl", "TableHeader")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactMdl.mod.TableHeader] {
    
    inline def default(value: Boolean): this.type = set("default", value.asInstanceOf[js.Any])
    
    inline def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
    
    inline def accept(value: String): this.type = set("accept", value.asInstanceOf[js.Any])
    
    inline def acceptCharset(value: String): this.type = set("acceptCharset", value.asInstanceOf[js.Any])
    
    inline def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
    
    inline def action(value: String): this.type = set("action", value.asInstanceOf[js.Any])
    
    inline def allowFullScreen(value: Boolean): this.type = set("allowFullScreen", value.asInstanceOf[js.Any])
    
    inline def allowTransparency(value: Boolean): this.type = set("allowTransparency", value.asInstanceOf[js.Any])
    
    inline def alt(value: String): this.type = set("alt", value.asInstanceOf[js.Any])
    
    inline def async(value: Boolean): this.type = set("async", value.asInstanceOf[js.Any])
    
    inline def autoCapitalize(value: String): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
    
    inline def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
    
    inline def autoCorrect(value: String): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def autoPlay(value: Boolean): this.type = set("autoPlay", value.asInstanceOf[js.Any])
    
    inline def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
    
    inline def capture(value: Boolean): this.type = set("capture", value.asInstanceOf[js.Any])
    
    inline def cellFormatter(value: (/* value */ Any, /* row */ Any, /* index */ Double) => Node): this.type = set("cellFormatter", js.Any.fromFunction3(value))
    
    inline def cellPadding(value: Double | String): this.type = set("cellPadding", value.asInstanceOf[js.Any])
    
    inline def cellSpacing(value: Double | String): this.type = set("cellSpacing", value.asInstanceOf[js.Any])
    
    inline def challenge(value: String): this.type = set("challenge", value.asInstanceOf[js.Any])
    
    inline def charSet(value: String): this.type = set("charSet", value.asInstanceOf[js.Any])
    
    inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    inline def classID(value: String): this.type = set("classID", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def colSpan(value: Double): this.type = set("colSpan", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def cols(value: Double): this.type = set("cols", value.asInstanceOf[js.Any])
    
    inline def content(value: String): this.type = set("content", value.asInstanceOf[js.Any])
    
    inline def contentEditable(value: Boolean): this.type = set("contentEditable", value.asInstanceOf[js.Any])
    
    inline def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
    
    inline def controls(value: Boolean): this.type = set("controls", value.asInstanceOf[js.Any])
    
    inline def coords(value: String): this.type = set("coords", value.asInstanceOf[js.Any])
    
    inline def crossOrigin(value: String): this.type = set("crossOrigin", value.asInstanceOf[js.Any])
    
    inline def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    inline def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
    
    inline def dateTime(value: String): this.type = set("dateTime", value.asInstanceOf[js.Any])
    
    inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: Double | String | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value*))
    
    inline def defer(value: Boolean): this.type = set("defer", value.asInstanceOf[js.Any])
    
    inline def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def download(value: Any): this.type = set("download", value.asInstanceOf[js.Any])
    
    inline def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    
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
    
    inline def inputMode(value: String): this.type = set("inputMode", value.asInstanceOf[js.Any])
    
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
    
    inline def minLength(value: Double): this.type = set("minLength", value.asInstanceOf[js.Any])
    
    inline def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    inline def muted(value: Boolean): this.type = set("muted", value.asInstanceOf[js.Any])
    
    inline def noValidate(value: Boolean): this.type = set("noValidate", value.asInstanceOf[js.Any])
    
    inline def nonce(value: String): this.type = set("nonce", value.asInstanceOf[js.Any])
    
    inline def nosort(value: Boolean): this.type = set("nosort", value.asInstanceOf[js.Any])
    
    inline def numeric(value: Boolean): this.type = set("numeric", value.asInstanceOf[js.Any])
    
    inline def onAbort(value: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onAbort", js.Any.fromFunction1((t0: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onBlur(value: ReactFocusEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onCanPlay(value: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onCanPlayThrough(value: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onClick(
      value: (/* e */ ReactMouseEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element], /* name */ String) => Any
    ): this.type = set("onClick", js.Any.fromFunction2(value))
    
    inline def onCompositionEnd(value: ReactCompositionEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onCompositionStart(value: ReactCompositionEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onCompositionUpdate(value: ReactCompositionEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onContextMenu(value: ReactMouseEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onCopy(value: ReactClipboardEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onCut(value: ReactClipboardEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onDoubleClick(value: ReactMouseEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onDrag(value: ReactDragEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onDragEnd(value: ReactDragEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onDragEnter(value: ReactDragEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onDragExit(value: ReactDragEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onDragLeave(value: ReactDragEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onDragOver(value: ReactDragEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onDragStart(value: ReactDragEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onDrop(value: ReactDragEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onDurationChange(value: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onEmptied(value: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onEncrypted(value: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onEnded(value: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onEnded", js.Any.fromFunction1((t0: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onError(value: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onError", js.Any.fromFunction1((t0: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onFocus(value: ReactFocusEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onInput(value: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onInput", js.Any.fromFunction1((t0: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onKeyDown(value: ReactKeyboardEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onKeyPress(value: ReactKeyboardEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onKeyUp(value: ReactKeyboardEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onLoad(value: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onLoad", js.Any.fromFunction1((t0: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onLoadStart(value: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onLoadedData(value: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onLoadedMetadata(value: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onMouseDown(value: ReactMouseEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onMouseEnter(value: ReactMouseEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onMouseLeave(value: ReactMouseEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onMouseMove(value: ReactMouseEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onMouseOut(value: ReactMouseEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onMouseOver(value: ReactMouseEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onMouseUp(value: ReactMouseEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onPaste(value: ReactClipboardEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onPause(value: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onPause", js.Any.fromFunction1((t0: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onPlay(value: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onPlay", js.Any.fromFunction1((t0: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onPlaying(value: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onProgress(value: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onProgress", js.Any.fromFunction1((t0: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onRateChange(value: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onScroll(value: ReactUIEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onSeeked(value: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onSeeking(value: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onSelect(value: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onStalled(value: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onStalled", js.Any.fromFunction1((t0: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onSubmit(value: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onSuspend(value: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onTimeUpdate(value: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onTouchCancel(value: ReactTouchEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onTouchEnd(value: ReactTouchEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onTouchMove(value: ReactTouchEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onTouchStart(value: ReactTouchEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onVolumeChange(value: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onWaiting(value: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def onWheel(value: ReactWheelEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element] => Callback): this.type = set("onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[typingsJapgolly.reactMdl.mod.TableHeader & Element]) => value(t0).runNow()))
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def optimum(value: Double): this.type = set("optimum", value.asInstanceOf[js.Any])
    
    inline def pattern(value: String): this.type = set("pattern", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
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
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def rowSpan(value: Double): this.type = set("rowSpan", value.asInstanceOf[js.Any])
    
    inline def sandbox(value: String): this.type = set("sandbox", value.asInstanceOf[js.Any])
    
    inline def scope(value: String): this.type = set("scope", value.asInstanceOf[js.Any])
    
    inline def scoped(value: Boolean): this.type = set("scoped", value.asInstanceOf[js.Any])
    
    inline def scrolling(value: String): this.type = set("scrolling", value.asInstanceOf[js.Any])
    
    inline def seamless(value: Boolean): this.type = set("seamless", value.asInstanceOf[js.Any])
    
    inline def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
    
    inline def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
    
    inline def shape(value: String): this.type = set("shape", value.asInstanceOf[js.Any])
    
    inline def sizes(value: String): this.type = set("sizes", value.asInstanceOf[js.Any])
    
    inline def sortFn(value: (/* a */ Any, /* b */ Any, /* isAsc */ Boolean) => Double): this.type = set("sortFn", js.Any.fromFunction3(value))
    
    inline def span(value: Double): this.type = set("span", value.asInstanceOf[js.Any])
    
    inline def spellCheck(value: Boolean): this.type = set("spellCheck", value.asInstanceOf[js.Any])
    
    inline def src(value: String): this.type = set("src", value.asInstanceOf[js.Any])
    
    inline def srcDoc(value: String): this.type = set("srcDoc", value.asInstanceOf[js.Any])
    
    inline def srcLang(value: String): this.type = set("srcLang", value.asInstanceOf[js.Any])
    
    inline def srcSet(value: String): this.type = set("srcSet", value.asInstanceOf[js.Any])
    
    inline def start(value: Double): this.type = set("start", value.asInstanceOf[js.Any])
    
    inline def step(value: Double | String): this.type = set("step", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def summary(value: String): this.type = set("summary", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def target(value: String): this.type = set("target", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def tooltip(value: VdomNode): this.type = set("tooltip", value.rawNode.asInstanceOf[js.Any])
    
    inline def tooltipNull: this.type = set("tooltip", null)
    
    inline def tooltipVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("tooltip", js.Array(value*))
    
    inline def tooltipVdomElement(value: VdomElement): this.type = set("tooltip", value.rawElement.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
    
    inline def unselectable(value: Boolean): this.type = set("unselectable", value.asInstanceOf[js.Any])
    
    inline def useMap(value: String): this.type = set("useMap", value.asInstanceOf[js.Any])
    
    inline def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
    
    inline def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def wmode(value: String): this.type = set("wmode", value.asInstanceOf[js.Any])
    
    inline def wrap(value: String): this.type = set("wrap", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TableHeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
