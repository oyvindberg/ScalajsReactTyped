package typingsJapgolly.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadFileFailCallbackResult extends StObject {
  
  /** 错误信息
    *
    * 可选值：
    * - 'fail no such file or directory, open ${filePath}': 指定的 filePath 所在目录不存在;
    * - 'fail permission denied, open ${dirPath}': 指定的 filePath 路径没有读权限; */
  var errMsg: String
}
object ReadFileFailCallbackResult {
  
  inline def apply(errMsg: String): ReadFileFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadFileFailCallbackResult]
  }
  
  extension [Self <: ReadFileFailCallbackResult](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
