package typingsJapgolly.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parameters for card networks that can be used in this request.
  *
  * This should only be set for [[PaymentMethodType|`CARD`]].
  */
trait CardNetworkParameters extends StObject {
  
  /**
    * Acquiring institution identification code as assigned by the DS
    * receiving the AReq message for the given card network.
    *
    * This is an optional field. We recommend setting this field to allow
    * SCA challenges to be done for the given card network.
    */
  var acquirerBin: js.UndefOr[String] = js.undefined
  
  /**
    * Acquirer-assigned Merchant identifier for VISA.
    *
    * This is an optional field. We recommend setting this field to allow
    * SCA challenges to be done for the given card network.
    */
  var acquirerMerchantId: js.UndefOr[String] = js.undefined
  
  /**
    * Type of card network parameters. Currently only
    * [[CardNetwork|`VISA`]] and [[CardNetwork|`MASTERCARD`]] are
    * supported.
    *
    * This field is required.
    */
  var cardNetwork: CardNetwork
}
object CardNetworkParameters {
  
  inline def apply(cardNetwork: CardNetwork): CardNetworkParameters = {
    val __obj = js.Dynamic.literal(cardNetwork = cardNetwork.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardNetworkParameters]
  }
  
  extension [Self <: CardNetworkParameters](x: Self) {
    
    inline def setAcquirerBin(value: String): Self = StObject.set(x, "acquirerBin", value.asInstanceOf[js.Any])
    
    inline def setAcquirerBinUndefined: Self = StObject.set(x, "acquirerBin", js.undefined)
    
    inline def setAcquirerMerchantId(value: String): Self = StObject.set(x, "acquirerMerchantId", value.asInstanceOf[js.Any])
    
    inline def setAcquirerMerchantIdUndefined: Self = StObject.set(x, "acquirerMerchantId", js.undefined)
    
    inline def setCardNetwork(value: CardNetwork): Self = StObject.set(x, "cardNetwork", value.asInstanceOf[js.Any])
  }
}
