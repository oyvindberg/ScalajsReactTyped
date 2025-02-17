package typingsJapgolly.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBandwidthRateLimitScheduleInput extends StObject {
  
  /**
    *  An array containing bandwidth rate limit schedule intervals for a gateway. When no bandwidth rate limit intervals have been scheduled, the array is empty. 
    */
  var BandwidthRateLimitIntervals: typingsJapgolly.awsSdk.clientsStoragegatewayMod.BandwidthRateLimitIntervals
  
  var GatewayARN: typingsJapgolly.awsSdk.clientsStoragegatewayMod.GatewayARN
}
object UpdateBandwidthRateLimitScheduleInput {
  
  inline def apply(BandwidthRateLimitIntervals: BandwidthRateLimitIntervals, GatewayARN: GatewayARN): UpdateBandwidthRateLimitScheduleInput = {
    val __obj = js.Dynamic.literal(BandwidthRateLimitIntervals = BandwidthRateLimitIntervals.asInstanceOf[js.Any], GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBandwidthRateLimitScheduleInput]
  }
  
  extension [Self <: UpdateBandwidthRateLimitScheduleInput](x: Self) {
    
    inline def setBandwidthRateLimitIntervals(value: BandwidthRateLimitIntervals): Self = StObject.set(x, "BandwidthRateLimitIntervals", value.asInstanceOf[js.Any])
    
    inline def setBandwidthRateLimitIntervalsVarargs(value: BandwidthRateLimitInterval*): Self = StObject.set(x, "BandwidthRateLimitIntervals", js.Array(value*))
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
  }
}
