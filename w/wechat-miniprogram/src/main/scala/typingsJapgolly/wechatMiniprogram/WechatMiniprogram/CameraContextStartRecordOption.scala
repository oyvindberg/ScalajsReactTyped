package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CameraContextStartRecordOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[StartRecordCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[StartRecordFailCallback] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[CameraContextStartRecordSuccessCallback] = js.undefined
  
  /** 超过30s或页面 `onHide` 时会结束录像 */
  var timeoutCallback: js.UndefOr[StartRecordTimeoutCallback] = js.undefined
}
object CameraContextStartRecordOption {
  
  inline def apply(): CameraContextStartRecordOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraContextStartRecordOption]
  }
  
  extension [Self <: CameraContextStartRecordOption](x: Self) {
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTimeoutCallback(value: /* result */ StartRecordTimeoutCallbackResult => Callback): Self = StObject.set(x, "timeoutCallback", js.Any.fromFunction1((t0: /* result */ StartRecordTimeoutCallbackResult) => value(t0).runNow()))
    
    inline def setTimeoutCallbackUndefined: Self = StObject.set(x, "timeoutCallback", js.undefined)
  }
}
