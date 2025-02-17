package typingsJapgolly.algoliaClientSearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.algoliaClientSearch.mod.DeleteResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.DeleteResponse>> */
trait ReadonlyWaitablePromiseDe extends StObject {
  
  def `catch`[TResult](): js.Promise[DeleteResponse | TResult]
  
  def `finally`(): js.Promise[DeleteResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyWaitablePromiseDe {
  
  inline def apply(
    `catch`: CallbackTo[js.Promise[DeleteResponse | Any]],
    `finally`: CallbackTo[js.Promise[DeleteResponse]],
    `then`: CallbackTo[js.Promise[Any | Any]]
  ): ReadonlyWaitablePromiseDe = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("finally")(`finally`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ReadonlyWaitablePromiseDe]
  }
  
  extension [Self <: ReadonlyWaitablePromiseDe](x: Self) {
    
    inline def setCatch(value: CallbackTo[js.Promise[DeleteResponse | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setFinally(value: CallbackTo[js.Promise[DeleteResponse]]): Self = StObject.set(x, "finally", value.toJsFn)
    
    inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
  }
}
