package typingsJapgolly.tabris.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.tabris.mod.AnimationOptions
import typingsJapgolly.tabris.mod.Bounds
import typingsJapgolly.tabris.mod.BoxDimensions
import typingsJapgolly.tabris.mod.ChangeListeners
import typingsJapgolly.tabris.mod.ColorValue
import typingsJapgolly.tabris.mod.Composite
import typingsJapgolly.tabris.mod.CompositeAddChildEvent
import typingsJapgolly.tabris.mod.CompositeRemoveChildEvent
import typingsJapgolly.tabris.mod.ConstraintValue
import typingsJapgolly.tabris.mod.Dimension
import typingsJapgolly.tabris.mod.EventObject
import typingsJapgolly.tabris.mod.ImageValue
import typingsJapgolly.tabris.mod.JSXCompositeAttributes
import typingsJapgolly.tabris.mod.LayoutDataValue
import typingsJapgolly.tabris.mod.LinearGradientValue
import typingsJapgolly.tabris.mod.Listeners
import typingsJapgolly.tabris.mod.NativeObject
import typingsJapgolly.tabris.mod.Omit
import typingsJapgolly.tabris.mod.Properties
import typingsJapgolly.tabris.mod.RuleSet
import typingsJapgolly.tabris.mod.Selector
import typingsJapgolly.tabris.mod.SiblingReferenceValue
import typingsJapgolly.tabris.mod.Tab
import typingsJapgolly.tabris.mod.TabFolderScrollEvent
import typingsJapgolly.tabris.mod.TabFolderSelectEvent
import typingsJapgolly.tabris.mod.Transformation
import typingsJapgolly.tabris.mod.Widget
import typingsJapgolly.tabris.mod.WidgetCollection
import typingsJapgolly.tabris.mod.WidgetLongPressEvent
import typingsJapgolly.tabris.mod.WidgetPanEvent
import typingsJapgolly.tabris.mod.WidgetResizeEvent
import typingsJapgolly.tabris.mod.WidgetSwipeEvent
import typingsJapgolly.tabris.mod.WidgetTapEvent
import typingsJapgolly.tabris.mod.WidgetTouchEvent
import typingsJapgolly.tabris.mod.widgets.TabFolder
import typingsJapgolly.tabris.tabrisBooleans.`true`
import typingsJapgolly.tabris.tabrisStrings.`class`
import typingsJapgolly.tabris.tabrisStrings.auto
import typingsJapgolly.tabris.tabrisStrings.background
import typingsJapgolly.tabris.tabrisStrings.baseline
import typingsJapgolly.tabris.tabrisStrings.bottom
import typingsJapgolly.tabris.tabrisStrings.bounds
import typingsJapgolly.tabris.tabrisStrings.centerX
import typingsJapgolly.tabris.tabrisStrings.centerY
import typingsJapgolly.tabris.tabrisStrings.classList
import typingsJapgolly.tabris.tabrisStrings.cornerRadius
import typingsJapgolly.tabris.tabrisStrings.data
import typingsJapgolly.tabris.tabrisStrings.elevation
import typingsJapgolly.tabris.tabrisStrings.enabled
import typingsJapgolly.tabris.tabrisStrings.excludeFromLayout
import typingsJapgolly.tabris.tabrisStrings.fixed
import typingsJapgolly.tabris.tabrisStrings.height
import typingsJapgolly.tabris.tabrisStrings.hidden
import typingsJapgolly.tabris.tabrisStrings.highlightOnTouch
import typingsJapgolly.tabris.tabrisStrings.id
import typingsJapgolly.tabris.tabrisStrings.layoutData
import typingsJapgolly.tabris.tabrisStrings.left
import typingsJapgolly.tabris.tabrisStrings.opacity
import typingsJapgolly.tabris.tabrisStrings.paging
import typingsJapgolly.tabris.tabrisStrings.right
import typingsJapgolly.tabris.tabrisStrings.scrollable
import typingsJapgolly.tabris.tabrisStrings.selectedTabIndicatorTintColor
import typingsJapgolly.tabris.tabrisStrings.selectedTabTintColor
import typingsJapgolly.tabris.tabrisStrings.selection
import typingsJapgolly.tabris.tabrisStrings.selectionIndex
import typingsJapgolly.tabris.tabrisStrings.set
import typingsJapgolly.tabris.tabrisStrings.tabBarBackground
import typingsJapgolly.tabris.tabrisStrings.tabBarElevation
import typingsJapgolly.tabris.tabrisStrings.tabTintColor
import typingsJapgolly.tabris.tabrisStrings.top
import typingsJapgolly.tabris.tabrisStrings.transform
import typingsJapgolly.tabris.tabrisStrings.visible
import typingsJapgolly.tabris.tabrisStrings.width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tabris.tabris.Omit<tabris.tabris.widgets.TabFolder<tabris.tabris.Tab>, 'set'> */
trait OmitTabFolderTabset[TabType /* <: Tab */] extends StObject {
  
  @JSName("$children")
  var $children: js.Array[Widget[Any]]
  
  @JSName("$flushChildren")
  def $flushChildren(): Unit
  @JSName("$flushChildren")
  var $flushChildren_Original: js.Function0[Unit]
  
  @JSName("$getProperty")
  def $getProperty(name: String): Any
  
  @JSName("$getPropertyGetter")
  def $getPropertyGetter(propertyName: String): Any
  @JSName("$getPropertyGetter")
  var $getPropertyGetter_Original: js.Function1[/* propertyName */ String, Any]
  
  @JSName("$getPropertySetter")
  def $getPropertySetter(propertyName: String): Any
  @JSName("$getPropertySetter")
  var $getPropertySetter_Original: js.Function1[/* propertyName */ String, Any]
  
  @JSName("$getProperty")
  var $getProperty_Original: js.Function1[/* name */ String, Any]
  
  @JSName("$props")
  var $props: Any
  
  @JSName("$setProperty")
  def $setProperty(name: String, value: Any): Unit
  @JSName("$setProperty")
  var $setProperty_Original: js.Function2[/* name */ String, /* value */ Any, Unit]
  
  @JSName("$trigger")
  def $trigger(eventType: String): Unit
  @JSName("$trigger")
  def $trigger(eventType: String, eventData: js.Object): Unit
  @JSName("$trigger")
  var $trigger_Original: js.Function2[/* eventType */ String, /* eventData */ js.UndefOr[js.Object], Unit]
  
  def _acceptChild(child: Widget[Any]): Boolean
  @JSName("_acceptChild")
  var _acceptChild_Original: js.Function1[/* child */ Widget[Any], Boolean]
  
  def _addChild(child: Widget[Any]): Unit
  def _addChild(child: Widget[Any], index: Double): Unit
  @JSName("_addChild")
  var _addChild_Original: js.Function2[/* child */ Widget[Any], /* index */ js.UndefOr[Double], Unit]
  
  def _apply[Target](options: `18`[Target], rules: RuleSet[TabFolder[TabType]]): TabFolder[TabType]
  @JSName("_apply")
  var _apply_Original: js.Function2[
    /* options */ `18`[TabFolder[TabType]], 
    /* rules */ RuleSet[TabFolder[TabType]], 
    TabFolder[TabType]
  ]
  
  def _checkDisposed(): Unit
  @JSName("_checkDisposed")
  var _checkDisposed_Original: js.Function0[Unit]
  
  def _checkLayout(value: typingsJapgolly.tabris.mod.Layout): Unit
  @JSName("_checkLayout")
  var _checkLayout_Original: js.Function1[/* value */ typingsJapgolly.tabris.mod.Layout, Unit]
  
  def _children[Result /* <: Tab */](): WidgetCollection[Result]
  def _children[Result /* <: Tab */](selector: Selector[Tab, Result]): WidgetCollection[Result]
  @JSName("_children")
  var _children_Original: js.Function1[/* selector */ js.UndefOr[Selector[Tab, Tab]], WidgetCollection[Tab]]
  
  def _decodeProperty(propertyName: String, value: Any): Any
  @JSName("_decodeProperty")
  var _decodeProperty_Original: js.Function2[/* propertyName */ String, /* value */ Any, Any]
  
  def _dispose(): Unit
  def _dispose(skipNative: Boolean): Unit
  @JSName("_dispose")
  var _dispose_Original: js.Function1[/* skipNative */ js.UndefOr[Boolean], Unit]
  
  def _encodeProperty(propertyName: String, value: Any): Any
  @JSName("_encodeProperty")
  var _encodeProperty_Original: js.Function2[/* propertyName */ String, /* value */ Any, Any]
  
  def _find[Result /* <: Widget[Any] */](): WidgetCollection[Result]
  def _find[Result /* <: Widget[Any] */](selector: Selector[Widget[Any], Result]): WidgetCollection[Result]
  @JSName("_find")
  var _find_Original: js.Function1[
    /* selector */ js.UndefOr[Selector[Widget[Any], Widget[Any]]], 
    WidgetCollection[Widget[Any]]
  ]
  
  def _getDefaultPropertyValue(propertyName: String): Unit
  @JSName("_getDefaultPropertyValue")
  var _getDefaultPropertyValue_Original: js.Function1[/* propertyName */ String, Unit]
  
  def _getStoredProperty(propertyName: String): Any
  @JSName("_getStoredProperty")
  var _getStoredProperty_Original: js.Function1[/* propertyName */ String, Any]
  
  def _getTypeDef(propertyName: String): Any
  @JSName("_getTypeDef")
  var _getTypeDef_Original: js.Function1[/* propertyName */ String, Any]
  
