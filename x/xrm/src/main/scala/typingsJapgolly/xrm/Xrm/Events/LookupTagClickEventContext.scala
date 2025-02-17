package typingsJapgolly.xrm.Xrm.Events

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xrm.Xrm.Controls.Control
import typingsJapgolly.xrm.Xrm.Entity
import typingsJapgolly.xrm.Xrm.FormContext
import typingsJapgolly.xrm.Xrm.GlobalContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookupTagClickEventContext
  extends StObject
     with EventContext {
  
  /**
    * Gets an object that contains details about the lookup tag clicked
    */
  def getEventArgs(): LookupTagClickEventArguments
}
object LookupTagClickEventContext {
  
  inline def apply(
    getContext: CallbackTo[GlobalContext],
    getDepth: CallbackTo[Double],
    getEventArgs: CallbackTo[LookupTagClickEventArguments],
    getEventSource: CallbackTo[typingsJapgolly.xrm.Xrm.Attributes.Attribute[Any] | Control | Entity],
    getFormContext: CallbackTo[FormContext],
    getSharedVariable: String => Any,
    setSharedVariable: (String, Any) => Callback
  ): LookupTagClickEventContext = {
    val __obj = js.Dynamic.literal(getContext = getContext.toJsFn, getDepth = getDepth.toJsFn, getEventArgs = getEventArgs.toJsFn, getEventSource = getEventSource.toJsFn, getFormContext = getFormContext.toJsFn, getSharedVariable = js.Any.fromFunction1(getSharedVariable), setSharedVariable = js.Any.fromFunction2((t0: String, t1: Any) => (setSharedVariable(t0, t1)).runNow()))
    __obj.asInstanceOf[LookupTagClickEventContext]
  }
  
  extension [Self <: LookupTagClickEventContext](x: Self) {
    
    inline def setGetEventArgs(value: CallbackTo[LookupTagClickEventArguments]): Self = StObject.set(x, "getEventArgs", value.toJsFn)
  }
}
