package typingsJapgolly.recompose

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.recompose.mod.ObservableConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#rxjs
object rxjsObservableConfigMod extends Shortcut {
  
  @JSImport("recompose/rxjsObservableConfig", JSImport.Default)
  @js.native
  val default: ObservableConfig = js.native
  
  type _To = ObservableConfig
  
  /* This means you don't have to write `default`, but can instead just say `rxjsObservableConfigMod.foo` */
  override def _to: ObservableConfig = default
}
