package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalOperatorsThrottleMod.ThrottleConfig
import typingsJapgolly.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import typingsJapgolly.rxjs.distTypesInternalTypesMod.ObservableInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalOperatorsThrottleMod {
  
  @JSImport("rxjs/internal/operators/throttle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rxjs/internal/operators/throttle", "defaultThrottleConfig")
  @js.native
  val defaultThrottleConfig: ThrottleConfig = js.native
  
  inline def throttle[T](durationSelector: js.Function1[/* value */ T, ObservableInput[Any]]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(durationSelector.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def throttle[T](durationSelector: js.Function1[/* value */ T, ObservableInput[Any]], config: ThrottleConfig): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(durationSelector.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
}
