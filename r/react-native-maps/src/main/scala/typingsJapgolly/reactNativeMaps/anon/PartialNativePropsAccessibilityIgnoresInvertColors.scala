package typingsJapgolly.reactNativeMaps.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNative.mod.AccessibilityActionEvent
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityValue
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.NativeSyntheticEvent
import typingsJapgolly.reactNative.mod.PointerEvent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TVParallaxProperties
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeMaps.libMapViewDottypesMod.Camera
import typingsJapgolly.reactNativeMaps.libMapViewDottypesMod.ChangeEvent
import typingsJapgolly.reactNativeMaps.libMapViewDottypesMod.EdgePadding
import typingsJapgolly.reactNativeMaps.libMapViewDottypesMod.IndoorBuildingEvent
import typingsJapgolly.reactNativeMaps.libMapViewDottypesMod.IndoorLevelActivatedEvent
import typingsJapgolly.reactNativeMaps.libMapViewDottypesMod.KmlMapEvent
import typingsJapgolly.reactNativeMaps.libMapViewDottypesMod.LongPressEvent
import typingsJapgolly.reactNativeMaps.libMapViewDottypesMod.MapPressEvent
import typingsJapgolly.reactNativeMaps.libMapViewDottypesMod.MapType
import typingsJapgolly.reactNativeMaps.libMapViewDottypesMod.PanDragEvent
import typingsJapgolly.reactNativeMaps.libMapViewDottypesMod.PoiClickEvent
import typingsJapgolly.reactNativeMaps.libMapViewDottypesMod.UserLocationChangeEvent
import typingsJapgolly.reactNativeMaps.libMapViewNativeComponentMod.MapViewNativeComponentType
import typingsJapgolly.reactNativeMaps.libSharedTypesMod.CalloutPressEvent
import typingsJapgolly.reactNativeMaps.libSharedTypesMod.ClickEvent
import typingsJapgolly.reactNativeMaps.libSharedTypesMod.MarkerDeselectEvent
import typingsJapgolly.reactNativeMaps.libSharedTypesMod.MarkerDragEvent
import typingsJapgolly.reactNativeMaps.libSharedTypesMod.MarkerDragStartEndEvent
import typingsJapgolly.reactNativeMaps.libSharedTypesMod.MarkerPressEvent
import typingsJapgolly.reactNativeMaps.libSharedTypesMod.MarkerSelectEvent
import typingsJapgolly.reactNativeMaps.libSharedTypesMod.Provider
import typingsJapgolly.reactNativeMaps.libSharedTypesMod.Region
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.`box-none`
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.`box-only`
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.`no-hide-descendants`
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.always
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.assertive
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.auto
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.automatic
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.balanced
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.dark
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.high
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.light
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.low
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.never
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.no
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.none
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.passive
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.polite
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-maps.react-native-maps/lib/MapView.NativeProps> */
trait PartialNativePropsAccessibilityIgnoresInvertColors extends StObject {
  
  var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.undefined
  
  var accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityHint: js.UndefOr[String] = js.undefined
  
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  var accessibilityLabelledBy: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var accessibilityLanguage: js.UndefOr[String] = js.undefined
  
  var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.undefined
  
  var accessibilityRole: js.UndefOr[AccessibilityRole] = js.undefined
  
  var accessibilityState: js.UndefOr[AccessibilityState] = js.undefined
  
  var accessibilityValue: js.UndefOr[AccessibilityValue] = js.undefined
  
  var accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
  
  var accessible: js.UndefOr[Boolean] = js.undefined
  
  var cacheEnabled: js.UndefOr[Boolean] = js.undefined
  
  var camera: js.UndefOr[Camera] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var collapsable: js.UndefOr[Boolean] = js.undefined
  
  var compassOffset: js.UndefOr[typingsJapgolly.reactNativeMaps.libSharedTypesMod.Point] = js.undefined
  
  var customMapStyleString: js.UndefOr[String] = js.undefined
  
  var focusable: js.UndefOr[Boolean] = js.undefined
  
  var followsUserLocation: js.UndefOr[Boolean] = js.undefined
  
  var handlePanDrag: js.UndefOr[Boolean] = js.undefined
  
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
  
  var hitSlop: js.UndefOr[Insets] = js.undefined
  
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
  
  var initialCamera: js.UndefOr[Camera] = js.undefined
  
  var initialRegion: js.UndefOr[Region | Null] = js.undefined
  
  var isTVSelectable: js.UndefOr[Boolean] = js.undefined
  
  var kmlSrc: js.UndefOr[String] = js.undefined
  
  var legalLabelInsets: js.UndefOr[EdgePadding] = js.undefined
  
  var liteMode: js.UndefOr[Boolean] = js.undefined
  
