package typingsJapgolly.aureliaTemplating.mod

import typingsJapgolly.aureliaTaskQueue.mod.TaskQueue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-templating", "BehaviorPropertyObserver")
@js.native
open class BehaviorPropertyObserver protected () extends StObject {
  /**
  	* Creates an instance of BehaviorPropertyObserver.
  	* @param taskQueue The task queue used to schedule change notifications.
  	* @param obj The object that the property is defined on.
  	* @param propertyName The name of the property.
  	* @param selfSubscriber The callback function that notifies the object which defines the properties, if present.
  	* @param initialValue The initial value of the property.
  	*/
  def this(taskQueue: TaskQueue, obj: js.Object, propertyName: String, selfSubscriber: js.Function) = this()
  def this(
    taskQueue: TaskQueue,
    obj: js.Object,
    propertyName: String,
    selfSubscriber: js.Function,
    initialValue: Any
  ) = this()
  
  def addSubscriber(context: Any, callable: js.Function): Unit = js.native
  
  /**
  	* Invoked by the TaskQueue to publish changes to subscribers.
  	*/
  def call(): Unit = js.native
  
  def callSubscribers(newValue: Any, oldValue: Any): Unit = js.native
  
  /**
  	* Gets the property's value.
  	*/
  def getValue(): Any = js.native
  
  def removeSubscriber(context: Any, callable: js.Function): Unit = js.native
  
  /**
  	* Sets the property's value.
  	* @param newValue The new value to set.
  	*/
  def setValue(newValue: Any): Unit = js.native
  
  /**
  	* Subscribes to the observerable.
  	* @param context A context object to pass along to the subscriber when it's called.
  	* @param callable A function or object with a "call" method to be invoked for delivery of changes.
  	*/
  def subscribe(context: Any, callable: js.Function): Unit = js.native
  
  /**
  	* Unsubscribes from the observerable.
  	* @param context The context object originally subscribed with.
  	* @param callable The callable that was originally subscribed with.
  	*/
  def unsubscribe(context: Any, callable: js.Function): Unit = js.native
}
