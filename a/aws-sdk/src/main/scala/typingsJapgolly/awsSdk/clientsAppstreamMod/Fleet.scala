package typingsJapgolly.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fleet extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the fleet.
    */
  var Arn: typingsJapgolly.awsSdk.clientsAppstreamMod.Arn
  
  /**
    * The capacity status for the fleet.
    */
  var ComputeCapacityStatus: typingsJapgolly.awsSdk.clientsAppstreamMod.ComputeCapacityStatus
  
  /**
    * The time the fleet was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description to display.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The amount of time that a streaming session remains active after users disconnect. If they try to reconnect to the streaming session after a disconnection or network interruption within this time interval, they are connected to their previous session. Otherwise, they are connected to a new session with a new streaming instance. Specify a value between 60 and 360000.
    */
  var DisconnectTimeoutInSeconds: js.UndefOr[Integer] = js.undefined
  
  /**
    * The fleet name to display.
    */
  var DisplayName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the directory and organizational unit (OU) to use to join the fleet to a Microsoft Active Directory domain. 
    */
  var DomainJoinInfo: js.UndefOr[typingsJapgolly.awsSdk.clientsAppstreamMod.DomainJoinInfo] = js.undefined
  
  /**
    * Indicates whether default internet access is enabled for the fleet.
    */
  var EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.undefined
  
  /**
    * The fleet errors.
    */
  var FleetErrors: js.UndefOr[typingsJapgolly.awsSdk.clientsAppstreamMod.FleetErrors] = js.undefined
  
  /**
    * The fleet type.  ALWAYS_ON  Provides users with instant-on access to their apps. You are charged for all running instances in your fleet, even if no users are streaming apps.  ON_DEMAND  Provide users with access to applications after they connect, which takes one to two minutes. You are charged for instance streaming when users are connected and a small hourly fee for instances that are not streaming apps.  
    */
  var FleetType: js.UndefOr[typingsJapgolly.awsSdk.clientsAppstreamMod.FleetType] = js.undefined
  
  /**
    * The ARN of the IAM role that is applied to the fleet. To assume a role, the fleet instance calls the AWS Security Token Service (STS) AssumeRole API operation and passes the ARN of the role to use. The operation creates a new session with temporary credentials. AppStream 2.0 retrieves the temporary credentials and creates the appstream_machine_role credential profile on the instance. For more information, see Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming Instances in the Amazon AppStream 2.0 Administration Guide.
    */
  var IamRoleArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The amount of time that users can be idle (inactive) before they are disconnected from their streaming session and the DisconnectTimeoutInSeconds time interval begins. Users are notified before they are disconnected due to inactivity. If users try to reconnect to the streaming session before the time interval specified in DisconnectTimeoutInSeconds elapses, they are connected to their previous session. Users are considered idle when they stop providing keyboard or mouse input during their streaming session. File uploads and downloads, audio in, audio out, and pixels changing do not qualify as user activity. If users continue to be idle after the time interval in IdleDisconnectTimeoutInSeconds elapses, they are disconnected. To prevent users from being disconnected due to inactivity, specify a value of 0. Otherwise, specify a value between 60 and 3600. The default value is 0.  If you enable this feature, we recommend that you specify a value that corresponds exactly to a whole number of minutes (for example, 60, 120, and 180). If you don't do this, the value is rounded to the nearest minute. For example, if you specify a value of 70, users are disconnected after 1 minute of inactivity. If you specify a value that is at the midpoint between two different minutes, the value is rounded up. For example, if you specify a value of 90, users are disconnected after 2 minutes of inactivity.  
    */
  var IdleDisconnectTimeoutInSeconds: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ARN for the public, private, or shared image.
    */
  var ImageArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the image used to create the fleet.
    */
  var ImageName: js.UndefOr[String] = js.undefined
  
  /**
    * The instance type to use when launching fleet instances. The following instance types are available:   stream.standard.small   stream.standard.medium   stream.standard.large   stream.compute.large   stream.compute.xlarge   stream.compute.2xlarge   stream.compute.4xlarge   stream.compute.8xlarge   stream.memory.large   stream.memory.xlarge   stream.memory.2xlarge   stream.memory.4xlarge   stream.memory.8xlarge   stream.memory.z1d.large   stream.memory.z1d.xlarge   stream.memory.z1d.2xlarge   stream.memory.z1d.3xlarge   stream.memory.z1d.6xlarge   stream.memory.z1d.12xlarge   stream.graphics-design.large   stream.graphics-design.xlarge   stream.graphics-design.2xlarge   stream.graphics-design.4xlarge   stream.graphics-desktop.2xlarge   stream.graphics.g4dn.xlarge   stream.graphics.g4dn.2xlarge   stream.graphics.g4dn.4xlarge   stream.graphics.g4dn.8xlarge   stream.graphics.g4dn.12xlarge   stream.graphics.g4dn.16xlarge   stream.graphics-pro.4xlarge   stream.graphics-pro.8xlarge   stream.graphics-pro.16xlarge  
    */
  var InstanceType: String
  
  /**
    * The maximum number of concurrent sessions for the fleet.
    */
  var MaxConcurrentSessions: js.UndefOr[Integer] = js.undefined
  
  /**
    * The maximum amount of time that a streaming session can remain active, in seconds. If users are still connected to a streaming instance five minutes before this limit is reached, they are prompted to save any open documents before being disconnected. After this time elapses, the instance is terminated and replaced by a new instance.  Specify a value between 600 and 360000.
    */
  var MaxUserDurationInSeconds: js.UndefOr[Integer] = js.undefined
  
  /**
    * The name of the fleet.
    */
  var Name: String
  
  /**
    * The platform of the fleet.
    */
  var Platform: js.UndefOr[PlatformType] = js.undefined
  
  /**
    * The S3 location of the session scripts configuration zip file. This only applies to Elastic fleets.
    */
  var SessionScriptS3Location: js.UndefOr[S3Location] = js.undefined
  
  /**
    * The current state for the fleet.
    */
  var State: FleetState
  
  /**
    * The AppStream 2.0 view that is displayed to your users when they stream from the fleet. When APP is specified, only the windows of applications opened by users display. When DESKTOP is specified, the standard desktop that is provided by the operating system displays. The default value is APP.
    */
  var StreamView: js.UndefOr[typingsJapgolly.awsSdk.clientsAppstreamMod.StreamView] = js.undefined
  
  /**
    * The USB device filter strings associated with the fleet.
    */
  var UsbDeviceFilterStrings: js.UndefOr[typingsJapgolly.awsSdk.clientsAppstreamMod.UsbDeviceFilterStrings] = js.undefined
  
  /**
    * The VPC configuration for the fleet.
    */
  var VpcConfig: js.UndefOr[typingsJapgolly.awsSdk.clientsAppstreamMod.VpcConfig] = js.undefined
}
object Fleet {
  
