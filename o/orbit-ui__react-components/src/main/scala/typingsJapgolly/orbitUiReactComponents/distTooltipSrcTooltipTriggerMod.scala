package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`auto-end`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`auto-start`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`bottom-end`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`bottom-start`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`left-end`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`left-start`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`right-end`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`right-start`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`top-end`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`top-start`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.auto
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.bottom
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.left
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.right
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.top
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ForwardedRef
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTooltipSrcTooltipTriggerMod {
  
  @JSImport("@orbit-ui/react-components/dist/tooltip/src/TooltipTrigger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerTooltipTrigger(
    hasOpenDefaultOpenPositionPropOnOpenChangeDisabledAllowFlipAllowPreventOverflowContainerElementZIndexAsChildrenForwardedRefRest: InnerTooltipTriggerProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTooltipTrigger")(hasOpenDefaultOpenPositionPropOnOpenChangeDisabledAllowFlipAllowPreventOverflowContainerElementZIndexAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/tooltip/src/TooltipTrigger", "TooltipTrigger")
  @js.native
  val TooltipTrigger: OrbitComponent[HTMLElement, InnerTooltipTriggerProps] = js.native
  
  inline def parseTooltipTrigger(children: Node): js.Tuple2[
    japgolly.scalajs.react.facade.React.Element, 
    japgolly.scalajs.react.facade.React.Element
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTooltipTrigger")(children.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    japgolly.scalajs.react.facade.React.Element, 
    japgolly.scalajs.react.facade.React.Element
  ]]
  
  trait InnerTooltipTriggerProps extends StObject {
    
    /**
      * Whether or not the tooltip element can flip when it will overflow it's boundary area.
      */
    var allowFlip: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not the tooltip element position can change to prevent it from being cut off so that it stays visible within its boundary area.
      */
    var allowPreventOverflow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType] = js.undefined
    
    /**
      * React children.
      */
    var children: Node
    
    /**
      * @ignore
      */
    var containerElement: js.UndefOr[HTMLElement] = js.undefined
    
    /**
      * The initial value of `open` when in auto controlled mode.
      */
    var defaultOpen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not the tooltip should be disabled, independent from the trigger.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * Called when the open state change.
      * @param {SyntheticEvent} event - React's original event.
      * @param {boolean} isOpen - Indicate if the tooltip is visible.
      * @returns {void}
      */
    var onOpenChange: js.UndefOr[
        js.Function2[/* event */ ReactEventFrom[org.scalajs.dom.Element], /* isOpen */ Boolean, Unit]
      ] = js.undefined
    
    /**
      * Whether or not to show the tooltip.
      */
    var open: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * Position of the tooltip element related to the trigger.
      */
    var position: js.UndefOr[
        auto | `auto-start` | `auto-end` | top | `top-start` | `top-end` | bottom | `bottom-start` | `bottom-end` | right | `right-start` | `right-end` | left | `left-start` | `left-end`
      ] = js.undefined
    
    /**
      * The z-index of the popover element.
      */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object InnerTooltipTriggerProps {
    
    inline def apply(): InnerTooltipTriggerProps = {
      val __obj = js.Dynamic.literal(children = null, forwardedRef = null)
      __obj.asInstanceOf[InnerTooltipTriggerProps]
    }
    
    extension [Self <: InnerTooltipTriggerProps](x: Self) {
      
      inline def setAllowFlip(value: Boolean): Self = StObject.set(x, "allowFlip", value.asInstanceOf[js.Any])
      
      inline def setAllowFlipUndefined: Self = StObject.set(x, "allowFlip", js.undefined)
      
      inline def setAllowPreventOverflow(value: Boolean): Self = StObject.set(x, "allowPreventOverflow", value.asInstanceOf[js.Any])
      
      inline def setAllowPreventOverflowUndefined: Self = StObject.set(x, "allowPreventOverflow", js.undefined)
      
      inline def setAs(value: ElementType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContainerElement(value: HTMLElement): Self = StObject.set(x, "containerElement", value.asInstanceOf[js.Any])
      
      inline def setContainerElementUndefined: Self = StObject.set(x, "containerElement", js.undefined)
      
      inline def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Callback): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setOnOpenChange(value: (/* event */ ReactEventFrom[org.scalajs.dom.Element], /* isOpen */ Boolean) => Callback): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[org.scalajs.dom.Element], t1: /* isOpen */ Boolean) => (value(t0, t1)).runNow()))
      
      inline def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenNull: Self = StObject.set(x, "open", null)
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPosition(
        value: auto | `auto-start` | `auto-end` | top | `top-start` | `top-end` | bottom | `bottom-start` | `bottom-end` | right | `right-start` | `right-end` | left | `left-start` | `left-end`
      ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type TooltipTriggerProps = ComponentProps[OrbitComponent[HTMLElement, InnerTooltipTriggerProps]]
}
