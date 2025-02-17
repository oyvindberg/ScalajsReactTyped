package typingsJapgolly.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChannelMessageRequest extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: ChimeArn
  
  /**
    * The AppInstanceUserArn of the user that makes the API call.
    */
  var ChimeBearer: ChimeArn
  
  /**
    * The ID of the message.
    */
  var MessageId: typingsJapgolly.awsSdk.clientsChimesdkmessagingMod.MessageId
  
  /**
    * The ID of the SubChannel in the request.  Only required when getting messages in a SubChannel that the user belongs to. 
    */
  var SubChannelId: js.UndefOr[typingsJapgolly.awsSdk.clientsChimesdkmessagingMod.SubChannelId] = js.undefined
}
object GetChannelMessageRequest {
  
  inline def apply(ChannelArn: ChimeArn, ChimeBearer: ChimeArn, MessageId: MessageId): GetChannelMessageRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], ChimeBearer = ChimeBearer.asInstanceOf[js.Any], MessageId = MessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChannelMessageRequest]
  }
  
  extension [Self <: GetChannelMessageRequest](x: Self) {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChimeBearer(value: ChimeArn): Self = StObject.set(x, "ChimeBearer", value.asInstanceOf[js.Any])
    
    inline def setMessageId(value: MessageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    inline def setSubChannelId(value: SubChannelId): Self = StObject.set(x, "SubChannelId", value.asInstanceOf[js.Any])
    
    inline def setSubChannelIdUndefined: Self = StObject.set(x, "SubChannelId", js.undefined)
  }
}
