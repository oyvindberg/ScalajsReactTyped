package typingsJapgolly.interactjsTypes

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.noop
import typingsJapgolly.interactjsTypes.modifiersTypesMod.ModifierFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifiersRubberbandRubberbandMod extends Shortcut {
  
  @JSImport("@interactjs/modifiers/rubberband/rubberband", JSImport.Default)
  @js.native
  val default: ModifierFunction[Any, Any, noop] = js.native
  
  type _To = ModifierFunction[Any, Any, noop]
  
  /* This means you don't have to write `default`, but can instead just say `modifiersRubberbandRubberbandMod.foo` */
  override def _to: ModifierFunction[Any, Any, noop] = default
}
