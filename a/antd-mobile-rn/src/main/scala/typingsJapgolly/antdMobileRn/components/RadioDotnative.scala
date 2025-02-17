package typingsJapgolly.antdMobileRn.components

import typingsJapgolly.antdMobileRn.libRadioRadioDotnativeMod.RadioNativeProps
import typingsJapgolly.antdMobileRn.libRadioRadioDotnativeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioDotnative {
  
  @JSImport("antd-mobile-rn/lib/radio/Radio.native", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RadioDotnative.type): SharedBuilder_RadioNativeProps_284180103[default] = new SharedBuilder_RadioNativeProps_284180103[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RadioNativeProps): SharedBuilder_RadioNativeProps_284180103[default] = new SharedBuilder_RadioNativeProps_284180103[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
