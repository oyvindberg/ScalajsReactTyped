package typingsJapgolly.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailMessageActivity extends StObject {
  
  /**
    * Specifies the sender address for an email message that's sent to participants in the journey.
    */
  var MessageConfig: js.UndefOr[JourneyEmailMessage] = js.undefined
  
  /**
    * The unique identifier for the next activity to perform, after the message is sent.
    */
  var NextActivity: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the email message template to use for the message. If specified, this value must match the name of an existing message template.
    */
  var TemplateName: js.UndefOr[string] = js.undefined
  
  /**
    * The unique identifier for the version of the email template to use for the message. If specified, this value must match the identifier for an existing template version. To retrieve a list of versions and version identifiers for a template, use the Template Versions resource. If you don't specify a value for this property, Amazon Pinpoint uses the active version of the template. The active version is typically the version of a template that's been most recently reviewed and approved for use, depending on your workflow. It isn't necessarily the latest version of a template.
    */
  var TemplateVersion: js.UndefOr[string] = js.undefined
}
object EmailMessageActivity {
  
  inline def apply(): EmailMessageActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailMessageActivity]
  }
  
  extension [Self <: EmailMessageActivity](x: Self) {
    
    inline def setMessageConfig(value: JourneyEmailMessage): Self = StObject.set(x, "MessageConfig", value.asInstanceOf[js.Any])
    
    inline def setMessageConfigUndefined: Self = StObject.set(x, "MessageConfig", js.undefined)
    
    inline def setNextActivity(value: string): Self = StObject.set(x, "NextActivity", value.asInstanceOf[js.Any])
    
    inline def setNextActivityUndefined: Self = StObject.set(x, "NextActivity", js.undefined)
    
    inline def setTemplateName(value: string): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
    
    inline def setTemplateNameUndefined: Self = StObject.set(x, "TemplateName", js.undefined)
    
    inline def setTemplateVersion(value: string): Self = StObject.set(x, "TemplateVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateVersionUndefined: Self = StObject.set(x, "TemplateVersion", js.undefined)
  }
}
