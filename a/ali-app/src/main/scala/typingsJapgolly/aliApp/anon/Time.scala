package typingsJapgolly.aliApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Time extends StObject {
  
  /** 服务器时间的毫秒数 */
  var time: Double
}
object Time {
  
  inline def apply(time: Double): Time = {
    val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Time]
  }
  
  extension [Self <: Time](x: Self) {
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
