package typingsJapgolly.winrtUwp.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlayToConnectionError extends StObject
/** Describes an error on a Play To connection. */
@JSGlobal("Windows.Media.PlayTo.PlayToConnectionError")
@js.native
object PlayToConnectionError extends StObject {
  
  /** The Play To target device has encountered an error. */
  @js.native
  sealed trait deviceError
    extends StObject
       with PlayToConnectionError
  
  /** The Play To target device is locked. */
  @js.native
  sealed trait deviceLocked
    extends StObject
       with PlayToConnectionError
  
  /** The Play To target device has not responded for at least 5 seconds. */
  @js.native
  sealed trait deviceNotResponding
    extends StObject
       with PlayToConnectionError
  
  /** No error occurred. */
  @js.native
  sealed trait none
    extends StObject
       with PlayToConnectionError
  
  /** The Play To target device failed to play the protected content. */
  @js.native
  sealed trait protectedPlaybackFailed
    extends StObject
       with PlayToConnectionError
}
