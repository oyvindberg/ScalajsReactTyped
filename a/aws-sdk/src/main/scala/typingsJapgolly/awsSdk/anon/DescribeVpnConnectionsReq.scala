package typingsJapgolly.awsSdk.anon

import typingsJapgolly.awsSdk.clientsEc2Mod.Boolean
import typingsJapgolly.awsSdk.clientsEc2Mod.Filter
import typingsJapgolly.awsSdk.clientsEc2Mod.FilterList
import typingsJapgolly.awsSdk.clientsEc2Mod.VpnConnectionId
import typingsJapgolly.awsSdk.clientsEc2Mod.VpnConnectionIdStringList
import typingsJapgolly.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/ec2.DescribeVpnConnectionsRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeVpnConnectionsReq extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more filters.    customer-gateway-configuration - The configuration information for the customer gateway.    customer-gateway-id - The ID of a customer gateway associated with the VPN connection.    state - The state of the VPN connection (pending | available | deleting | deleted).    option.static-routes-only - Indicates whether the connection has static routes only. Used for devices that do not support Border Gateway Protocol (BGP).    route.destination-cidr-block - The destination CIDR block. This corresponds to the subnet used in a customer data center.    bgp-asn - The BGP Autonomous System Number (ASN) associated with a BGP device.    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.    type - The type of VPN connection. Currently the only supported type is ipsec.1.    vpn-connection-id - The ID of the VPN connection.    vpn-gateway-id - The ID of a virtual private gateway associated with the VPN connection.    transit-gateway-id - The ID of a transit gateway associated with the VPN connection.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * One or more VPN connection IDs. Default: Describes your VPN connections.
    */
  var VpnConnectionIds: js.UndefOr[VpnConnectionIdStringList] = js.undefined
}
object DescribeVpnConnectionsReq {
  
  inline def apply(): DescribeVpnConnectionsReq = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpnConnectionsReq]
  }
  
  extension [Self <: DescribeVpnConnectionsReq](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setVpnConnectionIds(value: VpnConnectionIdStringList): Self = StObject.set(x, "VpnConnectionIds", value.asInstanceOf[js.Any])
    
    inline def setVpnConnectionIdsUndefined: Self = StObject.set(x, "VpnConnectionIds", js.undefined)
    
    inline def setVpnConnectionIdsVarargs(value: VpnConnectionId*): Self = StObject.set(x, "VpnConnectionIds", js.Array(value*))
  }
}
