package typingsJapgolly.es6Shim

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromiseConstructor
  extends StObject
     with /**
  * Creates a new Promise.
  * @param executor A callback used to initialize the promise. This callback is passed two arguments:
  * a resolve callback used to resolve the promise with a value or the result of another promise,
  * and a reject callback used to reject the promise with a provided reason or error.
  */
Instantiable1[
      /* executor */ js.Function2[
        /* resolve */ js.Function1[/* value */ js.UndefOr[js.Object | PromiseLike[js.Object]], Unit], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
        Unit
      ], 
      Promise[js.Object]
    ] {
  
  /**
    * Creates a Promise that is resolved with an array of results when all of the provided Promises
    * resolve, or rejected when any Promise is rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def all[T](values: IterableShim[T | PromiseLike[T]]): Promise[Array[T]] = js.native
  
  /**
    * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
    * or rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def race[T](values: IterableShim[T | PromiseLike[T]]): Promise[T] = js.native
  
  /**
    * Creates a new rejected promise for the provided reason.
    * @param reason The reason the promise was rejected.
    * @returns A new rejected Promise.
    */
  def reject(reason: Any): Promise[Unit] = js.native
  /**
    * Creates a new rejected promise for the provided reason.
    * @param reason The reason the promise was rejected.
    * @returns A new rejected Promise.
    */
  @JSName("reject")
  def reject_T[T](reason: Any): Promise[T] = js.native
  
  /**
    * Creates a new resolved promise .
    * @returns A resolved promise.
    */
  def resolve(): Promise[Unit] = js.native
  /**
    * Creates a new resolved promise for the provided value.
    * @param value A promise.
    * @returns A promise whose internal state matches the provided promise.
    */
  def resolve[T](value: T): Promise[T] = js.native
  def resolve[T](value: PromiseLike[T]): Promise[T] = js.native
}