  def _getXMLAttributes(): js.Array[js.Tuple2[String, Any]]
  @JSName("_getXMLAttributes")
  var _getXMLAttributes_Original: js.Function0[js.Array[js.Tuple2[String, Any]]]
  
  def _getXMLContent(): js.Array[String]
  @JSName("_getXMLContent")
  var _getXMLContent_Original: js.Function0[js.Array[String]]
  
  def _getXMLElementName(): String
  @JSName("_getXMLElementName")
  var _getXMLElementName_Original: js.Function0[String]
  
  def _getXMLFooter(hasChild: Boolean): String
  @JSName("_getXMLFooter")
  var _getXMLFooter_Original: js.Function1[/* hasChild */ Boolean, String]
  
  def _getXMLHeader(hasChild: Boolean): String
  @JSName("_getXMLHeader")
  var _getXMLHeader_Original: js.Function1[/* hasChild */ Boolean, String]
  
  def _initLayout(): Unit
  def _initLayout(props: Layout): Unit
  @JSName("_initLayout")
  var _initLayout_Original: js.Function1[/* props */ js.UndefOr[Layout], Unit]
  
  var _isDisposed: js.UndefOr[`true`] = js.undefined
  
  def _isListening(eventType: String): Boolean
  @JSName("_isListening")
  var _isListening_Original: js.Function1[/* eventType */ String, Boolean]
  
  var _layout: typingsJapgolly.tabris.mod.Layout
  
  def _listen(eventName: String, listening: Boolean): Unit
  @JSName("_listen")
  var _listen_Original: js.Function2[/* eventName */ String, /* listening */ Boolean, Unit]
  
  def _nativeCall(methodName: String, parameters: js.Object): Any
  @JSName("_nativeCall")
  var _nativeCall_Original: js.Function2[/* methodName */ String, /* parameters */ js.Object, Any]
  
  def _nativeCreate(): Unit
  def _nativeCreate(param: StringDictionary[Any]): Unit
  @JSName("_nativeCreate")
  var _nativeCreate_Original: js.Function1[/* param */ js.UndefOr[StringDictionary[Any]], Unit]
  
  def _nativeGet(propertyName: String): Any
  @JSName("_nativeGet")
  var _nativeGet_Original: js.Function1[/* propertyName */ String, Any]
  
  def _nativeListen(eventType: String, listen: Boolean): Unit
  @JSName("_nativeListen")
  var _nativeListen_Original: js.Function2[/* eventType */ String, /* listen */ Boolean, Unit]
  
  def _nativeSet(propertyName: String, value: Any): Unit
  @JSName("_nativeSet")
  var _nativeSet_Original: js.Function2[/* propertyName */ String, /* value */ Any, Unit]
  
  def _nativeType(): String
  @JSName("_nativeType")
  var _nativeType_Original: js.Function0[String]
  
  def _onoff(eventType: String, listening: Boolean, listener: js.Function): Unit
  @JSName("_onoff")
  var _onoff_Original: js.Function3[/* eventType */ String, /* listening */ Boolean, /* listener */ js.Function, Unit]
  
  def _register(): Unit
  @JSName("_register")
  var _register_Original: js.Function0[Unit]
  
  def _release(): Unit
  @JSName("_release")
  var _release_Original: js.Function0[Unit]
  
  def _removeChild(child: Widget[Any]): Unit
  @JSName("_removeChild")
  var _removeChild_Original: js.Function1[/* child */ Widget[Any], Unit]
  
  def _reorderProperties(propertyNames: js.Array[String]): js.Array[String]
  @JSName("_reorderProperties")
  var _reorderProperties_Original: js.Function1[/* propertyNames */ js.Array[String], js.Array[String]]
  
  def _scheduleRenderChildren(): Unit
  @JSName("_scheduleRenderChildren")
  var _scheduleRenderChildren_Original: js.Function0[Unit]
  
  def _setParent(parent: Composite[Widget[Any]]): Unit
  def _setParent(parent: Composite[Widget[Any]], index: Double): Unit
  @JSName("_setParent")
  var _setParent_Original: js.Function2[/* parent */ Composite[Widget[Any]], /* index */ js.UndefOr[Double], Unit]
  
  def _storeProperty(propertyName: String, encodedValue: Any): Unit
  @JSName("_storeProperty")
  var _storeProperty_Original: js.Function2[/* propertyName */ String, /* encodedValue */ Any, Unit]
  
  def _trigger(eventType: String): Boolean
  def _trigger(eventType: String, eventData: js.Object): Boolean
  
  def _triggerChangeEvent(propertyName: String, newEncodedValue: Any): Unit
  @JSName("_triggerChangeEvent")
  var _triggerChangeEvent_Original: js.Function2[/* propertyName */ String, /* newEncodedValue */ Any, Unit]
  
  @JSName("_trigger")
  var _trigger_Original: js.Function2[/* eventType */ String, /* eventData */ js.UndefOr[js.Object], Boolean]
  
  def _wasSet(propertyName: String): Boolean
  @JSName("_wasSet")
  var _wasSet_Original: js.Function1[/* propertyName */ String, Boolean]
  
  var absoluteBounds: Bounds
  
  def animate(properties: Opacity, options: AnimationOptions): js.Promise[Unit]
  @JSName("animate")
  var animate_Original: js.Function2[/* properties */ Opacity, /* options */ AnimationOptions, js.Promise[Unit]]
  
  def append(widgets: Tab*): TabFolder[TabType]
  
  def appendTo(parent: Composite[Widget[Any]]): TabFolder[TabType]
  @JSName("appendTo")
  var appendTo_Original: js.Function1[/* parent */ Composite[Widget[Any]], TabFolder[TabType]]
  
  @JSName("append")
  var append_Original: js.Function1[/* repeated */ Tab, TabFolder[TabType]]
  
  @JSName("apply")
  def apply[Target](options: `18`[Target], rules: RuleSet[TabFolder[TabType]]): TabFolder[TabType]
  @JSName("apply")
  var apply_Original: js.Function2[
    /* options */ `18`[TabFolder[TabType]], 
    /* rules */ RuleSet[TabFolder[TabType]], 
    TabFolder[TabType]
  ]
  
  var background: LinearGradientValue | ColorValue | ImageValue
  
  var baseline: SiblingReferenceValue | auto | `true`
  
  var bottom: ConstraintValue
  
  var bounds: Bounds
  
  var centerX: typingsJapgolly.tabris.mod.Offset | auto | `true`
  
  var centerY: typingsJapgolly.tabris.mod.Offset | auto | `true`
  
  def children[Result /* <: Tab */](): WidgetCollection[Result]
  def children[Result /* <: Tab */](selector: Selector[Tab, Result]): WidgetCollection[Result]
  @JSName("children")
  var children_Original: js.Function1[/* selector */ js.UndefOr[Selector[Tab, Tab]], WidgetCollection[Tab]]
  
  var cid: String
  
  var `class`: String
  
  var classList: js.Array[String]
  
  @JSName("constructor")
  var constructor_Original: js.Function1[
    /* properties */ js.UndefOr[Properties[TabFolder[Tab], Omit[TabFolder[Tab], set]]], 
    Any
  ]
  
  var cornerRadius: Double
  
  var data: Any
  
  var defineChangeEvent: js.UndefOr[Any] = js.undefined
  
  var defineEvent: js.UndefOr[Any] = js.undefined
  
  var defineEvents: js.UndefOr[Any] = js.undefined
  
  var defineProperties: js.UndefOr[Any] = js.undefined
  
  var defineProperty: js.UndefOr[Any] = js.undefined
  
  def detach(): TabFolder[TabType]
  @JSName("detach")
  var detach_Original: js.Function0[TabFolder[TabType]]
  
  def dispose(): Unit
  @JSName("dispose")
  var dispose_Original: js.Function0[Unit]
  
  var elevation: Double
  
  var enabled: Boolean
  
  var excludeFromLayout: Boolean
  
  var extend: js.UndefOr[Any] = js.undefined
  
  def find[Result /* <: Widget[Any] */](): WidgetCollection[Result]
  def find[Result /* <: Widget[Any] */](selector: Selector[Widget[Any], Result]): WidgetCollection[Result]
  @JSName("find")
  var find_Original: js.Function1[
    /* selector */ js.UndefOr[Selector[Widget[Any], Widget[Any]]], 
    WidgetCollection[Widget[Any]]
  ]
  
  var height: Dimension | auto
  
  var highlightOnTouch: Boolean
  
  var id: String
  
  def insertAfter(widget: Widget[Any]): TabFolder[TabType]
  @JSName("insertAfter")
  var insertAfter_Original: js.Function1[/* widget */ Widget[Any], TabFolder[TabType]]
  
  def insertBefore(widget: Widget[Any]): TabFolder[TabType]
  @JSName("insertBefore")
  var insertBefore_Original: js.Function1[/* widget */ Widget[Any], TabFolder[TabType]]
  
  def isDisposed(): Boolean
  @JSName("isDisposed")
  var isDisposed_Original: js.Function0[Boolean]
  
  var jsxAttributes: JSXCompositeAttributes[TabFolder[TabType], Tab]
  
  var layout: js.UndefOr[typingsJapgolly.tabris.mod.Layout | Null] = js.undefined
  
  var layoutData: LayoutDataValue
  
  var left: ConstraintValue
  
