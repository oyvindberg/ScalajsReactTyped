package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSDocTypeLiteral
  extends StObject
     with JSDocType {
  
  /** If true, then this type literal represents an *array* of its type. */
  val isArrayType: Boolean = js.native
  
  val jsDocPropertyTags: js.UndefOr[js.Array[JSDocPropertyLikeTag]] = js.native
  
  @JSName("kind")
  val kind_JSDocTypeLiteral: typingsJapgolly.typescript.mod.SyntaxKind.JSDocTypeLiteral = js.native
}
