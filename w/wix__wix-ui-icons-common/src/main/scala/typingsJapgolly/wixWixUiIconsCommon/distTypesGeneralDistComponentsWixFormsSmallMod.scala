package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsWixFormsSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/WixFormsSmall", JSImport.Default)
  @js.native
  val default: FC[WixFormsSmallProps] = js.native
  
  trait WixFormsSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object WixFormsSmallProps {
    
    inline def apply(): WixFormsSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixFormsSmallProps]
    }
    
    extension [Self <: WixFormsSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[WixFormsSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsWixFormsSmallMod.foo` */
  override def _to: FC[WixFormsSmallProps] = default
}
