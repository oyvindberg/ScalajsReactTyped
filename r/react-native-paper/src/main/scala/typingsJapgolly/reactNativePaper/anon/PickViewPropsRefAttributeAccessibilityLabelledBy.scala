package typingsJapgolly.reactNativePaper.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNative.mod.AccessibilityActionEvent
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityValue
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.PointerEvent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TVParallaxProperties
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.View
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`box-none`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`box-only`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`no-hide-descendants`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.assertive
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.auto
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.no
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.none
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.polite
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-native.react-native.ViewProps & react.react.RefAttributes<react-native.react-native.View> & {  title :react.react.ReactNode,   titleStyle :react-native.react-native.StyleProp<react-native.react-native.TextStyle> | undefined,   titleNumberOfLines :number | undefined,   subtitle :react.react.ReactNode | undefined,   subtitleStyle :react-native.react-native.StyleProp<react-native.react-native.TextStyle> | undefined,   subtitleNumberOfLines :number | undefined,   left :(props : {  size :number}): react.react.ReactNode | undefined,   leftStyle :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   right :(props : {  size :number}): react.react.ReactNode | undefined,   rightStyle :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   index :number | undefined,   total :number | undefined,   style :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   theme :react-native-paper.react-native-paper/lib/typescript/types.<global>.ReactNativePaper.Theme}, 'title' | 'left' | 'right' | keyof react-native.react-native.ViewProps | keyof react.react.RefAttributes<react-native.react-native.View> | 'titleStyle' | 'titleNumberOfLines' | 'index' | 'total' | 'subtitle' | 'subtitleStyle' | 'subtitleNumberOfLines' | 'leftStyle' | 'rightStyle'> & {  theme :@callstack/react-theme-provider.@callstack/react-theme-provider.$DeepPartial<react-native-paper.react-native-paper/lib/typescript/types.<global>.ReactNativePaper.Theme> | undefined} */
trait PickViewPropsRefAttributeAccessibilityLabelledBy extends StObject {
  
  var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.undefined
  
  var accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityHint: js.UndefOr[String] = js.undefined
  
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  var accessibilityLabelledBy: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var accessibilityLanguage: js.UndefOr[String] = js.undefined
  
  var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.undefined
  
  var accessibilityRole: js.UndefOr[AccessibilityRole] = js.undefined
  
  var accessibilityState: js.UndefOr[typingsJapgolly.reactNative.mod.AccessibilityState] = js.undefined
  
  var accessibilityValue: js.UndefOr[AccessibilityValue] = js.undefined
  
  var accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
  
  var accessible: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var collapsable: js.UndefOr[Boolean] = js.undefined
  
  var focusable: js.UndefOr[Boolean] = js.undefined
  
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
  
  var hitSlop: js.UndefOr[Insets] = js.undefined
  
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var isTVSelectable: js.UndefOr[Boolean] = js.undefined
  
  var key: js.UndefOr[typingsJapgolly.react.mod.Key | Null] = js.undefined
  
  var left: js.UndefOr[js.Function1[/* props */ SizeNumber, Node]] = js.undefined
  
  var leftStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var nativeID: js.UndefOr[String] = js.undefined
  
  var needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined
  
  var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.undefined
  
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
  
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onMoveShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
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
  
  var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.undefined
  
  var ref: js.UndefOr[typingsJapgolly.react.mod.Ref[View]] = js.undefined
  
  var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
  
  var renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined
  
  var right: js.UndefOr[js.Function1[/* props */ SizeNumber, Node]] = js.undefined
  
  var rightStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var subtitle: js.UndefOr[Node] = js.undefined
  
  var subtitleNumberOfLines: js.UndefOr[Double] = js.undefined
  
  var subtitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var testID: js.UndefOr[String] = js.undefined
  
  var theme: js.UndefOr[DeepPartialTheme] = js.undefined
  
  var title: Node
  
  var titleNumberOfLines: js.UndefOr[Double] = js.undefined
  
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var total: js.UndefOr[Double] = js.undefined
  
  var tvParallaxMagnification: js.UndefOr[Double] = js.undefined
  
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
  
  var tvParallaxShiftDistanceX: js.UndefOr[Double] = js.undefined
  
  var tvParallaxShiftDistanceY: js.UndefOr[Double] = js.undefined
  
  var tvParallaxTiltAngle: js.UndefOr[Double] = js.undefined
}
object PickViewPropsRefAttributeAccessibilityLabelledBy {
  
