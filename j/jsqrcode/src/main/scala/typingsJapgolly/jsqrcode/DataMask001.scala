package typingsJapgolly.jsqrcode

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataMask001
  extends StObject
     with DataMask
object DataMask001 {
  
  inline def apply(isMasked: (Double, Double) => Boolean, unmaskBitMatrix: (js.Array[Double], Double) => Callback): DataMask001 = {
    val __obj = js.Dynamic.literal(isMasked = js.Any.fromFunction2(isMasked), unmaskBitMatrix = js.Any.fromFunction2((t0: js.Array[Double], t1: Double) => (unmaskBitMatrix(t0, t1)).runNow()))
    __obj.asInstanceOf[DataMask001]
  }
}
