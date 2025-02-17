package typingsJapgolly.rxjsCompat

import typingsJapgolly.rxjs.distTypesInternalTypesMod.SubscribableOrPromise
import typingsJapgolly.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorAuditMod {
  
  @JSImport("rxjs-compat/operator/audit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def audit[T](durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[Any]]): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("audit")(durationSelector.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
}
