package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 触摸事件 */
trait Touch[Detail /* <: IAnyObject */, T /* <: TouchDetail | TouchCanvasDetail */, Mark /* <: IAnyObject */, CurrentTargetDataset /* <: IAnyObject */, TargetDataset /* <: IAnyObject */]
  extends StObject
     with CustomEvent[Detail, Mark, CurrentTargetDataset, TargetDataset] {
  
  /** 触摸事件，当前变化的触摸点信息的数组 */
  var changedTouches: js.Array[T]
  
  /** 触摸事件，当前停留在屏幕中的触摸点信息的数组 */
  var touches: js.Array[T]
}
object Touch {
  
  inline def apply[Detail /* <: IAnyObject */, T /* <: TouchDetail | TouchCanvasDetail */, Mark /* <: IAnyObject */, CurrentTargetDataset /* <: IAnyObject */, TargetDataset /* <: IAnyObject */](
    changedTouches: js.Array[T],
    currentTarget: Target[CurrentTargetDataset],
    detail: Detail,
    target: Target[TargetDataset],
    timeStamp: Double,
    touches: js.Array[T],
    `type`: String
  ): Touch[Detail, T, Mark, CurrentTargetDataset, TargetDataset] = {
    val __obj = js.Dynamic.literal(changedTouches = changedTouches.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Touch[Detail, T, Mark, CurrentTargetDataset, TargetDataset]]
  }
  
  extension [Self <: Touch[?, ?, ?, ?, ?], Detail /* <: IAnyObject */, T /* <: TouchDetail | TouchCanvasDetail */, Mark /* <: IAnyObject */, CurrentTargetDataset /* <: IAnyObject */, TargetDataset /* <: IAnyObject */](x: Self & (Touch[Detail, T, Mark, CurrentTargetDataset, TargetDataset])) {
    
    inline def setChangedTouches(value: js.Array[T]): Self = StObject.set(x, "changedTouches", value.asInstanceOf[js.Any])
    
    inline def setChangedTouchesVarargs(value: T*): Self = StObject.set(x, "changedTouches", js.Array(value*))
    
    inline def setTouches(value: js.Array[T]): Self = StObject.set(x, "touches", value.asInstanceOf[js.Any])
    
    inline def setTouchesVarargs(value: T*): Self = StObject.set(x, "touches", js.Array(value*))
  }
}
