package typingsJapgolly.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockSyntax
  extends StObject
     with SyntaxNode
     with IStatementSyntax {
  
  var closeBraceToken: ISyntaxToken = js.native
  
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  
  var openBraceToken: ISyntaxToken = js.native
  
  var statements: ISyntaxList = js.native
  
  def update(openBraceToken: ISyntaxToken, statements: ISyntaxList, closeBraceToken: ISyntaxToken): BlockSyntax = js.native
  
  def withCloseBraceToken(closeBraceToken: ISyntaxToken): BlockSyntax = js.native
  
  def withOpenBraceToken(openBraceToken: ISyntaxToken): BlockSyntax = js.native
  
  def withStatement(statement: IStatementSyntax): BlockSyntax = js.native
  
  def withStatements(statements: ISyntaxList): BlockSyntax = js.native
}