  def off(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], Unit]): TabFolder[TabType]
  def off(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], Unit],
    context: js.Object
  ): TabFolder[TabType]
  @JSName("off")
  var off_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], Unit], 
    /* context */ js.UndefOr[js.Object], 
    TabFolder[TabType]
  ]
  
  def on(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], Any]): TabFolder[TabType]
  def on(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], Any],
    context: js.Object
  ): TabFolder[TabType]
  
  var onAddChild: Listeners[CompositeAddChildEvent[TabFolder[TabType]]]
  
  var onBackgroundChanged: ChangeListeners[TabFolder[TabType], background]
  
  var onBaselineChanged: ChangeListeners[TabFolder[TabType], baseline]
  
  var onBottomChanged: ChangeListeners[TabFolder[TabType], bottom]
  
  var onBoundsChanged: ChangeListeners[TabFolder[TabType], bounds]
  
  var onCenterXChanged: ChangeListeners[TabFolder[TabType], centerX]
  
  var onCenterYChanged: ChangeListeners[TabFolder[TabType], centerY]
  
  var onClassChanged: ChangeListeners[TabFolder[TabType], `class`]
  
  var onClassListChanged: ChangeListeners[TabFolder[TabType], classList]
  
  var onCornerRadiusChanged: ChangeListeners[TabFolder[TabType], cornerRadius]
  
  var onDataChanged: ChangeListeners[TabFolder[TabType], data]
  
  var onDispose: Listeners[EventObject[TabFolder[TabType]]]
  
  var onElevationChanged: ChangeListeners[TabFolder[TabType], elevation]
  
  var onEnabledChanged: ChangeListeners[TabFolder[TabType], enabled]
  
  var onExcludeFromLayoutChanged: ChangeListeners[TabFolder[TabType], excludeFromLayout]
  
  var onHeightChanged: ChangeListeners[TabFolder[TabType], height]
  
  var onHighlightOnTouchChanged: ChangeListeners[TabFolder[TabType], highlightOnTouch]
  
  var onIdChanged: ChangeListeners[TabFolder[TabType], id]
  
  var onLayoutDataChanged: ChangeListeners[TabFolder[TabType], layoutData]
  
  var onLeftChanged: ChangeListeners[TabFolder[TabType], left]
  
  var onLongPress: Listeners[WidgetLongPressEvent[TabFolder[TabType]]]
  
  var onOpacityChanged: ChangeListeners[TabFolder[TabType], opacity]
  
  var onPagingChanged: ChangeListeners[TabFolder[TabType], paging]
  
  var onPan: Listeners[WidgetPanEvent[TabFolder[TabType]]]
  
  var onPanDown: Listeners[WidgetPanEvent[TabFolder[TabType]]]
  
  var onPanHorizontal: Listeners[WidgetPanEvent[TabFolder[TabType]]]
  
  var onPanLeft: Listeners[WidgetPanEvent[TabFolder[TabType]]]
  
  var onPanRight: Listeners[WidgetPanEvent[TabFolder[TabType]]]
  
  var onPanUp: Listeners[WidgetPanEvent[TabFolder[TabType]]]
  
  var onPanVertical: Listeners[WidgetPanEvent[TabFolder[TabType]]]
  
  var onRemoveChild: Listeners[CompositeRemoveChildEvent[TabFolder[TabType]]]
  
  var onResize: Listeners[WidgetResizeEvent[TabFolder[TabType]]]
  
  var onRightChanged: ChangeListeners[TabFolder[TabType], right]
  
  var onScroll: Listeners[TabFolderScrollEvent[TabFolder[TabType]]]
  
  var onSelect: Listeners[TabFolderSelectEvent[TabFolder[TabType]]]
  
  var onSelectedTabIndicatorTintColorChanged: ChangeListeners[TabFolder[TabType], selectedTabIndicatorTintColor]
  
  var onSelectedTabTintColorChanged: ChangeListeners[TabFolder[TabType], selectedTabTintColor]
  
  var onSelectionChanged: ChangeListeners[TabFolder[TabType], selection]
  
  var onSelectionIndexChanged: ChangeListeners[TabFolder[TabType], selectionIndex]
  
  var onSwipeDown: Listeners[WidgetSwipeEvent[TabFolder[TabType]]]
  
  var onSwipeLeft: Listeners[WidgetSwipeEvent[TabFolder[TabType]]]
  
  var onSwipeRight: Listeners[WidgetSwipeEvent[TabFolder[TabType]]]
  
  var onSwipeUp: Listeners[WidgetSwipeEvent[TabFolder[TabType]]]
  
  var onTabBarBackgroundChanged: ChangeListeners[TabFolder[TabType], tabBarBackground]
  
  var onTabBarElevationChanged: ChangeListeners[TabFolder[TabType], tabBarElevation]
  
  var onTabTintColorChanged: ChangeListeners[TabFolder[TabType], tabTintColor]
  
  var onTap: Listeners[WidgetTapEvent[TabFolder[TabType]]]
  
  var onTopChanged: ChangeListeners[TabFolder[TabType], top]
  
  var onTouchCancel: Listeners[WidgetTouchEvent[TabFolder[TabType]]]
  
  var onTouchEnd: Listeners[WidgetTouchEvent[TabFolder[TabType]]]
  
  var onTouchMove: Listeners[WidgetTouchEvent[TabFolder[TabType]]]
  
  var onTouchStart: Listeners[WidgetTouchEvent[TabFolder[TabType]]]
  
  var onTransformChanged: ChangeListeners[TabFolder[TabType], transform]
  
  var onVisibleChanged: ChangeListeners[TabFolder[TabType], visible]
  
  var onWidthChanged: ChangeListeners[TabFolder[TabType], width]
  
  @JSName("on")
  var on_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], 
    /* context */ js.UndefOr[js.Object], 
    TabFolder[TabType]
  ]
  
  def once(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], Any]): TabFolder[TabType]
  def once(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], Any],
    context: js.Object
  ): TabFolder[TabType]
  @JSName("once")
  var once_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], 
    /* context */ js.UndefOr[js.Object], 
    TabFolder[TabType]
  ]
  
  var opacity: Double
  
  var padding: js.UndefOr[BoxDimensions | Null] = js.undefined
  
  var paging: Boolean
  
  def parent(): Composite[Widget[Any]]
  @JSName("parent")
  var parent_Original: js.Function0[Composite[Widget[Any]]]
  
  var right: ConstraintValue
  
  var selectedTabIndicatorTintColor: ColorValue
  
  var selectedTabTintColor: ColorValue
  
  var selection: Tab
  
  var selectionIndex: Double
  
  def siblings[Result /* <: Widget[Any] */](): WidgetCollection[Result]
  def siblings[Result /* <: Widget[Any] */](selector: Selector[Widget[Any], Result]): WidgetCollection[Result]
  @JSName("siblings")
  var siblings_Original: js.Function1[
    /* selector */ js.UndefOr[Selector[Widget[Any], Widget[Any]]], 
    WidgetCollection[Widget[Any]]
  ]
  
  var tabBarBackground: ColorValue
  
  var tabBarElevation: Double
  
  var tabBarLocation: auto | bottom | hidden | top
  
  var tabMode: fixed | scrollable
  
  var tabTintColor: ColorValue
  
  var top: ConstraintValue
  
  var transform: Transformation
  
  def trigger(`type`: String): TabFolder[TabType]
  
  def triggerAsync(`type`: String): js.Promise[TabFolder[TabType]]
  @JSName("triggerAsync")
  var triggerAsync_Original: js.Function1[/* type */ String, js.Promise[TabFolder[TabType]]]
  
  @JSName("trigger")
  var trigger_Original: js.Function1[/* type */ String, TabFolder[TabType]]
  
  var visible: Boolean
  
  var width: Dimension | auto
}
object OmitTabFolderTabset {
  
