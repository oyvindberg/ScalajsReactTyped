package typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FixedBidStrategy extends StObject {
  
  /**
    * The fixed bid amount, in micros of the advertiser's currency. For insertion order entity, bid_amount_micros should be set as 0. For line item entity, bid_amount_micros must be
    * greater than or equal to billable unit of the given currency and smaller than or equal to the upper limit 1000000000. For example, 1500000 represents 1.5 standard units of the
    * currency.
    */
  var bidAmountMicros: js.UndefOr[String] = js.undefined
}
object FixedBidStrategy {
  
  inline def apply(): FixedBidStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FixedBidStrategy]
  }
  
  extension [Self <: FixedBidStrategy](x: Self) {
    
    inline def setBidAmountMicros(value: String): Self = StObject.set(x, "bidAmountMicros", value.asInstanceOf[js.Any])
    
    inline def setBidAmountMicrosUndefined: Self = StObject.set(x, "bidAmountMicros", js.undefined)
  }
}