  inline def apply(
    Arn: Arn,
    ComputeCapacityStatus: ComputeCapacityStatus,
    InstanceType: String,
    Name: String,
    State: FleetState
  ): Fleet = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], ComputeCapacityStatus = ComputeCapacityStatus.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fleet]
  }
  
  extension [Self <: Fleet](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setComputeCapacityStatus(value: ComputeCapacityStatus): Self = StObject.set(x, "ComputeCapacityStatus", value.asInstanceOf[js.Any])
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDisconnectTimeoutInSeconds(value: Integer): Self = StObject.set(x, "DisconnectTimeoutInSeconds", value.asInstanceOf[js.Any])
    
    inline def setDisconnectTimeoutInSecondsUndefined: Self = StObject.set(x, "DisconnectTimeoutInSeconds", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setDomainJoinInfo(value: DomainJoinInfo): Self = StObject.set(x, "DomainJoinInfo", value.asInstanceOf[js.Any])
    
    inline def setDomainJoinInfoUndefined: Self = StObject.set(x, "DomainJoinInfo", js.undefined)
    
    inline def setEnableDefaultInternetAccess(value: BooleanObject): Self = StObject.set(x, "EnableDefaultInternetAccess", value.asInstanceOf[js.Any])
    
    inline def setEnableDefaultInternetAccessUndefined: Self = StObject.set(x, "EnableDefaultInternetAccess", js.undefined)
    
    inline def setFleetErrors(value: FleetErrors): Self = StObject.set(x, "FleetErrors", value.asInstanceOf[js.Any])
    
    inline def setFleetErrorsUndefined: Self = StObject.set(x, "FleetErrors", js.undefined)
    
    inline def setFleetErrorsVarargs(value: FleetError*): Self = StObject.set(x, "FleetErrors", js.Array(value*))
    
    inline def setFleetType(value: FleetType): Self = StObject.set(x, "FleetType", value.asInstanceOf[js.Any])
    
    inline def setFleetTypeUndefined: Self = StObject.set(x, "FleetType", js.undefined)
    
    inline def setIamRoleArn(value: Arn): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    inline def setIamRoleArnUndefined: Self = StObject.set(x, "IamRoleArn", js.undefined)
    
    inline def setIdleDisconnectTimeoutInSeconds(value: Integer): Self = StObject.set(x, "IdleDisconnectTimeoutInSeconds", value.asInstanceOf[js.Any])
    
    inline def setIdleDisconnectTimeoutInSecondsUndefined: Self = StObject.set(x, "IdleDisconnectTimeoutInSeconds", js.undefined)
    
    inline def setImageArn(value: Arn): Self = StObject.set(x, "ImageArn", value.asInstanceOf[js.Any])
    
    inline def setImageArnUndefined: Self = StObject.set(x, "ImageArn", js.undefined)
    
    inline def setImageName(value: String): Self = StObject.set(x, "ImageName", value.asInstanceOf[js.Any])
    
    inline def setImageNameUndefined: Self = StObject.set(x, "ImageName", js.undefined)
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrentSessions(value: Integer): Self = StObject.set(x, "MaxConcurrentSessions", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrentSessionsUndefined: Self = StObject.set(x, "MaxConcurrentSessions", js.undefined)
    
    inline def setMaxUserDurationInSeconds(value: Integer): Self = StObject.set(x, "MaxUserDurationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaxUserDurationInSecondsUndefined: Self = StObject.set(x, "MaxUserDurationInSeconds", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: PlatformType): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
    
    inline def setSessionScriptS3Location(value: S3Location): Self = StObject.set(x, "SessionScriptS3Location", value.asInstanceOf[js.Any])
    
    inline def setSessionScriptS3LocationUndefined: Self = StObject.set(x, "SessionScriptS3Location", js.undefined)
    
    inline def setState(value: FleetState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStreamView(value: StreamView): Self = StObject.set(x, "StreamView", value.asInstanceOf[js.Any])
    
    inline def setStreamViewUndefined: Self = StObject.set(x, "StreamView", js.undefined)
    
    inline def setUsbDeviceFilterStrings(value: UsbDeviceFilterStrings): Self = StObject.set(x, "UsbDeviceFilterStrings", value.asInstanceOf[js.Any])
    
    inline def setUsbDeviceFilterStringsUndefined: Self = StObject.set(x, "UsbDeviceFilterStrings", js.undefined)
    
    inline def setUsbDeviceFilterStringsVarargs(value: UsbDeviceFilterString*): Self = StObject.set(x, "UsbDeviceFilterStrings", js.Array(value*))
    
    inline def setVpcConfig(value: VpcConfig): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
