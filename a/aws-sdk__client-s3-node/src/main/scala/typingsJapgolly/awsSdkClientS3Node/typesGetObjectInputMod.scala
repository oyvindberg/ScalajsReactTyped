package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.requester_
import typingsJapgolly.awsSdkClientS3Node.typesInputTypesUnionMod._InputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesAbortMod.AbortSignal
import typingsJapgolly.awsSdkTypes.distTypesCryptoMod.SourceData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetObjectInputMod {
  
  trait GetObjectInput
    extends StObject
       with _InputTypesUnion {
    
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * Whether to use the bucket name as the endpoint for this request. The bucket
      * name must be a domain name with a CNAME record alias to an appropriate virtual
      * hosted-style S3 hostname, e.g. a bucket of `images.johnsmith.net` and a DNS
      * record of:
      *
      * ```
      * images.johnsmith.net CNAME 			images.johnsmith.net.s3.amazonaws.com.
      * ```
      *
      * @see https://docs.aws.amazon.com/AmazonS3/latest/dev/VirtualHosting.html#VirtualHostingCustomURLs
      */
    @JSName("$bucketEndpoint")
    var $bucketEndpoint: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to force path style URLs for S3 objects (e.g., https://s3.amazonaws.com/<bucketName>/<key> instead of https://<bucketName>.s3.amazonaws.com/<key>
      */
    @JSName("$forcePathStyle")
    var $forcePathStyle: js.UndefOr[Boolean] = js.undefined
    
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
      * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to store the object and then it is discarded; Amazon does not store the encryption key. The key must be appropriate for use with the algorithm specified in the `SSECustomerAlgorithm` parameter
      */
    @JSName("$serverSideEncryptionKey")
    var $serverSideEncryptionKey: js.UndefOr[SourceData] = js.undefined
    
    /**
      * Whether to use the S3 Transfer Acceleration endpoint by default
      */
    @JSName("$useAccelerateEndpoint")
    var $useAccelerateEndpoint: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables IPv6/IPv4 dualstack endpoint. When a DNS lookup is performed on an endpoint of this type, it returns an “A” record with an IPv4 address and an “AAAA” record with an IPv6 address. In most cases the network stack in the client environment will automatically prefer the AAAA record and make a connection using the IPv6 address. Note, however, that currently on Windows, the IPv4 address will be preferred.
      */
    @JSName("$useDualstackEndpoint")
    var $useDualstackEndpoint: js.UndefOr[Boolean] = js.undefined
    
    /**
      * _BucketName shape
      */
    var Bucket: String
    
    /**
      * <p>Return the object only if its entity tag (ETag) is the same as the one specified, otherwise return a 412 (precondition failed).</p>
      */
    var IfMatch: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Return the object only if it has been modified since the specified time, otherwise return a 304 (not modified).</p>
      */
    var IfModifiedSince: js.UndefOr[js.Date | String | Double] = js.undefined
    
    /**
      * <p>Return the object only if its entity tag (ETag) is different from the one specified, otherwise return a 304 (not modified).</p>
      */
    var IfNoneMatch: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Return the object only if it has not been modified since the specified time, otherwise return a 412 (precondition failed).</p>
      */
    var IfUnmodifiedSince: js.UndefOr[js.Date | String | Double] = js.undefined
    
    /**
      * _ObjectKey shape
      */
    var Key: String
    
    /**
      * <p>Part number of the object being read. This is a positive integer between 1 and 10,000. Effectively performs a 'ranged' GET request for the part specified. Useful for downloading just a part of an object.</p>
      */
    var PartNumber: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>Downloads the specified range bytes of an object. For more information about the HTTP Range header, go to http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35.</p>
      */
    var Range: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Confirms that the requester knows that she or he will be charged for the request. Bucket owners need not specify this parameter in their requests. Documentation on downloading objects from requester pays buckets can be found at http://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html</p>
      */
    var RequestPayer: js.UndefOr[requester_ | String] = js.undefined
    
    /**
      * <p>Sets the Cache-Control header of the response.</p>
      */
    var ResponseCacheControl: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Sets the Content-Disposition header of the response</p>
      */
    var ResponseContentDisposition: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Sets the Content-Encoding header of the response.</p>
      */
    var ResponseContentEncoding: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Sets the Content-Language header of the response.</p>
      */
    var ResponseContentLanguage: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Sets the Content-Type header of the response.</p>
      */
    var ResponseContentType: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Sets the Expires header of the response.</p>
      */
    var ResponseExpires: js.UndefOr[js.Date | String | Double] = js.undefined
    
    /**
      * <p>Specifies the algorithm to use to when encrypting the object (e.g., AES256).</p>
      */
    var SSECustomerAlgorithm: js.UndefOr[String] = js.undefined
    
    /**
      * <p>VersionId used to reference a specific version of the object.</p>
      */
    var VersionId: js.UndefOr[String] = js.undefined
  }
  object GetObjectInput {
    
    inline def apply(Bucket: String, Key: String): GetObjectInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetObjectInput]
    }
    
    extension [Self <: GetObjectInput](x: Self) {
      
      inline def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      inline def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      inline def set$bucketEndpoint(value: String): Self = StObject.set(x, "$bucketEndpoint", value.asInstanceOf[js.Any])
      
      inline def set$bucketEndpointUndefined: Self = StObject.set(x, "$bucketEndpoint", js.undefined)
      
      inline def set$forcePathStyle(value: Boolean): Self = StObject.set(x, "$forcePathStyle", value.asInstanceOf[js.Any])
      
      inline def set$forcePathStyleUndefined: Self = StObject.set(x, "$forcePathStyle", js.undefined)
      
      inline def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      inline def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      inline def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      inline def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      inline def set$serverSideEncryptionKey(value: SourceData): Self = StObject.set(x, "$serverSideEncryptionKey", value.asInstanceOf[js.Any])
      
      inline def set$serverSideEncryptionKeyUndefined: Self = StObject.set(x, "$serverSideEncryptionKey", js.undefined)
      
      inline def set$useAccelerateEndpoint(value: Boolean): Self = StObject.set(x, "$useAccelerateEndpoint", value.asInstanceOf[js.Any])
      
      inline def set$useAccelerateEndpointUndefined: Self = StObject.set(x, "$useAccelerateEndpoint", js.undefined)
      
      inline def set$useDualstackEndpoint(value: Boolean): Self = StObject.set(x, "$useDualstackEndpoint", value.asInstanceOf[js.Any])
      
      inline def set$useDualstackEndpointUndefined: Self = StObject.set(x, "$useDualstackEndpoint", js.undefined)
      
      inline def setBucket(value: String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
      
      inline def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
      
      inline def setIfMatchUndefined: Self = StObject.set(x, "IfMatch", js.undefined)
      
      inline def setIfModifiedSince(value: js.Date | String | Double): Self = StObject.set(x, "IfModifiedSince", value.asInstanceOf[js.Any])
      
      inline def setIfModifiedSinceUndefined: Self = StObject.set(x, "IfModifiedSince", js.undefined)
      
      inline def setIfNoneMatch(value: String): Self = StObject.set(x, "IfNoneMatch", value.asInstanceOf[js.Any])
      
      inline def setIfNoneMatchUndefined: Self = StObject.set(x, "IfNoneMatch", js.undefined)
      
      inline def setIfUnmodifiedSince(value: js.Date | String | Double): Self = StObject.set(x, "IfUnmodifiedSince", value.asInstanceOf[js.Any])
      
      inline def setIfUnmodifiedSinceUndefined: Self = StObject.set(x, "IfUnmodifiedSince", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      inline def setPartNumber(value: Double): Self = StObject.set(x, "PartNumber", value.asInstanceOf[js.Any])
      
      inline def setPartNumberUndefined: Self = StObject.set(x, "PartNumber", js.undefined)
      
      inline def setRange(value: String): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "Range", js.undefined)
      
      inline def setRequestPayer(value: requester_ | String): Self = StObject.set(x, "RequestPayer", value.asInstanceOf[js.Any])
      
      inline def setRequestPayerUndefined: Self = StObject.set(x, "RequestPayer", js.undefined)
      
      inline def setResponseCacheControl(value: String): Self = StObject.set(x, "ResponseCacheControl", value.asInstanceOf[js.Any])
      
      inline def setResponseCacheControlUndefined: Self = StObject.set(x, "ResponseCacheControl", js.undefined)
      
      inline def setResponseContentDisposition(value: String): Self = StObject.set(x, "ResponseContentDisposition", value.asInstanceOf[js.Any])
      
      inline def setResponseContentDispositionUndefined: Self = StObject.set(x, "ResponseContentDisposition", js.undefined)
      
      inline def setResponseContentEncoding(value: String): Self = StObject.set(x, "ResponseContentEncoding", value.asInstanceOf[js.Any])
      
      inline def setResponseContentEncodingUndefined: Self = StObject.set(x, "ResponseContentEncoding", js.undefined)
      
      inline def setResponseContentLanguage(value: String): Self = StObject.set(x, "ResponseContentLanguage", value.asInstanceOf[js.Any])
      
      inline def setResponseContentLanguageUndefined: Self = StObject.set(x, "ResponseContentLanguage", js.undefined)
      
      inline def setResponseContentType(value: String): Self = StObject.set(x, "ResponseContentType", value.asInstanceOf[js.Any])
      
      inline def setResponseContentTypeUndefined: Self = StObject.set(x, "ResponseContentType", js.undefined)
      
      inline def setResponseExpires(value: js.Date | String | Double): Self = StObject.set(x, "ResponseExpires", value.asInstanceOf[js.Any])
      
      inline def setResponseExpiresUndefined: Self = StObject.set(x, "ResponseExpires", js.undefined)
      
      inline def setSSECustomerAlgorithm(value: String): Self = StObject.set(x, "SSECustomerAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setSSECustomerAlgorithmUndefined: Self = StObject.set(x, "SSECustomerAlgorithm", js.undefined)
      
      inline def setVersionId(value: String): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
      
      inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
    }
  }
}
