package typingsJapgolly.typescriptServices.global.TypeScript

import typingsJapgolly.typescriptServices.TypeScript.ISeparatedSyntaxList
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.PositionedSeparatedList")
@js.native
open class PositionedSeparatedList protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.PositionedSeparatedList {
  def this(
    parent: typingsJapgolly.typescriptServices.TypeScript.PositionedElement,
    list: ISeparatedSyntaxList,
    fullStart: Double
  ) = this()
  
  /* private */ /* CompleteClass */
  var _element: Any = js.native
  
  /* private */ /* CompleteClass */
  var _fullStart: Any = js.native
  
  /* private */ /* CompleteClass */
  var _parent: Any = js.native
  
  /* CompleteClass */
  override def childAt(index: Double): typingsJapgolly.typescriptServices.TypeScript.PositionedElement = js.native
  
  /* CompleteClass */
  override def childCount(): Double = js.native
  
  /* CompleteClass */
  override def childEnd(child: ISyntaxElement): Double = js.native
  
  /* CompleteClass */
  override def childEndAt(index: Double): Double = js.native
  
  /* CompleteClass */
  override def childIndex(child: ISyntaxElement): Double = js.native
  
  /* CompleteClass */
  override def childStart(child: ISyntaxElement): Double = js.native
  
  /* CompleteClass */
  override def childStartAt(index: Double): Double = js.native
  
  /* CompleteClass */
  override def containingNode(): typingsJapgolly.typescriptServices.TypeScript.PositionedNode = js.native
  
  /* CompleteClass */
  override def element(): ISyntaxElement = js.native
  
  /* CompleteClass */
  override def end(): Double = js.native
  
  /* CompleteClass */
  override def fullEnd(): Double = js.native
  
  /* CompleteClass */
  override def fullStart(): Double = js.native
  
  /* CompleteClass */
  override def fullWidth(): Double = js.native
  
  /* CompleteClass */
  override def getPositionedChild(child: ISyntaxElement): typingsJapgolly.typescriptServices.TypeScript.PositionedElement = js.native
  
  /* CompleteClass */
  override def kind(): typingsJapgolly.typescriptServices.TypeScript.SyntaxKind = js.native
  
  /* CompleteClass */
  override def list(): ISeparatedSyntaxList = js.native
  
  /* CompleteClass */
  override def parent(): typingsJapgolly.typescriptServices.TypeScript.PositionedElement = js.native
  
  /* CompleteClass */
  override def parentElement(): ISyntaxElement = js.native
  
  /* CompleteClass */
  override def root(): typingsJapgolly.typescriptServices.TypeScript.PositionedNode = js.native
  
  /* CompleteClass */
  override def start(): Double = js.native
}
