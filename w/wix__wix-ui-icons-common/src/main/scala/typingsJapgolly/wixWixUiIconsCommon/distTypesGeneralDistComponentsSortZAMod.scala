package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsSortZAMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/SortZA", JSImport.Default)
  @js.native
  val default: FC[SortZAProps] = js.native
  
  trait SortZAProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SortZAProps {
    
    inline def apply(): SortZAProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortZAProps]
    }
    
    extension [Self <: SortZAProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SortZAProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsSortZAMod.foo` */
  override def _to: FC[SortZAProps] = default
}
