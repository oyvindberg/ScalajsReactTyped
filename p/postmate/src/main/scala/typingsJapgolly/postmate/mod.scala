package typingsJapgolly.postmate

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLIFrameElement
import typingsJapgolly.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("postmate", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Promise[ParentAPI] {
    /**
      * Initializes a new instance of Postmate
      *
      * @param options configuration options
      */
    def this(options: PostmateOptions) = this()
  }
  @JSImport("postmate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This is written in the child page. Calling Postmate.Model initiates a handshake request listener from the
    * Child. Once the handshake is complete, an event listener is bound to receive requests from the Parent. The
    * Child model is extended from the model provided by the Parent.
    */
  @JSImport("postmate", "Model")
  @js.native
  open class Model protected ()
    extends StObject
       with Promise[ChildAPI] {
    /**
      * Initializes a new instance of Model
      *
      * @param model An object of gettable properties to expose to the parent. Value types may be anything
      * accepted in postMessage. Promises may also be set as values or returned from functions. Default: {}
      */
    def this(model: Any) = this()
  }
  
  /**
    * Replace the Promise API that Postmate uses. Default: window.Promise
    */
  /* static member */
  @JSImport("postmate", "Promise")
  @js.native
  def Promise: js.Promise[Any] = js.native
  inline def Promise_=(x: js.Promise[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Promise")(x.asInstanceOf[js.Any])
  
  /**
    * Set to true to enable logging of additional information. Default: false
    */
  /* static member */
  @JSImport("postmate", "debug")
  @js.native
  def debug: Boolean = js.native
  inline def debug_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debug")(x.asInstanceOf[js.Any])
  
  /**
    * Composes an API to be used by the child
    */
  @js.native
  trait ChildAPI extends StObject {
    
    /**
      * Emits an event to the parent
      *
      * @param name the name of the event
      * @param data event data
      */
    def emit(name: String): Unit = js.native
    def emit(name: String, data: Any): Unit = js.native
  }
  
  /**
    * Composes an API to be used by the parent
    */
  @js.native
  trait ParentAPI extends StObject {
    
    /**
      * Calls a function on the child's model
      *
      * @param key The string property to lookup in the child's model
      * @param data The optional data to send to the child function
      */
    def call(key: String): Unit = js.native
    def call(key: String, data: Any): Unit = js.native
    
    /**
      * Removes the iFrame element and destroys any message event listeners
      */
    def destroy(): Unit = js.native
    
    /**
      * The iFrame Element that the parent is communicating with
      */
    var frame: HTMLIFrameElement = js.native
    
    /**
      * Retrieves a value by property name from the child's model object.
      *
      * @param key The string property to lookup in the child's model
      * @returns child model property value
      */
    def get(key: String): js.Promise[Any] = js.native
    
    /**
      * Listen to a particular event from the child
      *
      * @param eventName the name of the event
      * @param callback the event handler function
      */
    def on(eventName: String, callback: js.Function1[/* data */ js.UndefOr[Any], Unit]): Unit = js.native
  }
  
  type Postmate = js.Promise[ParentAPI]
  
  /**
    * Options passed to the Postmate constructor
    */
  trait PostmateOptions extends StObject {
    
    /**
      * An Array to add classes to the iFrame. Useful for styling
      */
    var classListArray: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * An element to append the iFrame to. Default: document.body
      */
    var container: js.UndefOr[HTMLElement | Null] = js.undefined
    
    /**
      * An object literal to represent the default values of the child's model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /**
      * A name which is used for the name attribute of the created iFrame
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * A URL to load in the iFrame. The origin of this URL will also be used for securing message transport
      */
    var url: String
  }
  object PostmateOptions {
    
    inline def apply(url: String): PostmateOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostmateOptions]
    }
    
    extension [Self <: PostmateOptions](x: Self) {
      
      inline def setClassListArray(value: js.Array[String]): Self = StObject.set(x, "classListArray", value.asInstanceOf[js.Any])
      
      inline def setClassListArrayUndefined: Self = StObject.set(x, "classListArray", js.undefined)
      
      inline def setClassListArrayVarargs(value: String*): Self = StObject.set(x, "classListArray", js.Array(value*))
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerNull: Self = StObject.set(x, "container", null)
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
