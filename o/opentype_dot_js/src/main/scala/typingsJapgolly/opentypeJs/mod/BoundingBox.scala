package typingsJapgolly.opentypeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("opentype.js", "BoundingBox")
@js.native
open class BoundingBox () extends StObject {
  
  def addBezier(x0: Double, y0: Double, x1: Double, y1: Double, x2: Double, y2: Double, x: Double, y: Double): Unit = js.native
  
  def addPoint(x: Double, y: Double): Unit = js.native
  
  def addQuad(x0: Double, y0: Double, x1: Double, y1: Double, x: Double, y: Double): Unit = js.native
  
  def addX(x: Double): Unit = js.native
  
  def addY(y: Double): Unit = js.native
  
  def isEmpty(): Boolean = js.native
  
  var x1: Double = js.native
  
  var x2: Double = js.native
  
  var y1: Double = js.native
  
  var y2: Double = js.native
}
