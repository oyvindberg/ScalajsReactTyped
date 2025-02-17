package typingsJapgolly.w3cCssTypedObjectModelLevel1

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.std.DOMMatrix
import typingsJapgolly.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSTransformValue
  extends StObject
     with CSSStyleValue
     with /* index */ NumberDictionary[CSSTransformComponent] {
  
  val is2D: Boolean = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[CSSTransformComponent]] = js.native
  
  val length: Double = js.native
  
  def toMatrix(): DOMMatrix = js.native
}
