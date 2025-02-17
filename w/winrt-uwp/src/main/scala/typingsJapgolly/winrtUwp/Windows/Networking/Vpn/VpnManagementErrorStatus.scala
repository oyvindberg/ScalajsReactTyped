package typingsJapgolly.winrtUwp.Windows.Networking.Vpn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VpnManagementErrorStatus extends StObject
/** Describes the known VPN management errors. */
@JSGlobal("Windows.Networking.Vpn.VpnManagementErrorStatus")
@js.native
object VpnManagementErrorStatus extends StObject {
  
  /** Access is denied. */
  @js.native
  sealed trait accessDenied
    extends StObject
       with VpnManagementErrorStatus
  
  /** Invalid XML syntax */
  @js.native
  sealed trait invalidXmlSyntax
    extends StObject
       with VpnManagementErrorStatus
  
  /** OK */
  @js.native
  sealed trait ok
    extends StObject
       with VpnManagementErrorStatus
  
  /** Other */
  @js.native
  sealed trait other
    extends StObject
       with VpnManagementErrorStatus
  
  /** The app id is invalid. */
  @js.native
  sealed trait profileInvalidAppId
    extends StObject
       with VpnManagementErrorStatus
  
  /** The profile name is too long. */
  @js.native
  sealed trait profileNameTooLong
    extends StObject
       with VpnManagementErrorStatus
}
