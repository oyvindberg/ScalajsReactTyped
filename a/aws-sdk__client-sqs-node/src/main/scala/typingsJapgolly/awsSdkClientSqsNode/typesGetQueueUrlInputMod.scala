package typingsJapgolly.awsSdkClientSqsNode

import typingsJapgolly.awsSdkClientSqsNode.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesAbortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetQueueUrlInputMod {
  
  trait GetQueueUrlInput
    extends StObject
       with InputTypesUnion {
    
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ] = js.undefined
    
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The name of the queue whose URL must be fetched. Maximum 80 characters. Valid values: alphanumeric characters, hyphens (<code>-</code>), and underscores (<code>_</code>).</p> <p>Queue URLs and names are case-sensitive.</p>
      */
    var QueueName: String
    
    /**
      * <p>The AWS account ID of the account that created the queue.</p>
      */
    var QueueOwnerAWSAccountId: js.UndefOr[String] = js.undefined
  }
  object GetQueueUrlInput {
    
    inline def apply(QueueName: String): GetQueueUrlInput = {
      val __obj = js.Dynamic.literal(QueueName = QueueName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetQueueUrlInput]
    }
    
    extension [Self <: GetQueueUrlInput](x: Self) {
      
      inline def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      inline def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      inline def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      inline def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      inline def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      inline def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      inline def setQueueName(value: String): Self = StObject.set(x, "QueueName", value.asInstanceOf[js.Any])
      
      inline def setQueueOwnerAWSAccountId(value: String): Self = StObject.set(x, "QueueOwnerAWSAccountId", value.asInstanceOf[js.Any])
      
      inline def setQueueOwnerAWSAccountIdUndefined: Self = StObject.set(x, "QueueOwnerAWSAccountId", js.undefined)
    }
  }
}
