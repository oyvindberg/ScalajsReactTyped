package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsThumbsUpFilledMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/ThumbsUpFilled", JSImport.Default)
  @js.native
  val default: FC[ThumbsUpFilledProps] = js.native
  
  trait ThumbsUpFilledProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ThumbsUpFilledProps {
    
    inline def apply(): ThumbsUpFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThumbsUpFilledProps]
    }
    
    extension [Self <: ThumbsUpFilledProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ThumbsUpFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsThumbsUpFilledMod.foo` */
  override def _to: FC[ThumbsUpFilledProps] = default
}
