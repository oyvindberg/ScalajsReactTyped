package typingsJapgolly.hexo.mod

import typingsJapgolly.hexo.anon.Args
import typingsJapgolly.hexo.anon.Console
import typingsJapgolly.hexo.anon.Content
import typingsJapgolly.hexo.hexoStrings.`new`
import typingsJapgolly.hexo.hexoStrings.create
import typingsJapgolly.hexo.hexoStrings.delete
import typingsJapgolly.hexo.hexoStrings.deployAfter
import typingsJapgolly.hexo.hexoStrings.deployBefore
import typingsJapgolly.hexo.hexoStrings.exit
import typingsJapgolly.hexo.hexoStrings.generateAfter
import typingsJapgolly.hexo.hexoStrings.generateBefore
import typingsJapgolly.hexo.hexoStrings.processAfter
import typingsJapgolly.hexo.hexoStrings.processBefore
import typingsJapgolly.hexo.hexoStrings.ready
import typingsJapgolly.hexo.hexoStrings.skip
import typingsJapgolly.hexo.hexoStrings.update
import typingsJapgolly.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hexo extends EventEmitter {
  
  val base_dir: String = js.native
  
  /**
    * Any console command can be called explicitly using the call method on the Hexo instance.
    */
  def call(name: String): js.Promise[Any] = js.native
  def call(name: String, args: Any): js.Promise[Any] = js.native
  def call(name: String, args: Any, fn: js.Function2[/* err */ Any, /* value */ Any, Unit]): js.Promise[Any] = js.native
  def call(name: String, args: Unit, fn: js.Function2[/* err */ Any, /* value */ Any, Unit]): js.Promise[Any] = js.native
  def call(name: String, fn: js.Function2[/* err */ Any, /* value */ Any, Unit]): js.Promise[Any] = js.native
  
  /**
    * Site settings in `_config.yml`
    */
  val config: HexoConfig = js.native
  
  val config_path: String = js.native
  
  val env: Args = js.native
  
  /**
    * You should call the `exit` method upon successful or unsuccessful completion of a console command.
    * This allows Hexo to exit gracefully and finish up important things such as saving the database.
    */
  def exit(): js.Promise[Unit] = js.native
  def exit(err: Any): js.Promise[Unit] = js.native
  
  val extend: Console = js.native
  
  /**
    * Load configuration and plugins.
    */
  def init(): js.Promise[Unit] = js.native
  
  /**
    * Loading all files in the `source` folder as well as the theme data.
    */
  def load(): js.Promise[Any] = js.native
  def load(fn: js.Function2[/* err */ Any, /* value */ Any, Unit]): js.Promise[Any] = js.native
  
  /**
    * Local variables are used for template rendering, which is the `site` variable in templates.
    * https://hexo.io/api/locals
    */
  val locals: Locals = js.native
  
  /**
    * Logger object
    * https://www.npmjs.com/package/bunyan
    */
  val log: typingsJapgolly.bunyan.mod.^ = js.native
  
  /**
    * Emitted after processing finishes. This event returns a path representing the root directory of the box.
    */
  def on(
    ev: processAfter,
    fn: js.Function2[/* type */ create | update | skip | delete, /* path */ String, Unit]
  ): this.type = js.native
  /**
    * Emitted before processing begins. This event returns a path representing the root directory of the box.
    */
  def on(
    ev: processBefore,
    fn: js.Function2[/* type */ create | update | skip | delete, /* path */ String, Unit]
  ): this.type = js.native
  /**
    * Emitted after deployment finishes.
    */
  @JSName("on")
  def on_deployAfter(ev: deployAfter, fn: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted before deployment begins.
    */
  @JSName("on")
  def on_deployBefore(ev: deployBefore, fn: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted before Hexo exits.
    */
  @JSName("on")
  def on_exit(ev: exit, fn: js.Function1[/* err */ Any, Unit]): this.type = js.native
  /**
    * Emitted after generation finishes.
    */
  @JSName("on")
  def on_generateAfter(ev: generateAfter, fn: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted before generation begins.
    */
  @JSName("on")
  def on_generateBefore(ev: generateBefore, fn: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted after a new post has been created. This event returns the post data:
    */
  @JSName("on")
  def on_new(ev: `new`, fn: js.Function1[/* post */ Content, Unit]): this.type = js.native
  /**
    * Emitted after initialization finishes.
    */
  @JSName("on")
  def on_ready(ev: ready, fn: js.Function0[Unit]): this.type = js.native
  
  val plugin_dir: String = js.native
  
  val post: Post = js.native
  
  /**
    * Public folder. Where the static site will be generated
    */
  val public_dir: String = js.native
  
  val render: Render = js.native
  
  val route: Router = js.native
  
  val scaffold: Scaffold = js.native
  
  val scaffold_dir: String = js.native
  
  val script_dir: String = js.native
  
  val source: Box = js.native
  
  /**
    * Source folder. Where your content is stored
    */
  val source_dir: String = js.native
  
  val theme: Theme = js.native
  
  val theme_dir: String = js.native
  
  val theme_script_dir: String = js.native
  
  def unwatch(): Unit = js.native
  
  /**
    * The same things `load` does, but will also start watching for file changes continuously.
    */
  def watch(): js.Promise[Any] = js.native
  def watch(fn: js.Function2[/* err */ Any, /* value */ Any, Unit]): js.Promise[Any] = js.native
}
