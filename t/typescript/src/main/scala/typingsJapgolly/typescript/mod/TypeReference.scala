package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeReference
  extends StObject
     with ObjectType {
  
  var node: js.UndefOr[TypeReferenceNode | ArrayTypeNode | TupleTypeNode] = js.undefined
  
  var target: GenericType
  
  var typeArguments: js.UndefOr[js.Array[Type]] = js.undefined
}
object TypeReference {
  
  inline def apply(
    flags: TypeFlags,
    getApparentProperties: CallbackTo[js.Array[Symbol]],
    getBaseTypes: CallbackTo[js.UndefOr[js.Array[BaseType]]],
    getCallSignatures: CallbackTo[js.Array[Signature]],
    getConstraint: CallbackTo[js.UndefOr[Type]],
    getConstructSignatures: CallbackTo[js.Array[Signature]],
    getDefault: CallbackTo[js.UndefOr[Type]],
    getFlags: CallbackTo[TypeFlags],
    getNonNullableType: CallbackTo[Type],
    getNumberIndexType: CallbackTo[js.UndefOr[Type]],
    getProperties: CallbackTo[js.Array[Symbol]],
    getProperty: java.lang.String => js.UndefOr[Symbol],
    getStringIndexType: CallbackTo[js.UndefOr[Type]],
    getSymbol: CallbackTo[js.UndefOr[Symbol]],
    isClass: CallbackTo[/* is typescript.typescript.InterfaceType */ Boolean],
    isClassOrInterface: CallbackTo[/* is typescript.typescript.InterfaceType */ Boolean],
    isIndexType: CallbackTo[/* is typescript.typescript.IndexType */ Boolean],
    isIntersection: CallbackTo[/* is typescript.typescript.IntersectionType */ Boolean],
    isLiteral: CallbackTo[/* is typescript.typescript.LiteralType */ Boolean],
    isNumberLiteral: CallbackTo[/* is typescript.typescript.NumberLiteralType */ Boolean],
    isStringLiteral: CallbackTo[/* is typescript.typescript.StringLiteralType */ Boolean],
    isTypeParameter: CallbackTo[/* is typescript.typescript.TypeParameter */ Boolean],
    isUnion: CallbackTo[/* is typescript.typescript.UnionType */ Boolean],
    isUnionOrIntersection: CallbackTo[/* is typescript.typescript.UnionOrIntersectionType */ Boolean],
    objectFlags: ObjectFlags,
    symbol: Symbol,
    target: GenericType
  ): TypeReference = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], getApparentProperties = getApparentProperties.toJsFn, getBaseTypes = getBaseTypes.toJsFn, getCallSignatures = getCallSignatures.toJsFn, getConstraint = getConstraint.toJsFn, getConstructSignatures = getConstructSignatures.toJsFn, getDefault = getDefault.toJsFn, getFlags = getFlags.toJsFn, getNonNullableType = getNonNullableType.toJsFn, getNumberIndexType = getNumberIndexType.toJsFn, getProperties = getProperties.toJsFn, getProperty = js.Any.fromFunction1(getProperty), getStringIndexType = getStringIndexType.toJsFn, getSymbol = getSymbol.toJsFn, isClass = isClass.toJsFn, isClassOrInterface = isClassOrInterface.toJsFn, isIndexType = isIndexType.toJsFn, isIntersection = isIntersection.toJsFn, isLiteral = isLiteral.toJsFn, isNumberLiteral = isNumberLiteral.toJsFn, isStringLiteral = isStringLiteral.toJsFn, isTypeParameter = isTypeParameter.toJsFn, isUnion = isUnion.toJsFn, isUnionOrIntersection = isUnionOrIntersection.toJsFn, objectFlags = objectFlags.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeReference]
  }
  
  extension [Self <: TypeReference](x: Self) {
    
    inline def setNode(value: TypeReferenceNode | ArrayTypeNode | TupleTypeNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setTarget(value: GenericType): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTypeArguments(value: js.Array[Type]): Self = StObject.set(x, "typeArguments", value.asInstanceOf[js.Any])
    
    inline def setTypeArgumentsUndefined: Self = StObject.set(x, "typeArguments", js.undefined)
    
    inline def setTypeArgumentsVarargs(value: Type*): Self = StObject.set(x, "typeArguments", js.Array(value*))
  }
}
