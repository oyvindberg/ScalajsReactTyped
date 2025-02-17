package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCoipPoolRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  The ID of the local gateway route table. 
    */
  var LocalGatewayRouteTableId: LocalGatewayRoutetableId
  
  /**
    *  The tags to assign to the CoIP address pool. 
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
}
object CreateCoipPoolRequest {
  
  inline def apply(LocalGatewayRouteTableId: LocalGatewayRoutetableId): CreateCoipPoolRequest = {
    val __obj = js.Dynamic.literal(LocalGatewayRouteTableId = LocalGatewayRouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCoipPoolRequest]
  }
  
  extension [Self <: CreateCoipPoolRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setLocalGatewayRouteTableId(value: LocalGatewayRoutetableId): Self = StObject.set(x, "LocalGatewayRouteTableId", value.asInstanceOf[js.Any])
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
  }
}
