package typingsJapgolly.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCall extends StObject {
  
  /** Required. The phone number to transfer the call to in [E.164 format](https://en.wikipedia.org/wiki/E.164). We currently only allow transferring to US numbers (+1xxxyyyzzzz). */
  var phoneNumber: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCall {
  
  inline def apply(): GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCall]
  }
  
  extension [Self <: GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCall](x: Self) {
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
  }
}
