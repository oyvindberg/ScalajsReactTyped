package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ReactNodeArray
import typingsJapgolly.semanticUiReact.distCommonjsElementsLabelLabelMod.LabelProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.HtmlLabelProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticWIDTHS
import typingsJapgolly.semanticUiReact.distCommonjsModulesDropdownDropdownItemMod.DropdownItemProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesDropdownDropdownMod.DropdownOnSearchChangeData
import typingsJapgolly.semanticUiReact.distCommonjsModulesDropdownDropdownMod.DropdownProps
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`bottom left`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`bottom right`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`top left`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`top right`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.bottom
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.left
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.right
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_FormSelectProps509196359 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def additionLabel(value: Double | String | Node): this.type = set("additionLabel", value.asInstanceOf[js.Any])
  
  inline def additionLabelNull: this.type = set("additionLabel", null)
  
  inline def additionLabelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("additionLabel", js.Array(value*))
  
  inline def additionLabelVdomElement(value: VdomElement): this.type = set("additionLabel", value.rawElement.asInstanceOf[js.Any])
  
  inline def additionPosition(value: top | bottom): this.type = set("additionPosition", value.asInstanceOf[js.Any])
  
  inline def allowAdditions(value: Boolean): this.type = set("allowAdditions", value.asInstanceOf[js.Any])
  
  inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
  
  inline def basic(value: Boolean): this.type = set("basic", value.asInstanceOf[js.Any])
  
  inline def button(value: Boolean): this.type = set("button", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def clearable(value: Boolean): this.type = set("clearable", value.asInstanceOf[js.Any])
  
  inline def closeOnBlur(value: Boolean): this.type = set("closeOnBlur", value.asInstanceOf[js.Any])
  
  inline def closeOnChange(value: Boolean): this.type = set("closeOnChange", value.asInstanceOf[js.Any])
  
  inline def closeOnEscape(value: Boolean): this.type = set("closeOnEscape", value.asInstanceOf[js.Any])
  
  inline def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
  
  inline def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
  
  inline def contentNull: this.type = set("content", null)
  
  inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
  
  inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
  
  inline def control(value: Any): this.type = set("control", value.asInstanceOf[js.Any])
  
  inline def deburr(value: Boolean): this.type = set("deburr", value.asInstanceOf[js.Any])
  
  inline def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
  
  inline def defaultSearchQuery(value: String): this.type = set("defaultSearchQuery", value.asInstanceOf[js.Any])
  
  inline def defaultSelectedLabel(value: Double | String): this.type = set("defaultSelectedLabel", value.asInstanceOf[js.Any])
  
  inline def defaultUpward(value: Boolean): this.type = set("defaultUpward", value.asInstanceOf[js.Any])
  
  inline def defaultValue(value: String | Double | Boolean | (js.Array[Double | String | Boolean])): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  
  inline def defaultValueVarargs(value: (Double | String | Boolean)*): this.type = set("defaultValue", js.Array(value*))
  
  inline def direction(value: left | right): this.type = set("direction", value.asInstanceOf[js.Any])
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def error(value: Any): this.type = set("error", value.asInstanceOf[js.Any])
  
  inline def floating(value: Boolean): this.type = set("floating", value.asInstanceOf[js.Any])
  
  inline def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
  
  inline def header(value: VdomNode): this.type = set("header", value.rawNode.asInstanceOf[js.Any])
  
  inline def headerNull: this.type = set("header", null)
  
  inline def headerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("header", js.Array(value*))
  
  inline def headerVdomElement(value: VdomElement): this.type = set("header", value.rawElement.asInstanceOf[js.Any])
  
  inline def icon(value: Any): this.type = set("icon", value.asInstanceOf[js.Any])
  
  inline def id(value: Double | String): this.type = set("id", value.asInstanceOf[js.Any])
  
  inline def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
  
  inline def item(value: Boolean): this.type = set("item", value.asInstanceOf[js.Any])
  
  inline def label(value: SemanticShorthandItem[HtmlLabelProps]): this.type = set("label", value.asInstanceOf[js.Any])
  
  inline def labelFunction3(
    value: (/* component */ ElementType, HtmlLabelProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
  ): this.type = set("label", js.Any.fromFunction3(value))
  
  inline def labelNull: this.type = set("label", null)
  
  inline def labelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("label", js.Array(value*))
  
  inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
  
  inline def labeled(value: Boolean): this.type = set("labeled", value.asInstanceOf[js.Any])
  
  inline def lazyLoad(value: Boolean): this.type = set("lazyLoad", value.asInstanceOf[js.Any])
  
  inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
  
  inline def minCharacters(value: Double): this.type = set("minCharacters", value.asInstanceOf[js.Any])
  
  inline def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
  
  inline def noResultsMessage(value: VdomNode): this.type = set("noResultsMessage", value.rawNode.asInstanceOf[js.Any])
  
  inline def noResultsMessageNull: this.type = set("noResultsMessage", null)
  
  inline def noResultsMessageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("noResultsMessage", js.Array(value*))
  
  inline def noResultsMessageVdomElement(value: VdomElement): this.type = set("noResultsMessage", value.rawElement.asInstanceOf[js.Any])
  
  inline def onAddItem(value: (/* event */ ReactEventFrom[HTMLElement], /* data */ DropdownProps) => Callback): this.type = set("onAddItem", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[HTMLElement], t1: /* data */ DropdownProps) => (value(t0, t1)).runNow()))
  
  inline def onBlur(value: (/* event */ ReactFocusEventFrom[HTMLElement], /* data */ DropdownProps) => Callback): this.type = set("onBlur", js.Any.fromFunction2((t0: /* event */ ReactFocusEventFrom[HTMLElement], t1: /* data */ DropdownProps) => (value(t0, t1)).runNow()))
  
  inline def onChange(value: (/* event */ ReactEventFrom[HTMLElement], /* data */ DropdownProps) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[HTMLElement], t1: /* data */ DropdownProps) => (value(t0, t1)).runNow()))
  
  inline def onClick(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ DropdownProps) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ DropdownProps) => (value(t0, t1)).runNow()))
  
  inline def onClose(value: (/* event */ ReactEventFrom[HTMLElement], /* data */ DropdownProps) => Callback): this.type = set("onClose", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[HTMLElement], t1: /* data */ DropdownProps) => (value(t0, t1)).runNow()))
  
  inline def onFocus(value: (/* event */ ReactFocusEventFrom[HTMLElement], /* data */ DropdownProps) => Callback): this.type = set("onFocus", js.Any.fromFunction2((t0: /* event */ ReactFocusEventFrom[HTMLElement], t1: /* data */ DropdownProps) => (value(t0, t1)).runNow()))
  
  inline def onLabelClick(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ LabelProps) => Callback): this.type = set("onLabelClick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ LabelProps) => (value(t0, t1)).runNow()))
  
  inline def onMouseDown(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ DropdownProps) => Callback): this.type = set("onMouseDown", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ DropdownProps) => (value(t0, t1)).runNow()))
  
  inline def onOpen(value: (/* event */ ReactEventFrom[HTMLElement], /* data */ DropdownProps) => Callback): this.type = set("onOpen", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[HTMLElement], t1: /* data */ DropdownProps) => (value(t0, t1)).runNow()))
  
  inline def onSearchChange(
    value: (/* event */ ReactEventFrom[HTMLElement], /* data */ DropdownOnSearchChangeData) => Callback
  ): this.type = set("onSearchChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[HTMLElement], t1: /* data */ DropdownOnSearchChangeData) => (value(t0, t1)).runNow()))
  
  inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
  
  inline def openOnFocus(value: Boolean): this.type = set("openOnFocus", value.asInstanceOf[js.Any])
  
  inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
  
  inline def pointing(
    value: Boolean | left | right | top | (`top left`) | (`top right`) | bottom | (`bottom left`) | (`bottom right`)
  ): this.type = set("pointing", value.asInstanceOf[js.Any])
  
  inline def renderLabel(
    value: (/* item */ DropdownItemProps, /* index */ Double, /* defaultLabelProps */ LabelProps) => Any
  ): this.type = set("renderLabel", js.Any.fromFunction3(value))
  
  inline def required(value: Any): this.type = set("required", value.asInstanceOf[js.Any])
  
  inline def scrolling(value: Boolean): this.type = set("scrolling", value.asInstanceOf[js.Any])
  
  inline def search(
    value: Boolean | (js.Function2[
      /* options */ js.Array[DropdownItemProps], 
      /* value */ String, 
      js.Array[DropdownItemProps]
    ])
  ): this.type = set("search", value.asInstanceOf[js.Any])
  
  inline def searchFunction2(
    value: (/* options */ js.Array[DropdownItemProps], /* value */ String) => js.Array[DropdownItemProps]
  ): this.type = set("search", js.Any.fromFunction2(value))
  
  inline def searchInput(value: Any): this.type = set("searchInput", value.asInstanceOf[js.Any])
  
  inline def searchQuery(value: String): this.type = set("searchQuery", value.asInstanceOf[js.Any])
  
  inline def selectOnBlur(value: Boolean): this.type = set("selectOnBlur", value.asInstanceOf[js.Any])
  
  inline def selectOnNavigation(value: Boolean): this.type = set("selectOnNavigation", value.asInstanceOf[js.Any])
  
  inline def selectedLabel(value: Double | String): this.type = set("selectedLabel", value.asInstanceOf[js.Any])
  
  inline def selection(value: Any): this.type = set("selection", value.asInstanceOf[js.Any])
  
  inline def simple(value: Boolean): this.type = set("simple", value.asInstanceOf[js.Any])
  
  inline def tabIndex(value: Double | String): this.type = set("tabIndex", value.asInstanceOf[js.Any])
  
  inline def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
  
  inline def trigger(value: VdomNode): this.type = set("trigger", value.rawNode.asInstanceOf[js.Any])
  
  inline def triggerNull: this.type = set("trigger", null)
  
  inline def triggerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("trigger", js.Array(value*))
  
  inline def triggerVdomElement(value: VdomElement): this.type = set("trigger", value.rawElement.asInstanceOf[js.Any])
  
  inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
  
  inline def upward(value: Boolean): this.type = set("upward", value.asInstanceOf[js.Any])
  
  inline def value(value: Boolean | Double | String | (js.Array[Boolean | Double | String])): this.type = set("value", value.asInstanceOf[js.Any])
  
  inline def valueVarargs(value: (Boolean | Double | String)*): this.type = set("value", js.Array(value*))
  
  inline def width(value: SemanticWIDTHS): this.type = set("width", value.asInstanceOf[js.Any])
  
  inline def wrapSelection(value: Boolean): this.type = set("wrapSelection", value.asInstanceOf[js.Any])
}
