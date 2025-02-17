package typingsJapgolly.matterJs.mod

import typingsJapgolly.matterJs.matterJsStrings.afterAdd
import typingsJapgolly.matterJs.matterJsStrings.afterRemove
import typingsJapgolly.matterJs.matterJsStrings.afterRender
import typingsJapgolly.matterJs.matterJsStrings.afterTick
import typingsJapgolly.matterJs.matterJsStrings.afterUpdate
import typingsJapgolly.matterJs.matterJsStrings.beforeAdd
import typingsJapgolly.matterJs.matterJsStrings.beforeRemove
import typingsJapgolly.matterJs.matterJsStrings.beforeRender
import typingsJapgolly.matterJs.matterJsStrings.beforeTick
import typingsJapgolly.matterJs.matterJsStrings.beforeUpdate
import typingsJapgolly.matterJs.matterJsStrings.collisionActive
import typingsJapgolly.matterJs.matterJsStrings.collisionEnd
import typingsJapgolly.matterJs.matterJsStrings.collisionStart
import typingsJapgolly.matterJs.matterJsStrings.mousedown
import typingsJapgolly.matterJs.matterJsStrings.mousemove
import typingsJapgolly.matterJs.matterJsStrings.mouseup
import typingsJapgolly.matterJs.matterJsStrings.sleepEnd
import typingsJapgolly.matterJs.matterJsStrings.sleepStart
import typingsJapgolly.matterJs.matterJsStrings.tick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter-js", "Events")
@js.native
open class Events () extends StObject
/* static members */
object Events {
  
  @JSImport("matter-js", "Events")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Removes the given event callback. If no callback, clears all callbacks in eventNames. If no eventNames, clears all events.
    *
    * @param obj
    * @param eventName
    * @param callback
    */
  inline def off(obj: Any, eventName: String, callback: js.Function1[/* e */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(obj.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on(obj: Any, name: String, callback: js.Function1[/* e */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired when a call to `Composite.add` is made, after objects have been added.
    *
    * @event afterAdd
    * @param {} event An event object
    * @param {} event.object The object(s) that have been added (may be a single body, constraint, composite or a mixed array of these)
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  inline def on_afterAdd(obj: Engine, name: afterAdd, callback: js.Function1[/* e */ IEventComposite[Composite], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired when a call to `Composite.remove` is made, after objects have been removed.
    *
    * @event afterRemove
    * @param {} event An event object
    * @param {} event.object The object(s) that have been removed (may be a single body, constraint, composite or a mixed array of these)
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  inline def on_afterRemove(obj: Engine, name: afterRemove, callback: js.Function1[/* e */ IEventComposite[Composite], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired after rendering
    *
    * @event afterRender
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  inline def on_afterRender(
    obj: Engine,
    name: afterRender,
    callback: js.Function1[/* e */ IEventTimestamped[Render | Runner], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired at the end of a tick, after engine update and after rendering
    *
    * @event afterTick
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  inline def on_afterTick(obj: Engine, name: afterTick, callback: js.Function1[/* e */ IEventTimestamped[Runner], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired after engine update and all collision events
    *
    * @event afterUpdate
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  inline def on_afterUpdate(obj: Engine, name: afterUpdate, callback: js.Function1[/* e */ IEventTimestamped[Engine], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired when a call to `Composite.add` is made, before objects have been added.
    *
    * @event beforeAdd
    * @param {} event An event object
    * @param {} event.object The object(s) to be added (may be a single body, constraint, composite or a mixed array of these)
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  inline def on_beforeAdd(obj: Engine, name: beforeAdd, callback: js.Function1[/* e */ IEventComposite[Composite], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired when a call to `Composite.remove` is made, before objects have been removed.
    *
    * @event beforeRemove
    * @param {} event An event object
    * @param {} event.object The object(s) to be removed (may be a single body, constraint, composite or a mixed array of these)
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  inline def on_beforeRemove(obj: Engine, name: beforeRemove, callback: js.Function1[/* e */ IEventComposite[Composite], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired before rendering
    *
    * @event beforeRender
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  inline def on_beforeRender(
    obj: Engine,
    name: beforeRender,
    callback: js.Function1[/* e */ IEventTimestamped[Render | Runner], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired at the start of a tick, before any updates to the engine or timing
    *
    * @event beforeTick
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  inline def on_beforeTick(obj: Engine, name: beforeTick, callback: js.Function1[/* e */ IEventTimestamped[Runner], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired just before an update
    *
    * @event beforeUpdate
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  inline def on_beforeUpdate(obj: Engine, name: beforeUpdate, callback: js.Function1[/* e */ IEventTimestamped[Engine], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired after engine update, provides a list of all pairs that are colliding in the current tick (if any)
    *
    * @event collisionActive
    * @param {} event An event object
    * @param {} event.pairs List of affected pairs
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  inline def on_collisionActive(obj: Engine, name: collisionActive, callback: js.Function1[/* e */ IEventCollision[Engine], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired after engine update, provides a list of all pairs that have ended collision in the current tick (if any)
    *
    * @event collisionEnd
    * @param {} event An event object
    * @param {} event.pairs List of affected pairs
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  inline def on_collisionEnd(obj: Engine, name: collisionEnd, callback: js.Function1[/* e */ IEventCollision[Engine], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired after engine update, provides a list of all pairs that have started to collide in the current tick (if any)
    *
    * @event collisionStart
    * @param {} event An event object
    * @param {} event.pairs List of affected pairs
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  inline def on_collisionStart(obj: Engine, name: collisionStart, callback: js.Function1[/* e */ IEventCollision[Engine], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired when the mouse is down (or a touch has started) during the last step
    * @param obj
    * @param name
    * @param callback
    */
  inline def on_mousedown(
    obj: MouseConstraint,
    name: mousedown,
    callback: js.Function1[/* e */ IMouseEvent[MouseConstraint], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired when the mouse has moved (or a touch moves) during the last step
    * @param obj
    * @param name
    * @param callback
    */
  inline def on_mousemove(
    obj: MouseConstraint,
    name: mousemove,
    callback: js.Function1[/* e */ IMouseEvent[MouseConstraint], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired when the mouse is up (or a touch has ended) during the last step
    * @param obj
    * @param name
    * @param callback
    */
  inline def on_mouseup(
    obj: MouseConstraint,
    name: mouseup,
    callback: js.Function1[/* e */ IMouseEvent[MouseConstraint], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired when a body ends sleeping (where `this` is the body).
    *
    * @event sleepEnd
    * @this {Body} The body that has ended sleeping
    * @param {} event An event object
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  inline def on_sleepEnd(obj: Body, name: sleepEnd, callback: js.Function1[/* e */ IEvent[Body], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired when a body starts sleeping (where `this` is the body).
    *
    * @event sleepStart
    * @this {Body} The body that has started sleeping
    * @param {} event An event object
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  inline def on_sleepStart(obj: Body, name: sleepStart, callback: js.Function1[/* e */ IEvent[Body], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired after engine timing updated, but just before update
    *
    * @event tick
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  inline def on_tick(obj: Engine, name: tick, callback: js.Function1[/* e */ IEventTimestamped[Runner], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fires all the callbacks subscribed to the given object's eventName, in the order they subscribed, if any.
    *
    * @param object
    * @param eventNames
    * @param event
    */
  inline def trigger(`object`: Any, eventNames: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(`object`.asInstanceOf[js.Any], eventNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trigger(`object`: Any, eventNames: String, event: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(`object`.asInstanceOf[js.Any], eventNames.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
