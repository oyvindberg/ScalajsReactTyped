package typingsJapgolly.sshpk.mod

import typingsJapgolly.sshpk.sshpkStrings.dsa_
import typingsJapgolly.sshpk.sshpkStrings.ecdsa_
import typingsJapgolly.sshpk.sshpkStrings.rsa_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.sshpk.sshpkStrings.curve25519
  - typingsJapgolly.sshpk.sshpkStrings.dsa_
  - typingsJapgolly.sshpk.sshpkStrings.rsa_
  - typingsJapgolly.sshpk.sshpkStrings.ecdsa_
  - typingsJapgolly.sshpk.sshpkStrings.ed25519
*/
trait AlgorithmTypeWithCurve extends StObject
object AlgorithmTypeWithCurve {
  
  inline def curve25519: typingsJapgolly.sshpk.sshpkStrings.curve25519 = "curve25519".asInstanceOf[typingsJapgolly.sshpk.sshpkStrings.curve25519]
  
  inline def dsa: dsa_ = "dsa".asInstanceOf[dsa_]
  
  inline def ecdsa: ecdsa_ = "ecdsa".asInstanceOf[ecdsa_]
  
  inline def ed25519: typingsJapgolly.sshpk.sshpkStrings.ed25519 = "ed25519".asInstanceOf[typingsJapgolly.sshpk.sshpkStrings.ed25519]
  
  inline def rsa: rsa_ = "rsa".asInstanceOf[rsa_]
}
