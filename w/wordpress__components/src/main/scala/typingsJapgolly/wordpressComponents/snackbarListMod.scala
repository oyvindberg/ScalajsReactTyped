package typingsJapgolly.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.wordpressComponents.snackbarListMod.SnackbarList.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snackbarListMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/snackbar/list", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object SnackbarList {
    
    type Props = typingsJapgolly.wordpressComponents.noticeListMod.NoticeList.Props
  }
}
