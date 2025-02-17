package typingsJapgolly.minappEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallableFunction
  extends StObject
     with Function {
  
  /**
    * For a given function, creates a bound function that has the same body as the original function.
    * The this object of the bound function is associated with the specified object, and has the specified initial parameters.
    * @param thisArg The object to be used as the this object.
    * @param args Arguments to bind to the parameters of the function.
    */
  def bind[T, A /* <: Array[Any] */, R](thisArg: T): js.Function1[/* args */ A, R] = js.native
  def bind[T, A0, A /* <: Array[Any] */, R](thisArg: T, arg0: A0): js.Function1[/* args */ A, R] = js.native
  def bind[T, A0, A1, A /* <: Array[Any] */, R](thisArg: T, arg0: A0, arg1: A1): js.Function1[/* args */ A, R] = js.native
  def bind[T, A0, A1, A2, A /* <: Array[Any] */, R](thisArg: T, arg0: A0, arg1: A1, arg2: A2): js.Function1[/* args */ A, R] = js.native
  def bind[T, A0, A1, A2, A3, A /* <: Array[Any] */, R](thisArg: T, arg0: A0, arg1: A1, arg2: A2, arg3: A3): js.Function1[/* args */ A, R] = js.native
  
  /**
    * Calls the function with the specified object as the this value and the specified rest arguments as the arguments.
    * @param thisArg The object to be used as the this object.
    * @param args Argument values to be passed to the function.
    */
  def call[T, A /* <: Array[Any] */, R](
    thisArg: T,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type A is not an array type */ args: A
  ): R = js.native
}
