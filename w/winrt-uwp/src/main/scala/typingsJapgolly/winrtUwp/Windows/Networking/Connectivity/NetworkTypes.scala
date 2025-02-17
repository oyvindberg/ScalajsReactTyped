package typingsJapgolly.winrtUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkTypes extends StObject
/** Defines the network connection types. */
@JSGlobal("Windows.Networking.Connectivity.NetworkTypes")
@js.native
object NetworkTypes extends StObject {
  
  /** Internet. */
  @js.native
  sealed trait internet
    extends StObject
       with NetworkTypes
  
  /** No network. */
  @js.native
  sealed trait none
    extends StObject
       with NetworkTypes
  
  /** Private network. */
  @js.native
  sealed trait privateNetwork
    extends StObject
       with NetworkTypes
}
