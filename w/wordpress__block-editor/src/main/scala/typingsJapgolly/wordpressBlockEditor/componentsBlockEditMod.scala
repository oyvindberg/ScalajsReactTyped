package typingsJapgolly.wordpressBlockEditor

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.wordpressBlockEditor.componentsBlockEditMod.BlockEdit.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsBlockEditMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/block-edit", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object BlockEdit {
    
    // It is extremely unclear what props this component accepts.
    type Props = Any
  }
}
