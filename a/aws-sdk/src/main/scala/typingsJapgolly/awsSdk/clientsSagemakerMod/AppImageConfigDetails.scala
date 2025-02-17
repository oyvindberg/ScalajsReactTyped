package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppImageConfigDetails extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the AppImageConfig.
    */
  var AppImageConfigArn: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.AppImageConfigArn] = js.undefined
  
  /**
    * The name of the AppImageConfig. Must be unique to your account.
    */
  var AppImageConfigName: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.AppImageConfigName] = js.undefined
  
  /**
    * When the AppImageConfig was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The configuration for the file system and kernels in the SageMaker image.
    */
  var KernelGatewayImageConfig: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.KernelGatewayImageConfig] = js.undefined
  
  /**
    * When the AppImageConfig was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
}
object AppImageConfigDetails {
  
  inline def apply(): AppImageConfigDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppImageConfigDetails]
  }
  
  extension [Self <: AppImageConfigDetails](x: Self) {
    
    inline def setAppImageConfigArn(value: AppImageConfigArn): Self = StObject.set(x, "AppImageConfigArn", value.asInstanceOf[js.Any])
    
    inline def setAppImageConfigArnUndefined: Self = StObject.set(x, "AppImageConfigArn", js.undefined)
    
    inline def setAppImageConfigName(value: AppImageConfigName): Self = StObject.set(x, "AppImageConfigName", value.asInstanceOf[js.Any])
    
    inline def setAppImageConfigNameUndefined: Self = StObject.set(x, "AppImageConfigName", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setKernelGatewayImageConfig(value: KernelGatewayImageConfig): Self = StObject.set(x, "KernelGatewayImageConfig", value.asInstanceOf[js.Any])
    
    inline def setKernelGatewayImageConfigUndefined: Self = StObject.set(x, "KernelGatewayImageConfig", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
  }
}
