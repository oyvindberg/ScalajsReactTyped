package typingsJapgolly.officeUiFabricReact.components

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
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.anon.Height
import typingsJapgolly.officeUiFabricReact.libComponentsChoiceGroupChoiceGroupDottypesMod.IChoiceGroupOption
import typingsJapgolly.officeUiFabricReact.libComponentsChoiceGroupChoiceGroupOptionChoiceGroupOptionDottypesMod.IChoiceGroupOptionProps
import typingsJapgolly.officeUiFabricReact.libComponentsChoiceGroupChoiceGroupOptionChoiceGroupOptionDottypesMod.IChoiceGroupOptionStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsChoiceGroupChoiceGroupOptionChoiceGroupOptionDottypesMod.IChoiceGroupOptionStyles
import typingsJapgolly.officeUiFabricReact.libComponentsIconIconDottypesMod.IIconProps
import typingsJapgolly.react.anon.Html
import typingsJapgolly.react.mod.AriaRole
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.HTMLInputTypeAttribute
import typingsJapgolly.react.reactStrings.`additions removals`
import typingsJapgolly.react.reactStrings.`additions text`
import typingsJapgolly.react.reactStrings.`inline`
import typingsJapgolly.react.reactStrings.`removals additions`
import typingsJapgolly.react.reactStrings.`removals text`
import typingsJapgolly.react.reactStrings.`text additions`
import typingsJapgolly.react.reactStrings.`text removals`
import typingsJapgolly.react.reactStrings.additions
import typingsJapgolly.react.reactStrings.all
import typingsJapgolly.react.reactStrings.ascending
import typingsJapgolly.react.reactStrings.assertive
import typingsJapgolly.react.reactStrings.both
import typingsJapgolly.react.reactStrings.copy
import typingsJapgolly.react.reactStrings.date
import typingsJapgolly.react.reactStrings.decimal
import typingsJapgolly.react.reactStrings.descending
import typingsJapgolly.react.reactStrings.dialog
import typingsJapgolly.react.reactStrings.done
import typingsJapgolly.react.reactStrings.email
import typingsJapgolly.react.reactStrings.enter
import typingsJapgolly.react.reactStrings.environment
import typingsJapgolly.react.reactStrings.execute
import typingsJapgolly.react.reactStrings.go
import typingsJapgolly.react.reactStrings.grammar
import typingsJapgolly.react.reactStrings.grid
import typingsJapgolly.react.reactStrings.horizontal
import typingsJapgolly.react.reactStrings.inherit
import typingsJapgolly.react.reactStrings.link
import typingsJapgolly.react.reactStrings.list
import typingsJapgolly.react.reactStrings.listbox
import typingsJapgolly.react.reactStrings.location
import typingsJapgolly.react.reactStrings.menu
import typingsJapgolly.react.reactStrings.mixed
import typingsJapgolly.react.reactStrings.move
import typingsJapgolly.react.reactStrings.next
import typingsJapgolly.react.reactStrings.no
import typingsJapgolly.react.reactStrings.none
import typingsJapgolly.react.reactStrings.numeric
import typingsJapgolly.react.reactStrings.off
import typingsJapgolly.react.reactStrings.on
import typingsJapgolly.react.reactStrings.other
import typingsJapgolly.react.reactStrings.page
import typingsJapgolly.react.reactStrings.polite
import typingsJapgolly.react.reactStrings.popup
import typingsJapgolly.react.reactStrings.previous
import typingsJapgolly.react.reactStrings.removals
import typingsJapgolly.react.reactStrings.search
import typingsJapgolly.react.reactStrings.send
import typingsJapgolly.react.reactStrings.spelling
import typingsJapgolly.react.reactStrings.step
import typingsJapgolly.react.reactStrings.tel
import typingsJapgolly.react.reactStrings.text
import typingsJapgolly.react.reactStrings.time
import typingsJapgolly.react.reactStrings.tree
import typingsJapgolly.react.reactStrings.url
import typingsJapgolly.react.reactStrings.user
import typingsJapgolly.react.reactStrings.vertical
import typingsJapgolly.react.reactStrings.yes
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ChoiceGroupOption {
  
  inline def apply(text: String): Builder = {
    val __props = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IChoiceGroupOptionProps]))
  }
  
  @JSImport("office-ui-fabric-react", "ChoiceGroupOption")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
    
    inline def accept(value: String): this.type = set("accept", value.asInstanceOf[js.Any])
    
    inline def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
    
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
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def autoCapitalize(value: String): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
    
    inline def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
    
    inline def autoCorrect(value: String): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
    
    inline def capture(value: Boolean | user | environment): this.type = set("capture", value.asInstanceOf[js.Any])
    
    inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: IRefObject[IChoiceGroupOption]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ IChoiceGroupOption | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ IChoiceGroupOption | Null) => value(t0).runNow()))
    
    inline def contentEditable(value: Booleanish | inherit): this.type = set("contentEditable", value.asInstanceOf[js.Any])
    
    inline def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
    
    inline def crossOrigin(value: String): this.type = set("crossOrigin", value.asInstanceOf[js.Any])
    
    inline def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    inline def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
    
    inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value*))
    
    inline def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    inline def enterKeyHint(value: enter | done | go | next | previous | search | send): this.type = set("enterKeyHint", value.asInstanceOf[js.Any])
    
    inline def focused(value: Boolean): this.type = set("focused", value.asInstanceOf[js.Any])
    
    inline def form(value: String): this.type = set("form", value.asInstanceOf[js.Any])
    
    inline def formAction(value: String): this.type = set("formAction", value.asInstanceOf[js.Any])
    
    inline def formEncType(value: String): this.type = set("formEncType", value.asInstanceOf[js.Any])
    
    inline def formMethod(value: String): this.type = set("formMethod", value.asInstanceOf[js.Any])
    
    inline def formNoValidate(value: Boolean): this.type = set("formNoValidate", value.asInstanceOf[js.Any])
    
    inline def formTarget(value: String): this.type = set("formTarget", value.asInstanceOf[js.Any])
    
    inline def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def iconProps(value: IIconProps): this.type = set("iconProps", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def imageAlt(value: String): this.type = set("imageAlt", value.asInstanceOf[js.Any])
    
    inline def imageSize(value: Height): this.type = set("imageSize", value.asInstanceOf[js.Any])
    
    inline def imageSrc(value: String): this.type = set("imageSrc", value.asInstanceOf[js.Any])
    
    inline def inlist(value: Any): this.type = set("inlist", value.asInstanceOf[js.Any])
    
    inline def inputMode(value: none | text | tel | url | email | numeric | decimal | search): this.type = set("inputMode", value.asInstanceOf[js.Any])
    
    inline def is(value: String): this.type = set("is", value.asInstanceOf[js.Any])
    
    inline def itemID(value: String): this.type = set("itemID", value.asInstanceOf[js.Any])
    
    inline def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
    
    inline def itemRef(value: String): this.type = set("itemRef", value.asInstanceOf[js.Any])
    
    inline def itemScope(value: Boolean): this.type = set("itemScope", value.asInstanceOf[js.Any])
    
    inline def itemType(value: String): this.type = set("itemType", value.asInstanceOf[js.Any])
    
    inline def labelId(value: String): this.type = set("labelId", value.asInstanceOf[js.Any])
    
    inline def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
    
    inline def list(value: String): this.type = set("list", value.asInstanceOf[js.Any])
    
    inline def max(value: Double | String): this.type = set("max", value.asInstanceOf[js.Any])
    
    inline def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    inline def min(value: Double | String): this.type = set("min", value.asInstanceOf[js.Any])
    
    inline def minLength(value: Double): this.type = set("minLength", value.asInstanceOf[js.Any])
    
    inline def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onAbort(value: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onAbort", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onAnimationEnd(value: ReactAnimationEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onAnimationIteration(value: ReactAnimationEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onAnimationStart(value: ReactAnimationEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onAuxClick(value: ReactMouseEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onBeforeInput(value: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onBlur(
      value: (/* ev */ ReactFocusEventFrom[HTMLElement], /* props */ js.UndefOr[IChoiceGroupOption]) => Callback
    ): this.type = set("onBlur", js.Any.fromFunction2((t0: /* ev */ ReactFocusEventFrom[HTMLElement], t1: /* props */ js.UndefOr[IChoiceGroupOption]) => (value(t0, t1)).runNow()))
    
    inline def onCanPlay(value: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onCanPlayThrough(value: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onChange(
      value: (/* evt */ js.UndefOr[ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]], /* props */ js.UndefOr[IChoiceGroupOption]) => Callback
    ): this.type = set("onChange", js.Any.fromFunction2((t0: /* evt */ js.UndefOr[ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]], t1: /* props */ js.UndefOr[IChoiceGroupOption]) => (value(t0, t1)).runNow()))
    
    inline def onClick(value: ReactMouseEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onCompositionEnd(value: ReactCompositionEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onCompositionStart(value: ReactCompositionEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onCompositionUpdate(value: ReactCompositionEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onContextMenu(value: ReactMouseEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onCopy(value: ReactClipboardEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onCut(value: ReactClipboardEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onDoubleClick(value: ReactMouseEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onDrag(value: ReactDragEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onDragEnd(value: ReactDragEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onDragEnter(value: ReactDragEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onDragExit(value: ReactDragEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onDragLeave(value: ReactDragEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onDragOver(value: ReactDragEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onDragStart(value: ReactDragEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onDrop(value: ReactDragEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onDurationChange(value: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onEmptied(value: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onEncrypted(value: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onEnded(value: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onEnded", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onError(value: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onError", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onFocus(
      value: (/* ev */ js.UndefOr[ReactFocusEventFrom[(HTMLElement | HTMLInputElement) & Element]], /* props */ js.UndefOr[IChoiceGroupOption]) => js.UndefOr[Unit]
    ): this.type = set("onFocus", js.Any.fromFunction2(value))
    
    inline def onInput(value: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onInput", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onInvalid(value: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onKeyDown(value: ReactKeyboardEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onKeyPress(value: ReactKeyboardEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onKeyUp(value: ReactKeyboardEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onLoad(value: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onLoad", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onLoadStart(value: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onLoadedData(value: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onLoadedMetadata(value: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onMouseDown(value: ReactMouseEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onMouseEnter(value: ReactMouseEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onMouseLeave(value: ReactMouseEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onMouseMove(value: ReactMouseEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onMouseOut(value: ReactMouseEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onMouseOver(value: ReactMouseEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onMouseUp(value: ReactMouseEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onPaste(value: ReactClipboardEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onPause(value: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onPause", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onPlay(value: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onPlay", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onPlaying(value: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onPointerCancel(value: ReactPointerEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onPointerDown(value: ReactPointerEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onPointerEnter(value: ReactPointerEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onPointerLeave(value: ReactPointerEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onPointerMove(value: ReactPointerEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onPointerOut(value: ReactPointerEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onPointerOver(value: ReactPointerEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onPointerUp(value: ReactPointerEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onProgress(value: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onProgress", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onRateChange(value: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onRenderField(
      value: (/* props */ js.UndefOr[IChoiceGroupOption], /* defaultRender */ js.UndefOr[
          js.Function1[
            /* props */ js.UndefOr[IChoiceGroupOption], 
            typingsJapgolly.react.mod.global.JSX.Element | Null
          ]
        ]) => typingsJapgolly.react.mod.global.JSX.Element | Null
    ): this.type = set("onRenderField", js.Any.fromFunction2(value))
    
    inline def onRenderLabel(
      value: (/* props */ js.UndefOr[IChoiceGroupOption], /* defaultRender */ js.UndefOr[
          js.Function1[
            /* props */ js.UndefOr[IChoiceGroupOption], 
            typingsJapgolly.react.mod.global.JSX.Element | Null
          ]
        ]) => typingsJapgolly.react.mod.global.JSX.Element | Null
    ): this.type = set("onRenderLabel", js.Any.fromFunction2(value))
    
    inline def onReset(value: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onReset", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onScroll(value: ReactUIEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onSeeked(value: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onSeeking(value: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onSelect(value: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onStalled(value: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onStalled", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onSubmit(value: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onSuspend(value: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onTimeUpdate(value: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onTouchCancel(value: ReactTouchEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onTouchEnd(value: ReactTouchEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onTouchMove(value: ReactTouchEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onTouchStart(value: ReactTouchEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onTransitionEnd(value: ReactTransitionEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onVolumeChange(value: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onWaiting(value: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def onWheel(value: ReactWheelEventFrom[(HTMLElement | HTMLInputElement) & Element] => Callback): this.type = set("onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[(HTMLElement | HTMLInputElement) & Element]) => value(t0).runNow()))
    
    inline def pattern(value: String): this.type = set("pattern", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
    
    inline def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
    
    inline def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
    
    inline def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
    
    inline def role(value: AriaRole): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
    
    inline def selectedImageSrc(value: String): this.type = set("selectedImageSrc", value.asInstanceOf[js.Any])
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
    
    inline def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
    
    inline def src(value: String): this.type = set("src", value.asInstanceOf[js.Any])
    
    inline def step(value: Double | String): this.type = set("step", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styles(value: IStyleFunctionOrObject[IChoiceGroupOptionStyleProps, IChoiceGroupOptionStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: IChoiceGroupOptionStyleProps => DeepPartial[IChoiceGroupOptionStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    inline def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    inline def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
    
    inline def `type`(value: HTMLInputTypeAttribute): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
    
    inline def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
    
    inline def value(value: String | js.Array[String] | Double): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueVarargs(value: String*): this.type = set("value", js.Array(value*))
    
    inline def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
    
    inline def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IChoiceGroupOptionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
