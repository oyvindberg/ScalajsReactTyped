package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.typesListObjectVersionsInputMod.ListObjectVersionsInput
import typingsJapgolly.awsSdkClientS3Node.typesListObjectVersionsOutputMod.ListObjectVersionsOutput
import typingsJapgolly.awsSdkClientS3Node.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsListObjectVersionsCommandMod {
  
  @JSImport("@aws-sdk/client-s3-node/commands/ListObjectVersionsCommand", "ListObjectVersionsCommand")
  @js.native
  open class ListObjectVersionsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListObjectVersionsInput, 
          OutputTypesUnion, 
          ListObjectVersionsOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: ListObjectVersionsInput) = this()
    
    /* CompleteClass */
    override val input: ListObjectVersionsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListObjectVersionsInput, ListObjectVersionsOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[ListObjectVersionsInput, ListObjectVersionsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[ListObjectVersionsInput, ListObjectVersionsOutput] = js.native
  }
}
