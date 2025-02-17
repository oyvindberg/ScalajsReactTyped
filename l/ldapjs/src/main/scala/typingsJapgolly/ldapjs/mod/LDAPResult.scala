package typingsJapgolly.ldapjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ldapjs", "LDAPResult")
@js.native
open class LDAPResult () extends LDAPMessage {
  
  var connection: Any = js.native
  
  var errorMessage: String = js.native
  
  var matchedDN: String = js.native
  
  var referrals: js.Array[String] = js.native
  
  /** Result status 0 = success */
  var status: Double = js.native
  
  @JSName("type")
  val type_LDAPResult: typingsJapgolly.ldapjs.ldapjsStrings.LDAPResult = js.native
}
