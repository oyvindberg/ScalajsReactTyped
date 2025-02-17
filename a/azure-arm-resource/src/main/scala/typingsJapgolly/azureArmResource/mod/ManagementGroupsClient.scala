package typingsJapgolly.azureArmResource.mod

import typingsJapgolly.azureArmResource.libManagementManagementGroupsClientMod.^
import typingsJapgolly.msRest.mod.ServiceClientCredentials
import typingsJapgolly.msRestAzure.mod.AzureServiceClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azure-arm-resource", "ManagementGroupsClient")
@js.native
open class ManagementGroupsClient protected () extends ^ {
  /**
    * Initializes a new instance of the ManagementGroupsClient class.
    * @constructor
    *
    * @class
    * @param {credentials} credentials - Credentials needed for the client to connect to Azure.
    *
    * @param {uuid} groupId - Management Group ID.
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
    * @param {string} [options.acceptLanguage] - Gets or sets the preferred language for the response.
    *
    * @param {number} [options.longRunningOperationRetryTimeout] - Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
    *
    * @param {boolean} [options.generateClientRequestId] - When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
    *
    */
  def this(credentials: ServiceClientCredentials, groupId: String) = this()
  def this(credentials: ServiceClientCredentials, groupId: String, baseUri: String) = this()
  def this(
    credentials: ServiceClientCredentials,
    groupId: String,
    baseUri: String,
    options: AzureServiceClientOptions
  ) = this()
  def this(
    credentials: ServiceClientCredentials,
    groupId: String,
    baseUri: Unit,
    options: AzureServiceClientOptions
  ) = this()
}
