package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxElement
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxList
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxNodeOrToken
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxTriviaList
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxVisitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "GetAccessorSyntax")
@js.native
open class GetAccessorSyntax protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.GetAccessorSyntax {
  def this(
    modifiers: ISyntaxList,
    getKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: typingsJapgolly.typescriptServices.TypeScript.ParameterListSyntax,
    typeAnnotation: typingsJapgolly.typescriptServices.TypeScript.TypeAnnotationSyntax,
    block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax,
    parsedInStrictMode: Boolean
  ) = this()
  
  /* CompleteClass */
  override def accept(visitor: ISyntaxVisitor): Any = js.native
  
  /* CompleteClass */
  override def childAt(index: Double): ISyntaxElement = js.native
  
  /* CompleteClass */
  override def childCount(): Double = js.native
  
  /* CompleteClass */
  override def collectTextElements(elements: js.Array[String]): Unit = js.native
  
  /* CompleteClass */
  override def firstToken(): ISyntaxToken = js.native
  
  /* CompleteClass */
  override def fullText(): String = js.native
  
  /* CompleteClass */
  override def fullWidth(): Double = js.native
  
  /* CompleteClass */
  override def isIncrementallyUnusable(): Boolean = js.native
  
  /* CompleteClass */
  override def isList(): Boolean = js.native
  
  /* CompleteClass */
  override def isNode(): Boolean = js.native
  
  /* CompleteClass */
  override def isSeparatedList(): Boolean = js.native
  
  /* CompleteClass */
  override def isToken(): Boolean = js.native
  
  /* CompleteClass */
  override def isTypeScriptSpecific(): Boolean = js.native
  
  /* CompleteClass */
  override def kind(): typingsJapgolly.typescriptServices.TypeScript.SyntaxKind = js.native
  
  /* CompleteClass */
  override def lastToken(): ISyntaxToken = js.native
  
  /* CompleteClass */
  override def leadingTrivia(): ISyntaxTriviaList = js.native
  
  /* CompleteClass */
  override def leadingTriviaWidth(): Double = js.native
  
  /* CompleteClass */
  override def trailingTrivia(): ISyntaxTriviaList = js.native
  
  /* CompleteClass */
  override def trailingTriviaWidth(): Double = js.native
  
  /* CompleteClass */
  override def width(): Double = js.native
  
  /* CompleteClass */
  override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  
  /* CompleteClass */
  override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
}
object GetAccessorSyntax {
  
  @JSImport("typescript-services", "GetAccessorSyntax")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def create(
    getKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: typingsJapgolly.typescriptServices.TypeScript.ParameterListSyntax,
    block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax
  ): typingsJapgolly.typescriptServices.TypeScript.GetAccessorSyntax = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(getKeyword.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], parameterList.asInstanceOf[js.Any], block.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.GetAccessorSyntax]
  
  /* static member */
  inline def create1(propertyName: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.GetAccessorSyntax = ^.asInstanceOf[js.Dynamic].applyDynamic("create1")(propertyName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.GetAccessorSyntax]
}
