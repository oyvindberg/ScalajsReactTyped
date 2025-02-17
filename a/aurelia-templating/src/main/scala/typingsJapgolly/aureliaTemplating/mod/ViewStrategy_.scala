package typingsJapgolly.aureliaTemplating.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewStrategy_ extends StObject {
  
  /**
  	* Loads a view factory.
  	* @param viewEngine The view engine to use during the load process.
  	* @param compileInstruction Additional instructions to use during compilation of the view.
  	* @param loadContext The loading context used for loading all resources and dependencies.
  	* @param target A class from which to extract metadata of additional resources to load.
  	* @return A promise for the view factory that is produced by this strategy.
  	*/
  def loadViewFactory(viewEngine: ViewEngine, compileInstruction: ViewCompileInstruction): js.Promise[ViewFactory] = js.native
  def loadViewFactory(viewEngine: ViewEngine, compileInstruction: ViewCompileInstruction, loadContext: Unit, target: Any): js.Promise[ViewFactory] = js.native
  def loadViewFactory(
    viewEngine: ViewEngine,
    compileInstruction: ViewCompileInstruction,
    loadContext: ResourceLoadContext
  ): js.Promise[ViewFactory] = js.native
  def loadViewFactory(
    viewEngine: ViewEngine,
    compileInstruction: ViewCompileInstruction,
    loadContext: ResourceLoadContext,
    target: Any
  ): js.Promise[ViewFactory] = js.native
  
  var moduleId: js.UndefOr[String] = js.native
}
