package typingsJapgolly.awsSdk.clientsSnsMod

import typingsJapgolly.awsSdk.libConfigBaseMod.ConfigBase
import typingsJapgolly.awsSdk.libErrorMod.AWSError
import typingsJapgolly.awsSdk.libRequestMod.Request
import typingsJapgolly.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SNS extends Service {
  
  /**
    * Adds a statement to a topic's access control policy, granting access for the specified Amazon Web Services accounts to the specified actions.
    */
  def addPermission(): Request[js.Object, AWSError] = js.native
  def addPermission(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds a statement to a topic's access control policy, granting access for the specified Amazon Web Services accounts to the specified actions.
    */
  def addPermission(params: AddPermissionInput): Request[js.Object, AWSError] = js.native
  def addPermission(params: AddPermissionInput, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Accepts a phone number and indicates whether the phone holder has opted out of receiving SMS messages from your Amazon Web Services account. You cannot send SMS messages to a number that is opted out. To resume sending messages, you can opt in the number by using the OptInPhoneNumber action.
    */
  def checkIfPhoneNumberIsOptedOut(): Request[CheckIfPhoneNumberIsOptedOutResponse, AWSError] = js.native
  def checkIfPhoneNumberIsOptedOut(callback: js.Function2[/* err */ AWSError, /* data */ CheckIfPhoneNumberIsOptedOutResponse, Unit]): Request[CheckIfPhoneNumberIsOptedOutResponse, AWSError] = js.native
  /**
    * Accepts a phone number and indicates whether the phone holder has opted out of receiving SMS messages from your Amazon Web Services account. You cannot send SMS messages to a number that is opted out. To resume sending messages, you can opt in the number by using the OptInPhoneNumber action.
    */
  def checkIfPhoneNumberIsOptedOut(params: CheckIfPhoneNumberIsOptedOutInput): Request[CheckIfPhoneNumberIsOptedOutResponse, AWSError] = js.native
  def checkIfPhoneNumberIsOptedOut(
    params: CheckIfPhoneNumberIsOptedOutInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CheckIfPhoneNumberIsOptedOutResponse, Unit]
  ): Request[CheckIfPhoneNumberIsOptedOutResponse, AWSError] = js.native
  
  @JSName("config")
  var config_SNS: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Verifies an endpoint owner's intent to receive messages by validating the token sent to the endpoint by an earlier Subscribe action. If the token is valid, the action creates a new subscription and returns its Amazon Resource Name (ARN). This call requires an AWS signature only when the AuthenticateOnUnsubscribe flag is set to "true".
    */
  def confirmSubscription(): Request[ConfirmSubscriptionResponse, AWSError] = js.native
  def confirmSubscription(callback: js.Function2[/* err */ AWSError, /* data */ ConfirmSubscriptionResponse, Unit]): Request[ConfirmSubscriptionResponse, AWSError] = js.native
  /**
    * Verifies an endpoint owner's intent to receive messages by validating the token sent to the endpoint by an earlier Subscribe action. If the token is valid, the action creates a new subscription and returns its Amazon Resource Name (ARN). This call requires an AWS signature only when the AuthenticateOnUnsubscribe flag is set to "true".
    */
  def confirmSubscription(params: ConfirmSubscriptionInput): Request[ConfirmSubscriptionResponse, AWSError] = js.native
  def confirmSubscription(
    params: ConfirmSubscriptionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ConfirmSubscriptionResponse, Unit]
  ): Request[ConfirmSubscriptionResponse, AWSError] = js.native
  
  /**
    * Creates a platform application object for one of the supported push notification services, such as APNS and GCM (Firebase Cloud Messaging), to which devices and mobile apps may register. You must specify PlatformPrincipal and PlatformCredential attributes when using the CreatePlatformApplication action.  PlatformPrincipal and PlatformCredential are received from the notification service.   For ADM, PlatformPrincipal is client id and PlatformCredential is client secret.   For Baidu, PlatformPrincipal is API key and PlatformCredential is secret key.   For APNS and APNS_SANDBOX using certificate credentials, PlatformPrincipal is SSL certificate and PlatformCredential is private key.   For APNS and APNS_SANDBOX using token credentials, PlatformPrincipal is signing key ID and PlatformCredential is signing key.   For GCM (Firebase Cloud Messaging), there is no PlatformPrincipal and the PlatformCredential is API key.   For MPNS, PlatformPrincipal is TLS certificate and PlatformCredential is private key.   For WNS, PlatformPrincipal is Package Security Identifier and PlatformCredential is secret key.   You can use the returned PlatformApplicationArn as an attribute for the CreatePlatformEndpoint action.
    */
  def createPlatformApplication(): Request[CreatePlatformApplicationResponse, AWSError] = js.native
  def createPlatformApplication(callback: js.Function2[/* err */ AWSError, /* data */ CreatePlatformApplicationResponse, Unit]): Request[CreatePlatformApplicationResponse, AWSError] = js.native
  /**
    * Creates a platform application object for one of the supported push notification services, such as APNS and GCM (Firebase Cloud Messaging), to which devices and mobile apps may register. You must specify PlatformPrincipal and PlatformCredential attributes when using the CreatePlatformApplication action.  PlatformPrincipal and PlatformCredential are received from the notification service.   For ADM, PlatformPrincipal is client id and PlatformCredential is client secret.   For Baidu, PlatformPrincipal is API key and PlatformCredential is secret key.   For APNS and APNS_SANDBOX using certificate credentials, PlatformPrincipal is SSL certificate and PlatformCredential is private key.   For APNS and APNS_SANDBOX using token credentials, PlatformPrincipal is signing key ID and PlatformCredential is signing key.   For GCM (Firebase Cloud Messaging), there is no PlatformPrincipal and the PlatformCredential is API key.   For MPNS, PlatformPrincipal is TLS certificate and PlatformCredential is private key.   For WNS, PlatformPrincipal is Package Security Identifier and PlatformCredential is secret key.   You can use the returned PlatformApplicationArn as an attribute for the CreatePlatformEndpoint action.
    */
  def createPlatformApplication(params: CreatePlatformApplicationInput): Request[CreatePlatformApplicationResponse, AWSError] = js.native
  def createPlatformApplication(
    params: CreatePlatformApplicationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePlatformApplicationResponse, Unit]
  ): Request[CreatePlatformApplicationResponse, AWSError] = js.native
  
  /**
    * Creates an endpoint for a device and mobile app on one of the supported push notification services, such as GCM (Firebase Cloud Messaging) and APNS. CreatePlatformEndpoint requires the PlatformApplicationArn that is returned from CreatePlatformApplication. You can use the returned EndpointArn to send a message to a mobile app or by the Subscribe action for subscription to a topic. The CreatePlatformEndpoint action is idempotent, so if the requester already owns an endpoint with the same device token and attributes, that endpoint's ARN is returned without creating a new endpoint. For more information, see Using Amazon SNS Mobile Push Notifications.  When using CreatePlatformEndpoint with Baidu, two attributes must be provided: ChannelId and UserId. The token field must also contain the ChannelId. For more information, see Creating an Amazon SNS Endpoint for Baidu. 
    */
  def createPlatformEndpoint(): Request[CreateEndpointResponse, AWSError] = js.native
  def createPlatformEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointResponse, Unit]): Request[CreateEndpointResponse, AWSError] = js.native
  /**
    * Creates an endpoint for a device and mobile app on one of the supported push notification services, such as GCM (Firebase Cloud Messaging) and APNS. CreatePlatformEndpoint requires the PlatformApplicationArn that is returned from CreatePlatformApplication. You can use the returned EndpointArn to send a message to a mobile app or by the Subscribe action for subscription to a topic. The CreatePlatformEndpoint action is idempotent, so if the requester already owns an endpoint with the same device token and attributes, that endpoint's ARN is returned without creating a new endpoint. For more information, see Using Amazon SNS Mobile Push Notifications.  When using CreatePlatformEndpoint with Baidu, two attributes must be provided: ChannelId and UserId. The token field must also contain the ChannelId. For more information, see Creating an Amazon SNS Endpoint for Baidu. 
    */
  def createPlatformEndpoint(params: CreatePlatformEndpointInput): Request[CreateEndpointResponse, AWSError] = js.native
  def createPlatformEndpoint(
    params: CreatePlatformEndpointInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointResponse, Unit]
  ): Request[CreateEndpointResponse, AWSError] = js.native
  
  /**
    * Adds a destination phone number to an Amazon Web Services account in the SMS sandbox and sends a one-time password (OTP) to that phone number. When you start using Amazon SNS to send SMS messages, your Amazon Web Services account is in the SMS sandbox. The SMS sandbox provides a safe environment for you to try Amazon SNS features without risking your reputation as an SMS sender. While your Amazon Web Services account is in the SMS sandbox, you can use all of the features of Amazon SNS. However, you can send SMS messages only to verified destination phone numbers. For more information, including how to move out of the sandbox to send messages without restrictions, see SMS sandbox in the Amazon SNS Developer Guide.
    */
  def createSMSSandboxPhoneNumber(): Request[CreateSMSSandboxPhoneNumberResult, AWSError] = js.native
  def createSMSSandboxPhoneNumber(callback: js.Function2[/* err */ AWSError, /* data */ CreateSMSSandboxPhoneNumberResult, Unit]): Request[CreateSMSSandboxPhoneNumberResult, AWSError] = js.native
  /**
    * Adds a destination phone number to an Amazon Web Services account in the SMS sandbox and sends a one-time password (OTP) to that phone number. When you start using Amazon SNS to send SMS messages, your Amazon Web Services account is in the SMS sandbox. The SMS sandbox provides a safe environment for you to try Amazon SNS features without risking your reputation as an SMS sender. While your Amazon Web Services account is in the SMS sandbox, you can use all of the features of Amazon SNS. However, you can send SMS messages only to verified destination phone numbers. For more information, including how to move out of the sandbox to send messages without restrictions, see SMS sandbox in the Amazon SNS Developer Guide.
    */
  def createSMSSandboxPhoneNumber(params: CreateSMSSandboxPhoneNumberInput): Request[CreateSMSSandboxPhoneNumberResult, AWSError] = js.native
  def createSMSSandboxPhoneNumber(
    params: CreateSMSSandboxPhoneNumberInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSMSSandboxPhoneNumberResult, Unit]
  ): Request[CreateSMSSandboxPhoneNumberResult, AWSError] = js.native
  
  /**
    * Creates a topic to which notifications can be published. Users can create at most 100,000 standard topics (at most 1,000 FIFO topics). For more information, see Creating an Amazon SNS topic in the Amazon SNS Developer Guide. This action is idempotent, so if the requester already owns a topic with the specified name, that topic's ARN is returned without creating a new topic.
    */
  def createTopic(): Request[CreateTopicResponse, AWSError] = js.native
  def createTopic(callback: js.Function2[/* err */ AWSError, /* data */ CreateTopicResponse, Unit]): Request[CreateTopicResponse, AWSError] = js.native
  /**
    * Creates a topic to which notifications can be published. Users can create at most 100,000 standard topics (at most 1,000 FIFO topics). For more information, see Creating an Amazon SNS topic in the Amazon SNS Developer Guide. This action is idempotent, so if the requester already owns a topic with the specified name, that topic's ARN is returned without creating a new topic.
    */
  def createTopic(params: CreateTopicInput): Request[CreateTopicResponse, AWSError] = js.native
  def createTopic(
    params: CreateTopicInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTopicResponse, Unit]
  ): Request[CreateTopicResponse, AWSError] = js.native
  
  /**
    * Deletes the endpoint for a device and mobile app from Amazon SNS. This action is idempotent. For more information, see Using Amazon SNS Mobile Push Notifications.  When you delete an endpoint that is also subscribed to a topic, then you must also unsubscribe the endpoint from the topic.
    */
  def deleteEndpoint(): Request[js.Object, AWSError] = js.native
  def deleteEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the endpoint for a device and mobile app from Amazon SNS. This action is idempotent. For more information, see Using Amazon SNS Mobile Push Notifications.  When you delete an endpoint that is also subscribed to a topic, then you must also unsubscribe the endpoint from the topic.
    */
  def deleteEndpoint(params: DeleteEndpointInput): Request[js.Object, AWSError] = js.native
  def deleteEndpoint(
    params: DeleteEndpointInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a platform application object for one of the supported push notification services, such as APNS and GCM (Firebase Cloud Messaging). For more information, see Using Amazon SNS Mobile Push Notifications. 
    */
  def deletePlatformApplication(): Request[js.Object, AWSError] = js.native
  def deletePlatformApplication(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a platform application object for one of the supported push notification services, such as APNS and GCM (Firebase Cloud Messaging). For more information, see Using Amazon SNS Mobile Push Notifications. 
    */
  def deletePlatformApplication(params: DeletePlatformApplicationInput): Request[js.Object, AWSError] = js.native
  def deletePlatformApplication(
    params: DeletePlatformApplicationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an Amazon Web Services account's verified or pending phone number from the SMS sandbox. When you start using Amazon SNS to send SMS messages, your Amazon Web Services account is in the SMS sandbox. The SMS sandbox provides a safe environment for you to try Amazon SNS features without risking your reputation as an SMS sender. While your Amazon Web Services account is in the SMS sandbox, you can use all of the features of Amazon SNS. However, you can send SMS messages only to verified destination phone numbers. For more information, including how to move out of the sandbox to send messages without restrictions, see SMS sandbox in the Amazon SNS Developer Guide.
    */
  def deleteSMSSandboxPhoneNumber(): Request[DeleteSMSSandboxPhoneNumberResult, AWSError] = js.native
  def deleteSMSSandboxPhoneNumber(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSMSSandboxPhoneNumberResult, Unit]): Request[DeleteSMSSandboxPhoneNumberResult, AWSError] = js.native
  /**
    * Deletes an Amazon Web Services account's verified or pending phone number from the SMS sandbox. When you start using Amazon SNS to send SMS messages, your Amazon Web Services account is in the SMS sandbox. The SMS sandbox provides a safe environment for you to try Amazon SNS features without risking your reputation as an SMS sender. While your Amazon Web Services account is in the SMS sandbox, you can use all of the features of Amazon SNS. However, you can send SMS messages only to verified destination phone numbers. For more information, including how to move out of the sandbox to send messages without restrictions, see SMS sandbox in the Amazon SNS Developer Guide.
    */
  def deleteSMSSandboxPhoneNumber(params: DeleteSMSSandboxPhoneNumberInput): Request[DeleteSMSSandboxPhoneNumberResult, AWSError] = js.native
  def deleteSMSSandboxPhoneNumber(
    params: DeleteSMSSandboxPhoneNumberInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSMSSandboxPhoneNumberResult, Unit]
  ): Request[DeleteSMSSandboxPhoneNumberResult, AWSError] = js.native
  
  /**
    * Deletes a topic and all its subscriptions. Deleting a topic might prevent some messages previously sent to the topic from being delivered to subscribers. This action is idempotent, so deleting a topic that does not exist does not result in an error.
    */
  def deleteTopic(): Request[js.Object, AWSError] = js.native
  def deleteTopic(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a topic and all its subscriptions. Deleting a topic might prevent some messages previously sent to the topic from being delivered to subscribers. This action is idempotent, so deleting a topic that does not exist does not result in an error.
    */
  def deleteTopic(params: DeleteTopicInput): Request[js.Object, AWSError] = js.native
  def deleteTopic(params: DeleteTopicInput, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Retrieves the specified inline DataProtectionPolicy document that is stored in the specified Amazon SNS topic. 
    */
  def getDataProtectionPolicy(): Request[GetDataProtectionPolicyResponse, AWSError] = js.native
  def getDataProtectionPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetDataProtectionPolicyResponse, Unit]): Request[GetDataProtectionPolicyResponse, AWSError] = js.native
  /**
    * Retrieves the specified inline DataProtectionPolicy document that is stored in the specified Amazon SNS topic. 
    */
  def getDataProtectionPolicy(params: GetDataProtectionPolicyInput): Request[GetDataProtectionPolicyResponse, AWSError] = js.native
  def getDataProtectionPolicy(
    params: GetDataProtectionPolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDataProtectionPolicyResponse, Unit]
  ): Request[GetDataProtectionPolicyResponse, AWSError] = js.native
  
  /**
    * Retrieves the endpoint attributes for a device on one of the supported push notification services, such as GCM (Firebase Cloud Messaging) and APNS. For more information, see Using Amazon SNS Mobile Push Notifications. 
    */
  def getEndpointAttributes(): Request[GetEndpointAttributesResponse, AWSError] = js.native
  def getEndpointAttributes(callback: js.Function2[/* err */ AWSError, /* data */ GetEndpointAttributesResponse, Unit]): Request[GetEndpointAttributesResponse, AWSError] = js.native
  /**
    * Retrieves the endpoint attributes for a device on one of the supported push notification services, such as GCM (Firebase Cloud Messaging) and APNS. For more information, see Using Amazon SNS Mobile Push Notifications. 
    */
  def getEndpointAttributes(params: GetEndpointAttributesInput): Request[GetEndpointAttributesResponse, AWSError] = js.native
  def getEndpointAttributes(
    params: GetEndpointAttributesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEndpointAttributesResponse, Unit]
  ): Request[GetEndpointAttributesResponse, AWSError] = js.native
  
  /**
    * Retrieves the attributes of the platform application object for the supported push notification services, such as APNS and GCM (Firebase Cloud Messaging). For more information, see Using Amazon SNS Mobile Push Notifications. 
    */
  def getPlatformApplicationAttributes(): Request[GetPlatformApplicationAttributesResponse, AWSError] = js.native
  def getPlatformApplicationAttributes(
    callback: js.Function2[/* err */ AWSError, /* data */ GetPlatformApplicationAttributesResponse, Unit]
  ): Request[GetPlatformApplicationAttributesResponse, AWSError] = js.native
  /**
    * Retrieves the attributes of the platform application object for the supported push notification services, such as APNS and GCM (Firebase Cloud Messaging). For more information, see Using Amazon SNS Mobile Push Notifications. 
    */
  def getPlatformApplicationAttributes(params: GetPlatformApplicationAttributesInput): Request[GetPlatformApplicationAttributesResponse, AWSError] = js.native
  def getPlatformApplicationAttributes(
    params: GetPlatformApplicationAttributesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPlatformApplicationAttributesResponse, Unit]
  ): Request[GetPlatformApplicationAttributesResponse, AWSError] = js.native
  
  /**
    * Returns the settings for sending SMS messages from your Amazon Web Services account. These settings are set with the SetSMSAttributes action.
    */
  def getSMSAttributes(): Request[GetSMSAttributesResponse, AWSError] = js.native
  def getSMSAttributes(callback: js.Function2[/* err */ AWSError, /* data */ GetSMSAttributesResponse, Unit]): Request[GetSMSAttributesResponse, AWSError] = js.native
  /**
    * Returns the settings for sending SMS messages from your Amazon Web Services account. These settings are set with the SetSMSAttributes action.
    */
  def getSMSAttributes(params: GetSMSAttributesInput): Request[GetSMSAttributesResponse, AWSError] = js.native
  def getSMSAttributes(
    params: GetSMSAttributesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSMSAttributesResponse, Unit]
  ): Request[GetSMSAttributesResponse, AWSError] = js.native
  
  /**
    * Retrieves the SMS sandbox status for the calling Amazon Web Services account in the target Amazon Web Services Region. When you start using Amazon SNS to send SMS messages, your Amazon Web Services account is in the SMS sandbox. The SMS sandbox provides a safe environment for you to try Amazon SNS features without risking your reputation as an SMS sender. While your Amazon Web Services account is in the SMS sandbox, you can use all of the features of Amazon SNS. However, you can send SMS messages only to verified destination phone numbers. For more information, including how to move out of the sandbox to send messages without restrictions, see SMS sandbox in the Amazon SNS Developer Guide.
    */
  def getSMSSandboxAccountStatus(): Request[GetSMSSandboxAccountStatusResult, AWSError] = js.native
  def getSMSSandboxAccountStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetSMSSandboxAccountStatusResult, Unit]): Request[GetSMSSandboxAccountStatusResult, AWSError] = js.native
  /**
    * Retrieves the SMS sandbox status for the calling Amazon Web Services account in the target Amazon Web Services Region. When you start using Amazon SNS to send SMS messages, your Amazon Web Services account is in the SMS sandbox. The SMS sandbox provides a safe environment for you to try Amazon SNS features without risking your reputation as an SMS sender. While your Amazon Web Services account is in the SMS sandbox, you can use all of the features of Amazon SNS. However, you can send SMS messages only to verified destination phone numbers. For more information, including how to move out of the sandbox to send messages without restrictions, see SMS sandbox in the Amazon SNS Developer Guide.
    */
  def getSMSSandboxAccountStatus(params: GetSMSSandboxAccountStatusInput): Request[GetSMSSandboxAccountStatusResult, AWSError] = js.native
  def getSMSSandboxAccountStatus(
    params: GetSMSSandboxAccountStatusInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSMSSandboxAccountStatusResult, Unit]
  ): Request[GetSMSSandboxAccountStatusResult, AWSError] = js.native
  
  /**
    * Returns all of the properties of a subscription.
    */
  def getSubscriptionAttributes(): Request[GetSubscriptionAttributesResponse, AWSError] = js.native
  def getSubscriptionAttributes(callback: js.Function2[/* err */ AWSError, /* data */ GetSubscriptionAttributesResponse, Unit]): Request[GetSubscriptionAttributesResponse, AWSError] = js.native
  /**
    * Returns all of the properties of a subscription.
    */
  def getSubscriptionAttributes(params: GetSubscriptionAttributesInput): Request[GetSubscriptionAttributesResponse, AWSError] = js.native
  def getSubscriptionAttributes(
    params: GetSubscriptionAttributesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSubscriptionAttributesResponse, Unit]
  ): Request[GetSubscriptionAttributesResponse, AWSError] = js.native
  
  /**
    * Returns all of the properties of a topic. Topic properties returned might differ based on the authorization of the user.
    */
  def getTopicAttributes(): Request[GetTopicAttributesResponse, AWSError] = js.native
  def getTopicAttributes(callback: js.Function2[/* err */ AWSError, /* data */ GetTopicAttributesResponse, Unit]): Request[GetTopicAttributesResponse, AWSError] = js.native
  /**
    * Returns all of the properties of a topic. Topic properties returned might differ based on the authorization of the user.
    */
  def getTopicAttributes(params: GetTopicAttributesInput): Request[GetTopicAttributesResponse, AWSError] = js.native
  def getTopicAttributes(
    params: GetTopicAttributesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTopicAttributesResponse, Unit]
  ): Request[GetTopicAttributesResponse, AWSError] = js.native
  
  /**
    * Lists the endpoints and endpoint attributes for devices in a supported push notification service, such as GCM (Firebase Cloud Messaging) and APNS. The results for ListEndpointsByPlatformApplication are paginated and return a limited list of endpoints, up to 100. If additional records are available after the first page results, then a NextToken string will be returned. To receive the next page, you call ListEndpointsByPlatformApplication again using the NextToken string received from the previous call. When there are no more records to return, NextToken will be null. For more information, see Using Amazon SNS Mobile Push Notifications.  This action is throttled at 30 transactions per second (TPS).
    */
  def listEndpointsByPlatformApplication(): Request[ListEndpointsByPlatformApplicationResponse, AWSError] = js.native
  def listEndpointsByPlatformApplication(
    callback: js.Function2[/* err */ AWSError, /* data */ ListEndpointsByPlatformApplicationResponse, Unit]
  ): Request[ListEndpointsByPlatformApplicationResponse, AWSError] = js.native
  /**
    * Lists the endpoints and endpoint attributes for devices in a supported push notification service, such as GCM (Firebase Cloud Messaging) and APNS. The results for ListEndpointsByPlatformApplication are paginated and return a limited list of endpoints, up to 100. If additional records are available after the first page results, then a NextToken string will be returned. To receive the next page, you call ListEndpointsByPlatformApplication again using the NextToken string received from the previous call. When there are no more records to return, NextToken will be null. For more information, see Using Amazon SNS Mobile Push Notifications.  This action is throttled at 30 transactions per second (TPS).
    */
  def listEndpointsByPlatformApplication(params: ListEndpointsByPlatformApplicationInput): Request[ListEndpointsByPlatformApplicationResponse, AWSError] = js.native
  def listEndpointsByPlatformApplication(
    params: ListEndpointsByPlatformApplicationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEndpointsByPlatformApplicationResponse, Unit]
  ): Request[ListEndpointsByPlatformApplicationResponse, AWSError] = js.native
  
  /**
    * Lists the calling Amazon Web Services account's dedicated origination numbers and their metadata. For more information about origination numbers, see Origination numbers in the Amazon SNS Developer Guide.
    */
  def listOriginationNumbers(): Request[ListOriginationNumbersResult, AWSError] = js.native
  def listOriginationNumbers(callback: js.Function2[/* err */ AWSError, /* data */ ListOriginationNumbersResult, Unit]): Request[ListOriginationNumbersResult, AWSError] = js.native
  /**
    * Lists the calling Amazon Web Services account's dedicated origination numbers and their metadata. For more information about origination numbers, see Origination numbers in the Amazon SNS Developer Guide.
    */
  def listOriginationNumbers(params: ListOriginationNumbersRequest): Request[ListOriginationNumbersResult, AWSError] = js.native
  def listOriginationNumbers(
    params: ListOriginationNumbersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListOriginationNumbersResult, Unit]
  ): Request[ListOriginationNumbersResult, AWSError] = js.native
  
  /**
    * Returns a list of phone numbers that are opted out, meaning you cannot send SMS messages to them. The results for ListPhoneNumbersOptedOut are paginated, and each page returns up to 100 phone numbers. If additional phone numbers are available after the first page of results, then a NextToken string will be returned. To receive the next page, you call ListPhoneNumbersOptedOut again using the NextToken string received from the previous call. When there are no more records to return, NextToken will be null.
    */
  def listPhoneNumbersOptedOut(): Request[ListPhoneNumbersOptedOutResponse, AWSError] = js.native
  def listPhoneNumbersOptedOut(callback: js.Function2[/* err */ AWSError, /* data */ ListPhoneNumbersOptedOutResponse, Unit]): Request[ListPhoneNumbersOptedOutResponse, AWSError] = js.native
  /**
    * Returns a list of phone numbers that are opted out, meaning you cannot send SMS messages to them. The results for ListPhoneNumbersOptedOut are paginated, and each page returns up to 100 phone numbers. If additional phone numbers are available after the first page of results, then a NextToken string will be returned. To receive the next page, you call ListPhoneNumbersOptedOut again using the NextToken string received from the previous call. When there are no more records to return, NextToken will be null.
    */
  def listPhoneNumbersOptedOut(params: ListPhoneNumbersOptedOutInput): Request[ListPhoneNumbersOptedOutResponse, AWSError] = js.native
  def listPhoneNumbersOptedOut(
    params: ListPhoneNumbersOptedOutInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPhoneNumbersOptedOutResponse, Unit]
  ): Request[ListPhoneNumbersOptedOutResponse, AWSError] = js.native
  
  /**
    * Lists the platform application objects for the supported push notification services, such as APNS and GCM (Firebase Cloud Messaging). The results for ListPlatformApplications are paginated and return a limited list of applications, up to 100. If additional records are available after the first page results, then a NextToken string will be returned. To receive the next page, you call ListPlatformApplications using the NextToken string received from the previous call. When there are no more records to return, NextToken will be null. For more information, see Using Amazon SNS Mobile Push Notifications.  This action is throttled at 15 transactions per second (TPS).
    */
  def listPlatformApplications(): Request[ListPlatformApplicationsResponse, AWSError] = js.native
  def listPlatformApplications(callback: js.Function2[/* err */ AWSError, /* data */ ListPlatformApplicationsResponse, Unit]): Request[ListPlatformApplicationsResponse, AWSError] = js.native
  /**
    * Lists the platform application objects for the supported push notification services, such as APNS and GCM (Firebase Cloud Messaging). The results for ListPlatformApplications are paginated and return a limited list of applications, up to 100. If additional records are available after the first page results, then a NextToken string will be returned. To receive the next page, you call ListPlatformApplications using the NextToken string received from the previous call. When there are no more records to return, NextToken will be null. For more information, see Using Amazon SNS Mobile Push Notifications.  This action is throttled at 15 transactions per second (TPS).
    */
  def listPlatformApplications(params: ListPlatformApplicationsInput): Request[ListPlatformApplicationsResponse, AWSError] = js.native
  def listPlatformApplications(
    params: ListPlatformApplicationsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPlatformApplicationsResponse, Unit]
  ): Request[ListPlatformApplicationsResponse, AWSError] = js.native
  
  /**
    * Lists the calling Amazon Web Services account's current verified and pending destination phone numbers in the SMS sandbox. When you start using Amazon SNS to send SMS messages, your Amazon Web Services account is in the SMS sandbox. The SMS sandbox provides a safe environment for you to try Amazon SNS features without risking your reputation as an SMS sender. While your Amazon Web Services account is in the SMS sandbox, you can use all of the features of Amazon SNS. However, you can send SMS messages only to verified destination phone numbers. For more information, including how to move out of the sandbox to send messages without restrictions, see SMS sandbox in the Amazon SNS Developer Guide.
    */
  def listSMSSandboxPhoneNumbers(): Request[ListSMSSandboxPhoneNumbersResult, AWSError] = js.native
  def listSMSSandboxPhoneNumbers(callback: js.Function2[/* err */ AWSError, /* data */ ListSMSSandboxPhoneNumbersResult, Unit]): Request[ListSMSSandboxPhoneNumbersResult, AWSError] = js.native
  /**
    * Lists the calling Amazon Web Services account's current verified and pending destination phone numbers in the SMS sandbox. When you start using Amazon SNS to send SMS messages, your Amazon Web Services account is in the SMS sandbox. The SMS sandbox provides a safe environment for you to try Amazon SNS features without risking your reputation as an SMS sender. While your Amazon Web Services account is in the SMS sandbox, you can use all of the features of Amazon SNS. However, you can send SMS messages only to verified destination phone numbers. For more information, including how to move out of the sandbox to send messages without restrictions, see SMS sandbox in the Amazon SNS Developer Guide.
    */
  def listSMSSandboxPhoneNumbers(params: ListSMSSandboxPhoneNumbersInput): Request[ListSMSSandboxPhoneNumbersResult, AWSError] = js.native
  def listSMSSandboxPhoneNumbers(
    params: ListSMSSandboxPhoneNumbersInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSMSSandboxPhoneNumbersResult, Unit]
  ): Request[ListSMSSandboxPhoneNumbersResult, AWSError] = js.native
  
  /**
    * Returns a list of the requester's subscriptions. Each call returns a limited list of subscriptions, up to 100. If there are more subscriptions, a NextToken is also returned. Use the NextToken parameter in a new ListSubscriptions call to get further results. This action is throttled at 30 transactions per second (TPS).
    */
  def listSubscriptions(): Request[ListSubscriptionsResponse, AWSError] = js.native
  def listSubscriptions(callback: js.Function2[/* err */ AWSError, /* data */ ListSubscriptionsResponse, Unit]): Request[ListSubscriptionsResponse, AWSError] = js.native
  /**
    * Returns a list of the requester's subscriptions. Each call returns a limited list of subscriptions, up to 100. If there are more subscriptions, a NextToken is also returned. Use the NextToken parameter in a new ListSubscriptions call to get further results. This action is throttled at 30 transactions per second (TPS).
    */
  def listSubscriptions(params: ListSubscriptionsInput): Request[ListSubscriptionsResponse, AWSError] = js.native
  def listSubscriptions(
    params: ListSubscriptionsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSubscriptionsResponse, Unit]
  ): Request[ListSubscriptionsResponse, AWSError] = js.native
  
  /**
    * Returns a list of the subscriptions to a specific topic. Each call returns a limited list of subscriptions, up to 100. If there are more subscriptions, a NextToken is also returned. Use the NextToken parameter in a new ListSubscriptionsByTopic call to get further results. This action is throttled at 30 transactions per second (TPS).
    */
  def listSubscriptionsByTopic(): Request[ListSubscriptionsByTopicResponse, AWSError] = js.native
  def listSubscriptionsByTopic(callback: js.Function2[/* err */ AWSError, /* data */ ListSubscriptionsByTopicResponse, Unit]): Request[ListSubscriptionsByTopicResponse, AWSError] = js.native
  /**
    * Returns a list of the subscriptions to a specific topic. Each call returns a limited list of subscriptions, up to 100. If there are more subscriptions, a NextToken is also returned. Use the NextToken parameter in a new ListSubscriptionsByTopic call to get further results. This action is throttled at 30 transactions per second (TPS).
    */
  def listSubscriptionsByTopic(params: ListSubscriptionsByTopicInput): Request[ListSubscriptionsByTopicResponse, AWSError] = js.native
  def listSubscriptionsByTopic(
    params: ListSubscriptionsByTopicInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSubscriptionsByTopicResponse, Unit]
  ): Request[ListSubscriptionsByTopicResponse, AWSError] = js.native
  
  /**
    * List all tags added to the specified Amazon SNS topic. For an overview, see Amazon SNS Tags in the Amazon Simple Notification Service Developer Guide.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * List all tags added to the specified Amazon SNS topic. For an overview, see Amazon SNS Tags in the Amazon Simple Notification Service Developer Guide.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Returns a list of the requester's topics. Each call returns a limited list of topics, up to 100. If there are more topics, a NextToken is also returned. Use the NextToken parameter in a new ListTopics call to get further results. This action is throttled at 30 transactions per second (TPS).
    */
  def listTopics(): Request[ListTopicsResponse, AWSError] = js.native
  def listTopics(callback: js.Function2[/* err */ AWSError, /* data */ ListTopicsResponse, Unit]): Request[ListTopicsResponse, AWSError] = js.native
  /**
    * Returns a list of the requester's topics. Each call returns a limited list of topics, up to 100. If there are more topics, a NextToken is also returned. Use the NextToken parameter in a new ListTopics call to get further results. This action is throttled at 30 transactions per second (TPS).
    */
  def listTopics(params: ListTopicsInput): Request[ListTopicsResponse, AWSError] = js.native
  def listTopics(
    params: ListTopicsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTopicsResponse, Unit]
  ): Request[ListTopicsResponse, AWSError] = js.native
  
  /**
    * Use this request to opt in a phone number that is opted out, which enables you to resume sending SMS messages to the number. You can opt in a phone number only once every 30 days.
    */
  def optInPhoneNumber(): Request[OptInPhoneNumberResponse, AWSError] = js.native
  def optInPhoneNumber(callback: js.Function2[/* err */ AWSError, /* data */ OptInPhoneNumberResponse, Unit]): Request[OptInPhoneNumberResponse, AWSError] = js.native
  /**
    * Use this request to opt in a phone number that is opted out, which enables you to resume sending SMS messages to the number. You can opt in a phone number only once every 30 days.
    */
  def optInPhoneNumber(params: OptInPhoneNumberInput): Request[OptInPhoneNumberResponse, AWSError] = js.native
  def optInPhoneNumber(
    params: OptInPhoneNumberInput,
    callback: js.Function2[/* err */ AWSError, /* data */ OptInPhoneNumberResponse, Unit]
  ): Request[OptInPhoneNumberResponse, AWSError] = js.native
  
  /**
    * Sends a message to an Amazon SNS topic, a text message (SMS message) directly to a phone number, or a message to a mobile platform endpoint (when you specify the TargetArn). If you send a message to a topic, Amazon SNS delivers the message to each endpoint that is subscribed to the topic. The format of the message depends on the notification protocol for each subscribed endpoint. When a messageId is returned, the message is saved and Amazon SNS immediately delivers it to subscribers. To use the Publish action for publishing a message to a mobile endpoint, such as an app on a Kindle device or mobile phone, you must specify the EndpointArn for the TargetArn parameter. The EndpointArn is returned when making a call with the CreatePlatformEndpoint action.  For more information about formatting messages, see Send Custom Platform-Specific Payloads in Messages to Mobile Devices.   You can publish messages only to topics and endpoints in the same Amazon Web Services Region. 
    */
  def publish(): Request[PublishResponse, AWSError] = js.native
  def publish(callback: js.Function2[/* err */ AWSError, /* data */ PublishResponse, Unit]): Request[PublishResponse, AWSError] = js.native
  /**
    * Sends a message to an Amazon SNS topic, a text message (SMS message) directly to a phone number, or a message to a mobile platform endpoint (when you specify the TargetArn). If you send a message to a topic, Amazon SNS delivers the message to each endpoint that is subscribed to the topic. The format of the message depends on the notification protocol for each subscribed endpoint. When a messageId is returned, the message is saved and Amazon SNS immediately delivers it to subscribers. To use the Publish action for publishing a message to a mobile endpoint, such as an app on a Kindle device or mobile phone, you must specify the EndpointArn for the TargetArn parameter. The EndpointArn is returned when making a call with the CreatePlatformEndpoint action.  For more information about formatting messages, see Send Custom Platform-Specific Payloads in Messages to Mobile Devices.   You can publish messages only to topics and endpoints in the same Amazon Web Services Region. 
    */
  def publish(params: PublishInput): Request[PublishResponse, AWSError] = js.native
  def publish(params: PublishInput, callback: js.Function2[/* err */ AWSError, /* data */ PublishResponse, Unit]): Request[PublishResponse, AWSError] = js.native
  
  /**
    * Publishes up to ten messages to the specified topic. This is a batch version of Publish. For FIFO topics, multiple messages within a single batch are published in the order they are sent, and messages are deduplicated within the batch and across batches for 5 minutes. The result of publishing each message is reported individually in the response. Because the batch request can result in a combination of successful and unsuccessful actions, you should check for batch errors even when the call returns an HTTP status code of 200. The maximum allowed individual message size and the maximum total payload size (the sum of the individual lengths of all of the batched messages) are both 256 KB (262,144 bytes).  Some actions take lists of parameters. These lists are specified using the param.n notation. Values of n are integers starting from 1. For example, a parameter list with two elements looks like this:  &amp;AttributeName.1=first &amp;AttributeName.2=second If you send a batch message to a topic, Amazon SNS publishes the batch message to each endpoint that is subscribed to the topic. The format of the batch message depends on the notification protocol for each subscribed endpoint. When a messageId is returned, the batch message is saved and Amazon SNS immediately delivers the message to subscribers.
    */
  def publishBatch(): Request[PublishBatchResponse, AWSError] = js.native
  def publishBatch(callback: js.Function2[/* err */ AWSError, /* data */ PublishBatchResponse, Unit]): Request[PublishBatchResponse, AWSError] = js.native
  /**
    * Publishes up to ten messages to the specified topic. This is a batch version of Publish. For FIFO topics, multiple messages within a single batch are published in the order they are sent, and messages are deduplicated within the batch and across batches for 5 minutes. The result of publishing each message is reported individually in the response. Because the batch request can result in a combination of successful and unsuccessful actions, you should check for batch errors even when the call returns an HTTP status code of 200. The maximum allowed individual message size and the maximum total payload size (the sum of the individual lengths of all of the batched messages) are both 256 KB (262,144 bytes).  Some actions take lists of parameters. These lists are specified using the param.n notation. Values of n are integers starting from 1. For example, a parameter list with two elements looks like this:  &amp;AttributeName.1=first &amp;AttributeName.2=second If you send a batch message to a topic, Amazon SNS publishes the batch message to each endpoint that is subscribed to the topic. The format of the batch message depends on the notification protocol for each subscribed endpoint. When a messageId is returned, the batch message is saved and Amazon SNS immediately delivers the message to subscribers.
    */
  def publishBatch(params: PublishBatchInput): Request[PublishBatchResponse, AWSError] = js.native
  def publishBatch(
    params: PublishBatchInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PublishBatchResponse, Unit]
  ): Request[PublishBatchResponse, AWSError] = js.native
  
  /**
    * Adds or updates an inline policy document that is stored in the specified Amazon SNS topic.
    */
  def putDataProtectionPolicy(): Request[js.Object, AWSError] = js.native
  def putDataProtectionPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds or updates an inline policy document that is stored in the specified Amazon SNS topic.
    */
  def putDataProtectionPolicy(params: PutDataProtectionPolicyInput): Request[js.Object, AWSError] = js.native
  def putDataProtectionPolicy(
    params: PutDataProtectionPolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes a statement from a topic's access control policy.
    */
  def removePermission(): Request[js.Object, AWSError] = js.native
  def removePermission(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes a statement from a topic's access control policy.
    */
  def removePermission(params: RemovePermissionInput): Request[js.Object, AWSError] = js.native
  def removePermission(
    params: RemovePermissionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Sets the attributes for an endpoint for a device on one of the supported push notification services, such as GCM (Firebase Cloud Messaging) and APNS. For more information, see Using Amazon SNS Mobile Push Notifications. 
    */
  def setEndpointAttributes(): Request[js.Object, AWSError] = js.native
  def setEndpointAttributes(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets the attributes for an endpoint for a device on one of the supported push notification services, such as GCM (Firebase Cloud Messaging) and APNS. For more information, see Using Amazon SNS Mobile Push Notifications. 
    */
  def setEndpointAttributes(params: SetEndpointAttributesInput): Request[js.Object, AWSError] = js.native
  def setEndpointAttributes(
    params: SetEndpointAttributesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Sets the attributes of the platform application object for the supported push notification services, such as APNS and GCM (Firebase Cloud Messaging). For more information, see Using Amazon SNS Mobile Push Notifications. For information on configuring attributes for message delivery status, see Using Amazon SNS Application Attributes for Message Delivery Status. 
    */
  def setPlatformApplicationAttributes(): Request[js.Object, AWSError] = js.native
  def setPlatformApplicationAttributes(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets the attributes of the platform application object for the supported push notification services, such as APNS and GCM (Firebase Cloud Messaging). For more information, see Using Amazon SNS Mobile Push Notifications. For information on configuring attributes for message delivery status, see Using Amazon SNS Application Attributes for Message Delivery Status. 
    */
  def setPlatformApplicationAttributes(params: SetPlatformApplicationAttributesInput): Request[js.Object, AWSError] = js.native
  def setPlatformApplicationAttributes(
    params: SetPlatformApplicationAttributesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Use this request to set the default settings for sending SMS messages and receiving daily SMS usage reports. You can override some of these settings for a single message when you use the Publish action with the MessageAttributes.entry.N parameter. For more information, see Publishing to a mobile phone in the Amazon SNS Developer Guide.  To use this operation, you must grant the Amazon SNS service principal (sns.amazonaws.com) permission to perform the s3:ListBucket action.  
    */
  def setSMSAttributes(): Request[SetSMSAttributesResponse, AWSError] = js.native
  def setSMSAttributes(callback: js.Function2[/* err */ AWSError, /* data */ SetSMSAttributesResponse, Unit]): Request[SetSMSAttributesResponse, AWSError] = js.native
  /**
    * Use this request to set the default settings for sending SMS messages and receiving daily SMS usage reports. You can override some of these settings for a single message when you use the Publish action with the MessageAttributes.entry.N parameter. For more information, see Publishing to a mobile phone in the Amazon SNS Developer Guide.  To use this operation, you must grant the Amazon SNS service principal (sns.amazonaws.com) permission to perform the s3:ListBucket action.  
    */
  def setSMSAttributes(params: SetSMSAttributesInput): Request[SetSMSAttributesResponse, AWSError] = js.native
  def setSMSAttributes(
    params: SetSMSAttributesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ SetSMSAttributesResponse, Unit]
  ): Request[SetSMSAttributesResponse, AWSError] = js.native
  
  /**
    * Allows a subscription owner to set an attribute of the subscription to a new value.
    */
  def setSubscriptionAttributes(): Request[js.Object, AWSError] = js.native
  def setSubscriptionAttributes(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Allows a subscription owner to set an attribute of the subscription to a new value.
    */
  def setSubscriptionAttributes(params: SetSubscriptionAttributesInput): Request[js.Object, AWSError] = js.native
  def setSubscriptionAttributes(
    params: SetSubscriptionAttributesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Allows a topic owner to set an attribute of the topic to a new value.
    */
  def setTopicAttributes(): Request[js.Object, AWSError] = js.native
  def setTopicAttributes(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Allows a topic owner to set an attribute of the topic to a new value.
    */
  def setTopicAttributes(params: SetTopicAttributesInput): Request[js.Object, AWSError] = js.native
  def setTopicAttributes(
    params: SetTopicAttributesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Subscribes an endpoint to an Amazon SNS topic. If the endpoint type is HTTP/S or email, or if the endpoint and the topic are not in the same Amazon Web Services account, the endpoint owner must run the ConfirmSubscription action to confirm the subscription. You call the ConfirmSubscription action with the token from the subscription response. Confirmation tokens are valid for three days. This action is throttled at 100 transactions per second (TPS).
    */
  def subscribe(): Request[SubscribeResponse, AWSError] = js.native
  def subscribe(callback: js.Function2[/* err */ AWSError, /* data */ SubscribeResponse, Unit]): Request[SubscribeResponse, AWSError] = js.native
  /**
    * Subscribes an endpoint to an Amazon SNS topic. If the endpoint type is HTTP/S or email, or if the endpoint and the topic are not in the same Amazon Web Services account, the endpoint owner must run the ConfirmSubscription action to confirm the subscription. You call the ConfirmSubscription action with the token from the subscription response. Confirmation tokens are valid for three days. This action is throttled at 100 transactions per second (TPS).
    */
  def subscribe(params: SubscribeInput): Request[SubscribeResponse, AWSError] = js.native
  def subscribe(
    params: SubscribeInput,
    callback: js.Function2[/* err */ AWSError, /* data */ SubscribeResponse, Unit]
  ): Request[SubscribeResponse, AWSError] = js.native
  
  /**
    * Add tags to the specified Amazon SNS topic. For an overview, see Amazon SNS Tags in the Amazon SNS Developer Guide. When you use topic tags, keep the following guidelines in mind:   Adding more than 50 tags to a topic isn't recommended.   Tags don't have any semantic meaning. Amazon SNS interprets tags as character strings.   Tags are case-sensitive.   A new tag with a key identical to that of an existing tag overwrites the existing tag.   Tagging actions are limited to 10 TPS per Amazon Web Services account, per Amazon Web Services Region. If your application requires a higher throughput, file a technical support request.  
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Add tags to the specified Amazon SNS topic. For an overview, see Amazon SNS Tags in the Amazon SNS Developer Guide. When you use topic tags, keep the following guidelines in mind:   Adding more than 50 tags to a topic isn't recommended.   Tags don't have any semantic meaning. Amazon SNS interprets tags as character strings.   Tags are case-sensitive.   A new tag with a key identical to that of an existing tag overwrites the existing tag.   Tagging actions are limited to 10 TPS per Amazon Web Services account, per Amazon Web Services Region. If your application requires a higher throughput, file a technical support request.  
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Deletes a subscription. If the subscription requires authentication for deletion, only the owner of the subscription or the topic's owner can unsubscribe, and an Amazon Web Services signature is required. If the Unsubscribe call does not require authentication and the requester is not the subscription owner, a final cancellation message is delivered to the endpoint, so that the endpoint owner can easily resubscribe to the topic if the Unsubscribe request was unintended. This action is throttled at 100 transactions per second (TPS).
    */
  def unsubscribe(): Request[js.Object, AWSError] = js.native
  def unsubscribe(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a subscription. If the subscription requires authentication for deletion, only the owner of the subscription or the topic's owner can unsubscribe, and an Amazon Web Services signature is required. If the Unsubscribe call does not require authentication and the requester is not the subscription owner, a final cancellation message is delivered to the endpoint, so that the endpoint owner can easily resubscribe to the topic if the Unsubscribe request was unintended. This action is throttled at 100 transactions per second (TPS).
    */
  def unsubscribe(params: UnsubscribeInput): Request[js.Object, AWSError] = js.native
  def unsubscribe(params: UnsubscribeInput, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Remove tags from the specified Amazon SNS topic. For an overview, see Amazon SNS Tags in the Amazon SNS Developer Guide.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Remove tags from the specified Amazon SNS topic. For an overview, see Amazon SNS Tags in the Amazon SNS Developer Guide.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Verifies a destination phone number with a one-time password (OTP) for the calling Amazon Web Services account. When you start using Amazon SNS to send SMS messages, your Amazon Web Services account is in the SMS sandbox. The SMS sandbox provides a safe environment for you to try Amazon SNS features without risking your reputation as an SMS sender. While your Amazon Web Services account is in the SMS sandbox, you can use all of the features of Amazon SNS. However, you can send SMS messages only to verified destination phone numbers. For more information, including how to move out of the sandbox to send messages without restrictions, see SMS sandbox in the Amazon SNS Developer Guide.
    */
  def verifySMSSandboxPhoneNumber(): Request[VerifySMSSandboxPhoneNumberResult, AWSError] = js.native
  def verifySMSSandboxPhoneNumber(callback: js.Function2[/* err */ AWSError, /* data */ VerifySMSSandboxPhoneNumberResult, Unit]): Request[VerifySMSSandboxPhoneNumberResult, AWSError] = js.native
  /**
    * Verifies a destination phone number with a one-time password (OTP) for the calling Amazon Web Services account. When you start using Amazon SNS to send SMS messages, your Amazon Web Services account is in the SMS sandbox. The SMS sandbox provides a safe environment for you to try Amazon SNS features without risking your reputation as an SMS sender. While your Amazon Web Services account is in the SMS sandbox, you can use all of the features of Amazon SNS. However, you can send SMS messages only to verified destination phone numbers. For more information, including how to move out of the sandbox to send messages without restrictions, see SMS sandbox in the Amazon SNS Developer Guide.
    */
  def verifySMSSandboxPhoneNumber(params: VerifySMSSandboxPhoneNumberInput): Request[VerifySMSSandboxPhoneNumberResult, AWSError] = js.native
  def verifySMSSandboxPhoneNumber(
    params: VerifySMSSandboxPhoneNumberInput,
    callback: js.Function2[/* err */ AWSError, /* data */ VerifySMSSandboxPhoneNumberResult, Unit]
  ): Request[VerifySMSSandboxPhoneNumberResult, AWSError] = js.native
}
