package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenameOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[RenameCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[RenameFailCallback] = js.undefined
  
  /** 新文件路径 */
  var newPath: String
  
  /** 源文件路径，可以是普通文件或目录 */
  var oldPath: String
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[RenameSuccessCallback] = js.undefined
}
object RenameOption {
  
  inline def apply(newPath: String, oldPath: String): RenameOption = {
    val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameOption]
  }
  
  extension [Self <: RenameOption](x: Self) {
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* result */ RenameFailCallbackResult => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* result */ RenameFailCallbackResult) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setNewPath(value: String): Self = StObject.set(x, "newPath", value.asInstanceOf[js.Any])
    
    inline def setOldPath(value: String): Self = StObject.set(x, "oldPath", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
