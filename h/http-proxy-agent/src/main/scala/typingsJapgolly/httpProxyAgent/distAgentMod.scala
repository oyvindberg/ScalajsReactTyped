package typingsJapgolly.httpProxyAgent

import typingsJapgolly.agentBase.mod.Agent
import typingsJapgolly.agentBase.mod.ClientRequest
import typingsJapgolly.agentBase.mod.RequestOptions
import typingsJapgolly.httpProxyAgent.anon.Data
import typingsJapgolly.httpProxyAgent.mod.HttpProxyAgentOptions
import typingsJapgolly.node.netMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAgentMod {
  
  @JSImport("http-proxy-agent/dist/agent", JSImport.Default)
  @js.native
  open class default protected () extends HttpProxyAgent {
    def this(_opts: String) = this()
    def this(_opts: HttpProxyAgentOptions) = this()
  }
  
  @js.native
  trait HttpProxyAgent extends Agent {
    
    /**
      * Called when the node-core HTTP client library is creating a
      * new HTTP request.
      *
      * @api protected
      */
    def callback(req: HttpProxyAgentClientRequest, opts: RequestOptions): js.Promise[Socket] = js.native
    
    /* private */ var proxy: Any = js.native
    
    /* private */ var secureProxy: Any = js.native
  }
  
  @js.native
  trait HttpProxyAgentClientRequest extends ClientRequest {
    
    var _header: js.UndefOr[String | Null] = js.native
    
    def _implicitHeader(): Unit = js.native
    
    var output: js.UndefOr[js.Array[String]] = js.native
    
    var outputData: js.UndefOr[js.Array[Data]] = js.native
  }
}
