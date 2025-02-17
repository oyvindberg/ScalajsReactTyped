package typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HotspotAuthenticationResponseCode extends StObject
/** Defines values used to indicate status of connection authentication with a mobile hotspot. Provides the response code from the WISPr server for an authentication attempt. */
@JSGlobal("Windows.Networking.NetworkOperators.HotspotAuthenticationResponseCode")
@js.native
object HotspotAuthenticationResponseCode extends StObject {
  
  /** An internal error occurred in the access gateway. */
  @js.native
  sealed trait accessGatewayInternalError
    extends StObject
       with HotspotAuthenticationResponseCode
  
  /** The authentication request was aborted. */
  @js.native
  sealed trait loginAborted
    extends StObject
       with HotspotAuthenticationResponseCode
  
  /** Hotspot authentication failed. */
  @js.native
  sealed trait loginFailed
    extends StObject
       with HotspotAuthenticationResponseCode
  
  /** Hotspot authentication successful. */
  @js.native
  sealed trait loginSucceeded
    extends StObject
       with HotspotAuthenticationResponseCode
  
  /** An error occurred that requires contacting the network administrator. */
  @js.native
  sealed trait networkAdministratorError
    extends StObject
       with HotspotAuthenticationResponseCode
  
  /** No response returned. */
  @js.native
  sealed trait noError
    extends StObject
       with HotspotAuthenticationResponseCode
  
  /** No response from authentication server. */
  @js.native
  sealed trait radiusServerError
    extends StObject
       with HotspotAuthenticationResponseCode
}
