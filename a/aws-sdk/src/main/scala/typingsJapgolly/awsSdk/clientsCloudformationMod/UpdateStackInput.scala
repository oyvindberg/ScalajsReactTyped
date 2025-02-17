package typingsJapgolly.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStackInput extends StObject {
  
  /**
    * In some cases, you must explicitly acknowledge that your stack template contains certain capabilities in order for CloudFormation to update the stack.    CAPABILITY_IAM and CAPABILITY_NAMED_IAM  Some stack templates might include resources that can affect permissions in your Amazon Web Services account; for example, by creating new Identity and Access Management (IAM) users. For those stacks, you must explicitly acknowledge this by specifying one of these capabilities. The following IAM resources require you to specify either the CAPABILITY_IAM or CAPABILITY_NAMED_IAM capability.   If you have IAM resources, you can specify either capability.   If you have IAM resources with custom names, you must specify CAPABILITY_NAMED_IAM.   If you don't specify either of these capabilities, CloudFormation returns an InsufficientCapabilities error.   If your stack template contains these resources, we suggest that you review all permissions associated with them and edit their permissions if necessary.     AWS::IAM::AccessKey      AWS::IAM::Group     AWS::IAM::InstanceProfile      AWS::IAM::Policy      AWS::IAM::Role      AWS::IAM::User     AWS::IAM::UserToGroupAddition    For more information, see Acknowledging IAM Resources in CloudFormation Templates.    CAPABILITY_AUTO_EXPAND  Some template contain macros. Macros perform custom processing on templates; this can include simple actions like find-and-replace operations, all the way to extensive transformations of entire templates. Because of this, users typically create a change set from the processed template, so that they can review the changes resulting from the macros before actually updating the stack. If your stack template contains one or more macros, and you choose to update a stack directly from the processed template, without first reviewing the resulting changes in a change set, you must acknowledge this capability. This includes the AWS::Include and AWS::Serverless transforms, which are macros hosted by CloudFormation. If you want to update a stack from a stack template that contains macros and nested stacks, you must update the stack directly from the template using this capability.  You should only update stacks directly from a stack template that contains macros if you know what processing the macro performs. Each macro relies on an underlying Lambda service function for processing stack templates. Be aware that the Lambda function owner can update the function operation without CloudFormation being notified.  For more information, see Using CloudFormation Macros to Perform Custom Processing on Templates.  
    */
  var Capabilities: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.Capabilities] = js.undefined
  
  /**
    * A unique identifier for this UpdateStack request. Specify this token if you plan to retry requests so that CloudFormation knows that you're not attempting to update a stack with the same name. You might retry UpdateStack requests to ensure that CloudFormation successfully received them. All events triggered by a given stack operation are assigned the same client request token, which you can use to track operations. For example, if you execute a CreateStack operation with the token token1, then all the StackEvents generated by that operation will have ClientRequestToken set as token1. In the console, stack operations display the client request token on the Events tab. Stack operations that are initiated from the console use the token format Console-StackOperation-ID, which helps you easily identify the stack operation . For example, if you create a stack using the console, each stack event would be assigned the same token in the following format: Console-CreateStack-7f59c3cf-00d2-40c7-b2ff-e75db0987002.
    */
  var ClientRequestToken: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.ClientRequestToken] = js.undefined
  
  /**
    * Preserve the state of previously provisioned resources when an operation fails. Default: False 
    */
  var DisableRollback: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.DisableRollback] = js.undefined
  
  /**
    * Amazon Simple Notification Service topic Amazon Resource Names (ARNs) that CloudFormation associates with the stack. Specify an empty list to remove all notification topics.
    */
  var NotificationARNs: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.NotificationARNs] = js.undefined
  
  /**
    * A list of Parameter structures that specify input parameters for the stack. For more information, see the Parameter data type.
    */
  var Parameters: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.Parameters] = js.undefined
  
  /**
    * The template resource types that you have permissions to work with for this update stack action, such as AWS::EC2::Instance, AWS::EC2::*, or Custom::MyCustomInstance. If the list of resource types doesn't include a resource that you're updating, the stack update fails. By default, CloudFormation grants permissions to all resource types. Identity and Access Management (IAM) uses this parameter for CloudFormation-specific condition keys in IAM policies. For more information, see Controlling Access with Identity and Access Management.
    */
  var ResourceTypes: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.ResourceTypes] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an Identity and Access Management (IAM) role that CloudFormation assumes to update the stack. CloudFormation uses the role's credentials to make calls on your behalf. CloudFormation always uses this role for all future operations on the stack. Provided that users have permission to operate on the stack, CloudFormation uses this role even if the users don't have permission to pass it. Ensure that the role grants least privilege. If you don't specify a value, CloudFormation uses the role that was previously associated with the stack. If no role is available, CloudFormation uses a temporary session that is generated from your user credentials.
    */
  var RoleARN: js.UndefOr[RoleARN_] = js.undefined
  
  /**
    * The rollback triggers for CloudFormation to monitor during stack creation and updating operations, and for the specified monitoring period afterwards.
    */
  var RollbackConfiguration: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.RollbackConfiguration] = js.undefined
  
  /**
    * The name or unique stack ID of the stack to update.
    */
  var StackName: typingsJapgolly.awsSdk.clientsCloudformationMod.StackName
  
  /**
    * Structure containing a new stack policy body. You can specify either the StackPolicyBody or the StackPolicyURL parameter, but not both. You might update the stack policy, for example, in order to protect a new resource that you created during a stack update. If you don't specify a stack policy, the current policy that is associated with the stack is unchanged.
    */
  var StackPolicyBody: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.StackPolicyBody] = js.undefined
  
  /**
    * Structure containing the temporary overriding stack policy body. You can specify either the StackPolicyDuringUpdateBody or the StackPolicyDuringUpdateURL parameter, but not both. If you want to update protected resources, specify a temporary overriding stack policy during this update. If you don't specify a stack policy, the current policy that is associated with the stack will be used.
    */
  var StackPolicyDuringUpdateBody: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.StackPolicyDuringUpdateBody] = js.undefined
  
  /**
    * Location of a file containing the temporary overriding stack policy. The URL must point to a policy (max size: 16KB) located in an S3 bucket in the same Region as the stack. You can specify either the StackPolicyDuringUpdateBody or the StackPolicyDuringUpdateURL parameter, but not both. If you want to update protected resources, specify a temporary overriding stack policy during this update. If you don't specify a stack policy, the current policy that is associated with the stack will be used.
    */
  var StackPolicyDuringUpdateURL: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.StackPolicyDuringUpdateURL] = js.undefined
  
  /**
    * Location of a file containing the updated stack policy. The URL must point to a policy (max size: 16KB) located in an S3 bucket in the same Region as the stack. You can specify either the StackPolicyBody or the StackPolicyURL parameter, but not both. You might update the stack policy, for example, in order to protect a new resource that you created during a stack update. If you don't specify a stack policy, the current policy that is associated with the stack is unchanged.
    */
  var StackPolicyURL: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.StackPolicyURL] = js.undefined
  
  /**
    * Key-value pairs to associate with this stack. CloudFormation also propagates these tags to supported resources in the stack. You can specify a maximum number of 50 tags. If you don't specify this parameter, CloudFormation doesn't modify the stack's tags. If you specify an empty value, CloudFormation removes all associated tags.
    */
  var Tags: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.Tags] = js.undefined
  
  /**
    * Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes. (For more information, go to Template Anatomy in the CloudFormation User Guide.) Conditional: You must specify only one of the following parameters: TemplateBody, TemplateURL, or set the UsePreviousTemplate to true.
    */
  var TemplateBody: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.TemplateBody] = js.undefined
  
  /**
    * Location of file containing the template body. The URL must point to a template that's located in an Amazon S3 bucket or a Systems Manager document. For more information, go to Template Anatomy in the CloudFormation User Guide. Conditional: You must specify only one of the following parameters: TemplateBody, TemplateURL, or set the UsePreviousTemplate to true.
    */
  var TemplateURL: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.TemplateURL] = js.undefined
  
  /**
    * Reuse the existing template that is associated with the stack that you are updating. Conditional: You must specify only one of the following parameters: TemplateBody, TemplateURL, or set the UsePreviousTemplate to true.
    */
  var UsePreviousTemplate: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.UsePreviousTemplate] = js.undefined
}
object UpdateStackInput {
  
