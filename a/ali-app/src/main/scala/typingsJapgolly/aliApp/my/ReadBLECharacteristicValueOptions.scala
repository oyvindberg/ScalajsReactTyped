package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.anon.characteristiccharacteris
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadBLECharacteristicValueOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /**
    * 蓝牙特征值的 uuid
    */
  var characteristicId: String
  
  /**
    * 蓝牙设备 id，参考 device 对象
    */
  var deviceId: String
  
  /**
    * 蓝牙特征值对应服务的 uuid
    */
  var serviceId: String
  
  @JSName("success")
  def success_MReadBLECharacteristicValueOptions(res: characteristiccharacteris): Unit
}
object ReadBLECharacteristicValueOptions {
  
  inline def apply(
    characteristicId: String,
    deviceId: String,
    serviceId: String,
    success: characteristiccharacteris => Callback
  ): ReadBLECharacteristicValueOptions = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], success = js.Any.fromFunction1((t0: characteristiccharacteris) => success(t0).runNow()))
    __obj.asInstanceOf[ReadBLECharacteristicValueOptions]
  }
  
  extension [Self <: ReadBLECharacteristicValueOptions](x: Self) {
    
    inline def setCharacteristicId(value: String): Self = StObject.set(x, "characteristicId", value.asInstanceOf[js.Any])
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: characteristiccharacteris => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: characteristiccharacteris) => value(t0).runNow()))
  }
}
