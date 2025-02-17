package typingsJapgolly.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDevicePoolRequest extends StObject {
  
  /**
    * The device pool's description.
    */
  var description: js.UndefOr[Message] = js.undefined
  
  /**
    * The number of devices that Device Farm can add to your device pool. Device Farm adds devices that are available and meet the criteria that you assign for the rules parameter. Depending on how many devices meet these constraints, your device pool might contain fewer devices than the value for this parameter. By specifying the maximum number of devices, you can control the costs that you incur by running tests.
    */
  var maxDevices: js.UndefOr[Integer] = js.undefined
  
  /**
    * The device pool's name.
    */
  var name: Name
  
  /**
    * The ARN of the project for the device pool.
    */
  var projectArn: AmazonResourceName
  
  /**
    * The device pool's rules.
    */
  var rules: Rules
}
object CreateDevicePoolRequest {
  
  inline def apply(name: Name, projectArn: AmazonResourceName, rules: Rules): CreateDevicePoolRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], projectArn = projectArn.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDevicePoolRequest]
  }
  
  extension [Self <: CreateDevicePoolRequest](x: Self) {
    
    inline def setDescription(value: Message): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setMaxDevices(value: Integer): Self = StObject.set(x, "maxDevices", value.asInstanceOf[js.Any])
    
    inline def setMaxDevicesUndefined: Self = StObject.set(x, "maxDevices", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProjectArn(value: AmazonResourceName): Self = StObject.set(x, "projectArn", value.asInstanceOf[js.Any])
    
    inline def setRules(value: Rules): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value*))
  }
}
