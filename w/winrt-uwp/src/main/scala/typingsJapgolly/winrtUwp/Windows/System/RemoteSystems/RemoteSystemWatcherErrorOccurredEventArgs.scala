package typingsJapgolly.winrtUwp.Windows.System.RemoteSystems

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Gets information about an **ErrorOccurred** event, namely the **RemoteSystemWatcherError** value describing the error. */
trait RemoteSystemWatcherErrorOccurredEventArgs extends StObject {
  
  /** The **RemoteSystemWatcherError** value representing the error that occurred during discovery, causing the containing **ErrorOccurred** event to be raised. */
  var error: RemoteSystemWatcherError
}
object RemoteSystemWatcherErrorOccurredEventArgs {
  
  inline def apply(error: RemoteSystemWatcherError): RemoteSystemWatcherErrorOccurredEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteSystemWatcherErrorOccurredEventArgs]
  }
  
  extension [Self <: RemoteSystemWatcherErrorOccurredEventArgs](x: Self) {
    
    inline def setError(value: RemoteSystemWatcherError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
