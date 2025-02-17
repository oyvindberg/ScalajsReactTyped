package typingsJapgolly.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UnifiedPosErrorReason extends StObject
/** Defines the constants that indicates the reason for the error event. */
@JSGlobal("Windows.Devices.PointOfService.UnifiedPosErrorReason")
@js.native
object UnifiedPosErrorReason extends StObject {
  
  /** The device is busy. */
  @js.native
  sealed trait busy
    extends StObject
       with UnifiedPosErrorReason
  
  /** The device is closed. */
  @js.native
  sealed trait closed
    extends StObject
       with UnifiedPosErrorReason
  
  /** The device is not enabled. */
  @js.native
  sealed trait disabled
    extends StObject
       with UnifiedPosErrorReason
  
  /** The operation failed and returned a vendor specific error information. */
  @js.native
  sealed trait extended
    extends StObject
       with UnifiedPosErrorReason
  
  /** The operation failed although the device was connected and powered on. */
  @js.native
  sealed trait failure
    extends StObject
       with UnifiedPosErrorReason
  
  /** The operation is not supported or not available on the device. */
  @js.native
  sealed trait illegal
    extends StObject
       with UnifiedPosErrorReason
  
  /** The device is not connected or not powered on. */
  @js.native
  sealed trait noHardware
    extends StObject
       with UnifiedPosErrorReason
  
  /** Cannot communicate with the device, possibly due to a configuration error. */
  @js.native
  sealed trait noService
    extends StObject
       with UnifiedPosErrorReason
  
  /** The device is offline. */
  @js.native
  sealed trait offline
    extends StObject
       with UnifiedPosErrorReason
  
  /** The operation timed out while waiting for a response from the device. */
  @js.native
  sealed trait timeout
    extends StObject
       with UnifiedPosErrorReason
  
  /** Unknown reason. */
  @js.native
  sealed trait unknownErrorReason
    extends StObject
       with UnifiedPosErrorReason
}
