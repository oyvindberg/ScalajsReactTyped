package typingsJapgolly.vscodeLanguageclient.mod

import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InitializeErrorCodes {
  
  /**
    * If the protocol version provided by the client can't be handled by the server.
    *
    * @deprecated This initialize error got replaced by client capabilities. There is
    * no version handshake in version 3.0x
    */
  @JSImport("vscode-languageclient", "InitializeErrorCodes.unknownProtocolVersion")
  @js.native
  val unknownProtocolVersion: `1` = js.native
}
