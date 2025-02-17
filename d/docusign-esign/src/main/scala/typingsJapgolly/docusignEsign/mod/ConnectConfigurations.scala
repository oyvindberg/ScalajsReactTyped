package typingsJapgolly.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectConfigurations extends StObject {
  
  /**
    * When set to **true**, the tracked envelope and recipient events for all users, including users that are added a later time, are sent through Connect.
    */
  var allUsers: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, data is sent to the urlToPublishTo web address. This option can be set to false to stop sending data while maintaining the Connect configuration information.
    */
  var allowEnvelopePublish: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**  (default), DocuSign sends data to the designated Salesforce account through Connect.
    */
  var allowSalesforcePublish: js.UndefOr[String] = js.undefined
  
  /**
    * If you are using merge fields, this property specifies the type of the merge field. The only supported value is `salesforce`.
    */
  var configurationType: js.UndefOr[String] = js.undefined
  
  /**
    * The DocuSign-generated ID for the Connect configuration. This property is read only.
    */
  var connectId: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, Connect logging is turned on. We recommend that you enable this functionality, which helps you troubleshoot any issues.
    *
    * You can have a maximum of 100 active logs in your account. You can view the entries in active logs in the **Logs** tab in the console.
    */
  var enableLog: js.UndefOr[String] = js.undefined
  
  /**
    * An array of strings that lists envelope-related events to track through Connect. The possible event values are:
    *
    * - `sent`: An envelope has the status `sent` in the following scenarios:
    *    - When the envelope has been sent to recipients.
    *    - When using remote signing, this event is triggered when the email notification with a link to the documents is sent to at least one recipient.
    *    - When using embedded signing, this event is triggered when the link is ready for the recipient to sign the envelope.
    *
    *    An envelope remains in this state until all recipients have viewed or taken action on the envelope.
    *
    * - `delivered`: This status is triggered when all recipients have opened the envelope, selected the **Continue** button in the interface, and viewed the documents.
    * - `completed`: This status is triggered when all recipients have completed their assigned actions on an envelope.
    * - `declined`: This status is triggered when a recipient has declined to sign the envelope.
    * - `voided`: The voided status indicates that the sender has voided the envelope.
    *
    * **Note**: In previous versions of the API, this value was a single comma-separated string.
    *
    */
  var envelopeEvents: js.UndefOr[js.Array[String]] = js.undefined
  
  var eventData: js.UndefOr[ConnectEventData] = js.undefined
  
  /**
    * The id of an external folder.
    */
  var externalFolderId: js.UndefOr[String] = js.undefined
  
  /**
    * The label for an external folder.
    */
  var externalFolderLabel: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, a certificate for a SOAP header is included in messages sent through Connect.
    */
  var includeCertSoapHeader: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the Connect Service includes the Certificate of Completion with completed envelopes.
    */
  var includeCertificateOfCompletion: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the Document Fields associated with the envelope's documents are included in the notification messages.
    * Document Fields are optional custom name-value pairs added to documents using the API.
    */
  var includeDocumentFields: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, Connect attaches the envelope documents to the XML payloads of your event notification messages.
    *
    * **Note**: Consider resources and scaling when adding documents to your event payloads. Documents attached to these messages are sent in base64 XML element nodes,
    * which are larger than binary document data. This can significantly increase your payload size, opening up windows for failure. If you include documents,
    * you must build your application to scale in these situations.
    */
  var includeDocuments: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, Connect will include the voidedReason for voided envelopes.
    */
  var includeEnvelopeVoidReason: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, a Hash-based Message Authentication Code (HMAC) signature is included in messages sent through Connect.
    * For more information, see [Using HMAC Security with DocuSign Connect](https://developers.docusign.com/esign-rest-api/guides/connect-hmac).
    */
  var includeHMAC: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, Connect will include the sender account as Custom Field in the data.
    */
  var includeSenderAccountasCustomField: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, Connect will include the envelope time zone information.
    */
  var includeTimeZoneInformation: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Connect configuration. The name helps identify the configuration in the list.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The user's encrypted password hash.
    */
  var password: js.UndefOr[String] = js.undefined
  
  /**
    * An array of strings that lists of recipient-related events that trigger a notification
    * to your webhook Connect listener. The possible event values are:
    *
    * - `sent`: If a recipient type is set to receive an email notification to take action on an envelope, the recipient status is set to `sent` upon delivery of the email.
    * - `delivered`: The recipient has viewed the documents in the envelope. This recipient status does not indicate email delivery of the documents in the envelope.
    * - `completed`: The recipient has completed their assigned actions on an envelope.
    * - `declined`: The recipient has declined to sign a document in the envelope.
    * - `authenticationfailed`: At least one signer has failed the authentication check on the document. If this occurs, you have two options:
    *    - Send a reminder to the recipients, which provides the signer with another chance to access and pass the authentication.
    *    - Correct the document and modify the authentication setting.
    * - `autoresponded`: The recipient's email system sent back an automatic response. This status is only used when **Send-on-behalf-of** is turned off for the account.
    *
    * **Note**: In previous versions of the API, this value was a single comma-separated string.
    *
    */
  var recipientEvents: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * When set to **true**, [Mutual TLS](https://developers.docusign.com/esign-rest-api/guides/mutual-tls-intro) authentication is enabled.
    */
  var requireMutualTls: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, event delivery acknowledgements are enabled for your Connect configuration.
    *
    * DocuSign Connect awaits a valid 200 response from your application acknowledging that it received a message. If you do not acknowledge receiving an
    * event notification message within 100 seconds, DocuSign treats the message as a failure and places it into a failure queue.
    * It is imperative that you acknowledge successful receipt of Connect events as they occur by sending a 200 event back.
    *
    * #### When set to **true** and Send Individual Messages (SIM) mode is activated
    *
    * If the HTTP status response to a notification message is not in the range of 200-299,
    * then the message delivery failed, and the configuration is marked as down.
    *
    * The message will be queued and retried once per day.
    * While a Connect configuration is marked down, subsequent notifications will not be tried. Instead they will be immediately queued with the reason `Pending`.
    * When a message succeeds, all queued messages for the configuration will be tried immediately, in order.
    *
    * There is a maximum of ten retries. Alternately, you can use **Republish Connect Information** to manually republish the notification.
    *
    * #### When set to **true** and SIM mode is not activated
    *
    * If the HTTP Status response to a notification message is not in the range of 200-299,  then the message delivery failed, and the message is queued.
    *
    * The message will be retried after at least a day the next time a subsequent message is successfully sent to this configuration (subscription).
    * Subsequent notifications will be tried when they occur.
    * There is a maximum of ten retries. Alternately, you can use **Republish Connect Information** to manually republish the notification.
    *
    * #### When set to **false**
    *
    * When `requiresAcknowledgement` is set to **false** and you do not acknowledge receiving an event notification message within 100 seconds,
    * DocuSign treats the message as a failure and determines that the server is unavailable. It does not retry to send the notification message,
    * and you must handle the failure manually.
    *
    *
    */
  var requiresAcknowledgement: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the Salesforce API that you are using.
    */
  var salesforceApiVersion: js.UndefOr[String] = js.undefined
  
  var salesforceAuthcode: js.UndefOr[String] = js.undefined
  
  var salesforceCallBackUrl: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, DocuSign can use documents in your Salesforce account for sending and signing.
    */
  var salesforceDocumentsAsContentFiles: js.UndefOr[String] = js.undefined
  
  var senderOverride: js.UndefOr[String] = js.undefined
  
  /**
    * This property sets the items that are available for selection when adding or editing Connect objects.
    */
  var senderSelectableItems: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * An array of Salesforce objects.
    */
  var sfObjects: js.UndefOr[js.Array[ConnectSalesforceObject]] = js.undefined
  
  /**
    * When set to **true**, Mutual TLS will be enabled for notifications. Mutual TLS must be initiated by the listener (the customer's web server) during the TLS handshake protocol.
    */
  var signMessageWithX509Certificate: js.UndefOr[String] = js.undefined
  
  /**
    * The namespace of the SOAP interface.
    *
    * **Note**: If `useSoapInterface` is set to **true**, you must set this value.
    */
  var soapNamespace: js.UndefOr[String] = js.undefined
  
  /**
    * The endpoint to which Connect should send webhook notification messages via an HTTPS POST request. The URL must start with `https`.
    * The customer's web server must use an SSL/TLS certificate whose CA is in the Microsoft list of trusted CAs. Self-signed certificates are not acceptable,
    * but you can use free certificates from Let's Encrypt.
    */
  var urlToPublishTo: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, indicates that the `urlToPublishTo` property contains a SOAP endpoint.
    */
  var useSoapInterface: js.UndefOr[String] = js.undefined
  
  /**
    * A comma-separated list of userIds. This sets the users associated with the tracked envelope and recipient events.
    * When a tracked event occurs for a set user, the a notification message is sent to your Connect listener.
    *
    * ###### Note: If allUsers is set to `false` then you must provide a list of user ids.
    */
  var userIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The name of the user.
    */
  var userName: js.UndefOr[String] = js.undefined
}
object ConnectConfigurations {
  
  inline def apply(): ConnectConfigurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectConfigurations]
  }
  
  extension [Self <: ConnectConfigurations](x: Self) {
    
    inline def setAllUsers(value: String): Self = StObject.set(x, "allUsers", value.asInstanceOf[js.Any])
    
    inline def setAllUsersUndefined: Self = StObject.set(x, "allUsers", js.undefined)
    
    inline def setAllowEnvelopePublish(value: String): Self = StObject.set(x, "allowEnvelopePublish", value.asInstanceOf[js.Any])
    
    inline def setAllowEnvelopePublishUndefined: Self = StObject.set(x, "allowEnvelopePublish", js.undefined)
    
    inline def setAllowSalesforcePublish(value: String): Self = StObject.set(x, "allowSalesforcePublish", value.asInstanceOf[js.Any])
    
    inline def setAllowSalesforcePublishUndefined: Self = StObject.set(x, "allowSalesforcePublish", js.undefined)
    
    inline def setConfigurationType(value: String): Self = StObject.set(x, "configurationType", value.asInstanceOf[js.Any])
    
    inline def setConfigurationTypeUndefined: Self = StObject.set(x, "configurationType", js.undefined)
    
    inline def setConnectId(value: String): Self = StObject.set(x, "connectId", value.asInstanceOf[js.Any])
    
    inline def setConnectIdUndefined: Self = StObject.set(x, "connectId", js.undefined)
    
    inline def setEnableLog(value: String): Self = StObject.set(x, "enableLog", value.asInstanceOf[js.Any])
    
    inline def setEnableLogUndefined: Self = StObject.set(x, "enableLog", js.undefined)
    
    inline def setEnvelopeEvents(value: js.Array[String]): Self = StObject.set(x, "envelopeEvents", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeEventsUndefined: Self = StObject.set(x, "envelopeEvents", js.undefined)
    
    inline def setEnvelopeEventsVarargs(value: String*): Self = StObject.set(x, "envelopeEvents", js.Array(value*))
    
    inline def setEventData(value: ConnectEventData): Self = StObject.set(x, "eventData", value.asInstanceOf[js.Any])
    
    inline def setEventDataUndefined: Self = StObject.set(x, "eventData", js.undefined)
    
    inline def setExternalFolderId(value: String): Self = StObject.set(x, "externalFolderId", value.asInstanceOf[js.Any])
    
    inline def setExternalFolderIdUndefined: Self = StObject.set(x, "externalFolderId", js.undefined)
    
    inline def setExternalFolderLabel(value: String): Self = StObject.set(x, "externalFolderLabel", value.asInstanceOf[js.Any])
    
    inline def setExternalFolderLabelUndefined: Self = StObject.set(x, "externalFolderLabel", js.undefined)
    
    inline def setIncludeCertSoapHeader(value: String): Self = StObject.set(x, "includeCertSoapHeader", value.asInstanceOf[js.Any])
    
    inline def setIncludeCertSoapHeaderUndefined: Self = StObject.set(x, "includeCertSoapHeader", js.undefined)
    
    inline def setIncludeCertificateOfCompletion(value: String): Self = StObject.set(x, "includeCertificateOfCompletion", value.asInstanceOf[js.Any])
    
    inline def setIncludeCertificateOfCompletionUndefined: Self = StObject.set(x, "includeCertificateOfCompletion", js.undefined)
    
    inline def setIncludeDocumentFields(value: String): Self = StObject.set(x, "includeDocumentFields", value.asInstanceOf[js.Any])
    
    inline def setIncludeDocumentFieldsUndefined: Self = StObject.set(x, "includeDocumentFields", js.undefined)
    
    inline def setIncludeDocuments(value: String): Self = StObject.set(x, "includeDocuments", value.asInstanceOf[js.Any])
    
    inline def setIncludeDocumentsUndefined: Self = StObject.set(x, "includeDocuments", js.undefined)
    
    inline def setIncludeEnvelopeVoidReason(value: String): Self = StObject.set(x, "includeEnvelopeVoidReason", value.asInstanceOf[js.Any])
    
    inline def setIncludeEnvelopeVoidReasonUndefined: Self = StObject.set(x, "includeEnvelopeVoidReason", js.undefined)
    
    inline def setIncludeHMAC(value: String): Self = StObject.set(x, "includeHMAC", value.asInstanceOf[js.Any])
    
    inline def setIncludeHMACUndefined: Self = StObject.set(x, "includeHMAC", js.undefined)
    
    inline def setIncludeSenderAccountasCustomField(value: String): Self = StObject.set(x, "includeSenderAccountasCustomField", value.asInstanceOf[js.Any])
    
    inline def setIncludeSenderAccountasCustomFieldUndefined: Self = StObject.set(x, "includeSenderAccountasCustomField", js.undefined)
    
    inline def setIncludeTimeZoneInformation(value: String): Self = StObject.set(x, "includeTimeZoneInformation", value.asInstanceOf[js.Any])
    
    inline def setIncludeTimeZoneInformationUndefined: Self = StObject.set(x, "includeTimeZoneInformation", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setRecipientEvents(value: js.Array[String]): Self = StObject.set(x, "recipientEvents", value.asInstanceOf[js.Any])
    
    inline def setRecipientEventsUndefined: Self = StObject.set(x, "recipientEvents", js.undefined)
    
    inline def setRecipientEventsVarargs(value: String*): Self = StObject.set(x, "recipientEvents", js.Array(value*))
    
    inline def setRequireMutualTls(value: String): Self = StObject.set(x, "requireMutualTls", value.asInstanceOf[js.Any])
    
    inline def setRequireMutualTlsUndefined: Self = StObject.set(x, "requireMutualTls", js.undefined)
    
    inline def setRequiresAcknowledgement(value: String): Self = StObject.set(x, "requiresAcknowledgement", value.asInstanceOf[js.Any])
    
    inline def setRequiresAcknowledgementUndefined: Self = StObject.set(x, "requiresAcknowledgement", js.undefined)
    
    inline def setSalesforceApiVersion(value: String): Self = StObject.set(x, "salesforceApiVersion", value.asInstanceOf[js.Any])
    
    inline def setSalesforceApiVersionUndefined: Self = StObject.set(x, "salesforceApiVersion", js.undefined)
    
    inline def setSalesforceAuthcode(value: String): Self = StObject.set(x, "salesforceAuthcode", value.asInstanceOf[js.Any])
    
    inline def setSalesforceAuthcodeUndefined: Self = StObject.set(x, "salesforceAuthcode", js.undefined)
    
    inline def setSalesforceCallBackUrl(value: String): Self = StObject.set(x, "salesforceCallBackUrl", value.asInstanceOf[js.Any])
    
    inline def setSalesforceCallBackUrlUndefined: Self = StObject.set(x, "salesforceCallBackUrl", js.undefined)
    
    inline def setSalesforceDocumentsAsContentFiles(value: String): Self = StObject.set(x, "salesforceDocumentsAsContentFiles", value.asInstanceOf[js.Any])
    
    inline def setSalesforceDocumentsAsContentFilesUndefined: Self = StObject.set(x, "salesforceDocumentsAsContentFiles", js.undefined)
    
    inline def setSenderOverride(value: String): Self = StObject.set(x, "senderOverride", value.asInstanceOf[js.Any])
    
    inline def setSenderOverrideUndefined: Self = StObject.set(x, "senderOverride", js.undefined)
    
    inline def setSenderSelectableItems(value: js.Array[String]): Self = StObject.set(x, "senderSelectableItems", value.asInstanceOf[js.Any])
    
    inline def setSenderSelectableItemsUndefined: Self = StObject.set(x, "senderSelectableItems", js.undefined)
    
    inline def setSenderSelectableItemsVarargs(value: String*): Self = StObject.set(x, "senderSelectableItems", js.Array(value*))
    
    inline def setSfObjects(value: js.Array[ConnectSalesforceObject]): Self = StObject.set(x, "sfObjects", value.asInstanceOf[js.Any])
    
    inline def setSfObjectsUndefined: Self = StObject.set(x, "sfObjects", js.undefined)
    
    inline def setSfObjectsVarargs(value: ConnectSalesforceObject*): Self = StObject.set(x, "sfObjects", js.Array(value*))
    
    inline def setSignMessageWithX509Certificate(value: String): Self = StObject.set(x, "signMessageWithX509Certificate", value.asInstanceOf[js.Any])
    
    inline def setSignMessageWithX509CertificateUndefined: Self = StObject.set(x, "signMessageWithX509Certificate", js.undefined)
    
    inline def setSoapNamespace(value: String): Self = StObject.set(x, "soapNamespace", value.asInstanceOf[js.Any])
    
    inline def setSoapNamespaceUndefined: Self = StObject.set(x, "soapNamespace", js.undefined)
    
    inline def setUrlToPublishTo(value: String): Self = StObject.set(x, "urlToPublishTo", value.asInstanceOf[js.Any])
    
    inline def setUrlToPublishToUndefined: Self = StObject.set(x, "urlToPublishTo", js.undefined)
    
    inline def setUseSoapInterface(value: String): Self = StObject.set(x, "useSoapInterface", value.asInstanceOf[js.Any])
    
    inline def setUseSoapInterfaceUndefined: Self = StObject.set(x, "useSoapInterface", js.undefined)
    
    inline def setUserIds(value: js.Array[String]): Self = StObject.set(x, "userIds", value.asInstanceOf[js.Any])
    
    inline def setUserIdsUndefined: Self = StObject.set(x, "userIds", js.undefined)
    
    inline def setUserIdsVarargs(value: String*): Self = StObject.set(x, "userIds", js.Array(value*))
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}
