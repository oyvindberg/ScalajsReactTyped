package typingsJapgolly.reactNativeElements

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactNative.mod.AccessibilityActionEvent
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityValue
import typingsJapgolly.reactNative.mod.ActivityIndicatorProps
import typingsJapgolly.reactNative.mod.BackgroundPropType
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.NativeSyntheticEvent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TVParallaxProperties
import typingsJapgolly.reactNative.mod.TargetedEvent
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewProps
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeElements.anon.ForwardRefExoticComponentDisplayName
import typingsJapgolly.reactNativeElements.anon.FunctionComponentPickView
import typingsJapgolly.reactNativeElements.anon.TypeofComponent
import typingsJapgolly.reactNativeElements.distConfigThemeProviderMod.ThemeProps
import typingsJapgolly.reactNativeElements.distHelpersMod.RneFunctionComponent
import typingsJapgolly.reactNativeElements.distIconsIconMod.IconNode
import typingsJapgolly.reactNativeElements.distTextTextMod.TextProps
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`no-hide-descendants`
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.assertive
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.auto
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.bottom
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.clear
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.left
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.no
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.none
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.outline
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.polite
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.primary
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.right
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.solid
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.top
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.yes
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTabTabMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/tab/Tab", JSImport.Default)
  @js.native
  val default: FunctionComponentPickView | ForwardRefExoticComponentDisplayName = js.native
  
  @js.native
  trait Tab
    extends StObject
       with FunctionComponent[TabProps & Partial[ThemeProps[TabProps]]] {
    
    var Item: RneFunctionComponent[TabItemProps] = js.native
  }
  @JSImport("react-native-elements/dist/tab/Tab", "Tab")
  @js.native
  val Tab: typingsJapgolly.reactNativeElements.distTabTabMod.Tab = js.native
  
  /* Inlined react-native-elements.react-native-elements/dist/buttons/Button.ButtonProps & {  active :boolean | undefined,   variant :'primary' | 'default' | undefined} */
  trait TabItemProps extends StObject {
    
    var TouchableComponent: js.UndefOr[
        TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          Component[js.Object, js.Object]
        ])
      ] = js.undefined
    
    var ViewComponent: js.UndefOr[
        TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          Component[js.Object, js.Object]
        ])
      ] = js.undefined
    
    /**
      * Provides an array of custom actions available for accessibility.
      */
    var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.undefined
    
    /**
      * A Boolean value indicating whether the accessibility elements contained within this accessibility element
      * are hidden to the screen reader.
      * @platform ios
      */
    var accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An accessibility hint helps users understand what will happen when they perform an action on the accessibility element when that result is not obvious from the accessibility label.
      */
    var accessibilityHint: js.UndefOr[String] = js.undefined
    
    /**
      * https://reactnative.dev/docs/accessibility#accessibilityignoresinvertcolorsios
      * @platform ios
      */
    var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Overrides the text that's read by the screen reader when the user interacts with the element. By default, the
      * label is constructed by traversing all the children and accumulating all the Text nodes separated by space.
      */
    var accessibilityLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the nativeID of the associated label text. When the assistive technology focuses on the component with this props, the text is read aloud.
      * @platform android
      */
    var accessibilityLabelledBy: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Indicates to the accessibility services that the UI component is in
      * a specific language. The provided string should be formatted following
      * the BCP 47 specification (https://www.rfc-editor.org/info/bcp47).
      * @platform ios
      */
    var accessibilityLanguage: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates to accessibility services whether the user should be notified when this view changes.
      * Works for Android API >= 19 only.
      * See http://developer.android.com/reference/android/view/View.html#attr_android:accessibilityLiveRegion for references.
      * @platform android
      */
    var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.undefined
    
    /**
      * Accessibility Role tells a person using either VoiceOver on iOS or TalkBack on Android the type of element that is focused on.
      */
    var accessibilityRole: js.UndefOr[AccessibilityRole] = js.undefined
    
    /**
      * Accessibility State tells a person using either VoiceOver on iOS or TalkBack on Android the state of the element currently focused on.
      */
    var accessibilityState: js.UndefOr[AccessibilityState] = js.undefined
    
    /**
      * Represents the current value of a component. It can be a textual description of a component's value, or for range-based components, such as sliders and progress bars,
      * it contains range information (minimum, current, and maximum).
      */
    var accessibilityValue: js.UndefOr[AccessibilityValue] = js.undefined
    
    /**
      * A Boolean value indicating whether VoiceOver should ignore the elements within views that are siblings of the receiver.
      * @platform ios
      */
    var accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When true, indicates that the view is an accessibility element.
      * By default, all the touchable elements are accessible.
      */
    var accessible: js.UndefOr[Boolean] = js.undefined
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determines what the opacity of the wrapped view should be when touch is active.
      * Defaults to 0.2
      */
    var activeOpacity: js.UndefOr[Double] = js.undefined
    
    /**
      * Determines the type of background drawable that's going to be used to display feedback.
      * It takes an object with type property and extra data depending on the type.
      * It's recommended to use one of the following static methods to generate that dictionary:
      *      1) TouchableNativeFeedback.SelectableBackground() - will create object that represents android theme's
      *         default background for selectable elements (?android:attr/selectableItemBackground)
      *      2) TouchableNativeFeedback.SelectableBackgroundBorderless() - will create object that represent android
      *         theme's default background for borderless selectable elements
      *         (?android:attr/selectableItemBackgroundBorderless). Available on android API level 21+
      *      3) TouchableNativeFeedback.Ripple(color, borderless) - will create object that represents ripple drawable
      *         with specified color (as a string). If property borderless evaluates to true the ripple will render
      *         outside of the view bounds (see native actionbar buttons as an example of that behavior). This background
      *         type is available on Android API level 21+
      */
    var background: js.UndefOr[BackgroundPropType] = js.undefined
    
    var buttonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * Delay in ms, from onPressIn, before onLongPress is called.
      */
    var delayLongPress: js.UndefOr[Double] = js.undefined
    
    /**
      * Delay in ms, from the start of the touch, before onPressIn is called.
      */
    var delayPressIn: js.UndefOr[Double] = js.undefined
    
    /**
      * Delay in ms, from the release of the touch, before onPressOut is called.
      */
    var delayPressOut: js.UndefOr[Double] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var disabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var disabledTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    /**
      * *(Apple TV only)* TV preferred focus (see documentation for the View component).
      *
      * @platform ios
      */
    var hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This defines how far your touch can start away from the button.
      * This is added to pressRetentionOffset when moving off of the button.
      * NOTE The touch area never extends past the parent view bounds and
      * the Z-index of sibling views always takes precedence if a touch hits
      * two overlapping views.
      */
    var hitSlop: js.UndefOr[Insets] = js.undefined
    
    var icon: js.UndefOr[IconNode] = js.undefined
    
    var iconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var iconPosition: js.UndefOr[left | right | top | bottom] = js.undefined
    
    var iconRight: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls how view is important for accessibility which is if it fires accessibility events
      * and if it is reported to accessibility services that query the screen.
      * Works for Android only. See http://developer.android.com/reference/android/R.attr.html#importantForAccessibility for references.
      *
      * Possible values:
      *      'auto' - The system determines whether the view is important for accessibility - default (recommended).
      *      'yes' - The view is important for accessibility.
      *      'no' - The view is not important for accessibility.
      *      'no-hide-descendants' - The view is not important for accessibility, nor are any of its descendant views.
      */
    var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
    
    var linearGradientProps: js.UndefOr[js.Object] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var loadingProps: js.UndefOr[ActivityIndicatorProps] = js.undefined
    
    var loadingStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * Designates the next view to receive focus when the user navigates down. See the Android documentation.
      *
      * @platform android
      */
    var nextFocusDown: js.UndefOr[Double] = js.undefined
    
    /**
      * Designates the next view to receive focus when the user navigates forward. See the Android documentation.
      *
      * @platform android
      */
    var nextFocusForward: js.UndefOr[Double] = js.undefined
    
    /**
      * Designates the next view to receive focus when the user navigates left. See the Android documentation.
      *
      * @platform android
      */
    var nextFocusLeft: js.UndefOr[Double] = js.undefined
    
    /**
      * Designates the next view to receive focus when the user navigates right. See the Android documentation.
      *
      * @platform android
      */
    var nextFocusRight: js.UndefOr[Double] = js.undefined
    
    /**
      * Designates the next view to receive focus when the user navigates up. See the Android documentation.
      *
      * @platform android
      */
    var nextFocusUp: js.UndefOr[Double] = js.undefined
    
    /**
      * When `accessible` is true, the system will try to invoke this function when the user performs an accessibility custom action.
      */
    var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.undefined
    
    /**
      * When accessibile is true, the system will invoke this function when the user performs the escape gesture (scrub with two fingers).
      * @platform ios
      */
    var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * When `accessible` is true, the system will try to invoke this function when the user performs accessibility tap gesture.
      * @platform ios
      */
    var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * When `accessible` is true (which is the default) this may be called when
      * the OS-specific concept of "blur" occurs, meaning the element lost focus.
      * Some platforms may not have the concept of blur.
      */
    var onBlur: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.undefined
    
    /**
      * When `accessible` is true (which is the default) this may be called when
      * the OS-specific concept of "focus" occurs. Some platforms may not have
      * the concept of focus.
      */
    var onFocus: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.undefined
    
    /**
      * Invoked on mount and layout changes with
      * {nativeEvent: {layout: {x, y, width, height}}}
      */
    var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
    
    var onLongPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    /**
      * When accessible is true, the system will invoke this function when the user performs the magic tap gesture.
      * @platform ios
      */
    var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Called when the touch is released,
      * but not if cancelled (e.g. by a scroll that steals the responder lock).
      */
    var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onPressIn: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onPressOut: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    /**
      * When the scroll view is disabled, this defines how far your
      * touch may move off of the button, before deactivating the button.
      * Once deactivated, try moving it back and you'll see that the button
      * is once again reactivated! Move it back and forth several times
      * while the scroll view is disabled. Ensure you pass in a constant
      * to reduce memory allocations.
      */
    var pressRetentionOffset: js.UndefOr[Insets] = js.undefined
    
    var raised: js.UndefOr[Boolean] = js.undefined
    
    /**
      * //FIXME: not in doc but available in examples
      */
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * Used to locate this view in end-to-end tests.
      */
    var testID: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String | Element] = js.undefined
    
    var titleProps: js.UndefOr[TextProps] = js.undefined
    
    var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    /**
      * If true, doesn't play a system sound on touch.
      *
      * @platform android
      */
    var touchSoundDisabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * *(Apple TV only)* Object with properties to control Apple TV parallax effects.
      *
      * enabled: If true, parallax effects are enabled.  Defaults to true.
      * shiftDistanceX: Defaults to 2.0.
      * shiftDistanceY: Defaults to 2.0.
      * tiltAngle: Defaults to 0.05.
      * magnification: Defaults to 1.0.
      * pressMagnification: Defaults to 1.0.
      * pressDuration: Defaults to 0.3.
      * pressDelay: Defaults to 0.0.
      *
      * @platform android
      */
    var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
    
    var `type`: js.UndefOr[solid | clear | outline] = js.undefined
    
    var useForeground: js.UndefOr[Boolean] = js.undefined
    
    var variant: js.UndefOr[primary | typingsJapgolly.reactNativeElements.reactNativeElementsStrings.default] = js.undefined
  }
  object TabItemProps {
    
    inline def apply(): TabItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabItemProps]
    }
    
    extension [Self <: TabItemProps](x: Self) {
      
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
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
      
      inline def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setBackground(value: BackgroundPropType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setButtonStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "buttonStyle", value.asInstanceOf[js.Any])
      
      inline def setButtonStyleNull: Self = StObject.set(x, "buttonStyle", null)
      
      inline def setButtonStyleUndefined: Self = StObject.set(x, "buttonStyle", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setDelayLongPress(value: Double): Self = StObject.set(x, "delayLongPress", value.asInstanceOf[js.Any])
      
      inline def setDelayLongPressUndefined: Self = StObject.set(x, "delayLongPress", js.undefined)
      
      inline def setDelayPressIn(value: Double): Self = StObject.set(x, "delayPressIn", value.asInstanceOf[js.Any])
      
      inline def setDelayPressInUndefined: Self = StObject.set(x, "delayPressIn", js.undefined)
      
      inline def setDelayPressOut(value: Double): Self = StObject.set(x, "delayPressOut", value.asInstanceOf[js.Any])
      
      inline def setDelayPressOutUndefined: Self = StObject.set(x, "delayPressOut", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "disabledStyle", value.asInstanceOf[js.Any])
      
      inline def setDisabledStyleNull: Self = StObject.set(x, "disabledStyle", null)
      
      inline def setDisabledStyleUndefined: Self = StObject.set(x, "disabledStyle", js.undefined)
      
      inline def setDisabledTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "disabledTitleStyle", value.asInstanceOf[js.Any])
      
      inline def setDisabledTitleStyleNull: Self = StObject.set(x, "disabledTitleStyle", null)
      
      inline def setDisabledTitleStyleUndefined: Self = StObject.set(x, "disabledTitleStyle", js.undefined)
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
      
      inline def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
      
      inline def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
      
      inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
      
      inline def setIcon(value: IconNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "iconContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setIconContainerStyleNull: Self = StObject.set(x, "iconContainerStyle", null)
      
      inline def setIconContainerStyleUndefined: Self = StObject.set(x, "iconContainerStyle", js.undefined)
      
      inline def setIconPosition(value: left | right | top | bottom): Self = StObject.set(x, "iconPosition", value.asInstanceOf[js.Any])
      
      inline def setIconPositionUndefined: Self = StObject.set(x, "iconPosition", js.undefined)
      
      inline def setIconRight(value: Boolean): Self = StObject.set(x, "iconRight", value.asInstanceOf[js.Any])
      
      inline def setIconRightUndefined: Self = StObject.set(x, "iconRight", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
      
      inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
      
      inline def setLinearGradientProps(value: js.Object): Self = StObject.set(x, "linearGradientProps", value.asInstanceOf[js.Any])
      
      inline def setLinearGradientPropsUndefined: Self = StObject.set(x, "linearGradientProps", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingProps(value: ActivityIndicatorProps): Self = StObject.set(x, "loadingProps", value.asInstanceOf[js.Any])
      
      inline def setLoadingPropsUndefined: Self = StObject.set(x, "loadingProps", js.undefined)
      
      inline def setLoadingStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "loadingStyle", value.asInstanceOf[js.Any])
      
      inline def setLoadingStyleNull: Self = StObject.set(x, "loadingStyle", null)
      
      inline def setLoadingStyleUndefined: Self = StObject.set(x, "loadingStyle", js.undefined)
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setNextFocusDown(value: Double): Self = StObject.set(x, "nextFocusDown", value.asInstanceOf[js.Any])
      
      inline def setNextFocusDownUndefined: Self = StObject.set(x, "nextFocusDown", js.undefined)
      
      inline def setNextFocusForward(value: Double): Self = StObject.set(x, "nextFocusForward", value.asInstanceOf[js.Any])
      
      inline def setNextFocusForwardUndefined: Self = StObject.set(x, "nextFocusForward", js.undefined)
      
      inline def setNextFocusLeft(value: Double): Self = StObject.set(x, "nextFocusLeft", value.asInstanceOf[js.Any])
      
      inline def setNextFocusLeftUndefined: Self = StObject.set(x, "nextFocusLeft", js.undefined)
      
      inline def setNextFocusRight(value: Double): Self = StObject.set(x, "nextFocusRight", value.asInstanceOf[js.Any])
      
      inline def setNextFocusRightUndefined: Self = StObject.set(x, "nextFocusRight", js.undefined)
      
      inline def setNextFocusUp(value: Double): Self = StObject.set(x, "nextFocusUp", value.asInstanceOf[js.Any])
      
      inline def setNextFocusUpUndefined: Self = StObject.set(x, "nextFocusUp", js.undefined)
      
      inline def setOnAccessibilityAction(value: /* event */ AccessibilityActionEvent => Callback): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1((t0: /* event */ AccessibilityActionEvent) => value(t0).runNow()))
      
      inline def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
      
      inline def setOnAccessibilityEscape(value: Callback): Self = StObject.set(x, "onAccessibilityEscape", value.toJsFn)
      
      inline def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
      
      inline def setOnAccessibilityTap(value: Callback): Self = StObject.set(x, "onAccessibilityTap", value.toJsFn)
      
      inline def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
      
      inline def setOnBlur(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[TargetedEvent]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnFocus(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[TargetedEvent]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnLayout(value: /* event */ LayoutChangeEvent => Callback): Self = StObject.set(x, "onLayout", js.Any.fromFunction1((t0: /* event */ LayoutChangeEvent) => value(t0).runNow()))
      
      inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
      
      inline def setOnLongPress(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
      
      inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
      
      inline def setOnMagicTap(value: Callback): Self = StObject.set(x, "onMagicTap", value.toJsFn)
      
      inline def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
      
      inline def setOnPress(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onPress", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
      
      inline def setOnPressIn(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onPressIn", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
      
      inline def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
      
      inline def setOnPressOut(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onPressOut", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
      
      inline def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setPressRetentionOffset(value: Insets): Self = StObject.set(x, "pressRetentionOffset", value.asInstanceOf[js.Any])
      
      inline def setPressRetentionOffsetUndefined: Self = StObject.set(x, "pressRetentionOffset", js.undefined)
      
      inline def setRaised(value: Boolean): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
      
      inline def setRaisedUndefined: Self = StObject.set(x, "raised", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      inline def setTitle(value: String | Element): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleProps(value: TextProps): Self = StObject.set(x, "titleProps", value.asInstanceOf[js.Any])
      
      inline def setTitlePropsUndefined: Self = StObject.set(x, "titleProps", js.undefined)
      
      inline def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
      
      inline def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
      
      inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTouchSoundDisabled(value: Boolean): Self = StObject.set(x, "touchSoundDisabled", value.asInstanceOf[js.Any])
      
      inline def setTouchSoundDisabledUndefined: Self = StObject.set(x, "touchSoundDisabled", js.undefined)
      
      inline def setTouchableComponent(
        value: TypeofComponent & (Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
              Component[js.Object, js.Object]
            ])
      ): Self = StObject.set(x, "TouchableComponent", value.asInstanceOf[js.Any])
      
      inline def setTouchableComponentUndefined: Self = StObject.set(x, "TouchableComponent", js.undefined)
      
      inline def setTvParallaxProperties(value: TVParallaxProperties): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
      
      inline def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
      
      inline def setType(value: solid | clear | outline): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUseForeground(value: Boolean): Self = StObject.set(x, "useForeground", value.asInstanceOf[js.Any])
      
      inline def setUseForegroundUndefined: Self = StObject.set(x, "useForeground", js.undefined)
      
      inline def setVariant(value: primary | typingsJapgolly.reactNativeElements.reactNativeElementsStrings.default): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
      
      inline def setViewComponent(
        value: TypeofComponent & (Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
              Component[js.Object, js.Object]
            ])
      ): Self = StObject.set(x, "ViewComponent", value.asInstanceOf[js.Any])
      
      inline def setViewComponentUndefined: Self = StObject.set(x, "ViewComponent", js.undefined)
    }
  }
  
  trait TabProps
    extends StObject
       with ViewProps {
    
    var disableIndicator: js.UndefOr[Boolean] = js.undefined
    
    var indicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
    
    var variant: js.UndefOr[primary | typingsJapgolly.reactNativeElements.reactNativeElementsStrings.default] = js.undefined
  }
  object TabProps {
    
    inline def apply(): TabProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabProps]
    }
    
    extension [Self <: TabProps](x: Self) {
      
      inline def setDisableIndicator(value: Boolean): Self = StObject.set(x, "disableIndicator", value.asInstanceOf[js.Any])
      
      inline def setDisableIndicatorUndefined: Self = StObject.set(x, "disableIndicator", js.undefined)
      
      inline def setIndicatorStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
      
      inline def setIndicatorStyleNull: Self = StObject.set(x, "indicatorStyle", null)
      
      inline def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
      
      inline def setOnChange(value: /* value */ Double => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setVariant(value: primary | typingsJapgolly.reactNativeElements.reactNativeElementsStrings.default): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  type _To = FunctionComponentPickView | ForwardRefExoticComponentDisplayName
  
  /* This means you don't have to write `default`, but can instead just say `distTabTabMod.foo` */
  override def _to: FunctionComponentPickView | ForwardRefExoticComponentDisplayName = default
}
