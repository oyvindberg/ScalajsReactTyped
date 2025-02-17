package typingsJapgolly.winrtUwp.Windows.Media.Audio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AudioDeviceNodeCreationStatus extends StObject
/** Defines status values for audio device node creation. */
@JSGlobal("Windows.Media.Audio.AudioDeviceNodeCreationStatus")
@js.native
object AudioDeviceNodeCreationStatus extends StObject {
  
  /** Access to the audio device was denied. */
  @js.native
  sealed trait accessDenied
    extends StObject
       with AudioDeviceNodeCreationStatus
  
  /** The audio device is not available. */
  @js.native
  sealed trait deviceNotAvailable
    extends StObject
       with AudioDeviceNodeCreationStatus
  
  /** The format for audio device node creation is not supported. */
  @js.native
  sealed trait formatNotSupported
    extends StObject
       with AudioDeviceNodeCreationStatus
  
  /** Audio device node creation succeeded. */
  @js.native
  sealed trait success
    extends StObject
       with AudioDeviceNodeCreationStatus
  
  /** An unknown failure occurred in creation of the audio device node. */
  @js.native
  sealed trait unknownFailure
    extends StObject
       with AudioDeviceNodeCreationStatus
}
