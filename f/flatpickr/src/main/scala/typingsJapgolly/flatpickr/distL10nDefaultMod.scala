package typingsJapgolly.flatpickr

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.flatpickr.distTypesLocaleMod.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distL10nDefaultMod extends Shortcut {
  
  @JSImport("flatpickr/dist/l10n/default", JSImport.Default)
  @js.native
  val default: Locale = js.native
  
  @JSImport("flatpickr/dist/l10n/default", "english")
  @js.native
  val english: Locale = js.native
  
  type _To = Locale
  
  /* This means you don't have to write `default`, but can instead just say `distL10nDefaultMod.foo` */
  override def _to: Locale = default
}
