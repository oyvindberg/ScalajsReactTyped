package typingsJapgolly.maximMazurokGapiClientCloudiot.gapi.client.cloudiot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyCloudToDeviceConfigRequest extends StObject {
  
  /** Required. The configuration data for the device. */
  var binaryData: js.UndefOr[String] = js.undefined
  
  /**
    * The version number to update. If this value is zero, it will not check the version number of the server and will always update the current version; otherwise, this update will fail
    * if the version number found on the server does not match this version number. This is used to support multiple simultaneous updates without losing data.
    */
  var versionToUpdate: js.UndefOr[String] = js.undefined
}
object ModifyCloudToDeviceConfigRequest {
  
  inline def apply(): ModifyCloudToDeviceConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyCloudToDeviceConfigRequest]
  }
  
  extension [Self <: ModifyCloudToDeviceConfigRequest](x: Self) {
    
    inline def setBinaryData(value: String): Self = StObject.set(x, "binaryData", value.asInstanceOf[js.Any])
    
    inline def setBinaryDataUndefined: Self = StObject.set(x, "binaryData", js.undefined)
    
    inline def setVersionToUpdate(value: String): Self = StObject.set(x, "versionToUpdate", value.asInstanceOf[js.Any])
    
    inline def setVersionToUpdateUndefined: Self = StObject.set(x, "versionToUpdate", js.undefined)
  }
}
