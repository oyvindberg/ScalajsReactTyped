package typingsJapgolly.coreJs

import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libraryFnArrayUnshiftMod {
  
  /* was `typeof core.Array.unshift` */
  inline def apply[T](array: ArrayLike[T], items: T*): Double = ^.asInstanceOf[js.Dynamic].apply(scala.List(array.asInstanceOf[js.Any]).`++`(items.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Double]
  
  @JSImport("core-js/library/fn/array/unshift", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
