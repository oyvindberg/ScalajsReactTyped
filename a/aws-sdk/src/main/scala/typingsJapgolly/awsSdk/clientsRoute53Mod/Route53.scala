package typingsJapgolly.awsSdk.clientsRoute53Mod

import typingsJapgolly.awsSdk.anon.GetChangeRequestwaiterWai
import typingsJapgolly.awsSdk.awsSdkStrings.resourceRecordSetsChanged
import typingsJapgolly.awsSdk.libConfigBaseMod.ConfigBase
import typingsJapgolly.awsSdk.libErrorMod.AWSError
import typingsJapgolly.awsSdk.libRequestMod.Request
import typingsJapgolly.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Route53 extends Service {
  
  /**
    * Activates a key-signing key (KSK) so that it can be used for signing by DNSSEC. This operation changes the KSK status to ACTIVE.
    */
  def activateKeySigningKey(): Request[ActivateKeySigningKeyResponse, AWSError] = js.native
  def activateKeySigningKey(callback: js.Function2[/* err */ AWSError, /* data */ ActivateKeySigningKeyResponse, Unit]): Request[ActivateKeySigningKeyResponse, AWSError] = js.native
  /**
    * Activates a key-signing key (KSK) so that it can be used for signing by DNSSEC. This operation changes the KSK status to ACTIVE.
    */
  def activateKeySigningKey(params: ActivateKeySigningKeyRequest): Request[ActivateKeySigningKeyResponse, AWSError] = js.native
  def activateKeySigningKey(
    params: ActivateKeySigningKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ActivateKeySigningKeyResponse, Unit]
  ): Request[ActivateKeySigningKeyResponse, AWSError] = js.native
  
  /**
    * Associates an Amazon VPC with a private hosted zone.   To perform the association, the VPC and the private hosted zone must already exist. You can't convert a public hosted zone into a private hosted zone.   If you want to associate a VPC that was created by using one Amazon Web Services account with a private hosted zone that was created by using a different account, the Amazon Web Services account that created the private hosted zone must first submit a CreateVPCAssociationAuthorization request. Then the account that created the VPC must submit an AssociateVPCWithHostedZone request.   When granting access, the hosted zone and the Amazon VPC must belong to the same partition. A partition is a group of Amazon Web Services Regions. Each Amazon Web Services account is scoped to one partition. The following are the supported partitions:    aws - Amazon Web Services Regions    aws-cn - China Regions    aws-us-gov - Amazon Web Services GovCloud (US) Region   For more information, see Access Management in the Amazon Web Services General Reference. 
    */
  def associateVPCWithHostedZone(): Request[AssociateVPCWithHostedZoneResponse, AWSError] = js.native
  def associateVPCWithHostedZone(callback: js.Function2[/* err */ AWSError, /* data */ AssociateVPCWithHostedZoneResponse, Unit]): Request[AssociateVPCWithHostedZoneResponse, AWSError] = js.native
  /**
    * Associates an Amazon VPC with a private hosted zone.   To perform the association, the VPC and the private hosted zone must already exist. You can't convert a public hosted zone into a private hosted zone.   If you want to associate a VPC that was created by using one Amazon Web Services account with a private hosted zone that was created by using a different account, the Amazon Web Services account that created the private hosted zone must first submit a CreateVPCAssociationAuthorization request. Then the account that created the VPC must submit an AssociateVPCWithHostedZone request.   When granting access, the hosted zone and the Amazon VPC must belong to the same partition. A partition is a group of Amazon Web Services Regions. Each Amazon Web Services account is scoped to one partition. The following are the supported partitions:    aws - Amazon Web Services Regions    aws-cn - China Regions    aws-us-gov - Amazon Web Services GovCloud (US) Region   For more information, see Access Management in the Amazon Web Services General Reference. 
    */
  def associateVPCWithHostedZone(params: AssociateVPCWithHostedZoneRequest): Request[AssociateVPCWithHostedZoneResponse, AWSError] = js.native
  def associateVPCWithHostedZone(
    params: AssociateVPCWithHostedZoneRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateVPCWithHostedZoneResponse, Unit]
  ): Request[AssociateVPCWithHostedZoneResponse, AWSError] = js.native
  
  /**
    * Creates, changes, or deletes CIDR blocks within a collection. Contains authoritative IP information mapping blocks to one or multiple locations. A change request can update multiple locations in a collection at a time, which is helpful if you want to move one or more CIDR blocks from one location to another in one transaction, without downtime.   Limits  The max number of CIDR blocks included in the request is 1000. As a result, big updates require multiple API calls.   PUT and DELETE_IF_EXISTS  Use ChangeCidrCollection to perform the following actions:    PUT: Create a CIDR block within the specified collection.     DELETE_IF_EXISTS: Delete an existing CIDR block from the collection.  
    */
  def changeCidrCollection(): Request[ChangeCidrCollectionResponse, AWSError] = js.native
  def changeCidrCollection(callback: js.Function2[/* err */ AWSError, /* data */ ChangeCidrCollectionResponse, Unit]): Request[ChangeCidrCollectionResponse, AWSError] = js.native
  /**
    * Creates, changes, or deletes CIDR blocks within a collection. Contains authoritative IP information mapping blocks to one or multiple locations. A change request can update multiple locations in a collection at a time, which is helpful if you want to move one or more CIDR blocks from one location to another in one transaction, without downtime.   Limits  The max number of CIDR blocks included in the request is 1000. As a result, big updates require multiple API calls.   PUT and DELETE_IF_EXISTS  Use ChangeCidrCollection to perform the following actions:    PUT: Create a CIDR block within the specified collection.     DELETE_IF_EXISTS: Delete an existing CIDR block from the collection.  
    */
  def changeCidrCollection(params: ChangeCidrCollectionRequest): Request[ChangeCidrCollectionResponse, AWSError] = js.native
  def changeCidrCollection(
    params: ChangeCidrCollectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ChangeCidrCollectionResponse, Unit]
  ): Request[ChangeCidrCollectionResponse, AWSError] = js.native
  
  /**
    * Creates, changes, or deletes a resource record set, which contains authoritative DNS information for a specified domain name or subdomain name. For example, you can use ChangeResourceRecordSets to create a resource record set that routes traffic for test.example.com to a web server that has an IP address of 192.0.2.44.  Deleting Resource Record Sets  To delete a resource record set, you must specify all the same values that you specified when you created it.  Change Batches and Transactional Changes  The request body must include a document with a ChangeResourceRecordSetsRequest element. The request body contains a list of change items, known as a change batch. Change batches are considered transactional changes. Route 53 validates the changes in the request and then either makes all or none of the changes in the change batch request. This ensures that DNS routing isn't adversely affected by partial changes to the resource record sets in a hosted zone.  For example, suppose a change batch request contains two changes: it deletes the CNAME resource record set for www.example.com and creates an alias resource record set for www.example.com. If validation for both records succeeds, Route 53 deletes the first resource record set and creates the second resource record set in a single operation. If validation for either the DELETE or the CREATE action fails, then the request is canceled, and the original CNAME record continues to exist.  If you try to delete the same resource record set more than once in a single change batch, Route 53 returns an InvalidChangeBatch error.   Traffic Flow  To create resource record sets for complex routing configurations, use either the traffic flow visual editor in the Route 53 console or the API actions for traffic policies and traffic policy instances. Save the configuration as a traffic policy, then associate the traffic policy with one or more domain names (such as example.com) or subdomain names (such as www.example.com), in the same hosted zone or in multiple hosted zones. You can roll back the updates if the new configuration isn't performing as expected. For more information, see Using Traffic Flow to Route DNS Traffic in the Amazon Route 53 Developer Guide.  Create, Delete, and Upsert  Use ChangeResourceRecordsSetsRequest to perform the following actions:    CREATE: Creates a resource record set that has the specified values.    DELETE: Deletes an existing resource record set that has the specified values.    UPSERT: If a resource set exists Route 53 updates it with the values in the request.     Syntaxes for Creating, Updating, and Deleting Resource Record Sets  The syntax for a request depends on the type of resource record set that you want to create, delete, or update, such as weighted, alias, or failover. The XML elements in your request must appear in the order listed in the syntax.  For an example for each type of resource record set, see "Examples." Don't refer to the syntax in the "Parameter Syntax" section, which includes all of the elements for every kind of resource record set that you can create, delete, or update by using ChangeResourceRecordSets.   Change Propagation to Route 53 DNS Servers  When you submit a ChangeResourceRecordSets request, Route 53 propagates your changes to all of the Route 53 authoritative DNS servers. While your changes are propagating, GetChange returns a status of PENDING. When propagation is complete, GetChange returns a status of INSYNC. Changes generally propagate to all Route 53 name servers within 60 seconds. For more information, see GetChange.  Limits on ChangeResourceRecordSets Requests  For information about the limits on a ChangeResourceRecordSets request, see Limits in the Amazon Route 53 Developer Guide.
    */
  def changeResourceRecordSets(): Request[ChangeResourceRecordSetsResponse, AWSError] = js.native
  def changeResourceRecordSets(callback: js.Function2[/* err */ AWSError, /* data */ ChangeResourceRecordSetsResponse, Unit]): Request[ChangeResourceRecordSetsResponse, AWSError] = js.native
  /**
    * Creates, changes, or deletes a resource record set, which contains authoritative DNS information for a specified domain name or subdomain name. For example, you can use ChangeResourceRecordSets to create a resource record set that routes traffic for test.example.com to a web server that has an IP address of 192.0.2.44.  Deleting Resource Record Sets  To delete a resource record set, you must specify all the same values that you specified when you created it.  Change Batches and Transactional Changes  The request body must include a document with a ChangeResourceRecordSetsRequest element. The request body contains a list of change items, known as a change batch. Change batches are considered transactional changes. Route 53 validates the changes in the request and then either makes all or none of the changes in the change batch request. This ensures that DNS routing isn't adversely affected by partial changes to the resource record sets in a hosted zone.  For example, suppose a change batch request contains two changes: it deletes the CNAME resource record set for www.example.com and creates an alias resource record set for www.example.com. If validation for both records succeeds, Route 53 deletes the first resource record set and creates the second resource record set in a single operation. If validation for either the DELETE or the CREATE action fails, then the request is canceled, and the original CNAME record continues to exist.  If you try to delete the same resource record set more than once in a single change batch, Route 53 returns an InvalidChangeBatch error.   Traffic Flow  To create resource record sets for complex routing configurations, use either the traffic flow visual editor in the Route 53 console or the API actions for traffic policies and traffic policy instances. Save the configuration as a traffic policy, then associate the traffic policy with one or more domain names (such as example.com) or subdomain names (such as www.example.com), in the same hosted zone or in multiple hosted zones. You can roll back the updates if the new configuration isn't performing as expected. For more information, see Using Traffic Flow to Route DNS Traffic in the Amazon Route 53 Developer Guide.  Create, Delete, and Upsert  Use ChangeResourceRecordsSetsRequest to perform the following actions:    CREATE: Creates a resource record set that has the specified values.    DELETE: Deletes an existing resource record set that has the specified values.    UPSERT: If a resource set exists Route 53 updates it with the values in the request.     Syntaxes for Creating, Updating, and Deleting Resource Record Sets  The syntax for a request depends on the type of resource record set that you want to create, delete, or update, such as weighted, alias, or failover. The XML elements in your request must appear in the order listed in the syntax.  For an example for each type of resource record set, see "Examples." Don't refer to the syntax in the "Parameter Syntax" section, which includes all of the elements for every kind of resource record set that you can create, delete, or update by using ChangeResourceRecordSets.   Change Propagation to Route 53 DNS Servers  When you submit a ChangeResourceRecordSets request, Route 53 propagates your changes to all of the Route 53 authoritative DNS servers. While your changes are propagating, GetChange returns a status of PENDING. When propagation is complete, GetChange returns a status of INSYNC. Changes generally propagate to all Route 53 name servers within 60 seconds. For more information, see GetChange.  Limits on ChangeResourceRecordSets Requests  For information about the limits on a ChangeResourceRecordSets request, see Limits in the Amazon Route 53 Developer Guide.
    */
  def changeResourceRecordSets(params: ChangeResourceRecordSetsRequest): Request[ChangeResourceRecordSetsResponse, AWSError] = js.native
  def changeResourceRecordSets(
    params: ChangeResourceRecordSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ChangeResourceRecordSetsResponse, Unit]
  ): Request[ChangeResourceRecordSetsResponse, AWSError] = js.native
  
  /**
    * Adds, edits, or deletes tags for a health check or a hosted zone. For information about using tags for cost allocation, see Using Cost Allocation Tags in the Billing and Cost Management User Guide.
    */
  def changeTagsForResource(): Request[ChangeTagsForResourceResponse, AWSError] = js.native
  def changeTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ChangeTagsForResourceResponse, Unit]): Request[ChangeTagsForResourceResponse, AWSError] = js.native
  /**
    * Adds, edits, or deletes tags for a health check or a hosted zone. For information about using tags for cost allocation, see Using Cost Allocation Tags in the Billing and Cost Management User Guide.
    */
  def changeTagsForResource(params: ChangeTagsForResourceRequest): Request[ChangeTagsForResourceResponse, AWSError] = js.native
  def changeTagsForResource(
    params: ChangeTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ChangeTagsForResourceResponse, Unit]
  ): Request[ChangeTagsForResourceResponse, AWSError] = js.native
  
  @JSName("config")
  var config_Route53: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a CIDR collection in the current Amazon Web Services account.
    */
  def createCidrCollection(): Request[CreateCidrCollectionResponse, AWSError] = js.native
  def createCidrCollection(callback: js.Function2[/* err */ AWSError, /* data */ CreateCidrCollectionResponse, Unit]): Request[CreateCidrCollectionResponse, AWSError] = js.native
  /**
    * Creates a CIDR collection in the current Amazon Web Services account.
    */
  def createCidrCollection(params: CreateCidrCollectionRequest): Request[CreateCidrCollectionResponse, AWSError] = js.native
  def createCidrCollection(
    params: CreateCidrCollectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCidrCollectionResponse, Unit]
  ): Request[CreateCidrCollectionResponse, AWSError] = js.native
  
  /**
    * Creates a new health check. For information about adding health checks to resource record sets, see HealthCheckId in ChangeResourceRecordSets.   ELB Load Balancers  If you're registering EC2 instances with an Elastic Load Balancing (ELB) load balancer, do not create Amazon Route 53 health checks for the EC2 instances. When you register an EC2 instance with a load balancer, you configure settings for an ELB health check, which performs a similar function to a Route 53 health check.  Private Hosted Zones  You can associate health checks with failover resource record sets in a private hosted zone. Note the following:   Route 53 health checkers are outside the VPC. To check the health of an endpoint within a VPC by IP address, you must assign a public IP address to the instance in the VPC.   You can configure a health checker to check the health of an external resource that the instance relies on, such as a database server.   You can create a CloudWatch metric, associate an alarm with the metric, and then create a health check that is based on the state of the alarm. For example, you might create a CloudWatch metric that checks the status of the Amazon EC2 StatusCheckFailed metric, add an alarm to the metric, and then create a health check that is based on the state of the alarm. For information about creating CloudWatch metrics and alarms by using the CloudWatch console, see the Amazon CloudWatch User Guide.  
    */
  def createHealthCheck(): Request[CreateHealthCheckResponse, AWSError] = js.native
  def createHealthCheck(callback: js.Function2[/* err */ AWSError, /* data */ CreateHealthCheckResponse, Unit]): Request[CreateHealthCheckResponse, AWSError] = js.native
  /**
    * Creates a new health check. For information about adding health checks to resource record sets, see HealthCheckId in ChangeResourceRecordSets.   ELB Load Balancers  If you're registering EC2 instances with an Elastic Load Balancing (ELB) load balancer, do not create Amazon Route 53 health checks for the EC2 instances. When you register an EC2 instance with a load balancer, you configure settings for an ELB health check, which performs a similar function to a Route 53 health check.  Private Hosted Zones  You can associate health checks with failover resource record sets in a private hosted zone. Note the following:   Route 53 health checkers are outside the VPC. To check the health of an endpoint within a VPC by IP address, you must assign a public IP address to the instance in the VPC.   You can configure a health checker to check the health of an external resource that the instance relies on, such as a database server.   You can create a CloudWatch metric, associate an alarm with the metric, and then create a health check that is based on the state of the alarm. For example, you might create a CloudWatch metric that checks the status of the Amazon EC2 StatusCheckFailed metric, add an alarm to the metric, and then create a health check that is based on the state of the alarm. For information about creating CloudWatch metrics and alarms by using the CloudWatch console, see the Amazon CloudWatch User Guide.  
    */
  def createHealthCheck(params: CreateHealthCheckRequest): Request[CreateHealthCheckResponse, AWSError] = js.native
  def createHealthCheck(
    params: CreateHealthCheckRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateHealthCheckResponse, Unit]
  ): Request[CreateHealthCheckResponse, AWSError] = js.native
  
  /**
    * Creates a new public or private hosted zone. You create records in a public hosted zone to define how you want to route traffic on the internet for a domain, such as example.com, and its subdomains (apex.example.com, acme.example.com). You create records in a private hosted zone to define how you want to route traffic for a domain and its subdomains within one or more Amazon Virtual Private Clouds (Amazon VPCs).   You can't convert a public hosted zone to a private hosted zone or vice versa. Instead, you must create a new hosted zone with the same name and create new resource record sets.  For more information about charges for hosted zones, see Amazon Route 53 Pricing. Note the following:   You can't create a hosted zone for a top-level domain (TLD) such as .com.   For public hosted zones, Route 53 automatically creates a default SOA record and four NS records for the zone. For more information about SOA and NS records, see NS and SOA Records that Route 53 Creates for a Hosted Zone in the Amazon Route 53 Developer Guide. If you want to use the same name servers for multiple public hosted zones, you can optionally associate a reusable delegation set with the hosted zone. See the DelegationSetId element.   If your domain is registered with a registrar other than Route 53, you must update the name servers with your registrar to make Route 53 the DNS service for the domain. For more information, see Migrating DNS Service for an Existing Domain to Amazon Route 53 in the Amazon Route 53 Developer Guide.    When you submit a CreateHostedZone request, the initial status of the hosted zone is PENDING. For public hosted zones, this means that the NS and SOA records are not yet available on all Route 53 DNS servers. When the NS and SOA records are available, the status of the zone changes to INSYNC. The CreateHostedZone request requires the caller to have an ec2:DescribeVpcs permission.  When creating private hosted zones, the Amazon VPC must belong to the same partition where the hosted zone is created. A partition is a group of Amazon Web Services Regions. Each Amazon Web Services account is scoped to one partition. The following are the supported partitions:    aws - Amazon Web Services Regions    aws-cn - China Regions    aws-us-gov - Amazon Web Services GovCloud (US) Region   For more information, see Access Management in the Amazon Web Services General Reference. 
    */
  def createHostedZone(): Request[CreateHostedZoneResponse, AWSError] = js.native
  def createHostedZone(callback: js.Function2[/* err */ AWSError, /* data */ CreateHostedZoneResponse, Unit]): Request[CreateHostedZoneResponse, AWSError] = js.native
  /**
    * Creates a new public or private hosted zone. You create records in a public hosted zone to define how you want to route traffic on the internet for a domain, such as example.com, and its subdomains (apex.example.com, acme.example.com). You create records in a private hosted zone to define how you want to route traffic for a domain and its subdomains within one or more Amazon Virtual Private Clouds (Amazon VPCs).   You can't convert a public hosted zone to a private hosted zone or vice versa. Instead, you must create a new hosted zone with the same name and create new resource record sets.  For more information about charges for hosted zones, see Amazon Route 53 Pricing. Note the following:   You can't create a hosted zone for a top-level domain (TLD) such as .com.   For public hosted zones, Route 53 automatically creates a default SOA record and four NS records for the zone. For more information about SOA and NS records, see NS and SOA Records that Route 53 Creates for a Hosted Zone in the Amazon Route 53 Developer Guide. If you want to use the same name servers for multiple public hosted zones, you can optionally associate a reusable delegation set with the hosted zone. See the DelegationSetId element.   If your domain is registered with a registrar other than Route 53, you must update the name servers with your registrar to make Route 53 the DNS service for the domain. For more information, see Migrating DNS Service for an Existing Domain to Amazon Route 53 in the Amazon Route 53 Developer Guide.    When you submit a CreateHostedZone request, the initial status of the hosted zone is PENDING. For public hosted zones, this means that the NS and SOA records are not yet available on all Route 53 DNS servers. When the NS and SOA records are available, the status of the zone changes to INSYNC. The CreateHostedZone request requires the caller to have an ec2:DescribeVpcs permission.  When creating private hosted zones, the Amazon VPC must belong to the same partition where the hosted zone is created. A partition is a group of Amazon Web Services Regions. Each Amazon Web Services account is scoped to one partition. The following are the supported partitions:    aws - Amazon Web Services Regions    aws-cn - China Regions    aws-us-gov - Amazon Web Services GovCloud (US) Region   For more information, see Access Management in the Amazon Web Services General Reference. 
    */
  def createHostedZone(params: CreateHostedZoneRequest): Request[CreateHostedZoneResponse, AWSError] = js.native
  def createHostedZone(
    params: CreateHostedZoneRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateHostedZoneResponse, Unit]
  ): Request[CreateHostedZoneResponse, AWSError] = js.native
  
  /**
    * Creates a new key-signing key (KSK) associated with a hosted zone. You can only have two KSKs per hosted zone.
    */
  def createKeySigningKey(): Request[CreateKeySigningKeyResponse, AWSError] = js.native
  def createKeySigningKey(callback: js.Function2[/* err */ AWSError, /* data */ CreateKeySigningKeyResponse, Unit]): Request[CreateKeySigningKeyResponse, AWSError] = js.native
  /**
    * Creates a new key-signing key (KSK) associated with a hosted zone. You can only have two KSKs per hosted zone.
    */
  def createKeySigningKey(params: CreateKeySigningKeyRequest): Request[CreateKeySigningKeyResponse, AWSError] = js.native
  def createKeySigningKey(
    params: CreateKeySigningKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateKeySigningKeyResponse, Unit]
  ): Request[CreateKeySigningKeyResponse, AWSError] = js.native
  
  /**
    * Creates a configuration for DNS query logging. After you create a query logging configuration, Amazon Route 53 begins to publish log data to an Amazon CloudWatch Logs log group. DNS query logs contain information about the queries that Route 53 receives for a specified public hosted zone, such as the following:   Route 53 edge location that responded to the DNS query   Domain or subdomain that was requested   DNS record type, such as A or AAAA   DNS response code, such as NoError or ServFail     Log Group and Resource Policy  Before you create a query logging configuration, perform the following operations.  If you create a query logging configuration using the Route 53 console, Route 53 performs these operations automatically.    Create a CloudWatch Logs log group, and make note of the ARN, which you specify when you create a query logging configuration. Note the following:   You must create the log group in the us-east-1 region.   You must use the same Amazon Web Services account to create the log group and the hosted zone that you want to configure query logging for.   When you create log groups for query logging, we recommend that you use a consistent prefix, for example:  /aws/route53/hosted zone name   In the next step, you'll create a resource policy, which controls access to one or more log groups and the associated Amazon Web Services resources, such as Route 53 hosted zones. There's a limit on the number of resource policies that you can create, so we recommend that you use a consistent prefix so you can use the same resource policy for all the log groups that you create for query logging.     Create a CloudWatch Logs resource policy, and give it the permissions that Route 53 needs to create log streams and to send query logs to log streams. For the value of Resource, specify the ARN for the log group that you created in the previous step. To use the same resource policy for all the CloudWatch Logs log groups that you created for query logging configurations, replace the hosted zone name with *, for example:  arn:aws:logs:us-east-1:123412341234:log-group:/aws/route53/ *  To avoid the confused deputy problem, a security issue where an entity without a permission for an action can coerce a more-privileged entity to perform it, you can optionally limit the permissions that a service has to a resource in a resource-based policy by supplying the following values:   For aws:SourceArn, supply the hosted zone ARN used in creating the query logging configuration. For example, aws:SourceArn: arn:aws:route53:::hostedzone/hosted zone ID.   For aws:SourceAccount, supply the account ID for the account that creates the query logging configuration. For example, aws:SourceAccount:111111111111.   For more information, see The confused deputy problem in the Amazon Web Services IAM User Guide.  You can't use the CloudWatch console to create or edit a resource policy. You must use the CloudWatch API, one of the Amazon Web Services SDKs, or the CLI.     Log Streams and Edge Locations  When Route 53 finishes creating the configuration for DNS query logging, it does the following:   Creates a log stream for an edge location the first time that the edge location responds to DNS queries for the specified hosted zone. That log stream is used to log all queries that Route 53 responds to for that edge location.   Begins to send query logs to the applicable log stream.   The name of each log stream is in the following format:   hosted zone ID/edge location code   The edge location code is a three-letter code and an arbitrarily assigned number, for example, DFW3. The three-letter code typically corresponds with the International Air Transport Association airport code for an airport near the edge location. (These abbreviations might change in the future.) For a list of edge locations, see "The Route 53 Global Network" on the Route 53 Product Details page.  Queries That Are Logged  Query logs contain only the queries that DNS resolvers forward to Route 53. If a DNS resolver has already cached the response to a query (such as the IP address for a load balancer for example.com), the resolver will continue to return the cached response. It doesn't forward another query to Route 53 until the TTL for the corresponding resource record set expires. Depending on how many DNS queries are submitted for a resource record set, and depending on the TTL for that resource record set, query logs might contain information about only one query out of every several thousand queries that are submitted to DNS. For more information about how DNS works, see Routing Internet Traffic to Your Website or Web Application in the Amazon Route 53 Developer Guide.  Log File Format  For a list of the values in each query log and the format of each value, see Logging DNS Queries in the Amazon Route 53 Developer Guide.  Pricing  For information about charges for query logs, see Amazon CloudWatch Pricing.  How to Stop Logging  If you want Route 53 to stop sending query logs to CloudWatch Logs, delete the query logging configuration. For more information, see DeleteQueryLoggingConfig.  
    */
  def createQueryLoggingConfig(): Request[CreateQueryLoggingConfigResponse, AWSError] = js.native
  def createQueryLoggingConfig(callback: js.Function2[/* err */ AWSError, /* data */ CreateQueryLoggingConfigResponse, Unit]): Request[CreateQueryLoggingConfigResponse, AWSError] = js.native
  /**
    * Creates a configuration for DNS query logging. After you create a query logging configuration, Amazon Route 53 begins to publish log data to an Amazon CloudWatch Logs log group. DNS query logs contain information about the queries that Route 53 receives for a specified public hosted zone, such as the following:   Route 53 edge location that responded to the DNS query   Domain or subdomain that was requested   DNS record type, such as A or AAAA   DNS response code, such as NoError or ServFail     Log Group and Resource Policy  Before you create a query logging configuration, perform the following operations.  If you create a query logging configuration using the Route 53 console, Route 53 performs these operations automatically.    Create a CloudWatch Logs log group, and make note of the ARN, which you specify when you create a query logging configuration. Note the following:   You must create the log group in the us-east-1 region.   You must use the same Amazon Web Services account to create the log group and the hosted zone that you want to configure query logging for.   When you create log groups for query logging, we recommend that you use a consistent prefix, for example:  /aws/route53/hosted zone name   In the next step, you'll create a resource policy, which controls access to one or more log groups and the associated Amazon Web Services resources, such as Route 53 hosted zones. There's a limit on the number of resource policies that you can create, so we recommend that you use a consistent prefix so you can use the same resource policy for all the log groups that you create for query logging.     Create a CloudWatch Logs resource policy, and give it the permissions that Route 53 needs to create log streams and to send query logs to log streams. For the value of Resource, specify the ARN for the log group that you created in the previous step. To use the same resource policy for all the CloudWatch Logs log groups that you created for query logging configurations, replace the hosted zone name with *, for example:  arn:aws:logs:us-east-1:123412341234:log-group:/aws/route53/ *  To avoid the confused deputy problem, a security issue where an entity without a permission for an action can coerce a more-privileged entity to perform it, you can optionally limit the permissions that a service has to a resource in a resource-based policy by supplying the following values:   For aws:SourceArn, supply the hosted zone ARN used in creating the query logging configuration. For example, aws:SourceArn: arn:aws:route53:::hostedzone/hosted zone ID.   For aws:SourceAccount, supply the account ID for the account that creates the query logging configuration. For example, aws:SourceAccount:111111111111.   For more information, see The confused deputy problem in the Amazon Web Services IAM User Guide.  You can't use the CloudWatch console to create or edit a resource policy. You must use the CloudWatch API, one of the Amazon Web Services SDKs, or the CLI.     Log Streams and Edge Locations  When Route 53 finishes creating the configuration for DNS query logging, it does the following:   Creates a log stream for an edge location the first time that the edge location responds to DNS queries for the specified hosted zone. That log stream is used to log all queries that Route 53 responds to for that edge location.   Begins to send query logs to the applicable log stream.   The name of each log stream is in the following format:   hosted zone ID/edge location code   The edge location code is a three-letter code and an arbitrarily assigned number, for example, DFW3. The three-letter code typically corresponds with the International Air Transport Association airport code for an airport near the edge location. (These abbreviations might change in the future.) For a list of edge locations, see "The Route 53 Global Network" on the Route 53 Product Details page.  Queries That Are Logged  Query logs contain only the queries that DNS resolvers forward to Route 53. If a DNS resolver has already cached the response to a query (such as the IP address for a load balancer for example.com), the resolver will continue to return the cached response. It doesn't forward another query to Route 53 until the TTL for the corresponding resource record set expires. Depending on how many DNS queries are submitted for a resource record set, and depending on the TTL for that resource record set, query logs might contain information about only one query out of every several thousand queries that are submitted to DNS. For more information about how DNS works, see Routing Internet Traffic to Your Website or Web Application in the Amazon Route 53 Developer Guide.  Log File Format  For a list of the values in each query log and the format of each value, see Logging DNS Queries in the Amazon Route 53 Developer Guide.  Pricing  For information about charges for query logs, see Amazon CloudWatch Pricing.  How to Stop Logging  If you want Route 53 to stop sending query logs to CloudWatch Logs, delete the query logging configuration. For more information, see DeleteQueryLoggingConfig.  
    */
  def createQueryLoggingConfig(params: CreateQueryLoggingConfigRequest): Request[CreateQueryLoggingConfigResponse, AWSError] = js.native
  def createQueryLoggingConfig(
    params: CreateQueryLoggingConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateQueryLoggingConfigResponse, Unit]
  ): Request[CreateQueryLoggingConfigResponse, AWSError] = js.native
  
  /**
    * Creates a delegation set (a group of four name servers) that can be reused by multiple hosted zones that were created by the same Amazon Web Services account.  You can also create a reusable delegation set that uses the four name servers that are associated with an existing hosted zone. Specify the hosted zone ID in the CreateReusableDelegationSet request.  You can't associate a reusable delegation set with a private hosted zone.  For information about using a reusable delegation set to configure white label name servers, see Configuring White Label Name Servers. The process for migrating existing hosted zones to use a reusable delegation set is comparable to the process for configuring white label name servers. You need to perform the following steps:   Create a reusable delegation set.   Recreate hosted zones, and reduce the TTL to 60 seconds or less.   Recreate resource record sets in the new hosted zones.   Change the registrar's name servers to use the name servers for the new hosted zones.   Monitor traffic for the website or application.   Change TTLs back to their original values.   If you want to migrate existing hosted zones to use a reusable delegation set, the existing hosted zones can't use any of the name servers that are assigned to the reusable delegation set. If one or more hosted zones do use one or more name servers that are assigned to the reusable delegation set, you can do one of the following:   For small numbers of hosted zones—up to a few hundred—it's relatively easy to create reusable delegation sets until you get one that has four name servers that don't overlap with any of the name servers in your hosted zones.   For larger numbers of hosted zones, the easiest solution is to use more than one reusable delegation set.   For larger numbers of hosted zones, you can also migrate hosted zones that have overlapping name servers to hosted zones that don't have overlapping name servers, then migrate the hosted zones again to use the reusable delegation set.  
    */
  def createReusableDelegationSet(): Request[CreateReusableDelegationSetResponse, AWSError] = js.native
  def createReusableDelegationSet(callback: js.Function2[/* err */ AWSError, /* data */ CreateReusableDelegationSetResponse, Unit]): Request[CreateReusableDelegationSetResponse, AWSError] = js.native
  /**
    * Creates a delegation set (a group of four name servers) that can be reused by multiple hosted zones that were created by the same Amazon Web Services account.  You can also create a reusable delegation set that uses the four name servers that are associated with an existing hosted zone. Specify the hosted zone ID in the CreateReusableDelegationSet request.  You can't associate a reusable delegation set with a private hosted zone.  For information about using a reusable delegation set to configure white label name servers, see Configuring White Label Name Servers. The process for migrating existing hosted zones to use a reusable delegation set is comparable to the process for configuring white label name servers. You need to perform the following steps:   Create a reusable delegation set.   Recreate hosted zones, and reduce the TTL to 60 seconds or less.   Recreate resource record sets in the new hosted zones.   Change the registrar's name servers to use the name servers for the new hosted zones.   Monitor traffic for the website or application.   Change TTLs back to their original values.   If you want to migrate existing hosted zones to use a reusable delegation set, the existing hosted zones can't use any of the name servers that are assigned to the reusable delegation set. If one or more hosted zones do use one or more name servers that are assigned to the reusable delegation set, you can do one of the following:   For small numbers of hosted zones—up to a few hundred—it's relatively easy to create reusable delegation sets until you get one that has four name servers that don't overlap with any of the name servers in your hosted zones.   For larger numbers of hosted zones, the easiest solution is to use more than one reusable delegation set.   For larger numbers of hosted zones, you can also migrate hosted zones that have overlapping name servers to hosted zones that don't have overlapping name servers, then migrate the hosted zones again to use the reusable delegation set.  
    */
  def createReusableDelegationSet(params: CreateReusableDelegationSetRequest): Request[CreateReusableDelegationSetResponse, AWSError] = js.native
  def createReusableDelegationSet(
    params: CreateReusableDelegationSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateReusableDelegationSetResponse, Unit]
  ): Request[CreateReusableDelegationSetResponse, AWSError] = js.native
  
  /**
    * Creates a traffic policy, which you use to create multiple DNS resource record sets for one domain name (such as example.com) or one subdomain name (such as www.example.com).
    */
  def createTrafficPolicy(): Request[CreateTrafficPolicyResponse, AWSError] = js.native
  def createTrafficPolicy(callback: js.Function2[/* err */ AWSError, /* data */ CreateTrafficPolicyResponse, Unit]): Request[CreateTrafficPolicyResponse, AWSError] = js.native
  /**
    * Creates a traffic policy, which you use to create multiple DNS resource record sets for one domain name (such as example.com) or one subdomain name (such as www.example.com).
    */
  def createTrafficPolicy(params: CreateTrafficPolicyRequest): Request[CreateTrafficPolicyResponse, AWSError] = js.native
  def createTrafficPolicy(
    params: CreateTrafficPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTrafficPolicyResponse, Unit]
  ): Request[CreateTrafficPolicyResponse, AWSError] = js.native
  
  /**
    * Creates resource record sets in a specified hosted zone based on the settings in a specified traffic policy version. In addition, CreateTrafficPolicyInstance associates the resource record sets with a specified domain name (such as example.com) or subdomain name (such as www.example.com). Amazon Route 53 responds to DNS queries for the domain or subdomain name by using the resource record sets that CreateTrafficPolicyInstance created.
    */
  def createTrafficPolicyInstance(): Request[CreateTrafficPolicyInstanceResponse, AWSError] = js.native
  def createTrafficPolicyInstance(callback: js.Function2[/* err */ AWSError, /* data */ CreateTrafficPolicyInstanceResponse, Unit]): Request[CreateTrafficPolicyInstanceResponse, AWSError] = js.native
  /**
    * Creates resource record sets in a specified hosted zone based on the settings in a specified traffic policy version. In addition, CreateTrafficPolicyInstance associates the resource record sets with a specified domain name (such as example.com) or subdomain name (such as www.example.com). Amazon Route 53 responds to DNS queries for the domain or subdomain name by using the resource record sets that CreateTrafficPolicyInstance created.
    */
  def createTrafficPolicyInstance(params: CreateTrafficPolicyInstanceRequest): Request[CreateTrafficPolicyInstanceResponse, AWSError] = js.native
  def createTrafficPolicyInstance(
    params: CreateTrafficPolicyInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTrafficPolicyInstanceResponse, Unit]
  ): Request[CreateTrafficPolicyInstanceResponse, AWSError] = js.native
  
  /**
    * Creates a new version of an existing traffic policy. When you create a new version of a traffic policy, you specify the ID of the traffic policy that you want to update and a JSON-formatted document that describes the new version. You use traffic policies to create multiple DNS resource record sets for one domain name (such as example.com) or one subdomain name (such as www.example.com). You can create a maximum of 1000 versions of a traffic policy. If you reach the limit and need to create another version, you'll need to start a new traffic policy.
    */
  def createTrafficPolicyVersion(): Request[CreateTrafficPolicyVersionResponse, AWSError] = js.native
  def createTrafficPolicyVersion(callback: js.Function2[/* err */ AWSError, /* data */ CreateTrafficPolicyVersionResponse, Unit]): Request[CreateTrafficPolicyVersionResponse, AWSError] = js.native
  /**
    * Creates a new version of an existing traffic policy. When you create a new version of a traffic policy, you specify the ID of the traffic policy that you want to update and a JSON-formatted document that describes the new version. You use traffic policies to create multiple DNS resource record sets for one domain name (such as example.com) or one subdomain name (such as www.example.com). You can create a maximum of 1000 versions of a traffic policy. If you reach the limit and need to create another version, you'll need to start a new traffic policy.
    */
  def createTrafficPolicyVersion(params: CreateTrafficPolicyVersionRequest): Request[CreateTrafficPolicyVersionResponse, AWSError] = js.native
  def createTrafficPolicyVersion(
    params: CreateTrafficPolicyVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTrafficPolicyVersionResponse, Unit]
  ): Request[CreateTrafficPolicyVersionResponse, AWSError] = js.native
  
  /**
    * Authorizes the Amazon Web Services account that created a specified VPC to submit an AssociateVPCWithHostedZone request to associate the VPC with a specified hosted zone that was created by a different account. To submit a CreateVPCAssociationAuthorization request, you must use the account that created the hosted zone. After you authorize the association, use the account that created the VPC to submit an AssociateVPCWithHostedZone request.  If you want to associate multiple VPCs that you created by using one account with a hosted zone that you created by using a different account, you must submit one authorization request for each VPC. 
    */
  def createVPCAssociationAuthorization(): Request[CreateVPCAssociationAuthorizationResponse, AWSError] = js.native
  def createVPCAssociationAuthorization(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVPCAssociationAuthorizationResponse, Unit]
  ): Request[CreateVPCAssociationAuthorizationResponse, AWSError] = js.native
  /**
    * Authorizes the Amazon Web Services account that created a specified VPC to submit an AssociateVPCWithHostedZone request to associate the VPC with a specified hosted zone that was created by a different account. To submit a CreateVPCAssociationAuthorization request, you must use the account that created the hosted zone. After you authorize the association, use the account that created the VPC to submit an AssociateVPCWithHostedZone request.  If you want to associate multiple VPCs that you created by using one account with a hosted zone that you created by using a different account, you must submit one authorization request for each VPC. 
    */
  def createVPCAssociationAuthorization(params: CreateVPCAssociationAuthorizationRequest): Request[CreateVPCAssociationAuthorizationResponse, AWSError] = js.native
  def createVPCAssociationAuthorization(
    params: CreateVPCAssociationAuthorizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVPCAssociationAuthorizationResponse, Unit]
  ): Request[CreateVPCAssociationAuthorizationResponse, AWSError] = js.native
  
  /**
    * Deactivates a key-signing key (KSK) so that it will not be used for signing by DNSSEC. This operation changes the KSK status to INACTIVE.
    */
  def deactivateKeySigningKey(): Request[DeactivateKeySigningKeyResponse, AWSError] = js.native
  def deactivateKeySigningKey(callback: js.Function2[/* err */ AWSError, /* data */ DeactivateKeySigningKeyResponse, Unit]): Request[DeactivateKeySigningKeyResponse, AWSError] = js.native
  /**
    * Deactivates a key-signing key (KSK) so that it will not be used for signing by DNSSEC. This operation changes the KSK status to INACTIVE.
    */
  def deactivateKeySigningKey(params: DeactivateKeySigningKeyRequest): Request[DeactivateKeySigningKeyResponse, AWSError] = js.native
  def deactivateKeySigningKey(
    params: DeactivateKeySigningKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeactivateKeySigningKeyResponse, Unit]
  ): Request[DeactivateKeySigningKeyResponse, AWSError] = js.native
  
  /**
    * Deletes a CIDR collection in the current Amazon Web Services account. The collection must be empty before it can be deleted.
    */
  def deleteCidrCollection(): Request[DeleteCidrCollectionResponse, AWSError] = js.native
  def deleteCidrCollection(callback: js.Function2[/* err */ AWSError, /* data */ DeleteCidrCollectionResponse, Unit]): Request[DeleteCidrCollectionResponse, AWSError] = js.native
  /**
    * Deletes a CIDR collection in the current Amazon Web Services account. The collection must be empty before it can be deleted.
    */
  def deleteCidrCollection(params: DeleteCidrCollectionRequest): Request[DeleteCidrCollectionResponse, AWSError] = js.native
  def deleteCidrCollection(
    params: DeleteCidrCollectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCidrCollectionResponse, Unit]
  ): Request[DeleteCidrCollectionResponse, AWSError] = js.native
  
  /**
    * Deletes a health check.  Amazon Route 53 does not prevent you from deleting a health check even if the health check is associated with one or more resource record sets. If you delete a health check and you don't update the associated resource record sets, the future status of the health check can't be predicted and may change. This will affect the routing of DNS queries for your DNS failover configuration. For more information, see Replacing and Deleting Health Checks in the Amazon Route 53 Developer Guide.  If you're using Cloud Map and you configured Cloud Map to create a Route 53 health check when you register an instance, you can't use the Route 53 DeleteHealthCheck command to delete the health check. The health check is deleted automatically when you deregister the instance; there can be a delay of several hours before the health check is deleted from Route 53. 
    */
  def deleteHealthCheck(): Request[DeleteHealthCheckResponse, AWSError] = js.native
  def deleteHealthCheck(callback: js.Function2[/* err */ AWSError, /* data */ DeleteHealthCheckResponse, Unit]): Request[DeleteHealthCheckResponse, AWSError] = js.native
  /**
    * Deletes a health check.  Amazon Route 53 does not prevent you from deleting a health check even if the health check is associated with one or more resource record sets. If you delete a health check and you don't update the associated resource record sets, the future status of the health check can't be predicted and may change. This will affect the routing of DNS queries for your DNS failover configuration. For more information, see Replacing and Deleting Health Checks in the Amazon Route 53 Developer Guide.  If you're using Cloud Map and you configured Cloud Map to create a Route 53 health check when you register an instance, you can't use the Route 53 DeleteHealthCheck command to delete the health check. The health check is deleted automatically when you deregister the instance; there can be a delay of several hours before the health check is deleted from Route 53. 
    */
  def deleteHealthCheck(params: DeleteHealthCheckRequest): Request[DeleteHealthCheckResponse, AWSError] = js.native
  def deleteHealthCheck(
    params: DeleteHealthCheckRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteHealthCheckResponse, Unit]
  ): Request[DeleteHealthCheckResponse, AWSError] = js.native
  
  /**
    * Deletes a hosted zone. If the hosted zone was created by another service, such as Cloud Map, see Deleting Public Hosted Zones That Were Created by Another Service in the Amazon Route 53 Developer Guide for information about how to delete it. (The process is the same for public and private hosted zones that were created by another service.) If you want to keep your domain registration but you want to stop routing internet traffic to your website or web application, we recommend that you delete resource record sets in the hosted zone instead of deleting the hosted zone.  If you delete a hosted zone, you can't undelete it. You must create a new hosted zone and update the name servers for your domain registration, which can require up to 48 hours to take effect. (If you delegated responsibility for a subdomain to a hosted zone and you delete the child hosted zone, you must update the name servers in the parent hosted zone.) In addition, if you delete a hosted zone, someone could hijack the domain and route traffic to their own resources using your domain name.  If you want to avoid the monthly charge for the hosted zone, you can transfer DNS service for the domain to a free DNS service. When you transfer DNS service, you have to update the name servers for the domain registration. If the domain is registered with Route 53, see UpdateDomainNameservers for information about how to replace Route 53 name servers with name servers for the new DNS service. If the domain is registered with another registrar, use the method provided by the registrar to update name servers for the domain registration. For more information, perform an internet search on "free DNS service." You can delete a hosted zone only if it contains only the default SOA record and NS resource record sets. If the hosted zone contains other resource record sets, you must delete them before you can delete the hosted zone. If you try to delete a hosted zone that contains other resource record sets, the request fails, and Route 53 returns a HostedZoneNotEmpty error. For information about deleting records from your hosted zone, see ChangeResourceRecordSets. To verify that the hosted zone has been deleted, do one of the following:   Use the GetHostedZone action to request information about the hosted zone.   Use the ListHostedZones action to get a list of the hosted zones associated with the current Amazon Web Services account.  
    */
  def deleteHostedZone(): Request[DeleteHostedZoneResponse, AWSError] = js.native
  def deleteHostedZone(callback: js.Function2[/* err */ AWSError, /* data */ DeleteHostedZoneResponse, Unit]): Request[DeleteHostedZoneResponse, AWSError] = js.native
  /**
    * Deletes a hosted zone. If the hosted zone was created by another service, such as Cloud Map, see Deleting Public Hosted Zones That Were Created by Another Service in the Amazon Route 53 Developer Guide for information about how to delete it. (The process is the same for public and private hosted zones that were created by another service.) If you want to keep your domain registration but you want to stop routing internet traffic to your website or web application, we recommend that you delete resource record sets in the hosted zone instead of deleting the hosted zone.  If you delete a hosted zone, you can't undelete it. You must create a new hosted zone and update the name servers for your domain registration, which can require up to 48 hours to take effect. (If you delegated responsibility for a subdomain to a hosted zone and you delete the child hosted zone, you must update the name servers in the parent hosted zone.) In addition, if you delete a hosted zone, someone could hijack the domain and route traffic to their own resources using your domain name.  If you want to avoid the monthly charge for the hosted zone, you can transfer DNS service for the domain to a free DNS service. When you transfer DNS service, you have to update the name servers for the domain registration. If the domain is registered with Route 53, see UpdateDomainNameservers for information about how to replace Route 53 name servers with name servers for the new DNS service. If the domain is registered with another registrar, use the method provided by the registrar to update name servers for the domain registration. For more information, perform an internet search on "free DNS service." You can delete a hosted zone only if it contains only the default SOA record and NS resource record sets. If the hosted zone contains other resource record sets, you must delete them before you can delete the hosted zone. If you try to delete a hosted zone that contains other resource record sets, the request fails, and Route 53 returns a HostedZoneNotEmpty error. For information about deleting records from your hosted zone, see ChangeResourceRecordSets. To verify that the hosted zone has been deleted, do one of the following:   Use the GetHostedZone action to request information about the hosted zone.   Use the ListHostedZones action to get a list of the hosted zones associated with the current Amazon Web Services account.  
    */
  def deleteHostedZone(params: DeleteHostedZoneRequest): Request[DeleteHostedZoneResponse, AWSError] = js.native
  def deleteHostedZone(
    params: DeleteHostedZoneRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteHostedZoneResponse, Unit]
  ): Request[DeleteHostedZoneResponse, AWSError] = js.native
  
  /**
    * Deletes a key-signing key (KSK). Before you can delete a KSK, you must deactivate it. The KSK must be deactivated before you can delete it regardless of whether the hosted zone is enabled for DNSSEC signing. You can use DeactivateKeySigningKey to deactivate the key before you delete it. Use GetDNSSEC to verify that the KSK is in an INACTIVE status.
    */
  def deleteKeySigningKey(): Request[DeleteKeySigningKeyResponse, AWSError] = js.native
  def deleteKeySigningKey(callback: js.Function2[/* err */ AWSError, /* data */ DeleteKeySigningKeyResponse, Unit]): Request[DeleteKeySigningKeyResponse, AWSError] = js.native
  /**
    * Deletes a key-signing key (KSK). Before you can delete a KSK, you must deactivate it. The KSK must be deactivated before you can delete it regardless of whether the hosted zone is enabled for DNSSEC signing. You can use DeactivateKeySigningKey to deactivate the key before you delete it. Use GetDNSSEC to verify that the KSK is in an INACTIVE status.
    */
  def deleteKeySigningKey(params: DeleteKeySigningKeyRequest): Request[DeleteKeySigningKeyResponse, AWSError] = js.native
  def deleteKeySigningKey(
    params: DeleteKeySigningKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteKeySigningKeyResponse, Unit]
  ): Request[DeleteKeySigningKeyResponse, AWSError] = js.native
  
  /**
    * Deletes a configuration for DNS query logging. If you delete a configuration, Amazon Route 53 stops sending query logs to CloudWatch Logs. Route 53 doesn't delete any logs that are already in CloudWatch Logs. For more information about DNS query logs, see CreateQueryLoggingConfig.
    */
  def deleteQueryLoggingConfig(): Request[DeleteQueryLoggingConfigResponse, AWSError] = js.native
  def deleteQueryLoggingConfig(callback: js.Function2[/* err */ AWSError, /* data */ DeleteQueryLoggingConfigResponse, Unit]): Request[DeleteQueryLoggingConfigResponse, AWSError] = js.native
  /**
    * Deletes a configuration for DNS query logging. If you delete a configuration, Amazon Route 53 stops sending query logs to CloudWatch Logs. Route 53 doesn't delete any logs that are already in CloudWatch Logs. For more information about DNS query logs, see CreateQueryLoggingConfig.
    */
  def deleteQueryLoggingConfig(params: DeleteQueryLoggingConfigRequest): Request[DeleteQueryLoggingConfigResponse, AWSError] = js.native
  def deleteQueryLoggingConfig(
    params: DeleteQueryLoggingConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteQueryLoggingConfigResponse, Unit]
  ): Request[DeleteQueryLoggingConfigResponse, AWSError] = js.native
  
  /**
    * Deletes a reusable delegation set.  You can delete a reusable delegation set only if it isn't associated with any hosted zones.  To verify that the reusable delegation set is not associated with any hosted zones, submit a GetReusableDelegationSet request and specify the ID of the reusable delegation set that you want to delete.
    */
  def deleteReusableDelegationSet(): Request[DeleteReusableDelegationSetResponse, AWSError] = js.native
  def deleteReusableDelegationSet(callback: js.Function2[/* err */ AWSError, /* data */ DeleteReusableDelegationSetResponse, Unit]): Request[DeleteReusableDelegationSetResponse, AWSError] = js.native
  /**
    * Deletes a reusable delegation set.  You can delete a reusable delegation set only if it isn't associated with any hosted zones.  To verify that the reusable delegation set is not associated with any hosted zones, submit a GetReusableDelegationSet request and specify the ID of the reusable delegation set that you want to delete.
    */
  def deleteReusableDelegationSet(params: DeleteReusableDelegationSetRequest): Request[DeleteReusableDelegationSetResponse, AWSError] = js.native
  def deleteReusableDelegationSet(
    params: DeleteReusableDelegationSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteReusableDelegationSetResponse, Unit]
  ): Request[DeleteReusableDelegationSetResponse, AWSError] = js.native
  
  /**
    * Deletes a traffic policy. When you delete a traffic policy, Route 53 sets a flag on the policy to indicate that it has been deleted. However, Route 53 never fully deletes the traffic policy. Note the following:   Deleted traffic policies aren't listed if you run ListTrafficPolicies.    There's no way to get a list of deleted policies.   If you retain the ID of the policy, you can get information about the policy, including the traffic policy document, by running GetTrafficPolicy.  
    */
  def deleteTrafficPolicy(): Request[DeleteTrafficPolicyResponse, AWSError] = js.native
  def deleteTrafficPolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTrafficPolicyResponse, Unit]): Request[DeleteTrafficPolicyResponse, AWSError] = js.native
  /**
    * Deletes a traffic policy. When you delete a traffic policy, Route 53 sets a flag on the policy to indicate that it has been deleted. However, Route 53 never fully deletes the traffic policy. Note the following:   Deleted traffic policies aren't listed if you run ListTrafficPolicies.    There's no way to get a list of deleted policies.   If you retain the ID of the policy, you can get information about the policy, including the traffic policy document, by running GetTrafficPolicy.  
    */
  def deleteTrafficPolicy(params: DeleteTrafficPolicyRequest): Request[DeleteTrafficPolicyResponse, AWSError] = js.native
  def deleteTrafficPolicy(
    params: DeleteTrafficPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTrafficPolicyResponse, Unit]
  ): Request[DeleteTrafficPolicyResponse, AWSError] = js.native
  
  /**
    * Deletes a traffic policy instance and all of the resource record sets that Amazon Route 53 created when you created the instance.  In the Route 53 console, traffic policy instances are known as policy records. 
    */
  def deleteTrafficPolicyInstance(): Request[DeleteTrafficPolicyInstanceResponse, AWSError] = js.native
  def deleteTrafficPolicyInstance(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTrafficPolicyInstanceResponse, Unit]): Request[DeleteTrafficPolicyInstanceResponse, AWSError] = js.native
  /**
    * Deletes a traffic policy instance and all of the resource record sets that Amazon Route 53 created when you created the instance.  In the Route 53 console, traffic policy instances are known as policy records. 
    */
  def deleteTrafficPolicyInstance(params: DeleteTrafficPolicyInstanceRequest): Request[DeleteTrafficPolicyInstanceResponse, AWSError] = js.native
  def deleteTrafficPolicyInstance(
    params: DeleteTrafficPolicyInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTrafficPolicyInstanceResponse, Unit]
  ): Request[DeleteTrafficPolicyInstanceResponse, AWSError] = js.native
  
  /**
    * Removes authorization to submit an AssociateVPCWithHostedZone request to associate a specified VPC with a hosted zone that was created by a different account. You must use the account that created the hosted zone to submit a DeleteVPCAssociationAuthorization request.  Sending this request only prevents the Amazon Web Services account that created the VPC from associating the VPC with the Amazon Route 53 hosted zone in the future. If the VPC is already associated with the hosted zone, DeleteVPCAssociationAuthorization won't disassociate the VPC from the hosted zone. If you want to delete an existing association, use DisassociateVPCFromHostedZone. 
    */
  def deleteVPCAssociationAuthorization(): Request[DeleteVPCAssociationAuthorizationResponse, AWSError] = js.native
  def deleteVPCAssociationAuthorization(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteVPCAssociationAuthorizationResponse, Unit]
  ): Request[DeleteVPCAssociationAuthorizationResponse, AWSError] = js.native
  /**
    * Removes authorization to submit an AssociateVPCWithHostedZone request to associate a specified VPC with a hosted zone that was created by a different account. You must use the account that created the hosted zone to submit a DeleteVPCAssociationAuthorization request.  Sending this request only prevents the Amazon Web Services account that created the VPC from associating the VPC with the Amazon Route 53 hosted zone in the future. If the VPC is already associated with the hosted zone, DeleteVPCAssociationAuthorization won't disassociate the VPC from the hosted zone. If you want to delete an existing association, use DisassociateVPCFromHostedZone. 
    */
  def deleteVPCAssociationAuthorization(params: DeleteVPCAssociationAuthorizationRequest): Request[DeleteVPCAssociationAuthorizationResponse, AWSError] = js.native
  def deleteVPCAssociationAuthorization(
    params: DeleteVPCAssociationAuthorizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteVPCAssociationAuthorizationResponse, Unit]
  ): Request[DeleteVPCAssociationAuthorizationResponse, AWSError] = js.native
  
  /**
    * Disables DNSSEC signing in a specific hosted zone. This action does not deactivate any key-signing keys (KSKs) that are active in the hosted zone.
    */
  def disableHostedZoneDNSSEC(): Request[DisableHostedZoneDNSSECResponse, AWSError] = js.native
  def disableHostedZoneDNSSEC(callback: js.Function2[/* err */ AWSError, /* data */ DisableHostedZoneDNSSECResponse, Unit]): Request[DisableHostedZoneDNSSECResponse, AWSError] = js.native
  /**
    * Disables DNSSEC signing in a specific hosted zone. This action does not deactivate any key-signing keys (KSKs) that are active in the hosted zone.
    */
  def disableHostedZoneDNSSEC(params: DisableHostedZoneDNSSECRequest): Request[DisableHostedZoneDNSSECResponse, AWSError] = js.native
  def disableHostedZoneDNSSEC(
    params: DisableHostedZoneDNSSECRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisableHostedZoneDNSSECResponse, Unit]
  ): Request[DisableHostedZoneDNSSECResponse, AWSError] = js.native
  
  /**
    * Disassociates an Amazon Virtual Private Cloud (Amazon VPC) from an Amazon Route 53 private hosted zone. Note the following:   You can't disassociate the last Amazon VPC from a private hosted zone.   You can't convert a private hosted zone into a public hosted zone.   You can submit a DisassociateVPCFromHostedZone request using either the account that created the hosted zone or the account that created the Amazon VPC.   Some services, such as Cloud Map and Amazon Elastic File System (Amazon EFS) automatically create hosted zones and associate VPCs with the hosted zones. A service can create a hosted zone using your account or using its own account. You can disassociate a VPC from a hosted zone only if the service created the hosted zone using your account. When you run DisassociateVPCFromHostedZone, if the hosted zone has a value for OwningAccount, you can use DisassociateVPCFromHostedZone. If the hosted zone has a value for OwningService, you can't use DisassociateVPCFromHostedZone.    When revoking access, the hosted zone and the Amazon VPC must belong to the same partition. A partition is a group of Amazon Web Services Regions. Each Amazon Web Services account is scoped to one partition. The following are the supported partitions:    aws - Amazon Web Services Regions    aws-cn - China Regions    aws-us-gov - Amazon Web Services GovCloud (US) Region   For more information, see Access Management in the Amazon Web Services General Reference. 
    */
  def disassociateVPCFromHostedZone(): Request[DisassociateVPCFromHostedZoneResponse, AWSError] = js.native
  def disassociateVPCFromHostedZone(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateVPCFromHostedZoneResponse, Unit]): Request[DisassociateVPCFromHostedZoneResponse, AWSError] = js.native
  /**
    * Disassociates an Amazon Virtual Private Cloud (Amazon VPC) from an Amazon Route 53 private hosted zone. Note the following:   You can't disassociate the last Amazon VPC from a private hosted zone.   You can't convert a private hosted zone into a public hosted zone.   You can submit a DisassociateVPCFromHostedZone request using either the account that created the hosted zone or the account that created the Amazon VPC.   Some services, such as Cloud Map and Amazon Elastic File System (Amazon EFS) automatically create hosted zones and associate VPCs with the hosted zones. A service can create a hosted zone using your account or using its own account. You can disassociate a VPC from a hosted zone only if the service created the hosted zone using your account. When you run DisassociateVPCFromHostedZone, if the hosted zone has a value for OwningAccount, you can use DisassociateVPCFromHostedZone. If the hosted zone has a value for OwningService, you can't use DisassociateVPCFromHostedZone.    When revoking access, the hosted zone and the Amazon VPC must belong to the same partition. A partition is a group of Amazon Web Services Regions. Each Amazon Web Services account is scoped to one partition. The following are the supported partitions:    aws - Amazon Web Services Regions    aws-cn - China Regions    aws-us-gov - Amazon Web Services GovCloud (US) Region   For more information, see Access Management in the Amazon Web Services General Reference. 
    */
  def disassociateVPCFromHostedZone(params: DisassociateVPCFromHostedZoneRequest): Request[DisassociateVPCFromHostedZoneResponse, AWSError] = js.native
  def disassociateVPCFromHostedZone(
    params: DisassociateVPCFromHostedZoneRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateVPCFromHostedZoneResponse, Unit]
  ): Request[DisassociateVPCFromHostedZoneResponse, AWSError] = js.native
  
  /**
    * Enables DNSSEC signing in a specific hosted zone.
    */
  def enableHostedZoneDNSSEC(): Request[EnableHostedZoneDNSSECResponse, AWSError] = js.native
  def enableHostedZoneDNSSEC(callback: js.Function2[/* err */ AWSError, /* data */ EnableHostedZoneDNSSECResponse, Unit]): Request[EnableHostedZoneDNSSECResponse, AWSError] = js.native
  /**
    * Enables DNSSEC signing in a specific hosted zone.
    */
  def enableHostedZoneDNSSEC(params: EnableHostedZoneDNSSECRequest): Request[EnableHostedZoneDNSSECResponse, AWSError] = js.native
  def enableHostedZoneDNSSEC(
    params: EnableHostedZoneDNSSECRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ EnableHostedZoneDNSSECResponse, Unit]
  ): Request[EnableHostedZoneDNSSECResponse, AWSError] = js.native
  
  /**
    * Gets the specified limit for the current account, for example, the maximum number of health checks that you can create using the account. For the default limit, see Limits in the Amazon Route 53 Developer Guide. To request a higher limit, open a case.  You can also view account limits in Amazon Web Services Trusted Advisor. Sign in to the Amazon Web Services Management Console and open the Trusted Advisor console at https://console.aws.amazon.com/trustedadvisor/. Then choose Service limits in the navigation pane. 
    */
  def getAccountLimit(): Request[GetAccountLimitResponse, AWSError] = js.native
  def getAccountLimit(callback: js.Function2[/* err */ AWSError, /* data */ GetAccountLimitResponse, Unit]): Request[GetAccountLimitResponse, AWSError] = js.native
  /**
    * Gets the specified limit for the current account, for example, the maximum number of health checks that you can create using the account. For the default limit, see Limits in the Amazon Route 53 Developer Guide. To request a higher limit, open a case.  You can also view account limits in Amazon Web Services Trusted Advisor. Sign in to the Amazon Web Services Management Console and open the Trusted Advisor console at https://console.aws.amazon.com/trustedadvisor/. Then choose Service limits in the navigation pane. 
    */
  def getAccountLimit(params: GetAccountLimitRequest): Request[GetAccountLimitResponse, AWSError] = js.native
  def getAccountLimit(
    params: GetAccountLimitRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAccountLimitResponse, Unit]
  ): Request[GetAccountLimitResponse, AWSError] = js.native
  
  /**
    * Returns the current status of a change batch request. The status is one of the following values:    PENDING indicates that the changes in this request have not propagated to all Amazon Route 53 DNS servers. This is the initial status of all change batch requests.    INSYNC indicates that the changes have propagated to all Route 53 DNS servers.   
    */
  def getChange(): Request[GetChangeResponse, AWSError] = js.native
  def getChange(callback: js.Function2[/* err */ AWSError, /* data */ GetChangeResponse, Unit]): Request[GetChangeResponse, AWSError] = js.native
  /**
    * Returns the current status of a change batch request. The status is one of the following values:    PENDING indicates that the changes in this request have not propagated to all Amazon Route 53 DNS servers. This is the initial status of all change batch requests.    INSYNC indicates that the changes have propagated to all Route 53 DNS servers.   
    */
  def getChange(params: GetChangeRequest): Request[GetChangeResponse, AWSError] = js.native
  def getChange(
    params: GetChangeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetChangeResponse, Unit]
  ): Request[GetChangeResponse, AWSError] = js.native
  
  /**
    * Route 53 does not perform authorization for this API because it retrieves information that is already available to the public.   GetCheckerIpRanges still works, but we recommend that you download ip-ranges.json, which includes IP address ranges for all Amazon Web Services services. For more information, see IP Address Ranges of Amazon Route 53 Servers in the Amazon Route 53 Developer Guide. 
    */
  def getCheckerIpRanges(): Request[GetCheckerIpRangesResponse, AWSError] = js.native
  def getCheckerIpRanges(callback: js.Function2[/* err */ AWSError, /* data */ GetCheckerIpRangesResponse, Unit]): Request[GetCheckerIpRangesResponse, AWSError] = js.native
  /**
    * Route 53 does not perform authorization for this API because it retrieves information that is already available to the public.   GetCheckerIpRanges still works, but we recommend that you download ip-ranges.json, which includes IP address ranges for all Amazon Web Services services. For more information, see IP Address Ranges of Amazon Route 53 Servers in the Amazon Route 53 Developer Guide. 
    */
  def getCheckerIpRanges(params: GetCheckerIpRangesRequest): Request[GetCheckerIpRangesResponse, AWSError] = js.native
  def getCheckerIpRanges(
    params: GetCheckerIpRangesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCheckerIpRangesResponse, Unit]
  ): Request[GetCheckerIpRangesResponse, AWSError] = js.native
  
  /**
    * Returns information about DNSSEC for a specific hosted zone, including the key-signing keys (KSKs) in the hosted zone.
    */
  def getDNSSEC(): Request[GetDNSSECResponse, AWSError] = js.native
  def getDNSSEC(callback: js.Function2[/* err */ AWSError, /* data */ GetDNSSECResponse, Unit]): Request[GetDNSSECResponse, AWSError] = js.native
  /**
    * Returns information about DNSSEC for a specific hosted zone, including the key-signing keys (KSKs) in the hosted zone.
    */
  def getDNSSEC(params: GetDNSSECRequest): Request[GetDNSSECResponse, AWSError] = js.native
  def getDNSSEC(
    params: GetDNSSECRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDNSSECResponse, Unit]
  ): Request[GetDNSSECResponse, AWSError] = js.native
  
  /**
    * Gets information about whether a specified geographic location is supported for Amazon Route 53 geolocation resource record sets. Route 53 does not perform authorization for this API because it retrieves information that is already available to the public. Use the following syntax to determine whether a continent is supported for geolocation:  GET /2013-04-01/geolocation?continentcode=two-letter abbreviation for a continent   Use the following syntax to determine whether a country is supported for geolocation:  GET /2013-04-01/geolocation?countrycode=two-character country code   Use the following syntax to determine whether a subdivision of a country is supported for geolocation:  GET /2013-04-01/geolocation?countrycode=two-character country code&amp;subdivisioncode=subdivision code  
    */
  def getGeoLocation(): Request[GetGeoLocationResponse, AWSError] = js.native
  def getGeoLocation(callback: js.Function2[/* err */ AWSError, /* data */ GetGeoLocationResponse, Unit]): Request[GetGeoLocationResponse, AWSError] = js.native
  /**
    * Gets information about whether a specified geographic location is supported for Amazon Route 53 geolocation resource record sets. Route 53 does not perform authorization for this API because it retrieves information that is already available to the public. Use the following syntax to determine whether a continent is supported for geolocation:  GET /2013-04-01/geolocation?continentcode=two-letter abbreviation for a continent   Use the following syntax to determine whether a country is supported for geolocation:  GET /2013-04-01/geolocation?countrycode=two-character country code   Use the following syntax to determine whether a subdivision of a country is supported for geolocation:  GET /2013-04-01/geolocation?countrycode=two-character country code&amp;subdivisioncode=subdivision code  
    */
  def getGeoLocation(params: GetGeoLocationRequest): Request[GetGeoLocationResponse, AWSError] = js.native
  def getGeoLocation(
    params: GetGeoLocationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetGeoLocationResponse, Unit]
  ): Request[GetGeoLocationResponse, AWSError] = js.native
  
  /**
    * Gets information about a specified health check.
    */
  def getHealthCheck(): Request[GetHealthCheckResponse, AWSError] = js.native
  def getHealthCheck(callback: js.Function2[/* err */ AWSError, /* data */ GetHealthCheckResponse, Unit]): Request[GetHealthCheckResponse, AWSError] = js.native
  /**
    * Gets information about a specified health check.
    */
  def getHealthCheck(params: GetHealthCheckRequest): Request[GetHealthCheckResponse, AWSError] = js.native
  def getHealthCheck(
    params: GetHealthCheckRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetHealthCheckResponse, Unit]
  ): Request[GetHealthCheckResponse, AWSError] = js.native
  
  /**
    * Retrieves the number of health checks that are associated with the current Amazon Web Services account.
    */
  def getHealthCheckCount(): Request[GetHealthCheckCountResponse, AWSError] = js.native
  def getHealthCheckCount(callback: js.Function2[/* err */ AWSError, /* data */ GetHealthCheckCountResponse, Unit]): Request[GetHealthCheckCountResponse, AWSError] = js.native
  /**
    * Retrieves the number of health checks that are associated with the current Amazon Web Services account.
    */
  def getHealthCheckCount(params: GetHealthCheckCountRequest): Request[GetHealthCheckCountResponse, AWSError] = js.native
  def getHealthCheckCount(
    params: GetHealthCheckCountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetHealthCheckCountResponse, Unit]
  ): Request[GetHealthCheckCountResponse, AWSError] = js.native
  
  /**
    * Gets the reason that a specified health check failed most recently.
    */
  def getHealthCheckLastFailureReason(): Request[GetHealthCheckLastFailureReasonResponse, AWSError] = js.native
  def getHealthCheckLastFailureReason(
    callback: js.Function2[/* err */ AWSError, /* data */ GetHealthCheckLastFailureReasonResponse, Unit]
  ): Request[GetHealthCheckLastFailureReasonResponse, AWSError] = js.native
  /**
    * Gets the reason that a specified health check failed most recently.
    */
  def getHealthCheckLastFailureReason(params: GetHealthCheckLastFailureReasonRequest): Request[GetHealthCheckLastFailureReasonResponse, AWSError] = js.native
  def getHealthCheckLastFailureReason(
    params: GetHealthCheckLastFailureReasonRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetHealthCheckLastFailureReasonResponse, Unit]
  ): Request[GetHealthCheckLastFailureReasonResponse, AWSError] = js.native
  
  /**
    * Gets status of a specified health check.   This API is intended for use during development to diagnose behavior. It doesn’t support production use-cases with high query rates that require immediate and actionable responses. 
    */
  def getHealthCheckStatus(): Request[GetHealthCheckStatusResponse, AWSError] = js.native
  def getHealthCheckStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetHealthCheckStatusResponse, Unit]): Request[GetHealthCheckStatusResponse, AWSError] = js.native
  /**
    * Gets status of a specified health check.   This API is intended for use during development to diagnose behavior. It doesn’t support production use-cases with high query rates that require immediate and actionable responses. 
    */
  def getHealthCheckStatus(params: GetHealthCheckStatusRequest): Request[GetHealthCheckStatusResponse, AWSError] = js.native
  def getHealthCheckStatus(
    params: GetHealthCheckStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetHealthCheckStatusResponse, Unit]
  ): Request[GetHealthCheckStatusResponse, AWSError] = js.native
  
  /**
    * Gets information about a specified hosted zone including the four name servers assigned to the hosted zone.
    */
  def getHostedZone(): Request[GetHostedZoneResponse, AWSError] = js.native
  def getHostedZone(callback: js.Function2[/* err */ AWSError, /* data */ GetHostedZoneResponse, Unit]): Request[GetHostedZoneResponse, AWSError] = js.native
  /**
    * Gets information about a specified hosted zone including the four name servers assigned to the hosted zone.
    */
  def getHostedZone(params: GetHostedZoneRequest): Request[GetHostedZoneResponse, AWSError] = js.native
  def getHostedZone(
    params: GetHostedZoneRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetHostedZoneResponse, Unit]
  ): Request[GetHostedZoneResponse, AWSError] = js.native
  
  /**
    * Retrieves the number of hosted zones that are associated with the current Amazon Web Services account.
    */
  def getHostedZoneCount(): Request[GetHostedZoneCountResponse, AWSError] = js.native
  def getHostedZoneCount(callback: js.Function2[/* err */ AWSError, /* data */ GetHostedZoneCountResponse, Unit]): Request[GetHostedZoneCountResponse, AWSError] = js.native
  /**
    * Retrieves the number of hosted zones that are associated with the current Amazon Web Services account.
    */
  def getHostedZoneCount(params: GetHostedZoneCountRequest): Request[GetHostedZoneCountResponse, AWSError] = js.native
  def getHostedZoneCount(
    params: GetHostedZoneCountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetHostedZoneCountResponse, Unit]
  ): Request[GetHostedZoneCountResponse, AWSError] = js.native
  
  /**
    * Gets the specified limit for a specified hosted zone, for example, the maximum number of records that you can create in the hosted zone.  For the default limit, see Limits in the Amazon Route 53 Developer Guide. To request a higher limit, open a case.
    */
  def getHostedZoneLimit(): Request[GetHostedZoneLimitResponse, AWSError] = js.native
  def getHostedZoneLimit(callback: js.Function2[/* err */ AWSError, /* data */ GetHostedZoneLimitResponse, Unit]): Request[GetHostedZoneLimitResponse, AWSError] = js.native
  /**
    * Gets the specified limit for a specified hosted zone, for example, the maximum number of records that you can create in the hosted zone.  For the default limit, see Limits in the Amazon Route 53 Developer Guide. To request a higher limit, open a case.
    */
  def getHostedZoneLimit(params: GetHostedZoneLimitRequest): Request[GetHostedZoneLimitResponse, AWSError] = js.native
  def getHostedZoneLimit(
    params: GetHostedZoneLimitRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetHostedZoneLimitResponse, Unit]
  ): Request[GetHostedZoneLimitResponse, AWSError] = js.native
  
  /**
    * Gets information about a specified configuration for DNS query logging. For more information about DNS query logs, see CreateQueryLoggingConfig and Logging DNS Queries.
    */
  def getQueryLoggingConfig(): Request[GetQueryLoggingConfigResponse, AWSError] = js.native
  def getQueryLoggingConfig(callback: js.Function2[/* err */ AWSError, /* data */ GetQueryLoggingConfigResponse, Unit]): Request[GetQueryLoggingConfigResponse, AWSError] = js.native
  /**
    * Gets information about a specified configuration for DNS query logging. For more information about DNS query logs, see CreateQueryLoggingConfig and Logging DNS Queries.
    */
  def getQueryLoggingConfig(params: GetQueryLoggingConfigRequest): Request[GetQueryLoggingConfigResponse, AWSError] = js.native
  def getQueryLoggingConfig(
    params: GetQueryLoggingConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetQueryLoggingConfigResponse, Unit]
  ): Request[GetQueryLoggingConfigResponse, AWSError] = js.native
  
  /**
    * Retrieves information about a specified reusable delegation set, including the four name servers that are assigned to the delegation set.
    */
  def getReusableDelegationSet(): Request[GetReusableDelegationSetResponse, AWSError] = js.native
  def getReusableDelegationSet(callback: js.Function2[/* err */ AWSError, /* data */ GetReusableDelegationSetResponse, Unit]): Request[GetReusableDelegationSetResponse, AWSError] = js.native
  /**
    * Retrieves information about a specified reusable delegation set, including the four name servers that are assigned to the delegation set.
    */
  def getReusableDelegationSet(params: GetReusableDelegationSetRequest): Request[GetReusableDelegationSetResponse, AWSError] = js.native
  def getReusableDelegationSet(
    params: GetReusableDelegationSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReusableDelegationSetResponse, Unit]
  ): Request[GetReusableDelegationSetResponse, AWSError] = js.native
  
  /**
    * Gets the maximum number of hosted zones that you can associate with the specified reusable delegation set. For the default limit, see Limits in the Amazon Route 53 Developer Guide. To request a higher limit, open a case.
    */
  def getReusableDelegationSetLimit(): Request[GetReusableDelegationSetLimitResponse, AWSError] = js.native
  def getReusableDelegationSetLimit(callback: js.Function2[/* err */ AWSError, /* data */ GetReusableDelegationSetLimitResponse, Unit]): Request[GetReusableDelegationSetLimitResponse, AWSError] = js.native
  /**
    * Gets the maximum number of hosted zones that you can associate with the specified reusable delegation set. For the default limit, see Limits in the Amazon Route 53 Developer Guide. To request a higher limit, open a case.
    */
  def getReusableDelegationSetLimit(params: GetReusableDelegationSetLimitRequest): Request[GetReusableDelegationSetLimitResponse, AWSError] = js.native
  def getReusableDelegationSetLimit(
    params: GetReusableDelegationSetLimitRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReusableDelegationSetLimitResponse, Unit]
  ): Request[GetReusableDelegationSetLimitResponse, AWSError] = js.native
  
  /**
    * Gets information about a specific traffic policy version. For information about how of deleting a traffic policy affects the response from GetTrafficPolicy, see DeleteTrafficPolicy. 
    */
  def getTrafficPolicy(): Request[GetTrafficPolicyResponse, AWSError] = js.native
  def getTrafficPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetTrafficPolicyResponse, Unit]): Request[GetTrafficPolicyResponse, AWSError] = js.native
  /**
    * Gets information about a specific traffic policy version. For information about how of deleting a traffic policy affects the response from GetTrafficPolicy, see DeleteTrafficPolicy. 
    */
  def getTrafficPolicy(params: GetTrafficPolicyRequest): Request[GetTrafficPolicyResponse, AWSError] = js.native
  def getTrafficPolicy(
    params: GetTrafficPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTrafficPolicyResponse, Unit]
  ): Request[GetTrafficPolicyResponse, AWSError] = js.native
  
  /**
    * Gets information about a specified traffic policy instance.  After you submit a CreateTrafficPolicyInstance or an UpdateTrafficPolicyInstance request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the traffic policy definition. For more information, see the State response element.   In the Route 53 console, traffic policy instances are known as policy records. 
    */
  def getTrafficPolicyInstance(): Request[GetTrafficPolicyInstanceResponse, AWSError] = js.native
  def getTrafficPolicyInstance(callback: js.Function2[/* err */ AWSError, /* data */ GetTrafficPolicyInstanceResponse, Unit]): Request[GetTrafficPolicyInstanceResponse, AWSError] = js.native
  /**
    * Gets information about a specified traffic policy instance.  After you submit a CreateTrafficPolicyInstance or an UpdateTrafficPolicyInstance request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the traffic policy definition. For more information, see the State response element.   In the Route 53 console, traffic policy instances are known as policy records. 
    */
  def getTrafficPolicyInstance(params: GetTrafficPolicyInstanceRequest): Request[GetTrafficPolicyInstanceResponse, AWSError] = js.native
  def getTrafficPolicyInstance(
    params: GetTrafficPolicyInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTrafficPolicyInstanceResponse, Unit]
  ): Request[GetTrafficPolicyInstanceResponse, AWSError] = js.native
  
  /**
    * Gets the number of traffic policy instances that are associated with the current Amazon Web Services account.
    */
  def getTrafficPolicyInstanceCount(): Request[GetTrafficPolicyInstanceCountResponse, AWSError] = js.native
  def getTrafficPolicyInstanceCount(callback: js.Function2[/* err */ AWSError, /* data */ GetTrafficPolicyInstanceCountResponse, Unit]): Request[GetTrafficPolicyInstanceCountResponse, AWSError] = js.native
  /**
    * Gets the number of traffic policy instances that are associated with the current Amazon Web Services account.
    */
  def getTrafficPolicyInstanceCount(params: GetTrafficPolicyInstanceCountRequest): Request[GetTrafficPolicyInstanceCountResponse, AWSError] = js.native
  def getTrafficPolicyInstanceCount(
    params: GetTrafficPolicyInstanceCountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTrafficPolicyInstanceCountResponse, Unit]
  ): Request[GetTrafficPolicyInstanceCountResponse, AWSError] = js.native
  
  /**
    * Returns a paginated list of location objects and their CIDR blocks.
    */
  def listCidrBlocks(): Request[ListCidrBlocksResponse, AWSError] = js.native
  def listCidrBlocks(callback: js.Function2[/* err */ AWSError, /* data */ ListCidrBlocksResponse, Unit]): Request[ListCidrBlocksResponse, AWSError] = js.native
  /**
    * Returns a paginated list of location objects and their CIDR blocks.
    */
  def listCidrBlocks(params: ListCidrBlocksRequest): Request[ListCidrBlocksResponse, AWSError] = js.native
  def listCidrBlocks(
    params: ListCidrBlocksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCidrBlocksResponse, Unit]
  ): Request[ListCidrBlocksResponse, AWSError] = js.native
  
  /**
    * Returns a paginated list of CIDR collections in the Amazon Web Services account (metadata only).
    */
  def listCidrCollections(): Request[ListCidrCollectionsResponse, AWSError] = js.native
  def listCidrCollections(callback: js.Function2[/* err */ AWSError, /* data */ ListCidrCollectionsResponse, Unit]): Request[ListCidrCollectionsResponse, AWSError] = js.native
  /**
    * Returns a paginated list of CIDR collections in the Amazon Web Services account (metadata only).
    */
  def listCidrCollections(params: ListCidrCollectionsRequest): Request[ListCidrCollectionsResponse, AWSError] = js.native
  def listCidrCollections(
    params: ListCidrCollectionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCidrCollectionsResponse, Unit]
  ): Request[ListCidrCollectionsResponse, AWSError] = js.native
  
  /**
    * Returns a paginated list of CIDR locations for the given collection (metadata only, does not include CIDR blocks).
    */
  def listCidrLocations(): Request[ListCidrLocationsResponse, AWSError] = js.native
  def listCidrLocations(callback: js.Function2[/* err */ AWSError, /* data */ ListCidrLocationsResponse, Unit]): Request[ListCidrLocationsResponse, AWSError] = js.native
  /**
    * Returns a paginated list of CIDR locations for the given collection (metadata only, does not include CIDR blocks).
    */
  def listCidrLocations(params: ListCidrLocationsRequest): Request[ListCidrLocationsResponse, AWSError] = js.native
  def listCidrLocations(
    params: ListCidrLocationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCidrLocationsResponse, Unit]
  ): Request[ListCidrLocationsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of supported geographic locations. Countries are listed first, and continents are listed last. If Amazon Route 53 supports subdivisions for a country (for example, states or provinces), the subdivisions for that country are listed in alphabetical order immediately after the corresponding country. Route 53 does not perform authorization for this API because it retrieves information that is already available to the public. For a list of supported geolocation codes, see the GeoLocation data type.
    */
  def listGeoLocations(): Request[ListGeoLocationsResponse, AWSError] = js.native
  def listGeoLocations(callback: js.Function2[/* err */ AWSError, /* data */ ListGeoLocationsResponse, Unit]): Request[ListGeoLocationsResponse, AWSError] = js.native
  /**
    * Retrieves a list of supported geographic locations. Countries are listed first, and continents are listed last. If Amazon Route 53 supports subdivisions for a country (for example, states or provinces), the subdivisions for that country are listed in alphabetical order immediately after the corresponding country. Route 53 does not perform authorization for this API because it retrieves information that is already available to the public. For a list of supported geolocation codes, see the GeoLocation data type.
    */
  def listGeoLocations(params: ListGeoLocationsRequest): Request[ListGeoLocationsResponse, AWSError] = js.native
  def listGeoLocations(
    params: ListGeoLocationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGeoLocationsResponse, Unit]
  ): Request[ListGeoLocationsResponse, AWSError] = js.native
  
  /**
    * Retrieve a list of the health checks that are associated with the current Amazon Web Services account. 
    */
  def listHealthChecks(): Request[ListHealthChecksResponse, AWSError] = js.native
  def listHealthChecks(callback: js.Function2[/* err */ AWSError, /* data */ ListHealthChecksResponse, Unit]): Request[ListHealthChecksResponse, AWSError] = js.native
  /**
    * Retrieve a list of the health checks that are associated with the current Amazon Web Services account. 
    */
  def listHealthChecks(params: ListHealthChecksRequest): Request[ListHealthChecksResponse, AWSError] = js.native
  def listHealthChecks(
    params: ListHealthChecksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListHealthChecksResponse, Unit]
  ): Request[ListHealthChecksResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of the public and private hosted zones that are associated with the current Amazon Web Services account. The response includes a HostedZones child element for each hosted zone. Amazon Route 53 returns a maximum of 100 items in each response. If you have a lot of hosted zones, you can use the maxitems parameter to list them in groups of up to 100.
    */
  def listHostedZones(): Request[ListHostedZonesResponse, AWSError] = js.native
  def listHostedZones(callback: js.Function2[/* err */ AWSError, /* data */ ListHostedZonesResponse, Unit]): Request[ListHostedZonesResponse, AWSError] = js.native
  /**
    * Retrieves a list of the public and private hosted zones that are associated with the current Amazon Web Services account. The response includes a HostedZones child element for each hosted zone. Amazon Route 53 returns a maximum of 100 items in each response. If you have a lot of hosted zones, you can use the maxitems parameter to list them in groups of up to 100.
    */
  def listHostedZones(params: ListHostedZonesRequest): Request[ListHostedZonesResponse, AWSError] = js.native
  def listHostedZones(
    params: ListHostedZonesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListHostedZonesResponse, Unit]
  ): Request[ListHostedZonesResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of your hosted zones in lexicographic order. The response includes a HostedZones child element for each hosted zone created by the current Amazon Web Services account.   ListHostedZonesByName sorts hosted zones by name with the labels reversed. For example:  com.example.www.  Note the trailing dot, which can change the sort order in some circumstances. If the domain name includes escape characters or Punycode, ListHostedZonesByName alphabetizes the domain name using the escaped or Punycoded value, which is the format that Amazon Route 53 saves in its database. For example, to create a hosted zone for exämple.com, you specify ex\344mple.com for the domain name. ListHostedZonesByName alphabetizes it as:  com.ex\344mple.  The labels are reversed and alphabetized using the escaped value. For more information about valid domain name formats, including internationalized domain names, see DNS Domain Name Format in the Amazon Route 53 Developer Guide. Route 53 returns up to 100 items in each response. If you have a lot of hosted zones, use the MaxItems parameter to list them in groups of up to 100. The response includes values that help navigate from one group of MaxItems hosted zones to the next:   The DNSName and HostedZoneId elements in the response contain the values, if any, specified for the dnsname and hostedzoneid parameters in the request that produced the current response.   The MaxItems element in the response contains the value, if any, that you specified for the maxitems parameter in the request that produced the current response.   If the value of IsTruncated in the response is true, there are more hosted zones associated with the current Amazon Web Services account.  If IsTruncated is false, this response includes the last hosted zone that is associated with the current account. The NextDNSName element and NextHostedZoneId elements are omitted from the response.   The NextDNSName and NextHostedZoneId elements in the response contain the domain name and the hosted zone ID of the next hosted zone that is associated with the current Amazon Web Services account. If you want to list more hosted zones, make another call to ListHostedZonesByName, and specify the value of NextDNSName and NextHostedZoneId in the dnsname and hostedzoneid parameters, respectively.  
    */
  def listHostedZonesByName(): Request[ListHostedZonesByNameResponse, AWSError] = js.native
  def listHostedZonesByName(callback: js.Function2[/* err */ AWSError, /* data */ ListHostedZonesByNameResponse, Unit]): Request[ListHostedZonesByNameResponse, AWSError] = js.native
  /**
    * Retrieves a list of your hosted zones in lexicographic order. The response includes a HostedZones child element for each hosted zone created by the current Amazon Web Services account.   ListHostedZonesByName sorts hosted zones by name with the labels reversed. For example:  com.example.www.  Note the trailing dot, which can change the sort order in some circumstances. If the domain name includes escape characters or Punycode, ListHostedZonesByName alphabetizes the domain name using the escaped or Punycoded value, which is the format that Amazon Route 53 saves in its database. For example, to create a hosted zone for exämple.com, you specify ex\344mple.com for the domain name. ListHostedZonesByName alphabetizes it as:  com.ex\344mple.  The labels are reversed and alphabetized using the escaped value. For more information about valid domain name formats, including internationalized domain names, see DNS Domain Name Format in the Amazon Route 53 Developer Guide. Route 53 returns up to 100 items in each response. If you have a lot of hosted zones, use the MaxItems parameter to list them in groups of up to 100. The response includes values that help navigate from one group of MaxItems hosted zones to the next:   The DNSName and HostedZoneId elements in the response contain the values, if any, specified for the dnsname and hostedzoneid parameters in the request that produced the current response.   The MaxItems element in the response contains the value, if any, that you specified for the maxitems parameter in the request that produced the current response.   If the value of IsTruncated in the response is true, there are more hosted zones associated with the current Amazon Web Services account.  If IsTruncated is false, this response includes the last hosted zone that is associated with the current account. The NextDNSName element and NextHostedZoneId elements are omitted from the response.   The NextDNSName and NextHostedZoneId elements in the response contain the domain name and the hosted zone ID of the next hosted zone that is associated with the current Amazon Web Services account. If you want to list more hosted zones, make another call to ListHostedZonesByName, and specify the value of NextDNSName and NextHostedZoneId in the dnsname and hostedzoneid parameters, respectively.  
    */
  def listHostedZonesByName(params: ListHostedZonesByNameRequest): Request[ListHostedZonesByNameResponse, AWSError] = js.native
  def listHostedZonesByName(
    params: ListHostedZonesByNameRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListHostedZonesByNameResponse, Unit]
  ): Request[ListHostedZonesByNameResponse, AWSError] = js.native
  
  /**
    * Lists all the private hosted zones that a specified VPC is associated with, regardless of which Amazon Web Services account or Amazon Web Services service owns the hosted zones. The HostedZoneOwner structure in the response contains one of the following values:   An OwningAccount element, which contains the account number of either the current Amazon Web Services account or another Amazon Web Services account. Some services, such as Cloud Map, create hosted zones using the current account.    An OwningService element, which identifies the Amazon Web Services service that created and owns the hosted zone. For example, if a hosted zone was created by Amazon Elastic File System (Amazon EFS), the value of Owner is efs.amazonaws.com.     When listing private hosted zones, the hosted zone and the Amazon VPC must belong to the same partition where the hosted zones were created. A partition is a group of Amazon Web Services Regions. Each Amazon Web Services account is scoped to one partition. The following are the supported partitions:    aws - Amazon Web Services Regions    aws-cn - China Regions    aws-us-gov - Amazon Web Services GovCloud (US) Region   For more information, see Access Management in the Amazon Web Services General Reference. 
    */
  def listHostedZonesByVPC(): Request[ListHostedZonesByVPCResponse, AWSError] = js.native
  def listHostedZonesByVPC(callback: js.Function2[/* err */ AWSError, /* data */ ListHostedZonesByVPCResponse, Unit]): Request[ListHostedZonesByVPCResponse, AWSError] = js.native
  /**
    * Lists all the private hosted zones that a specified VPC is associated with, regardless of which Amazon Web Services account or Amazon Web Services service owns the hosted zones. The HostedZoneOwner structure in the response contains one of the following values:   An OwningAccount element, which contains the account number of either the current Amazon Web Services account or another Amazon Web Services account. Some services, such as Cloud Map, create hosted zones using the current account.    An OwningService element, which identifies the Amazon Web Services service that created and owns the hosted zone. For example, if a hosted zone was created by Amazon Elastic File System (Amazon EFS), the value of Owner is efs.amazonaws.com.     When listing private hosted zones, the hosted zone and the Amazon VPC must belong to the same partition where the hosted zones were created. A partition is a group of Amazon Web Services Regions. Each Amazon Web Services account is scoped to one partition. The following are the supported partitions:    aws - Amazon Web Services Regions    aws-cn - China Regions    aws-us-gov - Amazon Web Services GovCloud (US) Region   For more information, see Access Management in the Amazon Web Services General Reference. 
    */
  def listHostedZonesByVPC(params: ListHostedZonesByVPCRequest): Request[ListHostedZonesByVPCResponse, AWSError] = js.native
  def listHostedZonesByVPC(
    params: ListHostedZonesByVPCRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListHostedZonesByVPCResponse, Unit]
  ): Request[ListHostedZonesByVPCResponse, AWSError] = js.native
  
  /**
    * Lists the configurations for DNS query logging that are associated with the current Amazon Web Services account or the configuration that is associated with a specified hosted zone. For more information about DNS query logs, see CreateQueryLoggingConfig. Additional information, including the format of DNS query logs, appears in Logging DNS Queries in the Amazon Route 53 Developer Guide.
    */
  def listQueryLoggingConfigs(): Request[ListQueryLoggingConfigsResponse, AWSError] = js.native
  def listQueryLoggingConfigs(callback: js.Function2[/* err */ AWSError, /* data */ ListQueryLoggingConfigsResponse, Unit]): Request[ListQueryLoggingConfigsResponse, AWSError] = js.native
  /**
    * Lists the configurations for DNS query logging that are associated with the current Amazon Web Services account or the configuration that is associated with a specified hosted zone. For more information about DNS query logs, see CreateQueryLoggingConfig. Additional information, including the format of DNS query logs, appears in Logging DNS Queries in the Amazon Route 53 Developer Guide.
    */
  def listQueryLoggingConfigs(params: ListQueryLoggingConfigsRequest): Request[ListQueryLoggingConfigsResponse, AWSError] = js.native
  def listQueryLoggingConfigs(
    params: ListQueryLoggingConfigsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListQueryLoggingConfigsResponse, Unit]
  ): Request[ListQueryLoggingConfigsResponse, AWSError] = js.native
  
  /**
    * Lists the resource record sets in a specified hosted zone.  ListResourceRecordSets returns up to 300 resource record sets at a time in ASCII order, beginning at a position specified by the name and type elements.  Sort order   ListResourceRecordSets sorts results first by DNS name with the labels reversed, for example:  com.example.www.  Note the trailing dot, which can change the sort order when the record name contains characters that appear before . (decimal 46) in the ASCII table. These characters include the following: ! " # $ % &amp; ' ( ) * + , -  When multiple records have the same DNS name, ListResourceRecordSets sorts results by the record type.  Specifying where to start listing records  You can use the name and type elements to specify the resource record set that the list begins with:  If you do not specify Name or Type  The results begin with the first resource record set that the hosted zone contains.  If you specify Name but not Type  The results begin with the first resource record set in the list whose name is greater than or equal to Name.  If you specify Type but not Name  Amazon Route 53 returns the InvalidInput error.  If you specify both Name and Type  The results begin with the first resource record set in the list whose name is greater than or equal to Name, and whose type is greater than or equal to Type.    Resource record sets that are PENDING  This action returns the most current version of the records. This includes records that are PENDING, and that are not yet available on all Route 53 DNS servers.  Changing resource record sets  To ensure that you get an accurate listing of the resource record sets for a hosted zone at a point in time, do not submit a ChangeResourceRecordSets request while you're paging through the results of a ListResourceRecordSets request. If you do, some pages may display results without the latest changes while other pages display results with the latest changes.  Displaying the next page of results  If a ListResourceRecordSets command returns more than one page of results, the value of IsTruncated is true. To display the next page of results, get the values of NextRecordName, NextRecordType, and NextRecordIdentifier (if any) from the response. Then submit another ListResourceRecordSets request, and specify those values for StartRecordName, StartRecordType, and StartRecordIdentifier.
    */
  def listResourceRecordSets(): Request[ListResourceRecordSetsResponse, AWSError] = js.native
  def listResourceRecordSets(callback: js.Function2[/* err */ AWSError, /* data */ ListResourceRecordSetsResponse, Unit]): Request[ListResourceRecordSetsResponse, AWSError] = js.native
  /**
    * Lists the resource record sets in a specified hosted zone.  ListResourceRecordSets returns up to 300 resource record sets at a time in ASCII order, beginning at a position specified by the name and type elements.  Sort order   ListResourceRecordSets sorts results first by DNS name with the labels reversed, for example:  com.example.www.  Note the trailing dot, which can change the sort order when the record name contains characters that appear before . (decimal 46) in the ASCII table. These characters include the following: ! " # $ % &amp; ' ( ) * + , -  When multiple records have the same DNS name, ListResourceRecordSets sorts results by the record type.  Specifying where to start listing records  You can use the name and type elements to specify the resource record set that the list begins with:  If you do not specify Name or Type  The results begin with the first resource record set that the hosted zone contains.  If you specify Name but not Type  The results begin with the first resource record set in the list whose name is greater than or equal to Name.  If you specify Type but not Name  Amazon Route 53 returns the InvalidInput error.  If you specify both Name and Type  The results begin with the first resource record set in the list whose name is greater than or equal to Name, and whose type is greater than or equal to Type.    Resource record sets that are PENDING  This action returns the most current version of the records. This includes records that are PENDING, and that are not yet available on all Route 53 DNS servers.  Changing resource record sets  To ensure that you get an accurate listing of the resource record sets for a hosted zone at a point in time, do not submit a ChangeResourceRecordSets request while you're paging through the results of a ListResourceRecordSets request. If you do, some pages may display results without the latest changes while other pages display results with the latest changes.  Displaying the next page of results  If a ListResourceRecordSets command returns more than one page of results, the value of IsTruncated is true. To display the next page of results, get the values of NextRecordName, NextRecordType, and NextRecordIdentifier (if any) from the response. Then submit another ListResourceRecordSets request, and specify those values for StartRecordName, StartRecordType, and StartRecordIdentifier.
    */
  def listResourceRecordSets(params: ListResourceRecordSetsRequest): Request[ListResourceRecordSetsResponse, AWSError] = js.native
  def listResourceRecordSets(
    params: ListResourceRecordSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourceRecordSetsResponse, Unit]
  ): Request[ListResourceRecordSetsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of the reusable delegation sets that are associated with the current Amazon Web Services account.
    */
  def listReusableDelegationSets(): Request[ListReusableDelegationSetsResponse, AWSError] = js.native
  def listReusableDelegationSets(callback: js.Function2[/* err */ AWSError, /* data */ ListReusableDelegationSetsResponse, Unit]): Request[ListReusableDelegationSetsResponse, AWSError] = js.native
  /**
    * Retrieves a list of the reusable delegation sets that are associated with the current Amazon Web Services account.
    */
  def listReusableDelegationSets(params: ListReusableDelegationSetsRequest): Request[ListReusableDelegationSetsResponse, AWSError] = js.native
  def listReusableDelegationSets(
    params: ListReusableDelegationSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListReusableDelegationSetsResponse, Unit]
  ): Request[ListReusableDelegationSetsResponse, AWSError] = js.native
  
  /**
    * Lists tags for one health check or hosted zone.  For information about using tags for cost allocation, see Using Cost Allocation Tags in the Billing and Cost Management User Guide.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists tags for one health check or hosted zone.  For information about using tags for cost allocation, see Using Cost Allocation Tags in the Billing and Cost Management User Guide.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Lists tags for up to 10 health checks or hosted zones. For information about using tags for cost allocation, see Using Cost Allocation Tags in the Billing and Cost Management User Guide.
    */
  def listTagsForResources(): Request[ListTagsForResourcesResponse, AWSError] = js.native
  def listTagsForResources(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourcesResponse, Unit]): Request[ListTagsForResourcesResponse, AWSError] = js.native
  /**
    * Lists tags for up to 10 health checks or hosted zones. For information about using tags for cost allocation, see Using Cost Allocation Tags in the Billing and Cost Management User Guide.
    */
  def listTagsForResources(params: ListTagsForResourcesRequest): Request[ListTagsForResourcesResponse, AWSError] = js.native
  def listTagsForResources(
    params: ListTagsForResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourcesResponse, Unit]
  ): Request[ListTagsForResourcesResponse, AWSError] = js.native
  
  /**
    * Gets information about the latest version for every traffic policy that is associated with the current Amazon Web Services account. Policies are listed in the order that they were created in.  For information about how of deleting a traffic policy affects the response from ListTrafficPolicies, see DeleteTrafficPolicy. 
    */
  def listTrafficPolicies(): Request[ListTrafficPoliciesResponse, AWSError] = js.native
  def listTrafficPolicies(callback: js.Function2[/* err */ AWSError, /* data */ ListTrafficPoliciesResponse, Unit]): Request[ListTrafficPoliciesResponse, AWSError] = js.native
  /**
    * Gets information about the latest version for every traffic policy that is associated with the current Amazon Web Services account. Policies are listed in the order that they were created in.  For information about how of deleting a traffic policy affects the response from ListTrafficPolicies, see DeleteTrafficPolicy. 
    */
  def listTrafficPolicies(params: ListTrafficPoliciesRequest): Request[ListTrafficPoliciesResponse, AWSError] = js.native
  def listTrafficPolicies(
    params: ListTrafficPoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTrafficPoliciesResponse, Unit]
  ): Request[ListTrafficPoliciesResponse, AWSError] = js.native
  
  /**
    * Gets information about the traffic policy instances that you created by using the current Amazon Web Services account.  After you submit an UpdateTrafficPolicyInstance request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the traffic policy definition. For more information, see the State response element.  Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances, you can use the MaxItems parameter to list them in groups of up to 100.
    */
  def listTrafficPolicyInstances(): Request[ListTrafficPolicyInstancesResponse, AWSError] = js.native
  def listTrafficPolicyInstances(callback: js.Function2[/* err */ AWSError, /* data */ ListTrafficPolicyInstancesResponse, Unit]): Request[ListTrafficPolicyInstancesResponse, AWSError] = js.native
  /**
    * Gets information about the traffic policy instances that you created by using the current Amazon Web Services account.  After you submit an UpdateTrafficPolicyInstance request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the traffic policy definition. For more information, see the State response element.  Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances, you can use the MaxItems parameter to list them in groups of up to 100.
    */
  def listTrafficPolicyInstances(params: ListTrafficPolicyInstancesRequest): Request[ListTrafficPolicyInstancesResponse, AWSError] = js.native
  def listTrafficPolicyInstances(
    params: ListTrafficPolicyInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTrafficPolicyInstancesResponse, Unit]
  ): Request[ListTrafficPolicyInstancesResponse, AWSError] = js.native
  
  /**
    * Gets information about the traffic policy instances that you created in a specified hosted zone.  After you submit a CreateTrafficPolicyInstance or an UpdateTrafficPolicyInstance request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the traffic policy definition. For more information, see the State response element.  Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances, you can use the MaxItems parameter to list them in groups of up to 100.
    */
  def listTrafficPolicyInstancesByHostedZone(): Request[ListTrafficPolicyInstancesByHostedZoneResponse, AWSError] = js.native
  def listTrafficPolicyInstancesByHostedZone(
    callback: js.Function2[/* err */ AWSError, /* data */ ListTrafficPolicyInstancesByHostedZoneResponse, Unit]
  ): Request[ListTrafficPolicyInstancesByHostedZoneResponse, AWSError] = js.native
  /**
    * Gets information about the traffic policy instances that you created in a specified hosted zone.  After you submit a CreateTrafficPolicyInstance or an UpdateTrafficPolicyInstance request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the traffic policy definition. For more information, see the State response element.  Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances, you can use the MaxItems parameter to list them in groups of up to 100.
    */
  def listTrafficPolicyInstancesByHostedZone(params: ListTrafficPolicyInstancesByHostedZoneRequest): Request[ListTrafficPolicyInstancesByHostedZoneResponse, AWSError] = js.native
  def listTrafficPolicyInstancesByHostedZone(
    params: ListTrafficPolicyInstancesByHostedZoneRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTrafficPolicyInstancesByHostedZoneResponse, Unit]
  ): Request[ListTrafficPolicyInstancesByHostedZoneResponse, AWSError] = js.native
  
  /**
    * Gets information about the traffic policy instances that you created by using a specify traffic policy version.  After you submit a CreateTrafficPolicyInstance or an UpdateTrafficPolicyInstance request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the traffic policy definition. For more information, see the State response element.  Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances, you can use the MaxItems parameter to list them in groups of up to 100.
    */
  def listTrafficPolicyInstancesByPolicy(): Request[ListTrafficPolicyInstancesByPolicyResponse, AWSError] = js.native
  def listTrafficPolicyInstancesByPolicy(
    callback: js.Function2[/* err */ AWSError, /* data */ ListTrafficPolicyInstancesByPolicyResponse, Unit]
  ): Request[ListTrafficPolicyInstancesByPolicyResponse, AWSError] = js.native
  /**
    * Gets information about the traffic policy instances that you created by using a specify traffic policy version.  After you submit a CreateTrafficPolicyInstance or an UpdateTrafficPolicyInstance request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the traffic policy definition. For more information, see the State response element.  Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances, you can use the MaxItems parameter to list them in groups of up to 100.
    */
  def listTrafficPolicyInstancesByPolicy(params: ListTrafficPolicyInstancesByPolicyRequest): Request[ListTrafficPolicyInstancesByPolicyResponse, AWSError] = js.native
  def listTrafficPolicyInstancesByPolicy(
    params: ListTrafficPolicyInstancesByPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTrafficPolicyInstancesByPolicyResponse, Unit]
  ): Request[ListTrafficPolicyInstancesByPolicyResponse, AWSError] = js.native
  
  /**
    * Gets information about all of the versions for a specified traffic policy. Traffic policy versions are listed in numerical order by VersionNumber.
    */
  def listTrafficPolicyVersions(): Request[ListTrafficPolicyVersionsResponse, AWSError] = js.native
  def listTrafficPolicyVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListTrafficPolicyVersionsResponse, Unit]): Request[ListTrafficPolicyVersionsResponse, AWSError] = js.native
  /**
    * Gets information about all of the versions for a specified traffic policy. Traffic policy versions are listed in numerical order by VersionNumber.
    */
  def listTrafficPolicyVersions(params: ListTrafficPolicyVersionsRequest): Request[ListTrafficPolicyVersionsResponse, AWSError] = js.native
  def listTrafficPolicyVersions(
    params: ListTrafficPolicyVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTrafficPolicyVersionsResponse, Unit]
  ): Request[ListTrafficPolicyVersionsResponse, AWSError] = js.native
  
  /**
    * Gets a list of the VPCs that were created by other accounts and that can be associated with a specified hosted zone because you've submitted one or more CreateVPCAssociationAuthorization requests.  The response includes a VPCs element with a VPC child element for each VPC that can be associated with the hosted zone.
    */
  def listVPCAssociationAuthorizations(): Request[ListVPCAssociationAuthorizationsResponse, AWSError] = js.native
  def listVPCAssociationAuthorizations(
    callback: js.Function2[/* err */ AWSError, /* data */ ListVPCAssociationAuthorizationsResponse, Unit]
  ): Request[ListVPCAssociationAuthorizationsResponse, AWSError] = js.native
  /**
    * Gets a list of the VPCs that were created by other accounts and that can be associated with a specified hosted zone because you've submitted one or more CreateVPCAssociationAuthorization requests.  The response includes a VPCs element with a VPC child element for each VPC that can be associated with the hosted zone.
    */
  def listVPCAssociationAuthorizations(params: ListVPCAssociationAuthorizationsRequest): Request[ListVPCAssociationAuthorizationsResponse, AWSError] = js.native
  def listVPCAssociationAuthorizations(
    params: ListVPCAssociationAuthorizationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVPCAssociationAuthorizationsResponse, Unit]
  ): Request[ListVPCAssociationAuthorizationsResponse, AWSError] = js.native
  
  /**
    * Gets the value that Amazon Route 53 returns in response to a DNS request for a specified record name and type. You can optionally specify the IP address of a DNS resolver, an EDNS0 client subnet IP address, and a subnet mask.  This call only supports querying public hosted zones.
    */
  def testDNSAnswer(): Request[TestDNSAnswerResponse, AWSError] = js.native
  def testDNSAnswer(callback: js.Function2[/* err */ AWSError, /* data */ TestDNSAnswerResponse, Unit]): Request[TestDNSAnswerResponse, AWSError] = js.native
  /**
    * Gets the value that Amazon Route 53 returns in response to a DNS request for a specified record name and type. You can optionally specify the IP address of a DNS resolver, an EDNS0 client subnet IP address, and a subnet mask.  This call only supports querying public hosted zones.
    */
  def testDNSAnswer(params: TestDNSAnswerRequest): Request[TestDNSAnswerResponse, AWSError] = js.native
  def testDNSAnswer(
    params: TestDNSAnswerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TestDNSAnswerResponse, Unit]
  ): Request[TestDNSAnswerResponse, AWSError] = js.native
  
  /**
    * Updates an existing health check. Note that some values can't be updated.  For more information about updating health checks, see Creating, Updating, and Deleting Health Checks in the Amazon Route 53 Developer Guide.
    */
  def updateHealthCheck(): Request[UpdateHealthCheckResponse, AWSError] = js.native
  def updateHealthCheck(callback: js.Function2[/* err */ AWSError, /* data */ UpdateHealthCheckResponse, Unit]): Request[UpdateHealthCheckResponse, AWSError] = js.native
  /**
    * Updates an existing health check. Note that some values can't be updated.  For more information about updating health checks, see Creating, Updating, and Deleting Health Checks in the Amazon Route 53 Developer Guide.
    */
  def updateHealthCheck(params: UpdateHealthCheckRequest): Request[UpdateHealthCheckResponse, AWSError] = js.native
  def updateHealthCheck(
    params: UpdateHealthCheckRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateHealthCheckResponse, Unit]
  ): Request[UpdateHealthCheckResponse, AWSError] = js.native
  
  /**
    * Updates the comment for a specified hosted zone.
    */
  def updateHostedZoneComment(): Request[UpdateHostedZoneCommentResponse, AWSError] = js.native
  def updateHostedZoneComment(callback: js.Function2[/* err */ AWSError, /* data */ UpdateHostedZoneCommentResponse, Unit]): Request[UpdateHostedZoneCommentResponse, AWSError] = js.native
  /**
    * Updates the comment for a specified hosted zone.
    */
  def updateHostedZoneComment(params: UpdateHostedZoneCommentRequest): Request[UpdateHostedZoneCommentResponse, AWSError] = js.native
  def updateHostedZoneComment(
    params: UpdateHostedZoneCommentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateHostedZoneCommentResponse, Unit]
  ): Request[UpdateHostedZoneCommentResponse, AWSError] = js.native
  
  /**
    * Updates the comment for a specified traffic policy version.
    */
  def updateTrafficPolicyComment(): Request[UpdateTrafficPolicyCommentResponse, AWSError] = js.native
  def updateTrafficPolicyComment(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTrafficPolicyCommentResponse, Unit]): Request[UpdateTrafficPolicyCommentResponse, AWSError] = js.native
  /**
    * Updates the comment for a specified traffic policy version.
    */
  def updateTrafficPolicyComment(params: UpdateTrafficPolicyCommentRequest): Request[UpdateTrafficPolicyCommentResponse, AWSError] = js.native
  def updateTrafficPolicyComment(
    params: UpdateTrafficPolicyCommentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTrafficPolicyCommentResponse, Unit]
  ): Request[UpdateTrafficPolicyCommentResponse, AWSError] = js.native
  
  /**
    * Updates the resource record sets in a specified hosted zone that were created based on the settings in a specified traffic policy version. When you update a traffic policy instance, Amazon Route 53 continues to respond to DNS queries for the root resource record set name (such as example.com) while it replaces one group of resource record sets with another. Route 53 performs the following operations:   Route 53 creates a new group of resource record sets based on the specified traffic policy. This is true regardless of how significant the differences are between the existing resource record sets and the new resource record sets.    When all of the new resource record sets have been created, Route 53 starts to respond to DNS queries for the root resource record set name (such as example.com) by using the new resource record sets.   Route 53 deletes the old group of resource record sets that are associated with the root resource record set name.  
    */
  def updateTrafficPolicyInstance(): Request[UpdateTrafficPolicyInstanceResponse, AWSError] = js.native
  def updateTrafficPolicyInstance(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTrafficPolicyInstanceResponse, Unit]): Request[UpdateTrafficPolicyInstanceResponse, AWSError] = js.native
  /**
    * Updates the resource record sets in a specified hosted zone that were created based on the settings in a specified traffic policy version. When you update a traffic policy instance, Amazon Route 53 continues to respond to DNS queries for the root resource record set name (such as example.com) while it replaces one group of resource record sets with another. Route 53 performs the following operations:   Route 53 creates a new group of resource record sets based on the specified traffic policy. This is true regardless of how significant the differences are between the existing resource record sets and the new resource record sets.    When all of the new resource record sets have been created, Route 53 starts to respond to DNS queries for the root resource record set name (such as example.com) by using the new resource record sets.   Route 53 deletes the old group of resource record sets that are associated with the root resource record set name.  
    */
  def updateTrafficPolicyInstance(params: UpdateTrafficPolicyInstanceRequest): Request[UpdateTrafficPolicyInstanceResponse, AWSError] = js.native
  def updateTrafficPolicyInstance(
    params: UpdateTrafficPolicyInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTrafficPolicyInstanceResponse, Unit]
  ): Request[UpdateTrafficPolicyInstanceResponse, AWSError] = js.native
  
  /**
    * Waits for the resourceRecordSetsChanged state by periodically calling the underlying Route53.getChangeoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_resourceRecordSetsChanged(state: resourceRecordSetsChanged): Request[GetChangeResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_resourceRecordSetsChanged(
    state: resourceRecordSetsChanged,
    callback: js.Function2[/* err */ AWSError, /* data */ GetChangeResponse, Unit]
  ): Request[GetChangeResponse, AWSError] = js.native
  /**
    * Waits for the resourceRecordSetsChanged state by periodically calling the underlying Route53.getChangeoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_resourceRecordSetsChanged(state: resourceRecordSetsChanged, params: GetChangeRequestwaiterWai): Request[GetChangeResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_resourceRecordSetsChanged(
    state: resourceRecordSetsChanged,
    params: GetChangeRequestwaiterWai,
    callback: js.Function2[/* err */ AWSError, /* data */ GetChangeResponse, Unit]
  ): Request[GetChangeResponse, AWSError] = js.native
}
