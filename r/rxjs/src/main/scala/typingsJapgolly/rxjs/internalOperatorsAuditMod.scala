package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import typingsJapgolly.rxjs.distTypesInternalTypesMod.ObservableInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalOperatorsAuditMod {
  
  @JSImport("rxjs/internal/operators/audit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def audit[T](durationSelector: js.Function1[/* value */ T, ObservableInput[Any]]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("audit")(durationSelector.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
}
