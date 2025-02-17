package typingsJapgolly.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1ResponseMessage extends StObject {
  
  /** Indicates that the conversation succeeded. */
  var conversationSuccess: js.UndefOr[GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccess] = js.undefined
  
  /**
    * Output only. A signal that indicates the interaction with the Dialogflow agent has ended. This message is generated by Dialogflow only when the conversation reaches `END_SESSION`
    * page. It is not supposed to be defined by the user. It's guaranteed that there is at most one such message in each response.
    */
  var endInteraction: js.UndefOr[Any] = js.undefined
  
  /** Hands off conversation to a human agent. */
  var liveAgentHandoff: js.UndefOr[GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoff] = js.undefined
  
  /**
    * Output only. An audio response message composed of both the synthesized Dialogflow agent responses and responses defined via play_audio. This message is generated by Dialogflow only
    * and not supposed to be defined by the user.
    */
  var mixedAudio: js.UndefOr[GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudio] = js.undefined
  
  /** A text or ssml response that is preferentially used for TTS output audio synthesis, as described in the comment on the ResponseMessage message. */
  var outputAudioText: js.UndefOr[GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioText] = js.undefined
  
  /** Returns a response containing a custom, platform-specific payload. */
  var payload: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /**
    * Signal that the client should play an audio clip hosted at a client-specific URI. Dialogflow uses this to construct mixed_audio. However, Dialogflow itself does not try to read or
    * process the URI in any way.
    */
  var playAudio: js.UndefOr[GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudio] = js.undefined
  
  /** A signal that the client should transfer the phone call connected to this agent to a third-party endpoint. */
  var telephonyTransferCall: js.UndefOr[GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCall] = js.undefined
  
  /** Returns a text response. */
  var text: js.UndefOr[GoogleCloudDialogflowCxV3beta1ResponseMessageText] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1ResponseMessage {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1ResponseMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1ResponseMessage]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3beta1ResponseMessage](x: Self) {
    
    inline def setConversationSuccess(value: GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccess): Self = StObject.set(x, "conversationSuccess", value.asInstanceOf[js.Any])
    
    inline def setConversationSuccessUndefined: Self = StObject.set(x, "conversationSuccess", js.undefined)
    
    inline def setEndInteraction(value: Any): Self = StObject.set(x, "endInteraction", value.asInstanceOf[js.Any])
    
    inline def setEndInteractionUndefined: Self = StObject.set(x, "endInteraction", js.undefined)
    
    inline def setLiveAgentHandoff(value: GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoff): Self = StObject.set(x, "liveAgentHandoff", value.asInstanceOf[js.Any])
    
    inline def setLiveAgentHandoffUndefined: Self = StObject.set(x, "liveAgentHandoff", js.undefined)
    
    inline def setMixedAudio(value: GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudio): Self = StObject.set(x, "mixedAudio", value.asInstanceOf[js.Any])
    
    inline def setMixedAudioUndefined: Self = StObject.set(x, "mixedAudio", js.undefined)
    
    inline def setOutputAudioText(value: GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioText): Self = StObject.set(x, "outputAudioText", value.asInstanceOf[js.Any])
    
    inline def setOutputAudioTextUndefined: Self = StObject.set(x, "outputAudioText", js.undefined)
    
    inline def setPayload(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setPlayAudio(value: GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudio): Self = StObject.set(x, "playAudio", value.asInstanceOf[js.Any])
    
    inline def setPlayAudioUndefined: Self = StObject.set(x, "playAudio", js.undefined)
    
    inline def setTelephonyTransferCall(value: GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCall): Self = StObject.set(x, "telephonyTransferCall", value.asInstanceOf[js.Any])
    
    inline def setTelephonyTransferCallUndefined: Self = StObject.set(x, "telephonyTransferCall", js.undefined)
    
    inline def setText(value: GoogleCloudDialogflowCxV3beta1ResponseMessageText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
