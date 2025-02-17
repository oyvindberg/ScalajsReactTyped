package typingsJapgolly.twoJs.mod

import typingsJapgolly.twoJs.mod.Utils.Collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("two.js", "LinearGradient")
@js.native
open class LinearGradient protected ()
  extends StObject
     with _Color {
  def this(x1: Double, y1: Double, x2: Double, y2: Double, stops: js.Array[Stop]) = this()
  
  var left: Vector = js.native
  
  var right: Vector = js.native
  
  var spread: String = js.native
  
  var stops: Collection[Stop] = js.native
}
