package typingsJapgolly.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcGeneralDistComponentsDocumentExpireSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/es/src/general/dist/components/DocumentExpireSmall", JSImport.Default)
  @js.native
  val default: FC[DocumentExpireSmallProps] = js.native
  
  trait DocumentExpireSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DocumentExpireSmallProps {
    
    inline def apply(): DocumentExpireSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentExpireSmallProps]
    }
    
    extension [Self <: DocumentExpireSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DocumentExpireSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsSrcGeneralDistComponentsDocumentExpireSmallMod.foo` */
  override def _to: FC[DocumentExpireSmallProps] = default
}
