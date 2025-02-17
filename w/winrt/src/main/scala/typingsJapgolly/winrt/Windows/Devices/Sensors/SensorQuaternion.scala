package typingsJapgolly.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SensorQuaternion
  extends StObject
     with ISensorQuaternion
object SensorQuaternion {
  
  inline def apply(w: Double, x: Double, y: Double, z: Double): SensorQuaternion = {
    val __obj = js.Dynamic.literal(w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[SensorQuaternion]
  }
}
