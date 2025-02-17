package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`5`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`6`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * these are the events which can happen to the components in frames of the desktop
  *
  * Interest listener can get information about loaded/reloaded or unloaded components into a {@link Frame} .
  * @see XFrame
  * @see XFrameActionListener
  * @see FrameActionEvent
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`5`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`6`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`7`
*/
trait FrameAction extends StObject
object FrameAction {
  
  /**
    * an event of this kind is broadcast whenever a component is attached to a frame
    *
    * This is almost the same as the instantiation of the component within that frame. The component is attached to the frame immediately before this event
    * is broadcast.
    * @see XFrame.setComponent()
    */
  inline def COMPONENT_ATTACHED: `0` = 0.asInstanceOf[`0`]
  
  /**
    * an event of this kind is broadcast whenever a component is detaching from a frame
    *
    * This is quite the same as the destruction of the component which was in that frame. At the moment when the event is broadcast the component is still
    * attached to the frame but in the next moment it won't.
    * @see XFrame.setComponent()
    */
  inline def COMPONENT_DETACHING: `1` = 1.asInstanceOf[`1`]
  
  /**
    * an event of this kind is broadcast whenever a component is attached to a new model.
    *
    * In this case the component remains the same but operates on a new model component.
    */
  inline def COMPONENT_REATTACHED: `2` = 2.asInstanceOf[`2`]
  
  /**
    * an event of this kind is broadcast whenever a component changes its internal context (i.e., the selection).
    *
    * If the activation status within a frame changes, this counts as a context change too.
    * @see XFrame.contextChanged()
    */
  inline def CONTEXT_CHANGED: `5` = 5.asInstanceOf[`5`]
  
  /**
    * an event of this kind is broadcast whenever a component gets activated
    *
    * Activations are broadcast from the top component which was not active before, down to the inner most component.
    * @see XFrame.activate()
    */
  inline def FRAME_ACTIVATED: `3` = 3.asInstanceOf[`3`]
  
  /**
    * an event of this kind is broadcasted immediately before the component is deactivated
    *
    * Deactivations are broadcast from the innermost component which does not stay active up to the outer most component which does not stay active.
    * @see XFrame.deactivate()
    */
  inline def FRAME_DEACTIVATING: `4` = 4.asInstanceOf[`4`]
  
  /**
    * an event of this kind is broadcast by an active frame when it is getting UI control (tool control).
    * @see XFrame.activate()
    */
  inline def FRAME_UI_ACTIVATED: `6` = 6.asInstanceOf[`6`]
  
  /**
    * an event of this kind is broadcast by an active frame when it is losing UI control (tool control).
    * @see XFrame.deactivate()
    */
  inline def FRAME_UI_DEACTIVATING: `7` = 7.asInstanceOf[`7`]
}
