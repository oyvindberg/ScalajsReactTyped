package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The client-side equivalent of the BinaryImageEditExtension.
  */
@js.native
trait MVCxClientBinaryImage
  extends StObject
     with ASPxClientBinaryImage {
  
  /**
    * Occurs when you initiate a callback to the server.
    */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientBinaryImage: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientBinaryImage]] = js.native
  
  /**
    * Sends a callback with parameters to update the Binary Image.
    * @param data Information that is passed to the server.
    * @param onSuccess A client action that is performed if a callback is completed successfully.
    */
  def PerformCallback(data: Any): Unit = js.native
  def PerformCallback(data: Any, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
}
