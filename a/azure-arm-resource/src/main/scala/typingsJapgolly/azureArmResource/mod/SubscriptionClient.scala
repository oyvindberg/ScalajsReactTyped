package typingsJapgolly.azureArmResource.mod

import typingsJapgolly.msRest.mod.ServiceClientCredentials
import typingsJapgolly.msRestAzure.mod.AzureServiceClientOptions
import typingsJapgolly.msRestAzure.mod.CloudErrorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SubscriptionClient {
  
  @JSImport("azure-arm-resource", "SubscriptionClient.default")
  @js.native
  open class default protected ()
    extends typingsJapgolly.azureArmResource.libSubscriptionSubscriptionClientMod.default {
    /**
      * Initializes a new instance of the SubscriptionClient class.
      * @constructor
      *
      * @class
      * @param {credentials} credentials - Credentials needed for the client to connect to Azure.
      *
      * @param {string} [baseUri] - The base URI of the service.
      *
      * @param {object} [options] - The parameter options
      *
      * @param {Array} [options.filters] - Filters to be added to the request pipeline
      *
      * @param {object} [options.requestOptions] - Options for the underlying request object
      * {@link https://github.com/request/request#requestoptions-callback Options doc}
      *
      * @param {boolean} [options.noRetryPolicy] - If set to true, turn off default retry policy
      *
      * @param {string} [options.acceptLanguage] - The preferred language for the response.
      *
      * @param {number} [options.longRunningOperationRetryTimeout] - The retry timeout in seconds for Long Running Operations. Default value is 30.
      *
      * @param {boolean} [options.generateClientRequestId] - Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
      *
      */
    def this(credentials: ServiceClientCredentials) = this()
    def this(credentials: ServiceClientCredentials, baseUri: String) = this()
    def this(credentials: ServiceClientCredentials, baseUri: String, options: AzureServiceClientOptions) = this()
    def this(credentials: ServiceClientCredentials, baseUri: Unit, options: AzureServiceClientOptions) = this()
  }
  
  @JSImport("azure-arm-resource", "SubscriptionClient.SubscriptionClient")
  @js.native
  open class SubscriptionClient protected ()
    extends typingsJapgolly.azureArmResource.libSubscriptionSubscriptionClientMod.SubscriptionClient {
    /**
      * Initializes a new instance of the SubscriptionClient class.
      * @constructor
      *
      * @class
      * @param {credentials} credentials - Credentials needed for the client to connect to Azure.
      *
      * @param {string} [baseUri] - The base URI of the service.
      *
      * @param {object} [options] - The parameter options
      *
      * @param {Array} [options.filters] - Filters to be added to the request pipeline
      *
      * @param {object} [options.requestOptions] - Options for the underlying request object
      * {@link https://github.com/request/request#requestoptions-callback Options doc}
      *
      * @param {boolean} [options.noRetryPolicy] - If set to true, turn off default retry policy
      *
      * @param {string} [options.acceptLanguage] - The preferred language for the response.
      *
      * @param {number} [options.longRunningOperationRetryTimeout] - The retry timeout in seconds for Long Running Operations. Default value is 30.
      *
      * @param {boolean} [options.generateClientRequestId] - Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
      *
      */
    def this(credentials: ServiceClientCredentials) = this()
    def this(credentials: ServiceClientCredentials, baseUri: String) = this()
    def this(credentials: ServiceClientCredentials, baseUri: String, options: AzureServiceClientOptions) = this()
    def this(credentials: ServiceClientCredentials, baseUri: Unit, options: AzureServiceClientOptions) = this()
  }
  
  object SubscriptionModels {
    
    @JSImport("azure-arm-resource", "SubscriptionClient.SubscriptionModels.BaseResource")
    @js.native
    open class BaseResource ()
      extends typingsJapgolly.azureArmResource.libSubscriptionSubscriptionClientMod.SubscriptionModels.BaseResource
    
    @JSImport("azure-arm-resource", "SubscriptionClient.SubscriptionModels.CloudError")
    @js.native
    open class CloudError protected ()
      extends typingsJapgolly.azureArmResource.libSubscriptionSubscriptionClientMod.SubscriptionModels.CloudError {
      def this(parameters: CloudErrorParameters) = this()
    }
  }
}
