package typingsJapgolly.ssh2.mod

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.ssh2.ssh2Strings.hostbased
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostbasedAuthContext
  extends AuthContextBase
     with AuthContext {
  
  /** The data used to verify the key, or `undefined` if the client is only checking the validity of the key. */
  var blob: Buffer = js.native
  
  /** The public key sent by the client. */
  var key: PublicKey = js.native
  
  /** The local hostname of the client. */
  var localHostname: String = js.native
  
  /** The local username of the client. */
  var localUsername: String = js.native
  
  /** The method of authentication. */
  @JSName("method")
  var method_HostbasedAuthContext: hostbased = js.native
  
  /** The signature to verify, or `undefined` if the client is only checking the validity of the key. */
  var signature: Buffer = js.native
}
