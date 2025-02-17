package typingsJapgolly.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceiSCSIAttributes extends StObject {
  
  /**
    * Indicates whether mutual CHAP is enabled for the iSCSI target.
    */
  var ChapEnabled: js.UndefOr[scala.Boolean] = js.undefined
  
  /**
    * The network interface identifier of the VTL device.
    */
  var NetworkInterfaceId: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.NetworkInterfaceId] = js.undefined
  
  /**
    * The port used to communicate with iSCSI VTL device targets.
    */
  var NetworkInterfacePort: js.UndefOr[integer] = js.undefined
  
  /**
    * Specifies the unique Amazon Resource Name (ARN) that encodes the iSCSI qualified name(iqn) of a tape drive or media changer target.
    */
  var TargetARN: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.TargetARN] = js.undefined
}
object DeviceiSCSIAttributes {
  
  inline def apply(): DeviceiSCSIAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceiSCSIAttributes]
  }
  
  extension [Self <: DeviceiSCSIAttributes](x: Self) {
    
    inline def setChapEnabled(value: scala.Boolean): Self = StObject.set(x, "ChapEnabled", value.asInstanceOf[js.Any])
    
    inline def setChapEnabledUndefined: Self = StObject.set(x, "ChapEnabled", js.undefined)
    
    inline def setNetworkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    inline def setNetworkInterfacePort(value: integer): Self = StObject.set(x, "NetworkInterfacePort", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfacePortUndefined: Self = StObject.set(x, "NetworkInterfacePort", js.undefined)
    
    inline def setTargetARN(value: TargetARN): Self = StObject.set(x, "TargetARN", value.asInstanceOf[js.Any])
    
    inline def setTargetARNUndefined: Self = StObject.set(x, "TargetARN", js.undefined)
  }
}
