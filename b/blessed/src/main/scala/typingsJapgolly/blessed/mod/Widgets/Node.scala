package typingsJapgolly.blessed.mod.Widgets

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("blessed", "Widgets.Node")
@js.native
open class Node protected ()
  extends EventEmitter
     with IHasOptions[INodeOptions]
     with IDestroyable {
  def this(options: INodeOptions) = this()
  
  /**
    * An object for any miscellanous user data.
    */
  @JSName("$")
  var $: StringDictionary[Any] = js.native
  
  /**
    * An object for any miscellanous user data.
    */
  @JSName("_")
  var _underscore: StringDictionary[Any] = js.native
  
  /**
    * Append a node to this node's children.
    */
  def append(node: Node): Unit = js.native
  
  /**
    * Array of node's children.
    */
  var children: js.Array[Node] = js.native
  
  def collectAncestors(s: Any): Unit = js.native
  
  def collectDescendants(s: Any): Unit = js.native
  
  /**
    * An object for any miscellanous user data.
    */
  var data: StringDictionary[Any] = js.native
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /**
    * Remove node from its parent.
    */
  def detach(): Unit = js.native
  
  def emitAncestors(): Unit = js.native
  
  /**
    * Emit event for element, and recursively emit same event for all descendants.
    */
  def emitDescendants(`type`: String, args: Any*): Unit = js.native
  def emitDescendants(`type`: Unit, args: Any*): Unit = js.native
  
  var focusable: Boolean = js.native
  
  def forAncestors(iter: js.Function1[/* node */ this.type, Unit], s: Any): Unit = js.native
  
  def forDescendants(iter: js.Function1[/* node */ this.type, Unit], s: Any): Unit = js.native
  
  def free(): Unit = js.native
  
  /**
    * Get user property with a potential default value.
    */
  def get[T](name: String, `def`: T): T = js.native
  
  def hasAncestor(target: Node): Boolean = js.native
  
  def hasDescendant(target: Node): Unit = js.native
  
  /**
    * Render index (document order index) of the last render call.
    */
  var index: Double = js.native
  
  /**
    * Insert a node to this node's children at index i.
    */
  def insert(node: Node, index: Double): Unit = js.native
  
  /**
    * Insert a node from node after the reference node.
    */
  def insertAfter(node: Node, refNode: Node): Unit = js.native
  
  /**
    * Insert a node to this node's children before the reference node.
    */
  def insertBefore(node: Node, refNode: Node): Unit = js.native
  
  def on(event: NodeEventType, callback: js.Function1[/* arg */ this.type, Unit]): this.type = js.native
  
  /* CompleteClass */
  var options: INodeOptions = js.native
  
  /**
    * Parent node.
    */
  var parent: Node = js.native
  
  /**
    * Prepend a node to this node's children.
    */
  def prepend(node: Node): Unit = js.native
  
  /**
    * Remove child node from node.
    */
  def remove(node: Node): Unit = js.native
  
  /**
    * Parent screen.
    */
  var screen: Screen = js.native
  
  /**
    * Set user property to value.
    */
  def set(name: String, value: Any): Unit = js.native
  
  /**
    * Type of the node (e.g. box).
    */
  var `type`: String = js.native
}
