package typingsJapgolly.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientWithMultichannelAddresses extends StObject {
  
  /**
    * Address information for a recipient. At a minimum, address or multichannel_addresses is required.
    * If both address and multichannel_addresses are specified only multichannel_addresses will be used.
    *
    */
  var address: js.UndefOr[Address | String] = js.undefined
  
  /**
    * Array of Multichannel Address objects for a recipient. At a minimum, address or multichannel_addresses is required.
    * If both address and multichannel_addresses are specified only multichannel_addresses will be used.
    *
    */
  var multichannel_addresses: js.Array[MultichannelAddress]
}
object RecipientWithMultichannelAddresses {
  
  inline def apply(multichannel_addresses: js.Array[MultichannelAddress]): RecipientWithMultichannelAddresses = {
    val __obj = js.Dynamic.literal(multichannel_addresses = multichannel_addresses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientWithMultichannelAddresses]
  }
  
  extension [Self <: RecipientWithMultichannelAddresses](x: Self) {
    
    inline def setAddress(value: Address | String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setMultichannel_addresses(value: js.Array[MultichannelAddress]): Self = StObject.set(x, "multichannel_addresses", value.asInstanceOf[js.Any])
    
    inline def setMultichannel_addressesVarargs(value: MultichannelAddress*): Self = StObject.set(x, "multichannel_addresses", js.Array(value*))
  }
}
