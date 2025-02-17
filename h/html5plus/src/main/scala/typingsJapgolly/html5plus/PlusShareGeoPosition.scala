package typingsJapgolly.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，用户位置信息
  * GeoPosition对象用于表示用户分享消息时的位置信息。用于标识分享操作时用户的位置信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
  */
trait PlusShareGeoPosition extends StObject {
  
  /**
    * 用户位置的纬度坐标信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var latitude: js.UndefOr[Double] = js.undefined
  
  /**
    * 用户位置的经度坐标信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var longitude: js.UndefOr[Double] = js.undefined
}
object PlusShareGeoPosition {
  
  inline def apply(): PlusShareGeoPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusShareGeoPosition]
  }
  
  extension [Self <: PlusShareGeoPosition](x: Self) {
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
  }
}
