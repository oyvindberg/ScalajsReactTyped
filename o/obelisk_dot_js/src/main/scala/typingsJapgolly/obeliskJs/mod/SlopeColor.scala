package typingsJapgolly.obeliskJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("obelisk.js", "SlopeColor")
@js.native
open class SlopeColor protected () extends AbstractColor {
  def this(
    border: js.UndefOr[Double],
    borderHighlight: js.UndefOr[Double],
    left: js.UndefOr[Double],
    right: js.UndefOr[Double],
    leftSlope: js.UndefOr[Double],
    rightSlope: js.UndefOr[Double]
  ) = this()
  
  var BRIGHTNESS_GAIN: Double = js.native
  
  def getByHorizontalColor(horizontal: Double): SlopeColor = js.native
}
