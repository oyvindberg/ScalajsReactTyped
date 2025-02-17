package typingsJapgolly.playerframework.PlayerFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AutohideBehavior extends StObject
@JSGlobal("PlayerFramework.AutohideBehavior")
@js.native
object AutohideBehavior extends StObject {
  
  /**
    * All behaviors are applied to the autohide feature.
    **/
  @js.native
  sealed trait all
    extends StObject
       with AutohideBehavior
  
  /**
    * Autohide is allowed during media playback only.
    **/
  @js.native
  sealed trait allowDuringPlaybackOnly
    extends StObject
       with AutohideBehavior
  
  /**
    * No behaviors are applied to the autohide feature.
    **/
  @js.native
  sealed trait none
    extends StObject
       with AutohideBehavior
  
  /**
    * Autohide is prevented when the pointer is over interactive components such as the control panel.
    **/
  @js.native
  sealed trait preventDuringInteractiveHover
    extends StObject
       with AutohideBehavior
}
