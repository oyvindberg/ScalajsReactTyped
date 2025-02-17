package typingsJapgolly.weixinApp.wx

import typingsJapgolly.weixinApp.anon.Partialbubblesbooleancomp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Component实例方法
  */
@js.native
trait Component[D, P, B /* <: js.Array[(Behavior[js.Object, js.Object, js.Object]) | String] */] extends StObject {
  
  /**
    * 节点布局交叉状态API可用于监听两个或多个组件节点在布局位置上的相交状态。这一组API常常可以用于推断某些节点是否可以被用户看见、有多大比例可以被用户看见。
    * https://developers.weixin.qq.com/miniprogram/dev/api/intersection-observer.html
    */
  def createIntersectionObserver(): IntersectionObserver = js.native
  def createIntersectionObserver(options: CreateIntersectionObserverOption): IntersectionObserver = js.native
  
  /**
    * 创建一个 SelectorQuery 对象
    * 选择器选取范围为这个[组件实例](https://mp.weixin.qq.com/debug/wxadoc/dev/api/wxml-nodes-info.html)内
    */
  def createSelectorQuery(): SelectorQuery = js.native
  
  /**
    * 组件数据，包括内部数据和属性值
    */
  var data: D & UnboxBehaviorsData[B] & (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof P & weixin-app.wx.UnboxBehaviorsProps<B> ]: weixin-app.wx.PropValueType<P & weixin-app.wx.UnboxBehaviorsProps<B>[key]>} */ js.Any) = js.native
  
  /**
    * 节点dataset
    */
  var dataset: String = js.native
  
  /**
    * 获取所有这个关系对应的所有关联节点，参见 [组件间关系](https://mp.weixin.qq.com/debug/wxadoc/dev/framework/custom-component/relations.html)
    */
  def getRelationNodes(relationKey: String): js.Array[ComponentRelation[Any, Any]] = js.native
  
  /**
    * 检查组件是否具有 behavior
    * 检查时会递归检查被直接或间接引入的所有behavior
    */
  def hasBehavior(behavior: Any): Boolean = js.native
  
  /**
    * 节点id
    */
  var id: String = js.native
  
  /**
    * 组件的文件路径
    */
  var is: String = js.native
  
  /**
    * 组件数据，包括内部数据和属性值（与 data 一致）
    */
  var properties: D & UnboxBehaviorsData[B] & (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof P & weixin-app.wx.UnboxBehaviorsProps<B> ]: weixin-app.wx.PropValueType<P & weixin-app.wx.UnboxBehaviorsProps<B>[key]>} */ js.Any) = js.native
  
  /**
    * selector  使用选择器选择组件实例节点，返回匹配到的全部组件实例对象组成的数组
    */
  def selectAllComponents(selector: String): js.Array[Component[Any, Any, js.Array[Any]]] = js.native
  
  /**
    * 使用选择器选择组件实例节点
    * 返回匹配到的第一个组件实例对象
    */
  def selectComponent(selector: String): Component[Any, Any, js.Array[Any]] = js.native
  
  /**
    * 将数据从逻辑层发送到视图层，同时改变对应的 this.data 的值
    * 1. 直接修改 this.data 而不调用 this.setData 是无法改变页面的状态的，还会造成数据不一致。
    * 2. 单次设置的数据不能超过1024kB，请尽量避免一次设置过多的数据。
    * 3. 请不要把 data 中任何一项的 value 设为 undefined ，否则这一项将不被设置并可能遗留一些潜在问题
    * @param data object 以 key，value 的形式表示将 this.data 中的 key 对应的值改变成 value
    * @param [callback] callback 是一个回调函数，在这次setData对界面渲染完毕后调用
    */
  def setData(
    data: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof D ]:? string | number | boolean | symbol | object | null | std.Array<any>} */ js.Any
  ): Unit = js.native
  def setData(
    data: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof D ]:? string | number | boolean | symbol | object | null | std.Array<any>} */ js.Any,
    callback: js.Function0[Unit]
  ): Unit = js.native
  
  /**
    * 触发事件，参见 [组件事件](https://mp.weixin.qq.com/debug/wxadoc/dev/framework/custom-component/events.html)
    */
  def triggerEvent(name: String): Unit = js.native
  def triggerEvent(name: String, details: Any): Unit = js.native
  def triggerEvent(name: String, details: Any, options: Partialbubblesbooleancomp): Unit = js.native
  def triggerEvent(name: String, details: Unit, options: Partialbubblesbooleancomp): Unit = js.native
}
