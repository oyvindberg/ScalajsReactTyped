package typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConversionCountingConfig extends StObject {
  
  /**
    * The Floodlight activity configs used to track conversions. The number of conversions counted is the sum of all of the conversions counted by all of the Floodlight activity IDs
    * specified in this field.
    */
  var floodlightActivityConfigs: js.UndefOr[js.Array[TrackingFloodlightActivityConfig]] = js.undefined
  
  /**
    * The percentage of post-view conversions to count, in millis (1/1000 of a percent). Must be between 0 and 100000 inclusive. For example, to track 50% of the post-click conversions,
    * set a value of 50000.
    */
  var postViewCountPercentageMillis: js.UndefOr[String] = js.undefined
}
object ConversionCountingConfig {
  
  inline def apply(): ConversionCountingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversionCountingConfig]
  }
  
  extension [Self <: ConversionCountingConfig](x: Self) {
    
    inline def setFloodlightActivityConfigs(value: js.Array[TrackingFloodlightActivityConfig]): Self = StObject.set(x, "floodlightActivityConfigs", value.asInstanceOf[js.Any])
    
    inline def setFloodlightActivityConfigsUndefined: Self = StObject.set(x, "floodlightActivityConfigs", js.undefined)
    
    inline def setFloodlightActivityConfigsVarargs(value: TrackingFloodlightActivityConfig*): Self = StObject.set(x, "floodlightActivityConfigs", js.Array(value*))
    
    inline def setPostViewCountPercentageMillis(value: String): Self = StObject.set(x, "postViewCountPercentageMillis", value.asInstanceOf[js.Any])
    
    inline def setPostViewCountPercentageMillisUndefined: Self = StObject.set(x, "postViewCountPercentageMillis", js.undefined)
  }
}
