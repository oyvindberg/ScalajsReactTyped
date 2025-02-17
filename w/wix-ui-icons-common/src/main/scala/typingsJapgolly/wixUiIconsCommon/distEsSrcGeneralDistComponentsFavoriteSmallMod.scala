package typingsJapgolly.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcGeneralDistComponentsFavoriteSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/es/src/general/dist/components/FavoriteSmall", JSImport.Default)
  @js.native
  val default: FC[FavoriteSmallProps] = js.native
  
  trait FavoriteSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FavoriteSmallProps {
    
    inline def apply(): FavoriteSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FavoriteSmallProps]
    }
    
    extension [Self <: FavoriteSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FavoriteSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsSrcGeneralDistComponentsFavoriteSmallMod.foo` */
  override def _to: FC[FavoriteSmallProps] = default
}
