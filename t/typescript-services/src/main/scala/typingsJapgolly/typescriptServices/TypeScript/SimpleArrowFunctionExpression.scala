package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleArrowFunctionExpression
  extends StObject
     with AST {
  
  var block: Block
  
  var expression: AST
  
  var identifier: Identifier
}
object SimpleArrowFunctionExpression {
  
  inline def apply(
    _astID: Any,
    _end: Double,
    _postComments: Any,
    _preComments: Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    block: Block,
    end: CallbackTo[Double],
    expression: AST,
    fileName: CallbackTo[String],
    identifier: Identifier,
    isExpression: CallbackTo[Boolean],
    kind: CallbackTo[SyntaxKind],
    parent: AST,
    postComments: CallbackTo[js.Array[Comment]],
    preComments: CallbackTo[js.Array[Comment]],
    setPostComments: js.Array[Comment] => Callback,
    setPreComments: js.Array[Comment] => Callback,
    start: CallbackTo[Double],
    structuralEquals: (AST, Boolean) => Boolean,
    syntaxID: CallbackTo[Double],
    trailingTriviaWidth: CallbackTo[Double],
    width: CallbackTo[Double]
  ): SimpleArrowFunctionExpression = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], end = end.toJsFn, expression = expression.asInstanceOf[js.Any], fileName = fileName.toJsFn, identifier = identifier.asInstanceOf[js.Any], isExpression = isExpression.toJsFn, kind = kind.toJsFn, parent = parent.asInstanceOf[js.Any], postComments = postComments.toJsFn, preComments = preComments.toJsFn, setPostComments = js.Any.fromFunction1((t0: js.Array[Comment]) => setPostComments(t0).runNow()), setPreComments = js.Any.fromFunction1((t0: js.Array[Comment]) => setPreComments(t0).runNow()), start = start.toJsFn, structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = syntaxID.toJsFn, trailingTriviaWidth = trailingTriviaWidth.toJsFn, width = width.toJsFn)
    __obj.asInstanceOf[SimpleArrowFunctionExpression]
  }
  
  extension [Self <: SimpleArrowFunctionExpression](x: Self) {
    
    inline def setBlock(value: Block): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setExpression(value: AST): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
  }
}
