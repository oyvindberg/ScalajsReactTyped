package typingsJapgolly.nodegit

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.nodegit.certMod.Cert
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object certX509Mod {
  
  @JSImport("nodegit/cert-x509", "CertX509")
  @js.native
  open class CertX509 () extends StObject {
    
    var data: Buffer = js.native
    
    var len: Double = js.native
    
    var parent: Cert = js.native
  }
}
