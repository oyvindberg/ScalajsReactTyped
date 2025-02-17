package typingsJapgolly.cryptoJs

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.cryptoJs.mod.HasherHelper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sha256Mod extends Shortcut {
  
  @JSImport("crypto-js/sha256", JSImport.Namespace)
  @js.native
  val ^ : HasherHelper = js.native
  
  type _To = HasherHelper
  
  /* This means you don't have to write `^`, but can instead just say `sha256Mod.foo` */
  override def _to: HasherHelper = ^
}
