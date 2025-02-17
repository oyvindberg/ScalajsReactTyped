package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Behavior
import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.VideoDome")
@js.native
open class VideoDome ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.VideoDome {
  
  /**
    * Attach a behavior
    * @param behavior defines the behavior to attach
    * @returns the current host
    */
  /* CompleteClass */
  override def addBehavior(behavior: Behavior[typingsJapgolly.babylonjs.BABYLON.Node]): typingsJapgolly.babylonjs.BABYLON.Node = js.native
  
  /**
    * Gets a behavior using its name to search
    * @param name defines the name to search
    * @returns the behavior or null if not found
    */
  /* CompleteClass */
  override def getBehaviorByName(name: String): Nullable[Behavior[typingsJapgolly.babylonjs.BABYLON.Node]] = js.native
  
  /**
    * Remove a behavior from the current object
    * @param behavior defines the behavior to detach
    * @returns the current host
    */
  /* CompleteClass */
  override def removeBehavior(behavior: Behavior[typingsJapgolly.babylonjs.BABYLON.Node]): typingsJapgolly.babylonjs.BABYLON.Node = js.native
}
/* static members */
object VideoDome {
  
  /**
    * Define the video source as a Monoscopic panoramic 360 video.
    */
  @JSGlobal("BABYLON.VideoDome.MODE_MONOSCOPIC")
  @js.native
  val MODE_MONOSCOPIC: /* 0 */ Double = js.native
  
  /**
    * Define the video source as a Stereoscopic Side by Side panoramic 360 video.
    */
  @JSGlobal("BABYLON.VideoDome.MODE_SIDEBYSIDE")
  @js.native
  val MODE_SIDEBYSIDE: /* 2 */ Double = js.native
  
  /**
    * Define the video source as a Stereoscopic TopBottom/OverUnder panoramic 360 video.
    */
  @JSGlobal("BABYLON.VideoDome.MODE_TOPBOTTOM")
  @js.native
  val MODE_TOPBOTTOM: /* 1 */ Double = js.native
}
