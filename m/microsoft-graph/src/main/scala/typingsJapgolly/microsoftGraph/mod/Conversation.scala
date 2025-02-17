package typingsJapgolly.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conversation
  extends StObject
     with Entity {
  
  /**
    * Indicates whether any of the posts within this Conversation has at least one attachment. Supports $filter (eq, ne) and
    * $search.
    */
  var hasAttachments: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
    */
  var lastDeliveredDateTime: js.UndefOr[String] = js.undefined
  
  // A short summary from the body of the latest post in this conversation. Supports $filter (eq, ne, le, ge).
  var preview: js.UndefOr[String] = js.undefined
  
  // A collection of all the conversation threads in the conversation. A navigation property. Read-only. Nullable.
  var threads: js.UndefOr[NullableOption[js.Array[ConversationThread]]] = js.undefined
  
  // The topic of the conversation. This property can be set when the conversation is created, but it cannot be updated.
  var topic: js.UndefOr[String] = js.undefined
  
  // All the users that sent a message to this Conversation.
  var uniqueSenders: js.UndefOr[js.Array[String]] = js.undefined
}
object Conversation {
  
  inline def apply(): Conversation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conversation]
  }
  
  extension [Self <: Conversation](x: Self) {
    
    inline def setHasAttachments(value: Boolean): Self = StObject.set(x, "hasAttachments", value.asInstanceOf[js.Any])
    
    inline def setHasAttachmentsUndefined: Self = StObject.set(x, "hasAttachments", js.undefined)
    
    inline def setLastDeliveredDateTime(value: String): Self = StObject.set(x, "lastDeliveredDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastDeliveredDateTimeUndefined: Self = StObject.set(x, "lastDeliveredDateTime", js.undefined)
    
    inline def setPreview(value: String): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    
    inline def setThreads(value: NullableOption[js.Array[ConversationThread]]): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
    
    inline def setThreadsNull: Self = StObject.set(x, "threads", null)
    
    inline def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
    
    inline def setThreadsVarargs(value: ConversationThread*): Self = StObject.set(x, "threads", js.Array(value*))
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    
    inline def setUniqueSenders(value: js.Array[String]): Self = StObject.set(x, "uniqueSenders", value.asInstanceOf[js.Any])
    
    inline def setUniqueSendersUndefined: Self = StObject.set(x, "uniqueSenders", js.undefined)
    
    inline def setUniqueSendersVarargs(value: String*): Self = StObject.set(x, "uniqueSenders", js.Array(value*))
  }
}