  var loadingBackgroundColor: js.UndefOr[String] = js.undefined
  
  var loadingEnabled: js.UndefOr[Boolean] = js.undefined
  
  var loadingIndicatorColor: js.UndefOr[String] = js.undefined
  
  var mapPadding: js.UndefOr[EdgePadding] = js.undefined
  
  var mapType: js.UndefOr[MapType] = js.undefined
  
  var maxDelta: js.UndefOr[Double] = js.undefined
  
  var maxZoomLevel: js.UndefOr[Double] = js.undefined
  
  var minDelta: js.UndefOr[Double] = js.undefined
  
  var minZoomLevel: js.UndefOr[Double] = js.undefined
  
  var moveOnMarkerPress: js.UndefOr[Boolean] = js.undefined
  
  var nativeID: js.UndefOr[String] = js.undefined
  
  var needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined
  
  var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.undefined
  
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onCalloutPress: js.UndefOr[js.Function1[/* event */ CalloutPressEvent, Unit]] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent, Unit]] = js.undefined
  
  var onDoublePress: js.UndefOr[js.Function1[/* event */ ClickEvent[js.Object], Unit]] = js.undefined
  
  var onIndoorBuildingFocused: js.UndefOr[js.Function1[/* event */ IndoorBuildingEvent, Unit]] = js.undefined
  
  var onIndoorLevelActivated: js.UndefOr[js.Function1[/* event */ IndoorLevelActivatedEvent, Unit]] = js.undefined
  
  var onKmlReady: js.UndefOr[js.Function1[/* event */ KmlMapEvent, Unit]] = js.undefined
  
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
  
  var onLongPress: js.UndefOr[js.Function1[/* event */ LongPressEvent, Unit]] = js.undefined
  
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onMapLoaded: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[js.Object], Unit]] = js.undefined
  
  var onMapReady: js.UndefOr[js.Function1[/* event */ js.UndefOr[NativeSyntheticEvent[js.Object]], Unit]] = js.undefined
  
  var onMarkerDeselect: js.UndefOr[js.Function1[/* event */ MarkerDeselectEvent, Unit]] = js.undefined
  
  var onMarkerDrag: js.UndefOr[js.Function1[/* event */ MarkerDragEvent, Unit]] = js.undefined
  
  var onMarkerDragEnd: js.UndefOr[js.Function1[/* event */ MarkerDragStartEndEvent, Unit]] = js.undefined
  
  var onMarkerDragStart: js.UndefOr[js.Function1[/* event */ MarkerDragStartEndEvent, Unit]] = js.undefined
  
  var onMarkerPress: js.UndefOr[js.Function1[/* event */ MarkerPressEvent, Unit]] = js.undefined
  
  var onMarkerSelect: js.UndefOr[js.Function1[/* event */ MarkerSelectEvent, Unit]] = js.undefined
  
  var onMoveShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  var onPanDrag: js.UndefOr[js.Function1[/* event */ PanDragEvent, Unit]] = js.undefined
  
  var onPoiClick: js.UndefOr[js.Function1[/* event */ PoiClickEvent, Unit]] = js.undefined
  
  var onPointerCancel: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerCancelCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerDown: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerDownCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerEnter: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerEnterCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerLeave: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerLeaveCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerMove: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerMoveCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerUp: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerUpCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPress: js.UndefOr[js.Function1[/* event */ MapPressEvent, Unit]] = js.undefined
  
  var onResponderEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderGrant: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderReject: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderRelease: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderTerminate: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderTerminationRequest: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  var onStartShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  var onStartShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  var onTouchCancel: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onTouchEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onTouchEndCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onTouchMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onTouchStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onUserLocationChange: js.UndefOr[js.Function1[/* event */ UserLocationChangeEvent, Unit]] = js.undefined
  
  var paddingAdjustmentBehavior: js.UndefOr[always | automatic | never] = js.undefined
  
  var pitchEnabled: js.UndefOr[Boolean] = js.undefined
  
  var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.undefined
  
  var provider: js.UndefOr[Provider] = js.undefined
  
  var ref: js.UndefOr[RefHandle[MapViewNativeComponentType]] = js.undefined
  
  var region: js.UndefOr[Region | Null] = js.undefined
  
  var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
  
  var renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined
  
  var rotateEnabled: js.UndefOr[Boolean] = js.undefined
  
  var scrollDuringRotateOrZoomEnabled: js.UndefOr[Boolean] = js.undefined
  
  var scrollEnabled: js.UndefOr[Boolean] = js.undefined
  
  var shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined
  
  var showsBuildings: js.UndefOr[Boolean] = js.undefined
  
  var showsCompass: js.UndefOr[Boolean] = js.undefined
  
  var showsIndoorLevelPicker: js.UndefOr[Boolean] = js.undefined
  
  var showsIndoors: js.UndefOr[Boolean] = js.undefined
  
  var showsMyLocationButton: js.UndefOr[Boolean] = js.undefined
  
  var showsPointsOfInterest: js.UndefOr[Boolean] = js.undefined
  
  var showsScale: js.UndefOr[Boolean] = js.undefined
  
  var showsTraffic: js.UndefOr[Boolean] = js.undefined
  
  var showsUserLocation: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var testID: js.UndefOr[String] = js.undefined
  
  var tintColor: js.UndefOr[String] = js.undefined
  
  var toolbarEnabled: js.UndefOr[Boolean] = js.undefined
  
  var tvParallaxMagnification: js.UndefOr[Double] = js.undefined
  
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
  
  var tvParallaxShiftDistanceX: js.UndefOr[Double] = js.undefined
  
  var tvParallaxShiftDistanceY: js.UndefOr[Double] = js.undefined
  
  var tvParallaxTiltAngle: js.UndefOr[Double] = js.undefined
  
  var userInterfaceStyle: js.UndefOr[light | dark] = js.undefined
  
  var userLocationAnnotationTitle: js.UndefOr[String] = js.undefined
  
  var userLocationCalloutEnabled: js.UndefOr[Boolean] = js.undefined
  
  var userLocationFastestInterval: js.UndefOr[Double] = js.undefined
  
  var userLocationPriority: js.UndefOr[balanced | high | low | passive] = js.undefined
  
  var userLocationUpdateInterval: js.UndefOr[Double] = js.undefined
  
  var zoomControlEnabled: js.UndefOr[Boolean] = js.undefined
  
  var zoomEnabled: js.UndefOr[Boolean] = js.undefined
  
  var zoomTapEnabled: js.UndefOr[Boolean] = js.undefined
}
object PartialNativePropsAccessibilityIgnoresInvertColors {
  
