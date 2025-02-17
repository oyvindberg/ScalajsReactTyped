package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsJapgolly.awsSdkClientPinpointBrowser.typesGetGcmChannelInputMod.GetGcmChannelInput
import typingsJapgolly.awsSdkClientPinpointBrowser.typesGetGcmChannelOutputMod.GetGcmChannelOutput
import typingsJapgolly.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetGcmChannelCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetGcmChannelCommand", "GetGcmChannelCommand")
  @js.native
  open class GetGcmChannelCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetGcmChannelInput, 
          OutputTypesUnion, 
          GetGcmChannelOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetGcmChannelInput) = this()
    
    /* CompleteClass */
    override val input: GetGcmChannelInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetGcmChannelInput, GetGcmChannelOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetGcmChannelInput, GetGcmChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[GetGcmChannelInput, GetGcmChannelOutput] = js.native
  }
}
