package typingsJapgolly.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVPCEConfigurationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the VPC endpoint configuration you want to update.
    */
  var arn: AmazonResourceName
  
  /**
    * The DNS (domain) name used to connect to your private service in your VPC. The DNS name must not already be in use on the internet.
    */
  var serviceDnsName: js.UndefOr[ServiceDnsName] = js.undefined
  
  /**
    * An optional description that provides details about your VPC endpoint configuration.
    */
  var vpceConfigurationDescription: js.UndefOr[VPCEConfigurationDescription] = js.undefined
  
  /**
    * The friendly name you give to your VPC endpoint configuration to manage your configurations more easily.
    */
  var vpceConfigurationName: js.UndefOr[VPCEConfigurationName] = js.undefined
  
  /**
    * The name of the VPC endpoint service running in your AWS account that you want Device Farm to test.
    */
  var vpceServiceName: js.UndefOr[VPCEServiceName] = js.undefined
}
object UpdateVPCEConfigurationRequest {
  
  inline def apply(arn: AmazonResourceName): UpdateVPCEConfigurationRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVPCEConfigurationRequest]
  }
  
  extension [Self <: UpdateVPCEConfigurationRequest](x: Self) {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setServiceDnsName(value: ServiceDnsName): Self = StObject.set(x, "serviceDnsName", value.asInstanceOf[js.Any])
    
    inline def setServiceDnsNameUndefined: Self = StObject.set(x, "serviceDnsName", js.undefined)
    
    inline def setVpceConfigurationDescription(value: VPCEConfigurationDescription): Self = StObject.set(x, "vpceConfigurationDescription", value.asInstanceOf[js.Any])
    
    inline def setVpceConfigurationDescriptionUndefined: Self = StObject.set(x, "vpceConfigurationDescription", js.undefined)
    
    inline def setVpceConfigurationName(value: VPCEConfigurationName): Self = StObject.set(x, "vpceConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setVpceConfigurationNameUndefined: Self = StObject.set(x, "vpceConfigurationName", js.undefined)
    
    inline def setVpceServiceName(value: VPCEServiceName): Self = StObject.set(x, "vpceServiceName", value.asInstanceOf[js.Any])
    
    inline def setVpceServiceNameUndefined: Self = StObject.set(x, "vpceServiceName", js.undefined)
  }
}
