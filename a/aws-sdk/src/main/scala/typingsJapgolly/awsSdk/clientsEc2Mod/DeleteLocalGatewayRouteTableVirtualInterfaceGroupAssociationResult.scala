package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLocalGatewayRouteTableVirtualInterfaceGroupAssociationResult extends StObject {
  
  var LocalGatewayRouteTableVirtualInterfaceGroupAssociation: js.UndefOr[
    typingsJapgolly.awsSdk.clientsEc2Mod.LocalGatewayRouteTableVirtualInterfaceGroupAssociation
  ] = js.undefined
}
object DeleteLocalGatewayRouteTableVirtualInterfaceGroupAssociationResult {
  
  inline def apply(): DeleteLocalGatewayRouteTableVirtualInterfaceGroupAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteLocalGatewayRouteTableVirtualInterfaceGroupAssociationResult]
  }
  
  extension [Self <: DeleteLocalGatewayRouteTableVirtualInterfaceGroupAssociationResult](x: Self) {
    
    inline def setLocalGatewayRouteTableVirtualInterfaceGroupAssociation(value: LocalGatewayRouteTableVirtualInterfaceGroupAssociation): Self = StObject.set(x, "LocalGatewayRouteTableVirtualInterfaceGroupAssociation", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayRouteTableVirtualInterfaceGroupAssociationUndefined: Self = StObject.set(x, "LocalGatewayRouteTableVirtualInterfaceGroupAssociation", js.undefined)
  }
}
