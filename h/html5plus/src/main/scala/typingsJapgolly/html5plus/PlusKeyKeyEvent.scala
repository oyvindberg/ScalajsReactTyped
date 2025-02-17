package typingsJapgolly.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 按键事件
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
  */
trait PlusKeyKeyEvent extends StObject {
  
  /**
    * 触发按键事件的键值
    * 键值由各系统平台定义，一些特殊按键在不同的设备上可能存在差异。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var keyCode: js.UndefOr[Double] = js.undefined
  
  /**
    * 按键事件类型
    * 用于表明触发此按键事件的类型，值为KeyType中定义的值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var keyType: js.UndefOr[PlusKeyKeyType] = js.undefined
}
object PlusKeyKeyEvent {
  
  inline def apply(): PlusKeyKeyEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusKeyKeyEvent]
  }
  
  extension [Self <: PlusKeyKeyEvent](x: Self) {
    
    inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
    
    inline def setKeyCodeUndefined: Self = StObject.set(x, "keyCode", js.undefined)
    
    inline def setKeyType(value: PlusKeyKeyType): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
    
    inline def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
  }
}
