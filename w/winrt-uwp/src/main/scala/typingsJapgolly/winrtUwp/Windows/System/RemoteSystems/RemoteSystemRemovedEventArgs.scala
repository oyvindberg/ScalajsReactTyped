package typingsJapgolly.winrtUwp.Windows.System.RemoteSystems

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Gets information about a RemoteSystemRemoved event, namely the RemoteSystem that was removed. */
trait RemoteSystemRemovedEventArgs extends StObject {
  
  /** The RemoteSystem object representing the device that was removed from the set of discoverable devices, causing the containing RemoteSystemRemoved event to be raised. */
  var remoteSystemId: String
}
object RemoteSystemRemovedEventArgs {
  
  inline def apply(remoteSystemId: String): RemoteSystemRemovedEventArgs = {
    val __obj = js.Dynamic.literal(remoteSystemId = remoteSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteSystemRemovedEventArgs]
  }
  
  extension [Self <: RemoteSystemRemovedEventArgs](x: Self) {
    
    inline def setRemoteSystemId(value: String): Self = StObject.set(x, "remoteSystemId", value.asInstanceOf[js.Any])
  }
}
