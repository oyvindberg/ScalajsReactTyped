package typingsJapgolly.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionTypeSyntax
  extends StObject
     with SyntaxNode {
  
  var equalsGreaterThanToken: ISyntaxToken = js.native
  
  def isType(): Boolean = js.native
  
  var parameterList: ParameterListSyntax = js.native
  
  var `type`: ITypeSyntax = js.native
  
  var typeParameterList: TypeParameterListSyntax = js.native
  
  def update(
    typeParameterList: TypeParameterListSyntax,
    parameterList: ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax
  ): FunctionTypeSyntax = js.native
  
  def withEqualsGreaterThanToken(equalsGreaterThanToken: ISyntaxToken): FunctionTypeSyntax = js.native
  
  def withParameterList(parameterList: ParameterListSyntax): FunctionTypeSyntax = js.native
  
  def withType(`type`: ITypeSyntax): FunctionTypeSyntax = js.native
  
  def withTypeParameterList(typeParameterList: TypeParameterListSyntax): FunctionTypeSyntax = js.native
}
