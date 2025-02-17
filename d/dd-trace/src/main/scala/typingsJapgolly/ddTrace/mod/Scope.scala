package typingsJapgolly.ddTrace.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scope extends StObject {
  
  /**
    * Activate a span in the scope of a function.
    *
    * @param {Span} span The span to activate.
    * @param {Function} fn Function that will have the span activated on its scope.
    * @returns The return value of the provided function.
    */
  def activate[T](span: Span, fn: js.Function1[/* repeated */ Any, T]): T = js.native
  
  /**
    * Get the current active span or null if there is none.
    *
    * @returns {Span} The active span.
    */
  def active(): Span | Null = js.native
  
  /**
    * Binds a target to the provided span, or the active span if omitted.
    *
    * @param {Function|Promise} target Target that will have the span activated on its scope.
    * @param {Span} [span=scope.active()] The span to activate.
    * @returns The bound target.
    */
  def bind[T /* <: js.Function1[/* repeated */ Any, Unit] */](fn: T): T = js.native
  def bind[T /* <: js.Function1[/* repeated */ Any, Unit] */](fn: T, span: Span): T = js.native
  def bind[T](fn: js.Promise[T]): js.Promise[T] = js.native
  def bind[T](fn: js.Promise[T], span: Span): js.Promise[T] = js.native
  @JSName("bind")
  def bind_VT[V, T /* <: js.Function1[/* repeated */ Any, V] */](fn: T): T = js.native
  @JSName("bind")
  def bind_VT[V, T /* <: js.Function1[/* repeated */ Any, V] */](fn: T, span: Span): T = js.native
}
