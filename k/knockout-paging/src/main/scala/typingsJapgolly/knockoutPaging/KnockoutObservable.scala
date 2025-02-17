package typingsJapgolly.knockoutPaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutObservable[T]
  extends StObject
     with KnockoutSubscribable[T]
     with KnockoutObservableFunctions[T] {
  
  def apply(): T = js.native
  def apply(value: T): Unit = js.native
  
  def peek(): T = js.native
  
  var valueHasMutated: js.UndefOr[js.Function0[Unit]] = js.native
  
  var valueWillMutate: js.UndefOr[js.Function0[Unit]] = js.native
}
