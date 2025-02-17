package typingsJapgolly.halogen.components

import typingsJapgolly.halogen.mod.MarginLoaderProps
import typingsJapgolly.halogen.mod.RotateLoaderCls
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RotateLoader {
  
  @JSImport("halogen", "RotateLoader")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RotateLoader.type): SharedBuilder_MarginLoaderProps134229891[RotateLoaderCls] = new SharedBuilder_MarginLoaderProps134229891[RotateLoaderCls](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MarginLoaderProps[String]): SharedBuilder_MarginLoaderProps134229891[RotateLoaderCls] = new SharedBuilder_MarginLoaderProps134229891[RotateLoaderCls](js.Array(this.component, p.asInstanceOf[js.Any]))
}
