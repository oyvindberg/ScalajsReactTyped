package typingsJapgolly.seen.mod

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "SvgCirclePainter")
@js.native
open class SvgCirclePainter protected () extends SvgStyler {
  def this(elementFactory: js.Function1[/* name */ String, HTMLElement]) = this()
  
  def circle(center: Point, radius: Double): this.type = js.native
}
