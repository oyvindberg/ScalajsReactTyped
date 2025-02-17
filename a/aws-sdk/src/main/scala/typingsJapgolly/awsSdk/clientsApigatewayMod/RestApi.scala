package typingsJapgolly.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestApi extends StObject {
  
  /**
    * The source of the API key for metering requests according to a usage plan. Valid values are: &gt;HEADER to read the API key from the X-API-Key header of a request. AUTHORIZER to read the API key from the UsageIdentifierKey from a custom authorizer.
    */
  var apiKeySource: js.UndefOr[ApiKeySourceType] = js.undefined
  
  /**
    * The list of binary media types supported by the RestApi. By default, the RestApi supports only UTF-8-encoded text payloads.
    */
  var binaryMediaTypes: js.UndefOr[ListOfString] = js.undefined
  
  /**
    * The timestamp when the API was created.
    */
  var createdDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The API's description.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether clients can invoke your API by using the default execute-api endpoint. By default, clients can invoke your API with the default https://{api_id}.execute-api.{region}.amazonaws.com endpoint. To require that clients use a custom domain name to invoke your API, disable the default endpoint.
    */
  var disableExecuteApiEndpoint: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The endpoint configuration of this RestApi showing the endpoint types of the API. 
    */
  var endpointConfiguration: js.UndefOr[EndpointConfiguration] = js.undefined
  
  /**
    * The API's identifier. This identifier is unique across all of your APIs in API Gateway.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * A nullable integer that is used to enable compression (with non-negative between 0 and 10485760 (10M) bytes, inclusive) or disable compression (with a null value) on an API. When compression is enabled, compression or decompression is not applied on the payload if the payload size is smaller than this value. Setting it to zero allows compression for any payload size.
    */
  var minimumCompressionSize: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * The API's name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A stringified JSON policy document that applies to this RestApi regardless of the caller and Method configuration.
    */
  var policy: js.UndefOr[String] = js.undefined
  
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.undefined
  
  /**
    * A version identifier for the API.
    */
  var version: js.UndefOr[String] = js.undefined
  
  /**
    * The warning messages reported when failonwarnings is turned on during API import.
    */
  var warnings: js.UndefOr[ListOfString] = js.undefined
}
object RestApi {
  
  inline def apply(): RestApi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestApi]
  }
  
  extension [Self <: RestApi](x: Self) {
    
    inline def setApiKeySource(value: ApiKeySourceType): Self = StObject.set(x, "apiKeySource", value.asInstanceOf[js.Any])
    
    inline def setApiKeySourceUndefined: Self = StObject.set(x, "apiKeySource", js.undefined)
    
    inline def setBinaryMediaTypes(value: ListOfString): Self = StObject.set(x, "binaryMediaTypes", value.asInstanceOf[js.Any])
    
    inline def setBinaryMediaTypesUndefined: Self = StObject.set(x, "binaryMediaTypes", js.undefined)
    
    inline def setBinaryMediaTypesVarargs(value: String*): Self = StObject.set(x, "binaryMediaTypes", js.Array(value*))
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisableExecuteApiEndpoint(value: Boolean): Self = StObject.set(x, "disableExecuteApiEndpoint", value.asInstanceOf[js.Any])
    
    inline def setDisableExecuteApiEndpointUndefined: Self = StObject.set(x, "disableExecuteApiEndpoint", js.undefined)
    
    inline def setEndpointConfiguration(value: EndpointConfiguration): Self = StObject.set(x, "endpointConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEndpointConfigurationUndefined: Self = StObject.set(x, "endpointConfiguration", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMinimumCompressionSize(value: NullableInteger): Self = StObject.set(x, "minimumCompressionSize", value.asInstanceOf[js.Any])
    
    inline def setMinimumCompressionSizeUndefined: Self = StObject.set(x, "minimumCompressionSize", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setTags(value: MapOfStringToString): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWarnings(value: ListOfString): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
