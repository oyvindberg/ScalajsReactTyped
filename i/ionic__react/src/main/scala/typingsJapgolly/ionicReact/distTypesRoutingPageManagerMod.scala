package typingsJapgolly.ionicReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefFn
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.ionicReact.distTypesContextsIonLifeCycleContextMod.IonLifeCycleContextInterface
import typingsJapgolly.ionicReact.distTypesModelsRouteInfoMod.RouteInfo
import typingsJapgolly.ionicReact.distTypesRoutingStackContextMod.StackContextState
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.ContextType
import typingsJapgolly.react.mod.ForwardedRef
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRoutingPageManagerMod {
  
  @JSImport("@ionic/react/dist/types/routing/PageManager", JSImport.Default)
  @js.native
  open class default protected () extends PageManager {
    def this(props: PageManagerProps) = this()
  }
  
  @JSImport("@ionic/react/dist/types/routing/PageManager", "PageManager")
  @js.native
  open class PageManager protected ()
    extends PureComponent[PageManagerProps, js.Object, Any] {
    def this(props: PageManagerProps) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MPageManager(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPageManager(): Unit = js.native
    
    @JSName("context")
    var context_PageManager: ContextType[Context[StackContextState]] = js.native
    
    var ionLifeCycleContext: ContextType[Context[IonLifeCycleContextInterface]] = js.native
    
    var ionPageElementRef: RefHandle[HTMLDivElement] = js.native
    
    def ionViewDidEnterHandler(): Unit = js.native
    
    def ionViewDidLeaveHandler(): Unit = js.native
    
    def ionViewWillEnterHandler(): Unit = js.native
    
    def ionViewWillLeaveHandler(): Unit = js.native
    
    var stableMergedRefs: RefFn[HTMLDivElement] = js.native
  }
  
  trait PageManagerProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var forwardedRef: js.UndefOr[ForwardedRef[HTMLDivElement]] = js.undefined
    
    var routeInfo: js.UndefOr[RouteInfo[Any]] = js.undefined
  }
  object PageManagerProps {
    
    inline def apply(): PageManagerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageManagerProps]
    }
    
    extension [Self <: PageManagerProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[HTMLDivElement]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ HTMLDivElement | Null => Callback): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1((t0: /* instance */ HTMLDivElement | Null) => value(t0).runNow()))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setForwardedRefUndefined: Self = StObject.set(x, "forwardedRef", js.undefined)
      
      inline def setRouteInfo(value: RouteInfo[Any]): Self = StObject.set(x, "routeInfo", value.asInstanceOf[js.Any])
      
      inline def setRouteInfoUndefined: Self = StObject.set(x, "routeInfo", js.undefined)
    }
  }
}
