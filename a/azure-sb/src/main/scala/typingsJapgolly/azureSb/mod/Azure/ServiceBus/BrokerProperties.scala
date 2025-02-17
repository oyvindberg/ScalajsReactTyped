package typingsJapgolly.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<azure-sb.azure-sb.Azure.ServiceBus.IBrokerProperties> */
trait BrokerProperties extends StObject {
  
  var CorrelationId: js.UndefOr[String] = js.undefined
  
  var Label: js.UndefOr[String] = js.undefined
  
  var MessageId: js.UndefOr[String] = js.undefined
  
  var PartitionKey: js.UndefOr[String] = js.undefined
  
  var ReplyTo: js.UndefOr[String] = js.undefined
  
  var ReplyToSessionId: js.UndefOr[String] = js.undefined
  
  var ScheduledEnqueueTimeUtc: js.UndefOr[String] = js.undefined
  
  var SessionId: js.UndefOr[String] = js.undefined
  
  var TimeToLive: js.UndefOr[String] = js.undefined
  
  var To: js.UndefOr[String] = js.undefined
}
object BrokerProperties {
  
  inline def apply(): BrokerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerProperties]
  }
  
  extension [Self <: BrokerProperties](x: Self) {
    
    inline def setCorrelationId(value: String): Self = StObject.set(x, "CorrelationId", value.asInstanceOf[js.Any])
    
    inline def setCorrelationIdUndefined: Self = StObject.set(x, "CorrelationId", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
    
    inline def setMessageId(value: String): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "MessageId", js.undefined)
    
    inline def setPartitionKey(value: String): Self = StObject.set(x, "PartitionKey", value.asInstanceOf[js.Any])
    
    inline def setPartitionKeyUndefined: Self = StObject.set(x, "PartitionKey", js.undefined)
    
    inline def setReplyTo(value: String): Self = StObject.set(x, "ReplyTo", value.asInstanceOf[js.Any])
    
    inline def setReplyToSessionId(value: String): Self = StObject.set(x, "ReplyToSessionId", value.asInstanceOf[js.Any])
    
    inline def setReplyToSessionIdUndefined: Self = StObject.set(x, "ReplyToSessionId", js.undefined)
    
    inline def setReplyToUndefined: Self = StObject.set(x, "ReplyTo", js.undefined)
    
    inline def setScheduledEnqueueTimeUtc(value: String): Self = StObject.set(x, "ScheduledEnqueueTimeUtc", value.asInstanceOf[js.Any])
    
    inline def setScheduledEnqueueTimeUtcUndefined: Self = StObject.set(x, "ScheduledEnqueueTimeUtc", js.undefined)
    
    inline def setSessionId(value: String): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "SessionId", js.undefined)
    
    inline def setTimeToLive(value: String): Self = StObject.set(x, "TimeToLive", value.asInstanceOf[js.Any])
    
    inline def setTimeToLiveUndefined: Self = StObject.set(x, "TimeToLive", js.undefined)
    
    inline def setTo(value: String): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "To", js.undefined)
  }
}
