package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ImageData 对象
  *
  * 最低基础库： `2.9.0` */
trait ImageData extends StObject {
  
  /** 一维数组，包含以 RGBA 顺序的数据，数据使用 0 至 255（包含）的整数表示 */
  var data: js.typedarray.Uint8ClampedArray
  
  /** 使用像素描述 ImageData 的实际高度 */
  var height: Double
  
  /** 使用像素描述 ImageData 的实际宽度 */
  var width: Double
}
object ImageData {
  
  inline def apply(data: js.typedarray.Uint8ClampedArray, height: Double, width: Double): ImageData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageData]
  }
  
  extension [Self <: ImageData](x: Self) {
    
    inline def setData(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
