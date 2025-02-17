package typingsJapgolly.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2CreateInspectTemplateRequest extends StObject {
  
  /** Required. The InspectTemplate to create. */
  var inspectTemplate: js.UndefOr[GooglePrivacyDlpV2InspectTemplate] = js.undefined
  
  /** Deprecated. This field has no effect. */
  var locationId: js.UndefOr[String] = js.undefined
  
  /**
    * The template id can contain uppercase and lowercase letters, numbers, and hyphens; that is, it must match the regular expression: `[a-zA-Z\d-_]+`. The maximum length is 100
    * characters. Can be empty to allow the system to generate one.
    */
  var templateId: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2CreateInspectTemplateRequest {
  
  inline def apply(): GooglePrivacyDlpV2CreateInspectTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2CreateInspectTemplateRequest]
  }
  
  extension [Self <: GooglePrivacyDlpV2CreateInspectTemplateRequest](x: Self) {
    
    inline def setInspectTemplate(value: GooglePrivacyDlpV2InspectTemplate): Self = StObject.set(x, "inspectTemplate", value.asInstanceOf[js.Any])
    
    inline def setInspectTemplateUndefined: Self = StObject.set(x, "inspectTemplate", js.undefined)
    
    inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    inline def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    inline def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
  }
}
