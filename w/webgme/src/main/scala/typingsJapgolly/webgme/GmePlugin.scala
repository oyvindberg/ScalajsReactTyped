package typingsJapgolly.webgme

import typingsJapgolly.std.TemplateStringsArray
import typingsJapgolly.webgme.Blobs.BlobClient
import typingsJapgolly.webgme.Core.DataObject
import typingsJapgolly.webgme.Core.Node
import typingsJapgolly.webgme.Global_.GmeLogger
import typingsJapgolly.webgme.GmeClasses.Project
import typingsJapgolly.webgme.GmeClasses.Result
import typingsJapgolly.webgme.GmeCommon.Metadata
import typingsJapgolly.webgme.GmeCommon.Promisable
import typingsJapgolly.webgme.GmeCommon.ResultCallback
import typingsJapgolly.webgme.GmeConfig.ConfigItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GmePlugin {
  
  /**
    The base plugin object from which all plugins should inherit.
    */
  @js.native
  trait PluginBase extends StObject {
    
    /**
      * The resolved META nodes based on the active namespace. Index by the fully qualified meta node names
      * with the namespace stripped off at the start.
      *
      * For example, if a project has a library A with a library B. If the project and the libraries all have
      * two meta nodes named a and b. Depending on the namespace the META will have the following keys:
      *
      * 1) namespace = '' -> ['a', 'b', 'A.a', 'A.b', 'A.B.a', 'A.B.b']
      * 2) namespace = 'A' -> ['a', 'b', 'B.a', 'B.b']
      * 3) namespace = 'A.B' -> ['a', 'b']
      *
      * (n.b. 'a' and 'b' in example 3) are pointing to the meta nodes defined in A.B.)
      */
    var META: Any = js.native
    
    var activeNode: Node = js.native
    
    var activeSelection: js.Array[Node] = js.native
    
    def addCommitToResult(status: String): Unit = js.native
    
    def baseIsMeta(node: Any): Boolean = js.native
    
    var blobClient: BlobClient = js.native
    
    def configure(config: typingsJapgolly.webgme.GmeConfig.GmeConfig): Unit = js.native
    
    var core: typingsJapgolly.webgme.GmeClasses.Core = js.native
    
    def createMessage(node: Any, message: String, serverity: String): Unit = js.native
    
    /**
      * Gets the configuration structure for the plugin.
      * The ConfigurationStructure defines the configuration for the plugin
      * and will be used to populate the GUI when invoking the plugin from webGME.
      */
    def getConfigStructure(): js.Array[ConfigItem] = js.native
    
    def getCurrentConfig(): typingsJapgolly.webgme.GmeConfig.GmeConfig = js.native
    
    def getDefaultConfig(): typingsJapgolly.webgme.GmeConfig.GmeConfig = js.native
    
    /**
      * Gets the description of the plugin.
      */
    def getDescription(): String = js.native
    
    def getMetaType(node: Any): Any = js.native
    
    def getMetadata(): Any = js.native
    
    /**
      * Gets the name of the plugin.
      */
    def getName(): String = js.native
    
    /**
      * Gets the semantic version (semver.org) of the plugin.
      */
    def getVersion(): String = js.native
    
    var gmeConfig: typingsJapgolly.webgme.GmeConfig.GmeConfig = js.native
    
    def initialize(logger: GmeLogger, blobClient: BlobClient, gmeConfig: typingsJapgolly.webgme.GmeConfig.GmeConfig): Unit = js.native
    
    var isConfigured: Boolean = js.native
    
    def isInvalidActiveNode(pluginId: Any): Any = js.native
    
    def isMetaTypeOf(node: Any, metaNode: Any): Boolean = js.native
    
    var logger: GmeLogger = js.native
    
    /**
      Main function for the plugin to execute.
      Notes:
      - Always log with the provided logger.[error,warning,info,debug].
      - Do NOT put any user interaction logic UI, etc. inside this method.
      - handler always has to be called even if error happened.
      
      When this runs the core api is used to extract the essential
      meta-model and the model-instance, these are then written to the mega-model.
      The mega-model contains all of the models used to describe the target system.
      
      https://github.com/ptaoussanis/sente
      and https://github.com/cognitect/transit-format
      will be used to connect to the
      graph database (immortals) where the mega-model is stored.
      
      @param {function(string, plugin.PluginResult)} handler - the result handler
      */
    def main(callback: ResultCallback[Result]): Unit = js.native
    
    /**
      * The namespace the META nodes are coming from (set by invoker).
      * The default is the full meta, i.e. the empty string namespace.
      * For example, if a project has a library A with a library B. The possible namespaces are:
      * '', 'A' and 'A.B'.
      */
    var namespace: String = js.native
    
    var notificationHandlers: js.Array[Any] = js.native
    
    var pluginMetadata: Metadata = js.native
    
    var project: Project = js.native
    
    var result: Result = js.native
    
    var rootNode: Node = js.native
    
    def save(): Promisable = js.native
    def save(message: String): Promisable = js.native
    
    // returns a promise?
    def sendNotification(message: String): js.Promise[DataObject] = js.native
    // returns a promise?
    def sendNotification(message: String, callback: ResultCallback[DataObject]): Unit = js.native
    
    def setCurrentConfig(newConfig: typingsJapgolly.webgme.GmeConfig.GmeConfig): Unit = js.native
    
    def updateMeta(generatedMeta: Any): Unit = js.native
    
    def updateSuccess(value: Boolean, message: TemplateStringsArray): Unit = js.native
  }
}
