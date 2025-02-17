package typingsJapgolly.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Callback result for a payment authorization update.
  */
trait PaymentAuthorizationResult extends StObject {
  
  /**
    * Error for the last PaymentData, will be displayed to the user.
    */
  var error: js.UndefOr[PaymentDataError] = js.undefined
  
  /**
    * Represents the state of the transaction after callback is performed.
    */
  var transactionState: TransactionState
}
object PaymentAuthorizationResult {
  
  inline def apply(transactionState: TransactionState): PaymentAuthorizationResult = {
    val __obj = js.Dynamic.literal(transactionState = transactionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentAuthorizationResult]
  }
  
  extension [Self <: PaymentAuthorizationResult](x: Self) {
    
    inline def setError(value: PaymentDataError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setTransactionState(value: TransactionState): Self = StObject.set(x, "transactionState", value.asInstanceOf[js.Any])
  }
}
