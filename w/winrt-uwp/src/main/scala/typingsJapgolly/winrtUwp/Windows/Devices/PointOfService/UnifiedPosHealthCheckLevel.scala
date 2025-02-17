package typingsJapgolly.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UnifiedPosHealthCheckLevel extends StObject
/** Defines the constants that indicates the type of health check that can be performed on the devices. */
@JSGlobal("Windows.Devices.PointOfService.UnifiedPosHealthCheckLevel")
@js.native
object UnifiedPosHealthCheckLevel extends StObject {
  
  /** Perform a more thorough test that may change the device. */
  @js.native
  sealed trait external
    extends StObject
       with UnifiedPosHealthCheckLevel
  
  /** Perform a interactive test of the device. The supporting service object will typically display a modal dialog box to present test options and results. */
  @js.native
  sealed trait interactive
    extends StObject
       with UnifiedPosHealthCheckLevel
  
  /** Perform internal tests to that do not physically change the device. */
  @js.native
  sealed trait posinternal
    extends StObject
       with UnifiedPosHealthCheckLevel
  
  /** Perform an unspecified test. */
  @js.native
  sealed trait unknownHealthCheckLevel
    extends StObject
       with UnifiedPosHealthCheckLevel
}
