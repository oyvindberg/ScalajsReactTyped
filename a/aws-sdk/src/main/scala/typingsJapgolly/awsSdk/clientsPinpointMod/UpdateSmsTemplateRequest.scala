package typingsJapgolly.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSmsTemplateRequest extends StObject {
  
  /**
    * Specifies whether to save the updates as a new version of the message template. Valid values are: true, save the updates as a new version; and, false, save the updates to (overwrite) the latest existing version of the template. If you don't specify a value for this parameter, Amazon Pinpoint saves the updates to (overwrites) the latest existing version of the template. If you specify a value of true for this parameter, don't specify a value for the version parameter. Otherwise, an error will occur.
    */
  var CreateNewVersion: js.UndefOr[boolean] = js.undefined
  
  var SMSTemplateRequest: typingsJapgolly.awsSdk.clientsPinpointMod.SMSTemplateRequest
  
  /**
    * The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    */
  var TemplateName: string
  
  /**
    * The unique identifier for the version of the message template to update, retrieve information about, or delete. To retrieve identifiers and other information for all the versions of a template, use the Template Versions resource. If specified, this value must match the identifier for an existing template version. If specified for an update operation, this value must match the identifier for the latest existing version of the template. This restriction helps ensure that race conditions don't occur. If you don't specify a value for this parameter, Amazon Pinpoint does the following: For a get operation, retrieves information about the active version of the template. For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the create-new-version parameter isn't used or is set to false. For a delete operation, deletes the template, including all versions of the template.
    */
  var Version: js.UndefOr[string] = js.undefined
}
object UpdateSmsTemplateRequest {
  
  inline def apply(SMSTemplateRequest: SMSTemplateRequest, TemplateName: string): UpdateSmsTemplateRequest = {
    val __obj = js.Dynamic.literal(SMSTemplateRequest = SMSTemplateRequest.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSmsTemplateRequest]
  }
  
  extension [Self <: UpdateSmsTemplateRequest](x: Self) {
    
    inline def setCreateNewVersion(value: boolean): Self = StObject.set(x, "CreateNewVersion", value.asInstanceOf[js.Any])
    
    inline def setCreateNewVersionUndefined: Self = StObject.set(x, "CreateNewVersion", js.undefined)
    
    inline def setSMSTemplateRequest(value: SMSTemplateRequest): Self = StObject.set(x, "SMSTemplateRequest", value.asInstanceOf[js.Any])
    
    inline def setTemplateName(value: string): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: string): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
