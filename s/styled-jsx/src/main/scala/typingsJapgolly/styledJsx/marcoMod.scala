package typingsJapgolly.styledJsx

import typingsJapgolly.std.TemplateStringsArray
import typingsJapgolly.styledJsx.anon.ClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object marcoMod {
  
  @JSImport("styled-jsx/marco", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolve(chunks: TemplateStringsArray, args: Any*): ClassName = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(scala.List(chunks.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[ClassName]
}
