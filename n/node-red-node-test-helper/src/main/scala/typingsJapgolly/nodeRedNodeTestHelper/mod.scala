package typingsJapgolly.nodeRedNodeTestHelper

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Node
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.nodeRed.mod.NodeAPISettingsWithData
import typingsJapgolly.nodeRed.mod.NodeCredentials
import typingsJapgolly.nodeRed.mod.NodeDef
import typingsJapgolly.nodeRed.mod.NodeInitializer
import typingsJapgolly.nodeRedNodeTestHelper.anon.Id
import typingsJapgolly.nodeRedNodeTestHelper.anon.PartialLocalSettings
import typingsJapgolly.nodeRedNodeTestHelper.anon.TestFlowsItemNodeDef
import typingsJapgolly.nodeRedRuntime.mod.LocalSettings
import typingsJapgolly.sinon.mod.SinonSpy
import typingsJapgolly.std.Partial
import typingsJapgolly.supertest.mod.SuperTest
import typingsJapgolly.supertest.mod.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("node-red-node-test-helper", JSImport.Namespace)
  @js.native
  val ^ : NodeTestHelper & typingsJapgolly.nodeRedNodeTestHelper.anon.NodeTestHelper = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("node-red-node-test-helper", "NodeTestHelper")
  @js.native
  open class NodeTestHelperCls () extends NodeTestHelper
  
  @js.native
  trait NodeTestHelper extends EventEmitter {
    
    /**
      * Stop all flows.
      */
    def clearFlows(): js.Promise[Unit] = js.native
    
    /**
      * Returns a node instance by id in the testFlow. Any node that is defined in testFlows
      * can be retrieved, including any helper node added to the flow.
      * @param id Node id
      */
    def getNode(id: String): Node = js.native
    
    def init(nodeRedRuntime: String): Unit = js.native
    def init(nodeRedRuntime: String, userSettings: LocalSettings): Unit = js.native
    
    /**
      * Loads a flow then starts the flow.
      * @param testNode Initializer function of a node to be tested. This node will be
      * registered, and can be used in testFlows.
      * @param testFlows Flow data to test a node. If you want to use flow data exported
      * from Node-RED editor, export the flow to the clipboard and paste the content into
      * your test scripts.
      * @param testCredentials Optional node credentials.
      * @param cb Function to call back when testFlows has been started.
      */
    def load(testNode: TestNodeInitializer, testFlows: TestFlows): js.Promise[Unit] = js.native
    def load(testNode: TestNodeInitializer, testFlows: TestFlows, testCredentials: js.Object): js.Promise[Unit] = js.native
    def load(
      testNode: TestNodeInitializer,
      testFlows: TestFlows,
      testCredentials: js.Object,
      cb: js.Function0[Unit]
    ): js.Promise[Unit] = js.native
    def load(testNode: TestNodeInitializer, testFlows: TestFlows, testCredentials: Unit, cb: js.Function0[Unit]): js.Promise[Unit] = js.native
    
    /**
      * Return a spy on the logs to look for events from the node under test. For example:
      * ```
      * const logEvents = helper.log().args.filter((evt) => {
      *     return evt[0].type === "batch";
      * });
      * ```
      */
    def log(): SinonSpy[js.Array[Any], Any] = js.native
    
    /**
      * Create http (supertest) request to the editor/admin url.
      * @example
      * ```
      * helper.request().post('/inject/invalid').expect(404).end(done);
      * ```
      */
    def request(): SuperTest[Test] = js.native
    
    /**
      * Merges any userSettings with the defaults returned by `RED.settings`. Each
      * invocation of this method will overwrite the previous userSettings to prevent
      * unexpected problems in your tests.
      *
      * This will enable you to replicate your production environment within your tests,
      * for example where you're using the `functionGlobalContext` to enable extra node
      * modules within your functions.
      * @example
      * ```
      * // functions can now access os via global.get('os')
      * helper.settings({ functionGlobalContext: { os:require('os') } });
      *
      * // reset back to defaults
      * helper.settings({ });
      * ```
      * @param userSettings - an object containing the runtime settings
      * @returns custom userSettings merged with default RED.settings
      */
    def settings(userSettings: PartialLocalSettings): LocalSettings = js.native
    
    /**
      * Starts a Node-RED server for testing nodes that depend on http or web sockets endpoints
      * like the debug node. To start a Node-RED server before all test cases:
      * ```
      * before((done) => {
      *     helper.startServer(done);
      * });
      * ```
      * @param done callback
      */
    def startServer(): Unit = js.native
    def startServer(done: js.Function0[Unit]): Unit = js.native
    
    /**
      * Stop server. Generally called after unload() complete. For example, to unload a flow then
      * stop a server after each test:
      * ```
      * afterEach((done) => {
      *     helper.unload().then(() => {
      *         helper.stopServer(done);
      *     });
      * });
      * ```
      * @param done callback
      */
    def stopServer(): Unit = js.native
    def stopServer(done: js.Function0[Unit]): Unit = js.native
    
    /**
      * Returns promise to stop all flows, clean up test runtime.
      */
    def unload(): js.Promise[Unit] = js.native
    
    /**
      * Return the URL of the helper server including the ephemeral port used when starting the server.
      */
    def url(): String = js.native
  }
  
  type TestCredentials[TCred] = NodeCredentials[TCred]
  
  type TestFlows = js.Array[TestFlowsItemNodeDef]
  
  type TestFlowsItem[TNodeDef /* <: NodeDef */] = Partial[TNodeDef] & Id
  
  type TestNodeInitializer = NodeInitializer[NodeAPISettingsWithData] | js.Array[NodeInitializer[NodeAPISettingsWithData]]
  
  type _To = NodeTestHelper & typingsJapgolly.nodeRedNodeTestHelper.anon.NodeTestHelper
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: NodeTestHelper & typingsJapgolly.nodeRedNodeTestHelper.anon.NodeTestHelper = ^
}
