package typingsJapgolly.awsSdkClientDynamodbNode

import typingsJapgolly.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsJapgolly.awsSdkClientDynamodbNode.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbNode.typesUntagResourceInputMod.UntagResourceInput
import typingsJapgolly.awsSdkClientDynamodbNode.typesUntagResourceOutputMod.UntagResourceOutput
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsUntagResourceCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-node/commands/UntagResourceCommand", "UntagResourceCommand")
  @js.native
  open class UntagResourceCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UntagResourceInput, 
          OutputTypesUnion, 
          UntagResourceOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: UntagResourceInput) = this()
    
    /* CompleteClass */
    override val input: UntagResourceInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UntagResourceInput, UntagResourceOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UntagResourceInput, UntagResourceOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: Any
    ): Handler[UntagResourceInput, UntagResourceOutput] = js.native
  }
}
