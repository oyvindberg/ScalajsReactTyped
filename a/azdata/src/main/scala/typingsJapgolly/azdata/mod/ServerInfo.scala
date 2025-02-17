package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerInfo extends StObject {
  
  /**
    * The version of Azure that the instance is running on, if applicable.
    */
  var azureVersion: Double
  
  /**
    * The CPU count of the host running the server.
    */
  var cpuCount: js.UndefOr[Double] = js.undefined
  
  /**
    * The ID of the engine edition of the instance.
    */
  var engineEditionId: Double
  
  /**
    * Whether the instance is running in the cloud (Azure) or not.
    */
  var isCloud: Boolean
  
  /**
    * options for all new server properties.
    */
  var options: StringDictionary[Any]
  
  /**
    * The Operating System version string of the machine running the instance.
    */
  var osVersion: String
  
  /**
    * The physical memory of the host running the server.
    */
  var physicalMemoryInMb: js.UndefOr[Double] = js.undefined
  
  /**
    * The edition of the instance.
    */
  var serverEdition: String
  
  /**
    * String describing the product level of the server.
    */
  var serverLevel: String
  
  /**
    * The major version of the instance.
    */
  var serverMajorVersion: js.UndefOr[Double] = js.undefined
  
  /**
    * The minor version of the instance.
    */
  var serverMinorVersion: js.UndefOr[Double] = js.undefined
  
  /**
    * The build of the instance.
    */
  var serverReleaseVersion: Double
  
  /**
    * String containing the full server version text.
    */
  var serverVersion: String
}
object ServerInfo {
  
  inline def apply(
    azureVersion: Double,
    engineEditionId: Double,
    isCloud: Boolean,
    options: StringDictionary[Any],
    osVersion: String,
    serverEdition: String,
    serverLevel: String,
    serverReleaseVersion: Double,
    serverVersion: String
  ): ServerInfo = {
    val __obj = js.Dynamic.literal(azureVersion = azureVersion.asInstanceOf[js.Any], engineEditionId = engineEditionId.asInstanceOf[js.Any], isCloud = isCloud.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], osVersion = osVersion.asInstanceOf[js.Any], serverEdition = serverEdition.asInstanceOf[js.Any], serverLevel = serverLevel.asInstanceOf[js.Any], serverReleaseVersion = serverReleaseVersion.asInstanceOf[js.Any], serverVersion = serverVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerInfo]
  }
  
  extension [Self <: ServerInfo](x: Self) {
    
    inline def setAzureVersion(value: Double): Self = StObject.set(x, "azureVersion", value.asInstanceOf[js.Any])
    
    inline def setCpuCount(value: Double): Self = StObject.set(x, "cpuCount", value.asInstanceOf[js.Any])
    
    inline def setCpuCountUndefined: Self = StObject.set(x, "cpuCount", js.undefined)
    
    inline def setEngineEditionId(value: Double): Self = StObject.set(x, "engineEditionId", value.asInstanceOf[js.Any])
    
    inline def setIsCloud(value: Boolean): Self = StObject.set(x, "isCloud", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: StringDictionary[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOsVersion(value: String): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    inline def setPhysicalMemoryInMb(value: Double): Self = StObject.set(x, "physicalMemoryInMb", value.asInstanceOf[js.Any])
    
    inline def setPhysicalMemoryInMbUndefined: Self = StObject.set(x, "physicalMemoryInMb", js.undefined)
    
    inline def setServerEdition(value: String): Self = StObject.set(x, "serverEdition", value.asInstanceOf[js.Any])
    
    inline def setServerLevel(value: String): Self = StObject.set(x, "serverLevel", value.asInstanceOf[js.Any])
    
    inline def setServerMajorVersion(value: Double): Self = StObject.set(x, "serverMajorVersion", value.asInstanceOf[js.Any])
    
    inline def setServerMajorVersionUndefined: Self = StObject.set(x, "serverMajorVersion", js.undefined)
    
    inline def setServerMinorVersion(value: Double): Self = StObject.set(x, "serverMinorVersion", value.asInstanceOf[js.Any])
    
    inline def setServerMinorVersionUndefined: Self = StObject.set(x, "serverMinorVersion", js.undefined)
    
    inline def setServerReleaseVersion(value: Double): Self = StObject.set(x, "serverReleaseVersion", value.asInstanceOf[js.Any])
    
    inline def setServerVersion(value: String): Self = StObject.set(x, "serverVersion", value.asInstanceOf[js.Any])
  }
}
