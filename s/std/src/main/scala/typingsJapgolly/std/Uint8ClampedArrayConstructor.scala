package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Uint8ClampedArrayConstructor
  extends StObject
     with /* standard es2015.iterable */
/* standard es5 */
Instantiable1[
      (/* buffer */ ArrayBufferLike) | (/* array */ ArrayLike[Double]) | (/* length */ Double) | (/* elements */ js.Iterable[Double]), 
      js.typedarray.Uint8ClampedArray
    ]
     with /* standard es2017.typedarrays */
Instantiable0[js.typedarray.Uint8ClampedArray]
     with Instantiable2[
      /* buffer */ ArrayBufferLike, 
      /* byteOffset */ Double, 
      js.typedarray.Uint8ClampedArray
    ]
     with Instantiable3[
      /* buffer */ ArrayBufferLike, 
      (/* byteOffset */ Double) | (/* byteOffset */ Unit), 
      /* length */ Double, 
      js.typedarray.Uint8ClampedArray
    ] {
  
  /**
    * The size in bytes of each element in the array.
    */
  /* standard es5 */
  val BYTES_PER_ELEMENT: Double = js.native
  
  /**
    * Creates an array from an array-like or iterable object.
    * @param arrayLike An array-like or iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of 'this' used to invoke the mapfn.
    */
  /* standard es2015.iterable */
  def from(arrayLike: js.Iterable[Double]): js.typedarray.Uint8ClampedArray = js.native
  def from(arrayLike: js.Iterable[Double], mapfn: js.Function2[/* v */ Double, /* k */ Double, Double]): js.typedarray.Uint8ClampedArray = js.native
  def from(
    arrayLike: js.Iterable[Double],
    mapfn: js.Function2[/* v */ Double, /* k */ Double, Double],
    thisArg: Any
  ): js.typedarray.Uint8ClampedArray = js.native
  def from(arrayLike: js.Iterable[Double], mapfn: Unit, thisArg: Any): js.typedarray.Uint8ClampedArray = js.native
  /**
    * Creates an array from an array-like or iterable object.
    * @param arrayLike An array-like or iterable object to convert to an array.
    */
  /* standard es5 */
  def from(arrayLike: ArrayLike[Double]): js.typedarray.Uint8ClampedArray = js.native
  /**
    * Creates an array from an array-like or iterable object.
    * @param arrayLike An array-like or iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of 'this' used to invoke the mapfn.
    */
  /* standard es5 */
  def from[T](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, Double]): js.typedarray.Uint8ClampedArray = js.native
  def from[T](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, Double], thisArg: Any): js.typedarray.Uint8ClampedArray = js.native
  
  /**
    * Returns a new array from a set of elements.
    * @param items A set of elements to include in the new array object.
    */
  /* standard es5 */
  def of(items: Double*): js.typedarray.Uint8ClampedArray = js.native
}
