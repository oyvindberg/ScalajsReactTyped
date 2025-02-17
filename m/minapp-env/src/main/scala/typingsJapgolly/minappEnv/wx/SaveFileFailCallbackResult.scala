package typingsJapgolly.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveFileFailCallbackResult extends StObject {
  
  /** 错误信息
    *
    * 可选值：
    * - 'fail tempFilePath file not exist': 指定的 tempFilePath 找不到文件;
    * - 'fail permission denied, open "${filePath}"': 指定的 filePath 路径没有写权限;
    * - 'fail no such file or directory "${dirPath}"': 上级目录不存在; */
  var errMsg: String
}
object SaveFileFailCallbackResult {
  
  inline def apply(errMsg: String): SaveFileFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveFileFailCallbackResult]
  }
  
  extension [Self <: SaveFileFailCallbackResult](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
