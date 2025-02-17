package typingsJapgolly.seen.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.seen.anon.PartialCSSStyleDeclaratio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "SvgTextPainter")
@js.native
open class SvgTextPainter protected () extends StObject {
  def this(elementFactory: js.Function1[/* name */ String, HTMLElement]) = this()
  
  def fillText(m: js.Array[Double], text: String): Unit = js.native
  def fillText(m: js.Array[Double], text: String, style: PartialCSSStyleDeclaratio): Unit = js.native
}
