package typingsJapgolly.crc

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.crc.mjsTypesMod.CRCModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mjsCrc24Mod extends Shortcut {
  
  @JSImport("crc/mjs/crc24", JSImport.Default)
  @js.native
  val default: CRCModule = js.native
  
  type _To = CRCModule
  
  /* This means you don't have to write `default`, but can instead just say `mjsCrc24Mod.foo` */
  override def _to: CRCModule = default
}
