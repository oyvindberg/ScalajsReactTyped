package typingsJapgolly.winrtUwp.Windows.Networking.BackgroundTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BackgroundTransferStatus extends StObject
/** Defines transfer operation status values. */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferStatus")
@js.native
object BackgroundTransferStatus extends StObject {
  
  /** The transfer operation has been cancelled. */
  @js.native
  sealed trait canceled
    extends StObject
       with BackgroundTransferStatus
  
  /** The transfer operation has completed. */
  @js.native
  sealed trait completed
    extends StObject
       with BackgroundTransferStatus
  
  /** An error was encountered during the transfer operation. */
  @js.native
  sealed trait error
    extends StObject
       with BackgroundTransferStatus
  
  /** The application is idle. */
  @js.native
  sealed trait idle
    extends StObject
       with BackgroundTransferStatus
  
  /** The application has paused the transfer operation. */
  @js.native
  sealed trait pausedByApplication
    extends StObject
       with BackgroundTransferStatus
  
  /** The transfer operation is paused due to cost policy (e.g. transitioned to a costed network). */
  @js.native
  sealed trait pausedCostedNetwork
    extends StObject
       with BackgroundTransferStatus
  
  /** The transfer operation is paused due to a lack of network connectivity. */
  @js.native
  sealed trait pausedNoNetwork
    extends StObject
       with BackgroundTransferStatus
  
  /** Windows Phone only. The transfer is paused by the system due to resource constraints. Transfers will have this status if Battery Saver is activated, if the background task can't get enough memory, CPU, power resources to run, or if the network condition is 2G and the app is not in the foreground */
  @js.native
  sealed trait pausedSystemPolicy
    extends StObject
       with BackgroundTransferStatus
  
  /** The transfer is currently in progress. */
  @js.native
  sealed trait running
    extends StObject
       with BackgroundTransferStatus
}
