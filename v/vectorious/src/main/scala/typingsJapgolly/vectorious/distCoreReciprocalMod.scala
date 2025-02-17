package typingsJapgolly.vectorious

import typingsJapgolly.std.ArrayLike
import typingsJapgolly.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreReciprocalMod {
  
  @JSImport("vectorious/dist/core/reciprocal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[NDArray]
  
  inline def reciprocal(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("reciprocal")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def reciprocal(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("reciprocal")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
}
