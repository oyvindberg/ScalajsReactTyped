package typingsJapgolly.cryptoJs

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.cryptoJs.mod.BlockCipherMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modeOfbMod extends Shortcut {
  
  @JSImport("crypto-js/mode-ofb", JSImport.Namespace)
  @js.native
  val ^ : BlockCipherMode = js.native
  
  type _To = BlockCipherMode
  
  /* This means you don't have to write `^`, but can instead just say `modeOfbMod.foo` */
  override def _to: BlockCipherMode = ^
}
