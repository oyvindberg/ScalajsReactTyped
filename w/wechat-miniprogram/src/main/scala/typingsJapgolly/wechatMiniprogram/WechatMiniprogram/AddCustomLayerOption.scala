package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddCustomLayerOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[AddCustomLayerCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[AddCustomLayerFailCallback] = js.undefined
  
  /** 个性化图层id */
  var layerId: String
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[AddCustomLayerSuccessCallback] = js.undefined
}
object AddCustomLayerOption {
  
  inline def apply(layerId: String): AddCustomLayerOption = {
    val __obj = js.Dynamic.literal(layerId = layerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCustomLayerOption]
  }
  
  extension [Self <: AddCustomLayerOption](x: Self) {
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setLayerId(value: String): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
