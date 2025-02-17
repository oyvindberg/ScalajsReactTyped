package typingsJapgolly.reactTextareaAutosize.components

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
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.anon.Html
import typingsJapgolly.react.mod.AriaRole
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.reactTextareaAutosize.distDeclarationsSrcMod.Style
import typingsJapgolly.reactTextareaAutosize.distDeclarationsSrcMod.TextareaHeightChangeMeta
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.`additions removals`
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.`additions text`
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.`inline`
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.`removals additions`
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.`removals text`
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.`text additions`
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.`text removals`
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.additions
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.all
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.ascending
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.assertive
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.both
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.copy
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.date
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.decimal
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.descending
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.dialog
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.email
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.execute
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.grammar
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.grid
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.horizontal
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.inherit
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.link
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.list
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.listbox
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.location
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.menu
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.mixed
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.move
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.no
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.none
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.numeric
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.off
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.on
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.other
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.page
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.polite
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.popup
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.removals
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.search
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.spelling
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.step
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.tel
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.text
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.time
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.tree
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.url
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.vertical
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_TextareaAutosizePropsRefAttributes_395642423[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
  
  inline def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
  
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
  
  inline def autoCapitalize(value: String): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
  
  inline def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
  
  inline def autoCorrect(value: String): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
  
  inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
  
  inline def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
  
  inline def cacheMeasurements(value: Boolean): this.type = set("cacheMeasurements", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
  
  inline def cols(value: Double): this.type = set("cols", value.asInstanceOf[js.Any])
  
  inline def contentEditable(value: Booleanish | inherit): this.type = set("contentEditable", value.asInstanceOf[js.Any])
  
  inline def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
  
  inline def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
  
  inline def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
  
  inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
  
  inline def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  
  inline def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value*))
  
  inline def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
  
  inline def dirName(value: String): this.type = set("dirName", value.asInstanceOf[js.Any])
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
  
  inline def form(value: String): this.type = set("form", value.asInstanceOf[js.Any])
  
  inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
  
  inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  
  inline def inlist(value: Any): this.type = set("inlist", value.asInstanceOf[js.Any])
  
  inline def inputMode(value: none | text | tel | url | email | numeric | decimal | search): this.type = set("inputMode", value.asInstanceOf[js.Any])
  
  inline def is(value: String): this.type = set("is", value.asInstanceOf[js.Any])
  
  inline def itemID(value: String): this.type = set("itemID", value.asInstanceOf[js.Any])
  
  inline def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
  
  inline def itemRef(value: String): this.type = set("itemRef", value.asInstanceOf[js.Any])
  
  inline def itemScope(value: Boolean): this.type = set("itemScope", value.asInstanceOf[js.Any])
  
  inline def itemType(value: String): this.type = set("itemType", value.asInstanceOf[js.Any])
  
  inline def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
  
  inline def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
  
  inline def maxRows(value: Double): this.type = set("maxRows", value.asInstanceOf[js.Any])
  
  inline def minLength(value: Double): this.type = set("minLength", value.asInstanceOf[js.Any])
  
  inline def minRows(value: Double): this.type = set("minRows", value.asInstanceOf[js.Any])
  
  inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
  
  inline def onAbort(value: ReactEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onAbort", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onAnimationEnd(value: ReactAnimationEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onAnimationIteration(value: ReactAnimationEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onAnimationStart(value: ReactAnimationEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onAuxClick(value: ReactMouseEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onBeforeInput(value: ReactEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onBlur(value: ReactFocusEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onCanPlay(value: ReactEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onCanPlayThrough(value: ReactEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onChange(value: ReactEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onClick(value: ReactMouseEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onCompositionEnd(value: ReactCompositionEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onCompositionStart(value: ReactCompositionEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onCompositionUpdate(value: ReactCompositionEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onContextMenu(value: ReactMouseEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onCopy(value: ReactClipboardEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onCut(value: ReactClipboardEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onDoubleClick(value: ReactMouseEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onDrag(value: ReactDragEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onDragEnd(value: ReactDragEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onDragEnter(value: ReactDragEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onDragExit(value: ReactDragEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onDragLeave(value: ReactDragEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onDragOver(value: ReactDragEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onDragStart(value: ReactDragEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onDrop(value: ReactDragEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onDurationChange(value: ReactEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onEmptied(value: ReactEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onEncrypted(value: ReactEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onEnded(value: ReactEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onEnded", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onError(value: ReactEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onFocus(value: ReactFocusEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onHeightChange(value: (/* height */ Double, /* meta */ TextareaHeightChangeMeta) => Callback): this.type = set("onHeightChange", js.Any.fromFunction2((t0: /* height */ Double, t1: /* meta */ TextareaHeightChangeMeta) => (value(t0, t1)).runNow()))
  
  inline def onInput(value: ReactEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onInvalid(value: ReactEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onKeyDown(value: ReactKeyboardEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onKeyPress(value: ReactKeyboardEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onKeyUp(value: ReactKeyboardEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onLoad(value: ReactEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onLoadStart(value: ReactEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onLoadedData(value: ReactEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onLoadedMetadata(value: ReactEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onMouseDown(value: ReactMouseEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onMouseEnter(value: ReactMouseEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onMouseLeave(value: ReactMouseEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onMouseMove(value: ReactMouseEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onMouseOut(value: ReactMouseEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onMouseOver(value: ReactMouseEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onMouseUp(value: ReactMouseEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onPaste(value: ReactClipboardEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onPause(value: ReactEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onPause", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onPlay(value: ReactEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onPlaying(value: ReactEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onPointerCancel(value: ReactPointerEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onPointerDown(value: ReactPointerEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onPointerEnter(value: ReactPointerEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onPointerLeave(value: ReactPointerEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onPointerMove(value: ReactPointerEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onPointerOut(value: ReactPointerEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onPointerOver(value: ReactPointerEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onPointerUp(value: ReactPointerEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onProgress(value: ReactEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onProgress", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onRateChange(value: ReactEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onReset(value: ReactEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onReset", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onScroll(value: ReactUIEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onSeeked(value: ReactEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onSeeking(value: ReactEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onSelect(value: ReactEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onStalled(value: ReactEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onStalled", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onSubmit(value: ReactEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onSuspend(value: ReactEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onTimeUpdate(value: ReactEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onTouchCancel(value: ReactTouchEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onTouchEnd(value: ReactTouchEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onTouchMove(value: ReactTouchEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onTouchStart(value: ReactTouchEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onTransitionEnd(value: ReactTransitionEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onVolumeChange(value: ReactEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onWaiting(value: ReactEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def onWheel(value: ReactWheelEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
  
  inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
  
  inline def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
  
  inline def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
  
  inline def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
  
  inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
  
  inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
  
  inline def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
  
  inline def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
  
  inline def role(value: AriaRole): this.type = set("role", value.asInstanceOf[js.Any])
  
  inline def rows(value: Double): this.type = set("rows", value.asInstanceOf[js.Any])
  
  inline def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
  
  inline def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
  
  inline def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
  
  inline def style(value: Style): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
  
  inline def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
  
  inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
  
  inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  
  inline def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
  
  inline def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
  
  inline def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
  
  inline def value(value: String | js.Array[String] | Double): this.type = set("value", value.asInstanceOf[js.Any])
  
  inline def valueVarargs(value: String*): this.type = set("value", js.Array(value*))
  
  inline def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
  
  inline def wrap(value: String): this.type = set("wrap", value.asInstanceOf[js.Any])
}
