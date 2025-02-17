package typingsJapgolly.awsSdk.clientsInspectorMod

import typingsJapgolly.awsSdk.libConfigBaseMod.ConfigBase
import typingsJapgolly.awsSdk.libErrorMod.AWSError
import typingsJapgolly.awsSdk.libRequestMod.Request
import typingsJapgolly.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Inspector extends Service {
  
  /**
    * Assigns attributes (key and value pairs) to the findings that are specified by the ARNs of the findings.
    */
  def addAttributesToFindings(): Request[AddAttributesToFindingsResponse, AWSError] = js.native
  def addAttributesToFindings(callback: js.Function2[/* err */ AWSError, /* data */ AddAttributesToFindingsResponse, Unit]): Request[AddAttributesToFindingsResponse, AWSError] = js.native
  /**
    * Assigns attributes (key and value pairs) to the findings that are specified by the ARNs of the findings.
    */
  def addAttributesToFindings(params: AddAttributesToFindingsRequest): Request[AddAttributesToFindingsResponse, AWSError] = js.native
  def addAttributesToFindings(
    params: AddAttributesToFindingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddAttributesToFindingsResponse, Unit]
  ): Request[AddAttributesToFindingsResponse, AWSError] = js.native
  
  @JSName("config")
  var config_Inspector: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a new assessment target using the ARN of the resource group that is generated by CreateResourceGroup. If resourceGroupArn is not specified, all EC2 instances in the current AWS account and region are included in the assessment target. If the service-linked role isn’t already registered, this action also creates and registers a service-linked role to grant Amazon Inspector access to AWS Services needed to perform security assessments. You can create up to 50 assessment targets per AWS account. You can run up to 500 concurrent agents per AWS account. For more information, see  Amazon Inspector Assessment Targets.
    */
  def createAssessmentTarget(): Request[CreateAssessmentTargetResponse, AWSError] = js.native
  def createAssessmentTarget(callback: js.Function2[/* err */ AWSError, /* data */ CreateAssessmentTargetResponse, Unit]): Request[CreateAssessmentTargetResponse, AWSError] = js.native
  /**
    * Creates a new assessment target using the ARN of the resource group that is generated by CreateResourceGroup. If resourceGroupArn is not specified, all EC2 instances in the current AWS account and region are included in the assessment target. If the service-linked role isn’t already registered, this action also creates and registers a service-linked role to grant Amazon Inspector access to AWS Services needed to perform security assessments. You can create up to 50 assessment targets per AWS account. You can run up to 500 concurrent agents per AWS account. For more information, see  Amazon Inspector Assessment Targets.
    */
  def createAssessmentTarget(params: CreateAssessmentTargetRequest): Request[CreateAssessmentTargetResponse, AWSError] = js.native
  def createAssessmentTarget(
    params: CreateAssessmentTargetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAssessmentTargetResponse, Unit]
  ): Request[CreateAssessmentTargetResponse, AWSError] = js.native
  
  /**
    * Creates an assessment template for the assessment target that is specified by the ARN of the assessment target. If the service-linked role isn’t already registered, this action also creates and registers a service-linked role to grant Amazon Inspector access to AWS Services needed to perform security assessments.
    */
  def createAssessmentTemplate(): Request[CreateAssessmentTemplateResponse, AWSError] = js.native
  def createAssessmentTemplate(callback: js.Function2[/* err */ AWSError, /* data */ CreateAssessmentTemplateResponse, Unit]): Request[CreateAssessmentTemplateResponse, AWSError] = js.native
  /**
    * Creates an assessment template for the assessment target that is specified by the ARN of the assessment target. If the service-linked role isn’t already registered, this action also creates and registers a service-linked role to grant Amazon Inspector access to AWS Services needed to perform security assessments.
    */
  def createAssessmentTemplate(params: CreateAssessmentTemplateRequest): Request[CreateAssessmentTemplateResponse, AWSError] = js.native
  def createAssessmentTemplate(
    params: CreateAssessmentTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAssessmentTemplateResponse, Unit]
  ): Request[CreateAssessmentTemplateResponse, AWSError] = js.native
  
  /**
    * Starts the generation of an exclusions preview for the specified assessment template. The exclusions preview lists the potential exclusions (ExclusionPreview) that Inspector can detect before it runs the assessment. 
    */
  def createExclusionsPreview(): Request[CreateExclusionsPreviewResponse, AWSError] = js.native
  def createExclusionsPreview(callback: js.Function2[/* err */ AWSError, /* data */ CreateExclusionsPreviewResponse, Unit]): Request[CreateExclusionsPreviewResponse, AWSError] = js.native
  /**
    * Starts the generation of an exclusions preview for the specified assessment template. The exclusions preview lists the potential exclusions (ExclusionPreview) that Inspector can detect before it runs the assessment. 
    */
  def createExclusionsPreview(params: CreateExclusionsPreviewRequest): Request[CreateExclusionsPreviewResponse, AWSError] = js.native
  def createExclusionsPreview(
    params: CreateExclusionsPreviewRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateExclusionsPreviewResponse, Unit]
  ): Request[CreateExclusionsPreviewResponse, AWSError] = js.native
  
  /**
    * Creates a resource group using the specified set of tags (key and value pairs) that are used to select the EC2 instances to be included in an Amazon Inspector assessment target. The created resource group is then used to create an Amazon Inspector assessment target. For more information, see CreateAssessmentTarget.
    */
  def createResourceGroup(): Request[CreateResourceGroupResponse, AWSError] = js.native
  def createResourceGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateResourceGroupResponse, Unit]): Request[CreateResourceGroupResponse, AWSError] = js.native
  /**
    * Creates a resource group using the specified set of tags (key and value pairs) that are used to select the EC2 instances to be included in an Amazon Inspector assessment target. The created resource group is then used to create an Amazon Inspector assessment target. For more information, see CreateAssessmentTarget.
    */
  def createResourceGroup(params: CreateResourceGroupRequest): Request[CreateResourceGroupResponse, AWSError] = js.native
  def createResourceGroup(
    params: CreateResourceGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateResourceGroupResponse, Unit]
  ): Request[CreateResourceGroupResponse, AWSError] = js.native
  
  /**
    * Deletes the assessment run that is specified by the ARN of the assessment run.
    */
  def deleteAssessmentRun(): Request[js.Object, AWSError] = js.native
  def deleteAssessmentRun(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the assessment run that is specified by the ARN of the assessment run.
    */
  def deleteAssessmentRun(params: DeleteAssessmentRunRequest): Request[js.Object, AWSError] = js.native
  def deleteAssessmentRun(
    params: DeleteAssessmentRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the assessment target that is specified by the ARN of the assessment target.
    */
  def deleteAssessmentTarget(): Request[js.Object, AWSError] = js.native
  def deleteAssessmentTarget(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the assessment target that is specified by the ARN of the assessment target.
    */
  def deleteAssessmentTarget(params: DeleteAssessmentTargetRequest): Request[js.Object, AWSError] = js.native
  def deleteAssessmentTarget(
    params: DeleteAssessmentTargetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the assessment template that is specified by the ARN of the assessment template.
    */
  def deleteAssessmentTemplate(): Request[js.Object, AWSError] = js.native
  def deleteAssessmentTemplate(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the assessment template that is specified by the ARN of the assessment template.
    */
  def deleteAssessmentTemplate(params: DeleteAssessmentTemplateRequest): Request[js.Object, AWSError] = js.native
  def deleteAssessmentTemplate(
    params: DeleteAssessmentTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Describes the assessment runs that are specified by the ARNs of the assessment runs.
    */
  def describeAssessmentRuns(): Request[DescribeAssessmentRunsResponse, AWSError] = js.native
  def describeAssessmentRuns(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAssessmentRunsResponse, Unit]): Request[DescribeAssessmentRunsResponse, AWSError] = js.native
  /**
    * Describes the assessment runs that are specified by the ARNs of the assessment runs.
    */
  def describeAssessmentRuns(params: DescribeAssessmentRunsRequest): Request[DescribeAssessmentRunsResponse, AWSError] = js.native
  def describeAssessmentRuns(
    params: DescribeAssessmentRunsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAssessmentRunsResponse, Unit]
  ): Request[DescribeAssessmentRunsResponse, AWSError] = js.native
  
  /**
    * Describes the assessment targets that are specified by the ARNs of the assessment targets.
    */
  def describeAssessmentTargets(): Request[DescribeAssessmentTargetsResponse, AWSError] = js.native
  def describeAssessmentTargets(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAssessmentTargetsResponse, Unit]): Request[DescribeAssessmentTargetsResponse, AWSError] = js.native
  /**
    * Describes the assessment targets that are specified by the ARNs of the assessment targets.
    */
  def describeAssessmentTargets(params: DescribeAssessmentTargetsRequest): Request[DescribeAssessmentTargetsResponse, AWSError] = js.native
  def describeAssessmentTargets(
    params: DescribeAssessmentTargetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAssessmentTargetsResponse, Unit]
  ): Request[DescribeAssessmentTargetsResponse, AWSError] = js.native
  
  /**
    * Describes the assessment templates that are specified by the ARNs of the assessment templates.
    */
  def describeAssessmentTemplates(): Request[DescribeAssessmentTemplatesResponse, AWSError] = js.native
  def describeAssessmentTemplates(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAssessmentTemplatesResponse, Unit]): Request[DescribeAssessmentTemplatesResponse, AWSError] = js.native
  /**
    * Describes the assessment templates that are specified by the ARNs of the assessment templates.
    */
  def describeAssessmentTemplates(params: DescribeAssessmentTemplatesRequest): Request[DescribeAssessmentTemplatesResponse, AWSError] = js.native
  def describeAssessmentTemplates(
    params: DescribeAssessmentTemplatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAssessmentTemplatesResponse, Unit]
  ): Request[DescribeAssessmentTemplatesResponse, AWSError] = js.native
  
  /**
    * Describes the IAM role that enables Amazon Inspector to access your AWS account.
    */
  def describeCrossAccountAccessRole(): Request[DescribeCrossAccountAccessRoleResponse, AWSError] = js.native
  def describeCrossAccountAccessRole(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCrossAccountAccessRoleResponse, Unit]
  ): Request[DescribeCrossAccountAccessRoleResponse, AWSError] = js.native
  
  /**
    * Describes the exclusions that are specified by the exclusions' ARNs.
    */
  def describeExclusions(): Request[DescribeExclusionsResponse, AWSError] = js.native
  def describeExclusions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeExclusionsResponse, Unit]): Request[DescribeExclusionsResponse, AWSError] = js.native
  /**
    * Describes the exclusions that are specified by the exclusions' ARNs.
    */
  def describeExclusions(params: DescribeExclusionsRequest): Request[DescribeExclusionsResponse, AWSError] = js.native
  def describeExclusions(
    params: DescribeExclusionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeExclusionsResponse, Unit]
  ): Request[DescribeExclusionsResponse, AWSError] = js.native
  
  /**
    * Describes the findings that are specified by the ARNs of the findings.
    */
  def describeFindings(): Request[DescribeFindingsResponse, AWSError] = js.native
  def describeFindings(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFindingsResponse, Unit]): Request[DescribeFindingsResponse, AWSError] = js.native
  /**
    * Describes the findings that are specified by the ARNs of the findings.
    */
  def describeFindings(params: DescribeFindingsRequest): Request[DescribeFindingsResponse, AWSError] = js.native
  def describeFindings(
    params: DescribeFindingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFindingsResponse, Unit]
  ): Request[DescribeFindingsResponse, AWSError] = js.native
  
  /**
    * Describes the resource groups that are specified by the ARNs of the resource groups.
    */
  def describeResourceGroups(): Request[DescribeResourceGroupsResponse, AWSError] = js.native
  def describeResourceGroups(callback: js.Function2[/* err */ AWSError, /* data */ DescribeResourceGroupsResponse, Unit]): Request[DescribeResourceGroupsResponse, AWSError] = js.native
  /**
    * Describes the resource groups that are specified by the ARNs of the resource groups.
    */
  def describeResourceGroups(params: DescribeResourceGroupsRequest): Request[DescribeResourceGroupsResponse, AWSError] = js.native
  def describeResourceGroups(
    params: DescribeResourceGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeResourceGroupsResponse, Unit]
  ): Request[DescribeResourceGroupsResponse, AWSError] = js.native
  
  /**
    * Describes the rules packages that are specified by the ARNs of the rules packages.
    */
  def describeRulesPackages(): Request[DescribeRulesPackagesResponse, AWSError] = js.native
  def describeRulesPackages(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRulesPackagesResponse, Unit]): Request[DescribeRulesPackagesResponse, AWSError] = js.native
  /**
    * Describes the rules packages that are specified by the ARNs of the rules packages.
    */
  def describeRulesPackages(params: DescribeRulesPackagesRequest): Request[DescribeRulesPackagesResponse, AWSError] = js.native
  def describeRulesPackages(
    params: DescribeRulesPackagesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRulesPackagesResponse, Unit]
  ): Request[DescribeRulesPackagesResponse, AWSError] = js.native
  
  /**
    * Produces an assessment report that includes detailed and comprehensive results of a specified assessment run. 
    */
  def getAssessmentReport(): Request[GetAssessmentReportResponse, AWSError] = js.native
  def getAssessmentReport(callback: js.Function2[/* err */ AWSError, /* data */ GetAssessmentReportResponse, Unit]): Request[GetAssessmentReportResponse, AWSError] = js.native
  /**
    * Produces an assessment report that includes detailed and comprehensive results of a specified assessment run. 
    */
  def getAssessmentReport(params: GetAssessmentReportRequest): Request[GetAssessmentReportResponse, AWSError] = js.native
  def getAssessmentReport(
    params: GetAssessmentReportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAssessmentReportResponse, Unit]
  ): Request[GetAssessmentReportResponse, AWSError] = js.native
  
  /**
    * Retrieves the exclusions preview (a list of ExclusionPreview objects) specified by the preview token. You can obtain the preview token by running the CreateExclusionsPreview API.
    */
  def getExclusionsPreview(): Request[GetExclusionsPreviewResponse, AWSError] = js.native
  def getExclusionsPreview(callback: js.Function2[/* err */ AWSError, /* data */ GetExclusionsPreviewResponse, Unit]): Request[GetExclusionsPreviewResponse, AWSError] = js.native
  /**
    * Retrieves the exclusions preview (a list of ExclusionPreview objects) specified by the preview token. You can obtain the preview token by running the CreateExclusionsPreview API.
    */
  def getExclusionsPreview(params: GetExclusionsPreviewRequest): Request[GetExclusionsPreviewResponse, AWSError] = js.native
  def getExclusionsPreview(
    params: GetExclusionsPreviewRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetExclusionsPreviewResponse, Unit]
  ): Request[GetExclusionsPreviewResponse, AWSError] = js.native
  
  /**
    * Information about the data that is collected for the specified assessment run.
    */
  def getTelemetryMetadata(): Request[GetTelemetryMetadataResponse, AWSError] = js.native
  def getTelemetryMetadata(callback: js.Function2[/* err */ AWSError, /* data */ GetTelemetryMetadataResponse, Unit]): Request[GetTelemetryMetadataResponse, AWSError] = js.native
  /**
    * Information about the data that is collected for the specified assessment run.
    */
  def getTelemetryMetadata(params: GetTelemetryMetadataRequest): Request[GetTelemetryMetadataResponse, AWSError] = js.native
  def getTelemetryMetadata(
    params: GetTelemetryMetadataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTelemetryMetadataResponse, Unit]
  ): Request[GetTelemetryMetadataResponse, AWSError] = js.native
  
  /**
    * Lists the agents of the assessment runs that are specified by the ARNs of the assessment runs.
    */
  def listAssessmentRunAgents(): Request[ListAssessmentRunAgentsResponse, AWSError] = js.native
  def listAssessmentRunAgents(callback: js.Function2[/* err */ AWSError, /* data */ ListAssessmentRunAgentsResponse, Unit]): Request[ListAssessmentRunAgentsResponse, AWSError] = js.native
  /**
    * Lists the agents of the assessment runs that are specified by the ARNs of the assessment runs.
    */
  def listAssessmentRunAgents(params: ListAssessmentRunAgentsRequest): Request[ListAssessmentRunAgentsResponse, AWSError] = js.native
  def listAssessmentRunAgents(
    params: ListAssessmentRunAgentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAssessmentRunAgentsResponse, Unit]
  ): Request[ListAssessmentRunAgentsResponse, AWSError] = js.native
  
  /**
    * Lists the assessment runs that correspond to the assessment templates that are specified by the ARNs of the assessment templates.
    */
  def listAssessmentRuns(): Request[ListAssessmentRunsResponse, AWSError] = js.native
  def listAssessmentRuns(callback: js.Function2[/* err */ AWSError, /* data */ ListAssessmentRunsResponse, Unit]): Request[ListAssessmentRunsResponse, AWSError] = js.native
  /**
    * Lists the assessment runs that correspond to the assessment templates that are specified by the ARNs of the assessment templates.
    */
  def listAssessmentRuns(params: ListAssessmentRunsRequest): Request[ListAssessmentRunsResponse, AWSError] = js.native
  def listAssessmentRuns(
    params: ListAssessmentRunsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAssessmentRunsResponse, Unit]
  ): Request[ListAssessmentRunsResponse, AWSError] = js.native
  
  /**
    * Lists the ARNs of the assessment targets within this AWS account. For more information about assessment targets, see Amazon Inspector Assessment Targets.
    */
  def listAssessmentTargets(): Request[ListAssessmentTargetsResponse, AWSError] = js.native
  def listAssessmentTargets(callback: js.Function2[/* err */ AWSError, /* data */ ListAssessmentTargetsResponse, Unit]): Request[ListAssessmentTargetsResponse, AWSError] = js.native
  /**
    * Lists the ARNs of the assessment targets within this AWS account. For more information about assessment targets, see Amazon Inspector Assessment Targets.
    */
  def listAssessmentTargets(params: ListAssessmentTargetsRequest): Request[ListAssessmentTargetsResponse, AWSError] = js.native
  def listAssessmentTargets(
    params: ListAssessmentTargetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAssessmentTargetsResponse, Unit]
  ): Request[ListAssessmentTargetsResponse, AWSError] = js.native
  
  /**
    * Lists the assessment templates that correspond to the assessment targets that are specified by the ARNs of the assessment targets.
    */
  def listAssessmentTemplates(): Request[ListAssessmentTemplatesResponse, AWSError] = js.native
  def listAssessmentTemplates(callback: js.Function2[/* err */ AWSError, /* data */ ListAssessmentTemplatesResponse, Unit]): Request[ListAssessmentTemplatesResponse, AWSError] = js.native
  /**
    * Lists the assessment templates that correspond to the assessment targets that are specified by the ARNs of the assessment targets.
    */
  def listAssessmentTemplates(params: ListAssessmentTemplatesRequest): Request[ListAssessmentTemplatesResponse, AWSError] = js.native
  def listAssessmentTemplates(
    params: ListAssessmentTemplatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAssessmentTemplatesResponse, Unit]
  ): Request[ListAssessmentTemplatesResponse, AWSError] = js.native
  
  /**
    * Lists all the event subscriptions for the assessment template that is specified by the ARN of the assessment template. For more information, see SubscribeToEvent and UnsubscribeFromEvent.
    */
  def listEventSubscriptions(): Request[ListEventSubscriptionsResponse, AWSError] = js.native
  def listEventSubscriptions(callback: js.Function2[/* err */ AWSError, /* data */ ListEventSubscriptionsResponse, Unit]): Request[ListEventSubscriptionsResponse, AWSError] = js.native
  /**
    * Lists all the event subscriptions for the assessment template that is specified by the ARN of the assessment template. For more information, see SubscribeToEvent and UnsubscribeFromEvent.
    */
  def listEventSubscriptions(params: ListEventSubscriptionsRequest): Request[ListEventSubscriptionsResponse, AWSError] = js.native
  def listEventSubscriptions(
    params: ListEventSubscriptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEventSubscriptionsResponse, Unit]
  ): Request[ListEventSubscriptionsResponse, AWSError] = js.native
  
  /**
    * List exclusions that are generated by the assessment run.
    */
  def listExclusions(): Request[ListExclusionsResponse, AWSError] = js.native
  def listExclusions(callback: js.Function2[/* err */ AWSError, /* data */ ListExclusionsResponse, Unit]): Request[ListExclusionsResponse, AWSError] = js.native
  /**
    * List exclusions that are generated by the assessment run.
    */
  def listExclusions(params: ListExclusionsRequest): Request[ListExclusionsResponse, AWSError] = js.native
  def listExclusions(
    params: ListExclusionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListExclusionsResponse, Unit]
  ): Request[ListExclusionsResponse, AWSError] = js.native
  
  /**
    * Lists findings that are generated by the assessment runs that are specified by the ARNs of the assessment runs.
    */
  def listFindings(): Request[ListFindingsResponse, AWSError] = js.native
  def listFindings(callback: js.Function2[/* err */ AWSError, /* data */ ListFindingsResponse, Unit]): Request[ListFindingsResponse, AWSError] = js.native
  /**
    * Lists findings that are generated by the assessment runs that are specified by the ARNs of the assessment runs.
    */
  def listFindings(params: ListFindingsRequest): Request[ListFindingsResponse, AWSError] = js.native
  def listFindings(
    params: ListFindingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFindingsResponse, Unit]
  ): Request[ListFindingsResponse, AWSError] = js.native
  
  /**
    * Lists all available Amazon Inspector rules packages.
    */
  def listRulesPackages(): Request[ListRulesPackagesResponse, AWSError] = js.native
  def listRulesPackages(callback: js.Function2[/* err */ AWSError, /* data */ ListRulesPackagesResponse, Unit]): Request[ListRulesPackagesResponse, AWSError] = js.native
  /**
    * Lists all available Amazon Inspector rules packages.
    */
  def listRulesPackages(params: ListRulesPackagesRequest): Request[ListRulesPackagesResponse, AWSError] = js.native
  def listRulesPackages(
    params: ListRulesPackagesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRulesPackagesResponse, Unit]
  ): Request[ListRulesPackagesResponse, AWSError] = js.native
  
  /**
    * Lists all tags associated with an assessment template.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists all tags associated with an assessment template.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Previews the agents installed on the EC2 instances that are part of the specified assessment target.
    */
  def previewAgents(): Request[PreviewAgentsResponse, AWSError] = js.native
  def previewAgents(callback: js.Function2[/* err */ AWSError, /* data */ PreviewAgentsResponse, Unit]): Request[PreviewAgentsResponse, AWSError] = js.native
  /**
    * Previews the agents installed on the EC2 instances that are part of the specified assessment target.
    */
  def previewAgents(params: PreviewAgentsRequest): Request[PreviewAgentsResponse, AWSError] = js.native
  def previewAgents(
    params: PreviewAgentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PreviewAgentsResponse, Unit]
  ): Request[PreviewAgentsResponse, AWSError] = js.native
  
  /**
    * Registers the IAM role that grants Amazon Inspector access to AWS Services needed to perform security assessments.
    */
  def registerCrossAccountAccessRole(): Request[js.Object, AWSError] = js.native
  def registerCrossAccountAccessRole(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Registers the IAM role that grants Amazon Inspector access to AWS Services needed to perform security assessments.
    */
  def registerCrossAccountAccessRole(params: RegisterCrossAccountAccessRoleRequest): Request[js.Object, AWSError] = js.native
  def registerCrossAccountAccessRole(
    params: RegisterCrossAccountAccessRoleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes entire attributes (key and value pairs) from the findings that are specified by the ARNs of the findings where an attribute with the specified key exists.
    */
  def removeAttributesFromFindings(): Request[RemoveAttributesFromFindingsResponse, AWSError] = js.native
  def removeAttributesFromFindings(callback: js.Function2[/* err */ AWSError, /* data */ RemoveAttributesFromFindingsResponse, Unit]): Request[RemoveAttributesFromFindingsResponse, AWSError] = js.native
  /**
    * Removes entire attributes (key and value pairs) from the findings that are specified by the ARNs of the findings where an attribute with the specified key exists.
    */
  def removeAttributesFromFindings(params: RemoveAttributesFromFindingsRequest): Request[RemoveAttributesFromFindingsResponse, AWSError] = js.native
  def removeAttributesFromFindings(
    params: RemoveAttributesFromFindingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveAttributesFromFindingsResponse, Unit]
  ): Request[RemoveAttributesFromFindingsResponse, AWSError] = js.native
  
  /**
    * Sets tags (key and value pairs) to the assessment template that is specified by the ARN of the assessment template.
    */
  def setTagsForResource(): Request[js.Object, AWSError] = js.native
  def setTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets tags (key and value pairs) to the assessment template that is specified by the ARN of the assessment template.
    */
  def setTagsForResource(params: SetTagsForResourceRequest): Request[js.Object, AWSError] = js.native
  def setTagsForResource(
    params: SetTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Starts the assessment run specified by the ARN of the assessment template. For this API to function properly, you must not exceed the limit of running up to 500 concurrent agents per AWS account.
    */
  def startAssessmentRun(): Request[StartAssessmentRunResponse, AWSError] = js.native
  def startAssessmentRun(callback: js.Function2[/* err */ AWSError, /* data */ StartAssessmentRunResponse, Unit]): Request[StartAssessmentRunResponse, AWSError] = js.native
  /**
    * Starts the assessment run specified by the ARN of the assessment template. For this API to function properly, you must not exceed the limit of running up to 500 concurrent agents per AWS account.
    */
  def startAssessmentRun(params: StartAssessmentRunRequest): Request[StartAssessmentRunResponse, AWSError] = js.native
  def startAssessmentRun(
    params: StartAssessmentRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartAssessmentRunResponse, Unit]
  ): Request[StartAssessmentRunResponse, AWSError] = js.native
  
  /**
    * Stops the assessment run that is specified by the ARN of the assessment run.
    */
  def stopAssessmentRun(): Request[js.Object, AWSError] = js.native
  def stopAssessmentRun(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Stops the assessment run that is specified by the ARN of the assessment run.
    */
  def stopAssessmentRun(params: StopAssessmentRunRequest): Request[js.Object, AWSError] = js.native
  def stopAssessmentRun(
    params: StopAssessmentRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Enables the process of sending Amazon Simple Notification Service (SNS) notifications about a specified event to a specified SNS topic.
    */
  def subscribeToEvent(): Request[js.Object, AWSError] = js.native
  def subscribeToEvent(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Enables the process of sending Amazon Simple Notification Service (SNS) notifications about a specified event to a specified SNS topic.
    */
  def subscribeToEvent(params: SubscribeToEventRequest): Request[js.Object, AWSError] = js.native
  def subscribeToEvent(
    params: SubscribeToEventRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Disables the process of sending Amazon Simple Notification Service (SNS) notifications about a specified event to a specified SNS topic.
    */
  def unsubscribeFromEvent(): Request[js.Object, AWSError] = js.native
  def unsubscribeFromEvent(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Disables the process of sending Amazon Simple Notification Service (SNS) notifications about a specified event to a specified SNS topic.
    */
  def unsubscribeFromEvent(params: UnsubscribeFromEventRequest): Request[js.Object, AWSError] = js.native
  def unsubscribeFromEvent(
    params: UnsubscribeFromEventRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the assessment target that is specified by the ARN of the assessment target. If resourceGroupArn is not specified, all EC2 instances in the current AWS account and region are included in the assessment target.
    */
  def updateAssessmentTarget(): Request[js.Object, AWSError] = js.native
  def updateAssessmentTarget(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the assessment target that is specified by the ARN of the assessment target. If resourceGroupArn is not specified, all EC2 instances in the current AWS account and region are included in the assessment target.
    */
  def updateAssessmentTarget(params: UpdateAssessmentTargetRequest): Request[js.Object, AWSError] = js.native
  def updateAssessmentTarget(
    params: UpdateAssessmentTargetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
}
