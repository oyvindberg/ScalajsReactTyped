package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.typesOutputTypesUnionMod._OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutBucketInventoryConfigurationOutputMod {
  
  trait PutBucketInventoryConfigurationOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion
  object PutBucketInventoryConfigurationOutput {
    
    inline def apply($metadata: ResponseMetadata): PutBucketInventoryConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutBucketInventoryConfigurationOutput]
    }
  }
}
