package typingsJapgolly.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcGeneralDistComponentsUnarchiveMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/es/src/general/dist/components/Unarchive", JSImport.Default)
  @js.native
  val default: FC[UnarchiveProps] = js.native
  
  trait UnarchiveProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object UnarchiveProps {
    
    inline def apply(): UnarchiveProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnarchiveProps]
    }
    
    extension [Self <: UnarchiveProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UnarchiveProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsSrcGeneralDistComponentsUnarchiveMod.foo` */
  override def _to: FC[UnarchiveProps] = default
}
