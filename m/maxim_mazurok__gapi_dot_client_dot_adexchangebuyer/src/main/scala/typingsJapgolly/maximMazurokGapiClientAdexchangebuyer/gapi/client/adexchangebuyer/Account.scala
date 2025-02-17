package typingsJapgolly.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typingsJapgolly.maximMazurokGapiClientAdexchangebuyer.anon.BidProtocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Account extends StObject {
  
  /**
    * When this is false, bid requests that include a deal ID for a private auction or preferred deal are always sent to your bidder. When true, all active pretargeting configs will be
    * applied to private auctions and preferred deals. Programmatic Guaranteed deals (when enabled) are always sent to your bidder.
    */
  var applyPretargetingToNonGuaranteedDeals: js.UndefOr[Boolean] = js.undefined
  
  /** Your bidder locations that have distinct URLs. */
  var bidderLocation: js.UndefOr[js.Array[BidProtocol]] = js.undefined
  
  /** The nid parameter value used in cookie match requests. Please contact your technical account manager if you need to change this. */
  var cookieMatchingNid: js.UndefOr[String] = js.undefined
  
  /** The base URL used in cookie match requests. */
  var cookieMatchingUrl: js.UndefOr[String] = js.undefined
  
  /** Account id. */
  var id: js.UndefOr[Double] = js.undefined
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of active creatives that an account can have, where a creative is active if it was inserted or bid with in the last 30 days. Please contact your technical account
    * manager if you need to change this.
    */
  var maximumActiveCreatives: js.UndefOr[Double] = js.undefined
  
  /** The sum of all bidderLocation.maximumQps values cannot exceed this. Please contact your technical account manager if you need to change this. */
  var maximumTotalQps: js.UndefOr[Double] = js.undefined
  
  /** The number of creatives that this account inserted or bid with in the last 30 days. */
  var numberActiveCreatives: js.UndefOr[Double] = js.undefined
}
object Account {
  
  inline def apply(): Account = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Account]
  }
  
  extension [Self <: Account](x: Self) {
    
    inline def setApplyPretargetingToNonGuaranteedDeals(value: Boolean): Self = StObject.set(x, "applyPretargetingToNonGuaranteedDeals", value.asInstanceOf[js.Any])
    
    inline def setApplyPretargetingToNonGuaranteedDealsUndefined: Self = StObject.set(x, "applyPretargetingToNonGuaranteedDeals", js.undefined)
    
    inline def setBidderLocation(value: js.Array[BidProtocol]): Self = StObject.set(x, "bidderLocation", value.asInstanceOf[js.Any])
    
    inline def setBidderLocationUndefined: Self = StObject.set(x, "bidderLocation", js.undefined)
    
    inline def setBidderLocationVarargs(value: BidProtocol*): Self = StObject.set(x, "bidderLocation", js.Array(value*))
    
    inline def setCookieMatchingNid(value: String): Self = StObject.set(x, "cookieMatchingNid", value.asInstanceOf[js.Any])
    
    inline def setCookieMatchingNidUndefined: Self = StObject.set(x, "cookieMatchingNid", js.undefined)
    
    inline def setCookieMatchingUrl(value: String): Self = StObject.set(x, "cookieMatchingUrl", value.asInstanceOf[js.Any])
    
    inline def setCookieMatchingUrlUndefined: Self = StObject.set(x, "cookieMatchingUrl", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMaximumActiveCreatives(value: Double): Self = StObject.set(x, "maximumActiveCreatives", value.asInstanceOf[js.Any])
    
    inline def setMaximumActiveCreativesUndefined: Self = StObject.set(x, "maximumActiveCreatives", js.undefined)
    
    inline def setMaximumTotalQps(value: Double): Self = StObject.set(x, "maximumTotalQps", value.asInstanceOf[js.Any])
    
    inline def setMaximumTotalQpsUndefined: Self = StObject.set(x, "maximumTotalQps", js.undefined)
    
    inline def setNumberActiveCreatives(value: Double): Self = StObject.set(x, "numberActiveCreatives", value.asInstanceOf[js.Any])
    
    inline def setNumberActiveCreativesUndefined: Self = StObject.set(x, "numberActiveCreatives", js.undefined)
  }
}
