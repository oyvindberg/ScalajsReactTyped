package typingsJapgolly.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeNumber extends StObject {
  
  /**
    * 状态码
    *
    * - `1001` 已经连接推流服务器
    * - `1002` 已经与服务器握手完毕,开始推流
    * - `1003` 打开摄像头成功
    * - `1004` 录屏启动成功
    * - `1005` 推流动态调整分辨率
    * - `1006` 推流动态调整码率
    * - `1007` 首帧画面采集完成
    * - `1008` 编码器启动
    * - `-1301` 打开摄像头失败
    * - `-1302` 打开麦克风失败
    * - `-1303` 视频编码失败
    * - `-1304` 音频编码失败
    * - `-1305` 不支持的视频分辨率
    * - `-1306` 不支持的音频采样率
    * - `-1307` 网络断连，且经多次重连抢救无效，更多重试请自行重启推流
    * - `-1308` 开始录屏失败，可能是被用户拒绝
    * - `-1309` 录屏失败，不支持的Android系统版本，需要5.0以上的系统
    * - `-1310` 录屏被其他应用打断了
    * - `-1311` Android Mic打开成功，但是录不到音频数据
    * - `-1312` 录屏动态切横竖屏失败
    * - `1101` 网络状况不佳: 上行带宽太小，上传数据受阻
    * - `1102` 网络断连, 已启动自动重连
    * - `1103` 硬编码启动失败,采用软编码
    * - `1104` 视频编码失败
    * - `1105` 新美颜软编码启动失败，采用老的软编码
    * - `1106` 新美颜软编码启动失败，采用老的软编码
    * - `3001` RTMP -DNS解析失败
    * - `3002` RTMP服务器连接失败
    * - `3003` RTMP服务器握手失败
    * - `3004` RTMP服务器主动断开，请检查推流地址的合法性或防盗链有效期
    * - `3005` RTMP 读/写失败
    */
  var code: Double
}
object CodeNumber {
  
  inline def apply(code: Double): CodeNumber = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeNumber]
  }
  
  extension [Self <: CodeNumber](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
