package typingsJapgolly.reactBootstrap

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.reactBootstrap.mod.Sizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModalDialogMod {
  
  @JSImport("react-bootstrap/lib/ModalDialog", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[ModalDialogProps, js.Object, Any]
  
  type ModalDialog = japgolly.scalajs.react.facade.React.Component[ModalDialogProps & js.Object, js.Object]
  
  trait ModalDialogProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[ModalDialogProps & js.Object, js.Object]
        ] {
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var bsSize: js.UndefOr[Sizes] = js.undefined
    
    var onEnter: js.UndefOr[js.Function] = js.undefined
    
    var onEntered: js.UndefOr[js.Function] = js.undefined
    
    var onEntering: js.UndefOr[js.Function] = js.undefined
    
    var onExit: js.UndefOr[js.Function] = js.undefined
    
    var onExited: js.UndefOr[js.Function] = js.undefined
    
    var onExiting: js.UndefOr[js.Function] = js.undefined
    
    // TODO: these props are not correct https://github.com/react-bootstrap/react-bootstrap/blob/v0.31.1/src/ModalDialog.js#L9
    var onHide: js.UndefOr[js.Function] = js.undefined
  }
  object ModalDialogProps {
    
    inline def apply(): ModalDialogProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalDialogProps]
    }
    
    extension [Self <: ModalDialogProps](x: Self) {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      inline def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      inline def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      inline def setOnEnter(value: js.Function): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
      
      inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      inline def setOnEntered(value: js.Function): Self = StObject.set(x, "onEntered", value.asInstanceOf[js.Any])
      
      inline def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
      
      inline def setOnEntering(value: js.Function): Self = StObject.set(x, "onEntering", value.asInstanceOf[js.Any])
      
      inline def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
      
      inline def setOnExit(value: js.Function): Self = StObject.set(x, "onExit", value.asInstanceOf[js.Any])
      
      inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      inline def setOnExited(value: js.Function): Self = StObject.set(x, "onExited", value.asInstanceOf[js.Any])
      
      inline def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
      
      inline def setOnExiting(value: js.Function): Self = StObject.set(x, "onExiting", value.asInstanceOf[js.Any])
      
      inline def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
      
      inline def setOnHide(value: js.Function): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    }
  }
}
