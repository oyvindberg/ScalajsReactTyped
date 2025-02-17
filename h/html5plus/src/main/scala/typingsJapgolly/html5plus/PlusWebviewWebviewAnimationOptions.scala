package typingsJapgolly.html5plus

import typingsJapgolly.html5plus.html5plusStrings.close
import typingsJapgolly.html5plus.html5plusStrings.hide
import typingsJapgolly.html5plus.html5plusStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Webview窗口动画参数
  * 用于指定动画目标窗口，起始位置、目标位置等信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewWebviewAnimationOptions extends StObject {
  
  /**
    * 窗口动画完成后的行为
    * 可取值：
    *     "none" - 动画完成后不做任何操作；
    *     "hide" - 动画完成后隐藏窗口；
    *     "close" - 动画完成后关闭窗口。
    *     默认值为"none"。
    * - none: 动画完成后不做任何操作
    * - hide: 动画完成后隐藏窗口
    * - close: 动画完成后关闭窗口
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var action: js.UndefOr[none | hide | close] = js.undefined
  
  /**
    * 动画样式
    * 用于指定动画窗口的起始位置，目标位置等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var styles: js.UndefOr[PlusWebviewWebviewAnimationStyles] = js.undefined
  
  /**
    * 执行动画的窗口对象
    * 可取值Webview窗口对象、Webview窗口的id（String类型）、原生View窗口对象（plus.nativeObj.View）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var view: js.UndefOr[PlusWebviewWebviewObject] = js.undefined
}
object PlusWebviewWebviewAnimationOptions {
  
  inline def apply(): PlusWebviewWebviewAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewAnimationOptions]
  }
  
  extension [Self <: PlusWebviewWebviewAnimationOptions](x: Self) {
    
    inline def setAction(value: none | hide | close): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setStyles(value: PlusWebviewWebviewAnimationStyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setView(value: PlusWebviewWebviewObject): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
