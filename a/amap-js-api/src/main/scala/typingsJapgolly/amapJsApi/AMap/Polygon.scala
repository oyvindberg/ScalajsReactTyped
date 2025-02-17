package typingsJapgolly.amapJsApi.AMap

import typingsJapgolly.amapJsApi.AMap.Polygon.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Polygon[ExtraData]
  extends StObject
     with PathOverlay[ExtraData] {
  
  /**
    * 判断指定点坐标是否在多边形范围内
    * @param point 坐标
    */
  def contains(point: LocationValue): Boolean = js.native
  
  /**
    * 获取多边形的面积
    */
  def getArea(): Double = js.native
  
  /**
    * 获取多边形轮廓线节点数组
    */
  def getPath(): js.Array[js.Array[LngLat] | LngLat] = js.native
  
  /**
    * 修改多边形属性
    * @param options 属性
    */
  def setOptions(options: Options[ExtraData]): Unit = js.native
  
  /**
    * 设置多边形轮廓线节点数组
    * @param path 轮廓线节点
    */
  def setPath(path: js.Array[js.Array[LocationValue] | LocationValue]): Unit = js.native
}
object Polygon {
  
  type EventMap[I] = typingsJapgolly.amapJsApi.AMap.PathOverlay.EventMap[I]
  
  trait GetOptionsResult[ExtraData]
    extends StObject
       with typingsJapgolly.amapJsApi.AMap.ShapeOverlay.GetOptionsResult[ExtraData] {
    
    /**
      * 多边形填充颜色
      */
    var fillColor: String
    
    /**
      * 边形填充透明度
      */
    var fillOpacity: Double
    
    /**
      * 折线拐点的绘制样式
      */
    var lineJoin: StrokeLineJoin
    
    /**
      * 多边形轮廓线的节点坐标数组
      */
    var path: js.Array[js.Array[LngLat] | LngLat]
    
    var texture: String
  }
  object GetOptionsResult {
    
    inline def apply[ExtraData](
      bubble: Boolean,
      clickable: Boolean,
      extData: ExtraData | js.Object,
      fillColor: String,
      fillOpacity: Double,
      lineJoin: StrokeLineJoin,
      map: Map,
      path: js.Array[js.Array[LngLat] | LngLat],
      strokeColor: String,
      strokeDasharray: js.Array[Double],
      strokeOpacity: Double,
      strokeStyle: StrokeStyle,
      strokeWeight: Double,
      texture: String,
      zIndex: Double
    ): GetOptionsResult[ExtraData] = {
      val __obj = js.Dynamic.literal(bubble = bubble.asInstanceOf[js.Any], clickable = clickable.asInstanceOf[js.Any], extData = extData.asInstanceOf[js.Any], fillColor = fillColor.asInstanceOf[js.Any], fillOpacity = fillOpacity.asInstanceOf[js.Any], lineJoin = lineJoin.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], strokeColor = strokeColor.asInstanceOf[js.Any], strokeDasharray = strokeDasharray.asInstanceOf[js.Any], strokeOpacity = strokeOpacity.asInstanceOf[js.Any], strokeStyle = strokeStyle.asInstanceOf[js.Any], strokeWeight = strokeWeight.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOptionsResult[ExtraData]]
    }
    
    extension [Self <: GetOptionsResult[?], ExtraData](x: Self & GetOptionsResult[ExtraData]) {
      
      inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setLineJoin(value: StrokeLineJoin): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
      
      inline def setPath(value: js.Array[js.Array[LngLat] | LngLat]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: (js.Array[LngLat] | LngLat)*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setTexture(value: String): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options[ExtraData]
    extends StObject
       with typingsJapgolly.amapJsApi.AMap.PathOverlay.Options[ExtraData] {
    
    /**
      * 多边形填充颜色
      */
    var fillColor: js.UndefOr[String] = js.undefined
    
    /**
      * 边形填充透明度
      */
    var fillOpacity: js.UndefOr[Double] = js.undefined
    
    /**
      * 多边形轮廓线的节点坐标数组
      */
    var path: js.UndefOr[js.Array[js.Array[LocationValue] | LocationValue]] = js.undefined
  }
  object Options {
    
    inline def apply[ExtraData](): Options[ExtraData] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[ExtraData]]
    }
    
    extension [Self <: Options[?], ExtraData](x: Self & Options[ExtraData]) {
      
      inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setPath(value: js.Array[js.Array[LocationValue] | LocationValue]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: (js.Array[LocationValue] | LocationValue)*): Self = StObject.set(x, "path", js.Array(value*))
    }
  }
}
