package typingsJapgolly.vueTestUtils.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instantiable[V /* <: js.Object */, P]
  extends StObject
     with Instantiable1[/* args (repeated) */ Any, V] {
  
  def props(Props: P): Any = js.native
  
  def registerHooks(keys: js.Array[String]): Unit = js.native
}
