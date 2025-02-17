package typingsJapgolly.awsSdkClientDynamodbNode

import typingsJapgolly.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsJapgolly.awsSdkClientDynamodbNode.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbNode.typesUpdateTimeToLiveInputMod.UpdateTimeToLiveInput
import typingsJapgolly.awsSdkClientDynamodbNode.typesUpdateTimeToLiveOutputMod.UpdateTimeToLiveOutput
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsUpdateTimeToLiveCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-node/commands/UpdateTimeToLiveCommand", "UpdateTimeToLiveCommand")
  @js.native
  open class UpdateTimeToLiveCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UpdateTimeToLiveInput, 
          OutputTypesUnion, 
          UpdateTimeToLiveOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: UpdateTimeToLiveInput) = this()
    
    /* CompleteClass */
    override val input: UpdateTimeToLiveInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UpdateTimeToLiveInput, UpdateTimeToLiveOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UpdateTimeToLiveInput, UpdateTimeToLiveOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: Any
    ): Handler[UpdateTimeToLiveInput, UpdateTimeToLiveOutput] = js.native
  }
}