  inline def apply[TabType /* <: Tab */](
    $children: js.Array[Widget[Any]],
    $flushChildren: Callback,
    $getProperty: /* name */ String => Any,
    $getPropertyGetter: /* propertyName */ String => Any,
    $getPropertySetter: /* propertyName */ String => Any,
    $props: Any,
    $setProperty: (/* name */ String, /* value */ Any) => Callback,
    $trigger: (/* eventType */ String, /* eventData */ js.UndefOr[js.Object]) => Callback,
    _acceptChild: /* child */ Widget[Any] => Boolean,
    _addChild: (/* child */ Widget[Any], /* index */ js.UndefOr[Double]) => Callback,
    _apply: (/* options */ `18`[TabFolder[TabType]], /* rules */ RuleSet[TabFolder[TabType]]) => TabFolder[TabType],
    _checkDisposed: Callback,
    _checkLayout: /* value */ typingsJapgolly.tabris.mod.Layout => Callback,
    _children: /* selector */ js.UndefOr[Selector[Tab, Tab]] => WidgetCollection[Tab],
    _decodeProperty: (/* propertyName */ String, /* value */ Any) => Any,
    _dispose: /* skipNative */ js.UndefOr[Boolean] => Callback,
    _encodeProperty: (/* propertyName */ String, /* value */ Any) => Any,
    _find: /* selector */ js.UndefOr[Selector[Widget[Any], Widget[Any]]] => WidgetCollection[Widget[Any]],
    _getDefaultPropertyValue: /* propertyName */ String => Callback,
    _getStoredProperty: /* propertyName */ String => Any,
    _getTypeDef: /* propertyName */ String => Any,
    _getXMLAttributes: CallbackTo[js.Array[js.Tuple2[String, Any]]],
    _getXMLContent: CallbackTo[js.Array[String]],
    _getXMLElementName: CallbackTo[String],
    _getXMLFooter: /* hasChild */ Boolean => String,
    _getXMLHeader: /* hasChild */ Boolean => String,
    _initLayout: /* props */ js.UndefOr[Layout] => Callback,
    _isListening: /* eventType */ String => Boolean,
    _layout: typingsJapgolly.tabris.mod.Layout,
    _listen: (/* eventName */ String, /* listening */ Boolean) => Callback,
    _nativeCall: (/* methodName */ String, /* parameters */ js.Object) => Any,
    _nativeCreate: /* param */ js.UndefOr[StringDictionary[Any]] => Callback,
    _nativeGet: /* propertyName */ String => Any,
    _nativeListen: (/* eventType */ String, /* listen */ Boolean) => Callback,
    _nativeSet: (/* propertyName */ String, /* value */ Any) => Callback,
    _nativeType: CallbackTo[String],
    _onoff: (/* eventType */ String, /* listening */ Boolean, /* listener */ js.Function) => Callback,
    _register: Callback,
    _release: Callback,
    _removeChild: /* child */ Widget[Any] => Callback,
    _reorderProperties: /* propertyNames */ js.Array[String] => js.Array[String],
    _scheduleRenderChildren: Callback,
    _setParent: (/* parent */ Composite[Widget[Any]], /* index */ js.UndefOr[Double]) => Callback,
    _storeProperty: (/* propertyName */ String, /* encodedValue */ Any) => Callback,
    _trigger: (/* eventType */ String, /* eventData */ js.UndefOr[js.Object]) => Boolean,
    _triggerChangeEvent: (/* propertyName */ String, /* newEncodedValue */ Any) => Callback,
    _wasSet: /* propertyName */ String => Boolean,
    absoluteBounds: Bounds,
    animate: (/* properties */ Opacity, /* options */ AnimationOptions) => js.Promise[Unit],
    append: /* repeated */ Tab => TabFolder[TabType],
    appendTo: /* parent */ Composite[Widget[Any]] => TabFolder[TabType],
    apply: (/* options */ `18`[TabFolder[TabType]], /* rules */ RuleSet[TabFolder[TabType]]) => TabFolder[TabType],
    baseline: SiblingReferenceValue | auto | `true`,
    bottom: ConstraintValue,
    bounds: Bounds,
    centerX: typingsJapgolly.tabris.mod.Offset | auto | `true`,
    centerY: typingsJapgolly.tabris.mod.Offset | auto | `true`,
    children: /* selector */ js.UndefOr[Selector[Tab, Tab]] => WidgetCollection[Tab],
    cid: String,
    `class`: String,
    classList: js.Array[String],
    constructor: /* properties */ js.UndefOr[Properties[TabFolder[Tab], Omit[TabFolder[Tab], set]]] => Any,
    cornerRadius: Double,
    data: Any,
    detach: CallbackTo[TabFolder[TabType]],
    dispose: Callback,
    elevation: Double,
    enabled: Boolean,
    excludeFromLayout: Boolean,
    find: /* selector */ js.UndefOr[Selector[Widget[Any], Widget[Any]]] => WidgetCollection[Widget[Any]],
    height: Dimension | auto,
    highlightOnTouch: Boolean,
    id: String,
    insertAfter: /* widget */ Widget[Any] => TabFolder[TabType],
    insertBefore: /* widget */ Widget[Any] => TabFolder[TabType],
    isDisposed: CallbackTo[Boolean],
    jsxAttributes: JSXCompositeAttributes[TabFolder[TabType], Tab],
    layoutData: LayoutDataValue,
    left: ConstraintValue,
    off: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Unit], /* context */ js.UndefOr[js.Object]) => TabFolder[TabType],
    on: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], /* context */ js.UndefOr[js.Object]) => TabFolder[TabType],
    onAddChild: Listeners[CompositeAddChildEvent[TabFolder[TabType]]],
    onBackgroundChanged: ChangeListeners[TabFolder[TabType], background],
    onBaselineChanged: ChangeListeners[TabFolder[TabType], baseline],
    onBottomChanged: ChangeListeners[TabFolder[TabType], bottom],
    onBoundsChanged: ChangeListeners[TabFolder[TabType], bounds],
    onCenterXChanged: ChangeListeners[TabFolder[TabType], centerX],
    onCenterYChanged: ChangeListeners[TabFolder[TabType], centerY],
    onClassChanged: ChangeListeners[TabFolder[TabType], `class`],
    onClassListChanged: ChangeListeners[TabFolder[TabType], classList],
    onCornerRadiusChanged: ChangeListeners[TabFolder[TabType], cornerRadius],
    onDataChanged: ChangeListeners[TabFolder[TabType], data],
    onDispose: Listeners[EventObject[TabFolder[TabType]]],
    onElevationChanged: ChangeListeners[TabFolder[TabType], elevation],
    onEnabledChanged: ChangeListeners[TabFolder[TabType], enabled],
    onExcludeFromLayoutChanged: ChangeListeners[TabFolder[TabType], excludeFromLayout],
    onHeightChanged: ChangeListeners[TabFolder[TabType], height],
    onHighlightOnTouchChanged: ChangeListeners[TabFolder[TabType], highlightOnTouch],
    onIdChanged: ChangeListeners[TabFolder[TabType], id],
    onLayoutDataChanged: ChangeListeners[TabFolder[TabType], layoutData],
    onLeftChanged: ChangeListeners[TabFolder[TabType], left],
    onLongPress: Listeners[WidgetLongPressEvent[TabFolder[TabType]]],
    onOpacityChanged: ChangeListeners[TabFolder[TabType], opacity],
    onPagingChanged: ChangeListeners[TabFolder[TabType], paging],
    onPan: Listeners[WidgetPanEvent[TabFolder[TabType]]],
    onPanDown: Listeners[WidgetPanEvent[TabFolder[TabType]]],
    onPanHorizontal: Listeners[WidgetPanEvent[TabFolder[TabType]]],
    onPanLeft: Listeners[WidgetPanEvent[TabFolder[TabType]]],
    onPanRight: Listeners[WidgetPanEvent[TabFolder[TabType]]],
    onPanUp: Listeners[WidgetPanEvent[TabFolder[TabType]]],
    onPanVertical: Listeners[WidgetPanEvent[TabFolder[TabType]]],
    onRemoveChild: Listeners[CompositeRemoveChildEvent[TabFolder[TabType]]],
    onResize: Listeners[WidgetResizeEvent[TabFolder[TabType]]],
    onRightChanged: ChangeListeners[TabFolder[TabType], right],
    onScroll: Listeners[TabFolderScrollEvent[TabFolder[TabType]]],
    onSelect: Listeners[TabFolderSelectEvent[TabFolder[TabType]]],
    onSelectedTabIndicatorTintColorChanged: ChangeListeners[TabFolder[TabType], selectedTabIndicatorTintColor],
    onSelectedTabTintColorChanged: ChangeListeners[TabFolder[TabType], selectedTabTintColor],
    onSelectionChanged: ChangeListeners[TabFolder[TabType], selection],
    onSelectionIndexChanged: ChangeListeners[TabFolder[TabType], selectionIndex],
    onSwipeDown: Listeners[WidgetSwipeEvent[TabFolder[TabType]]],
    onSwipeLeft: Listeners[WidgetSwipeEvent[TabFolder[TabType]]],
    onSwipeRight: Listeners[WidgetSwipeEvent[TabFolder[TabType]]],
    onSwipeUp: Listeners[WidgetSwipeEvent[TabFolder[TabType]]],
    onTabBarBackgroundChanged: ChangeListeners[TabFolder[TabType], tabBarBackground],
    onTabBarElevationChanged: ChangeListeners[TabFolder[TabType], tabBarElevation],
    onTabTintColorChanged: ChangeListeners[TabFolder[TabType], tabTintColor],
    onTap: Listeners[WidgetTapEvent[TabFolder[TabType]]],
    onTopChanged: ChangeListeners[TabFolder[TabType], top],
    onTouchCancel: Listeners[WidgetTouchEvent[TabFolder[TabType]]],
    onTouchEnd: Listeners[WidgetTouchEvent[TabFolder[TabType]]],
    onTouchMove: Listeners[WidgetTouchEvent[TabFolder[TabType]]],
    onTouchStart: Listeners[WidgetTouchEvent[TabFolder[TabType]]],
    onTransformChanged: ChangeListeners[TabFolder[TabType], transform],
    onVisibleChanged: ChangeListeners[TabFolder[TabType], visible],
    onWidthChanged: ChangeListeners[TabFolder[TabType], width],
    once: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], /* context */ js.UndefOr[js.Object]) => TabFolder[TabType],
    opacity: Double,
    paging: Boolean,
    parent: CallbackTo[Composite[Widget[Any]]],
    right: ConstraintValue,
    selection: Tab,
    selectionIndex: Double,
    siblings: /* selector */ js.UndefOr[Selector[Widget[Any], Widget[Any]]] => WidgetCollection[Widget[Any]],
    tabBarElevation: Double,
    tabBarLocation: auto | bottom | hidden | top,
    tabMode: fixed | scrollable,
    top: ConstraintValue,
    transform: Transformation,
    trigger: /* type */ String => TabFolder[TabType],
    triggerAsync: /* type */ String => js.Promise[TabFolder[TabType]],
    visible: Boolean,
    width: Dimension | auto
  ): OmitTabFolderTabset[TabType] = {
    val __obj = js.Dynamic.literal($children = $children.asInstanceOf[js.Any], $flushChildren = $flushChildren.toJsFn, $getProperty = js.Any.fromFunction1($getProperty), $getPropertyGetter = js.Any.fromFunction1($getPropertyGetter), $getPropertySetter = js.Any.fromFunction1($getPropertySetter), $props = $props.asInstanceOf[js.Any], $setProperty = js.Any.fromFunction2((t0: /* name */ String, t1: /* value */ Any) => ($setProperty(t0, t1)).runNow()), $trigger = js.Any.fromFunction2((t0: /* eventType */ String, t1: /* eventData */ js.UndefOr[js.Object]) => ($trigger(t0, t1)).runNow()), _acceptChild = js.Any.fromFunction1(_acceptChild), _addChild = js.Any.fromFunction2((t0: /* child */ Widget[Any], t1: /* index */ js.UndefOr[Double]) => (_addChild(t0, t1)).runNow()), _apply = js.Any.fromFunction2(_apply), _checkDisposed = _checkDisposed.toJsFn, _checkLayout = js.Any.fromFunction1((t0: /* value */ typingsJapgolly.tabris.mod.Layout) => _checkLayout(t0).runNow()), _children = js.Any.fromFunction1(_children), _decodeProperty = js.Any.fromFunction2(_decodeProperty), _dispose = js.Any.fromFunction1((t0: /* skipNative */ js.UndefOr[Boolean]) => _dispose(t0).runNow()), _encodeProperty = js.Any.fromFunction2(_encodeProperty), _find = js.Any.fromFunction1(_find), _getDefaultPropertyValue = js.Any.fromFunction1((t0: /* propertyName */ String) => _getDefaultPropertyValue(t0).runNow()), _getStoredProperty = js.Any.fromFunction1(_getStoredProperty), _getTypeDef = js.Any.fromFunction1(_getTypeDef), _getXMLAttributes = _getXMLAttributes.toJsFn, _getXMLContent = _getXMLContent.toJsFn, _getXMLElementName = _getXMLElementName.toJsFn, _getXMLFooter = js.Any.fromFunction1(_getXMLFooter), _getXMLHeader = js.Any.fromFunction1(_getXMLHeader), _initLayout = js.Any.fromFunction1((t0: /* props */ js.UndefOr[Layout]) => _initLayout(t0).runNow()), _isListening = js.Any.fromFunction1(_isListening), _layout = _layout.asInstanceOf[js.Any], _listen = js.Any.fromFunction2((t0: /* eventName */ String, t1: /* listening */ Boolean) => (_listen(t0, t1)).runNow()), _nativeCall = js.Any.fromFunction2(_nativeCall), _nativeCreate = js.Any.fromFunction1((t0: /* param */ js.UndefOr[StringDictionary[Any]]) => _nativeCreate(t0).runNow()), _nativeGet = js.Any.fromFunction1(_nativeGet), _nativeListen = js.Any.fromFunction2((t0: /* eventType */ String, t1: /* listen */ Boolean) => (_nativeListen(t0, t1)).runNow()), _nativeSet = js.Any.fromFunction2((t0: /* propertyName */ String, t1: /* value */ Any) => (_nativeSet(t0, t1)).runNow()), _nativeType = _nativeType.toJsFn, _onoff = js.Any.fromFunction3((t0: /* eventType */ String, t1: /* listening */ Boolean, t2: /* listener */ js.Function) => (_onoff(t0, t1, t2)).runNow()), _register = _register.toJsFn, _release = _release.toJsFn, _removeChild = js.Any.fromFunction1((t0: /* child */ Widget[Any]) => _removeChild(t0).runNow()), _reorderProperties = js.Any.fromFunction1(_reorderProperties), _scheduleRenderChildren = _scheduleRenderChildren.toJsFn, _setParent = js.Any.fromFunction2((t0: /* parent */ Composite[Widget[Any]], t1: /* index */ js.UndefOr[Double]) => (_setParent(t0, t1)).runNow()), _storeProperty = js.Any.fromFunction2((t0: /* propertyName */ String, t1: /* encodedValue */ Any) => (_storeProperty(t0, t1)).runNow()), _trigger = js.Any.fromFunction2(_trigger), _triggerChangeEvent = js.Any.fromFunction2((t0: /* propertyName */ String, t1: /* newEncodedValue */ Any) => (_triggerChangeEvent(t0, t1)).runNow()), _wasSet = js.Any.fromFunction1(_wasSet), absoluteBounds = absoluteBounds.asInstanceOf[js.Any], animate = js.Any.fromFunction2(animate), append = js.Any.fromFunction1(append), appendTo = js.Any.fromFunction1(appendTo), apply = js.Any.fromFunction2(apply), baseline = baseline.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], centerX = centerX.asInstanceOf[js.Any], centerY = centerY.asInstanceOf[js.Any], children = js.Any.fromFunction1(children), cid = cid.asInstanceOf[js.Any], classList = classList.asInstanceOf[js.Any], constructor = js.Any.fromFunction1(constructor), cornerRadius = cornerRadius.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], detach = detach.toJsFn, dispose = dispose.toJsFn, elevation = elevation.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], excludeFromLayout = excludeFromLayout.asInstanceOf[js.Any], find = js.Any.fromFunction1(find), height = height.asInstanceOf[js.Any], highlightOnTouch = highlightOnTouch.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], insertAfter = js.Any.fromFunction1(insertAfter), insertBefore = js.Any.fromFunction1(insertBefore), isDisposed = isDisposed.toJsFn, jsxAttributes = jsxAttributes.asInstanceOf[js.Any], layoutData = layoutData.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], off = js.Any.fromFunction3(off), on = js.Any.fromFunction3(on), onAddChild = onAddChild.asInstanceOf[js.Any], onBackgroundChanged = onBackgroundChanged.asInstanceOf[js.Any], onBaselineChanged = onBaselineChanged.asInstanceOf[js.Any], onBottomChanged = onBottomChanged.asInstanceOf[js.Any], onBoundsChanged = onBoundsChanged.asInstanceOf[js.Any], onCenterXChanged = onCenterXChanged.asInstanceOf[js.Any], onCenterYChanged = onCenterYChanged.asInstanceOf[js.Any], onClassChanged = onClassChanged.asInstanceOf[js.Any], onClassListChanged = onClassListChanged.asInstanceOf[js.Any], onCornerRadiusChanged = onCornerRadiusChanged.asInstanceOf[js.Any], onDataChanged = onDataChanged.asInstanceOf[js.Any], onDispose = onDispose.asInstanceOf[js.Any], onElevationChanged = onElevationChanged.asInstanceOf[js.Any], onEnabledChanged = onEnabledChanged.asInstanceOf[js.Any], onExcludeFromLayoutChanged = onExcludeFromLayoutChanged.asInstanceOf[js.Any], onHeightChanged = onHeightChanged.asInstanceOf[js.Any], onHighlightOnTouchChanged = onHighlightOnTouchChanged.asInstanceOf[js.Any], onIdChanged = onIdChanged.asInstanceOf[js.Any], onLayoutDataChanged = onLayoutDataChanged.asInstanceOf[js.Any], onLeftChanged = onLeftChanged.asInstanceOf[js.Any], onLongPress = onLongPress.asInstanceOf[js.Any], onOpacityChanged = onOpacityChanged.asInstanceOf[js.Any], onPagingChanged = onPagingChanged.asInstanceOf[js.Any], onPan = onPan.asInstanceOf[js.Any], onPanDown = onPanDown.asInstanceOf[js.Any], onPanHorizontal = onPanHorizontal.asInstanceOf[js.Any], onPanLeft = onPanLeft.asInstanceOf[js.Any], onPanRight = onPanRight.asInstanceOf[js.Any], onPanUp = onPanUp.asInstanceOf[js.Any], onPanVertical = onPanVertical.asInstanceOf[js.Any], onRemoveChild = onRemoveChild.asInstanceOf[js.Any], onResize = onResize.asInstanceOf[js.Any], onRightChanged = onRightChanged.asInstanceOf[js.Any], onScroll = onScroll.asInstanceOf[js.Any], onSelect = onSelect.asInstanceOf[js.Any], onSelectedTabIndicatorTintColorChanged = onSelectedTabIndicatorTintColorChanged.asInstanceOf[js.Any], onSelectedTabTintColorChanged = onSelectedTabTintColorChanged.asInstanceOf[js.Any], onSelectionChanged = onSelectionChanged.asInstanceOf[js.Any], onSelectionIndexChanged = onSelectionIndexChanged.asInstanceOf[js.Any], onSwipeDown = onSwipeDown.asInstanceOf[js.Any], onSwipeLeft = onSwipeLeft.asInstanceOf[js.Any], onSwipeRight = onSwipeRight.asInstanceOf[js.Any], onSwipeUp = onSwipeUp.asInstanceOf[js.Any], onTabBarBackgroundChanged = onTabBarBackgroundChanged.asInstanceOf[js.Any], onTabBarElevationChanged = onTabBarElevationChanged.asInstanceOf[js.Any], onTabTintColorChanged = onTabTintColorChanged.asInstanceOf[js.Any], onTap = onTap.asInstanceOf[js.Any], onTopChanged = onTopChanged.asInstanceOf[js.Any], onTouchCancel = onTouchCancel.asInstanceOf[js.Any], onTouchEnd = onTouchEnd.asInstanceOf[js.Any], onTouchMove = onTouchMove.asInstanceOf[js.Any], onTouchStart = onTouchStart.asInstanceOf[js.Any], onTransformChanged = onTransformChanged.asInstanceOf[js.Any], onVisibleChanged = onVisibleChanged.asInstanceOf[js.Any], onWidthChanged = onWidthChanged.asInstanceOf[js.Any], once = js.Any.fromFunction3(once), opacity = opacity.asInstanceOf[js.Any], paging = paging.asInstanceOf[js.Any], parent = parent.toJsFn, right = right.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionIndex = selectionIndex.asInstanceOf[js.Any], siblings = js.Any.fromFunction1(siblings), tabBarElevation = tabBarElevation.asInstanceOf[js.Any], tabBarLocation = tabBarLocation.asInstanceOf[js.Any], tabMode = tabMode.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], trigger = js.Any.fromFunction1(trigger), triggerAsync = js.Any.fromFunction1(triggerAsync), visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], background = null, selectedTabIndicatorTintColor = null, selectedTabTintColor = null, tabBarBackground = null, tabTintColor = null)
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitTabFolderTabset[TabType]]
  }
  
  extension [Self <: OmitTabFolderTabset[?], TabType /* <: Tab */](x: Self & OmitTabFolderTabset[TabType]) {
    
    inline def set$children(value: js.Array[Widget[Any]]): Self = StObject.set(x, "$children", value.asInstanceOf[js.Any])
    
    inline def set$childrenVarargs(value: Widget[Any]*): Self = StObject.set(x, "$children", js.Array(value*))
    
    inline def set$flushChildren(value: Callback): Self = StObject.set(x, "$flushChildren", value.toJsFn)
    
    inline def set$getProperty(value: /* name */ String => Any): Self = StObject.set(x, "$getProperty", js.Any.fromFunction1(value))
    
    inline def set$getPropertyGetter(value: /* propertyName */ String => Any): Self = StObject.set(x, "$getPropertyGetter", js.Any.fromFunction1(value))
    
    inline def set$getPropertySetter(value: /* propertyName */ String => Any): Self = StObject.set(x, "$getPropertySetter", js.Any.fromFunction1(value))
    
    inline def set$props(value: Any): Self = StObject.set(x, "$props", value.asInstanceOf[js.Any])
    
    inline def set$setProperty(value: (/* name */ String, /* value */ Any) => Callback): Self = StObject.set(x, "$setProperty", js.Any.fromFunction2((t0: /* name */ String, t1: /* value */ Any) => (value(t0, t1)).runNow()))
    
    inline def set$trigger(value: (/* eventType */ String, /* eventData */ js.UndefOr[js.Object]) => Callback): Self = StObject.set(x, "$trigger", js.Any.fromFunction2((t0: /* eventType */ String, t1: /* eventData */ js.UndefOr[js.Object]) => (value(t0, t1)).runNow()))
    
    inline def setAbsoluteBounds(value: Bounds): Self = StObject.set(x, "absoluteBounds", value.asInstanceOf[js.Any])
    
    inline def setAnimate(value: (/* properties */ Opacity, /* options */ AnimationOptions) => js.Promise[Unit]): Self = StObject.set(x, "animate", js.Any.fromFunction2(value))
    
    inline def setAppend(value: /* repeated */ Tab => TabFolder[TabType]): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
    
    inline def setAppendTo(value: /* parent */ Composite[Widget[Any]] => TabFolder[TabType]): Self = StObject.set(x, "appendTo", js.Any.fromFunction1(value))
    
    inline def setApply(
      value: (/* options */ `18`[TabFolder[TabType]], /* rules */ RuleSet[TabFolder[TabType]]) => TabFolder[TabType]
    ): Self = StObject.set(x, "apply", js.Any.fromFunction2(value))
    
    inline def setBackground(value: LinearGradientValue | ColorValue | ImageValue): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundNull: Self = StObject.set(x, "background", null)
    
    inline def setBaseline(value: SiblingReferenceValue | auto | `true`): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    inline def setBottom(value: ConstraintValue): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setCenterX(value: typingsJapgolly.tabris.mod.Offset | auto | `true`): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
    
    inline def setCenterY(value: typingsJapgolly.tabris.mod.Offset | auto | `true`): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: /* selector */ js.UndefOr[Selector[Tab, Tab]] => WidgetCollection[Tab]): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassList(value: js.Array[String]): Self = StObject.set(x, "classList", value.asInstanceOf[js.Any])
    
    inline def setClassListVarargs(value: String*): Self = StObject.set(x, "classList", js.Array(value*))
    
    inline def setConstructor(value: /* properties */ js.UndefOr[Properties[TabFolder[Tab], Omit[TabFolder[Tab], set]]] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDefineChangeEvent(value: Any): Self = StObject.set(x, "defineChangeEvent", value.asInstanceOf[js.Any])
    
    inline def setDefineChangeEventUndefined: Self = StObject.set(x, "defineChangeEvent", js.undefined)
    
    inline def setDefineEvent(value: Any): Self = StObject.set(x, "defineEvent", value.asInstanceOf[js.Any])
    
    inline def setDefineEventUndefined: Self = StObject.set(x, "defineEvent", js.undefined)
    
    inline def setDefineEvents(value: Any): Self = StObject.set(x, "defineEvents", value.asInstanceOf[js.Any])
    
    inline def setDefineEventsUndefined: Self = StObject.set(x, "defineEvents", js.undefined)
    
    inline def setDefineProperties(value: Any): Self = StObject.set(x, "defineProperties", value.asInstanceOf[js.Any])
    
    inline def setDefinePropertiesUndefined: Self = StObject.set(x, "defineProperties", js.undefined)
    
    inline def setDefineProperty(value: Any): Self = StObject.set(x, "defineProperty", value.asInstanceOf[js.Any])
    
    inline def setDefinePropertyUndefined: Self = StObject.set(x, "defineProperty", js.undefined)
    
    inline def setDetach(value: CallbackTo[TabFolder[TabType]]): Self = StObject.set(x, "detach", value.toJsFn)
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setExcludeFromLayout(value: Boolean): Self = StObject.set(x, "excludeFromLayout", value.asInstanceOf[js.Any])
    
    inline def setExtend(value: Any): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    inline def setFind(
      value: /* selector */ js.UndefOr[Selector[Widget[Any], Widget[Any]]] => WidgetCollection[Widget[Any]]
    ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
    
    inline def setHeight(value: Dimension | auto): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHighlightOnTouch(value: Boolean): Self = StObject.set(x, "highlightOnTouch", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInsertAfter(value: /* widget */ Widget[Any] => TabFolder[TabType]): Self = StObject.set(x, "insertAfter", js.Any.fromFunction1(value))
    
    inline def setInsertBefore(value: /* widget */ Widget[Any] => TabFolder[TabType]): Self = StObject.set(x, "insertBefore", js.Any.fromFunction1(value))
    
    inline def setIsDisposed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDisposed", value.toJsFn)
    
    inline def setJsxAttributes(value: JSXCompositeAttributes[TabFolder[TabType], Tab]): Self = StObject.set(x, "jsxAttributes", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: typingsJapgolly.tabris.mod.Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutData(value: LayoutDataValue): Self = StObject.set(x, "layoutData", value.asInstanceOf[js.Any])
    
    inline def setLayoutNull: Self = StObject.set(x, "layout", null)
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setLeft(value: ConstraintValue): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setOff(
      value: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Unit], /* context */ js.UndefOr[js.Object]) => TabFolder[TabType]
    ): Self = StObject.set(x, "off", js.Any.fromFunction3(value))
    
    inline def setOn(
      value: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], /* context */ js.UndefOr[js.Object]) => TabFolder[TabType]
    ): Self = StObject.set(x, "on", js.Any.fromFunction3(value))
    
    inline def setOnAddChild(value: Listeners[CompositeAddChildEvent[TabFolder[TabType]]]): Self = StObject.set(x, "onAddChild", value.asInstanceOf[js.Any])
    
    inline def setOnBackgroundChanged(value: ChangeListeners[TabFolder[TabType], background]): Self = StObject.set(x, "onBackgroundChanged", value.asInstanceOf[js.Any])
    
    inline def setOnBaselineChanged(value: ChangeListeners[TabFolder[TabType], baseline]): Self = StObject.set(x, "onBaselineChanged", value.asInstanceOf[js.Any])
    
    inline def setOnBottomChanged(value: ChangeListeners[TabFolder[TabType], bottom]): Self = StObject.set(x, "onBottomChanged", value.asInstanceOf[js.Any])
    
    inline def setOnBoundsChanged(value: ChangeListeners[TabFolder[TabType], bounds]): Self = StObject.set(x, "onBoundsChanged", value.asInstanceOf[js.Any])
    
    inline def setOnCenterXChanged(value: ChangeListeners[TabFolder[TabType], centerX]): Self = StObject.set(x, "onCenterXChanged", value.asInstanceOf[js.Any])
    
    inline def setOnCenterYChanged(value: ChangeListeners[TabFolder[TabType], centerY]): Self = StObject.set(x, "onCenterYChanged", value.asInstanceOf[js.Any])
    
    inline def setOnClassChanged(value: ChangeListeners[TabFolder[TabType], `class`]): Self = StObject.set(x, "onClassChanged", value.asInstanceOf[js.Any])
    
    inline def setOnClassListChanged(value: ChangeListeners[TabFolder[TabType], classList]): Self = StObject.set(x, "onClassListChanged", value.asInstanceOf[js.Any])
    
    inline def setOnCornerRadiusChanged(value: ChangeListeners[TabFolder[TabType], cornerRadius]): Self = StObject.set(x, "onCornerRadiusChanged", value.asInstanceOf[js.Any])
    
    inline def setOnDataChanged(value: ChangeListeners[TabFolder[TabType], data]): Self = StObject.set(x, "onDataChanged", value.asInstanceOf[js.Any])
    
    inline def setOnDispose(value: Listeners[EventObject[TabFolder[TabType]]]): Self = StObject.set(x, "onDispose", value.asInstanceOf[js.Any])
    
    inline def setOnElevationChanged(value: ChangeListeners[TabFolder[TabType], elevation]): Self = StObject.set(x, "onElevationChanged", value.asInstanceOf[js.Any])
    
    inline def setOnEnabledChanged(value: ChangeListeners[TabFolder[TabType], enabled]): Self = StObject.set(x, "onEnabledChanged", value.asInstanceOf[js.Any])
    
    inline def setOnExcludeFromLayoutChanged(value: ChangeListeners[TabFolder[TabType], excludeFromLayout]): Self = StObject.set(x, "onExcludeFromLayoutChanged", value.asInstanceOf[js.Any])
    
    inline def setOnHeightChanged(value: ChangeListeners[TabFolder[TabType], height]): Self = StObject.set(x, "onHeightChanged", value.asInstanceOf[js.Any])
    
    inline def setOnHighlightOnTouchChanged(value: ChangeListeners[TabFolder[TabType], highlightOnTouch]): Self = StObject.set(x, "onHighlightOnTouchChanged", value.asInstanceOf[js.Any])
    
    inline def setOnIdChanged(value: ChangeListeners[TabFolder[TabType], id]): Self = StObject.set(x, "onIdChanged", value.asInstanceOf[js.Any])
    
    inline def setOnLayoutDataChanged(value: ChangeListeners[TabFolder[TabType], layoutData]): Self = StObject.set(x, "onLayoutDataChanged", value.asInstanceOf[js.Any])
    
    inline def setOnLeftChanged(value: ChangeListeners[TabFolder[TabType], left]): Self = StObject.set(x, "onLeftChanged", value.asInstanceOf[js.Any])
    
    inline def setOnLongPress(value: Listeners[WidgetLongPressEvent[TabFolder[TabType]]]): Self = StObject.set(x, "onLongPress", value.asInstanceOf[js.Any])
    
    inline def setOnOpacityChanged(value: ChangeListeners[TabFolder[TabType], opacity]): Self = StObject.set(x, "onOpacityChanged", value.asInstanceOf[js.Any])
    
    inline def setOnPagingChanged(value: ChangeListeners[TabFolder[TabType], paging]): Self = StObject.set(x, "onPagingChanged", value.asInstanceOf[js.Any])
    
    inline def setOnPan(value: Listeners[WidgetPanEvent[TabFolder[TabType]]]): Self = StObject.set(x, "onPan", value.asInstanceOf[js.Any])
    
    inline def setOnPanDown(value: Listeners[WidgetPanEvent[TabFolder[TabType]]]): Self = StObject.set(x, "onPanDown", value.asInstanceOf[js.Any])
    
    inline def setOnPanHorizontal(value: Listeners[WidgetPanEvent[TabFolder[TabType]]]): Self = StObject.set(x, "onPanHorizontal", value.asInstanceOf[js.Any])
    
    inline def setOnPanLeft(value: Listeners[WidgetPanEvent[TabFolder[TabType]]]): Self = StObject.set(x, "onPanLeft", value.asInstanceOf[js.Any])
    
    inline def setOnPanRight(value: Listeners[WidgetPanEvent[TabFolder[TabType]]]): Self = StObject.set(x, "onPanRight", value.asInstanceOf[js.Any])
    
    inline def setOnPanUp(value: Listeners[WidgetPanEvent[TabFolder[TabType]]]): Self = StObject.set(x, "onPanUp", value.asInstanceOf[js.Any])
    
    inline def setOnPanVertical(value: Listeners[WidgetPanEvent[TabFolder[TabType]]]): Self = StObject.set(x, "onPanVertical", value.asInstanceOf[js.Any])
    
    inline def setOnRemoveChild(value: Listeners[CompositeRemoveChildEvent[TabFolder[TabType]]]): Self = StObject.set(x, "onRemoveChild", value.asInstanceOf[js.Any])
    
    inline def setOnResize(value: Listeners[WidgetResizeEvent[TabFolder[TabType]]]): Self = StObject.set(x, "onResize", value.asInstanceOf[js.Any])
    
    inline def setOnRightChanged(value: ChangeListeners[TabFolder[TabType], right]): Self = StObject.set(x, "onRightChanged", value.asInstanceOf[js.Any])
    
    inline def setOnScroll(value: Listeners[TabFolderScrollEvent[TabFolder[TabType]]]): Self = StObject.set(x, "onScroll", value.asInstanceOf[js.Any])
    
    inline def setOnSelect(value: Listeners[TabFolderSelectEvent[TabFolder[TabType]]]): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
    
    inline def setOnSelectedTabIndicatorTintColorChanged(value: ChangeListeners[TabFolder[TabType], selectedTabIndicatorTintColor]): Self = StObject.set(x, "onSelectedTabIndicatorTintColorChanged", value.asInstanceOf[js.Any])
    
    inline def setOnSelectedTabTintColorChanged(value: ChangeListeners[TabFolder[TabType], selectedTabTintColor]): Self = StObject.set(x, "onSelectedTabTintColorChanged", value.asInstanceOf[js.Any])
    
    inline def setOnSelectionChanged(value: ChangeListeners[TabFolder[TabType], selection]): Self = StObject.set(x, "onSelectionChanged", value.asInstanceOf[js.Any])
    
    inline def setOnSelectionIndexChanged(value: ChangeListeners[TabFolder[TabType], selectionIndex]): Self = StObject.set(x, "onSelectionIndexChanged", value.asInstanceOf[js.Any])
    
    inline def setOnSwipeDown(value: Listeners[WidgetSwipeEvent[TabFolder[TabType]]]): Self = StObject.set(x, "onSwipeDown", value.asInstanceOf[js.Any])
    
    inline def setOnSwipeLeft(value: Listeners[WidgetSwipeEvent[TabFolder[TabType]]]): Self = StObject.set(x, "onSwipeLeft", value.asInstanceOf[js.Any])
    
    inline def setOnSwipeRight(value: Listeners[WidgetSwipeEvent[TabFolder[TabType]]]): Self = StObject.set(x, "onSwipeRight", value.asInstanceOf[js.Any])
    
    inline def setOnSwipeUp(value: Listeners[WidgetSwipeEvent[TabFolder[TabType]]]): Self = StObject.set(x, "onSwipeUp", value.asInstanceOf[js.Any])
    
    inline def setOnTabBarBackgroundChanged(value: ChangeListeners[TabFolder[TabType], tabBarBackground]): Self = StObject.set(x, "onTabBarBackgroundChanged", value.asInstanceOf[js.Any])
    
    inline def setOnTabBarElevationChanged(value: ChangeListeners[TabFolder[TabType], tabBarElevation]): Self = StObject.set(x, "onTabBarElevationChanged", value.asInstanceOf[js.Any])
    
    inline def setOnTabTintColorChanged(value: ChangeListeners[TabFolder[TabType], tabTintColor]): Self = StObject.set(x, "onTabTintColorChanged", value.asInstanceOf[js.Any])
    
    inline def setOnTap(value: Listeners[WidgetTapEvent[TabFolder[TabType]]]): Self = StObject.set(x, "onTap", value.asInstanceOf[js.Any])
    
    inline def setOnTopChanged(value: ChangeListeners[TabFolder[TabType], top]): Self = StObject.set(x, "onTopChanged", value.asInstanceOf[js.Any])
    
    inline def setOnTouchCancel(value: Listeners[WidgetTouchEvent[TabFolder[TabType]]]): Self = StObject.set(x, "onTouchCancel", value.asInstanceOf[js.Any])
    
    inline def setOnTouchEnd(value: Listeners[WidgetTouchEvent[TabFolder[TabType]]]): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
    
    inline def setOnTouchMove(value: Listeners[WidgetTouchEvent[TabFolder[TabType]]]): Self = StObject.set(x, "onTouchMove", value.asInstanceOf[js.Any])
    
    inline def setOnTouchStart(value: Listeners[WidgetTouchEvent[TabFolder[TabType]]]): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
    
    inline def setOnTransformChanged(value: ChangeListeners[TabFolder[TabType], transform]): Self = StObject.set(x, "onTransformChanged", value.asInstanceOf[js.Any])
    
    inline def setOnVisibleChanged(value: ChangeListeners[TabFolder[TabType], visible]): Self = StObject.set(x, "onVisibleChanged", value.asInstanceOf[js.Any])
    
    inline def setOnWidthChanged(value: ChangeListeners[TabFolder[TabType], width]): Self = StObject.set(x, "onWidthChanged", value.asInstanceOf[js.Any])
    
    inline def setOnce(
      value: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], /* context */ js.UndefOr[js.Object]) => TabFolder[TabType]
    ): Self = StObject.set(x, "once", js.Any.fromFunction3(value))
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: BoxDimensions): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingNull: Self = StObject.set(x, "padding", null)
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaging(value: Boolean): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
    
    inline def setParent(value: CallbackTo[Composite[Widget[Any]]]): Self = StObject.set(x, "parent", value.toJsFn)
    
    inline def setRight(value: ConstraintValue): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setSelectedTabIndicatorTintColor(value: ColorValue): Self = StObject.set(x, "selectedTabIndicatorTintColor", value.asInstanceOf[js.Any])
    
    inline def setSelectedTabIndicatorTintColorNull: Self = StObject.set(x, "selectedTabIndicatorTintColor", null)
    
    inline def setSelectedTabTintColor(value: ColorValue): Self = StObject.set(x, "selectedTabTintColor", value.asInstanceOf[js.Any])
    
    inline def setSelectedTabTintColorNull: Self = StObject.set(x, "selectedTabTintColor", null)
    
    inline def setSelection(value: Tab): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionIndex(value: Double): Self = StObject.set(x, "selectionIndex", value.asInstanceOf[js.Any])
    
    inline def setSiblings(
      value: /* selector */ js.UndefOr[Selector[Widget[Any], Widget[Any]]] => WidgetCollection[Widget[Any]]
    ): Self = StObject.set(x, "siblings", js.Any.fromFunction1(value))
    
    inline def setTabBarBackground(value: ColorValue): Self = StObject.set(x, "tabBarBackground", value.asInstanceOf[js.Any])
    
    inline def setTabBarBackgroundNull: Self = StObject.set(x, "tabBarBackground", null)
    
    inline def setTabBarElevation(value: Double): Self = StObject.set(x, "tabBarElevation", value.asInstanceOf[js.Any])
    
    inline def setTabBarLocation(value: auto | bottom | hidden | top): Self = StObject.set(x, "tabBarLocation", value.asInstanceOf[js.Any])
    
    inline def setTabMode(value: fixed | scrollable): Self = StObject.set(x, "tabMode", value.asInstanceOf[js.Any])
    
    inline def setTabTintColor(value: ColorValue): Self = StObject.set(x, "tabTintColor", value.asInstanceOf[js.Any])
    
    inline def setTabTintColorNull: Self = StObject.set(x, "tabTintColor", null)
    
    inline def setTop(value: ConstraintValue): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: Transformation): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTrigger(value: /* type */ String => TabFolder[TabType]): Self = StObject.set(x, "trigger", js.Any.fromFunction1(value))
    
    inline def setTriggerAsync(value: /* type */ String => js.Promise[TabFolder[TabType]]): Self = StObject.set(x, "triggerAsync", js.Any.fromFunction1(value))
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Dimension | auto): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def set_acceptChild(value: /* child */ Widget[Any] => Boolean): Self = StObject.set(x, "_acceptChild", js.Any.fromFunction1(value))
    
    inline def set_addChild(value: (/* child */ Widget[Any], /* index */ js.UndefOr[Double]) => Callback): Self = StObject.set(x, "_addChild", js.Any.fromFunction2((t0: /* child */ Widget[Any], t1: /* index */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
    
    inline def set_apply(
      value: (/* options */ `18`[TabFolder[TabType]], /* rules */ RuleSet[TabFolder[TabType]]) => TabFolder[TabType]
    ): Self = StObject.set(x, "_apply", js.Any.fromFunction2(value))
    
    inline def set_checkDisposed(value: Callback): Self = StObject.set(x, "_checkDisposed", value.toJsFn)
    
    inline def set_checkLayout(value: /* value */ typingsJapgolly.tabris.mod.Layout => Callback): Self = StObject.set(x, "_checkLayout", js.Any.fromFunction1((t0: /* value */ typingsJapgolly.tabris.mod.Layout) => value(t0).runNow()))
    
    inline def set_children(value: /* selector */ js.UndefOr[Selector[Tab, Tab]] => WidgetCollection[Tab]): Self = StObject.set(x, "_children", js.Any.fromFunction1(value))
    
    inline def set_decodeProperty(value: (/* propertyName */ String, /* value */ Any) => Any): Self = StObject.set(x, "_decodeProperty", js.Any.fromFunction2(value))
    
    inline def set_dispose(value: /* skipNative */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "_dispose", js.Any.fromFunction1((t0: /* skipNative */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def set_encodeProperty(value: (/* propertyName */ String, /* value */ Any) => Any): Self = StObject.set(x, "_encodeProperty", js.Any.fromFunction2(value))
    
    inline def set_find(
      value: /* selector */ js.UndefOr[Selector[Widget[Any], Widget[Any]]] => WidgetCollection[Widget[Any]]
    ): Self = StObject.set(x, "_find", js.Any.fromFunction1(value))
    
    inline def set_getDefaultPropertyValue(value: /* propertyName */ String => Callback): Self = StObject.set(x, "_getDefaultPropertyValue", js.Any.fromFunction1((t0: /* propertyName */ String) => value(t0).runNow()))
    
    inline def set_getStoredProperty(value: /* propertyName */ String => Any): Self = StObject.set(x, "_getStoredProperty", js.Any.fromFunction1(value))
    
    inline def set_getTypeDef(value: /* propertyName */ String => Any): Self = StObject.set(x, "_getTypeDef", js.Any.fromFunction1(value))
    
    inline def set_getXMLAttributes(value: CallbackTo[js.Array[js.Tuple2[String, Any]]]): Self = StObject.set(x, "_getXMLAttributes", value.toJsFn)
    
    inline def set_getXMLContent(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "_getXMLContent", value.toJsFn)
    
    inline def set_getXMLElementName(value: CallbackTo[String]): Self = StObject.set(x, "_getXMLElementName", value.toJsFn)
    
    inline def set_getXMLFooter(value: /* hasChild */ Boolean => String): Self = StObject.set(x, "_getXMLFooter", js.Any.fromFunction1(value))
    
    inline def set_getXMLHeader(value: /* hasChild */ Boolean => String): Self = StObject.set(x, "_getXMLHeader", js.Any.fromFunction1(value))
    
    inline def set_initLayout(value: /* props */ js.UndefOr[Layout] => Callback): Self = StObject.set(x, "_initLayout", js.Any.fromFunction1((t0: /* props */ js.UndefOr[Layout]) => value(t0).runNow()))
    
    inline def set_isDisposed(value: `true`): Self = StObject.set(x, "_isDisposed", value.asInstanceOf[js.Any])
    
    inline def set_isDisposedUndefined: Self = StObject.set(x, "_isDisposed", js.undefined)
    
    inline def set_isListening(value: /* eventType */ String => Boolean): Self = StObject.set(x, "_isListening", js.Any.fromFunction1(value))
    
    inline def set_layout(value: typingsJapgolly.tabris.mod.Layout): Self = StObject.set(x, "_layout", value.asInstanceOf[js.Any])
    
    inline def set_listen(value: (/* eventName */ String, /* listening */ Boolean) => Callback): Self = StObject.set(x, "_listen", js.Any.fromFunction2((t0: /* eventName */ String, t1: /* listening */ Boolean) => (value(t0, t1)).runNow()))
    
    inline def set_nativeCall(value: (/* methodName */ String, /* parameters */ js.Object) => Any): Self = StObject.set(x, "_nativeCall", js.Any.fromFunction2(value))
    
    inline def set_nativeCreate(value: /* param */ js.UndefOr[StringDictionary[Any]] => Callback): Self = StObject.set(x, "_nativeCreate", js.Any.fromFunction1((t0: /* param */ js.UndefOr[StringDictionary[Any]]) => value(t0).runNow()))
    
    inline def set_nativeGet(value: /* propertyName */ String => Any): Self = StObject.set(x, "_nativeGet", js.Any.fromFunction1(value))
    
    inline def set_nativeListen(value: (/* eventType */ String, /* listen */ Boolean) => Callback): Self = StObject.set(x, "_nativeListen", js.Any.fromFunction2((t0: /* eventType */ String, t1: /* listen */ Boolean) => (value(t0, t1)).runNow()))
    
    inline def set_nativeSet(value: (/* propertyName */ String, /* value */ Any) => Callback): Self = StObject.set(x, "_nativeSet", js.Any.fromFunction2((t0: /* propertyName */ String, t1: /* value */ Any) => (value(t0, t1)).runNow()))
    
    inline def set_nativeType(value: CallbackTo[String]): Self = StObject.set(x, "_nativeType", value.toJsFn)
    
    inline def set_onoff(value: (/* eventType */ String, /* listening */ Boolean, /* listener */ js.Function) => Callback): Self = StObject.set(x, "_onoff", js.Any.fromFunction3((t0: /* eventType */ String, t1: /* listening */ Boolean, t2: /* listener */ js.Function) => (value(t0, t1, t2)).runNow()))
    
    inline def set_register(value: Callback): Self = StObject.set(x, "_register", value.toJsFn)
    
    inline def set_release(value: Callback): Self = StObject.set(x, "_release", value.toJsFn)
    
    inline def set_removeChild(value: /* child */ Widget[Any] => Callback): Self = StObject.set(x, "_removeChild", js.Any.fromFunction1((t0: /* child */ Widget[Any]) => value(t0).runNow()))
    
    inline def set_reorderProperties(value: /* propertyNames */ js.Array[String] => js.Array[String]): Self = StObject.set(x, "_reorderProperties", js.Any.fromFunction1(value))
    
    inline def set_scheduleRenderChildren(value: Callback): Self = StObject.set(x, "_scheduleRenderChildren", value.toJsFn)
    
    inline def set_setParent(value: (/* parent */ Composite[Widget[Any]], /* index */ js.UndefOr[Double]) => Callback): Self = StObject.set(x, "_setParent", js.Any.fromFunction2((t0: /* parent */ Composite[Widget[Any]], t1: /* index */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
    
    inline def set_storeProperty(value: (/* propertyName */ String, /* encodedValue */ Any) => Callback): Self = StObject.set(x, "_storeProperty", js.Any.fromFunction2((t0: /* propertyName */ String, t1: /* encodedValue */ Any) => (value(t0, t1)).runNow()))
    
    inline def set_trigger(value: (/* eventType */ String, /* eventData */ js.UndefOr[js.Object]) => Boolean): Self = StObject.set(x, "_trigger", js.Any.fromFunction2(value))
    
    inline def set_triggerChangeEvent(value: (/* propertyName */ String, /* newEncodedValue */ Any) => Callback): Self = StObject.set(x, "_triggerChangeEvent", js.Any.fromFunction2((t0: /* propertyName */ String, t1: /* newEncodedValue */ Any) => (value(t0, t1)).runNow()))
    
    inline def set_wasSet(value: /* propertyName */ String => Boolean): Self = StObject.set(x, "_wasSet", js.Any.fromFunction1(value))
  }
}
