package typingsJapgolly.minappEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new function.
  */
@js.native
trait Function extends StObject {
  
  /**
    * Calls the function, substituting the specified object for the this value of the function, and the specified array for the arguments of the function.
    * @param thisArg The object to be used as the this object.
    * @param argArray A set of arguments to be passed to the function.
    */
  @JSName("apply")
  def apply(thisArg: Any): Any = js.native
  @JSName("apply")
  def apply(thisArg: Any, argArray: Any): Any = js.native
  
  // Non-standard extensions
  var arguments: Any = js.native
  
  /**
    * For a given function, creates a bound function that has the same body as the original function.
    * The this object of the bound function is associated with the specified object, and has the specified initial parameters.
    * @param thisArg An object to which the this keyword can refer inside the new function.
    * @param argArray A list of arguments to be passed to the new function.
    */
  def bind(thisArg: Any, argArray: Any*): Any = js.native
  
  /**
    * Calls a method of an object, substituting another object for the current object.
    * @param thisArg The object to be used as the current object.
    * @param argArray A list of arguments to be passed to the method.
    */
  def call(thisArg: Any, argArray: Any*): Any = js.native
  
  var caller: Function = js.native
  
  /**
    * Determines whether the given value inherits from this function if this function was used
    * as a constructor function.
    *
    * A constructor function can control which objects are recognized as its instances by
    * 'instanceof' by overriding this method.
    */
  @JSName(js.Symbol.hasInstance)
  var hasInstance: js.Function1[/* value */ Any, scala.Boolean] = js.native
  
  val length: Double = js.native
  
  /**
    * Returns the name of the function. Function names are read-only and can not be changed.
    */
  val name: java.lang.String = js.native
}
