package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectType
  extends StObject
     with AST {
  
  def structuralEquals(ast: ObjectType, includingPosition: Boolean): Boolean
  
  var typeMembers: ISeparatedSyntaxList2
}
object ObjectType {
  
  inline def apply(
    _astID: Any,
    _end: Double,
    _postComments: Any,
    _preComments: Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    end: CallbackTo[Double],
    fileName: CallbackTo[String],
    isExpression: CallbackTo[Boolean],
    kind: CallbackTo[SyntaxKind],
    parent: AST,
    postComments: CallbackTo[js.Array[Comment]],
    preComments: CallbackTo[js.Array[Comment]],
    setPostComments: js.Array[Comment] => Callback,
    setPreComments: js.Array[Comment] => Callback,
    start: CallbackTo[Double],
    structuralEquals: (ObjectType, Boolean) => Boolean,
    syntaxID: CallbackTo[Double],
    trailingTriviaWidth: CallbackTo[Double],
    typeMembers: ISeparatedSyntaxList2,
    width: CallbackTo[Double]
  ): ObjectType = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], end = end.toJsFn, fileName = fileName.toJsFn, isExpression = isExpression.toJsFn, kind = kind.toJsFn, parent = parent.asInstanceOf[js.Any], postComments = postComments.toJsFn, preComments = preComments.toJsFn, setPostComments = js.Any.fromFunction1((t0: js.Array[Comment]) => setPostComments(t0).runNow()), setPreComments = js.Any.fromFunction1((t0: js.Array[Comment]) => setPreComments(t0).runNow()), start = start.toJsFn, structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = syntaxID.toJsFn, trailingTriviaWidth = trailingTriviaWidth.toJsFn, typeMembers = typeMembers.asInstanceOf[js.Any], width = width.toJsFn)
    __obj.asInstanceOf[ObjectType]
  }
  
  extension [Self <: ObjectType](x: Self) {
    
    inline def setStructuralEquals(value: (ObjectType, Boolean) => Boolean): Self = StObject.set(x, "structuralEquals", js.Any.fromFunction2(value))
    
    inline def setTypeMembers(value: ISeparatedSyntaxList2): Self = StObject.set(x, "typeMembers", value.asInstanceOf[js.Any])
  }
}
