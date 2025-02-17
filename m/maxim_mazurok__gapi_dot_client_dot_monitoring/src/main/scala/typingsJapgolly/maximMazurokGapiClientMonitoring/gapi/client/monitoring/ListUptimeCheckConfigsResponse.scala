package typingsJapgolly.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUptimeCheckConfigsResponse extends StObject {
  
  /**
    * This field represents the pagination token to retrieve the next page of results. If the value is empty, it means no further results for the request. To retrieve the next page of
    * results, the value of the next_page_token is passed to the subsequent List method call (in the request message's page_token field).
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The total number of Uptime check configurations for the project, irrespective of any pagination. */
  var totalSize: js.UndefOr[Double] = js.undefined
  
  /** The returned Uptime check configurations. */
  var uptimeCheckConfigs: js.UndefOr[js.Array[UptimeCheckConfig]] = js.undefined
}
object ListUptimeCheckConfigsResponse {
  
  inline def apply(): ListUptimeCheckConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUptimeCheckConfigsResponse]
  }
  
  extension [Self <: ListUptimeCheckConfigsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
    
    inline def setUptimeCheckConfigs(value: js.Array[UptimeCheckConfig]): Self = StObject.set(x, "uptimeCheckConfigs", value.asInstanceOf[js.Any])
    
    inline def setUptimeCheckConfigsUndefined: Self = StObject.set(x, "uptimeCheckConfigs", js.undefined)
    
    inline def setUptimeCheckConfigsVarargs(value: UptimeCheckConfig*): Self = StObject.set(x, "uptimeCheckConfigs", js.Array(value*))
  }
}
