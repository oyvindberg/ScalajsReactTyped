package typingsJapgolly.awsSdk.clientsSqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendMessageRequest extends StObject {
  
  /**
    *  The length of time, in seconds, for which to delay a specific message. Valid values: 0 to 900. Maximum: 15 minutes. Messages with a positive DelaySeconds value become available for processing after the delay period is finished. If you don't specify a value, the default value for the queue applies.   When you set FifoQueue, you can't set DelaySeconds per message. You can set this parameter only on a queue level. 
    */
  var DelaySeconds: js.UndefOr[Integer] = js.undefined
  
  /**
    * Each message attribute consists of a Name, Type, and Value. For more information, see Amazon SQS message attributes in the Amazon SQS Developer Guide.
    */
  var MessageAttributes: js.UndefOr[MessageBodyAttributeMap] = js.undefined
  
  /**
    * The message to send. The minimum size is one character. The maximum size is 256 KB.  A message can include only XML, JSON, and unformatted text. The following Unicode characters are allowed:  #x9 | #xA | #xD | #x20 to #xD7FF | #xE000 to #xFFFD | #x10000 to #x10FFFF  Any characters not included in this list will be rejected. For more information, see the W3C specification for characters. 
    */
  var MessageBody: String
  
  /**
    * This parameter applies only to FIFO (first-in-first-out) queues. The token used for deduplication of sent messages. If a message with a particular MessageDeduplicationId is sent successfully, any messages sent with the same MessageDeduplicationId are accepted successfully but aren't delivered during the 5-minute deduplication interval. For more information, see  Exactly-once processing in the Amazon SQS Developer Guide.   Every message must have a unique MessageDeduplicationId,   You may provide a MessageDeduplicationId explicitly.   If you aren't able to provide a MessageDeduplicationId and you enable ContentBasedDeduplication for your queue, Amazon SQS uses a SHA-256 hash to generate the MessageDeduplicationId using the body of the message (but not the attributes of the message).    If you don't provide a MessageDeduplicationId and the queue doesn't have ContentBasedDeduplication set, the action fails with an error.   If the queue has ContentBasedDeduplication set, your MessageDeduplicationId overrides the generated one.     When ContentBasedDeduplication is in effect, messages with identical content sent within the deduplication interval are treated as duplicates and only one copy of the message is delivered.   If you send one message with ContentBasedDeduplication enabled and then another message with a MessageDeduplicationId that is the same as the one generated for the first MessageDeduplicationId, the two messages are treated as duplicates and only one copy of the message is delivered.     The MessageDeduplicationId is available to the consumer of the message (this can be useful for troubleshooting delivery issues). If a message is sent successfully but the acknowledgement is lost and the message is resent with the same MessageDeduplicationId after the deduplication interval, Amazon SQS can't detect duplicate messages. Amazon SQS continues to keep track of the message deduplication ID even after the message is received and deleted.  The maximum length of MessageDeduplicationId is 128 characters. MessageDeduplicationId can contain alphanumeric characters (a-z, A-Z, 0-9) and punctuation (!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~). For best practices of using MessageDeduplicationId, see Using the MessageDeduplicationId Property in the Amazon SQS Developer Guide.
    */
  var MessageDeduplicationId: js.UndefOr[String] = js.undefined
  
  /**
    * This parameter applies only to FIFO (first-in-first-out) queues. The tag that specifies that a message belongs to a specific message group. Messages that belong to the same message group are processed in a FIFO manner (however, messages in different message groups might be processed out of order). To interleave multiple ordered streams within a single queue, use MessageGroupId values (for example, session data for multiple users). In this scenario, multiple consumers can process the queue, but the session data of each user is processed in a FIFO fashion.   You must associate a non-empty MessageGroupId with a message. If you don't provide a MessageGroupId, the action fails.    ReceiveMessage might return messages with multiple MessageGroupId values. For each MessageGroupId, the messages are sorted by time sent. The caller can't specify a MessageGroupId.   The length of MessageGroupId is 128 characters. Valid values: alphanumeric characters and punctuation (!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~). For best practices of using MessageGroupId, see Using the MessageGroupId Property in the Amazon SQS Developer Guide.   MessageGroupId is required for FIFO queues. You can't use it for Standard queues. 
    */
  var MessageGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The message system attribute to send. Each message system attribute consists of a Name, Type, and Value.    Currently, the only supported message system attribute is AWSTraceHeader. Its type must be String and its value must be a correctly formatted X-Ray trace header string.   The size of a message system attribute doesn't count towards the total size of a message.   
    */
  var MessageSystemAttributes: js.UndefOr[MessageBodySystemAttributeMap] = js.undefined
  
  /**
    * The URL of the Amazon SQS queue to which a message is sent. Queue URLs and names are case-sensitive.
    */
  var QueueUrl: String
}
object SendMessageRequest {
  
  inline def apply(MessageBody: String, QueueUrl: String): SendMessageRequest = {
    val __obj = js.Dynamic.literal(MessageBody = MessageBody.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessageRequest]
  }
  
  extension [Self <: SendMessageRequest](x: Self) {
    
    inline def setDelaySeconds(value: Integer): Self = StObject.set(x, "DelaySeconds", value.asInstanceOf[js.Any])
    
    inline def setDelaySecondsUndefined: Self = StObject.set(x, "DelaySeconds", js.undefined)
    
    inline def setMessageAttributes(value: MessageBodyAttributeMap): Self = StObject.set(x, "MessageAttributes", value.asInstanceOf[js.Any])
    
    inline def setMessageAttributesUndefined: Self = StObject.set(x, "MessageAttributes", js.undefined)
    
    inline def setMessageBody(value: String): Self = StObject.set(x, "MessageBody", value.asInstanceOf[js.Any])
    
    inline def setMessageDeduplicationId(value: String): Self = StObject.set(x, "MessageDeduplicationId", value.asInstanceOf[js.Any])
    
    inline def setMessageDeduplicationIdUndefined: Self = StObject.set(x, "MessageDeduplicationId", js.undefined)
    
    inline def setMessageGroupId(value: String): Self = StObject.set(x, "MessageGroupId", value.asInstanceOf[js.Any])
    
    inline def setMessageGroupIdUndefined: Self = StObject.set(x, "MessageGroupId", js.undefined)
    
    inline def setMessageSystemAttributes(value: MessageBodySystemAttributeMap): Self = StObject.set(x, "MessageSystemAttributes", value.asInstanceOf[js.Any])
    
    inline def setMessageSystemAttributesUndefined: Self = StObject.set(x, "MessageSystemAttributes", js.undefined)
    
    inline def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
  }
}
