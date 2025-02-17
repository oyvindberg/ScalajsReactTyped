package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.libPaginationNextMod.PaginationNextProps
import typingsJapgolly.reactBootstrap.libPaginationNextMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PaginationNext {
  
  @JSImport("react-bootstrap/lib/PaginationNext", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: PaginationNext.type): SharedBuilder_PaginationNextProps_1083760299[^] = new SharedBuilder_PaginationNextProps_1083760299[^](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PaginationNextProps): SharedBuilder_PaginationNextProps_1083760299[^] = new SharedBuilder_PaginationNextProps_1083760299[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
