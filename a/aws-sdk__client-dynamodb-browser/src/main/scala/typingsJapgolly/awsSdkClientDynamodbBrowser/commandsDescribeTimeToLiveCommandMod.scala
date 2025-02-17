package typingsJapgolly.awsSdkClientDynamodbBrowser

import typingsJapgolly.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesDescribeTimeToLiveInputMod.DescribeTimeToLiveInput
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesDescribeTimeToLiveOutputMod.DescribeTimeToLiveOutput
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDescribeTimeToLiveCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-browser/commands/DescribeTimeToLiveCommand", "DescribeTimeToLiveCommand")
  @js.native
  open class DescribeTimeToLiveCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DescribeTimeToLiveInput, 
          OutputTypesUnion, 
          DescribeTimeToLiveOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: DescribeTimeToLiveInput) = this()
    
    /* CompleteClass */
    override val input: DescribeTimeToLiveInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DescribeTimeToLiveInput, DescribeTimeToLiveOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeTimeToLiveInput, DescribeTimeToLiveOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: Any
    ): Handler[DescribeTimeToLiveInput, DescribeTimeToLiveOutput] = js.native
  }
}
