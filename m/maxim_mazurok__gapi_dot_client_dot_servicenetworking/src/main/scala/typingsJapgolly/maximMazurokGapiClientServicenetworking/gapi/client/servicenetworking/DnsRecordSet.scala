package typingsJapgolly.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DnsRecordSet extends StObject {
  
  /** Required. As defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1) for examples see https://cloud.google.com/dns/records/json-record. */
  var data: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Required. The DNS or domain name of the record set, e.g. `test.example.com`. */
  var domain: js.UndefOr[String] = js.undefined
  
  /** Required. The period of time for which this RecordSet can be cached by resolvers. */
  var ttl: js.UndefOr[String] = js.undefined
  
  /** Required. The identifier of a supported record type. */
  var `type`: js.UndefOr[String] = js.undefined
}
object DnsRecordSet {
  
  inline def apply(): DnsRecordSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnsRecordSet]
  }
  
  extension [Self <: DnsRecordSet](x: Self) {
    
    inline def setData(value: js.Array[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: String*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
