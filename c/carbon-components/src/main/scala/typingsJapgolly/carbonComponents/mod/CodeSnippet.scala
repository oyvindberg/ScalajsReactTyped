package typingsJapgolly.carbonComponents.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.carbonComponents.anon.PartialCodeSnippetOptions
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components", "CodeSnippet")
@js.native
open class CodeSnippet protected ()
  extends typingsJapgolly.carbonComponents.globalsJsComponentsMod.CodeSnippet {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: PartialCodeSnippetOptions) = this()
}
object CodeSnippet {
  
  @JSImport("carbon-components", "CodeSnippet")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components", "CodeSnippet.components")
  @js.native
  def components: WeakMap[js.Object, Any] = js.native
  inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
}
