package typingsJapgolly.reactOverlays

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import typingsJapgolly.propTypes.mod.ReactNodeLike
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactOverlays.anon.Container
import typingsJapgolly.reactOverlays.anon.HandleContainerOverflow
import typingsJapgolly.reactOverlays.anon.PartialModalPropsRefAttri
import typingsJapgolly.reactOverlays.anon.WeakValidationMapModalPro
import typingsJapgolly.reactOverlays.esmDropdownMenuMod.DropdownMenuProps
import typingsJapgolly.reactOverlays.esmDropdownMenuMod.UseDropdownMenuMetadata
import typingsJapgolly.reactOverlays.esmDropdownMenuMod.UseDropdownMenuOptions
import typingsJapgolly.reactOverlays.esmDropdownMenuMod.UserDropdownMenuProps
import typingsJapgolly.reactOverlays.esmDropdownMod.DropdownProps
import typingsJapgolly.reactOverlays.esmDropdownToggleMod.DropdownToggleProps
import typingsJapgolly.reactOverlays.esmDropdownToggleMod.UseDropdownToggleMetadata
import typingsJapgolly.reactOverlays.esmDropdownToggleMod.UseDropdownToggleProps
import typingsJapgolly.reactOverlays.esmModalManagerMod.default
import typingsJapgolly.reactOverlays.esmModalMod.ModalHandle
import typingsJapgolly.reactOverlays.esmModalMod.ModalProps
import typingsJapgolly.reactOverlays.esmOverlayMod.OverlayProps
import typingsJapgolly.reactOverlays.esmPortalMod.PortalProps
import typingsJapgolly.reactOverlays.esmUseRootCloseMod.RootCloseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmMod {
  
  @JSImport("react-overlays/esm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Dropdown {
    
    /**
      * @displayName Dropdown
      * @public
      */
    inline def apply(
      hasDropAlignEndDefaultShowRawShowRawOnToggleItemSelectorFocusFirstItemOnShowChildren: DropdownProps
    ): Element = ^.asInstanceOf[js.Dynamic].apply(hasDropAlignEndDefaultShowRawShowRawOnToggleItemSelectorFocusFirstItemOnShowChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-overlays/esm", "Dropdown")
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof DropdownMenu` */
    object Menu {
      
      /**
        * Also exported as `<Dropdown.Menu>` from `Dropdown`.
        *
        * @displayName DropdownMenu
        * @memberOf Dropdown
        */
      inline def apply(hasChildrenOptions: DropdownMenuProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasChildrenOptions.asInstanceOf[js.Any]).asInstanceOf[Element]
      
      @JSImport("react-overlays/esm", "Dropdown.Menu")
      @js.native
      val ^ : js.Any = js.native
      
      object defaultProps {
        
        @JSImport("react-overlays/esm", "Dropdown.Menu.defaultProps")
        @js.native
        val ^ : js.Any = js.native
        
        @JSImport("react-overlays/esm", "Dropdown.Menu.defaultProps.usePopper")
        @js.native
        def usePopper: Boolean = js.native
        inline def usePopper_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("usePopper")(x.asInstanceOf[js.Any])
      }
      
      @JSImport("react-overlays/esm", "Dropdown.Menu.displayName")
      @js.native
      def displayName: String = js.native
      inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
      
      object propTypes {
        
        @JSImport("react-overlays/esm", "Dropdown.Menu.propTypes")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Aligns the dropdown menu to the 'end' of it's placement position.
          * Generally this is provided by the parent `Dropdown` component,
          * but may also be specified as a prop directly.
          */
        @JSImport("react-overlays/esm", "Dropdown.Menu.propTypes.alignEnd")
        @js.native
        def alignEnd: Requireable[Boolean] = js.native
        inline def alignEnd_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alignEnd")(x.asInstanceOf[js.Any])
        
        /**
          * A render prop that returns a Menu element. The `props`
          * argument should spread through to **a component that can accept a ref**.
          *
          * @type {Function ({
          *   show: boolean,
          *   alignEnd: boolean,
          *   close: (?SyntheticEvent) => void,
          *   placement: Placement,
          *   update: () => void,
          *   forceUpdate: () => void,
          *   props: {
          *     ref: (?HTMLElement) => void,
          *     style: { [string]: string | number },
          *     aria-labelledby: ?string
          *   },
          *   arrowProps: {
          *     ref: (?HTMLElement) => void,
          *     style: { [string]: string | number },
          *   },
          * }) => React.Element}
          */
        @JSImport("react-overlays/esm", "Dropdown.Menu.propTypes.children")
        @js.native
        def children: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
        inline def children_=(x: Validator[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
        
        /**
          * Enables the Popper.js `flip` modifier, allowing the Dropdown to
          * automatically adjust it's placement in case of overlap with the viewport or toggle.
          * Refer to the [flip docs](https://popper.js.org/popper-documentation.html#modifiers..flip.enabled) for more info
          */
        @JSImport("react-overlays/esm", "Dropdown.Menu.propTypes.flip")
        @js.native
        def flip: Requireable[Boolean] = js.native
        inline def flip_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flip")(x.asInstanceOf[js.Any])
        
        /**
          * A set of popper options and props passed directly to react-popper's Popper component.
          */
        @JSImport("react-overlays/esm", "Dropdown.Menu.propTypes.popperConfig")
        @js.native
        def popperConfig: Requireable[js.Object] = js.native
        inline def popperConfig_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popperConfig")(x.asInstanceOf[js.Any])
        
        /**
          * Override the default event used by RootCloseWrapper.
          */
        @JSImport("react-overlays/esm", "Dropdown.Menu.propTypes.rootCloseEvent")
        @js.native
        def rootCloseEvent: Requireable[String] = js.native
        inline def rootCloseEvent_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rootCloseEvent")(x.asInstanceOf[js.Any])
        
        /**
          * Controls the visible state of the menu, generally this is
          * provided by the parent `Dropdown` component,
          * but may also be specified as a prop directly.
          */
        @JSImport("react-overlays/esm", "Dropdown.Menu.propTypes.show")
        @js.native
        def show: Requireable[Boolean] = js.native
        inline def show_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("show")(x.asInstanceOf[js.Any])
        
        @JSImport("react-overlays/esm", "Dropdown.Menu.propTypes.usePopper")
        @js.native
        def usePopper: Requireable[Boolean] = js.native
        inline def usePopper_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("usePopper")(x.asInstanceOf[js.Any])
      }
    }
    
    /* was `typeof DropdownToggle` */
    object Toggle {
      
      /**
        * Also exported as `<Dropdown.Toggle>` from `Dropdown`.
        *
        * @displayName DropdownToggle
        * @memberOf Dropdown
        */
      inline def apply(hasChildren: DropdownToggleProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
      
      @JSImport("react-overlays/esm", "Dropdown.Toggle")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-overlays/esm", "Dropdown.Toggle.displayName")
      @js.native
      def displayName: String = js.native
      inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
      
      object propTypes {
        
        @JSImport("react-overlays/esm", "Dropdown.Toggle.propTypes")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * A render prop that returns a Toggle element. The `props`
          * argument should spread through to **a component that can accept a ref**. Use
          * the `onToggle` argument to toggle the menu open or closed
          *
          * @type {Function ({
          *   show: boolean,
          *   toggle: (show: boolean) => void,
          *   props: {
          *     ref: (?HTMLElement) => void,
          *     aria-haspopup: true
          *     aria-expanded: boolean
          *   },
          * }) => React.Element}
          */
        @JSImport("react-overlays/esm", "Dropdown.Toggle.propTypes.children")
        @js.native
        def children: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
        inline def children_=(x: Validator[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      }
    }
    
    @JSImport("react-overlays/esm", "Dropdown.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    object propTypes {
      
      @JSImport("react-overlays/esm", "Dropdown.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Align the menu to the 'end' side of the placement side of the Dropdown toggle. The default placement is `top-start` or `bottom-start`.
        */
      @JSImport("react-overlays/esm", "Dropdown.propTypes.alignEnd")
      @js.native
      def alignEnd: Requireable[Boolean] = js.native
      inline def alignEnd_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alignEnd")(x.asInstanceOf[js.Any])
      
      /**
        * A render prop that returns the root dropdown element. The `props`
        * argument should spread through to an element containing _both_ the
        * menu and toggle in order to handle keyboard events for focus management.
        *
        * @type {Function ({
        *   props: {
        *     onKeyDown: (SyntheticEvent) => void,
        *   },
        * }) => React.Element}
        */
      @JSImport("react-overlays/esm", "Dropdown.propTypes.children")
      @js.native
      def children: Requireable[ReactNodeLike] = js.native
      inline def children_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      /**
        * Sets the initial show position of the Dropdown.
        */
      @JSImport("react-overlays/esm", "Dropdown.propTypes.defaultShow")
      @js.native
      def defaultShow: Requireable[Boolean] = js.native
      inline def defaultShow_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultShow")(x.asInstanceOf[js.Any])
      
      /**
        * Determines the direction and location of the Menu in relation to it's Toggle.
        */
      @JSImport("react-overlays/esm", "Dropdown.propTypes.drop")
      @js.native
      def drop: Requireable[String] = js.native
      inline def drop_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("drop")(x.asInstanceOf[js.Any])
      
      /**
        * Controls the focus behavior for when the Dropdown is opened. Set to
        * `true` to always focus the first menu item, `keyboard` to focus only when
        * navigating via the keyboard, or `false` to disable completely
        *
        * The Default behavior is `false` **unless** the Menu has a `role="menu"`
        * where it will default to `keyboard` to match the recommended [ARIA Authoring practices](https://www.w3.org/TR/wai-aria-practices-1.1/#menubutton).
        */
      @JSImport("react-overlays/esm", "Dropdown.propTypes.focusFirstItemOnShow")
      @js.native
      def focusFirstItemOnShow: Requireable[String | Boolean] = js.native
      inline def focusFirstItemOnShow_=(x: Requireable[String | Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusFirstItemOnShow")(x.asInstanceOf[js.Any])
      
      /**
        * A css slector string that will return __focusable__ menu items.
        * Selectors should be relative to the menu component:
        * e.g. ` > li:not('.disabled')`
        */
      @JSImport("react-overlays/esm", "Dropdown.propTypes.itemSelector")
      @js.native
      def itemSelector: Requireable[String] = js.native
      inline def itemSelector_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("itemSelector")(x.asInstanceOf[js.Any])
      
      /**
        * A callback fired when the Dropdown wishes to change visibility. Called with the requested
        * `show` value, the DOM event, and the source that fired it: `'click'`,`'keydown'`,`'rootClose'`, or `'select'`.
        *
        * ```ts static
        * function(
        *   isOpen: boolean,
        *   event: SyntheticEvent,
        * ): void
        * ```
        *
        * @controllable show
        */
      @JSImport("react-overlays/esm", "Dropdown.propTypes.onToggle")
      @js.native
      def onToggle: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onToggle_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onToggle")(x.asInstanceOf[js.Any])
      
      /**
        * Whether or not the Dropdown is visible.
        *
        * @controllable onToggle
        */
      @JSImport("react-overlays/esm", "Dropdown.propTypes.show")
      @js.native
      def show: Requireable[Boolean] = js.native
      inline def show_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("show")(x.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react.react.ForwardRefExoticComponent<react-overlays.react-overlays/esm/Modal.ModalProps & react.react.RefAttributes<react-overlays.react-overlays/esm/Modal.ModalHandle>> & {  Manager :new (hasHideSiblingNodesHandleContainerOverflow : {  hideSiblingNodes :boolean | undefined,   handleContainerOverflow :boolean | undefined} | undefined): react-overlays.react-overlays/esm/ModalManager.default} */
  object Modal {
    
    /**
      * **NOTE**: Exotic components are not callable.
      */
    inline def apply(props: ModalProps & RefAttributes[ModalHandle]): japgolly.scalajs.react.facade.React.Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[japgolly.scalajs.react.facade.React.Element | Null]
    
    @JSImport("react-overlays/esm", "Modal")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-overlays/esm", "Modal.Manager")
    @js.native
    open class Manager () extends default {
      def this(hasHideSiblingNodesHandleContainerOverflow: HandleContainerOverflow) = this()
    }
    @JSImport("react-overlays/esm", "Modal.Manager")
    @js.native
    def Manager: Instantiable1[
        /* hasHideSiblingNodesHandleContainerOverflow */ js.UndefOr[HandleContainerOverflow], 
        default
      ] = js.native
    inline def Manager_=(
      x: Instantiable1[
          /* hasHideSiblingNodesHandleContainerOverflow */ js.UndefOr[HandleContainerOverflow], 
          default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Manager")(x.asInstanceOf[js.Any])
    
    @JSImport("react-overlays/esm", "Modal.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialModalPropsRefAttri] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialModalPropsRefAttri]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-overlays/esm", "Modal.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-overlays/esm", "Modal.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapModalPro] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapModalPro]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("react-overlays/esm", "Modal.$$typeof")
    @js.native
    val typeof: js.Symbol = js.native
  }
  
  /**
    * Built on top of `Popper.js`, the overlay component is
    * great for custom tooltip overlays.
    */
  @JSImport("react-overlays/esm", "Overlay")
  @js.native
  val Overlay: ForwardRefExoticComponent[OverlayProps & RefAttributes[HTMLElement]] = js.native
  
  /**
    * @public
    */
  object Portal {
    
    inline def apply(hasContainerChildrenOnRendered: PortalProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(hasContainerChildrenOnRendered.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    
    @JSImport("react-overlays/esm", "Portal")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-overlays/esm", "Portal.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-overlays/esm", "Portal.propTypes")
    @js.native
    def propTypes: Container = js.native
    inline def propTypes_=(x: Container): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  inline def useDropdownMenu(): js.Tuple2[UserDropdownMenuProps, UseDropdownMenuMetadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropdownMenu")().asInstanceOf[js.Tuple2[UserDropdownMenuProps, UseDropdownMenuMetadata]]
  inline def useDropdownMenu(options: UseDropdownMenuOptions): js.Tuple2[UserDropdownMenuProps, UseDropdownMenuMetadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropdownMenu")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[UserDropdownMenuProps, UseDropdownMenuMetadata]]
  
  inline def useDropdownToggle(): js.Tuple2[UseDropdownToggleProps, UseDropdownToggleMetadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropdownToggle")().asInstanceOf[js.Tuple2[UseDropdownToggleProps, UseDropdownToggleMetadata]]
  
  /**
    * The `useRootClose` hook registers your callback on the document
    * when rendered. Powers the `<Overlay/>` component. This is used achieve modal
    * style behavior where your callback is triggered when the user tries to
    * interact with the rest of the document or hits the `esc` key.
    *
    * @param {Ref<HTMLElement>| HTMLElement} ref  The element boundary
    * @param {function} onRootClose
    * @param {object=}  options
    * @param {boolean=} options.disabled
    * @param {string=}  options.clickTrigger The DOM event name (click, mousedown, etc) to attach listeners on
    */
  inline def useRootClose(ref: RefHandle[org.scalajs.dom.Element], onRootClose: js.Function1[/* e */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useRootClose")(ref.asInstanceOf[js.Any], onRootClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useRootClose(
    ref: RefHandle[org.scalajs.dom.Element],
    onRootClose: js.Function1[/* e */ Event, Unit],
    hasDisabledClickTrigger: RootCloseOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useRootClose")(ref.asInstanceOf[js.Any], onRootClose.asInstanceOf[js.Any], hasDisabledClickTrigger.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useRootClose(ref: org.scalajs.dom.Element, onRootClose: js.Function1[/* e */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useRootClose")(ref.asInstanceOf[js.Any], onRootClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useRootClose(
    ref: org.scalajs.dom.Element,
    onRootClose: js.Function1[/* e */ Event, Unit],
    hasDisabledClickTrigger: RootCloseOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useRootClose")(ref.asInstanceOf[js.Any], onRootClose.asInstanceOf[js.Any], hasDisabledClickTrigger.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useRootClose(ref: Null, onRootClose: js.Function1[/* e */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useRootClose")(ref.asInstanceOf[js.Any], onRootClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useRootClose(
    ref: Null,
    onRootClose: js.Function1[/* e */ Event, Unit],
    hasDisabledClickTrigger: RootCloseOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useRootClose")(ref.asInstanceOf[js.Any], onRootClose.asInstanceOf[js.Any], hasDisabledClickTrigger.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useRootClose(ref: Unit, onRootClose: js.Function1[/* e */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useRootClose")(ref.asInstanceOf[js.Any], onRootClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useRootClose(
    ref: Unit,
    onRootClose: js.Function1[/* e */ Event, Unit],
    hasDisabledClickTrigger: RootCloseOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useRootClose")(ref.asInstanceOf[js.Any], onRootClose.asInstanceOf[js.Any], hasDisabledClickTrigger.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