  inline def apply(StackName: StackName): UpdateStackInput = {
    val __obj = js.Dynamic.literal(StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStackInput]
  }
  
  extension [Self <: UpdateStackInput](x: Self) {
    
    inline def setCapabilities(value: Capabilities): Self = StObject.set(x, "Capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "Capabilities", js.undefined)
    
    inline def setCapabilitiesVarargs(value: Capability*): Self = StObject.set(x, "Capabilities", js.Array(value*))
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setDisableRollback(value: DisableRollback): Self = StObject.set(x, "DisableRollback", value.asInstanceOf[js.Any])
    
    inline def setDisableRollbackUndefined: Self = StObject.set(x, "DisableRollback", js.undefined)
    
    inline def setNotificationARNs(value: NotificationARNs): Self = StObject.set(x, "NotificationARNs", value.asInstanceOf[js.Any])
    
    inline def setNotificationARNsUndefined: Self = StObject.set(x, "NotificationARNs", js.undefined)
    
    inline def setNotificationARNsVarargs(value: NotificationARN*): Self = StObject.set(x, "NotificationARNs", js.Array(value*))
    
    inline def setParameters(value: Parameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setParametersVarargs(value: Parameter*): Self = StObject.set(x, "Parameters", js.Array(value*))
    
    inline def setResourceTypes(value: ResourceTypes): Self = StObject.set(x, "ResourceTypes", value.asInstanceOf[js.Any])
    
    inline def setResourceTypesUndefined: Self = StObject.set(x, "ResourceTypes", js.undefined)
    
    inline def setResourceTypesVarargs(value: ResourceType*): Self = StObject.set(x, "ResourceTypes", js.Array(value*))
    
    inline def setRoleARN(value: RoleARN_): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    inline def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
    
    inline def setRollbackConfiguration(value: RollbackConfiguration): Self = StObject.set(x, "RollbackConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRollbackConfigurationUndefined: Self = StObject.set(x, "RollbackConfiguration", js.undefined)
    
    inline def setStackName(value: StackName): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    inline def setStackPolicyBody(value: StackPolicyBody): Self = StObject.set(x, "StackPolicyBody", value.asInstanceOf[js.Any])
    
    inline def setStackPolicyBodyUndefined: Self = StObject.set(x, "StackPolicyBody", js.undefined)
    
    inline def setStackPolicyDuringUpdateBody(value: StackPolicyDuringUpdateBody): Self = StObject.set(x, "StackPolicyDuringUpdateBody", value.asInstanceOf[js.Any])
    
    inline def setStackPolicyDuringUpdateBodyUndefined: Self = StObject.set(x, "StackPolicyDuringUpdateBody", js.undefined)
    
    inline def setStackPolicyDuringUpdateURL(value: StackPolicyDuringUpdateURL): Self = StObject.set(x, "StackPolicyDuringUpdateURL", value.asInstanceOf[js.Any])
    
    inline def setStackPolicyDuringUpdateURLUndefined: Self = StObject.set(x, "StackPolicyDuringUpdateURL", js.undefined)
    
    inline def setStackPolicyURL(value: StackPolicyURL): Self = StObject.set(x, "StackPolicyURL", value.asInstanceOf[js.Any])
    
    inline def setStackPolicyURLUndefined: Self = StObject.set(x, "StackPolicyURL", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTemplateBody(value: TemplateBody): Self = StObject.set(x, "TemplateBody", value.asInstanceOf[js.Any])
    
    inline def setTemplateBodyUndefined: Self = StObject.set(x, "TemplateBody", js.undefined)
    
    inline def setTemplateURL(value: TemplateURL): Self = StObject.set(x, "TemplateURL", value.asInstanceOf[js.Any])
    
    inline def setTemplateURLUndefined: Self = StObject.set(x, "TemplateURL", js.undefined)
    
    inline def setUsePreviousTemplate(value: UsePreviousTemplate): Self = StObject.set(x, "UsePreviousTemplate", value.asInstanceOf[js.Any])
    
    inline def setUsePreviousTemplateUndefined: Self = StObject.set(x, "UsePreviousTemplate", js.undefined)
  }
}