  inline def apply(): PickViewPropsRefAttributeAccessibilityLabelledBy = {
    val __obj = js.Dynamic.literal(title = null)
    __obj.asInstanceOf[PickViewPropsRefAttributeAccessibilityLabelledBy]
  }
  
  extension [Self <: PickViewPropsRefAttributeAccessibilityLabelledBy](x: Self) {
    
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
    
    inline def setAccessibilityState(value: typingsJapgolly.reactNative.mod.AccessibilityState): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
    
    inline def setAccessibilityValue(value: AccessibilityValue): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
    
    inline def setAccessibilityViewIsModal(value: Boolean): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
    
    inline def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
    
    inline def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setCollapsable(value: Boolean): Self = StObject.set(x, "collapsable", value.asInstanceOf[js.Any])
    
    inline def setCollapsableUndefined: Self = StObject.set(x, "collapsable", js.undefined)
    
    inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    inline def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    inline def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
    
    inline def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
    
    inline def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIsTVSelectable(value: Boolean): Self = StObject.set(x, "isTVSelectable", value.asInstanceOf[js.Any])
    
    inline def setIsTVSelectableUndefined: Self = StObject.set(x, "isTVSelectable", js.undefined)
    
    inline def setKey(value: typingsJapgolly.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLeft(value: /* props */ SizeNumber => Node): Self = StObject.set(x, "left", js.Any.fromFunction1(value))
    
    inline def setLeftStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "leftStyle", value.asInstanceOf[js.Any])
    
    inline def setLeftStyleNull: Self = StObject.set(x, "leftStyle", null)
    
    inline def setLeftStyleUndefined: Self = StObject.set(x, "leftStyle", js.undefined)
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
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
    
    inline def setOnLayout(value: /* event */ LayoutChangeEvent => Callback): Self = StObject.set(x, "onLayout", js.Any.fromFunction1((t0: /* event */ LayoutChangeEvent) => value(t0).runNow()))
    
    inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    inline def setOnMagicTap(value: Callback): Self = StObject.set(x, "onMagicTap", value.toJsFn)
    
    inline def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
    
    inline def setOnMoveShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def setOnMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
    
    inline def setOnMoveShouldSetResponderUndefined: Self = StObject.set(x, "onMoveShouldSetResponder", js.undefined)
    
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
    
    inline def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
    
    inline def setRef(value: typingsJapgolly.react.mod.Ref[View]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: View | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: View | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
    
    inline def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
    
    inline def setRenderToHardwareTextureAndroid(value: Boolean): Self = StObject.set(x, "renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    inline def setRenderToHardwareTextureAndroidUndefined: Self = StObject.set(x, "renderToHardwareTextureAndroid", js.undefined)
    
    inline def setRight(value: /* props */ SizeNumber => Node): Self = StObject.set(x, "right", js.Any.fromFunction1(value))
    
    inline def setRightStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "rightStyle", value.asInstanceOf[js.Any])
    
    inline def setRightStyleNull: Self = StObject.set(x, "rightStyle", null)
    
    inline def setRightStyleUndefined: Self = StObject.set(x, "rightStyle", js.undefined)
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setShouldRasterizeIOS(value: Boolean): Self = StObject.set(x, "shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    inline def setShouldRasterizeIOSUndefined: Self = StObject.set(x, "shouldRasterizeIOS", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSubtitle(value: VdomNode): Self = StObject.set(x, "subtitle", value.rawNode.asInstanceOf[js.Any])
    
    inline def setSubtitleNull: Self = StObject.set(x, "subtitle", null)
    
    inline def setSubtitleNumberOfLines(value: Double): Self = StObject.set(x, "subtitleNumberOfLines", value.asInstanceOf[js.Any])
    
    inline def setSubtitleNumberOfLinesUndefined: Self = StObject.set(x, "subtitleNumberOfLines", js.undefined)
    
    inline def setSubtitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "subtitleStyle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleStyleNull: Self = StObject.set(x, "subtitleStyle", null)
    
    inline def setSubtitleStyleUndefined: Self = StObject.set(x, "subtitleStyle", js.undefined)
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setSubtitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "subtitle", js.Array(value*))
    
    inline def setSubtitleVdomElement(value: VdomElement): Self = StObject.set(x, "subtitle", value.rawElement.asInstanceOf[js.Any])
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setTheme(value: DeepPartialTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleNumberOfLines(value: Double): Self = StObject.set(x, "titleNumberOfLines", value.asInstanceOf[js.Any])
    
    inline def setTitleNumberOfLinesUndefined: Self = StObject.set(x, "titleNumberOfLines", js.undefined)
    
    inline def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
    
    inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
    
    inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
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
  }
}
