package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesAbortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMergeShardsInputMod {
  
  trait MergeShardsInput
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
      * <p>The shard ID of the adjacent shard for the merge.</p>
      */
    var AdjacentShardToMerge: String
    
    /**
      * <p>The shard ID of the shard to combine with the adjacent shard for the merge.</p>
      */
    var ShardToMerge: String
    
    /**
      * <p>The name of the stream for the merge.</p>
      */
    var StreamName: String
  }
  object MergeShardsInput {
    
    inline def apply(AdjacentShardToMerge: String, ShardToMerge: String, StreamName: String): MergeShardsInput = {
      val __obj = js.Dynamic.literal(AdjacentShardToMerge = AdjacentShardToMerge.asInstanceOf[js.Any], ShardToMerge = ShardToMerge.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[MergeShardsInput]
    }
    
    extension [Self <: MergeShardsInput](x: Self) {
      
      inline def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      inline def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      inline def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      inline def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      inline def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      inline def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      inline def setAdjacentShardToMerge(value: String): Self = StObject.set(x, "AdjacentShardToMerge", value.asInstanceOf[js.Any])
      
      inline def setShardToMerge(value: String): Self = StObject.set(x, "ShardToMerge", value.asInstanceOf[js.Any])
      
      inline def setStreamName(value: String): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    }
  }
}
