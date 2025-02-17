package typingsJapgolly.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpMapping extends StObject {
  
  /** The IP address assigned. */
  var ipAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The due time for this IP to be retired in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`. This field is only available when the IP is
    * scheduled to be retired.
    */
  var timeToRetire: js.UndefOr[String] = js.undefined
  
  /**
    * The type of this IP address. A `PRIMARY` address is a public address that can accept incoming connections. A `PRIVATE` address is a private address that can accept incoming
    * connections. An `OUTGOING` address is the source address of connections originating from the instance, if supported.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object IpMapping {
  
  inline def apply(): IpMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpMapping]
  }
  
  extension [Self <: IpMapping](x: Self) {
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setTimeToRetire(value: String): Self = StObject.set(x, "timeToRetire", value.asInstanceOf[js.Any])
    
    inline def setTimeToRetireUndefined: Self = StObject.set(x, "timeToRetire", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
