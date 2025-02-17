package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsHeartMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Heart", JSImport.Default)
  @js.native
  val default: FC[HeartProps] = js.native
  
  trait HeartProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object HeartProps {
    
    inline def apply(): HeartProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeartProps]
    }
    
    extension [Self <: HeartProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HeartProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsHeartMod.foo` */
  override def _to: FC[HeartProps] = default
}
