package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelTypes.mod.Node
import typingsJapgolly.babelWalk.babelWalkStrings.FlowPredicate
import typingsJapgolly.babelWalk.libMod.AncestorFunction
import typingsJapgolly.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `138`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[FlowPredicate, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[FlowPredicate, TState]] = js.undefined
}
object `138` {
  
  inline def apply[TState](): `138`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`138`[TState]]
  }
  
  extension [Self <: `138`[?], TState](x: Self & `138`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[FlowPredicate], TState, /* ancestors */ js.Array[Node]) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction3((t0: /* node */ NodeType[FlowPredicate], t1: TState, t2: /* ancestors */ js.Array[Node]) => (value(t0, t1, t2)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[FlowPredicate], TState, /* ancestors */ js.Array[Node]) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction3((t0: /* node */ NodeType[FlowPredicate], t1: TState, t2: /* ancestors */ js.Array[Node]) => (value(t0, t1, t2)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
