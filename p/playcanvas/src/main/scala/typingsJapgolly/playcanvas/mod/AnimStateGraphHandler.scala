package typingsJapgolly.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./handler.js').ResourceHandler} ResourceHandler */
/**
  * Resource handler used for loading {@link AnimStateGraph} resources.
  *
  * @implements {ResourceHandler}
  * @ignore
  */
@JSImport("playcanvas", "AnimStateGraphHandler")
@js.native
open class AnimStateGraphHandler protected ()
  extends StObject
     with ResourceHandler {
  def this(app: Any) = this()
  
  /**
    * Type of the resource the handler handles.
    *
    * @type {string}
    */
  var handlerType: String = js.native
  
  def load(url: Any, callback: Any): Unit = js.native
  
  var maxRetries: Double = js.native
  
  def open(url: Any, data: Any): AnimStateGraph = js.native
  
  @JSName("patch")
  def patch_MAnimStateGraphHandler(asset: Any, assets: Any): Unit = js.native
}
