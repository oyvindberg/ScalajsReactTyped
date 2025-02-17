package typingsJapgolly.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief tcp 服务器对象，可方便创建一个标准多纤程 tcp 服务器
  * @detail 使用 TcpServer 对象可以迅速创建一个多纤程并发处理的 tcp 服务器。,```JavaScript,function func(conn),{,    var data;,,    while(data = conn.read()),        conn.write(data);,,    conn.close();,},,new net.TcpServer(8080, func).run();,```
  */
@js.native
trait ClassTcpServer
  extends StObject
     with ClassObject {
  
  /**
    * 
    * @brief 异步运行服务器并开始接收和分发连接，调用后立即返回，服务器在后台运行
    * 
    * 
    */
  def asyncRun(): Unit = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 服务器当前事件处理接口对象
    * 
    * 
    * @type Handler
    */
  var handler: ClassHandler = js.native
  
  /**
    * 
    * @brief 运行服务器并开始接收和分发连接，此函数不会返回
    * 
    * @async
    */
  def run(): Unit = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 服务器当前侦听的 Socket 对象
    * 
    * @readonly
    * @type Socket
    */
  var socket: ClassSocket = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询当前服务器运行状态
    * 
    * 返回的结果为一个 Stats 对象，初始化计数器如下：
    * ```JavaScript
    * {
    * total : 1000,      // 总计处理的连接
    * connections : 100, // 当前正在处理的连接
    * accept : 10,       // 上次查询后新建的连接
    * close : 10         // 上次查询后关闭的连接
    * }
    * ```
    * 
    * 
    * @readonly
    * @type Stats
    */
  var stats: ClassStats = js.native
  
  /**
    * 
    * @brief 关闭 socket中止正在运行的服务器
    * 
    * @async
    */
  def stop(): Unit = js.native
}
