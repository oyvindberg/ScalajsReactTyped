package typingsJapgolly.reactMonacoEditor.components

import typingsJapgolly.reactMonacoEditor.libTypesMod.MonacoEditorProps
import typingsJapgolly.reactMonacoEditor.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactMonacoEditor {
  
  @JSImport("react-monaco-editor", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ReactMonacoEditor.type): SharedBuilder_MonacoEditorProps393543438[default] = new SharedBuilder_MonacoEditorProps393543438[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MonacoEditorProps): SharedBuilder_MonacoEditorProps393543438[default] = new SharedBuilder_MonacoEditorProps393543438[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
