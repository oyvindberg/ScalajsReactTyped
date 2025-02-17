package typingsJapgolly.awsSdk.clientsApplicationautoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScalingPolicy extends StObject {
  
  /**
    * The CloudWatch alarms associated with the scaling policy.
    */
  var Alarms: js.UndefOr[typingsJapgolly.awsSdk.clientsApplicationautoscalingMod.Alarms] = js.undefined
  
  /**
    * The Unix timestamp for when the scaling policy was created.
    */
  var CreationTime: js.Date
  
  /**
    * The Amazon Resource Name (ARN) of the scaling policy.
    */
  var PolicyARN: ResourceIdMaxLen1600
  
  /**
    * The name of the scaling policy.
    */
  var PolicyName: typingsJapgolly.awsSdk.clientsApplicationautoscalingMod.PolicyName
  
  /**
    * The scaling policy type.
    */
  var PolicyType: typingsJapgolly.awsSdk.clientsApplicationautoscalingMod.PolicyType
  
  /**
    * The identifier of the resource associated with the scaling policy. This string consists of the resource type and unique identifier.   ECS service - The resource type is service and the unique identifier is the cluster name and service name. Example: service/default/sample-webapp.   Spot Fleet - The resource type is spot-fleet-request and the unique identifier is the Spot Fleet request ID. Example: spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE.   EMR cluster - The resource type is instancegroup and the unique identifier is the cluster ID and instance group ID. Example: instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0.   AppStream 2.0 fleet - The resource type is fleet and the unique identifier is the fleet name. Example: fleet/sample-fleet.   DynamoDB table - The resource type is table and the unique identifier is the table name. Example: table/my-table.   DynamoDB global secondary index - The resource type is index and the unique identifier is the index name. Example: table/my-table/index/my-table-index.   Aurora DB cluster - The resource type is cluster and the unique identifier is the cluster name. Example: cluster:my-db-cluster.   SageMaker endpoint variant - The resource type is variant and the unique identifier is the resource ID. Example: endpoint/my-end-point/variant/KMeansClustering.   Custom resources are not supported with a resource type. This parameter must specify the OutputValue from the CloudFormation template stack used to access the resources. The unique identifier is defined by the service provider. More information is available in our GitHub repository.   Amazon Comprehend document classification endpoint - The resource type and unique identifier are specified using the endpoint ARN. Example: arn:aws:comprehend:us-west-2:123456789012:document-classifier-endpoint/EXAMPLE.   Amazon Comprehend entity recognizer endpoint - The resource type and unique identifier are specified using the endpoint ARN. Example: arn:aws:comprehend:us-west-2:123456789012:entity-recognizer-endpoint/EXAMPLE.   Lambda provisioned concurrency - The resource type is function and the unique identifier is the function name with a function version or alias name suffix that is not $LATEST. Example: function:my-function:prod or function:my-function:1.   Amazon Keyspaces table - The resource type is table and the unique identifier is the table name. Example: keyspace/mykeyspace/table/mytable.   Amazon MSK cluster - The resource type and unique identifier are specified using the cluster ARN. Example: arn:aws:kafka:us-east-1:123456789012:cluster/demo-cluster-1/6357e0b2-0e6a-4b86-a0b4-70df934c2e31-5.   Amazon ElastiCache replication group - The resource type is replication-group and the unique identifier is the replication group name. Example: replication-group/mycluster.   Neptune cluster - The resource type is cluster and the unique identifier is the cluster name. Example: cluster:mycluster.  
    */
  var ResourceId: ResourceIdMaxLen1600
  
  /**
    * The scalable dimension. This string consists of the service namespace, resource type, and scaling property.    ecs:service:DesiredCount - The desired task count of an ECS service.    elasticmapreduce:instancegroup:InstanceCount - The instance count of an EMR Instance Group.    ec2:spot-fleet-request:TargetCapacity - The target capacity of a Spot Fleet.    appstream:fleet:DesiredCapacity - The desired capacity of an AppStream 2.0 fleet.    dynamodb:table:ReadCapacityUnits - The provisioned read capacity for a DynamoDB table.    dynamodb:table:WriteCapacityUnits - The provisioned write capacity for a DynamoDB table.    dynamodb:index:ReadCapacityUnits - The provisioned read capacity for a DynamoDB global secondary index.    dynamodb:index:WriteCapacityUnits - The provisioned write capacity for a DynamoDB global secondary index.    rds:cluster:ReadReplicaCount - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.    sagemaker:variant:DesiredInstanceCount - The number of EC2 instances for an SageMaker model endpoint variant.    custom-resource:ResourceType:Property - The scalable dimension for a custom resource provided by your own application or service.    comprehend:document-classifier-endpoint:DesiredInferenceUnits - The number of inference units for an Amazon Comprehend document classification endpoint.    comprehend:entity-recognizer-endpoint:DesiredInferenceUnits - The number of inference units for an Amazon Comprehend entity recognizer endpoint.    lambda:function:ProvisionedConcurrency - The provisioned concurrency for a Lambda function.    cassandra:table:ReadCapacityUnits - The provisioned read capacity for an Amazon Keyspaces table.    cassandra:table:WriteCapacityUnits - The provisioned write capacity for an Amazon Keyspaces table.    kafka:broker-storage:VolumeSize - The provisioned volume size (in GiB) for brokers in an Amazon MSK cluster.    elasticache:replication-group:NodeGroups - The number of node groups for an Amazon ElastiCache replication group.    elasticache:replication-group:Replicas - The number of replicas per node group for an Amazon ElastiCache replication group.    neptune:cluster:ReadReplicaCount - The count of read replicas in an Amazon Neptune DB cluster.  
    */
  var ScalableDimension: typingsJapgolly.awsSdk.clientsApplicationautoscalingMod.ScalableDimension
  
  /**
    * The namespace of the Amazon Web Services service that provides the resource, or a custom-resource.
    */
  var ServiceNamespace: typingsJapgolly.awsSdk.clientsApplicationautoscalingMod.ServiceNamespace
  
  /**
    * A step scaling policy.
    */
  var StepScalingPolicyConfiguration: js.UndefOr[
    typingsJapgolly.awsSdk.clientsApplicationautoscalingMod.StepScalingPolicyConfiguration
  ] = js.undefined
  
  /**
    * A target tracking scaling policy.
    */
  var TargetTrackingScalingPolicyConfiguration: js.UndefOr[
    typingsJapgolly.awsSdk.clientsApplicationautoscalingMod.TargetTrackingScalingPolicyConfiguration
  ] = js.undefined
}
object ScalingPolicy {
  
