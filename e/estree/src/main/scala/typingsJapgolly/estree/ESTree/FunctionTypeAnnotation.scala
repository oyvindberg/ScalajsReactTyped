package typingsJapgolly.estree.ESTree

import typingsJapgolly.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionTypeAnnotation
  extends StObject
     with Node {
  
  var params: js.Array[FunctionTypeParam] = js.native
  
  var rest: js.UndefOr[FunctionTypeParam | Null] = js.native
  
  var returnType: org.scalajs.dom.Node = js.native
  
  var typeParameters: js.UndefOr[TypeParameterDeclaration | Null] = js.native
}
