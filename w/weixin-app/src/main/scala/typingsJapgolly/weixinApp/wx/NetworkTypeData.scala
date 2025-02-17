package typingsJapgolly.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkTypeData extends StObject {
  
  /** 返回网络类型2g，3g，4g，wifi */
  var networkType: typingsJapgolly.weixinApp.wx.networkType
}
object NetworkTypeData {
  
  inline def apply(networkType: networkType): NetworkTypeData = {
    val __obj = js.Dynamic.literal(networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkTypeData]
  }
  
  extension [Self <: NetworkTypeData](x: Self) {
    
    inline def setNetworkType(value: networkType): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
  }
}
