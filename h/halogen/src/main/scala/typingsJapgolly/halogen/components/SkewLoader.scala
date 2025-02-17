package typingsJapgolly.halogen.components

import typingsJapgolly.halogen.mod.SizeLoaderProps
import typingsJapgolly.halogen.mod.SkewLoaderCls
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SkewLoader {
  
  @JSImport("halogen", "SkewLoader")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: SkewLoader.type): SharedBuilder_SizeLoaderProps1802861059[SkewLoaderCls] = new SharedBuilder_SizeLoaderProps1802861059[SkewLoaderCls](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SizeLoaderProps): SharedBuilder_SizeLoaderProps1802861059[SkewLoaderCls] = new SharedBuilder_SizeLoaderProps1802861059[SkewLoaderCls](js.Array(this.component, p.asInstanceOf[js.Any]))
}
