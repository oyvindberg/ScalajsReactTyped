package typingsJapgolly.kefir.anon

import typingsJapgolly.kefir.mod.Emitter
import typingsJapgolly.kefir.mod.Stream_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallIntervalHandler extends StObject {
  
  def apply[T, S](interval: Double, handler: js.Function1[/* emitter */ Emitter[T, S], Unit]): Stream_[T, S] = js.native
}
