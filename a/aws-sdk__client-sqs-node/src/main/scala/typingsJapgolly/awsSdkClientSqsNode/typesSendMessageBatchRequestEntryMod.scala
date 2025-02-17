package typingsJapgolly.awsSdkClientSqsNode

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdkClientSqsNode.typesMessageAttributeValueMod.MessageAttributeValue
import typingsJapgolly.awsSdkClientSqsNode.typesMessageAttributeValueMod.UnmarshalledMessageAttributeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSendMessageBatchRequestEntryMod {
  
  trait SendMessageBatchRequestEntry extends StObject {
    
    /**
      * <p>The length of time, in seconds, for which a specific message is delayed. Valid values: 0 to 900. Maximum: 15 minutes. Messages with a positive <code>DelaySeconds</code> value become available for processing after the delay period is finished. If you don't specify a value, the default value for the queue is applied. </p> <note> <p>When you set <code>FifoQueue</code>, you can't set <code>DelaySeconds</code> per message. You can set this parameter only on a queue level.</p> </note>
      */
    var DelaySeconds: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>An identifier for a message in this batch used to communicate the result.</p> <note> <p>The <code>Id</code>s of a batch request need to be unique within a request</p> <p>This identifier can have up to 80 characters. The following characters are accepted: alphanumeric characters, hyphens(-), and underscores (_).</p> </note>
      */
    var Id: String
    
    /**
      * <p>Each message attribute consists of a <code>Name</code>, <code>Type</code>, and <code>Value</code>. For more information, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html">Amazon SQS Message Attributes</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.</p>
      */
    var MessageAttributes: js.UndefOr[
        StringDictionary[MessageAttributeValue] | (js.Iterable[js.Tuple2[String, MessageAttributeValue]])
      ] = js.undefined
    
    /**
      * <p>The body of the message.</p>
      */
    var MessageBody: String
    
    /**
      * <p>This parameter applies only to FIFO (first-in-first-out) queues.</p> <p>The token used for deduplication of messages within a 5-minute minimum deduplication interval. If a message with a particular <code>MessageDeduplicationId</code> is sent successfully, subsequent messages with the same <code>MessageDeduplicationId</code> are accepted successfully but aren't delivered. For more information, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"> Exactly-Once Processing</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.</p> <ul> <li> <p>Every message must have a unique <code>MessageDeduplicationId</code>,</p> <ul> <li> <p>You may provide a <code>MessageDeduplicationId</code> explicitly.</p> </li> <li> <p>If you aren't able to provide a <code>MessageDeduplicationId</code> and you enable <code>ContentBasedDeduplication</code> for your queue, Amazon SQS uses a SHA-256 hash to generate the <code>MessageDeduplicationId</code> using the body of the message (but not the attributes of the message). </p> </li> <li> <p>If you don't provide a <code>MessageDeduplicationId</code> and the queue doesn't have <code>ContentBasedDeduplication</code> set, the action fails with an error.</p> </li> <li> <p>If the queue has <code>ContentBasedDeduplication</code> set, your <code>MessageDeduplicationId</code> overrides the generated one.</p> </li> </ul> </li> <li> <p>When <code>ContentBasedDeduplication</code> is in effect, messages with identical content sent within the deduplication interval are treated as duplicates and only one copy of the message is delivered.</p> </li> <li> <p>If you send one message with <code>ContentBasedDeduplication</code> enabled and then another message with a <code>MessageDeduplicationId</code> that is the same as the one generated for the first <code>MessageDeduplicationId</code>, the two messages are treated as duplicates and only one copy of the message is delivered. </p> </li> </ul> <note> <p>The <code>MessageDeduplicationId</code> is available to the consumer of the message (this can be useful for troubleshooting delivery issues).</p> <p>If a message is sent successfully but the acknowledgement is lost and the message is resent with the same <code>MessageDeduplicationId</code> after the deduplication interval, Amazon SQS can't detect duplicate messages.</p> <p>Amazon SQS continues to keep track of the message deduplication ID even after the message is received and deleted.</p> </note> <p>The length of <code>MessageDeduplicationId</code> is 128 characters. <code>MessageDeduplicationId</code> can contain alphanumeric characters (<code>a-z</code>, <code>A-Z</code>, <code>0-9</code>) and punctuation (<code>!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~</code>).</p> <p>For best practices of using <code>MessageDeduplicationId</code>, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagededuplicationid-property.html">Using the MessageDeduplicationId Property</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.</p>
      */
    var MessageDeduplicationId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>This parameter applies only to FIFO (first-in-first-out) queues.</p> <p>The tag that specifies that a message belongs to a specific message group. Messages that belong to the same message group are processed in a FIFO manner (however, messages in different message groups might be processed out of order). To interleave multiple ordered streams within a single queue, use <code>MessageGroupId</code> values (for example, session data for multiple users). In this scenario, multiple consumers can process the queue, but the session data of each user is processed in a FIFO fashion.</p> <ul> <li> <p>You must associate a non-empty <code>MessageGroupId</code> with a message. If you don't provide a <code>MessageGroupId</code>, the action fails.</p> </li> <li> <p> <code>ReceiveMessage</code> might return messages with multiple <code>MessageGroupId</code> values. For each <code>MessageGroupId</code>, the messages are sorted by time sent. The caller can't specify a <code>MessageGroupId</code>.</p> </li> </ul> <p>The length of <code>MessageGroupId</code> is 128 characters. Valid values: alphanumeric characters and punctuation <code>(!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~)</code>.</p> <p>For best practices of using <code>MessageGroupId</code>, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagegroupid-property.html">Using the MessageGroupId Property</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.</p> <important> <p> <code>MessageGroupId</code> is required for FIFO queues. You can't use it for Standard queues.</p> </important>
      */
    var MessageGroupId: js.UndefOr[String] = js.undefined
  }
  object SendMessageBatchRequestEntry {
    
    inline def apply(Id: String, MessageBody: String): SendMessageBatchRequestEntry = {
      val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], MessageBody = MessageBody.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendMessageBatchRequestEntry]
    }
    
    extension [Self <: SendMessageBatchRequestEntry](x: Self) {
      
      inline def setDelaySeconds(value: Double): Self = StObject.set(x, "DelaySeconds", value.asInstanceOf[js.Any])
      
      inline def setDelaySecondsUndefined: Self = StObject.set(x, "DelaySeconds", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setMessageAttributes(
        value: StringDictionary[MessageAttributeValue] | (js.Iterable[js.Tuple2[String, MessageAttributeValue]])
      ): Self = StObject.set(x, "MessageAttributes", value.asInstanceOf[js.Any])
      
      inline def setMessageAttributesUndefined: Self = StObject.set(x, "MessageAttributes", js.undefined)
      
      inline def setMessageBody(value: String): Self = StObject.set(x, "MessageBody", value.asInstanceOf[js.Any])
      
      inline def setMessageDeduplicationId(value: String): Self = StObject.set(x, "MessageDeduplicationId", value.asInstanceOf[js.Any])
      
      inline def setMessageDeduplicationIdUndefined: Self = StObject.set(x, "MessageDeduplicationId", js.undefined)
      
      inline def setMessageGroupId(value: String): Self = StObject.set(x, "MessageGroupId", value.asInstanceOf[js.Any])
      
      inline def setMessageGroupIdUndefined: Self = StObject.set(x, "MessageGroupId", js.undefined)
    }
  }
  
  trait UnmarshalledSendMessageBatchRequestEntry
    extends StObject
       with SendMessageBatchRequestEntry {
    
    /**
      * <p>Each message attribute consists of a <code>Name</code>, <code>Type</code>, and <code>Value</code>. For more information, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html">Amazon SQS Message Attributes</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.</p>
      */
    @JSName("MessageAttributes")
    var MessageAttributes_UnmarshalledSendMessageBatchRequestEntry: js.UndefOr[StringDictionary[UnmarshalledMessageAttributeValue]] = js.undefined
  }
  object UnmarshalledSendMessageBatchRequestEntry {
    
    inline def apply(Id: String, MessageBody: String): UnmarshalledSendMessageBatchRequestEntry = {
      val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], MessageBody = MessageBody.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledSendMessageBatchRequestEntry]
    }
    
    extension [Self <: UnmarshalledSendMessageBatchRequestEntry](x: Self) {
      
      inline def setMessageAttributes(value: StringDictionary[UnmarshalledMessageAttributeValue]): Self = StObject.set(x, "MessageAttributes", value.asInstanceOf[js.Any])
      
      inline def setMessageAttributesUndefined: Self = StObject.set(x, "MessageAttributes", js.undefined)
    }
  }
}
