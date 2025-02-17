package typingsJapgolly.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 文件路径类型
  * 在文件系统中的文件路径需转换成URL格式，已方便runtime快速加载。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
  */
trait PlusIoURLType extends StObject {
  
  /**
    * 本地路径URL
    * 可在html页面中直接访问本地资源，以“file:///”开头，后面跟随系统的绝对路径。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var LocalURL: js.UndefOr[PlusIoLocalURL] = js.undefined
  
  /**
    * 相对路径URL
    * 只能在扩展API中使用，相对于基座提供的特定目录，以“_”开头。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var RelativeURL: js.UndefOr[PlusIoRelativeURL] = js.undefined
  
  /**
    * 网络路径URL
    * 可在html页面中以网络资源模式访问本地资源，以“http://”开头，后面跟随相对路径。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var RomoteURL: js.UndefOr[String] = js.undefined
}
object PlusIoURLType {
  
  inline def apply(): PlusIoURLType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusIoURLType]
  }
  
  extension [Self <: PlusIoURLType](x: Self) {
    
    inline def setLocalURL(value: PlusIoLocalURL): Self = StObject.set(x, "LocalURL", value.asInstanceOf[js.Any])
    
    inline def setLocalURLUndefined: Self = StObject.set(x, "LocalURL", js.undefined)
    
    inline def setRelativeURL(value: PlusIoRelativeURL): Self = StObject.set(x, "RelativeURL", value.asInstanceOf[js.Any])
    
    inline def setRelativeURLUndefined: Self = StObject.set(x, "RelativeURL", js.undefined)
    
    inline def setRomoteURL(value: String): Self = StObject.set(x, "RomoteURL", value.asInstanceOf[js.Any])
    
    inline def setRomoteURLUndefined: Self = StObject.set(x, "RomoteURL", js.undefined)
  }
}
