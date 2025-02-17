package typingsJapgolly.plottable

import org.scalajs.dom.MouseEvent
import typingsJapgolly.plottable.buildSrcComponentsComponentMod.Component
import typingsJapgolly.plottable.buildSrcCoreInterfacesMod.Point
import typingsJapgolly.plottable.buildSrcDispatchersDispatcherMod.Dispatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcDispatchersMouseDispatcherMod {
  
  @JSImport("plottable/build/src/dispatchers/mouseDispatcher", "Mouse")
  @js.native
  /**
    * This constructor not be invoked directly.
    *
    * @constructor
    */
  /* private */ open class Mouse () extends Dispatcher {
    
    /* private */ var _lastMousePosition: Any = js.native
    
    /**
      * Computes the mouse position from the given event, and if successful
      * calls all the callbacks in the provided callbackSet.
      */
    /* private */ var _measureAndDispatch: Any = js.native
    
    /* private */ var _translator: Any = js.native
    
    def eventInside(component: Component, event: MouseEvent): Boolean = js.native
    
    /**
      * Returns the last computed mouse position in <svg> coordinate space.
      *
      * @return {Point}
      */
    def lastMousePosition(): Point = js.native
    
    /**
      * Removes a callback that would be called when a dblClick occurs.
      *
      * @param {MouseCallback} callback
      * @return {Dispatchers.Mouse} The calling Mouse Dispatcher.
      */
    def offDblClick(callback: MouseCallback): this.type = js.native
    
    /**
      * Removes a callback that would be called when a mousedown occurs.
      *
      * @param {MouseCallback} callback
      * @return {Dispatchers.Mouse} The calling Mouse Dispatcher.
      */
    def offMouseDown(callback: MouseCallback): this.type = js.native
    
    /**
      * Removes a callback that would be called when the mouse position changes.
      *
      * @param {MouseCallback} callback
      * @return {Dispatchers.Mouse} The calling Mouse Dispatcher.
      */
    def offMouseMove(callback: MouseCallback): this.type = js.native
    
    /**
      * Removes a callback that would be called when a mouseup occurs.
      *
      * @param {MouseCallback} callback
      * @return {Dispatchers.Mouse} The calling Mouse Dispatcher.
      */
    def offMouseUp(callback: MouseCallback): this.type = js.native
    
    /**
      * Removes a callback that would be called when a wheel event occurs.
      *
      * @param {MouseCallback} callback
      * @return {Dispatchers.Mouse} The calling Mouse Dispatcher.
      */
    def offWheel(callback: MouseCallback): this.type = js.native
    
    /**
      * Registers a callback to be called when a dblClick occurs.
      *
      * @param {MouseCallback} callback
      * @return {Dispatchers.Mouse} The calling Mouse Dispatcher.
      */
    def onDblClick(callback: MouseCallback): this.type = js.native
    
    /**
      * Registers a callback to be called when a mousedown occurs.
      *
      * @param {MouseCallback} callback
      * @return {Dispatchers.Mouse} The calling Mouse Dispatcher.
      */
    def onMouseDown(callback: MouseCallback): this.type = js.native
    
    /**
      * Registers a callback to be called when the mouse position changes.
      *
      * @param {MouseCallback} callback
      * @return {Dispatchers.Mouse} The calling Mouse Dispatcher.
      */
    def onMouseMove(callback: MouseCallback): this.type = js.native
    
    /**
      * Registers a callback to be called when a mouseup occurs.
      *
      * @param {MouseCallback} callback
      * @return {Dispatchers.Mouse} The calling Mouse Dispatcher.
      */
    def onMouseUp(callback: MouseCallback): this.type = js.native
    
    /**
      * Registers a callback to be called when a wheel event occurs.
      *
      * @param {MouseCallback} callback
      * @return {Dispatchers.Mouse} The calling Mouse Dispatcher.
      */
    def onWheel(callback: MouseCallback): this.type = js.native
  }
  /* static members */
  object Mouse {
    
    @JSImport("plottable/build/src/dispatchers/mouseDispatcher", "Mouse")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/dispatchers/mouseDispatcher", "Mouse._DBLCLICK_EVENT_NAME")
    @js.native
    def _DBLCLICK_EVENT_NAME: Any = js.native
    inline def _DBLCLICK_EVENT_NAME_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DBLCLICK_EVENT_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/dispatchers/mouseDispatcher", "Mouse._DISPATCHER_KEY")
    @js.native
    def _DISPATCHER_KEY: Any = js.native
    inline def _DISPATCHER_KEY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DISPATCHER_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/dispatchers/mouseDispatcher", "Mouse._MOUSEDOWN_EVENT_NAME")
    @js.native
    def _MOUSEDOWN_EVENT_NAME: Any = js.native
    inline def _MOUSEDOWN_EVENT_NAME_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MOUSEDOWN_EVENT_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/dispatchers/mouseDispatcher", "Mouse._MOUSEMOVE_EVENT_NAME")
    @js.native
    def _MOUSEMOVE_EVENT_NAME: Any = js.native
    inline def _MOUSEMOVE_EVENT_NAME_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MOUSEMOVE_EVENT_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/dispatchers/mouseDispatcher", "Mouse._MOUSEOUT_EVENT_NAME")
    @js.native
    def _MOUSEOUT_EVENT_NAME: Any = js.native
    inline def _MOUSEOUT_EVENT_NAME_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MOUSEOUT_EVENT_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/dispatchers/mouseDispatcher", "Mouse._MOUSEOVER_EVENT_NAME")
    @js.native
    def _MOUSEOVER_EVENT_NAME: Any = js.native
    inline def _MOUSEOVER_EVENT_NAME_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MOUSEOVER_EVENT_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/dispatchers/mouseDispatcher", "Mouse._MOUSEUP_EVENT_NAME")
    @js.native
    def _MOUSEUP_EVENT_NAME: Any = js.native
    inline def _MOUSEUP_EVENT_NAME_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MOUSEUP_EVENT_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/dispatchers/mouseDispatcher", "Mouse._WHEEL_EVENT_NAME")
    @js.native
    def _WHEEL_EVENT_NAME: Any = js.native
    inline def _WHEEL_EVENT_NAME_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_WHEEL_EVENT_NAME")(x.asInstanceOf[js.Any])
    
    /**
      * Get a Mouse Dispatcher for the component tree.
      * If one already exists on that <svg>, it will be returned; otherwise, a new one will be created.
      *
      * @param {SVGElement} elem
      * @return {Dispatchers.Mouse}
      */
    inline def getDispatcher(component: Component): typingsJapgolly.plottable.buildSrcDispatchersMod.Mouse = ^.asInstanceOf[js.Dynamic].applyDynamic("getDispatcher")(component.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.plottable.buildSrcDispatchersMod.Mouse]
  }
  
  type MouseCallback = js.Function2[/* p */ Point, /* event */ MouseEvent, Unit]
}
