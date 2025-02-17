package typingsJapgolly.raml1Parser.distParserArtifactsRaml08parserapiMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IAttribute
import typingsJapgolly.raml1Parser.distParserWrappedAstParserCoreApiMod.AttributeNode
import typingsJapgolly.raml1Parser.distParserWrappedAstParserCoreApiMod.BasicNode
import typingsJapgolly.raml1Parser.distParserWrappedAstParserCoreApiMod.ValueMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueType
  extends StObject
     with AttributeNode {
  
  /**
    * @return JS representation of the node value
    **/
  def value(): Any
}
object ValueType {
  
  inline def apply(
    RAMLVersion: CallbackTo[String],
    highLevel: CallbackTo[IAttribute],
    kind: CallbackTo[String],
    meta: CallbackTo[ValueMetadata],
    optional: CallbackTo[Boolean],
    parent: CallbackTo[BasicNode],
    toJSON: CallbackTo[Any],
    value: CallbackTo[Any],
    wrapperClassName: CallbackTo[String]
  ): ValueType = {
    val __obj = js.Dynamic.literal(RAMLVersion = RAMLVersion.toJsFn, highLevel = highLevel.toJsFn, kind = kind.toJsFn, meta = meta.toJsFn, optional = optional.toJsFn, parent = parent.toJsFn, toJSON = toJSON.toJsFn, value = value.toJsFn, wrapperClassName = wrapperClassName.toJsFn)
    __obj.asInstanceOf[ValueType]
  }
  
  extension [Self <: ValueType](x: Self) {
    
    inline def setValue(value: CallbackTo[Any]): Self = StObject.set(x, "value", value.toJsFn)
  }
}
