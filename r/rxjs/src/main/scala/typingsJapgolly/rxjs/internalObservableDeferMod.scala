package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalObservableMod.Observable
import typingsJapgolly.rxjs.distTypesInternalTypesMod.ObservableInput
import typingsJapgolly.rxjs.distTypesInternalTypesMod.ObservedValueOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalObservableDeferMod {
  
  @JSImport("rxjs/internal/observable/defer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defer[R /* <: ObservableInput[Any] */](observableFactory: js.Function0[R]): Observable[ObservedValueOf[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")(observableFactory.asInstanceOf[js.Any]).asInstanceOf[Observable[ObservedValueOf[R]]]
}
