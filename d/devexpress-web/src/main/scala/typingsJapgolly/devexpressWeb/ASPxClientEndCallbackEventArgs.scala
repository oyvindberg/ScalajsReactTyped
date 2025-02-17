package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for client events related to the completion of a callback processing round trip.
  */
trait ASPxClientEndCallbackEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets a command name that identifies which client action forced a callback to occur.
    */
  var command: String
}
object ASPxClientEndCallbackEventArgs {
  
  inline def apply(command: String): ASPxClientEndCallbackEventArgs = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientEndCallbackEventArgs]
  }
  
  extension [Self <: ASPxClientEndCallbackEventArgs](x: Self) {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
