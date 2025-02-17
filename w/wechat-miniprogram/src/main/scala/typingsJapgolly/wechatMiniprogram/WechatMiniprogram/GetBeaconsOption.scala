package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBeaconsOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[GetBeaconsCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[GetBeaconsFailCallback] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[GetBeaconsSuccessCallback] = js.undefined
}
object GetBeaconsOption {
  
  inline def apply(): GetBeaconsOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBeaconsOption]
  }
  
  extension [Self <: GetBeaconsOption](x: Self) {
    
    inline def setComplete(value: /* res */ IBeaconError => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ IBeaconError) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ IBeaconError => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ IBeaconError) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* result */ GetBeaconsSuccessCallbackResult => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* result */ GetBeaconsSuccessCallbackResult) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