  inline def apply(
    CreationTime: js.Date,
    PolicyARN: ResourceIdMaxLen1600,
    PolicyName: PolicyName,
    PolicyType: PolicyType,
    ResourceId: ResourceIdMaxLen1600,
    ScalableDimension: ScalableDimension,
    ServiceNamespace: ServiceNamespace
  ): ScalingPolicy = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], PolicyARN = PolicyARN.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any], PolicyType = PolicyType.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any], ScalableDimension = ScalableDimension.asInstanceOf[js.Any], ServiceNamespace = ServiceNamespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingPolicy]
  }
  
  extension [Self <: ScalingPolicy](x: Self) {
    
    inline def setAlarms(value: Alarms): Self = StObject.set(x, "Alarms", value.asInstanceOf[js.Any])
    
    inline def setAlarmsUndefined: Self = StObject.set(x, "Alarms", js.undefined)
    
    inline def setAlarmsVarargs(value: Alarm*): Self = StObject.set(x, "Alarms", js.Array(value*))
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setPolicyARN(value: ResourceIdMaxLen1600): Self = StObject.set(x, "PolicyARN", value.asInstanceOf[js.Any])
    
    inline def setPolicyName(value: PolicyName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyType(value: PolicyType): Self = StObject.set(x, "PolicyType", value.asInstanceOf[js.Any])
    
    inline def setResourceId(value: ResourceIdMaxLen1600): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setScalableDimension(value: ScalableDimension): Self = StObject.set(x, "ScalableDimension", value.asInstanceOf[js.Any])
    
    inline def setServiceNamespace(value: ServiceNamespace): Self = StObject.set(x, "ServiceNamespace", value.asInstanceOf[js.Any])
    
    inline def setStepScalingPolicyConfiguration(value: StepScalingPolicyConfiguration): Self = StObject.set(x, "StepScalingPolicyConfiguration", value.asInstanceOf[js.Any])
    
    inline def setStepScalingPolicyConfigurationUndefined: Self = StObject.set(x, "StepScalingPolicyConfiguration", js.undefined)
    
    inline def setTargetTrackingScalingPolicyConfiguration(value: TargetTrackingScalingPolicyConfiguration): Self = StObject.set(x, "TargetTrackingScalingPolicyConfiguration", value.asInstanceOf[js.Any])
    
    inline def setTargetTrackingScalingPolicyConfigurationUndefined: Self = StObject.set(x, "TargetTrackingScalingPolicyConfiguration", js.undefined)
  }
}
