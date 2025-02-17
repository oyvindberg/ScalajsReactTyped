package typingsJapgolly.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWebhookItem extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the webhook.
    */
  var arn: js.UndefOr[WebhookArn] = js.undefined
  
  /**
    * The detail returned for each webhook, such as the webhook authentication type and filter rules.
    */
  var definition: WebhookDefinition
  
  /**
    * The number code of the error.
    */
  var errorCode: js.UndefOr[WebhookErrorCode] = js.undefined
  
  /**
    * The text of the error message about the webhook.
    */
  var errorMessage: js.UndefOr[WebhookErrorMessage] = js.undefined
  
  /**
    * The date and time a webhook was last successfully triggered, in timestamp format.
    */
  var lastTriggered: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies the tags applied to the webhook.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * A unique URL generated by CodePipeline. When a POST request is made to this URL, the defined pipeline is started as long as the body of the post request satisfies the defined authentication and filtering conditions. Deleting and re-creating a webhook makes the old URL invalid and generates a new one.
    */
  var url: WebhookUrl
}
object ListWebhookItem {
  
  inline def apply(definition: WebhookDefinition, url: WebhookUrl): ListWebhookItem = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWebhookItem]
  }
  
  extension [Self <: ListWebhookItem](x: Self) {
    
    inline def setArn(value: WebhookArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setDefinition(value: WebhookDefinition): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setErrorCode(value: WebhookErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorMessage(value: WebhookErrorMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setLastTriggered(value: js.Date): Self = StObject.set(x, "lastTriggered", value.asInstanceOf[js.Any])
    
    inline def setLastTriggeredUndefined: Self = StObject.set(x, "lastTriggered", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setUrl(value: WebhookUrl): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
