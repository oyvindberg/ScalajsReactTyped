package typingsJapgolly.carbonComponents.globalsJsComponentsMod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.carbonComponents.anon.PartialCopyButtonOptions
import typingsJapgolly.carbonComponents.componentsCopyButtonCopyButtonMod.default
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components/globals/js/components", "CopyButton")
@js.native
open class CopyButton protected () extends default {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: PartialCopyButtonOptions) = this()
}
object CopyButton {
  
  @JSImport("carbon-components/globals/js/components", "CopyButton")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components/globals/js/components", "CopyButton.components")
  @js.native
  def components: WeakMap[js.Object, Any] = js.native
  inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
}
