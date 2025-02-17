package typingsJapgolly.winrtUwp.Windows.Devices.Perception

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PerceptionFrameSourceAccessStatus extends StObject
/** Indicates the access status an app is allowed for a particular type of frame source. */
@JSGlobal("Windows.Devices.Perception.PerceptionFrameSourceAccessStatus")
@js.native
object PerceptionFrameSourceAccessStatus extends StObject {
  
  /** The app is allowed to access the type of perception frame source it requested. */
  @js.native
  sealed trait allowed
    extends StObject
       with PerceptionFrameSourceAccessStatus
  
  /** The app is not allowed to access the type of perception frame source it requested because system access to camera devices is denied. This usually occurs when the user denies all apps access to camera devices in the system privacy settings. */
  @js.native
  sealed trait deniedBySystem
    extends StObject
       with PerceptionFrameSourceAccessStatus
  
  /** The app is not allowed to access the type of perception frame source it requested because the user denied the app access to camera devices. */
  @js.native
  sealed trait deniedByUser
    extends StObject
       with PerceptionFrameSourceAccessStatus
  
  /** Access status is not specified. */
  @js.native
  sealed trait unspecified
    extends StObject
       with PerceptionFrameSourceAccessStatus
}
