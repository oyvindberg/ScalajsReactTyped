package typingsJapgolly.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Java类对象
  * Java类对象，可通过其属性获取类的常量，可通过方法来操作类的静态变量和方法，也通过new方法来创建类的实例对象。
  *     对于类的常量，则直接通过.后面跟随常量名称调用即可。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/android.html](http://www.html5plus.org/doc/zh_cn/android.html)
  */
@js.native
trait PlusAndroidClassObject extends StObject {
  
  /**
    * 获取Java类对象的静态属性
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/android.html](http://www.html5plus.org/doc/zh_cn/android.html)
    */
  def plusGetAttribute(): Any = js.native
  def plusGetAttribute(name: String): Any = js.native
  
  /**
    * 设置Java类对象的静态属性
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/android.html](http://www.html5plus.org/doc/zh_cn/android.html)
    */
  def plusSetAttribute(): Unit = js.native
  def plusSetAttribute(name: String): Unit = js.native
  def plusSetAttribute(name: String, value: Any): Unit = js.native
  def plusSetAttribute(name: Unit, value: Any): Unit = js.native
}
