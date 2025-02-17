package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrafficMirrorSession extends StObject {
  
  /**
    * The description of the Traffic Mirror session.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Traffic Mirror session's network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the account that owns the Traffic Mirror session.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The number of bytes in each packet to mirror. These are the bytes after the VXLAN header. To mirror a subset, set this to the length (in bytes) to mirror. For example, if you set this value to 100, then the first 100 bytes that meet the filter criteria are copied to the target. Do not specify this parameter when you want to mirror the entire packet
    */
  var PacketLength: js.UndefOr[Integer] = js.undefined
  
  /**
    * The session number determines the order in which sessions are evaluated when an interface is used by multiple sessions. The first session with a matching filter is the one that mirrors the packets. Valid values are 1-32766.
    */
  var SessionNumber: js.UndefOr[Integer] = js.undefined
  
  /**
    * The tags assigned to the Traffic Mirror session.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of the Traffic Mirror filter.
    */
  var TrafficMirrorFilterId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID for the Traffic Mirror session.
    */
  var TrafficMirrorSessionId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Traffic Mirror target.
    */
  var TrafficMirrorTargetId: js.UndefOr[String] = js.undefined
  
  /**
    * The virtual network ID associated with the Traffic Mirror session.
    */
  var VirtualNetworkId: js.UndefOr[Integer] = js.undefined
}
object TrafficMirrorSession {
  
  inline def apply(): TrafficMirrorSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficMirrorSession]
  }
  
  extension [Self <: TrafficMirrorSession](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setNetworkInterfaceId(value: String): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setPacketLength(value: Integer): Self = StObject.set(x, "PacketLength", value.asInstanceOf[js.Any])
    
    inline def setPacketLengthUndefined: Self = StObject.set(x, "PacketLength", js.undefined)
    
    inline def setSessionNumber(value: Integer): Self = StObject.set(x, "SessionNumber", value.asInstanceOf[js.Any])
    
    inline def setSessionNumberUndefined: Self = StObject.set(x, "SessionNumber", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTrafficMirrorFilterId(value: String): Self = StObject.set(x, "TrafficMirrorFilterId", value.asInstanceOf[js.Any])
    
    inline def setTrafficMirrorFilterIdUndefined: Self = StObject.set(x, "TrafficMirrorFilterId", js.undefined)
    
    inline def setTrafficMirrorSessionId(value: String): Self = StObject.set(x, "TrafficMirrorSessionId", value.asInstanceOf[js.Any])
    
    inline def setTrafficMirrorSessionIdUndefined: Self = StObject.set(x, "TrafficMirrorSessionId", js.undefined)
    
    inline def setTrafficMirrorTargetId(value: String): Self = StObject.set(x, "TrafficMirrorTargetId", value.asInstanceOf[js.Any])
    
    inline def setTrafficMirrorTargetIdUndefined: Self = StObject.set(x, "TrafficMirrorTargetId", js.undefined)
    
    inline def setVirtualNetworkId(value: Integer): Self = StObject.set(x, "VirtualNetworkId", value.asInstanceOf[js.Any])
    
    inline def setVirtualNetworkIdUndefined: Self = StObject.set(x, "VirtualNetworkId", js.undefined)
  }
}
