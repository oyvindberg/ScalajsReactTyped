package typingsJapgolly.stylus.mod.Stylus.Nodes

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.stylus.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Return
  extends StObject
     with Node {
  
  var expr: Expression
}
object Return {
  
  inline def apply(
    coerce: Node => Node,
    column: Double,
    eval: CallbackTo[Node],
    expr: Expression,
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    lineno: Double,
    nodeName: java.lang.String,
    operate: (java.lang.String, Node) => Node,
    shouldCoerce: java.lang.String => scala.Boolean,
    toBoolean: CallbackTo[Boolean],
    toExpression: CallbackTo[Expression],
    toJSON: CallbackTo[Column]
  ): Return = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce), column = column.asInstanceOf[js.Any], eval = eval.toJsFn, expr = expr.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], operate = js.Any.fromFunction2(operate), shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBoolean = toBoolean.toJsFn, toExpression = toExpression.toJsFn, toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[Return]
  }
  
  extension [Self <: Return](x: Self) {
    
    inline def setExpr(value: Expression): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
  }
}
