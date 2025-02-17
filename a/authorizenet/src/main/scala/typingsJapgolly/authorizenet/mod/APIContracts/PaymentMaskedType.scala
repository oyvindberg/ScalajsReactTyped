package typingsJapgolly.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.PaymentMaskedType")
@js.native
open class PaymentMaskedType protected () extends StObject {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var bankAccount: Any = js.native
  
  var creditCard: Any = js.native
  
  def getBankAccount(): Any = js.native
  
  def getCreditCard(): Any = js.native
  
  def getTokenInformation(): Any = js.native
  
  def setBankAccount(p_bankAccount: Any): Unit = js.native
  
  def setCreditCard(p_creditCard: Any): Unit = js.native
  
  def setTokenInformation(p_tokenInformation: Any): Unit = js.native
  
  var tokenInformation: Any = js.native
}
