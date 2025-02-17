package typingsJapgolly.paper.global.paper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * The Event object is the base class for any of the other event types,
  * such as {@link MouseEvent}, {@link ToolEvent} and {@link KeyEvent}.
  */
@JSGlobal("paper.Event")
@js.native
open class Event ()
  extends StObject
     with typingsJapgolly.paper.paper.Event {
  
  /** 
    * The current state of the keyboard modifiers.
    * 
    * @see Key.modifiers
    */
  /* CompleteClass */
  override val modifiers: Any = js.native
  
  /** 
    * Cancels the event if it is cancelable, without stopping further
    * propagation of the event.
    */
  /* CompleteClass */
  override def preventDefault(): Unit = js.native
  
  /** 
    * Cancels the event if it is cancelable, and stops stopping further
    * propagation of the event. This is has the same effect as calling both
    * {@link #stopPropagation} and {@link #preventDefault}.
    * 
    * Any handler can also return `false` to indicate that `stop()` should be
    * called right after.
    */
  /* CompleteClass */
  override def stop(): Unit = js.native
  
  /** 
    * Prevents further propagation of the current event.
    */
  /* CompleteClass */
  override def stopPropagation(): Unit = js.native
  
  /** 
    * The time at which the event was created, in milliseconds since the epoch.
    */
  /* CompleteClass */
  override val timeStamp: Double = js.native
}
