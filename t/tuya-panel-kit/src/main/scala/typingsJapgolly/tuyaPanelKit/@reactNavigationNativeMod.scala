package typingsJapgolly.tuyaPanelKit

import japgolly.scalajs.react.facade.React.RefHandle
import typingsJapgolly.react.mod.CElement
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.Text
import typingsJapgolly.reactNative.mod.TextProps
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import typingsJapgolly.tuyaPanelKit.`@reactNavigationCoreGetActionFromStateMod`.NavigateAction
import typingsJapgolly.tuyaPanelKit.`@reactNavigationCoreGetStateFromPathMod`.ResultState
import typingsJapgolly.tuyaPanelKit.`@reactNavigationCoreTypesMod`.DefaultNavigatorOptions
import typingsJapgolly.tuyaPanelKit.`@reactNavigationCoreTypesMod`.EventMapBase
import typingsJapgolly.tuyaPanelKit.`@reactNavigationCoreTypesMod`.NavigationContainerProps
import typingsJapgolly.tuyaPanelKit.`@reactNavigationCoreTypesMod`.NavigationContainerRef
import typingsJapgolly.tuyaPanelKit.`@reactNavigationCoreTypesMod`.NavigationHelpers
import typingsJapgolly.tuyaPanelKit.`@reactNavigationCoreTypesMod`.NavigationProp
import typingsJapgolly.tuyaPanelKit.`@reactNavigationCoreTypesMod`.RouteProp
import typingsJapgolly.tuyaPanelKit.`@reactNavigationCoreTypesMod`.TypedNavigator
import typingsJapgolly.tuyaPanelKit.`@reactNavigationCoreUseFocusEffectMod`.EffectCallback
import typingsJapgolly.tuyaPanelKit.`@reactNavigationCoreUseNavigationStateMod`.Selector
import typingsJapgolly.tuyaPanelKit.`@reactNavigationNativeLinkMod`.Props
import typingsJapgolly.tuyaPanelKit.`@reactNavigationNativeTypesMod`.LinkingOptions
import typingsJapgolly.tuyaPanelKit.`@reactNavigationNativeTypesMod`.Theme
import typingsJapgolly.tuyaPanelKit.`@reactNavigationNativeUseScrollToTopMod`.ScrollableWrapper
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersCommonActionsMod`.Action
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersCommonActionsMod`.ResetState
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersDrawerRouterMod`.DrawerActionType
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersDrawerRouterMod`.DrawerNavigationState
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersDrawerRouterMod`.DrawerRouterOptions
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersStackRouterMod`.StackActionType
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersStackRouterMod`.StackNavigationState
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersStackRouterMod`.StackRouterOptions
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTabRouterMod`.TabActionType
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTabRouterMod`.TabNavigationState
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTabRouterMod`.TabRouterOptions
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.CommonNavigationAction
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.DefaultRouterOptions
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.NavigationState
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.ParamListBase
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.PartialState
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.Route
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.Router
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.RouterFactory
import typingsJapgolly.tuyaPanelKit.anon.AccessibilityRole
import typingsJapgolly.tuyaPanelKit.anon.Descriptors
import typingsJapgolly.tuyaPanelKit.anon.GetInitialState
import typingsJapgolly.tuyaPanelKit.anon.Key
import typingsJapgolly.tuyaPanelKit.anon.NavigationContainerPropst
import typingsJapgolly.tuyaPanelKit.anon.Options
import typingsJapgolly.tuyaPanelKit.anon.Params
import typingsJapgolly.tuyaPanelKit.anon.PartialStateNavigationSta
import typingsJapgolly.tuyaPanelKit.anon.Payload
import typingsJapgolly.tuyaPanelKit.anon.PayloadSource
import typingsJapgolly.tuyaPanelKit.anon.Readonlykeystringindexnum
import typingsJapgolly.tuyaPanelKit.anon.ServerContextTypechildren
import typingsJapgolly.tuyaPanelKit.anon.Source
import typingsJapgolly.tuyaPanelKit.anon.SourceTarget
import typingsJapgolly.tuyaPanelKit.anon.SourceTargetType
import typingsJapgolly.tuyaPanelKit.anon.State
import typingsJapgolly.tuyaPanelKit.anon.Target
import typingsJapgolly.tuyaPanelKit.anon.TargetType
import typingsJapgolly.tuyaPanelKit.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `@reactNavigationNativeMod` {
  
  @JSImport("tuya-panel-kit/@react-navigation/native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Container component which holds the navigation state.
    * This should be rendered at the root wrapping the whole app.
    *
    * @param props.initialState Initial state object for the navigation tree.
    * @param props.onStateChange Callback which is called with the latest navigation state when it changes.
    * @param props.children Child elements to render the content.
    * @param props.ref Ref object which refers to the navigation object containing helper methods.
    */
  @JSImport("tuya-panel-kit/@react-navigation/native", "BaseNavigationContainer")
  @js.native
  val BaseNavigationContainer: ForwardRefExoticComponent[NavigationContainerProps & RefAttributes[NavigationContainerRef]] = js.native
  
  /**
    * Base router object that can be used when writing custom routers.
    * This provides few helper methods to handle common actions such as `RESET`.
    */
  object BaseRouter {
    
    @JSImport("tuya-panel-kit/@react-navigation/native", "BaseRouter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getStateForAction[State /* <: Readonlykeystringindexnum */](state: State, action: CommonNavigationAction): State | PartialState[State] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getStateForAction")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[State | PartialState[State] | Null]
    
    inline def shouldActionChangeFocus(action: CommonNavigationAction): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldActionChangeFocus")(action.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  object CommonActions {
    
    @JSImport("tuya-panel-kit/@react-navigation/native", "CommonActions")
    @js.native
    val ^ : js.Any = js.native
    
    inline def goBack(): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("goBack")().asInstanceOf[Action]
    
    inline def navigate(name: String): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(name.asInstanceOf[js.Any]).asInstanceOf[Action]
    inline def navigate(name: String, params: js.Object): Action = (^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Action]
    inline def navigate(route: Key): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(route.asInstanceOf[js.Any]).asInstanceOf[Action]
    inline def navigate(route: Params): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(route.asInstanceOf[js.Any]).asInstanceOf[Action]
    
    inline def reset(): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Action]
    inline def reset(state: ResetState): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(state.asInstanceOf[js.Any]).asInstanceOf[Action]
    
    inline def setParams(params: js.Object): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("setParams")(params.asInstanceOf[js.Any]).asInstanceOf[Action]
  }
  
  /**
    * Context which holds the values for the current navigation tree.
    * Intended for use in SSR. This is not safe to use on the client.
    */
  @JSImport("tuya-panel-kit/@react-navigation/native", "CurrentRenderContext")
  @js.native
  val CurrentRenderContext: Context[js.UndefOr[Options]] = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "DarkTheme")
  @js.native
  val DarkTheme: Theme = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "DefaultTheme")
  @js.native
  val DefaultTheme: Theme = js.native
  
  object DrawerActions {
    
    @JSImport("tuya-panel-kit/@react-navigation/native", "DrawerActions")
    @js.native
    val ^ : js.Any = js.native
    
    inline def closeDrawer(): DrawerActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("closeDrawer")().asInstanceOf[DrawerActionType]
    
    // tslint:disable-next-line no-redundant-undefined
    inline def jumpTo(name: String): TabActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("jumpTo")(name.asInstanceOf[js.Any]).asInstanceOf[TabActionType]
    inline def jumpTo(name: String, params: js.Object): TabActionType = (^.asInstanceOf[js.Dynamic].applyDynamic("jumpTo")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[TabActionType]
    
    inline def openDrawer(): DrawerActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("openDrawer")().asInstanceOf[DrawerActionType]
    
    // tslint:disable-next-line no-redundant-undefined
    inline def toggleDrawer(): DrawerActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleDrawer")().asInstanceOf[DrawerActionType]
  }
  
  inline def DrawerRouter(hasOpenByDefaultRest: DrawerRouterOptions): Router[DrawerNavigationState[ParamListBase], DrawerActionType | CommonNavigationAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("DrawerRouter")(hasOpenByDefaultRest.asInstanceOf[js.Any]).asInstanceOf[Router[DrawerNavigationState[ParamListBase], DrawerActionType | CommonNavigationAction]]
  
  inline def Link(hasToActionRest: Props): CElement[TextProps, Text] = ^.asInstanceOf[js.Dynamic].applyDynamic("Link")(hasToActionRest.asInstanceOf[js.Any]).asInstanceOf[CElement[TextProps, Text]]
  
  /**
    * Container component which holds the navigation state designed for React Native apps.
    * This should be rendered at the root wrapping the whole app.
    *
    * @param props.initialState Initial state object for the navigation tree.
    * When deep link handling is enabled, this will override deep links when specified.
    * Make sure that you don't specify an `initialState` when there's a deep link (`Linking.getInitialURL()`).
    * @param props.onReady Callback which is called after the navigation tree mounts.
    * @param props.onStateChange Callback which is called with the latest navigation state when it changes.
    * @param props.theme Theme object for the navigators.
    * @param props.linking Options for deep linking. Deep link handling is enabled when this prop is provided, unless `linking.enabled` is `false`.
    * @param props.fallback Fallback component to render until we have finished getting initial state when linking is enabled. Defaults to `null`.
    * @param props.documentTitle Options to configure the document title on Web. Updating document title is handled by default unless `documentTitle.enabled` is `false`.
    * @param props.children Child elements to render the content.
    * @param props.ref Ref object which refers to the navigation object containing helper methods.
    */
  @JSImport("tuya-panel-kit/@react-navigation/native", "NavigationContainer")
  @js.native
  val NavigationContainer: ForwardRefExoticComponent[NavigationContainerPropst] = js.native
  
  /**
    * Context which holds the navigation prop for a screen.
    */
  // tslint:disable-next-line use-default-type-parameter
  @JSImport("tuya-panel-kit/@react-navigation/native", "NavigationContext")
  @js.native
  val NavigationContext: Context[
    js.UndefOr[
      NavigationProp[Record[String, js.UndefOr[js.Object]], String, Any, Any, js.Object]
    ]
  ] = js.native
  
  /**
    * Context which holds the navigation helpers of the parent navigator.
    * Navigators should use this context in their view component.
    */
  // tslint:disable-next-line use-default-type-parameter
  @JSImport("tuya-panel-kit/@react-navigation/native", "NavigationHelpersContext")
  @js.native
  val NavigationHelpersContext: Context[js.UndefOr[NavigationHelpers[Record[String, js.UndefOr[js.Object]], js.Object]]] = js.native
  
  /**
    * Context which holds the route prop for a screen.
    */
  // tslint:disable-next-line use-default-type-parameter
  @JSImport("tuya-panel-kit/@react-navigation/native", "NavigationRouteContext")
  @js.native
  val NavigationRouteContext: Context[js.UndefOr[Route[String, js.UndefOr[js.Object]]]] = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "PrivateValueStore")
  @js.native
  open class PrivateValueStore[A, B, C] ()
    extends typingsJapgolly.tuyaPanelKit.`@reactNavigationCoreMod`.PrivateValueStore[A, B, C]
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "ServerContainer")
  @js.native
  val ServerContainer: ForwardRefExoticComponent[ServerContextTypechildren] = js.native
  
  object StackActions {
    
    @JSImport("tuya-panel-kit/@react-navigation/native", "StackActions")
    @js.native
    val ^ : js.Any = js.native
    
    inline def pop(): StackActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")().asInstanceOf[StackActionType]
    inline def pop(count: Double): StackActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")(count.asInstanceOf[js.Any]).asInstanceOf[StackActionType]
    
    inline def popToTop(): StackActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("popToTop")().asInstanceOf[StackActionType]
    
    // tslint:disable-next-line no-redundant-undefined
    inline def push(name: String): StackActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(name.asInstanceOf[js.Any]).asInstanceOf[StackActionType]
    inline def push(name: String, params: js.Object): StackActionType = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[StackActionType]
    
    // tslint:disable-next-line no-redundant-undefined
    inline def replace(name: String): StackActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(name.asInstanceOf[js.Any]).asInstanceOf[StackActionType]
    inline def replace(name: String, params: js.Object): StackActionType = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[StackActionType]
  }
  
  inline def StackRouter(options: StackRouterOptions): Router[
    StackNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | Target | Type | PayloadSource | SourceTarget | TargetType | SourceTargetType
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("StackRouter")(options.asInstanceOf[js.Any]).asInstanceOf[Router[
    StackNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | Target | Type | PayloadSource | SourceTarget | TargetType | SourceTargetType
  ]]
  
  object TabActions {
    
    @JSImport("tuya-panel-kit/@react-navigation/native", "TabActions")
    @js.native
    val ^ : js.Any = js.native
    
    // tslint:disable-next-line no-redundant-undefined
    inline def jumpTo(name: String): TabActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("jumpTo")(name.asInstanceOf[js.Any]).asInstanceOf[TabActionType]
    inline def jumpTo(name: String, params: js.Object): TabActionType = (^.asInstanceOf[js.Dynamic].applyDynamic("jumpTo")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[TabActionType]
  }
  
  inline def TabRouter(hasInitialRouteNameBackBehavior: TabRouterOptions): Router[
    TabNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | Target | Type | TabActionType
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("TabRouter")(hasInitialRouteNameBackBehavior.asInstanceOf[js.Any]).asInstanceOf[Router[
    TabNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | Target | Type | TabActionType
  ]]
  
  inline def ThemeProvider(
    hasValueChildren: typingsJapgolly.tuyaPanelKit.`@reactNavigationNativeThemingThemeProviderMod`.Props
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ThemeProvider")(hasValueChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def createNavigatorFactory[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */, NavigatorComponent /* <: ComponentType[Any] */](Navigator: NavigatorComponent): js.Function0[
    TypedNavigator[
      Record[String, js.UndefOr[js.Object]], 
      State, 
      ScreenOptions, 
      EventMap, 
      NavigatorComponent
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createNavigatorFactory")(Navigator.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
    TypedNavigator[
      Record[String, js.UndefOr[js.Object]], 
      State, 
      ScreenOptions, 
      EventMap, 
      NavigatorComponent
    ]
  ]]
  
  inline def getActionFromState(state: PartialStateNavigationSta): js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActionFromState")(state.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action]]
  inline def getActionFromState(
    state: PartialStateNavigationSta,
    options: typingsJapgolly.tuyaPanelKit.`@reactNavigationCoreGetActionFromStateMod`.Options
  ): js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action] = (^.asInstanceOf[js.Dynamic].applyDynamic("getActionFromState")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action]]
  
  inline def getFocusedRouteNameFromRoute(route: (Partial[Route[String, js.UndefOr[js.Object]]]) & State): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusedRouteNameFromRoute")(route.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def getPathFromState(state: typingsJapgolly.tuyaPanelKit.`@reactNavigationCoreGetPathFromStateMod`.State): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathFromState")(state.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getPathFromState(
    state: typingsJapgolly.tuyaPanelKit.`@reactNavigationCoreGetPathFromStateMod`.State,
    options: typingsJapgolly.tuyaPanelKit.`@reactNavigationCoreGetPathFromStateMod`.Options
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathFromState")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getStateFromPath(path: String): js.UndefOr[ResultState] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateFromPath")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ResultState]]
  inline def getStateFromPath(
    path: String,
    options: typingsJapgolly.tuyaPanelKit.`@reactNavigationCoreGetStateFromPathMod`.Options
  ): js.UndefOr[ResultState] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStateFromPath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ResultState]]
  
  inline def useBackButton(ref: RefHandle[NavigationContainerRef]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useBackButton")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useFocusEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useIsFocused(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsFocused")().asInstanceOf[Boolean]
  
  inline def useLinkBuilder(): js.Function2[/* name */ String, /* params */ js.UndefOr[js.Object], js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLinkBuilder")().asInstanceOf[js.Function2[/* name */ String, /* params */ js.UndefOr[js.Object], js.UndefOr[String]]]
  
  inline def useLinkProps(hasToAction: typingsJapgolly.tuyaPanelKit.`@reactNavigationNativeUseLinkPropsMod`.Props): AccessibilityRole = ^.asInstanceOf[js.Dynamic].applyDynamic("useLinkProps")(hasToAction.asInstanceOf[js.Any]).asInstanceOf[AccessibilityRole]
  
  inline def useLinkTo(): js.Function1[/* path */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLinkTo")().asInstanceOf[js.Function1[/* path */ String, Unit]]
  
  inline def useLinking(
    ref: RefHandle[NavigationContainerRef],
    hasEnabledConfigGetStateFromPathGetPathFromState: LinkingOptions
  ): GetInitialState = (^.asInstanceOf[js.Dynamic].applyDynamic("useLinking")(ref.asInstanceOf[js.Any], hasEnabledConfigGetStateFromPathGetPathFromState.asInstanceOf[js.Any])).asInstanceOf[GetInitialState]
  
  inline def useNavigation[T /* <: NavigationProp[ParamListBase, String, NavigationState[ParamListBase], js.Object, js.Object] */](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useNavigation")().asInstanceOf[T]
  
  inline def useNavigationBuilder[State /* <: NavigationState[ParamListBase] */, RouterOptions /* <: DefaultRouterOptions[String] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, ScreenOptions /* <: js.Object */, EventMap /* <: Record[String, Any] */](
    createRouter: RouterFactory[State, Any, RouterOptions],
    options: (DefaultNavigatorOptions[ScreenOptions, ParamListBase]) & RouterOptions
  ): Descriptors[State, EventMap, ActionHelpers, ScreenOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("useNavigationBuilder")(createRouter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Descriptors[State, EventMap, ActionHelpers, ScreenOptions]]
  
  inline def useNavigationState[T](selector: Selector[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useNavigationState")(selector.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def useRoute[T /* <: RouteProp[ParamListBase, String] */](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useRoute")().asInstanceOf[T]
  
  inline def useScrollToTop(ref: RefHandle[ScrollableWrapper]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useScrollToTop")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useTheme(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[Theme]
}
