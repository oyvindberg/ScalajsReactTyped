package typingsJapgolly.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Parameter")
@js.native
open class Parameter protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.Parameter {
  def this(
    dotDotDotToken: typingsJapgolly.typescriptServices.TypeScript.ASTSpan,
    modifiers: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullElementFlags],
    identifier: typingsJapgolly.typescriptServices.TypeScript.Identifier,
    questionToken: typingsJapgolly.typescriptServices.TypeScript.ASTSpan,
    typeAnnotation: typingsJapgolly.typescriptServices.TypeScript.TypeAnnotation,
    equalsValueClause: typingsJapgolly.typescriptServices.TypeScript.EqualsValueClause
  ) = this()
  
  /* private */ /* CompleteClass */
  var _astID: Any = js.native
  
  /* CompleteClass */
  var _end: Double = js.native
  
  /* private */ /* CompleteClass */
  var _postComments: Any = js.native
  
  /* private */ /* CompleteClass */
  var _preComments: Any = js.native
  
  /* CompleteClass */
  var _start: Double = js.native
  
  /* CompleteClass */
  var _trailingTriviaWidth: Double = js.native
  
  /* CompleteClass */
  var dotDotDotToken: typingsJapgolly.typescriptServices.TypeScript.ASTSpan = js.native
  
  /* CompleteClass */
  override def end(): Double = js.native
  
  /* CompleteClass */
  var equalsValueClause: typingsJapgolly.typescriptServices.TypeScript.EqualsValueClause = js.native
  
  /* CompleteClass */
  override def fileName(): String = js.native
  
  /* CompleteClass */
  var identifier: typingsJapgolly.typescriptServices.TypeScript.Identifier = js.native
  
  /* CompleteClass */
  override def isExpression(): Boolean = js.native
  
  /* CompleteClass */
  override def kind(): typingsJapgolly.typescriptServices.TypeScript.SyntaxKind = js.native
  
  /* CompleteClass */
  var modifiers: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullElementFlags] = js.native
  
  /* CompleteClass */
  var parent: typingsJapgolly.typescriptServices.TypeScript.AST = js.native
  
  /* CompleteClass */
  override def postComments(): js.Array[typingsJapgolly.typescriptServices.TypeScript.Comment] = js.native
  
  /* CompleteClass */
  override def preComments(): js.Array[typingsJapgolly.typescriptServices.TypeScript.Comment] = js.native
  
  /* CompleteClass */
  var questionToken: typingsJapgolly.typescriptServices.TypeScript.ASTSpan = js.native
  
  /* CompleteClass */
  override def setPostComments(comments: js.Array[typingsJapgolly.typescriptServices.TypeScript.Comment]): Unit = js.native
  
  /* CompleteClass */
  override def setPreComments(comments: js.Array[typingsJapgolly.typescriptServices.TypeScript.Comment]): Unit = js.native
  
  /* CompleteClass */
  override def start(): Double = js.native
  
  /* CompleteClass */
  override def structuralEquals(ast: typingsJapgolly.typescriptServices.TypeScript.AST, includingPosition: Boolean): Boolean = js.native
  
  /* CompleteClass */
  override def syntaxID(): Double = js.native
  
  /* CompleteClass */
  override def trailingTriviaWidth(): Double = js.native
  
  /* CompleteClass */
  var typeAnnotation: typingsJapgolly.typescriptServices.TypeScript.TypeAnnotation = js.native
  
  /* CompleteClass */
  override def width(): Double = js.native
}
