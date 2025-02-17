package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetAccessor
  extends StObject
     with AST {
  
  var block: Block
  
  var modifiers: js.Array[PullElementFlags]
  
  var parameterList: ParameterList
  
  var propertyName: IASTToken
}
object SetAccessor {
  
  inline def apply(
    _astID: Any,
    _end: Double,
    _postComments: Any,
    _preComments: Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    block: Block,
    end: CallbackTo[Double],
    fileName: CallbackTo[String],
    isExpression: CallbackTo[Boolean],
    kind: CallbackTo[SyntaxKind],
    modifiers: js.Array[PullElementFlags],
    parameterList: ParameterList,
    parent: AST,
    postComments: CallbackTo[js.Array[Comment]],
    preComments: CallbackTo[js.Array[Comment]],
    propertyName: IASTToken,
    setPostComments: js.Array[Comment] => Callback,
    setPreComments: js.Array[Comment] => Callback,
    start: CallbackTo[Double],
    structuralEquals: (AST, Boolean) => Boolean,
    syntaxID: CallbackTo[Double],
    trailingTriviaWidth: CallbackTo[Double],
    width: CallbackTo[Double]
  ): SetAccessor = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], end = end.toJsFn, fileName = fileName.toJsFn, isExpression = isExpression.toJsFn, kind = kind.toJsFn, modifiers = modifiers.asInstanceOf[js.Any], parameterList = parameterList.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], postComments = postComments.toJsFn, preComments = preComments.toJsFn, propertyName = propertyName.asInstanceOf[js.Any], setPostComments = js.Any.fromFunction1((t0: js.Array[Comment]) => setPostComments(t0).runNow()), setPreComments = js.Any.fromFunction1((t0: js.Array[Comment]) => setPreComments(t0).runNow()), start = start.toJsFn, structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = syntaxID.toJsFn, trailingTriviaWidth = trailingTriviaWidth.toJsFn, width = width.toJsFn)
    __obj.asInstanceOf[SetAccessor]
  }
  
  extension [Self <: SetAccessor](x: Self) {
    
    inline def setBlock(value: Block): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setModifiers(value: js.Array[PullElementFlags]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersVarargs(value: PullElementFlags*): Self = StObject.set(x, "modifiers", js.Array(value*))
    
    inline def setParameterList(value: ParameterList): Self = StObject.set(x, "parameterList", value.asInstanceOf[js.Any])
    
    inline def setPropertyName(value: IASTToken): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
  }
}
