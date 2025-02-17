package typingsJapgolly.materialRipple

import org.scalajs.dom.DOMRect
import org.scalajs.dom.EventTarget
import typingsJapgolly.materialBase.typesMod.EventType
import typingsJapgolly.materialBase.typesMod.SpecificEventListener
import typingsJapgolly.materialRipple.materialRippleStrings.resize
import typingsJapgolly.materialRipple.typesMod.MDCRipplePoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  @js.native
  trait MDCRippleAdapter extends StObject {
    
    def addClass(className: String): Unit = js.native
    
    def browserSupportsCssVars(): Boolean = js.native
    
    def computeBoundingRect(): DOMRect = js.native
    
    def containsEventTarget(): Boolean = js.native
    def containsEventTarget(target: EventTarget): Boolean = js.native
    
    def deregisterDocumentInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
    
    def deregisterInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
    
    @JSName("deregisterResizeHandler")
    def deregisterResizeHandler_resize(handler: SpecificEventListener[resize]): Unit = js.native
    
    def getWindowPageOffset(): MDCRipplePoint = js.native
    
    def isSurfaceActive(): Boolean = js.native
    
    def isSurfaceDisabled(): Boolean = js.native
    
    def isUnbounded(): Boolean = js.native
    
    def registerDocumentInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
    
    def registerInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
    
    @JSName("registerResizeHandler")
    def registerResizeHandler_resize(handler: SpecificEventListener[resize]): Unit = js.native
    
    def removeClass(className: String): Unit = js.native
    
    def updateCssVariable(varName: String): Unit = js.native
    def updateCssVariable(varName: String, value: String): Unit = js.native
  }
}
