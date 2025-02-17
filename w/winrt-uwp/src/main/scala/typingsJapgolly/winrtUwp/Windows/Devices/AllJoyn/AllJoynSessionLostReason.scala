package typingsJapgolly.winrtUwp.Windows.Devices.AllJoyn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AllJoynSessionLostReason extends StObject
/** Defines values used by AllJoynSessionLostEventArgs to indicate the reason for a lost session. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynSessionLostReason")
@js.native
object AllJoynSessionLostReason extends StObject {
  
  /** The connection supporting the session timed out. */
  @js.native
  sealed trait linkTimeout
    extends StObject
       with AllJoynSessionLostReason
  
  /** No reason indicated. */
  @js.native
  sealed trait none
    extends StObject
       with AllJoynSessionLostReason
  
  /** The session was lost due to any other reason. */
  @js.native
  sealed trait other
    extends StObject
       with AllJoynSessionLostReason
  
  /** The Producer closed the session unexpectedly. */
  @js.native
  sealed trait producerClosedAbruptly
    extends StObject
       with AllJoynSessionLostReason
  
  /** The Producer left the session. */
  @js.native
  sealed trait producerLeftSession
    extends StObject
       with AllJoynSessionLostReason
  
  /** The Consumer was removed from the session by the Producer. */
  @js.native
  sealed trait removedByProducer
    extends StObject
       with AllJoynSessionLostReason
}
