package typingsJapgolly.reactNativeWindows.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  def apply(handler: js.Function0[Unit], timeout: Double): Double = js.native
  def apply[Args /* <: js.Array[Any] */](
    handler: js.Function1[/* args */ Args, Unit],
    timeout: Double,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
  ): Double = js.native
  def apply[Args /* <: js.Array[Any] */](
    handler: js.Function1[/* args */ Args, Unit],
    timeout: Unit,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
  ): Double = js.native
}
