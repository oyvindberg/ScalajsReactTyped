package typingsJapgolly.three.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.RingGeometry")
@js.native
open class RingGeometry protected ()
  extends typingsJapgolly.three.mod.RingGeometry {
  /**
    * @param [innerRadius=0.5]
    * @param [outerRadius=1]
    * @param [thetaSegments=8]
    * @param [phiSegments=1]
    * @param [thetaStart=0]
    * @param [thetaLength=Math.PI * 2]
    */
  def this(
    innerRadius: js.UndefOr[Double],
    outerRadius: js.UndefOr[Double],
    thetaSegments: js.UndefOr[Double],
    phiSegments: js.UndefOr[Double],
    thetaStart: js.UndefOr[Double],
    thetaLength: js.UndefOr[Double]
  ) = this()
}
/* static members */
object RingGeometry {
  
  @JSGlobal("THREE.RingGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(data: Any): typingsJapgolly.three.srcGeometriesRingGeometryMod.RingGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.three.srcGeometriesRingGeometryMod.RingGeometry]
}
