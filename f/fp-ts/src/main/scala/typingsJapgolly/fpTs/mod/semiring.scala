package typingsJapgolly.fpTs.mod

import typingsJapgolly.fpTs.libSemiringMod.Semiring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object semiring {
  
  @JSImport("fp-ts", "semiring")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFunctionSemiring[A, B](S: Semiring[B]): Semiring[js.Function1[/* a */ A, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctionSemiring")(S.asInstanceOf[js.Any]).asInstanceOf[Semiring[js.Function1[/* a */ A, B]]]
}