  inline def apply(): PartialNativePropsAccessibilityIgnoresInvertColors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialNativePropsAccessibilityIgnoresInvertColors]
  }
  
  extension [Self <: PartialNativePropsAccessibilityIgnoresInvertColors](x: Self) {
    
    inline def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
    
    inline def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value*))
    
    inline def setAccessibilityElementsHidden(value: Boolean): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
    
    inline def setAccessibilityHint(value: String): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
    
    inline def setAccessibilityIgnoresInvertColors(value: Boolean): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setAccessibilityLabelledBy(value: String | js.Array[String]): Self = StObject.set(x, "accessibilityLabelledBy", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelledByUndefined: Self = StObject.set(x, "accessibilityLabelledBy", js.undefined)
    
    inline def setAccessibilityLabelledByVarargs(value: String*): Self = StObject.set(x, "accessibilityLabelledBy", js.Array(value*))
    
    inline def setAccessibilityLanguage(value: String): Self = StObject.set(x, "accessibilityLanguage", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLanguageUndefined: Self = StObject.set(x, "accessibilityLanguage", js.undefined)
    
    inline def setAccessibilityLiveRegion(value: none | polite | assertive): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
    
    inline def setAccessibilityRole(value: AccessibilityRole): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
    
    inline def setAccessibilityState(value: AccessibilityState): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
    
    inline def setAccessibilityValue(value: AccessibilityValue): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
    
    inline def setAccessibilityViewIsModal(value: Boolean): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
    
    inline def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
    
    inline def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
    
    inline def setCacheEnabled(value: Boolean): Self = StObject.set(x, "cacheEnabled", value.asInstanceOf[js.Any])
    
    inline def setCacheEnabledUndefined: Self = StObject.set(x, "cacheEnabled", js.undefined)
    
    inline def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setCollapsable(value: Boolean): Self = StObject.set(x, "collapsable", value.asInstanceOf[js.Any])
    
    inline def setCollapsableUndefined: Self = StObject.set(x, "collapsable", js.undefined)
    
    inline def setCompassOffset(value: typingsJapgolly.reactNativeMaps.libSharedTypesMod.Point): Self = StObject.set(x, "compassOffset", value.asInstanceOf[js.Any])
    
    inline def setCompassOffsetUndefined: Self = StObject.set(x, "compassOffset", js.undefined)
    
    inline def setCustomMapStyleString(value: String): Self = StObject.set(x, "customMapStyleString", value.asInstanceOf[js.Any])
    
    inline def setCustomMapStyleStringUndefined: Self = StObject.set(x, "customMapStyleString", js.undefined)
    
    inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    inline def setFollowsUserLocation(value: Boolean): Self = StObject.set(x, "followsUserLocation", value.asInstanceOf[js.Any])
    
    inline def setFollowsUserLocationUndefined: Self = StObject.set(x, "followsUserLocation", js.undefined)
    
    inline def setHandlePanDrag(value: Boolean): Self = StObject.set(x, "handlePanDrag", value.asInstanceOf[js.Any])
    
    inline def setHandlePanDragUndefined: Self = StObject.set(x, "handlePanDrag", js.undefined)
    
    inline def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    inline def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
    
    inline def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
    
    inline def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
    
    inline def setInitialCamera(value: Camera): Self = StObject.set(x, "initialCamera", value.asInstanceOf[js.Any])
    
    inline def setInitialCameraUndefined: Self = StObject.set(x, "initialCamera", js.undefined)
    
    inline def setInitialRegion(value: Region): Self = StObject.set(x, "initialRegion", value.asInstanceOf[js.Any])
    
    inline def setInitialRegionNull: Self = StObject.set(x, "initialRegion", null)
    
    inline def setInitialRegionUndefined: Self = StObject.set(x, "initialRegion", js.undefined)
    
    inline def setIsTVSelectable(value: Boolean): Self = StObject.set(x, "isTVSelectable", value.asInstanceOf[js.Any])
    
    inline def setIsTVSelectableUndefined: Self = StObject.set(x, "isTVSelectable", js.undefined)
    
    inline def setKmlSrc(value: String): Self = StObject.set(x, "kmlSrc", value.asInstanceOf[js.Any])
    
    inline def setKmlSrcUndefined: Self = StObject.set(x, "kmlSrc", js.undefined)
    
    inline def setLegalLabelInsets(value: EdgePadding): Self = StObject.set(x, "legalLabelInsets", value.asInstanceOf[js.Any])
    
    inline def setLegalLabelInsetsUndefined: Self = StObject.set(x, "legalLabelInsets", js.undefined)
    
    inline def setLiteMode(value: Boolean): Self = StObject.set(x, "liteMode", value.asInstanceOf[js.Any])
    
    inline def setLiteModeUndefined: Self = StObject.set(x, "liteMode", js.undefined)
    
    inline def setLoadingBackgroundColor(value: String): Self = StObject.set(x, "loadingBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setLoadingBackgroundColorUndefined: Self = StObject.set(x, "loadingBackgroundColor", js.undefined)
    
    inline def setLoadingEnabled(value: Boolean): Self = StObject.set(x, "loadingEnabled", value.asInstanceOf[js.Any])
    
    inline def setLoadingEnabledUndefined: Self = StObject.set(x, "loadingEnabled", js.undefined)
    
    inline def setLoadingIndicatorColor(value: String): Self = StObject.set(x, "loadingIndicatorColor", value.asInstanceOf[js.Any])
    
    inline def setLoadingIndicatorColorUndefined: Self = StObject.set(x, "loadingIndicatorColor", js.undefined)
    
    inline def setMapPadding(value: EdgePadding): Self = StObject.set(x, "mapPadding", value.asInstanceOf[js.Any])
    
    inline def setMapPaddingUndefined: Self = StObject.set(x, "mapPadding", js.undefined)
    
    inline def setMapType(value: MapType): Self = StObject.set(x, "mapType", value.asInstanceOf[js.Any])
    
    inline def setMapTypeUndefined: Self = StObject.set(x, "mapType", js.undefined)
    
    inline def setMaxDelta(value: Double): Self = StObject.set(x, "maxDelta", value.asInstanceOf[js.Any])
    
    inline def setMaxDeltaUndefined: Self = StObject.set(x, "maxDelta", js.undefined)
    
    inline def setMaxZoomLevel(value: Double): Self = StObject.set(x, "maxZoomLevel", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomLevelUndefined: Self = StObject.set(x, "maxZoomLevel", js.undefined)
    
    inline def setMinDelta(value: Double): Self = StObject.set(x, "minDelta", value.asInstanceOf[js.Any])
    
    inline def setMinDeltaUndefined: Self = StObject.set(x, "minDelta", js.undefined)
    
    inline def setMinZoomLevel(value: Double): Self = StObject.set(x, "minZoomLevel", value.asInstanceOf[js.Any])
    
    inline def setMinZoomLevelUndefined: Self = StObject.set(x, "minZoomLevel", js.undefined)
    
    inline def setMoveOnMarkerPress(value: Boolean): Self = StObject.set(x, "moveOnMarkerPress", value.asInstanceOf[js.Any])
    
    inline def setMoveOnMarkerPressUndefined: Self = StObject.set(x, "moveOnMarkerPress", js.undefined)
    
    inline def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
    
    inline def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
    
    inline def setNeedsOffscreenAlphaCompositing(value: Boolean): Self = StObject.set(x, "needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    inline def setNeedsOffscreenAlphaCompositingUndefined: Self = StObject.set(x, "needsOffscreenAlphaCompositing", js.undefined)
    
    inline def setOnAccessibilityAction(value: /* event */ AccessibilityActionEvent => Callback): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1((t0: /* event */ AccessibilityActionEvent) => value(t0).runNow()))
    
    inline def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
    
    inline def setOnAccessibilityEscape(value: Callback): Self = StObject.set(x, "onAccessibilityEscape", value.toJsFn)
    
    inline def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
    
    inline def setOnAccessibilityTap(value: Callback): Self = StObject.set(x, "onAccessibilityTap", value.toJsFn)
    
    inline def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
    
    inline def setOnCalloutPress(value: /* event */ CalloutPressEvent => Callback): Self = StObject.set(x, "onCalloutPress", js.Any.fromFunction1((t0: /* event */ CalloutPressEvent) => value(t0).runNow()))
    
    inline def setOnCalloutPressUndefined: Self = StObject.set(x, "onCalloutPress", js.undefined)
    
    inline def setOnChange(value: /* e */ ChangeEvent => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* e */ ChangeEvent) => value(t0).runNow()))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnDoublePress(value: /* event */ ClickEvent[js.Object] => Callback): Self = StObject.set(x, "onDoublePress", js.Any.fromFunction1((t0: /* event */ ClickEvent[js.Object]) => value(t0).runNow()))
    
    inline def setOnDoublePressUndefined: Self = StObject.set(x, "onDoublePress", js.undefined)
    
    inline def setOnIndoorBuildingFocused(value: /* event */ IndoorBuildingEvent => Callback): Self = StObject.set(x, "onIndoorBuildingFocused", js.Any.fromFunction1((t0: /* event */ IndoorBuildingEvent) => value(t0).runNow()))
    
    inline def setOnIndoorBuildingFocusedUndefined: Self = StObject.set(x, "onIndoorBuildingFocused", js.undefined)
    
    inline def setOnIndoorLevelActivated(value: /* event */ IndoorLevelActivatedEvent => Callback): Self = StObject.set(x, "onIndoorLevelActivated", js.Any.fromFunction1((t0: /* event */ IndoorLevelActivatedEvent) => value(t0).runNow()))
    
    inline def setOnIndoorLevelActivatedUndefined: Self = StObject.set(x, "onIndoorLevelActivated", js.undefined)
    
    inline def setOnKmlReady(value: /* event */ KmlMapEvent => Callback): Self = StObject.set(x, "onKmlReady", js.Any.fromFunction1((t0: /* event */ KmlMapEvent) => value(t0).runNow()))
    
    inline def setOnKmlReadyUndefined: Self = StObject.set(x, "onKmlReady", js.undefined)
    
    inline def setOnLayout(value: /* event */ LayoutChangeEvent => Callback): Self = StObject.set(x, "onLayout", js.Any.fromFunction1((t0: /* event */ LayoutChangeEvent) => value(t0).runNow()))
    
    inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    inline def setOnLongPress(value: /* event */ LongPressEvent => Callback): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1((t0: /* event */ LongPressEvent) => value(t0).runNow()))
    
    inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    inline def setOnMagicTap(value: Callback): Self = StObject.set(x, "onMagicTap", value.toJsFn)
    
    inline def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
    
    inline def setOnMapLoaded(value: /* event */ NativeSyntheticEvent[js.Object] => Callback): Self = StObject.set(x, "onMapLoaded", js.Any.fromFunction1((t0: /* event */ NativeSyntheticEvent[js.Object]) => value(t0).runNow()))
    
    inline def setOnMapLoadedUndefined: Self = StObject.set(x, "onMapLoaded", js.undefined)
    
    inline def setOnMapReady(value: /* event */ js.UndefOr[NativeSyntheticEvent[js.Object]] => Callback): Self = StObject.set(x, "onMapReady", js.Any.fromFunction1((t0: /* event */ js.UndefOr[NativeSyntheticEvent[js.Object]]) => value(t0).runNow()))
    
    inline def setOnMapReadyUndefined: Self = StObject.set(x, "onMapReady", js.undefined)
    
    inline def setOnMarkerDeselect(value: /* event */ MarkerDeselectEvent => Callback): Self = StObject.set(x, "onMarkerDeselect", js.Any.fromFunction1((t0: /* event */ MarkerDeselectEvent) => value(t0).runNow()))
    
    inline def setOnMarkerDeselectUndefined: Self = StObject.set(x, "onMarkerDeselect", js.undefined)
    
    inline def setOnMarkerDrag(value: /* event */ MarkerDragEvent => Callback): Self = StObject.set(x, "onMarkerDrag", js.Any.fromFunction1((t0: /* event */ MarkerDragEvent) => value(t0).runNow()))
    
    inline def setOnMarkerDragEnd(value: /* event */ MarkerDragStartEndEvent => Callback): Self = StObject.set(x, "onMarkerDragEnd", js.Any.fromFunction1((t0: /* event */ MarkerDragStartEndEvent) => value(t0).runNow()))
    
    inline def setOnMarkerDragEndUndefined: Self = StObject.set(x, "onMarkerDragEnd", js.undefined)
    
    inline def setOnMarkerDragStart(value: /* event */ MarkerDragStartEndEvent => Callback): Self = StObject.set(x, "onMarkerDragStart", js.Any.fromFunction1((t0: /* event */ MarkerDragStartEndEvent) => value(t0).runNow()))
    
    inline def setOnMarkerDragStartUndefined: Self = StObject.set(x, "onMarkerDragStart", js.undefined)
    
    inline def setOnMarkerDragUndefined: Self = StObject.set(x, "onMarkerDrag", js.undefined)
    
    inline def setOnMarkerPress(value: /* event */ MarkerPressEvent => Callback): Self = StObject.set(x, "onMarkerPress", js.Any.fromFunction1((t0: /* event */ MarkerPressEvent) => value(t0).runNow()))
    
    inline def setOnMarkerPressUndefined: Self = StObject.set(x, "onMarkerPress", js.undefined)
    
    inline def setOnMarkerSelect(value: /* event */ MarkerSelectEvent => Callback): Self = StObject.set(x, "onMarkerSelect", js.Any.fromFunction1((t0: /* event */ MarkerSelectEvent) => value(t0).runNow()))
    
    inline def setOnMarkerSelectUndefined: Self = StObject.set(x, "onMarkerSelect", js.undefined)
    
    inline def setOnMoveShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def setOnMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
    
    inline def setOnMoveShouldSetResponderUndefined: Self = StObject.set(x, "onMoveShouldSetResponder", js.undefined)
    
    inline def setOnPanDrag(value: /* event */ PanDragEvent => Callback): Self = StObject.set(x, "onPanDrag", js.Any.fromFunction1((t0: /* event */ PanDragEvent) => value(t0).runNow()))
    
    inline def setOnPanDragUndefined: Self = StObject.set(x, "onPanDrag", js.undefined)
    
    inline def setOnPoiClick(value: /* event */ PoiClickEvent => Callback): Self = StObject.set(x, "onPoiClick", js.Any.fromFunction1((t0: /* event */ PoiClickEvent) => value(t0).runNow()))
    
    inline def setOnPoiClickUndefined: Self = StObject.set(x, "onPoiClick", js.undefined)
    
    inline def setOnPointerCancel(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerCancelCapture(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerCancelCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerCancelCaptureUndefined: Self = StObject.set(x, "onPointerCancelCapture", js.undefined)
    
    inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
    
    inline def setOnPointerDown(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerDownCapture(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerDownCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerDownCaptureUndefined: Self = StObject.set(x, "onPointerDownCapture", js.undefined)
    
    inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
    
    inline def setOnPointerEnter(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerEnterCapture(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerEnterCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerEnterCaptureUndefined: Self = StObject.set(x, "onPointerEnterCapture", js.undefined)
    
    inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
    
    inline def setOnPointerLeave(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerLeaveCapture(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerLeaveCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerLeaveCaptureUndefined: Self = StObject.set(x, "onPointerLeaveCapture", js.undefined)
    
    inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
    
    inline def setOnPointerMove(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerMoveCapture(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerMoveCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerMoveCaptureUndefined: Self = StObject.set(x, "onPointerMoveCapture", js.undefined)
    
    inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
    
    inline def setOnPointerUp(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerUpCapture(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerUpCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerUpCaptureUndefined: Self = StObject.set(x, "onPointerUpCapture", js.undefined)
    
    inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
    
    inline def setOnPress(value: /* event */ MapPressEvent => Callback): Self = StObject.set(x, "onPress", js.Any.fromFunction1((t0: /* event */ MapPressEvent) => value(t0).runNow()))
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setOnResponderEnd(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onResponderEnd", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnResponderEndUndefined: Self = StObject.set(x, "onResponderEnd", js.undefined)
    
    inline def setOnResponderGrant(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onResponderGrant", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnResponderGrantUndefined: Self = StObject.set(x, "onResponderGrant", js.undefined)
    
    inline def setOnResponderMove(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onResponderMove", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnResponderMoveUndefined: Self = StObject.set(x, "onResponderMove", js.undefined)
    
    inline def setOnResponderReject(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onResponderReject", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnResponderRejectUndefined: Self = StObject.set(x, "onResponderReject", js.undefined)
    
    inline def setOnResponderRelease(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onResponderRelease", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnResponderReleaseUndefined: Self = StObject.set(x, "onResponderRelease", js.undefined)
    
    inline def setOnResponderStart(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onResponderStart", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnResponderStartUndefined: Self = StObject.set(x, "onResponderStart", js.undefined)
    
    inline def setOnResponderTerminate(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onResponderTerminate", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnResponderTerminateUndefined: Self = StObject.set(x, "onResponderTerminate", js.undefined)
    
    inline def setOnResponderTerminationRequest(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onResponderTerminationRequest", js.Any.fromFunction1(value))
    
    inline def setOnResponderTerminationRequestUndefined: Self = StObject.set(x, "onResponderTerminationRequest", js.undefined)
    
    inline def setOnStartShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def setOnStartShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def setOnStartShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onStartShouldSetResponderCapture", js.undefined)
    
    inline def setOnStartShouldSetResponderUndefined: Self = StObject.set(x, "onStartShouldSetResponder", js.undefined)
    
    inline def setOnTouchCancel(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    inline def setOnTouchEnd(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnTouchEndCapture(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onTouchEndCapture", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
    
    inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    inline def setOnTouchMove(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    inline def setOnTouchStart(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    inline def setOnUserLocationChange(value: /* event */ UserLocationChangeEvent => Callback): Self = StObject.set(x, "onUserLocationChange", js.Any.fromFunction1((t0: /* event */ UserLocationChangeEvent) => value(t0).runNow()))
    
    inline def setOnUserLocationChangeUndefined: Self = StObject.set(x, "onUserLocationChange", js.undefined)
    
    inline def setPaddingAdjustmentBehavior(value: always | automatic | never): Self = StObject.set(x, "paddingAdjustmentBehavior", value.asInstanceOf[js.Any])
    
    inline def setPaddingAdjustmentBehaviorUndefined: Self = StObject.set(x, "paddingAdjustmentBehavior", js.undefined)
    
    inline def setPitchEnabled(value: Boolean): Self = StObject.set(x, "pitchEnabled", value.asInstanceOf[js.Any])
    
    inline def setPitchEnabledUndefined: Self = StObject.set(x, "pitchEnabled", js.undefined)
    
    inline def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
    
    inline def setProvider(value: Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setRef(value: RefHandle[MapViewNativeComponentType]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
    
    inline def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
    
    inline def setRenderToHardwareTextureAndroid(value: Boolean): Self = StObject.set(x, "renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    inline def setRenderToHardwareTextureAndroidUndefined: Self = StObject.set(x, "renderToHardwareTextureAndroid", js.undefined)
    
    inline def setRotateEnabled(value: Boolean): Self = StObject.set(x, "rotateEnabled", value.asInstanceOf[js.Any])
    
    inline def setRotateEnabledUndefined: Self = StObject.set(x, "rotateEnabled", js.undefined)
    
    inline def setScrollDuringRotateOrZoomEnabled(value: Boolean): Self = StObject.set(x, "scrollDuringRotateOrZoomEnabled", value.asInstanceOf[js.Any])
    
    inline def setScrollDuringRotateOrZoomEnabledUndefined: Self = StObject.set(x, "scrollDuringRotateOrZoomEnabled", js.undefined)
    
    inline def setScrollEnabled(value: Boolean): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
    
    inline def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
    
    inline def setShouldRasterizeIOS(value: Boolean): Self = StObject.set(x, "shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    inline def setShouldRasterizeIOSUndefined: Self = StObject.set(x, "shouldRasterizeIOS", js.undefined)
    
    inline def setShowsBuildings(value: Boolean): Self = StObject.set(x, "showsBuildings", value.asInstanceOf[js.Any])
    
    inline def setShowsBuildingsUndefined: Self = StObject.set(x, "showsBuildings", js.undefined)
    
    inline def setShowsCompass(value: Boolean): Self = StObject.set(x, "showsCompass", value.asInstanceOf[js.Any])
    
    inline def setShowsCompassUndefined: Self = StObject.set(x, "showsCompass", js.undefined)
    
    inline def setShowsIndoorLevelPicker(value: Boolean): Self = StObject.set(x, "showsIndoorLevelPicker", value.asInstanceOf[js.Any])
    
    inline def setShowsIndoorLevelPickerUndefined: Self = StObject.set(x, "showsIndoorLevelPicker", js.undefined)
    
    inline def setShowsIndoors(value: Boolean): Self = StObject.set(x, "showsIndoors", value.asInstanceOf[js.Any])
    
    inline def setShowsIndoorsUndefined: Self = StObject.set(x, "showsIndoors", js.undefined)
    
    inline def setShowsMyLocationButton(value: Boolean): Self = StObject.set(x, "showsMyLocationButton", value.asInstanceOf[js.Any])
    
    inline def setShowsMyLocationButtonUndefined: Self = StObject.set(x, "showsMyLocationButton", js.undefined)
    
    inline def setShowsPointsOfInterest(value: Boolean): Self = StObject.set(x, "showsPointsOfInterest", value.asInstanceOf[js.Any])
    
    inline def setShowsPointsOfInterestUndefined: Self = StObject.set(x, "showsPointsOfInterest", js.undefined)
    
    inline def setShowsScale(value: Boolean): Self = StObject.set(x, "showsScale", value.asInstanceOf[js.Any])
    
    inline def setShowsScaleUndefined: Self = StObject.set(x, "showsScale", js.undefined)
    
    inline def setShowsTraffic(value: Boolean): Self = StObject.set(x, "showsTraffic", value.asInstanceOf[js.Any])
    
    inline def setShowsTrafficUndefined: Self = StObject.set(x, "showsTraffic", js.undefined)
    
    inline def setShowsUserLocation(value: Boolean): Self = StObject.set(x, "showsUserLocation", value.asInstanceOf[js.Any])
    
    inline def setShowsUserLocationUndefined: Self = StObject.set(x, "showsUserLocation", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    inline def setToolbarEnabled(value: Boolean): Self = StObject.set(x, "toolbarEnabled", value.asInstanceOf[js.Any])
    
    inline def setToolbarEnabledUndefined: Self = StObject.set(x, "toolbarEnabled", js.undefined)
    
    inline def setTvParallaxMagnification(value: Double): Self = StObject.set(x, "tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxMagnificationUndefined: Self = StObject.set(x, "tvParallaxMagnification", js.undefined)
    
    inline def setTvParallaxProperties(value: TVParallaxProperties): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
    
    inline def setTvParallaxShiftDistanceX(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxShiftDistanceXUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceX", js.undefined)
    
    inline def setTvParallaxShiftDistanceY(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxShiftDistanceYUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceY", js.undefined)
    
    inline def setTvParallaxTiltAngle(value: Double): Self = StObject.set(x, "tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxTiltAngleUndefined: Self = StObject.set(x, "tvParallaxTiltAngle", js.undefined)
    
    inline def setUserInterfaceStyle(value: light | dark): Self = StObject.set(x, "userInterfaceStyle", value.asInstanceOf[js.Any])
    
    inline def setUserInterfaceStyleUndefined: Self = StObject.set(x, "userInterfaceStyle", js.undefined)
    
    inline def setUserLocationAnnotationTitle(value: String): Self = StObject.set(x, "userLocationAnnotationTitle", value.asInstanceOf[js.Any])
    
    inline def setUserLocationAnnotationTitleUndefined: Self = StObject.set(x, "userLocationAnnotationTitle", js.undefined)
    
    inline def setUserLocationCalloutEnabled(value: Boolean): Self = StObject.set(x, "userLocationCalloutEnabled", value.asInstanceOf[js.Any])
    
    inline def setUserLocationCalloutEnabledUndefined: Self = StObject.set(x, "userLocationCalloutEnabled", js.undefined)
    
    inline def setUserLocationFastestInterval(value: Double): Self = StObject.set(x, "userLocationFastestInterval", value.asInstanceOf[js.Any])
    
    inline def setUserLocationFastestIntervalUndefined: Self = StObject.set(x, "userLocationFastestInterval", js.undefined)
    
    inline def setUserLocationPriority(value: balanced | high | low | passive): Self = StObject.set(x, "userLocationPriority", value.asInstanceOf[js.Any])
    
    inline def setUserLocationPriorityUndefined: Self = StObject.set(x, "userLocationPriority", js.undefined)
    
    inline def setUserLocationUpdateInterval(value: Double): Self = StObject.set(x, "userLocationUpdateInterval", value.asInstanceOf[js.Any])
    
    inline def setUserLocationUpdateIntervalUndefined: Self = StObject.set(x, "userLocationUpdateInterval", js.undefined)
    
    inline def setZoomControlEnabled(value: Boolean): Self = StObject.set(x, "zoomControlEnabled", value.asInstanceOf[js.Any])
    
    inline def setZoomControlEnabledUndefined: Self = StObject.set(x, "zoomControlEnabled", js.undefined)
    
    inline def setZoomEnabled(value: Boolean): Self = StObject.set(x, "zoomEnabled", value.asInstanceOf[js.Any])
    
    inline def setZoomEnabledUndefined: Self = StObject.set(x, "zoomEnabled", js.undefined)
    
    inline def setZoomTapEnabled(value: Boolean): Self = StObject.set(x, "zoomTapEnabled", value.asInstanceOf[js.Any])
    
    inline def setZoomTapEnabledUndefined: Self = StObject.set(x, "zoomTapEnabled", js.undefined)
  }
}
