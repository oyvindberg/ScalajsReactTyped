package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import typingsJapgolly.uniApp.uniAppStrings.high
import typingsJapgolly.uniApp.uniAppStrings.low
import typingsJapgolly.uniApp.uniAppStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CameraContextTakePhotoOptions extends StObject {
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 成像质量，值为high, normal, low，默认normal
    * - normal: 普通质量
    * - high: 高质量
    * - low: 低质量
    */
  var quality: js.UndefOr[normal | high | low] = js.undefined
  
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ CameraContextTakePhotoResult, Unit]] = js.undefined
}
object CameraContextTakePhotoOptions {
  
  inline def apply(): CameraContextTakePhotoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraContextTakePhotoOptions]
  }
  
  extension [Self <: CameraContextTakePhotoOptions](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: Callback): Self = StObject.set(x, "fail", value.toJsFn)
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setQuality(value: normal | high | low): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setSuccess(value: /* result */ CameraContextTakePhotoResult => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* result */ CameraContextTakePhotoResult) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
