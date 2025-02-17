package typingsJapgolly.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendCustomVerificationEmailResponse extends StObject {
  
  /**
    * The unique message identifier returned from the SendCustomVerificationEmail operation.
    */
  var MessageId: js.UndefOr[typingsJapgolly.awsSdk.clientsSesMod.MessageId] = js.undefined
}
object SendCustomVerificationEmailResponse {
  
  inline def apply(): SendCustomVerificationEmailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendCustomVerificationEmailResponse]
  }
  
  extension [Self <: SendCustomVerificationEmailResponse](x: Self) {
    
    inline def setMessageId(value: MessageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "MessageId", js.undefined)
  }
}
