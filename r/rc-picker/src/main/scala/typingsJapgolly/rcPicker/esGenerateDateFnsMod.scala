package typingsJapgolly.rcPicker

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.rcPicker.esGenerateMod.GenerateConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esGenerateDateFnsMod extends Shortcut {
  
  @JSImport("rc-picker/es/generate/dateFns", JSImport.Default)
  @js.native
  val default: GenerateConfig[js.Date] = js.native
  
  type _To = GenerateConfig[js.Date]
  
  /* This means you don't have to write `default`, but can instead just say `esGenerateDateFnsMod.foo` */
  override def _to: GenerateConfig[js.Date] = default
}
