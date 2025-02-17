package typingsJapgolly.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConditionalForwarderRequest extends StObject {
  
  /**
    * The directory ID of the Amazon Web Services directory for which to update the conditional forwarder.
    */
  var DirectoryId: typingsJapgolly.awsSdk.clientsDirectoryserviceMod.DirectoryId
  
  /**
    * The updated IP addresses of the remote DNS server associated with the conditional forwarder.
    */
  var DnsIpAddrs: typingsJapgolly.awsSdk.clientsDirectoryserviceMod.DnsIpAddrs
  
  /**
    * The fully qualified domain name (FQDN) of the remote domain with which you will set up a trust relationship.
    */
  var RemoteDomainName: typingsJapgolly.awsSdk.clientsDirectoryserviceMod.RemoteDomainName
}
object UpdateConditionalForwarderRequest {
  
  inline def apply(DirectoryId: DirectoryId, DnsIpAddrs: DnsIpAddrs, RemoteDomainName: RemoteDomainName): UpdateConditionalForwarderRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], DnsIpAddrs = DnsIpAddrs.asInstanceOf[js.Any], RemoteDomainName = RemoteDomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConditionalForwarderRequest]
  }
  
  extension [Self <: UpdateConditionalForwarderRequest](x: Self) {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setDnsIpAddrs(value: DnsIpAddrs): Self = StObject.set(x, "DnsIpAddrs", value.asInstanceOf[js.Any])
    
    inline def setDnsIpAddrsVarargs(value: IpAddr*): Self = StObject.set(x, "DnsIpAddrs", js.Array(value*))
    
    inline def setRemoteDomainName(value: RemoteDomainName): Self = StObject.set(x, "RemoteDomainName", value.asInstanceOf[js.Any])
  }
}
